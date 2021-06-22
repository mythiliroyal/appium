package com.yesgenie.pageobjects.enums;

public enum ProspectEnum {


    SEARCHBYPROSPECTID("searchByProspectId"),
    SEARCHBYMOBILE("Search by Mobile No");

    public final String property;

    ProspectEnum(String property) {
        this.property = property;
    }
}
