package com.yesgenie.pageobjects.taskdashboard;

public class ElementsMobileTaskDashboard extends ElementsTaskDashboard {


    //home page locators
    public String taskDashboardTab = "accessibilityId~testID_TabsView_TabLabel_TASK";



    public String menuOpenIcon = "xpath~//android.view.ViewGroup"
            + "[@content-desc=\"testID_HamBurgerIcon_TouchableOpacity\"]/android.view.ViewGroup";

    public String homeIcon = "xpath~//android.view.ViewGroup[@content-desc=\"testID_HomeIcon_TouchableOpacity\"]"
            + "/android.view.ViewGroup";


    public String notificationIcon = "xpath~//android.view.ViewGroup"
            + "[@content-desc=\"testID_NotificationIcon_TouchableOpacity\"]/android.view.ViewGroup";

    public String globalSearchInput = "xpath~/hierarchy/android.widget.FrameLayout"
            + "/android.widget.LinearLayout/android.widget.FrameLayout"
            + "/android.widget.LinearLayout/android.widget.FrameLayout"
            + "/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup"
            + "/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup"
            + "/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]"
            + "/android.view.ViewGroup[1]/android.widget.TextView";

    public String globalSearchIcon = "xpath~/hierarchy/android.widget.FrameLayout"
            + "/android.widget.LinearLayout/android.widget.FrameLayout"
            + "/android.widget.LinearLayout/android.widget.FrameLayout"
            + "/android.widget.FrameLayout/android.view.ViewGroup"
            + "/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup"
            + "/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup"
            + "/android.view.ViewGroup[3]/android.view.ViewGroup[1]/android.view.ViewGroup";

    //dashboard locators
    public String defaultFilterValue = "accessibilityId~testID_Filter_Dropdown_Value";

    public String taskDropdownFilterSvg = "xpath~//android.view.ViewGroup[@content-desc=\"testID_Filter_Dropdown_Icon\"]";

    public String taskDropdownFilterValues = "xpath~//android.widget.TextView"
            + "[contains(@content-desc,\"testID_Filter_Item\")]";

    public String taskByStatusLabel = "accessibilityId~testID_TaskDashbaord_chartTitle";

    public String taskTotalLabel = "accessibilityId~testID_TaskDashbaord_totalHeading";

    public String taskVerticalLabel = "xpath~//android.view.ViewGroup[@content-desc=\"testID_StackedBarGraph\"]"
            + "/android.view.ViewGroup[1]/android.webkit.WebView"
            + "/android.webkit.WebView/android.view.View[1]/android.view.View"
            + "/android.widget.Image[2]/android.view.View/android.view.View";

    public String graphElements = "xpath~//android.view.ViewGroup[@content-desc=\"testID_StackedBarGraph\"]"
            + "/android.view.ViewGroup[1]"
            + "/android.webkit.WebView/android.webkit.WebView/android.view.View[1]"
            + "/android.view.View/android.widget.Image[1]/*";

    public String xaxisElementsLabel = "xpath~//android.view.ViewGroup"
            + "[contains(@content-desc,\"testID_LegendSingle_\")]/android.widget.TextView";

    public String xaxisFooterMessage = "xpath~//android.view.ViewGroup"
            + "[@content-desc=\"testID_StackedBarGraph\"]/android.view.ViewGroup[4]/android.widget.TextView";

    public String keyInsightsLabel = "xpath~(//android.view.ViewGroup"
            + "[@content-desc=\"testID_ShimmerView\"])[3]/android.widget.TextView";

    public String insightsFirstRowLabel= "accessibilityId~testID_KeyInsightsWidget_Total_Tasks_TrendLabel";

    public String insightsSecondRowLabel = "accessibilityId~testID_KeyInsightsWidget_Tasks_TrendLabel";

    public String tasksCalendarLabel = "accessibilityId~testID_TaskDashbaord_TasksCalendarTitle";

    public String calenderValuesLabel = "xpath~//android.view.ViewGroup"
            + "[@content-desc=\"testID_TaskDashbaord_TasksCalendarView\"]";

    public String taskRecords = "xpath~//android.view.ViewGroup[@content-desc=\"testID_TaskDashbaord_DateData\"]"
            + "//android.widget.TextView[not(contains(@content-desc,'count'))]";

    public String taskFirstRecordLabel = "xpath~//android.view.ViewGroup"
            + "[@content-desc=\"testID_TaskDashbaord_DateData\"]/android.view.ViewGroup[1]"
            + "/android.view.ViewGroup[1]/android.widget.TextView";

    public String createTaskIcon = "xpath~//android.view.ViewGroup"
            + "[@content-desc=\"Floating Action Button\"]";

    //task records locators
    public String inTimeTab = "accessibilityId~testID_TabsView_Text_In_Time";

    public String firstExpandListIcon = "xpath~"
            + "//android.view.ViewGroup[@content-desc=\"testID_TaskList_ExpandIcon\"]";

    public String firstCollapseListIcon = "xpath~"
            + "//android.view.ViewGroup[@content-desc=\"testID_TaskList_CollapseIcon\"]";

    public String firstCollapsedList = "xpath~(//android.view.ViewGroup"
            + "[@content-desc=\"testID_TaskList_renderTaskList_Main\"])[1]"
            + "/android.view.ViewGroup/android.widget.TextView[contains(@content-desc,'Text') and position()<5]";

    public String firstExpandedList = "xpath~//android.view.ViewGroup"
            + "[@content-desc=\"testID_TaskList_ExtendedView\"]/android.view.ViewGroup"
            + "/android.widget.TextView[contains(@content-desc,'label')]";

    public String noOfRecords = "xpath~//android.widget.ScrollView[@content-desc=\"testID_TaskList_FlatList\"]"
            + "/android.view.ViewGroup/android.view.ViewGroup";

    public String allTabText = "accessibilityId~testID_TabsView_TabLabel_All";
    public String searchTaskInput = "accessibilityId~testID_TaskPage_Search_Input";
    public String searchTaskIcon = "accessibilityId~testID_TaskPage_Search_SEARCH_ICON";
    public String deleteSearchIcon = "accessibilityId~testID_TaskPage_Search_CROSS_ICON";
    public String firstTaskIdResult = "accessibilityId~testID_ProspectListLabelView_Task_ID_OnPress_hyperLink";
    public String firstSubjectResult = "accessibilityId~testID_ProspectListLabelView_Subject_OnPress_hyperLink";
    public String firstTaskDescResult = "accessibilityId~testID_TextReadMore_Text";
    public String firstTasksResult = "xpath~(//android.widget.TextView"
            + "[@content-desc=\"testID_TaskList_Tasks_Value\"])[1]";
    public String firstPriorityResult = "xpath~(//android.widget.TextView"
            + "[@content-desc=\"testID_TaskList_Priority_Value\"])[1]";
    public String firstDueDateResult = "xpath~(//android.widget.TextView"
            + "[@content-desc=\"testID_TaskList_Due_Value\"])[1]";
    public String firstStatusResult = "xpath~(//android.widget.TextView"
            + "[@content-desc=\"testID_TaskList_Status_Value\"])[1]";


    public String viewSnapIcon = "xpath~//android.view.ViewGroup"
            + "[@content-desc=\"testID_ProspectButton_View\"]/android.view.ViewGroup";

//    public String viewMoreChannelsOnSnap = "xpath~(//android.view.ViewGroup[@content-desc=\"testID_S\"])[2]"
//            + "/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[2]"
//            + "/android.view.ViewGroup/android.widget.TextView";

    public String backBtn = "accessibilityId~Back";


    //filter fields
    public String dashboardFilterImg = "accessibilityId~testID_TaskPage_filter_FILTER_ICON";
    public String filterImg = "accessibilityId~testID_TextLabel_Filters_Text";
    public String resetFilterLink = "accessibilityId~testID_TextLabel_Reset_Filters_Text";

    public String taskLabel = "xpath~//android.view.ViewGroup[@content-desc=\"testID_ModalSelect_Tasks_onPress\"]"
            + "/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup";
    public String taskSpan = "xpath~//android.view.ViewGroup[@content-desc=\"testID_ModalSelect_Tasks_onPress\"]"
            + "/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup";
    public String taskValue = "xpath~(//android.view.ViewGroup"
            + "[@content-desc=\"testID_Checkbox_Icon_unchecked\"])[2]";
    public String taskConfirmBtn ="accessibilityId~testID_Button_Confirm_onPress";
    public String taskCancelBtn ="accessibilityId~testID_Buttons_Cancel_onPress";

    public String priorityCheckboxes = "accessibilityId~testID_Checkbox_%s_Icon_unchecked";

    public String createdByLabel = "xpath~//android.view.ViewGroup[@content-desc=\"testID_ModalSelect_CreatedBy_onPress\"]"
            + "/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup";
    public String createdBySpan = "xpath~//android.view.ViewGroup[@content-desc=\"testID_ModalSelect_CreatedBy_onPress\"]"
            + "/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup";
    public String createdByValue = "xpath~(//android.view.ViewGroup"
            + "[@content-desc=\"testID_Checkbox_Icon_unchecked\"])[2]";
    public String createdByConfirmBtn ="accessibilityId~testID_Button_Confirm_onPress";
    public String createdByCancelBtn ="accessibilityId~testID_Buttons_Cancel_onPress";

    public String statusCheckboxes = "accessibilityId~testID_Checkbox_%s_Icon_unchecked";

    public String createdOnFrom = "accessibilityId~testID_DateTime_From_Expiry_Date_TextField";
    public String createdOnTo = "accessibilityId~testID_DateTime_To_Expiry_Date_TextField";
    public String createdOnClear = "accessibilityId~testID_TaskFilters_ExpiryDateClear_OnPress";

    public String startDateFrom = "accessibilityId~testID_DateTime_From_Created_On_TextField";
    public String startDateTo = "accessibilityId~testID_DateTime_To_Created_On_TextField";
    public String startDateClear = "accessibilityId~testID_TaskFilters_startDateClear_OnPress";

    public String dueOnFrom = "accessibilityId~testID_DateTime_From_Due_On_TextField";
    public String dueOnTo = "accessibilityId~testID_DateTime_To_Due_On_TextField";
    public String dueOnClear = "accessibilityId~testID_TaskFilters_dueOnClear_OnPress";

    public String expiryDateFrom = "accessibilityId~testID_DateTime_From__TextField";
    public String expiryDateTo = "accessibilityId~testID_DateTime_To__TextField";
    public String expiryDateClear = "xpath~(//android.view.ViewGroup"
            + "[@content-desc=\"testID_TaskFilters_ExpiryDateClear_OnPress\"])[2]";

    public String applyBtn = "accessibilityId~testID_Button_Apply_onPress";
    public String cancelBtn = "accessibilityId~testID_Buttons_Cancel_onPress";
    public String recordCount = "accessibilityId~testID_RecordsCountView_recordsCountTextMain";

    public String appliedFilters = "accessibilityId~testID_l_filter_main";

    //created by my team
    public String defaultColumns2 = "xpath~//android.view.ViewGroup[@content-desc=\"testID_MyTeamGrid\"]"
            + "/android.widget.ScrollView/android.view.ViewGroup/android.widget.HorizontalScrollView"
            + "/android.view.ViewGroup/android.view.ViewGroup[1]/*[position()>6]";

    public String defaultColumns3 = "xpath~//android.view.ViewGroup[@content-desc=\"testID_MyTeamGrid\"]"
            + "/android.widget.ScrollView/android.view.ViewGroup/android.widget.HorizontalScrollView"
            + "/android.view.ViewGroup/android.view.ViewGroup[1]/*[position()>15]";

    public String headersCount = "xpath~//android.view.ViewGroup[@content-desc=\"testID_MyTeamGrid\"]"
            + "/android.widget.ScrollView/android.view.ViewGroup/android.widget.HorizontalScrollView"
            + "/android.view.ViewGroup/android.view.ViewGroup[1]/*[position()<10]";

    public String resultsRowsElements = "xpath~//android.view.ViewGroup[@content-desc=\"testID_MyTeamGrid\"]"
            + "/android.widget.ScrollView/android.view.ViewGroup/android.widget.HorizontalScrollView"
            + "/android.view.ViewGroup/android.widget.TextView";

    public String resultRowElement= "xpath~//android.view.ViewGroup[@content-desc=\"testID_MyTeamGrid\"]"
            + "/android.widget.ScrollView/android.view.ViewGroup/android.widget.HorizontalScrollView"
            + "/android.view.ViewGroup/android.widget.TextView[1]";


    ElementsMobileTaskDashboard() {
        super.taskDashboardImg = this.taskDashboardTab;
        super.defaultFilterValue = this.defaultFilterValue;
        super.defaultColumns = this.firstCollapsedList;
        super.firstRowClick = this.firstExpandListIcon;
        super.expandedRowColumns = this.firstExpandedList;
        super.taskDropdownFilterValues = this.taskDropdownFilterValues;
        super.dropdownSvg = this.taskDropdownFilterSvg;

        //search
        super.searchInput = this.searchTaskInput;
        super.searchIcon = this.searchTaskIcon;
        super.searchDeleteIcon = this.deleteSearchIcon;
        super.taskIDresult = this.firstTaskIdResult;

        //filter values
        super.dashboardFilterImg = this.dashboardFilterImg;
        super.filterImg = this.filterImg;
        super.resetFilterLink = this.resetFilterLink;
        super.taskType = this.taskLabel;
        super.taskTypeValue = this.taskValue;
        super.taskSpan = this.taskSpan;
        super.taskConfirmBtn = this.taskConfirmBtn;
        super.taskCancelBtn = this.taskCancelBtn;
        super.priorityCheckboxes = this.priorityCheckboxes;

        super.createdByLabel=this.createdByLabel;
        super.createdBySpan=this.createdBySpan;
        super.createdByValue=this.createdByValue;
        super.createdByConfirmBtn=this.createdByConfirmBtn;
        super.createdByCancelBtn=this.createdByCancelBtn;

        super.statusCheckboxes=this.statusCheckboxes;

        super.createdOnFrom=this.createdOnFrom;
        super.createdOnTo=this.createdOnTo;
        super.createdOnClear=this.createdOnClear;

        super.startDateFrom=this.startDateFrom;
        super.startDateTo=this.startDateTo;
        super.startDateClear=this.startDateClear;

        super.dueOnFrom=this.dueOnFrom;
        super.dueOnTo=this.dueOnTo;
        super.dueOnClear=this.dueOnClear;

        super.expiryDateFrom=this.expiryDateFrom;
        super.expiryDateTo=this.expiryDateTo;
        super.expiryDateClear=this.expiryDateClear;

        super.applyBtn=this.applyBtn;
        super.cancelBtn=this.cancelBtn;

        //created by my team
        super.defaultColumns2 = this.defaultColumns2;
        super.headersCount = this.headersCount;
        super.resultsCount = this.resultRowElement;
        super.defaultColumns3 = this.defaultColumns3;

    }
}