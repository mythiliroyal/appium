package com.yesgenie.pageobjects.enums;

public enum SearchEnum {
    CUSTOMER_NAME("Customer Name"),
    CUST_ID("Cust Id"),
    MOBILE("Mobile"),
    ACCOUNT_NUMBER("Account Number"),
    UPI_HANDLE("UPI Handle"),
    GST("GST"),
    PROSPECT("Prospect ID"),
    EMAIL("Email"),
    TWITTER("Twitter"),
    BRANCH_CODE("Branch Code"),
    CITY("City"),
    DOB("DOB");

    public final String property;

    SearchEnum(String property) {
        this.property = property;
    }




}
