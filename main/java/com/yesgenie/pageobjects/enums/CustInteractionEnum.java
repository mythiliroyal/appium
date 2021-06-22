package com.yesgenie.pageobjects.enums;

public enum CustInteractionEnum {

    CUSTOMER("Customer"),
    CCM("CCM"),
    CAMPAIGNS("Campaigns"),
    LEADS("Leads"),
    CASES("Cases"),
    INSTRUCTION("Instruction"),
    DELIVERABLES("Deliverables"),
    CAMPAIGN_NAME("Campaign Name"),
    LAST_COMMUNICATION("Last Communication"),
    JOURNEY_STATUS("Journey Status"),
    COMMUNICATIONS("Communications"),
    DATE_OF_INTERACTION("Date of Interaction"),
    INTERACTION_TYPE("Interaction Type"),
    MODE_OF_INTERACTION("Mode of Interaction"),
    INTERACTION_WITH("Interaction With"),
    DATE("Date"),
    DESCRIPTION("Description"),
    STATUS("Status"),
    REF_NO("Ref No."),
    DELIVERABLE("Deliverable"),

    //ccm record details
    VIEW_CCM("View CCM"),
    CCM_ID("CCM ID"),
    KEY_DISCUSSION_POINT("Key Discussion Point"),
    JOINT_INTERACTION_1("Joint Interaction 1"),
    NEXT_INTERACTION_DATE("Next Interaction Date"),
    INTERACTION_STATUS("Interaction Status"),
    MODE_OF_CONVERSION("Mode of Conversion"),

    CCM_DETAILS("CCM Details"),
    JOINT_INTERACTION_2("Joint Interaction 2"),


    //Lead record details
    LEAD_DETAILS("Lead details"),
    PRODUCT("Product"),
    CREATED_ON("Created On"),
    ASSIGNED_USER("Assigned User"),
    LOB_NAME("LOB Name"),
    BRANCH_NAME("Branch Name"),
    SOURCE_CAMPAIGN("Source Campaign"),

    LEAD_ID("Lead ID"),


    //Case record details
    CASE_DETAILS("Case details"),
    CASE_NUMBER("Case Number"),
    CREATED_BY("Created By"),
    PRODUCT_SERVICE("Product Service"),
    CASE_TYPE("Case type"),
    ISSUE_TYPE("Issue Type"),
    CATEGORY("Category"),
    CASE_STATUS("Case Status"),
    ASSIGNED_TEAM("Assigned Team"),

    CASE_NO("Case No"),
    PRODUCT_SERVICE2("Product/Service"),
    CASE_CATEGORY("Case Category"),

    //Instruction Details for mobile only
    INSTRUCTION_DETAILS("Instruction Details"),


    //Deliverable record details
    DELIVERABLE_DETAILS("Deliverable details"),
    REFERENCE_NO("reference_no"),
    TYPE("Type");

    public final String property;

    CustInteractionEnum(String property) {
        this.property = property;
    }

}
