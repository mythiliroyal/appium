package com.yesgenie.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;
import com.xassure.framework.driver.Controls;
import com.xassure.reporting.logger.LogStatus;
import com.xassure.reporting.logger.Reporting;
import com.yesgenie.pageobjects.enums.Application;
import io.appium.java_client.AppiumDriver;
import lombok.SneakyThrows;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;

public class UtilityMethods {


    TreeMap<String, String> testDataConfiguration = new TreeMap<>();

    /**
     * This function validates boolean result for 2 Set of Strings and logs in report
     *
     * @param flag    - boolean value of object comparison
     * @param message - customized message to log in reports
     * @param element - variable Set of String objects
     **/

    public final void validateResult(boolean flag, String message, Object... element) {
        if (flag) {
            Reporting.getLogger().log(LogStatus.PASS,
                    "ASSERTION PASSED: " + message + " passed");
        } else {
            Reporting.getLogger().log(LogStatus.FAIL,
                    "ASSERTION FAILED: " + element[0] + " does not match\n" + element[1]);
        }
    }

    /**
     * This function writes to text file
     *
     * @param content - to be written to file
     **/

    public void writeToTxtFile(String content) throws IOException {
        File file = new File("./taskName.txt");
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write(content);
        fileWriter.flush();
        fileWriter.close();
    }

    public String readFromTxtFile() throws IOException {
        BufferedReader fileReader = new BufferedReader(new FileReader("./taskName.txt"));
        return fileReader.readLine();
    }


    @SneakyThrows
    public TreeMap<String, String> readXlsPageObjects(String sqlQuery) {

        testDataConfiguration = new TreeMap<>();
        Fillo fillo = new Fillo();
        Connection connection = null;
        Recordset recordset = null;

        try {
            connection =
                    fillo.getConnection(Application.GENIEPAGEOBJECTS.property);

            String strQuery = sqlQuery;

            connection.executeUpdate(strQuery);
            recordset = connection.executeQuery(strQuery);
            List<String> fieldNames = recordset.getFieldNames();

            while (recordset.next()) {
                for (String fieldName : fieldNames) {
                    String fieldValue = recordset.getField(fieldName);
                    if (!fieldValue.isEmpty() && !(fieldName.equalsIgnoreCase("serial"))
                            && !(fieldName.equalsIgnoreCase("Test_Case_Name"))) {
                        testDataConfiguration.put(fieldName, fieldValue);
                    }
                }
            }
            recordset.close();
            connection.close();
            return testDataConfiguration;
        } catch (FilloException e) {
            throw new RuntimeException("Please check the filepath and method are correct for "
                    + e.getMessage());
        }
    }

    public Set<String> getTextOfCommonXpath(Controls controls, String elementName, String xpath) {

        boolean booFlag = false;
        Set<String> elementText = new TreeSet<>();
        Iterator<WebElement> var6 = null;

        try {
            if (xpath.startsWith("xpath~")) {
                List<WebElement> elements = controls.getDriver().findElements(By.xpath(xpath.split("~")[1]));
                var6 = elements.iterator();
            } else if (xpath.startsWith("accessibilityId~")) {
                List<WebElement> elements = ((AppiumDriver<WebElement>) controls.getDriver())
                        .findElementsByAccessibilityId(xpath.split("~")[1]);
                var6 = elements.iterator();
            }

            while (var6.hasNext()) {
                WebElement element = (WebElement) var6.next();
                elementText.add(element.getText());
                booFlag = true;
            }

            if (!booFlag) {
                Reporting.getLogger().log(LogStatus.FAIL,
                        "Failed to get text from common xpath for " + elementName);
            } else if (booFlag) {
                Reporting.getLogger().log(LogStatus.PASS,
                        "Successfully fetched common xpath for " + elementName);
            }
        } catch (Exception var12) {
            if (var12.getMessage() != null && var12.getMessage().equalsIgnoreCase("TEST FAILED")) {
                throw new RuntimeException(var12);
            }

            Reporting.getLogger().log(LogStatus.FAIL,
                    "Exception occured while finding the text from common xpath for " + elementName, var12);
        }
        return elementText;
    }

    public Set<String> createSortedSetFromArray(String[] list, String... enums) {
        boolean booFlag = false;
        Set<String> values = new TreeSet<>();

        try {
            if (enums.length != 0) {
                for (int e = 0; e < enums.length; e++) {
                    for (int k = 0; k < list.length; k++) {
                        if (enums[e].equalsIgnoreCase(list[k])) {
                            values.add(enums[e]);
                            booFlag = true;
                            break;
                        }
                    }
                }
            }else {
                Reporting.getLogger().log(LogStatus.INFO,
                        "All "+ Arrays.asList(list) +" key values from excel added for validation");
                return new TreeSet<>(Arrays.asList(list));
            }
            if (!booFlag) {
                Reporting.getLogger().log(LogStatus.FAIL,
                        "Failed to get create sorted set from excel sheet values");
            } else if (booFlag) {
                Reporting.getLogger().log(LogStatus.PASS,
                        "Successfully created sorted set from excel sheet values");
            }
        } catch (Exception var12) {
            if (var12.getMessage() != null && var12.getMessage().equalsIgnoreCase("TEST FAILED")) {
                throw new RuntimeException(var12);
            }

            Reporting.getLogger().log(LogStatus.FAIL,
                    "Exception occured while creating sorted set from excel sheet values ", var12);
        }
        return values;
    }

    public LinkedList<String> getKeysFromXlsObjects(Set<String> keyset, String... enums) {
        LinkedList<String> values = new LinkedList<String>();
        for (int e = 0; e < enums.length; e++) {
            for (Iterator<String> itr = keyset.iterator(); itr.hasNext(); ) {
                if (enums[e].equalsIgnoreCase(itr.next())) {
                    values.add(enums[e]);
                    break;
                }
            }
        }
        return values;
    }

    public boolean verifyAscendingSorting(Set<String> list) {
        ArrayList<String> arrayList = new ArrayList<>(list);
        if (arrayList.size() == 0 || arrayList.size() == 1) {
            return true;
        }
        for (int i = 1; i < list.size(); i++) {
            if (arrayList.get(i - 1).compareTo(arrayList.get(i)) == 1
                    || arrayList.get(i - 1).compareTo(arrayList.get(i)) == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean verifyDescendingSorting(Set<String> list) {
        ArrayList<String> arrayList = new ArrayList<>(list);
        if (arrayList.size() == 0 || arrayList.size() == 1) {
            return true;
        }
        for (int i = 1; i < list.size(); i++) {
            if (arrayList.get(i - 1).compareTo(arrayList.get(i)) == -1
                    || arrayList.get(i - 1).compareTo(arrayList.get(i)) == 0) {
                return false;
            }
        }
        return true;
    }

    public void enterText(AppiumDriver<WebElement> driver, String elementName, String xpath, String textToEnter) {
        boolean boolFlag = false;
        List<WebElement> elements;
        Iterator<WebElement> var6;

        try {
            if (xpath.startsWith("xpath~")) {
                elements = driver.findElementsByXPath(xpath.split("~")[1]);
                var6 = elements.iterator();
            } else if (xpath.startsWith("r~")) {
                elements = driver.findElementsById(xpath);
                var6 = elements.iterator();
            } else {
                elements = driver.findElementsByAccessibilityId(xpath);
                var6 = elements.iterator();
            }
            while (var6.hasNext()) {
                WebElement element = var6.next();
                element.clear();
                element.sendKeys(new CharSequence[]{textToEnter});
                boolFlag = true;
            }

            if (!boolFlag) {
                Reporting.getLogger().log(LogStatus.FAIL,
                        "Text '" + textToEnter + "' not entered successfuly into '" + elementName);
            } else {
                Reporting.getLogger().log(LogStatus.PASS,
                        "Text '" + textToEnter + "' entered successfuly into '" + elementName);
            }
        } catch (TimeoutException var8) {
            Reporting.getLogger().log(LogStatus.FAIL,
                    "Timeout Exception occured while entering text : '" + textToEnter + "' into '" + elementName, var8);
        } catch (Exception var9) {
            Reporting.getLogger().log(LogStatus.FAIL,
                    "Exception occured while entering text : '" + textToEnter + "' into '" + elementName, var9);
        }
    }
}