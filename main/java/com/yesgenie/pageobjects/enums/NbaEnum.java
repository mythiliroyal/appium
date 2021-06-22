package com.yesgenie.pageobjects.enums;

public enum NbaEnum {

    ALL("All"),
    REGULATORY("Regulatory"),
    SERVICE("Service"),
    X_SELL("X-Sell"),
    ALERTS("Alerts"),
    INFORMATION("Information"),

    CUSTOMER("Customer"),
    RECOMMENDATION_NAME("Recommendation Name"),

    //Defer with ccm form
    DEFER_WITH_CCM("Defer with CCM"),
    DEFER_INTERACTION_TYPE("Interaction Type*"),
    DEFER_DATE_OF_INTERACTION("Date of Interaction*"),
    DEFER_MODE_OF_INTERACTION("Mode of Interaction*"),
    DEFER_INTERACTION_WITH("Interaction With"),
    DEFER_KEY_DISCUSSION_POINTS("Key discussion points"),

    DEFER_DATE("Defer Date"),


    //Dismiss reason form
    DISMISS_REASON("Dismiss Reason"),
    PLAN_CHANGE_RADIO_BUTTON("Plan Radio"),
    ADD_REMARKS("Add Remarks"),
    DISMISS_INTERACTION_TYPE("Interaction Type*"),
    DISMISS_DATE_OF_INTERACTION("Date of Interaction*"),
    DISMISS_MODE_OF_INTERACTION("Mode of Interaction*"),
    DISMISS_INTERACTION_WITH("Interaction With"),

    //Request Locker form
    REQUEST_LOCKER("Create Lead"),
    CUSTOMER_ID("Customer ID*"),
    PRODUCT("Product*"),
    LOB("LOB*"),
    SOURCE("Source*"),
    CHANNEL("Channel"),
    SOURCE_CAMPAIGN("Source Campaign"),
    BRANCH("Branch*"),
    RATING_RADIO_BUTTON("Rating"),
    LEAD_INTERACTION_TYPE("Interaction Type*"),
    LEAD_DATE_OF_INTERACTION("Date of Interaction*"),
    LEAD_MODE_OF_INTERACTION("Mode of Interaction*"),
    LEAD_INTERACTION_WITH("Interaction With"),


    //Create case form
    CREATE_CASE("Create Case"),
    CASE_CUSTOMER_ID("1. Cust ID*"),
    CASE_CHANNEL("2. Channel*"),
    CASE_MODE("3. Mode*"),
    CASE_PRODUCT_NAME("4. Product Name*"),
    CASE_TYPE("5. Case Type*"),
    REMARKS("Remarks"),
    ISSUE_TYPE_NAME("6. Issue Type Name*"),
    CASE_CATEGORY("Case Category"),
    ATM_ID("ATM ID*"),
    TRANSACTION_DETAILS("Transaction Details*"),


    //Card upgarde
    HEADER_UPGRADE_CARD("Header Upgrade Card"),
    CUSTOMERS_ID("Customers ID"),
    ACCOUNT_NUMBER("Account Number"),
    CARD_NUMBER("Card Number"),
    MOBILE_NUMBER("Mobile Number"),
    PRODUCT_DESCRIPTION("Product Description"),
    NEW_PRODCUT_ELIGIBLE("New Product Eligible"),
    ANNUAL_FEE("Annual Fee"),
    OFFER_VALIDITY_DATE("Offer Validity Date"),
    PRODCUT_FEATURES("Product Features");

    public final String property;

    NbaEnum(String property) {
        this.property = property;
    }
}
