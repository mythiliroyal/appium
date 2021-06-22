package com.yesgenie.pageobjects.tasktypemaster;

public class ElementsTaskTypeMasterPage {

    public String adminConsoleBtn = "xpath~//div[text()='Admin Console']";

    public String taskTypeMasterTab = "xpath~//span[text()='Task Type Master']";

    public String createNewBtn = "xpath~//div[normalize-space(text())='+ Create New']/parent::button";

    public String createTaskTypeLabel = "xpath~//div[text()='Create Task Type']";

    public String taskTypeNameLabel = "xpath~//div[text()='Task Type Name']";
    public String taskTypeNameTextField = "css~#taskTypeName";

    public String taskCreatorRoleLabel = "xpath~//div[text()='Task Creator Role']";
    public String taskCreatorRoleDropdownSvg = "xpath~//div[text()='Task Creator Role']/..//*[name()='svg']";
    // public String dropdownSvg = "xpath~//div[text()='%s']/..//*[name()='svg']";
    public String dropdownDiv = "xpath~//div[text()='%s']/..//div[contains(@class,'control')]";
    public String taskCreatorRoleDropdownInput = "xpath~//div[text()='Task Creator Role']"
            + "/..//div[text()='Technical Administrator']";

    public String taskFulfillerRoleLabel = "xpath~//div[text()='Task Fulfiller Role']";
    public String taskFulfillerRoleDropdownSvg = "xpath~//div[text()='Task Fulfiller Role']/..//*[name()='svg']";
    public String taskFulfillerRoleDropdownInput = "xpath~//div[text()='Task Fulfiller Role']"
            + "/..//div[text()='Technical Administrator']";

    public String regardingLabel = "xpath~//div[text()='Regarding']";
    public String regardingDropdownSvg = "xpath~//div[text()='Regarding']/..//*[name()='svg']";
    public String regardingDropdownInput = "xpath~//div[text()='Regarding']/..//div[text()='Customer']";

    public String channelLabel = "xpath~//div[text()='Channel']";
    public String channelDropdownSvg = "xpath~//div[text()='Channel']/..//*[name()='svg']";
    public String channelDropdownInput = "xpath~//*[text()='Web']";

    public String optionsToDeferLabel = "xpath~//div[text()='Option to Defer']";
    public String optionsToDeferDropdownSvg = "xpath~//div[text()='Option to Defer']/..//*[name()='svg']";
    public String optionsToDeferDropdownInput = "xpath~//div[text()='Select Option to Defer']"
            + "/ancestor::div[contains(@class,'control')]/following-sibling::div//*[text()='NO']";
    public String optionsToDeferDropdownValues = "xpath~//div[text()='Option to Defer']"
            + "/following-sibling::div//div[contains(@id,'option')]";

    public String selfAssignCheckbox = "xpath~//div[text()='Self Assign']/..//span/span";
    public String selfAssignCheckboxTxt = "xpath~//div[text()='Self Assign']";
    public String checkInCheckbox = "xpath~//div[text()='Check In']/..//span/span";
    public String checkInCheckboxTxt = "xpath~//div[text()='Check In']";
    public String reviewCheckbox = "xpath~//div[text()='Review']/..//span/span";
    public String reviewCheckboxTxt = "xpath~//div[text()='Review']";

    public String reviewerDropdownSvg = "xpath~//div[text()='Reviewer']/..//*[name()='svg']";

    public String adidLabel = "xpath~//div[text()='ADID']";
    public String adidTextField = "css~#reviewerId";

    public String ctaLabel = "xpath~//div[text()='CTA']";
    public String ctaDropdownsSvg = "xpath~//div[text()='CTA']"
            + "/ancestor::div[@class='S342L-ecUKuTT2tPvAqMu']//*[name()='svg']";
    public String dropdownSendText = "xpath~//div[text()='Regarding']/..//*[name()='input' and @type='text']";
    public String dropdownSendText2 = "xpath~(//div[text()='CTA']/ancestor::div[@class="
            + "'S342L-ecUKuTT2tPvAqMu']//div[@class='css-anc4rl'])[1]//input";

    public String dropdownSendText3 = "xpath~//div[text()='Option to Defer']"
            + "/..//*[name()='input' and @type='text']";
    public String dropdownSendText4 = "xpath~//div[text()='Reviewer']/..//*[name()='input' and @type='text']";
    public String dropdownSendTextC = "xpath~//div[text()='%s']/..//*[name()='input' and @type='text']";

    public String dropdownValues = "xpath~//div[contains(@class,'menu')]//div[contains(@id,'option')]";
    public String dropdownValue = "xpath~//div[contains(@class,'menu')]//div[contains(@id,'option') and text()='%s']";

    public String ctaCompletionCheckboxes = "xpath~//div[text()='CTA']/../..//span/span";
    public String deleteCtaIcons = "xpath~//div[text()='CTA']/../..//*[name()='img']";
    public String addNewCtaLabel = "xpath~//div[text()='CTA']/../..//div[text()='+ Add New CTA']";

    public String createBtn = "xpath~//div[normalize-space(text())='Create']";
    public String cancelBtn = "xpath~//div[text()='Cancel']";

    public String successValidation = "xpath~//*[text()='Request Raised Successfully']";
    public String userLogout = "xpath~//*[text()='%s']";
    public String logoutBtn = "xpath~//*[text()='Logout']";

    public String approveTaskTypeTab = "xpath~//div[text()='Approve Task Type']";
    public String taskTypeName = "xpath~//tr//td[text()='Test Sample oDy']";
    public String taskTypeCheckbox = "xpath~//tr//td[text()='Test Sample oDy']/..//span/span";
    public String approveBtn = "xpath~//div[text()='Approve']";
    public String closeBtn = "xpath~//div[text()='Close']";

    public String taskTypeTab = "xpath~//div[text()='Task Type']";

}
