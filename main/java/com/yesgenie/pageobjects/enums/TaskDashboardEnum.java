package com.yesgenie.pageobjects.enums;

public enum TaskDashboardEnum {

    DROPDOWN_FILTER("Dropdown Filter"),
    ASSIGNED_TO_ME("Assigned To Me"),
    CREATED_BY_ME("Created By Me"),
    CREATED_BY_MY_TEAM("Created By My Team"),
    ASSIGNED_TO_MY_TEAM("Assigned To My Team"),

    TASK_ID("Task Id"),
    TASK_TYPE("Task Type"),
    REGARDING("Regarding"),
    PRIORITY("Priority"),
    DUE_DATE("Due Date"),
    CREATED_ON("Created On"),
    STATUS("Status"),
    SUBJECT("Subject"),
    CREATED_BY("Created By"),
    MODIFIED_ON("Modified On"),
    MODIFIED_BY("Modified By"),
    DEFER_COUNT("Defer Count"),
    DEFER_TO("Defer To"),
    TASK_DESCRIPTION("Task Description"),

    //Assigned to my team and created by my team columns
    TO_BE_DELAYED("To Be Delayed"),
    DELAYED("Delayed"),
    RETURN("Return"),
    DEFERRED("Deferred"),
    COMPLETED("Completed"),
    NA("NA"),

    //Filter additional columns
    CREATED_ON_FROM("Created On From"),
    CREATED_ON_TO("Created On To"),
    START_DATE_FROM("Start Date From"),
    START_DATE_TO("Start Date To"),
    DUE_DATE_FROM("Due Date From"),
    DUE_DATE_TO("Due Date To"),
    EXPIRY_DATE_FROM("Expiry Date From"),
    EXPIRY_DATE_TO("Expiry Date To"),
    ASSIGNED_BY("Assigned By"),

    //Mobile fields
    TASK_BY_STATUS("Tasks By Status"),
    TOTAL("Total:"),
    TASK("Task"),
    IN_TIME("In Time"),
    GRAPH_FOOTER_LABEL("Tap on the graph or legend for more details"),
    UNDER_REVIEW("Under Review"),
    KEY_INSIGHTS("Key Insights"),
    TOTAL_TASKS("Total Tasks"),
    TASKS("Tasks"),
    TASKS_CALENDER("Tasks Calendar"),
    CREATE_NEW("Create New"),
    DUE("Due:"),
    DESCRIPTION("Description"),
    CUST_ID("Cust ID: "),
    PRIORITY2("Priority:"),
    STATUS2("Status:"),
    TASK_ID2("Task ID_2"),
    TASKS2("Tasks:"),
    REGARDING_ID("Regarding ID:"),
    ASSIGNED_TO("Assigned To"),
    SUBJECT2("Subject2"),
    TASK_DESCRIPTION2("Task Description2"),
    CREATED_ON_FROM2("Created On From2"),
    CREATED_ON_TO2("Created On To2"),
    START_DATE_FROM2("Start Date From2"),
    START_DATE_TO2("Start Date To2"),
    DUE_DATE_FROM2("Due Date From2"),
    DUE_DATE_TO2("Due Date To2"),
    EXPIRY_DATE_FROM2("Expiry Date From2"),
    EXPIRY_DATE_TO2("Expiry Date To2"),
    CREATED_BY2("Created By2");

    public final String property;

    TaskDashboardEnum(String property) {
        this.property = property;
    }
}
