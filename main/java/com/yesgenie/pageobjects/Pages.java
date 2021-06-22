package com.yesgenie.pageobjects;

import com.yesgenie.pageobjects.BulkUpload.BulkUploadPage;
import com.yesgenie.pageobjects.Demographics.DemographicsPage;
import com.yesgenie.pageobjects.Portfolio.PortfolioPage;
import com.yesgenie.pageobjects.adhocForms.AdhocFormsPage;
import com.yesgenie.pageobjects.casedashboard.CaseDashboardMobilePage;
import com.yesgenie.pageobjects.casedashboard.CaseDashboardPage;
import com.yesgenie.pageobjects.customerDashboardPage.CustomerDashBoardPage;
import com.yesgenie.pageobjects.customerDashboardPage.CustomerDashBoardPageMobile;
import com.yesgenie.pageobjects.customerinteraction.CustInteractionPage;
import com.yesgenie.pageobjects.dynamicForms.DynamicFormsPage;
import com.yesgenie.pageobjects.leadpage.LeadPage;
import com.yesgenie.pageobjects.loginpage.LoginPage;
import com.yesgenie.pageobjects.loginpage.LoginPageMobile;
import com.yesgenie.pageobjects.nba.NbaPage;
import com.yesgenie.pageobjects.nbaDashboardPage.NbaDashboardPage;
import com.yesgenie.pageobjects.nbaDashboardPage.NbaDashboardPageMobile;
import com.yesgenie.pageobjects.profiler.ProfilerPage;
import com.yesgenie.pageobjects.prospectpage.ProspectPage;
import com.yesgenie.pageobjects.prospectpage.ProspectPageMobile;
import com.yesgenie.pageobjects.rolemapping.RoleMappingPage;
import com.yesgenie.pageobjects.search.SearchPage;
import com.yesgenie.pageobjects.taskdashboard.TaskDashboardPage;
import com.yesgenie.pageobjects.taskdashboard.TaskDashboardPageMobile;
import com.yesgenie.pageobjects.tasktypemaster.TaskTypeMasterPage;
import com.yesgenie.pageobjects.userManagement.UserManagementPage;
import com.yesgenie.pageobjects.yesEngage.YesEngagePage;
import com.yesgenie.pageobjects.yesEngage.YesEngagePageMobile;

public enum Pages {

    //Login
    LOGIN_PAGE(LoginPage.class),
    LOGIN_PAGE_MOBILE(LoginPageMobile.class),

    //ADMIN CONSOLE (Web Only Modules)
    TASK_TYPE_MASTER_PAGE(TaskTypeMasterPage.class),
    USERMANAGEMENT_PAGE(UserManagementPage.class),
    ROLEMAPPING_PAGE(RoleMappingPage.class),
    BULK_UPLOAD_PAGE(BulkUploadPage.class),
    ADHOC_FORMS_PAGE(AdhocFormsPage.class),
    DYNAMIC_FORMS_PAGE(DynamicFormsPage.class),


    //DASHBOARDS
    TASK_DASHBOARD_PAGE(TaskDashboardPage.class),
    TASK_DASHBOARD_PAGE_MOBILE(TaskDashboardPageMobile.class),
    CASE_DASH_BOARD(CaseDashboardPage.class),
    CASE_PAGE_MOBILE(CaseDashboardMobilePage.class),
    CUSTOMER_DASHBOARD_PAGE(CustomerDashBoardPage.class),
    CUSTOMER_DASHBOARD_PAGE_MOBILE(CustomerDashBoardPageMobile.class),
    NBA_DASHBOARD_PAGE(NbaDashboardPage.class),
    NBA_DASHBOARD_PAGE_MOBILE(NbaDashboardPageMobile.class),
    LEAD_PAGE(LeadPage.class),
    PROSPECT_PAGE(ProspectPage.class),

    //Customer SNAP features
    NBA_PAGE(NbaPage.class),
    CUSTOMER_INTERACTION_PAGE(CustInteractionPage.class),
    DEMOGRAPHIC_PAGE(DemographicsPage.class),
    PORTFOLIO_PAGE(PortfolioPage.class),
    PROFILER_PAGE(ProfilerPage.class),

    //Global Search
    SEARCH_PAGE(SearchPage.class),

    YES_ENGAGE_PAGE(YesEngagePage.class),
    YES_ENGAGE_PAGE_MOBILE(YesEngagePageMobile.class);



    public final Class object;

    Pages(Class object) {
        this.object = object;
    }

}
