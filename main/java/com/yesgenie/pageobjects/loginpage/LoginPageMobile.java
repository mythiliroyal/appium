package com.yesgenie.pageobjects.loginpage;

import com.google.inject.Inject;
import com.xassure.framework.annotations.Mobile;
import com.xassure.framework.driver.Controls;
import com.yesgenie.pageobjects.IPage;
import com.yesgenie.util.UtilityMethods;
import org.openqa.selenium.WebElement;
import io.appium.java_client.AppiumDriver;

public class LoginPageMobile extends LoginPage implements IPage {

    @Inject
    ElementsMobileLoginPage elementsMobileLoginPage;

    @Inject
    UtilityMethods util;

    Controls controls;

    AppiumDriver<WebElement> driver;

    @Inject
    public LoginPageMobile(@Mobile Controls controls) {
        super(controls);
        this.controls = controls;
       }

    @Inject
    public void init() {
        super.elementsLoginPage = this.elementsMobileLoginPage;
    }

}
