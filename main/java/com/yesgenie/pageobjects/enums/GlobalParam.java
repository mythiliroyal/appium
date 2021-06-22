package com.yesgenie.pageobjects.enums;

public enum GlobalParam {

        USERNAME("Username"),
        PASSWORD("Password"),
        FULL_NAME("Full Name");

        public final String property;

    GlobalParam(String property) {
            this.property = property;
        }
}