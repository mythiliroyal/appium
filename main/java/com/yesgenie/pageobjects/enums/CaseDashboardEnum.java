package com.yesgenie.pageobjects.enums;

public enum CaseDashboardEnum {
    DROPDOWN_FILTER("Dropdown Filter"),
    CASE_NO("Case No"),
    CUST_NAME("Cust Name"),
    PRODUCT_SERVICE("Product/Service"),
    CASE_TYPE_SERVICE("Case Type Service"),
    ISSUE_TYPE("Issue Type"),
    CASE_CATEGORY("Case Category"),
    CASE_STATUS("Case Status"),
    CREATED_ON("Created On"),
    DUE_ON("Due On"),
    CUSTOMERS("Customers"),
    CASES("Cases"),
    RESOLVED("Resolved"),
    OPEN("Open"),
    IN_TIME("In Time"),
    DUE_DATE("Due Date"),
    DELAYED("Delayed");

    public final String property;

    CaseDashboardEnum(String property) {
        this.property = property;
    }
}
