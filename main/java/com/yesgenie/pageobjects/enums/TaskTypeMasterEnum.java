package com.yesgenie.pageobjects.enums;

public enum TaskTypeMasterEnum {

    //keys
    CREATE_TASK_TYPE("Create Task Type"),
    TASK_TYPE_NAME("Task Type Name*"),
    TASK_CREATOR_ROLE("Task Creator Role*"),
    TASK_FULFILLER_ROLE("Task Fulfiller Role*"),
    REGARDING("Regarding"),
    CHANNEL("Channel*"),
    OPTION_TO_DEFER("Option to Defer*"),
    SELF_ASSIGN_CHECKBOX("Self Assign"),
    CHECK_IN_CHECKBOX("Check In"),
    REVIEW_CHECKBOX("Review"),
    REVIEWER("Reviewer"),
    ADID("ADID"),
    CTA("CTA*"),
    CREATE("Create"),
    CANCEL("Cancel"),
    VALIDATIONS("Validations");

    public final String property;

    TaskTypeMasterEnum(String property) {
        this.property = property;
    }

}
