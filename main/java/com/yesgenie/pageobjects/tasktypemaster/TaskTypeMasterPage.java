package com.yesgenie.pageobjects.tasktypemaster;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import com.google.inject.Inject;
import com.xassure.framework.annotations.Web;
import com.xassure.framework.driver.Controls;
import com.xassure.reporting.logger.LogStatus;
import com.xassure.reporting.logger.Reporting;
import com.xassure.reporting.testCaseDetails.TestCaseData;
import com.yesgenie.pageobjects.ElementsApp;
import com.yesgenie.pageobjects.IPage;
import com.yesgenie.pageobjects.enums.TaskTypeMasterEnum;
import com.yesgenie.util.UtilityMethods;
import org.openqa.selenium.WebElement;

public class TaskTypeMasterPage extends ElementsApp implements IPage {

    @Inject
    ElementsTaskTypeMasterPage elementsTaskTypeMasterPage;

    @Inject
    TestCaseData testCaseData;

    @Inject
    UtilityMethods util;

    Controls controls;

    @Inject
    public TaskTypeMasterPage(@Web Controls controls) {
        this.controls = controls;
    }


    Set<String> list = new TreeSet<>();

    public void navigateToCreateTaskForm() {
        if (controls.waitUntilElementIsVisible("Admin Console", elementsTaskTypeMasterPage.adminConsoleBtn)) {
            controls.click("adminConsoleBtn", elementsTaskTypeMasterPage.adminConsoleBtn);
        }
        if (controls.waitUntilElementIsVisible("taskTypeMasterTab", elementsTaskTypeMasterPage.taskTypeMasterTab)) {
            controls.click("taskTypeMasterTab", elementsTaskTypeMasterPage.taskTypeMasterTab);
        }
        if (controls.waitUntilElementIsVisible("createNewBtn", elementsTaskTypeMasterPage.createNewBtn)) {
            controls.click("createNewBtn", elementsTaskTypeMasterPage.createNewBtn);
        }
    }

    public void validateTaskTypeNameField() {
        if (controls.waitUntilElementIsVisible("createTaskTypeLabel",
                elementsTaskTypeMasterPage.createTaskTypeLabel)) {
            list.add(controls.getText("createTaskTypeLabel", elementsTaskTypeMasterPage.createTaskTypeLabel));
            list.add(controls.getText("taskTypeNameLabel", elementsTaskTypeMasterPage.taskTypeNameLabel));
            controls.waitUntilElementIsVisible("taskTypeNameTextField",
                    elementsTaskTypeMasterPage.taskTypeNameTextField);
        }
    }

    public void validateTaskCreatorField() {
        list.add(controls.getText("taskCreatorRoleLabel", elementsTaskTypeMasterPage.taskCreatorRoleLabel));
        controls.waitUntilElementIsVisible("taskCreatorRoleDropdownSvg",
                elementsTaskTypeMasterPage.taskCreatorRoleDropdownSvg);
    }


    public void validateTaskFulfillerField() {
        list.add(controls.getText("taskFulfillerRoleLabel", elementsTaskTypeMasterPage.taskFulfillerRoleLabel));
        controls.waitUntilElementIsVisible("taskFulfillerRoleDropdownSvg",
                elementsTaskTypeMasterPage.taskFulfillerRoleDropdownSvg);
    }

    public void validateRegardingField() {
        list.add(controls.getText("regardingLabel", elementsTaskTypeMasterPage.regardingLabel));
        controls.waitUntilElementIsVisible("regardingDropdownSvg", elementsTaskTypeMasterPage.regardingDropdownSvg);
    }

    public void validateChannelField() {
        list.add(controls.getText("channelLabel", elementsTaskTypeMasterPage.channelLabel));
        controls.waitUntilElementIsVisible("channelDropdownSvg", elementsTaskTypeMasterPage.channelDropdownSvg);
    }

    public void validateOptionToDeferField() {
        list.add(controls.getText("optionsToDeferLabel", elementsTaskTypeMasterPage.optionsToDeferLabel));
        controls.waitUntilElementIsVisible("optionsToDeferDropdownSvg",
                elementsTaskTypeMasterPage.optionsToDeferDropdownSvg);
    }

    public void validateCheckboxes() {
        controls.waitUntilElementIsVisible("selfAssignCheckbox", elementsTaskTypeMasterPage.selfAssignCheckbox);
        list.add(controls.getText("selfAssignCheckboxTxt", elementsTaskTypeMasterPage.selfAssignCheckboxTxt));
        controls.waitUntilElementIsVisible("checkInCheckbox", elementsTaskTypeMasterPage.checkInCheckbox);
        list.add(controls.getText("checkInCheckboxTxt", elementsTaskTypeMasterPage.checkInCheckboxTxt));
        controls.waitUntilElementIsVisible("reviewCheckbox", elementsTaskTypeMasterPage.reviewCheckbox);
        list.add(controls.getText("reviewCheckboxTxt", elementsTaskTypeMasterPage.reviewCheckboxTxt));
    }

    public void validateCtaGrid() {
        list.add(controls.getText("ctaLabel", elementsTaskTypeMasterPage.ctaLabel));
        controls.waitUntilElementIsVisible("ctaDropdownsSvg", elementsTaskTypeMasterPage.ctaDropdownsSvg);
        controls.waitUntilElementIsVisible("ctaCompletionCheckboxes",
                elementsTaskTypeMasterPage.ctaCompletionCheckboxes);
        controls.waitUntilElementIsVisible("deleteCTAIcons", elementsTaskTypeMasterPage.deleteCtaIcons);
        controls.waitUntilElementIsVisible("addNewCTALabel", elementsTaskTypeMasterPage.addNewCtaLabel);
    }

    public void validateCreateCancelButtons() {
        controls.waitUntilElementIsVisible("createBtn", elementsTaskTypeMasterPage.createBtn);
        list.add(controls.getText("createBtn", elementsTaskTypeMasterPage.createBtn));
        controls.waitUntilElementIsVisible("cancelBtn", elementsTaskTypeMasterPage.cancelBtn);
        list.add(controls.getText("cancelBtn", elementsTaskTypeMasterPage.cancelBtn));
    }

    public Set<String> verifyUiElements() {
        validateTaskTypeNameField();
        validateTaskCreatorField();
        validateTaskFulfillerField();
        validateRegardingField();
        validateChannelField();
        validateOptionToDeferField();
        validateCheckboxes();
        validateCtaGrid();
        validateCreateCancelButtons();
        return list;
    }

    public Set<String> verifyStaticCta(String regarding, Set<String> combine)
            throws InterruptedException {
        list = new TreeSet<>();

        controls.click("regardingDropdownSvg", elementsTaskTypeMasterPage.regardingDropdownSvg);
        controls.waitUntilElementIsVisible("dropdownSendText", elementsTaskTypeMasterPage.dropdownSendText);
        controls.enterText("regardingDropdown", elementsTaskTypeMasterPage.dropdownSendText, regarding);
        controls.waitUntilElementIsVisible("selectDropdownSentText", elementsTaskTypeMasterPage.dropdownValues);
        controls.click(regarding, elementsTaskTypeMasterPage.dropdownValues);

        Thread.sleep(3000); //bug: static ctas take time to load.

        LinkedList<String> list2 = new LinkedList<String>(combine);
        controls.waitUntilElementIsVisible("ctaDropdown1", elementsTaskTypeMasterPage.dropdownSendText2);
        controls.enterText("ctaDropdown1", elementsTaskTypeMasterPage.dropdownSendText2,
                list2.get(list2.indexOf("Create Lead")));
        controls.waitUntilElementIsVisible("selectDropdownSentText", elementsTaskTypeMasterPage.dropdownValues);
        list.add(controls.getText("selectDropdownSentText", elementsTaskTypeMasterPage.dropdownValues));

        controls.enterText("ctaDropdown1", elementsTaskTypeMasterPage.dropdownSendText2,
                list2.get(list2.indexOf("Create CCM")));
        controls.waitUntilElementIsVisible("ctaDropdown1", elementsTaskTypeMasterPage.dropdownValues);
        list.add(controls.getText("ctaDropdown1", elementsTaskTypeMasterPage.dropdownValues));

        controls.enterText("ctaDropdown1", elementsTaskTypeMasterPage.dropdownSendText2,
                list2.get(list2.indexOf("Create Service Request")));
        controls.waitUntilElementIsVisible("ctaDropdown1", elementsTaskTypeMasterPage.dropdownValues);
        list.add(controls.getText("ctaDropdown1", elementsTaskTypeMasterPage.dropdownValues));

        controls.click("optionsToDeferDropdownSvg", elementsTaskTypeMasterPage.optionsToDeferDropdownSvg);
        controls.waitUntilElementIsVisible("optionsToDeferDropdown", elementsTaskTypeMasterPage.dropdownValues);
        list.addAll(util.getTextOfCommonXpath(controls, "optionsToDeferDropdown",
                elementsTaskTypeMasterPage.dropdownValues));

        return list;
    }

    public Set<String> validateReviewersDropdown() {
        list = new TreeSet<>();
        navigateToCreateTaskForm();
        controls.waitUntilElementIsVisible("reviewCheckbox", elementsTaskTypeMasterPage.reviewCheckbox);
        controls.click("reviewCheckbox", elementsTaskTypeMasterPage.reviewCheckbox);
        controls.waitUntilElementIsVisible("reviewerDropdownSvg", elementsTaskTypeMasterPage.reviewerDropdownSvg);
        controls.click("reviewerDropdownSvg", elementsTaskTypeMasterPage.reviewerDropdownSvg);
        list.addAll(util.getTextOfCommonXpath(controls, "dropdownValues",
                elementsTaskTypeMasterPage.dropdownValues));

        return list;
    }

    public void validateAdidField() {
        controls.waitUntilElementIsVisible("reviewerDropdown", elementsTaskTypeMasterPage.dropdownSendText4);
        controls.enterText("reviewerDropdown", elementsTaskTypeMasterPage.dropdownSendText4, "Central Team");
        controls.click("Central Team", elementsTaskTypeMasterPage.dropdownValues);
        controls.waitUntilElementIsVisible("adidLabel", elementsTaskTypeMasterPage.adidLabel);
        controls.waitUntilElementIsVisible("adidTextField", elementsTaskTypeMasterPage.adidTextField);
    }

    public Set<String> createTaskTypeMaster(String taskName,
                                            TreeMap<String, String> treeMap, String userName)
            throws InterruptedException {
        list = new TreeSet<>();
        navigateToCreateTaskForm();
        controls.enterText("taskTypeNameTextField", elementsTaskTypeMasterPage.taskTypeNameTextField, taskName);
        String[] array;

        //Task Creator Role multiselect from excel
        String taskCreatorRoleEnum = TaskTypeMasterEnum.TASK_CREATOR_ROLE.property;
        array = treeMap.get(taskCreatorRoleEnum).split(",");

        for (int i = 0; i < array.length; i++) {
            controls.click("taskCreatorRoleDropdown",
                    String.format(elementsTaskTypeMasterPage.dropdownDiv, taskCreatorRoleEnum
                            .replace("*", "")));
            controls.click(array[i],
                    String.format(elementsTaskTypeMasterPage.dropdownValue, array[i]));
        }

        String taskFulfillerRoleEnum = TaskTypeMasterEnum.TASK_FULFILLER_ROLE.property;
        array = treeMap.get(taskFulfillerRoleEnum).split(",");
        for (int i = 0; i < array.length; i++) {
            controls.click("taskFulfillerRoleDropdown",
                    String.format(elementsTaskTypeMasterPage.dropdownDiv, taskFulfillerRoleEnum
                            .replace("*", "")));
            controls.click(array[i],
                    String.format(elementsTaskTypeMasterPage.dropdownValue, array[i]));
        }

        //Regarding value from excel
        String regardingEnum = TaskTypeMasterEnum.REGARDING.property;
        controls.click("regardingDropdown",
                String.format(elementsTaskTypeMasterPage.dropdownDiv, regardingEnum
                        .replace("*", "")));
        controls.click(treeMap.get(regardingEnum),
                String.format(elementsTaskTypeMasterPage.dropdownValue,
                        treeMap.get(regardingEnum)));

        //Channel multiselect from excel
        String channelEnum = TaskTypeMasterEnum.CHANNEL.property;
        array = treeMap.get(channelEnum).split(",");
        for (int i = 0; i < array.length; i++) {
            controls.click("channelDropdown",
                    String.format(elementsTaskTypeMasterPage.dropdownDiv, channelEnum
                            .replace("*", "")));
            controls.click(array[i],
                    String.format(elementsTaskTypeMasterPage.dropdownValue, array[i]));
        }

        //Options To defer value from excel
        String optionToDeferEnum = TaskTypeMasterEnum.OPTION_TO_DEFER.property;
        controls.click("optionsToDeferDropdown",
                String.format(elementsTaskTypeMasterPage.dropdownDiv, optionToDeferEnum
                        .replace("*", "")));
        controls.click(treeMap.get(optionToDeferEnum),
                String.format(elementsTaskTypeMasterPage.dropdownValue,
                        treeMap.get(optionToDeferEnum)));

        //Self Assign, Check In & review checkbox from excel
        if (treeMap.get(TaskTypeMasterEnum.SELF_ASSIGN_CHECKBOX.property).equalsIgnoreCase("y")) {
            controls.click("selfAssignCheckbox", elementsTaskTypeMasterPage.selfAssignCheckbox);
        }
        if (treeMap.get(TaskTypeMasterEnum.CHECK_IN_CHECKBOX.property).equalsIgnoreCase("y")) {
            controls.click("checkInCheckbox", elementsTaskTypeMasterPage.checkInCheckbox);
        }
        if (treeMap.get(TaskTypeMasterEnum.REVIEW_CHECKBOX.property).equalsIgnoreCase("y")) {
            controls.click("reviewCheckbox", elementsTaskTypeMasterPage.reviewCheckbox);

            String reviewerEnum = TaskTypeMasterEnum.REVIEWER.property;
            controls.click("reviewerDropdownDiv",
                    String.format(elementsTaskTypeMasterPage.dropdownDiv, reviewerEnum
                            .replace("*", "")));
            controls.click(treeMap.get(reviewerEnum),
                    String.format(elementsTaskTypeMasterPage.dropdownValue,
                            treeMap.get(reviewerEnum)));

            if (treeMap.get(TaskTypeMasterEnum.REVIEWER.property).equalsIgnoreCase("Central Team")) {
                controls.enterText("adidTextField", elementsTaskTypeMasterPage.adidTextField,
                        treeMap.get(TaskTypeMasterEnum.ADID.property));
            }
        }

        Thread.sleep(3000); //bug: static ctas take time to load.

        controls.click("addNewCtaLabel", elementsTaskTypeMasterPage.addNewCtaLabel);
        List svgList = controls.getWebElementsList("ctaDropdownsSvg", elementsTaskTypeMasterPage.ctaDropdownsSvg);
        array = treeMap.get(TaskTypeMasterEnum.CTA.property).split(",");

        for (int i = 0; i < svgList.size(); i++) {
            int value = i + 1;
            controls.enterText("ctaDropdown" + value,
                    elementsTaskTypeMasterPage.dropdownSendText2.replace("anc4rl'])[1]",
                            "anc4rl'])[" + value + "]"), array[i]);
            controls.click(array[i], String.format(elementsTaskTypeMasterPage.dropdownValue, array[i]));
        }

        ((WebElement) controls.getWebElementsList("ctaCompletionCheckboxes",
                elementsTaskTypeMasterPage.ctaCompletionCheckboxes).get(0)).click();

        controls.clickUsingActionBuilder("createBtn", elementsTaskTypeMasterPage.createBtn);
        controls.waitUntilElementIsVisible("successValidation", elementsTaskTypeMasterPage.successValidation);
        list.add(controls.getText("successValidation", elementsTaskTypeMasterPage.successValidation));
        controls.click("userLogout", String.format(elementsTaskTypeMasterPage.userLogout, userName));
        controls.click("logoutBtn", elementsTaskTypeMasterPage.logoutBtn);
        return list;
    }

    public void navigateToApproveTaskType() {
        if (controls.waitUntilElementIsVisible("Admin Console", elementsTaskTypeMasterPage.adminConsoleBtn)) {
            controls.click("adminConsoleBtn", elementsTaskTypeMasterPage.adminConsoleBtn);
        }
        if (controls.waitUntilElementIsVisible("taskTypeMasterTab", elementsTaskTypeMasterPage.taskTypeMasterTab)) {
            controls.clickUsingJavaScriptExecutor("taskTypeMasterTab",
                    elementsTaskTypeMasterPage.taskTypeMasterTab);
        }
        if (controls.waitUntilElementIsVisible("approveTaskTypeTab",
                elementsTaskTypeMasterPage.approveTaskTypeTab)) {
            controls.clickUsingJavaScriptExecutor("approveTaskTypeTab",
                    elementsTaskTypeMasterPage.approveTaskTypeTab);
        }
    }

    public Set<String> validateMakerCheckerFlow(String taskName) throws InterruptedException {
        navigateToApproveTaskType();
        list = new TreeSet<>();
        controls.waitUntilElementIsVisible("taskTypeName", elementsTaskTypeMasterPage.taskTypeName
                .replaceAll("Test Sample oDy", taskName));
        controls.click("taskTypeCheckbox", elementsTaskTypeMasterPage.taskTypeCheckbox
                .replaceAll("Test Sample oDy", taskName));
        controls.clickUsingJavaScriptExecutor("approveBtn", elementsTaskTypeMasterPage.approveBtn);

        controls.waitUntilElementIsVisible("closeBtn", elementsTaskTypeMasterPage.closeBtn);
        controls.clickUsingJavaScriptExecutor("closeBtn", elementsTaskTypeMasterPage.closeBtn);

        controls.waitUntilElementIsVisible("taskTypeTab", elementsTaskTypeMasterPage.taskTypeTab);
        controls.clickUsingJavaScriptExecutor("taskTypeTab", elementsTaskTypeMasterPage.taskTypeTab);

        Reporting.getLogger().log(LogStatus.FAIL,"Additional wait of 40 seconds for tab load");
        Thread.sleep(40000);
        controls.waitUntilElementIsVisible("taskTypeName", elementsTaskTypeMasterPage.taskTypeName);
        list.add(controls.getText("taskTypeName", elementsTaskTypeMasterPage.taskTypeName
                .replaceAll("Test Sample oDy", taskName)));

        return list;
    }
}
