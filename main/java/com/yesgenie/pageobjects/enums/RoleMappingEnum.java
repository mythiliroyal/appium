package com.yesgenie.pageobjects.enums;

public enum RoleMappingEnum {


    //Role Mapping Headers
    TICKETNUMBERH("Ticket Number Header"),
    ROLEH("Role Header"),
    MODIFIEDBYH("Modified By Header"),
    MODIFIEDDAATEH("Modified Date Header"),
    MAPPINGH("Mapping Header"),
    EDITH("Edit Date Header"),
    RMCONFIG("RM Config"),
    SEARCH("Search"),
    WIDGETS("Widgets"),
    ACTIONS("Actions"),
    PRODUCTS("Products"),
    DYNAMIC("Dynamic Forms"),
    CALLMANAGEMENT("Call Management"),
    TAGLOCATIONW("Tag Location (Web)"),
    TAGLOCATIONM("Tag Location (Mobile)"),
    ADMINCONFIG("Admin Config"),
    HRMS("HRMS");


    public final String property;

    RoleMappingEnum(String property) {
        this.property = property;
    }
}
