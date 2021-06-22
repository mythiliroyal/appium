
package com.yesgenie.pageobjects.enums;

/**
 * Refers environment variables of the application, refers to end point details of URI and
 * xls pageObjects
 *
 * */
public enum Application {

    ENVIRONMENT("environment"),
    APP("app"),

    GENIEPAGEOBJECTS("./src/test/resources/testdata/app/geniePageObjects/geniePageObjects.xlsx");
    public final String property;

    Application(String property) {
        this.property = property;
    }
}