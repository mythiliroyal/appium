package com.yesgenie.pageobjects.loginpage;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import com.google.inject.Inject;
import com.xassure.enums.App;
import com.xassure.framework.annotations.Web;
import com.xassure.framework.driver.Controls;
import com.xassure.reporting.logger.LogStatus;
import com.xassure.reporting.logger.Reporting;
import com.xassure.reporting.testCaseDetails.TestCaseData;
import com.xassure.reporting.utilities.PropertiesFileHandler;
import com.yesgenie.pageobjects.IPage;
import com.yesgenie.pageobjects.enums.Application;
import com.yesgenie.util.UtilityMethods;
import org.apache.commons.lang3.RandomUtils;
import org.aspectj.util.FileUtil;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class LoginPage implements IPage {

    @Inject
    ElementsLoginPage elementsLoginPage;

    @Inject
    TestCaseData testCaseData;

    @Inject
    UtilityMethods util;

    Controls controls;
    WebDriver driver;


    @Inject
    public LoginPage(@Web Controls controls) {
        this.controls = controls;
    }

    public void launchApplication() throws IOException {
        String url;
        PropertiesFileHandler propFileHandler = new PropertiesFileHandler();
        String environmentVariable = System.getProperty(Application.ENVIRONMENT.property);
        String app = System.getProperty(Application.APP.property);
        url = propFileHandler.readProperty("environment", app + "." + environmentVariable);
        System.out.println(url);
        //driver = controls.getDriver();

        controls.launchApplication(url);

        //driver.manage().window().maximize();
        if (controls.getPageTitle().contains("https://")) {
            controls.refreshPage();
        }
    }

    /**
     * Verifying the loginPage elements
     *
     * @return List containing the elements
     **/
    public List<Object> loginPageElements() {
        List<Object> loginData = new ArrayList<>();
        if (controls.waitUntilElementIsVisible("Login", elementsLoginPage.loginLabel)) {
            loginData.add(controls.getText("Login", elementsLoginPage.loginLabel));
        }
        loginData.add(controls.getText("User ID", elementsLoginPage.loginUserIdLabel));
        loginData.add(controls.getText("Password", elementsLoginPage.loginPasswordLabel));
        loginData.add(controls.getText("Copyright", elementsLoginPage.footerRightsText));
        return loginData;
    }

    /**
     * Login to web and mobile application
     ***/

    public void loginPage(String userName, String password) {

        if (controls.waitUntilElementToBeClickable("User ID",
                elementsLoginPage.loginUsernameField)) {
            controls.enterText("User ID", elementsLoginPage.loginUsernameField, userName);
            if (testCaseData.getPlatform().equalsIgnoreCase("web")) {
                controls.doubleClick("Password", elementsLoginPage.loginPassword);
            }
            controls.enterText("Password", elementsLoginPage.loginPassword, password);
            controls.click("Login Button", elementsLoginPage.loginButton);
            if (testCaseData.getPlatform().equalsIgnoreCase("mobile")) {

                for (Object value : controls.getWebElementsList(
                        "otpFields", elementsLoginPage.otpFields)) {
                    ((WebElement) value).sendKeys("2");
                }
                controls.enterText("finalPwd",
                        elementsLoginPage.finalPwd, password);
                controls.click("loginButton", elementsLoginPage.loginButton);
            }
        }
    }
}