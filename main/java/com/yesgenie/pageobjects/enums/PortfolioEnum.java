package com.yesgenie.pageobjects.enums;

public enum PortfolioEnum {
    NAME("Name"),
    CUST_ID("Cust_ID"),
    NET_BANKING("Netbanking"),
    NET_BANKING_USAGE("Netbanking Usage"),
    NET_BANKING_TREND("Netbanking Trend"),
    MOBILE_APP("Mobile App"),
    YES_MOBILE_USAGE("Yes Mobi le Usage"),
    YES_MOBILE_TREND("Yes Mobi le Trend"),
    POS("POS"),
    POS_DEBIT("POS Debit"),
    POS_CREDIT("POS Credit"),
    POS_USAGE("POS Usage"),
    POS_TREND("POS Trend"),
    YES_ROBOT("Yes Robot"),
    YES_ROBOT_USAGE("Yes Robot Usage"),
    YES_ROBOT_TREND("Yes Robot Trend"),
    ATM("ATM"),
    ATM_YBL("ATM YBL"),
    ATM_NON_YBL("ATM Non YBL"),
    ATM_USAGE("ATM Usage"),
    ATM_TREND("ATM Trend"),
    BRANCH_BANKING("Branch Banking"),
    BRANCH_BANKING_USAGE("Branch Banking Usage"),
    BRANCH_BANKING_TREND("Branch Banking Trend"),
    DEPOSIT_CATEGORIES("Deposit Categories"),
    DEPOSIT_CATEGORIES_STATUS("Deposit Categories Status"),
    SAVINGS_ACT_COL_GRID_NAMES("Savings Account Grid Column Names"),
    SAVINGS_ACT_COL_GRID_VALUES("Savings Account Grid Column Values"),
    FIXED_DEPOSIT_COL_GRID_NAMES("Fixed Deposit Grid Column Names"),
    FIXED_DEPOSIT_COL_GRID_VALUES("Fixed Deposit Grid Column Values"),
    DEPOST_COLOR_CODES("Deposit Color codes"),
    LOANS_CATEGORIES("Loans Categories"),
    TEXT_BEFORE_ROW_CLICK("Text Before Row Click"),
    TEXT_AFTER_ROW_CLICK("Text After Row Click"),
    CHART("Chart"),
    KPI_GROUP_NRV("KPI_Group_NRV"),
    KPI_NRV("KPI_NRV"),
    KPI_PPI("KPI_PPI"),
    KPI_PROD_HOLDING("KPI_PRODUCT_HOLDING"),
    KPI_PROD_HOLDINGS("KPI_PRODUCT_HOLDINGS"),
    DEPOSIT_TOTAL_HOVER("Deposit_Hover_total"),
    INVESTMENTS_TOTAL_HOVER("Loans_Hover_total"),
    LOANS_TOTAL_HOVER("Investment_Hover_total"),
    CARDS_TOTAL_HOVER("Cards_Hover_total"),
    NON_DEPOSIT_INVESTMENT("Deposits & Investments"),
    NON_IND_TRADE("Trade"),
    NON_IND_LOANS("Loans & Advances"),
    COLLECTIONS_PAYMENTS("Collections & Payments"),
    NON_IND_DEPOSIT_TOTAL("Non_Ind_Deposit_Total");

    public final String property;
    PortfolioEnum(String property) {
        this.property = property;
    }
}

