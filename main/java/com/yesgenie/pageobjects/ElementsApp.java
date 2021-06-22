package com.yesgenie.pageobjects;

/**
 * Refers to common elements which are accessible across all pages.
 * eg: elements for headers and footers
 *
 * @author: kapilchawla
 */
public class ElementsApp {
    public String lblTotalResultsCount = "xpath~//div[@class='view-category-search']//div"
            + "[@class='filter-bar__results-count']";

    public String lstProduct = "xpath~//div[@class='product-cell']";
    public String dropdownDiv = "xpath~//div[text()='%s']/..//div[contains(@class,'control')]";
    public String dropdown2Div = "xpath~//div[text()='%s']/../..//div[contains(@class,'control')]";
    public String dropdown2SendText = "xpath~//div[text()='%s']/..//*[name()='input' and @type='text']";
    public String dropdownValue = "xpath~//div[contains(@class,'menu')]"
            + "//div[contains(@id,'option') and text()='%s']";

    public String inputField = "css~#%s";

    public String submitBtn = "xpath~//div[text()='Submit']";
    public String createBtn = "xpath~//div[text()='Create']";

    public String homePageGlobalSearchInput = "xpath~//div[@id='root']"
            + "//img[contains(@src,'Search')]/../../preceding-sibling::input|"
            + "xpath~/hierarchy/android.widget.FrameLayout"
            + "/android.widget.LinearLayout/android.widget.FrameLayout"
            + "/android.widget.LinearLayout/android.widget.FrameLayout"
            + "/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup"
            + "/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup"
            + "/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]"
            + "/android.view.ViewGroup[1]/android.widget.TextView";

    public String popUpGlobalSearchInput = "xpath~//div[@id='root']"
            + "//img[contains(@src,'Search')]/../../preceding-sibling::input[not(@readonly)]|"
            + "xpath~/hierarchy/android.widget.FrameLayout"
            + "/android.widget.LinearLayout/android.widget.FrameLayout"
            + "/android.widget.LinearLayout/android.widget.FrameLayout"
            + "/android.widget.FrameLayout/android.view.ViewGroup"
            + "/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup"
            + "/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup"
            + "/android.view.ViewGroup[3]/android.view.ViewGroup[1]/android.view.ViewGroup";

    public String popUpGlobalSearchIcon = "xpath~//div[@id='root']//img[contains(@src,'Search')]|"
            + "xpath~//android.view.ViewGroup[@content-desc=\"testID_l_onPress\"]"
            + "/android.view.ViewGroup/android.view.ViewGroup";


    //  QA
//    public String dropDown = "xpath~//div[text()='Cases for my customer']";
//   UAT
    public String dropDown = "xpath~//div[text()='Cases for my customer' or @class='css-151xaom-placeholder']";
    public String btnShop = "xpath~//li/button[normalize-space(text())='Shop']";

    public String btnCustomize = "xpath~//li/button[normalize-space(text())='Customize']";

    public String btnMenuItem = "xpath~(//div[contains(@class,'nav-menu-panel') and contains(@class,'active')]"
            + "//div[contains(@class,'navigation-bar')]//li)[%s]/button";

    public String btnCustomMenuItem = "xpath~(//div[contains(@class,'nav-menu-panel') and contains(@class,'active')]"
            + "//div[contains(@class,'navigation-bar')]//li)[%s]/a";

    public String lstOfMenuItems = "xpath~//div[contains(@class,'nav-menu-panel') and contains(@class,'active')]"
            + "//div[contains(@class,'navigation-bar')]//li//button";

    public String btnSubMenuItem = "xpath~(//div[contains(@class,'nav-menu-panel') and contains(@class,'show')]"
            + "//li)[%s]/a";

    public String lstOfSubMenuItems = "xpath~//div[contains(@class,'nav-menu-panel') and "
            + "contains(@class,'show')]//li/a";

    public String btnSearch = "xpath~//button[@aria-label='Search']";

    public String lstTopSearch = "xpath~//h6[contains(@class,'search__results-title')]"
            + "/following-sibling::ul[not(@style)]/li";

    public String lstTopSearches = "xpath~//h6[contains(@class,'search__results-title')]"
            + "/following-sibling::ul[not(@style)]/li";

    public String lnkTopSearchItem = "xpath~(//h6[contains(@class,'search__results-title')]"
            + "/following-sibling::ul[not(@style)]/li/a)[%s]";

    public String lblSearchBreadCrumb = "xpath~//div[@class='view-category-search']"
            + "//li[contains(@class,'search-breadcrumbs__list-item')]";

    public String lstSearchDrawerOptions = "xpath~//div[contains(@class,'search__suggested-products')]"
            + "//a[@class='product-name']";

    public String lnkPagination = "xpath~//ul[@class='pagination']";

    public String lblHeaderValue = "xpath~//div[@id='consent_blackbar']/following-sibling::div/child::*";

    public String lblRecentlyAddedCart = "xpath~//div[contains(@class,'bag-toast recentlyAddedCart')]";

    public String breadCrumbList = "xpath~//script[contains(text(),'BreadcrumbList')]";

    public String oneTrustAcceptBtn = "xpath~//button[@id='onetrust-accept-btn-handler']";

    public String lblCartItems = "xpath~//a[@class='header-bar__cart']//span[contains(@class,'cart-count')]";

    public String lstOfActiveFilters = "xpath~//div[contains(@class,'filtersActive')]//span[not(*)]";
    public String dropDownSelectedMyTeamText = "xpath~//div[text()='Cases created by my team']";
//    public String dropDown1 = "xpath~//div[text()='Cases created by me']";
    public String dropdown1 = "xpath~//div[contains(@class,'placeholder') and text()='Cases for my customer']";
    public String byDefaultDropDownText = "xpath~//div[@class='css-1pcexqc-container']/div/div[1]/div[1]";
    public String selectCasesCreatedByMe = "xpath~//div[@class='css-1pcexqc-container']"
            + "//div[@class='css-kj6f9i-menu']//div";
    //    QA
//    public String dropDownNew = "xpath~//div[@class='css-1pcexqc-container']//div[@class='css-kj6f9i-menu']"
//            + "//div[text()='Cases created by me']";
//    UAT
    public String dropDownNew = "xpath~//div[@class='css-1pcexqc-container']//div[@class='css-kj6f9i-menu']"
            + "//div[text()='Cases created by me' or @class='css-dvua67-singleValue']";
    public String countryPin = "css~ul.utility-bar__links-wrapper li.utility-bar__link button";

    public String searchResultTitle = "xpath~//h6[@class='search__results-title']";

    public String menShopLink = "xpath~//ul//li//button[contains(@id,'Men')]";

    //public String selectCasesCreatedByMyTeam="xpath~//div[@class='css-1pcexqc-container']
    // div[@class='css-bg1rzq-control']//div[text()='Cases created by my team']";
    //public String selectCasesCreatedByMyTeam="xpath~//div[@class='css-1pcexqc-container']
    // div[@class='css-bg1rzq-control']/div/div[text()='Cases created by my team']";
    public String selectCasesCreatedByMyTeam = "xpath~//div[@class='css-1pcexqc-container']"
            + "/div/div/div[text()='Cases created by my team']";
    public String casesCreatedByMyTeamdrpDown = "xpath~//div[contains(@class,'singleValue') "
            + "and text()='Cases created by my team']";
    //    QA
//    public String filters = "xpath~//span[contains(text(),'Filters')]";
//    UAT
    public String filters = "xpath~//div[contains(@class,'_15KO49zxmO2IAlh_a8XUKU')]//span[contains(text(),'Filters')]";
    //    QA
//    public String searchBoxCases = "xpath~//input[(@type='text' and @placeholder='Search for Cases')]";
//    UAT
    public String searchBoxCases = "xpath~//input[(@class='wOH-80ag6d00ZnLa_pcj-') and (@type='text')]";
    public String searchBoxClick = "xpath~//img[@src='/static/media/searchRM.c0cc5fd8.svg']";
    public String searchBoxCancelClick = "xpath~//img[@src='/static/media/CloseBlack.e97e2b58.svg']";

    public String trousersLink = "xpath~//a[contains(@href,'/underwear-socks/')]";


}
