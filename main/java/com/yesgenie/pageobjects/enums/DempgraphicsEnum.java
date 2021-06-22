    package com.yesgenie.pageobjects.enums;

    public enum DempgraphicsEnum {

        NAME("Name"),
        DOB("DOB"),
        ADDRESS("Address"),
        MDMID("MDM ID"),
        CONTACTABILITY("Contactability"),
        PROFESSION("Profession"),
        CKYCNO("CKYC No."),
        VINTAGE("Vintage"),
        BSPS("BS/PS"),
        CUSTOMER_SEGMENT("Customer Segment"),
        CUSTOMER_TYPE("Customer Type"),
        MOBILE("Mobile No"),
        EMAIL("Email"),
        INCOME("Income"),
        LIABILITY_RM("Liability RM"),
        SERVICE_RM("Service RM"),
        GROUP_CODE("Group Code"),
        NATIONALITY("Nationality"),
        RISK_CATEGORY("Risk Category"),
        TCP_REGISTRATION("TCP Registraion"),
        COMPANY_CODE("Company code"),
        BRANCH_CODE("Branch code"),
        PORTFOLIO_CODE("Portfolio code");

        public final String property;

        DempgraphicsEnum(String property) {
            this.property = property;
        }
    }
