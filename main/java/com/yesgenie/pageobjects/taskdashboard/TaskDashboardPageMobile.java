package com.yesgenie.pageobjects.taskdashboard;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import com.google.inject.Inject;
import com.xassure.framework.annotations.Mobile;
import com.xassure.framework.driver.Controls;
import com.yesgenie.pageobjects.IPage;
import com.yesgenie.pageobjects.enums.TaskDashboardEnum;
import com.yesgenie.util.UtilityMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.GsmCallActions;

public class TaskDashboardPageMobile extends TaskDashboardPage implements IPage {

    @Inject
    ElementsMobileTaskDashboard elementsMobileTaskDashboard;

    @Inject
    UtilityMethods util;

    Controls controls;

    AppiumDriver<WebElement> driver;

    @Inject
    public TaskDashboardPageMobile(@Mobile Controls controls) {
        super(controls);
        this.controls = controls;
    }

    @Inject
    public void init() {
        super.elementsTaskDashboard = this.elementsMobileTaskDashboard;
    }

    Set<String> list = new TreeSet<String>();


    public void scrollDownDashboard() {
        Dimension size = controls.getDriver().manage().window().getSize();
        controls.scroll((int) (size.getWidth() * 0.5), (int) (size.getHeight() * 0.9), // Pixel 4XL API 30 emulator (Android R(11))
                (int) (size.getWidth() * 0.5), (int) (size.getHeight() * 0.4));
    }

    public void scrollUpDashboard() {
        Dimension size = controls.getDriver().manage().window().getSize();
        controls.scroll((int) (size.getWidth() * 0.5), (int) (size.getHeight() * 0.3),
                (int) (size.getWidth() * 0.5), (int) (size.getHeight() * 0.8));
    }

    public void scrollRightMyTeamColumns() {
        Dimension size = controls.getDriver().manage().window().getSize();
        controls.scroll((int) (size.getWidth() * 0.8), (int) (size.getHeight() * 0.6),
                (int) (size.getWidth() * 0.3), (int) (size.getHeight() * 0.6));
    }

    public void scrollLeftMyTeamColumns() {
        Dimension size = controls.getDriver().manage().window().getSize();
        controls.scroll((int) (size.getWidth() * 0.5), (int) (size.getHeight() * 0.6),
                (int) (size.getWidth() * 0.9), (int) (size.getHeight() * 0.6));
    }

    public List getGraphElements() {
        return controls.getWebElementsList("graphElements",
                elementsMobileTaskDashboard.graphElements);
    }

    public void clickFirstGraph() {
        controls.waitUntilElementIsVisible("graphElements",
                elementsMobileTaskDashboard.graphElements);
        ((MobileElement) getGraphElements().get(1)).click();
    }

    public Set<String> validateGraphElements() {
        List elements = getGraphElements();

        String text0;
        String text1;
        int halfValue = elements.size() / 2;
        for (int j = 1; j <= halfValue; j++) {
            text0 = ((WebElement) elements.get(j + halfValue)).getText().split("\\(")[0];
            text1 = ((WebElement) elements.get(j + halfValue)).getText().split("\\(")[1];
            list.add(text0);

            if (((WebElement) elements.get(j)).getText().concat(")")
                    .equalsIgnoreCase(text1)) {
                list.add("true");
            } else {
                list.add("false");
            }
        }
        return list;
    }


    public Set<String> validateMobileAssignedToMePage() {
        list = new TreeSet<>();
        list.addAll(controls.getTextFromWebElementList("taskByStatusLabel",
                elementsMobileTaskDashboard.taskByStatusLabel));
        list.addAll(controls.getTextFromWebElementList("taskTotalLabel",
                elementsMobileTaskDashboard.taskTotalLabel));
        list.addAll(controls.getTextFromWebElementList("taskVerticalLabel",
                elementsMobileTaskDashboard.taskVerticalLabel));
//        list.addAll(controls.getTextFromWebElementList("xaxisElementsLabel",
//                elementsMobileTaskDashboard.xaxisElementsLabel));
        list.addAll(controls.getTextFromWebElementList("xaxisFooterMessage",
                elementsMobileTaskDashboard.xaxisFooterMessage));
        list.addAll(controls.getTextFromWebElementList("keyInsightsLabel",
                elementsMobileTaskDashboard.keyInsightsLabel));
        list.addAll(controls.getTextFromWebElementList("insightsFirstRowData",
                elementsMobileTaskDashboard.insightsFirstRowLabel));
        list.addAll(controls.getTextFromWebElementList("insightsSecondRowData",
                elementsMobileTaskDashboard.insightsSecondRowLabel));

        scrollDownDashboard();
        list.addAll(controls.getTextFromWebElementList("tasksCalendarLabel",
                elementsMobileTaskDashboard.tasksCalendarLabel));
        controls.waitUntilElementIsVisible("calenderValuesLabel",
                elementsMobileTaskDashboard.calenderValuesLabel);
        controls.waitUntilElementIsVisible("taskFirstRecordLabel",
                elementsMobileTaskDashboard.taskFirstRecordLabel);
        if (controls.waitUntilElementIsVisible("createTaskIcon",
                elementsMobileTaskDashboard.createTaskIcon)) {
            list.add("Create New");
        }
        scrollUpDashboard();
        list.addAll(validateGraphElements());

        return list;
    }

    public Set<String> validateAssignedToMeColumns() {
        clickFirstGraph();
        return super.validateAssignedToMeColumns();
    }


    public Set<String> validateMobileCreatedByMePage() throws InterruptedException {
        list = new TreeSet<>();
        clickTaskDashboardImg();
        Thread.sleep(3000);
        clickTaskDashboardImg();

        selectCreatedByMeFilter();
        list.addAll(controls.getTextFromWebElementList("taskByStatusLabel",
                elementsMobileTaskDashboard.taskByStatusLabel));
        list.addAll(controls.getTextFromWebElementList("taskTotalLabel",
                elementsMobileTaskDashboard.taskTotalLabel));
        list.addAll(controls.getTextFromWebElementList("taskVerticalLabel",
                elementsMobileTaskDashboard.taskVerticalLabel));
//        list.addAll(controls.getTextFromWebElementList("xaxisElementsLabel",
//                elementsMobileTaskDashboard.xaxisElementsLabel));
        list.addAll(controls.getTextFromWebElementList("xaxisFooterMessage",
                elementsMobileTaskDashboard.xaxisFooterMessage));
        list.addAll(controls.getTextFromWebElementList("keyInsightsLabel",
                elementsMobileTaskDashboard.keyInsightsLabel));
        list.addAll(controls.getTextFromWebElementList("insightsFirstRowData",
                elementsMobileTaskDashboard.insightsFirstRowLabel));
        list.addAll(controls.getTextFromWebElementList("insightsSecondRowData",
                elementsMobileTaskDashboard.insightsSecondRowLabel));

        scrollDownDashboard();
        list.addAll(controls.getTextFromWebElementList("tasksCalendarLabel",
                elementsMobileTaskDashboard.tasksCalendarLabel));
        controls.waitUntilElementIsVisible("calenderValuesLabel",
                elementsMobileTaskDashboard.calenderValuesLabel);
        controls.waitUntilElementIsVisible("taskFirstRecordLabel",
                elementsMobileTaskDashboard.taskFirstRecordLabel);
        if (controls.waitUntilElementIsVisible("createTaskIcon",
                elementsMobileTaskDashboard.createTaskIcon)) {
            list.add("Create New");
        }
        scrollUpDashboard();
        list.addAll(validateGraphElements());

        return list;
    }

    public Set<String> validateCreatedByMeColumns() {
        clickTaskDashboardImg();
        selectCreatedByMeFilter();
        clickFirstGraph();
        return super.validateCreatedByMeColumns();
    }

    public Set<String> validateCreatedByMyTeamColumns() throws InterruptedException {
        list = new TreeSet<>();
        list.addAll(super.validateCreatedByMyTeamColumns());

        list.addAll(controls.getTextFromWebElementList("taskTotalLabel",
                elementsMobileTaskDashboard.taskTotalLabel));
        list.addAll(controls.getTextFromWebElementList("taskVerticalLabel",
                elementsMobileTaskDashboard.taskVerticalLabel));
//        list.addAll(controls.getTextFromWebElementList("xaxisElementsLabel",
//                elementsMobileTaskDashboard.xaxisElementsLabel));
        list.addAll(controls.getTextFromWebElementList("xaxisFooterMessage",
                elementsMobileTaskDashboard.xaxisFooterMessage));

        scrollDownDashboard();
        list.addAll(controls.getTextFromWebElementList("keyInsightsLabel",
                elementsMobileTaskDashboard.keyInsightsLabel));
        list.addAll(controls.getTextFromWebElementList("insightsFirstRowData",
                elementsMobileTaskDashboard.insightsFirstRowLabel));
        list.addAll(controls.getTextFromWebElementList("insightsSecondRowData",
                elementsMobileTaskDashboard.insightsSecondRowLabel));

        list.addAll(controls.getTextFromWebElementList("tasksCalendarLabel",
                elementsMobileTaskDashboard.tasksCalendarLabel));
        controls.waitUntilElementIsVisible("calenderValuesLabel",
                elementsMobileTaskDashboard.calenderValuesLabel);
        controls.waitUntilElementIsVisible("taskFirstRecordLabel",
                elementsMobileTaskDashboard.taskFirstRecordLabel);
        if (controls.waitUntilElementIsVisible("createTaskIcon",
                elementsMobileTaskDashboard.createTaskIcon)) {
            list.add("Create New");
        }
        scrollUpDashboard();
        list.addAll(validateGraphElements());

        return list;
    }

    public Set<String> validateAssignedToMyTeamColumns() throws InterruptedException {
        list = new TreeSet<>();
        list.addAll(super.validateAssignedToMyTeamColumns());
        list.addAll(controls.getTextFromWebElementList("taskTotalLabel",
                elementsMobileTaskDashboard.taskTotalLabel));
        list.addAll(controls.getTextFromWebElementList("taskVerticalLabel",
                elementsMobileTaskDashboard.taskVerticalLabel));
//        list.addAll(controls.getTextFromWebElementList("xaxisElementsLabel",
//                elementsMobileTaskDashboard.xaxisElementsLabel));

        list.addAll(controls.getTextFromWebElementList("xaxisFooterMessage",
                elementsMobileTaskDashboard.xaxisFooterMessage));

        scrollDownDashboard();
        list.addAll(controls.getTextFromWebElementList("keyInsightsLabel",
                elementsMobileTaskDashboard.keyInsightsLabel));
        list.addAll(controls.getTextFromWebElementList("insightsFirstRowData",
                elementsMobileTaskDashboard.insightsFirstRowLabel));
        list.addAll(controls.getTextFromWebElementList("insightsSecondRowData",
                elementsMobileTaskDashboard.insightsSecondRowLabel));

        list.addAll(controls.getTextFromWebElementList("tasksCalendarLabel",
                elementsMobileTaskDashboard.tasksCalendarLabel));
        controls.waitUntilElementIsVisible("calenderValuesLabel",
                elementsMobileTaskDashboard.calenderValuesLabel);
//        controls.waitUntilElementIsVisible("taskFirstRecordLabel",
//                elementsMobileTaskDashboard.taskFirstRecordLabel);
        if (controls.waitUntilElementIsVisible("createTaskIcon",
                elementsMobileTaskDashboard.createTaskIcon)) {
            list.add("Create New");
        }
        scrollUpDashboard();
        list.addAll(validateGraphElements());

        return list;
    }

    public Set<String> validateColumnCount() {

        Set<String> validatedList = new TreeSet<>();
        List<WebElement> resultslist;
        int resultsSum = 0;
        int value = 0;

        scrollRightMyTeamColumns();
        List<WebElement> headerList = controls.getDriver().findElements(
                By.xpath(elementsTaskDashboard.headersCount.split("~")[1]));

        int resultRowsElements = controls.getDriver().findElements(
                By.xpath(elementsMobileTaskDashboard.resultsRowsElements.split("~")[1])).size();
        int noOfRows = resultRowsElements / 9;

        for (int j = 0; j < headerList.size(); j++) {

            for (int i = 0; i < noOfRows; i++) {
                if (i == 0) {
                    value = j + 1;
                } else {
                    value = (j + 1) + 9;
                }
                resultslist = controls.getDriver().findElements(By.xpath(elementsTaskDashboard.resultsCount
                        .split("~")[1]
                        .replace("android.widget.TextView[1]", "android.widget.TextView[" + value + "]")));
                if (!(resultslist.get(0).getText().equals("0"))) {
                    resultsSum += Integer.parseInt(resultslist.get(0).getText().trim());
                }
            }
            if (resultsSum == Integer.parseInt(headerList.get(j).getText())) {
                validatedList.add("true");
                resultsSum = 0;
            } else {
                validatedList.add("false");
                break;
            }
        }
        return validatedList;
    }

    public void validateSearchElements() throws InterruptedException {
        clickTaskDashboardImg();
        Thread.sleep(3000);
        clickTaskDashboardImg();
        clickFirstGraph();
        controls.waitUntilElementIsVisible("searchInput", elementsTaskDashboard.searchInput);
        controls.waitUntilElementIsVisible("searchIcon", elementsTaskDashboard.searchIcon);
        controls.enterText("searchInput", elementsTaskDashboard.searchInput, "TG071220761927");
        controls.waitUntilElementIsVisible("searchDeleteIcon", elementsTaskDashboard.searchDeleteIcon);
        controls.click("searchDeleteIcon", elementsTaskDashboard.searchDeleteIcon);
    }

    public Set<String> validateSearchFunctionality(TreeMap<String, String> treeMap) throws InterruptedException {
        validateSearchElements();
        list = new TreeSet<>();

        //search by taskid
        controls.enterText("searchInput", elementsTaskDashboard.searchInput,
                treeMap.get(TaskDashboardEnum.TASK_ID2.property));
        controls.click("searchIcon", elementsTaskDashboard.searchIcon);
        controls.waitUntilElementIsVisible("firstExpandListIcon", elementsTaskDashboard.firstRowClick);
        controls.click("firstExpandListIcon", elementsTaskDashboard.firstRowClick);
        list.add(controls.getText("firstTaskIdResult", elementsTaskDashboard.taskIDresult));

        //search by task description
        controls.enterText("searchInput", elementsTaskDashboard.searchInput,
                treeMap.get(TaskDashboardEnum.TASK_DESCRIPTION2.property));
        controls.click("searchIcon", elementsTaskDashboard.searchIcon);
        controls.waitUntilElementIsVisible("firstExpandListIcon", elementsTaskDashboard.firstRowClick);
        controls.click("firstExpandListIcon", elementsTaskDashboard.firstRowClick);
        list.add(controls.getText("firstTaskDescResult", elementsMobileTaskDashboard.firstTaskDescResult));

        //search by task
        controls.enterText("searchInput", elementsTaskDashboard.searchInput,
                treeMap.get(TaskDashboardEnum.TASKS2.property));
        controls.click("searchIcon", elementsTaskDashboard.searchIcon);
        list.add(controls.getText("firstTasksResult", elementsMobileTaskDashboard.firstTasksResult));

        return list;
    }


    public void validateDashboardFilterElements() {
        clickFirstGraph();
        controls.waitUntilElementIsVisible("dashboardFilterImg", elementsTaskDashboard.dashboardFilterImg);
        controls.click("dashboardFilterImg", elementsTaskDashboard.dashboardFilterImg);
        controls.waitUntilElementIsVisible("filterImg", elementsTaskDashboard.filterImg);

        controls.waitUntilElementIsVisible("resetFilterLink", elementsTaskDashboard.resetFilterLink);
        controls.waitUntilElementIsVisible("taskLabel", elementsTaskDashboard.taskType);

        controls.doubleTap("taskSpan", elementsTaskDashboard.taskSpan);
        controls.waitUntilElementIsVisible("taskConfirmBtn", elementsTaskDashboard.taskConfirmBtn);
        controls.waitUntilElementIsVisible("taskCancelBtn", elementsTaskDashboard.taskCancelBtn);
        controls.click("taskCancelBtn", elementsTaskDashboard.taskCancelBtn);

        controls.waitUntilElementIsVisible("lowPriorityCheckbox",
                String.format(elementsTaskDashboard.priorityCheckboxes, "low"));
        controls.waitUntilElementIsVisible("normalPriorityCheckbox",
                String.format(elementsTaskDashboard.priorityCheckboxes, "normal"));
        controls.waitUntilElementIsVisible("highPriorityCheckbox",
                String.format(elementsTaskDashboard.priorityCheckboxes, "high"));

        controls.waitUntilElementIsVisible("createdByLabel", elementsTaskDashboard.createdByLabel);
        controls.doubleTap("createdBySpan", elementsTaskDashboard.createdBySpan);
        controls.waitUntilElementIsVisible("createdByConfirmBtn", elementsTaskDashboard.createdByConfirmBtn);
        controls.waitUntilElementIsVisible("createdByCancelBtn", elementsTaskDashboard.createdByCancelBtn);
        controls.click("createdByCancelBtn", elementsTaskDashboard.createdByCancelBtn);

        controls.waitUntilElementIsVisible("openStatusCheckbox",
                String.format(elementsTaskDashboard.statusCheckboxes, "Open"));
        controls.waitUntilElementIsVisible("deferredStatusCheckbox",
                String.format(elementsTaskDashboard.statusCheckboxes, "Deferred"));
        controls.waitUntilElementIsVisible("completedStatusCheckbox",
                String.format(elementsTaskDashboard.statusCheckboxes, "Completed"));
        controls.waitUntilElementIsVisible("underReviewStatusCheckbox",
                String.format(elementsTaskDashboard.statusCheckboxes, "Under_review"));
        controls.waitUntilElementIsVisible("returnStatusCheckbox",
                String.format(elementsTaskDashboard.statusCheckboxes, "Return"));

        controls.waitUntilElementIsVisible("createdOnFrom", elementsTaskDashboard.createdOnFrom);
        controls.waitUntilElementIsVisible("createdOnTo", elementsTaskDashboard.createdOnTo);
        controls.waitUntilElementIsVisible("createdOnClear", elementsTaskDashboard.createdOnClear);
        controls.waitUntilElementIsVisible("startDateFrom", elementsTaskDashboard.startDateFrom);
        controls.waitUntilElementIsVisible("startDateTo", elementsTaskDashboard.startDateTo);
        controls.waitUntilElementIsVisible("startDateClear", elementsTaskDashboard.startDateClear);
        scrollDownDashboard();

        controls.waitUntilElementIsVisible("dueOnFrom", elementsTaskDashboard.dueOnFrom);
        controls.waitUntilElementIsVisible("dueOnTo", elementsTaskDashboard.dueOnTo);
        controls.waitUntilElementIsVisible("dueOnClear", elementsTaskDashboard.dueOnClear);
        controls.waitUntilElementIsVisible("expiryDateFrom", elementsTaskDashboard.expiryDateFrom);
        controls.waitUntilElementIsVisible("expiryDateTo", elementsTaskDashboard.expiryDateTo);
        controls.waitUntilElementIsVisible("expiryDateClear", elementsTaskDashboard.expiryDateClear);
        controls.waitUntilElementIsVisible("applyBtn", elementsTaskDashboard.applyBtn);
        controls.waitUntilElementIsVisible("cancelBtn", elementsTaskDashboard.cancelBtn);
        scrollUpDashboard();

    }

    public void selectFilterValues(TreeMap<String, String> treeMap) {

        //Select Task Type
        controls.waitUntilElementIsVisible("taskType", elementsTaskDashboard.taskType);
        controls.doubleTap("taskType", elementsTaskDashboard.taskType);
        controls.click("taskTypeValue",
                String.format(elementsTaskDashboard.taskTypeValue,
                        treeMap.get(TaskDashboardEnum.TASKS2.property)));
        controls.click("taskConfirmBtn", elementsTaskDashboard.taskConfirmBtn);

        //Select priority checkbox from excel
        String priorityExcelValue = treeMap.get(TaskDashboardEnum.PRIORITY2.property).toLowerCase();
        if (priorityExcelValue.equalsIgnoreCase("low")) {
            controls.click("lowPriorityCheckbox",
                    String.format(elementsTaskDashboard.priorityCheckboxes, priorityExcelValue));
        } else if (priorityExcelValue.equalsIgnoreCase("normal")) {
            controls.click("normalPriorityCheckbox",
                    String.format(elementsTaskDashboard.priorityCheckboxes, priorityExcelValue));
        } else if (priorityExcelValue.equalsIgnoreCase("high")) {
            controls.click("highPriorityCheckbox",
                    String.format(elementsTaskDashboard.priorityCheckboxes, priorityExcelValue));
        }

        controls.doubleTap("createdBy", elementsTaskDashboard.createdBySpan);
        controls.click("createdByValue",
                String.format(elementsTaskDashboard.createdByValue,
                        treeMap.get(TaskDashboardEnum.CREATED_BY2.property)));
        controls.click("createdByConfirmBtn", elementsTaskDashboard.createdByConfirmBtn);


        //Select status checkbox from excel
        String statusExcelValue = treeMap.get(TaskDashboardEnum.STATUS2.property);
        if (statusExcelValue.equalsIgnoreCase("open")) {
            controls.click("openStatusCheckbox",
                    String.format(elementsTaskDashboard.statusCheckboxes, statusExcelValue));
        } else if (statusExcelValue.equalsIgnoreCase("Deferred")) {
            controls.click("deferredStatusCheckbox",
                    String.format(elementsTaskDashboard.statusCheckboxes, statusExcelValue));
        } else if (statusExcelValue.equalsIgnoreCase("completed")) {
            controls.click("completedStatusCheckbox",
                    String.format(elementsTaskDashboard.statusCheckboxes, statusExcelValue));
        } else if (statusExcelValue.equalsIgnoreCase("under review")) {
            controls.click("underReviewStatusCheckbox",
                    String.format(elementsTaskDashboard.statusCheckboxes, statusExcelValue));
        } else if (statusExcelValue.equalsIgnoreCase("return")) {
            controls.click("returnStatusCheckbox",
                    String.format(elementsTaskDashboard.statusCheckboxes, statusExcelValue));
        }

        controls.enterText("createdOnFrom", elementsTaskDashboard.createdOnFrom,
                treeMap.get(TaskDashboardEnum.CREATED_ON_FROM2.property));
        controls.enterText("createdOnTo", elementsTaskDashboard.createdOnTo,
                treeMap.get(TaskDashboardEnum.CREATED_ON_TO2.property));
        controls.enterText("startDateFrom", elementsTaskDashboard.startDateFrom,
                treeMap.get(TaskDashboardEnum.START_DATE_FROM2.property));
        controls.enterText("startDateTo", elementsTaskDashboard.startDateTo,
                treeMap.get(TaskDashboardEnum.START_DATE_TO2.property));
        scrollDownDashboard();
        controls.enterText("dueOnFrom", elementsTaskDashboard.dueOnFrom,
                treeMap.get(TaskDashboardEnum.DUE_DATE_FROM2.property));
        controls.enterText("dueOnTo", elementsTaskDashboard.dueOnTo,
                treeMap.get(TaskDashboardEnum.DUE_DATE_TO2.property));
        controls.enterText("expiryDateFrom", elementsTaskDashboard.expiryDateFrom,
                treeMap.get(TaskDashboardEnum.EXPIRY_DATE_FROM2.property));
        controls.enterText("expiryDateTo", elementsTaskDashboard.expiryDateTo,
                treeMap.get(TaskDashboardEnum.EXPIRY_DATE_TO2.property));

        controls.tap("applyBtn", elementsTaskDashboard.applyBtn);

    }

    public Set<String> validateDashboardFilterFunctionality(TreeMap<String, String> treeMap)
            throws InterruptedException {
        clickTaskDashboardImg();
        Thread.sleep(3000);
        clickTaskDashboardImg();
        validateDashboardFilterElements();
        selectFilterValues(treeMap);

        list.add(controls.getText("firstTasksResult", elementsMobileTaskDashboard.firstTasksResult));
        list.add(controls.getText("firstPriorityResult", elementsMobileTaskDashboard.firstPriorityResult));
        list.add(controls.getText("firstDueDateResult", elementsMobileTaskDashboard.firstDueDateResult));
        list.add(controls.getText("firstStatusResult", elementsMobileTaskDashboard.firstStatusResult));

        return list;
    }


    public void enterGlobalSearchValue() {
        util.enterText(driver, "globalSearchInput",
                elementsMobileTaskDashboard.globalSearchInput, "Charu Sadana");
    }

    public void clickSearchIcon() {
        controls.click("globalSearchIcon", elementsMobileTaskDashboard
                .globalSearchIcon);
    }

    public void clickHomeIcon() {
        controls.click("homeIcon", elementsMobileTaskDashboard.homeIcon);
    }

    public void clickNotificationIcon() {
        controls.click("notificationIcon", elementsMobileTaskDashboard.notificationIcon);
    }

    public void callManagement() throws MalformedURLException, InterruptedException {

//        DesiredCapabilities dc = new DesiredCapabilities();
//        dc.setCapability("androidPackage", "com.android.dialer");
//        dc.setCapability("appActivity", "DialtactsActivity");
//        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),dc);
//        driver.makeGsmCall("1982012175", GsmCallActions.CALL);;
        ((AndroidDriver) controls.getDriver()).makeGsmCall("1982012175", GsmCallActions.CALL);
        Thread.sleep(4000);
        ((AndroidDriver) controls.getDriver()).makeGsmCall("1982012175", GsmCallActions.ACCEPT);
        Thread.sleep(5000);
    }

    public void nearBy() throws MalformedURLException {

    }
}
