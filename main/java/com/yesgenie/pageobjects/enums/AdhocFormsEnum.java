package com.yesgenie.pageobjects.enums;

public enum AdhocFormsEnum {
    MOBILENO("Mobile No"),
    PANNO("Pan No"),
    BIRTHDATE("Birth Date"),
    EMAILID("Email Id"),
    CUSTOMERSEARCH("Customer Search"),
    PRODUCT("Product"),
    LOB("Lob"),
    SOURCE("Source"),
    CHANNEL("Channel"),
    SOURCECAMPAIGN("Source Campaign"),
    INTERACTIONTYPE("Interaction Type"),
    MODEOFINTERACTION("Mode of Interaction"),
    INTERACTIONWITH("Interaction With"),
    CUSTOMERID("Customer ID"),
    LOANACCOUNTNO("Loan Account No"),
    STAFFNAME("Staff Name"),
    REMARK("Remark");

    public final String property;

    AdhocFormsEnum(String property) {
        this.property = property;
    }




}
