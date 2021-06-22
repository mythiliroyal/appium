package com.yesgenie.pageobjects.taskdashboard;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import com.google.inject.Inject;
import com.xassure.framework.annotations.Web;
import com.xassure.framework.driver.Controls;
import com.xassure.reporting.testCaseDetails.TestCaseData;
import com.yesgenie.pageobjects.IPage;
import com.yesgenie.pageobjects.enums.TaskDashboardEnum;
import com.yesgenie.util.UtilityMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import io.appium.java_client.AppiumDriver;

public class TaskDashboardPage implements IPage {

    @Inject
    ElementsTaskDashboard elementsTaskDashboard;

    @Inject
    TestCaseData testCaseData;

    @Inject
    UtilityMethods util;

    Controls controls;

    @Inject
    public TaskDashboardPage(@Web Controls controls) {
        this.controls = controls;
    }

    Set<String> list = new TreeSet<>();

    public void clickTaskDashboardImg() {
        controls.waitUntilElementIsVisible("taskDashboardImg", elementsTaskDashboard.taskDashboardImg);
        controls.click("taskDashboardImg", elementsTaskDashboard.taskDashboardImg);
    }

    public Set<String> validateDefaultFilter() throws InterruptedException {
        clickTaskDashboardImg();
        Thread.sleep(3000);
        clickTaskDashboardImg();
        controls.waitUntilElementIsVisible("defaultFilterValue", elementsTaskDashboard.defaultFilterValue);
        list.add(controls.getText("defaultFilterValue", elementsTaskDashboard.defaultFilterValue));

        return list;
    }

    public void clickTaskDropdownFilterSvg() {
        controls.waitUntilElementIsVisible("taskDropdownFilterSvg", elementsTaskDashboard.dropdownSvg);
        controls.click("taskDropdownFilterSvg", elementsTaskDashboard.dropdownSvg);
    }

    public List getTaskDropdownFilterValues() {
        return controls.getWebElementsList("taskDropdownValues", elementsTaskDashboard.taskDropdownFilterValues);
    }

    public void selectDropdownFilterValue(String enums) {
        clickTaskDropdownFilterSvg();
        List elements = getTaskDropdownFilterValues();
        for (int j = 0; j < elements.size(); j++) {
            if (((WebElement) elements.get(j)).getText().toLowerCase().contains(enums.toLowerCase())) {
                ((WebElement) elements.get(j)).click();
                break;
            }
        }
    }

    public Set<String> validateAssignedToMeColumns() {
        list = new TreeSet<>();
        controls.waitUntilElementIsVisible("defaultColumns", elementsTaskDashboard.defaultColumns);
        list.addAll(controls.getTextFromWebElementList("defaultColumns",
                elementsTaskDashboard.defaultColumns));
        controls.click("firstRowClick", elementsTaskDashboard.firstRowClick);
        controls.waitUntilElementIsVisible("expandedRowColumns",
                elementsTaskDashboard.expandedRowColumns);
        list.addAll(controls.getTextFromWebElementList("expandedRowColumns",
                elementsTaskDashboard.expandedRowColumns));

        return list;
    }

    public void selectCreatedByMeFilter() {
        selectDropdownFilterValue(TaskDashboardEnum.CREATED_BY_ME.property);
    }

    public Set<String> validateCreatedByMeColumns() {
        list = new TreeSet<>();
        if (testCaseData.getPlatform().equalsIgnoreCase("web")) {
            clickTaskDashboardImg();
            selectCreatedByMeFilter();
        }
        controls.waitUntilElementIsVisible("defaultColumns", elementsTaskDashboard.defaultColumns);
        list.addAll(controls.getTextFromWebElementList("defaultColumns",
                elementsTaskDashboard.defaultColumns));
        controls.click("firstRowClick", elementsTaskDashboard.firstRowClick);
        controls.waitUntilElementIsVisible("expandedRowColumns", elementsTaskDashboard.expandedRowColumns);
        list.addAll(controls.getTextFromWebElementList("expandedRowColumns",
                elementsTaskDashboard.expandedRowColumns));

        return list;
    }

    public Set<String> validateCreatedByColmValue() {
        list = new TreeSet<>();
        controls.waitUntilElementIsVisible("createdByValues", elementsTaskDashboard.createdByValues);
        for (String value : controls.getTextFromWebElementList(
                "createdByValues", elementsTaskDashboard.createdByValues)) {
            list.add(value);
        }
        return list;
    }

    public void validateSearchElements() throws InterruptedException {
        clickTaskDashboardImg();
        controls.waitUntilElementIsVisible("searchInput", elementsTaskDashboard.searchInput);
        controls.waitUntilElementIsVisible("searchIcon", elementsTaskDashboard.searchIcon);
        controls.waitUntilElementIsVisible("searchDeleteIcon", elementsTaskDashboard.searchDeleteIcon);
        controls.waitUntilElementIsVisible("searchInfoText", elementsTaskDashboard.searchInfoText);
    }

    public Set<String> validateSearchFunctionality(TreeMap<String, String> treeMap) throws InterruptedException {
        validateSearchElements();
        list = new TreeSet<>();

        //search by taskid
        controls.enterText("searchInput", elementsTaskDashboard.searchInput,
                treeMap.get(TaskDashboardEnum.TASK_ID.property));
        controls.click("searchIcon", elementsTaskDashboard.searchIcon);
        list.addAll(controls.getTextFromWebElementList("taskIdResults", elementsTaskDashboard.taskIdResults));

        //search by subject
        controls.enterText("searchInput", elementsTaskDashboard.searchInput,
                treeMap.get(TaskDashboardEnum.SUBJECT.property));
        controls.click("searchIcon", elementsTaskDashboard.searchIcon);
        list.addAll(controls.getTextFromWebElementList("subjectResults", elementsTaskDashboard.subjectResults));

        //search by task description
        controls.enterText("searchInput", elementsTaskDashboard.searchInput,
                treeMap.get(TaskDashboardEnum.TASK_DESCRIPTION.property));
        controls.click("searchIcon", elementsTaskDashboard.searchIcon);
        controls.waitUntilElementToBeClickable("firstRowClick", elementsTaskDashboard.firstRowClick);
        controls.click("firstRowClick", elementsTaskDashboard.firstRowClick);
        list.addAll(controls.getTextFromWebElementList("taskDescResults",
                elementsTaskDashboard.taskDescResults));

        //search by task type
        controls.enterText("searchInput", elementsTaskDashboard.searchInput,
                treeMap.get(TaskDashboardEnum.TASK_TYPE.property));
        controls.click("searchIcon", elementsTaskDashboard.searchIcon);
        list.addAll(controls.getTextFromWebElementList("taskTypeResults",
                elementsTaskDashboard.taskTypeResults));

        return list;
    }

    public void selectCreatedByMyTeamFilter() {
        selectDropdownFilterValue(TaskDashboardEnum.CREATED_BY_MY_TEAM.property);
    }

    public Set<String> validateCreatedByMyTeamColumns() throws InterruptedException{
        list = new TreeSet<>();
        clickTaskDashboardImg();
        Thread.sleep(3000);
        clickTaskDashboardImg();

        selectCreatedByMyTeamFilter();
        controls.waitUntilElementIsVisible("defaultColumns2", elementsTaskDashboard.defaultColumns2);
        list.addAll(controls.getTextFromWebElementList("defaultColumns2",
                elementsTaskDashboard.defaultColumns2));

        if (testCaseData.getPlatform().equalsIgnoreCase("mobile")) {

            Dimension size = controls.getDriver().manage().window().getSize();
            controls.scroll((int) (size.getWidth() * 0.8), (int) (size.getHeight() * 0.6),
                    (int) (size.getWidth() * 0.3), (int) (size.getHeight() * 0.6));

            list.addAll(controls.getTextFromWebElementList("defaultColumns3",
                    elementsTaskDashboard.defaultColumns3));

            controls.scroll((int) (size.getWidth() * 0.5), (int) (size.getHeight() * 0.6),
                    (int) (size.getWidth() * 0.9), (int) (size.getHeight() * 0.6));

        }
        return list;
    }

    public Set<String> validateViewListLink(String userName) {
        list = new TreeSet<>();
        controls.waitUntilElementIsVisible("viewListLink",
                String.format(elementsTaskDashboard.viewListUserLink, userName));
        controls.click("viewListLink",
                String.format(elementsTaskDashboard.viewListUserLink, userName));
        if (controls.getText("selectedFilterValue", elementsTaskDashboard.selectedFilterValue)
                .equals("Created by my team")) {
            list.addAll(validateCreatedByColmValue());
        }
        return list;
    }

    public Set<String> validateBackClickInViewList(String userName) throws InterruptedException {
        list = new TreeSet<>();

        controls.waitUntilElementIsVisible("viewListBackImg",
                String.format(elementsTaskDashboard.viewListBackImg, userName));
        controls.click("viewListBackImg",
                String.format(elementsTaskDashboard.viewListBackImg, userName));
        if (controls.getText("selectedFilterValue", elementsTaskDashboard.selectedFilterValue)
                .equals("Created by my team")) {
            return validateCreatedByMyTeamColumns();
        }
        if (controls.getText("selectedFilterValue", elementsTaskDashboard.selectedFilterValue)
                .equals("Assigned to my team")) {
            return validateAssignedToMyTeamColumns();
        }
        return list;
    }


    public Set<String> validateDisabledViewList() throws InterruptedException {
        selectCreatedByMyTeamFilter();
        int noOfRows = controls.getTextFromWebElementList("noOfRows",
                elementsTaskDashboard.noOfRows).size();
        int value = 0;
        for (int i = 0; i < noOfRows; i++) {
            value = i + 1;
            try {
                System.out.println(controls.getDriver().findElement(By.xpath(elementsTaskDashboard.viewListLinks
                        .replace("/div[3]/div", "/div[" + value + "]/div").split("~")[1])).getCssValue("color"));
//                controls.click("viewListLinks",
//                        elementsTaskDashboard.viewListLinks
//                                .replace("/div[3]/div", "/div[" + value + "]/div"));
//                if (controls.waitUntilElementIsVisible("defaultColumns",
//                        elementsTaskDashboard.defaultColumns)) {
//                    controls.click("viewListBackImg", elementsTaskDashboard.viewListBackImg);
//                }

            } catch (ElementNotInteractableException | TimeoutException e) {
                System.out.println("exception-->" + list);
                list = new TreeSet<>();
                list.add("View List disabled");
                return list;
            }
        }

//        try {
//            int noOfRows = controls.getTextFromWebElementList( "noOfRows", elementsTaskDashboard.noOfRows).size();
//            int value = 0;
//            for (int j = 0; j < noOfRows; j++) {
//                value = j + 1;
//                list = controls.getTextFromWebElementList( "rowData",
//                        elementsTaskDashboard.rowData
//                                .replace("/div[1]/span", "/div[" + value + "]/span"));
//                /*to be deleted */
//                System.out.println(list +" "+ list.size());
//                if (list.size() == 1 ) {
//                    controls.click("viewListLinks",
//                            elementsTaskDashboard.viewListLinks
//                                    .replace("/div[3]/div","/div["+value+"]/div"));
//                }
//            }
//        } catch (ElementNotInteractableException | TimeoutException e) {
//            System.out.println("exception-->"+list);
//            list = new TreeSet<>();
//            list.add("View List disabled");
//            return list;
//        }
//        System.out.println("outer-->"+list);
//
        return list;
    }

    public Set<String> validateColumnCount() {

        Set<String> validatedList = new TreeSet<>();
        List<WebElement> resultslist;
        int resultsSum = 0;
        int value = 0;
        List<WebElement> headerList = controls.getDriver().findElements(
                By.xpath(elementsTaskDashboard.headersCount.split("~")[1]));

        for (int j = 0; j < headerList.size(); j++) {
            value = j + 2;
            resultslist = controls.getDriver().findElements(By.xpath(elementsTaskDashboard.resultsCount
                    .split("~")[1].replace("div/span[2]",
                    "div/span[" + value + "]")));

            for (int i = 0; i < resultslist.size(); i++) {
                if (!(resultslist.get(i).getText().equals("-"))) {
                    resultsSum += Integer.parseInt(resultslist.get(i).getText().trim());
                }
            }
            if (resultsSum == Integer.parseInt(headerList.get(j).getText())) {
                validatedList.add("true");
                resultsSum = 0;
            } else {
                validatedList.add("false");
                break;
            }
        }
        return validatedList;
    }

    public void selectAssignedByMyTeamFilter() {
        selectDropdownFilterValue(TaskDashboardEnum.ASSIGNED_TO_MY_TEAM.property);
    }

    public Set<String> validateAssignedToMyTeamColumns() throws InterruptedException {
        list = new TreeSet<>();
        clickTaskDashboardImg();
        Thread.sleep(3000);
        clickTaskDashboardImg();

        selectAssignedByMyTeamFilter();
        controls.waitUntilElementIsVisible("defaultColumns2", elementsTaskDashboard.defaultColumns2);
        list.addAll(controls.getTextFromWebElementList("defaultColumns2",
                elementsTaskDashboard.defaultColumns2));

        if (testCaseData.getPlatform().equalsIgnoreCase("mobile")) {

            Dimension size = controls.getDriver().manage().window().getSize();
            controls.scroll((int) (size.getWidth() * 0.8), (int) (size.getHeight() * 0.6),
                    (int) (size.getWidth() * 0.3), (int) (size.getHeight() * 0.6));

            list.addAll(controls.getTextFromWebElementList("defaultColumns3",
                    elementsTaskDashboard.defaultColumns3));

            controls.scroll((int) (size.getWidth() * 0.5), (int) (size.getHeight() * 0.6),
                    (int) (size.getWidth() * 0.9), (int) (size.getHeight() * 0.6));

        }
        return list;
    }


    public void validateDashboardFilterElements() {
        controls.waitUntilElementIsVisible("dashboardFilterImg", elementsTaskDashboard.dashboardFilterImg);
        controls.click("dashboardFilterImg", elementsTaskDashboard.dashboardFilterImg);
        controls.waitUntilElementIsVisible("filterImg", elementsTaskDashboard.filterImg);

        controls.waitUntilElementIsVisible("resetFilterLink", elementsTaskDashboard.resetFilterLink);
        controls.waitUntilElementIsVisible("taskType", elementsTaskDashboard.taskType);

        controls.waitUntilElementIsVisible("lowPriorityCheckbox",
                String.format(elementsTaskDashboard.priorityCheckboxes, "Low"));
        controls.waitUntilElementIsVisible("normalPriorityCheckbox",
                String.format(elementsTaskDashboard.priorityCheckboxes, "Normal"));
        controls.waitUntilElementIsVisible("highPriorityCheckbox",
                String.format(elementsTaskDashboard.priorityCheckboxes, "High"));

        controls.waitUntilElementIsVisible("openStatusCheckbox",
                String.format(elementsTaskDashboard.statusCheckboxes, "Open"));
        controls.waitUntilElementIsVisible("deferredStatusCheckbox",
                String.format(elementsTaskDashboard.statusCheckboxes, "Deferred"));
        controls.waitUntilElementIsVisible("completedStatusCheckbox",
                String.format(elementsTaskDashboard.statusCheckboxes, "Completed"));
        controls.waitUntilElementIsVisible("underReviewStatusCheckbox",
                String.format(elementsTaskDashboard.statusCheckboxes, "Under review"));
        controls.waitUntilElementIsVisible("returnStatusCheckbox",
                String.format(elementsTaskDashboard.statusCheckboxes, "Return"));

        controls.waitUntilElementIsVisible("createdOnFrom", elementsTaskDashboard.createdOnFrom);
        controls.waitUntilElementIsVisible("createdOnTo", elementsTaskDashboard.createdOnTo);
        controls.waitUntilElementIsVisible("createdOnClear", elementsTaskDashboard.createdOnClear);
//        controls.waitUntilElementIsVisible("startDateFrom", elementsTaskDashboard.startDateFrom);     absent on UAt due to old code base
//        controls.waitUntilElementIsVisible("startDateTo", elementsTaskDashboard.startDateTo);
//        controls.waitUntilElementIsVisible("startDateClear", elementsTaskDashboard.startDateClear);
        controls.waitUntilElementIsVisible("dueOnFrom", elementsTaskDashboard.dueOnFrom);
        controls.waitUntilElementIsVisible("dueOnTo", elementsTaskDashboard.dueOnTo);
        controls.waitUntilElementIsVisible("dueOnClear", elementsTaskDashboard.dueOnClear);
        controls.waitUntilElementIsVisible("expiryDateFrom", elementsTaskDashboard.expiryDateFrom);
        controls.waitUntilElementIsVisible("expiryDateTo", elementsTaskDashboard.expiryDateTo);
        controls.waitUntilElementIsVisible("expiryDateClear", elementsTaskDashboard.expiryDateClear);
        controls.waitUntilElementIsVisible("assignedBy", elementsTaskDashboard.assignedBy);
        controls.waitUntilElementIsVisible("applyBtn", elementsTaskDashboard.applyBtn);
        controls.waitUntilElementIsVisible("cancelBtn", elementsTaskDashboard.cancelBtn);

    }

    public void selectFilterValues(TreeMap<String, String> treeMap) {

        //Select Task Type
        controls.waitUntilElementIsVisible("taskType", elementsTaskDashboard.taskType);
        controls.click("taskType", elementsTaskDashboard.taskType);
        controls.click("taskTypeValue",
                String.format(elementsTaskDashboard.taskTypeValue,
                        treeMap.get(TaskDashboardEnum.TASK_TYPE.property)));
        controls.click("taskTypeSpan", elementsTaskDashboard.taskTypeSpan);

        //Select priority checkbox from excel
        if (treeMap.get(TaskDashboardEnum.PRIORITY.property).equalsIgnoreCase("low")) {
            controls.click("lowPriorityCheckbox",
                    String.format(elementsTaskDashboard.priorityCheckboxes,
                            treeMap.get(TaskDashboardEnum.PRIORITY.property)));
        } else if (treeMap.get(TaskDashboardEnum.PRIORITY.property).equalsIgnoreCase("normal")) {
            controls.click("normalPriorityCheckbox",
                    String.format(elementsTaskDashboard.priorityCheckboxes,
                            treeMap.get(TaskDashboardEnum.PRIORITY.property)));
        } else if (treeMap.get(TaskDashboardEnum.PRIORITY.property).equalsIgnoreCase("high")) {
            controls.click("highPriorityCheckbox",
                    String.format(elementsTaskDashboard.priorityCheckboxes,
                            treeMap.get(TaskDashboardEnum.PRIORITY.property)));
        }

        //Select status checkbox from excel
        if (treeMap.get(TaskDashboardEnum.STATUS.property).equalsIgnoreCase("open")) {
            controls.click("openStatusCheckbox",
                    String.format(elementsTaskDashboard.statusCheckboxes,
                            treeMap.get(TaskDashboardEnum.STATUS.property)));
        } else if (treeMap.get(TaskDashboardEnum.STATUS.property).equalsIgnoreCase("Deferred")) {
            controls.click("deferredStatusCheckbox",
                    String.format(elementsTaskDashboard.statusCheckboxes,
                            treeMap.get(TaskDashboardEnum.STATUS.property)));
        } else if (treeMap.get(TaskDashboardEnum.STATUS.property).equalsIgnoreCase("completed")) {
            controls.click("completedStatusCheckbox",
                    String.format(elementsTaskDashboard.statusCheckboxes,
                            treeMap.get(TaskDashboardEnum.STATUS.property)));
        } else if (treeMap.get(TaskDashboardEnum.STATUS.property).equalsIgnoreCase("under review")) {
            controls.click("underReviewStatusCheckbox",
                    String.format(elementsTaskDashboard.statusCheckboxes,
                            treeMap.get(TaskDashboardEnum.STATUS.property)));
        } else if (treeMap.get(TaskDashboardEnum.STATUS.property).equalsIgnoreCase("return")) {
            controls.click("returnStatusCheckbox",
                    String.format(elementsTaskDashboard.statusCheckboxes,
                            treeMap.get(TaskDashboardEnum.STATUS.property)));
        }

        controls.enterText("createdOnFrom", elementsTaskDashboard.createdOnFrom,
                treeMap.get(TaskDashboardEnum.CREATED_ON_FROM.property));
        controls.enterText("createdOnTo", elementsTaskDashboard.createdOnTo,
                treeMap.get(TaskDashboardEnum.CREATED_ON_TO.property));
//        controls.enterText("startDateFrom", elementsTaskDashboard.startDateFrom,    Fields absent on UAT due to old code base
//                treeMap.get(TaskDashboardEnum.START_DATE_FROM.property));
//        controls.enterText("startDateTo", elementsTaskDashboard.startDateTo,
//                treeMap.get(TaskDashboardEnum.START_DATE_TO.property));
        controls.enterText("dueOnFrom", elementsTaskDashboard.dueOnFrom,
                treeMap.get(TaskDashboardEnum.DUE_DATE_FROM.property));
        controls.enterText("dueOnTo", elementsTaskDashboard.dueOnTo,
                treeMap.get(TaskDashboardEnum.DUE_DATE_TO.property));
        controls.enterText("expiryDateFrom", elementsTaskDashboard.expiryDateFrom,
                treeMap.get(TaskDashboardEnum.EXPIRY_DATE_FROM.property));
        controls.enterText("expiryDateTo", elementsTaskDashboard.expiryDateTo,
                treeMap.get(TaskDashboardEnum.EXPIRY_DATE_TO.property));

        controls.click("assignedBy", elementsTaskDashboard.assignedBy);
        controls.click("assignedByValue",
                String.format(elementsTaskDashboard.assignedByValue,
                        treeMap.get(TaskDashboardEnum.ASSIGNED_BY.property)));
        controls.click("assignedBySpan", elementsTaskDashboard.assignedBySpan);

        controls.clickUsingActionBuilder("applyBtn", elementsTaskDashboard.applyBtn);

    }

    public Set<String> validateDashboardFilterFunctionality(TreeMap<String, String> treeMap)
            throws InterruptedException {
        clickTaskDashboardImg();
        Thread.sleep(3000);
        clickTaskDashboardImg();
        validateDashboardFilterElements();
        selectFilterValues(treeMap);
        list = new TreeSet<>();
        int size = controls.getTextFromWebElementList("assignedToMeResultRows",
                elementsTaskDashboard.assignedToMeResultRows).size();
        int value = 0;
        for (int i = 0; i < size; i++) {
            value = i + 1;
            Set<String> list2 = util.getTextOfCommonXpath(controls, "assignedToMeResultRow",
                    elementsTaskDashboard.assignedToMeResultRow
                            .replace("/div[1]/span", "/div[" + value + "]/span"));
            for (String result : list2) {
                if (!(result.equalsIgnoreCase("-"))) {
                    list.add(result);
                }
            }
        }
        return list;
    }

    public Set<String> validateDashboardColumnSorting() throws InterruptedException {
        Set<String> booleanValue = new TreeSet<>();

        int size = controls.getTextFromWebElementList("defaultColumns3",
                elementsTaskDashboard.defaultColumns3).size();
        int value = 0;
        for (int i = 0; i < size; i++) {
            value = i + 1;
            list = new LinkedHashSet<>();
            if (value != 8) {
                controls.click("headerColumn " + value + "", elementsTaskDashboard.defaultColumn
                        .replace("/span[1]", "/span[" + value + "]"));
                list.addAll(controls.getTextFromWebElementList("columnResults",
                        elementsTaskDashboard.columnResults
                                .replace("/span[1]", "/span[" + value + "]")));
                booleanValue.add(String.valueOf(util.verifyAscendingSorting(list)));
            }
        }
        return booleanValue;
    }
}