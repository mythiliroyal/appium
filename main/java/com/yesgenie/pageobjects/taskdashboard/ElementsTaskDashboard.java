package com.yesgenie.pageobjects.taskdashboard;

public class ElementsTaskDashboard {


    public String taskDashboardImg = "xpath~//span[text()='TASK']/../img";

    public String defaultFilterValue = "xpath~//div[contains(@class,'placeholder')]";
    public String selectedFilterValue = "xpath~//div[contains(@class,'singleValue')]";

    public String dropdownSvg = "xpath~//span[text()='TASK']/ancestor::div[@id='root']//*[name()='svg']";

    public String taskDropdownFilterValues = "xpath~//span[text()='TASK']/ancestor::div[@id='root']"
            + "//div[contains(@id,'option')]";

    public String dropdownCreatedByMeVal = "xpath~//*[name()='svg']/ancestor::div"
            + "[contains(@class,'control')]/following-sibling::div//div[contains(text(),'Created by me')]";

    public String resultFirstRowValues = "xpath~//ancestor::div[contains(@class,'container')]"
            + "/../../../following-sibling::div/div[2]//span[string-length(text())> '0']";

    public String dropdownCreatedByMyTeamVal = "xpath~//*[name()='svg']/"
            + "ancestor::div[contains(@class,'control')]"
            + "/following-sibling::div//div[contains(text(),'Created by my team')]";
    public String defaultColumns2 = "xpath~//img[contains(@src,'down_default')]/../../../span[2]";
    public String defaultColumns3 = "xpath~//img[contains(@src,'down_default')]/../../../span";
    public String noOfRows = "xpath~//div[contains(@class,'container')]/../../../"
            + "following-sibling::div[2]/div/div/following-sibling::div/div";
    public String rowData = "xpath~//div[contains(@class,'container')]/../../../"
            + "following-sibling::div[2]//div/div[2]/div[1]/span[position()>1][position()<9]";
    public String headersCount = "xpath~//*[name()='img']/../following-sibling::span"
            + "/span[1][not(contains(text(),'found'))]";
    public String resultsCount = "xpath~//div[contains(@class,'container')]/../../../"
            + "following-sibling::div/div/div/following-sibling::div/div/span[2]";
    public String viewListUserLink = "xpath~//span[text()='%s']/../../../../following-sibling::div/span";
    public String viewListBackImg = "xpath~//span[text()='%s']/..//img[contains(@src,'Back')]";
    public String viewListLinks = "xpath~//div[contains(@class,'container')]"
            + "/../../../following-sibling::div[2]//div/div[2]/div[3]/div";

    public String dropdownAssignedToMyTeamVal = "xpath~//*[name()='svg']/ancestor::div[contains(@class,'control')]/"
            + "following-sibling::div//div[contains(text(),'Assigned to my team')]";

    public String defaultColumns = "xpath~//ancestor::div[contains(@class,'container')]/../../../"
            + "following-sibling::div/div/span";

    public String defaultColumn = "xpath~//ancestor::div[contains(@class,'container')]/../../../"
            + "following-sibling::div/div/span[1]";

    public String expandedRowColumns = "xpath~//span[text()='Task Id']/../"
            + "following-sibling::div/div/following-sibling::div/div/div/div[position() <6]/span[1]";

    public String firstRowClick = "xpath~//span[text()='Task Id']/.."
            + "/following-sibling::div/div[1]/span[contains(text(),'TG')]";

    public String taskIDresult = "xpath~//input[@placeholder='Search for Tasks']";
    public String searchInput = "xpath~//input[@placeholder='Search for Tasks']";
    public String searchIcon = "xpath~//img[contains(@src,'searchRM')]";
    public String searchDeleteIcon = "xpath~//img[contains(@src,'CloseBlack')]";
    public String searchInfoText = "xpath~//div[contains(@title,'You can search by: "
            + "Task ID, Subject, Task Description, Task Type')]";
    public String taskIdResults = "xpath~//ancestor::div[contains(@class,'container')]/../../../"
            + "following-sibling::div/div/div/span[1]";
    public String subjectResults = "xpath~//ancestor::div[contains(@class,'container')]/../../../"
            + "following-sibling::div/div/div/span[8]";
    public String taskDescResults = "xpath~//span[text()='Task Description']/following-sibling::span";
    public String taskTypeResults = "xpath~//ancestor::div[contains(@class,'container')]"
            + "/../../../following-sibling::div/div/div/span[2]";

    public String dashboardFilterImg = "xpath~//img[contains(@src,'Filter')]";
    public String filterImg = "xpath~//img[contains(@src,'Filter')]";
    public String resetFilterLink = "xpath~//span[text()='Reset Filters']";
    public String taskType = "xpath~//span[text()='Task Type']/following-sibling::div//span[text()='Select']";
    public String taskTypeSpan = "xpath~//span[text()='Task Type']";
    public String taskTypeValue = "xpath~//div[text()='%s']";

    public String taskSpan = "";
    public String taskConfirmBtn = "";
    public String taskCancelBtn = "";

    public String priorityCheckboxes = "xpath~//span[text()='%s']/..//input[@type='checkbox']/following-sibling::span";

    public String createdByLabel = "";
    public String createdBySpan = "";
    public String createdByValue = "";
    public String createdByConfirmBtn = "";
    public String createdByCancelBtn = "";

    public String statusCheckboxes = "xpath~//span[text()='%s']/..//input[@type='checkbox']/following-sibling::span";
    public String createdOnFrom = "xpath~//span[text()='Created On']/..//span[text()='From']/..//*[name()='input']";
    public String createdOnTo = "xpath~//span[text()='Created On']/..//span[text()='To']/..//*[name()='input']";
    public String createdOnClear = "xpath~//span[text()='Created On']/..//span[text()='Clear']";

    public String startDateFrom = "xpath~//span[text()='Start Date']/..//span[text()='From']/..//*[name()='input']";
    public String startDateTo = "xpath~//span[text()='Start Date']/..//span[text()='To']/..//*[name()='input']";
    public String startDateClear = "xpath~//span[text()='Start Date']/..//span[text()='Clear']";

    public String dueOnFrom = "xpath~//span[text()='Due on']/..//span[text()='From']/..//*[name()='input']";
    public String dueOnTo = "xpath~//span[text()='Due on']/..//span[text()='To']/..//*[name()='input']";
    public String dueOnClear = "xpath~//span[text()='Due on']/..//span[text()='Clear']";

    public String expiryDateFrom = "xpath~//span[text()='Expiry Date']/..//span[text()='From']"
            + "/..//*[name()='input']";
    public String expiryDateTo = "xpath~//span[text()='Expiry Date']/..//span[text()='To']/..//*[name()='input']";
    public String expiryDateClear = "xpath~//span[text()='Expiry Date']/..//span[text()='Clear']";

    public String assignedBy = "xpath~//span[text()='Assigned By']/following-sibling::div//span[text()='Select']";
    public String assignedByValue = "xpath~//div[text()='%s']";
    public String assignedBySpan = "xpath~//span[text()='Assigned By']";
    public String applyBtn = "xpath~//div[text()='Apply']";
    public String cancelBtn = "xpath~//div[text()='Cancel']";

    public String assignedToMeResultRows = "xpath~//div[contains(@class,'container')]/../../.."
            + "/following-sibling::div/div[2]/div";
    public String assignedToMeResultRow = "xpath~//div[contains(@class,'container')]/../../.."
            + "/following-sibling::div/div[2]/div[1]/span";

    public String columnResults = "xpath~//ancestor::div[contains(@class,'container')]/../.."
            + "/../following-sibling::div/div/div/span[1]";

    public String createdByValues = "xpath~//div[contains(@class,'container')]/../../.."
            + "/following-sibling::div/div[2]/div/span[9]";

}