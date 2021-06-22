package com.yesgenie.pageobjects.enums;

public enum UserManagementEnum {


    //Role Mapping Headers
    VIGILANCE("Vigilance Unit"),
    IDAM("IDAM"),
    UMA("UMA"),
    CENTRALPRODUCTADMIN("InBoundContact"),
    CENTRALPR("CentralproductAdmin"),
    PSM("PSM"),
    ACQUISITION("Acquisition APS"),
    OUTBOUND("Out-Bound Contact"),
    TECHNOLOGYI("Technology Inve"),
    BRANCHS("Branch Servicin"),
    OFFROLE("CC DST Off-Role"),
    ADMIN("Technical Admin"),
    TRADEPSM("Trade PSM"),
    TESTROLE("Test Role"),
    RMV("RM"),
    CSMPSM("CMS PSM"),
    CNTRALP2("Central Product"),
    ONROLE("CC DST On-Role"),

    USERID("User ID"),
    NAME("Name"),
    EMAIL("Email"),
    MOBILENUMMBER("Mobile Number"),
    MOBILEAPPPER("Mobile App Permission"),
    EDITROLE("Edit Role"),
    DELETE("Delete"),
    TECHADDD("Technical Administrator");

    public final String property;

    UserManagementEnum(String property) {
        this.property = property;
    }
}
