package com.yesgenie.pageobjects.enums;

public enum LeadPageEnums {


    //Role Mapping Headers
    SEARCHBYNAME("Search by Name"),
    SEARCHBYCUSTID("Search by CustID");

    public final String property;

    LeadPageEnums(String property) {
        this.property = property;
    }
}
