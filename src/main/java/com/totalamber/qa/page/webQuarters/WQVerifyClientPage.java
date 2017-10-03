package com.totalamber.qa.page.webQuarters;

import com.totalamber.qa.automation.SeleniumBase;
import com.totalamber.qa.data.UI.elements.webQuarters.wqVerifyClientPage;
import org.openqa.selenium.WebDriver;


/**
 * Created by s.wathsala on 9/28/2017.
 */
public class WQVerifyClientPage implements wqVerifyClientPage {
    SeleniumBase seleniumBase;

    public WQVerifyClientPage(WebDriver driver) {

        seleniumBase = new SeleniumBase(driver);
    }

    public boolean check_Company_Is_Available(String companyName) {
        return seleniumBase.checkIsElementDisplayedByText(companyName);
    }

    //client tile
    public String check_Client_Tile_Name() {
        return seleniumBase.getText(WQCLIENT_SM_DASHBOARD_CLIENTS_TILE_NAME_CSS, WQCLIENT_SM_DASHBOARD_CLIENTS_TILE_NAME_XPATH);
    }

    public void action_Navigate_To_WQ_Client_List_Page() {
        seleniumBase.click(WQCLIENT_SM_DASHBOARD_CLIENTS_TILE_NAME_XPATH,WQCLIENT_SM_DASHBOARD_CLIENTS_TILE_NAME_CSS);
    }

    public String check_WQ_Client_List_Page_Name() {
        return seleniumBase.getText(WQCLIENT_SM_DASHBOARD_ACTIVATED_CLIENT_LIST_PAGE_TITLE_CSS,WQCLIENT_SM_DASHBOARD_ACTIVATED_CLIENT_LIST_PAGE_TITLE_XPATH);
    }

    //to be assigend client tile
    public String check_To_Be_Assigned_Client_Tile_Name() {
        return seleniumBase.getText(WQCLIENT_SM_DASHBOARD_TO_BE_ASSIGNED_CLIENTS_TILE_NAME_CSS, WQCLIENT_SM_DASHBOARD_TO_BE_ASSIGNED_CLIENTS_TILE_NAME_XPATH);
    }

    public String check_WQ_Pending_Clients_Page_Name() {
        return seleniumBase.getText(WQCLIENT_SM_DASHBOARD_PENDING_CLIENTS_PAGE_TITLE_CSS,WQCLIENT_SM_DASHBOARD_PENDING_CLIENTS_PAGE_TITLE_XPATH);
    }

    public void action_Navigate_To_Pending_Clients_Page() {
        seleniumBase.click(WQCLIENT_SM_DASHBOARD_TO_BE_ASSIGNED_CLIENTS_TILE_NAME_XPATH,WQCLIENT_SM_DASHBOARD_TO_BE_ASSIGNED_CLIENTS_TILE_NAME_CSS);
    }

    //Contractor Matching Tile
    public String check_Contractor_Matching_Tile_Name() {
        return seleniumBase.getText(WQCLIENT_SM_DASHBOARD_CONTRACTOR_MATCHING_TILE_NAME_CSS,WQCLIENT_SM_DASHBOARD_CONTRACTOR_MATCHING_TILE_NAME_XPATH);
    }

    public String check_WQ_Contractor_Match_Builder_Page_Name() {
        return seleniumBase.getText(WQCLIENT_SM_DASHBOARD_CON_MATCH_BUILDER_PAGE_TITLE_CSS,WQCLIENT_SM_DASHBOARD_CON_MATCH_BUILDER_PAGE_TITLE_XPATH);
    }

    public void action_Navigate_To_Contractor_Match_Builder_Page() {
        seleniumBase.click(WQCLIENT_SM_DASHBOARD_CONTRACTOR_MATCHING_TILE_NAME_XPATH,WQCLIENT_SM_DASHBOARD_CONTRACTOR_MATCHING_TILE_NAME_CSS);
    }

    //Connections To Be Verified Tile
    public String check_Connection_To_Be_Verified_Tile_Name() {
        return seleniumBase.getText(WQCLIENT_SM_DASHBOARD_CONNECTION_TO_BE_VERIFIED_TILE_NAME_CSS,WQCLIENT_SM_DASHBOARD_CONNECTION_TO_BE_VERIFIED_TILE_NAME_XPATH);
    }

    public void action_Navigate_To_Connection_Verification_Page() {
        seleniumBase.click(WQCLIENT_SM_DASHBOARD_CONNECTION_TO_BE_VERIFIED_TILE_NAME_XPATH,WQCLIENT_SM_DASHBOARD_CONNECTION_TO_BE_VERIFIED_TILE_NAME_CSS);
    }
    public String check_WQ_Connection_Verification_Page_Name() {
        return seleniumBase.getText(WQCLIENT_SM_DASHBOARD_CON_VERIFICATION_PAGE_TITLE_CSS,WQCLIENT_SM_DASHBOARD_CON_VERIFICATION_PAGE_TITLE_XPATH);
    }

    //Engagements To Be Verified Tile
    public String check_Engagement_To_Be_Verified_Tile_Name() {
        return seleniumBase.getText(WQCLIENT_SM_DASHBOARD_ENG_TO_BE_VERIFIED_TILE_NAME_CSS,WQCLIENT_SM_DASHBOARD_ENG_TO_BE_VERIFIED_TILE_NAME_XPATH);
    }

    public void action_Navigate_To_Engagement_Survey_Approval_Page() {
        seleniumBase.click(WQCLIENT_SM_DASHBOARD_ENG_TO_BE_VERIFIED_TILE_NAME_XPATH,WQCLIENT_SM_DASHBOARD_ENG_TO_BE_VERIFIED_TILE_NAME_CSS);
    }

    public String check_WQ_Engagement_Survey_Approval_Page_Name() {
        return seleniumBase.getText(WQCLIENT_SM_DASHBOARD_ENG_SURVEY_APPROVAL_PAGE_TITLE_CSS,WQCLIENT_SM_DASHBOARD_ENG_SURVEY_APPROVAL_PAGE_TITLE_XPATH);
    }

    //Reports Tile
    public String check_Reports_Tile_Name() {
        return seleniumBase.getText(WQCLIENT_SM_DASHBOARD_REPORT_TILE_NAME_CSS,WQCLIENT_SM_DASHBOARD_REPORT_TILE_NAME_XPATH);
    }

    public void action_Navigate_To_Back_Office_Reports_Page() {
        seleniumBase.click(WQCLIENT_SM_DASHBOARD_REPORT_TILE_NAME_XPATH,WQCLIENT_SM_DASHBOARD_REPORT_TILE_NAME_CSS);
    }

    public String check_WQ_Report_Page_Name() {
        return seleniumBase.getText(WQCLIENT_SM_DASHBOARD_BO_REPORT_PAGE_TITLE_CSS,WQCLIENT_SM_DASHBOARD_BO_REPORT_PAGE_TITLE_XPATH);
    }

    //Case ID Prefix Tile
    public String check_Case_ID_Prefix_Tile_Name() {
        return seleniumBase.getText(WQCLIENT_SM_DASHBOARD_CASE_ID_PREFIX_TILE_NAME_CSS,WQCLIENT_SM_DASHBOARD_CASE_ID_PREFIX_TILE_NAME_XPATH);
    }

    public void action_Navigate_To_Set_Case_ID_Prefix_Page() {
        seleniumBase.click(WQCLIENT_SM_DASHBOARD_CASE_ID_PREFIX_TILE_NAME_XPATH,WQCLIENT_SM_DASHBOARD_CASE_ID_PREFIX_TILE_NAME_CSS);
    }

    public String check_Set_Case_ID_Prefix_Page_Name() {
        return seleniumBase.getText(WQCLIENT_SM_DASHBOARD_CASE_ID_PREFIX_PAGE_TITLE_CSS,WQCLIENT_SM_DASHBOARD_CASE_ID_PREFIX_PAGE_TITLE_XPATH);
    }

    //Assign Users Tile
    public String check_Assign_Users_Tile_Name() {
        return seleniumBase.getText(WQCLIENT_SM_DASHBOARD_ASSIGN_USERS_PREFIX_TILE_NAME_CSS,WQCLIENT_SM_DASHBOARD_ASSIGN_USERS_PREFIX_TILE_NAME_XPATH);
    }

    public String check_Assign_Users_Page_Name() {
        return seleniumBase.getText(WQCLIENT_SM_DASHBOARD_ASSIGN_USERS_PAGE_TITLE_CSS,WQCLIENT_SM_DASHBOARD_ASSIGN_USERS_PAGE_TITLE_XPATH);
    }

    public void action_Navigate_To_Assign_Users_Page() {
        seleniumBase.click(WQCLIENT_SM_DASHBOARD_ASSIGN_USERS_PREFIX_TILE_NAME_XPATH,WQCLIENT_SM_DASHBOARD_ASSIGN_USERS_PREFIX_TILE_NAME_CSS);
    }

    //To_Be_Assigned_Partner Tile
    public String check_To_Be_Assigned_Partner_Tile_Name() {
        return seleniumBase.getText(WQCLIENT_SM_DASHBOARD_TO_BE_ASSIGNED_PARTNERS_TILE_NAME_CSS,WQCLIENT_SM_DASHBOARD_TO_BE_ASSIGNED_PARTNERS_TILE_NAME_XPATH);
    }

    public String check_Configuration_Button_Text() {
        return seleniumBase.getText(WQCLIENT_SM_DASHBOARD_CONFIGURATION_BTN_CSS,WQCLIENT_SM_DASHBOARD_CONFIGURATION_BTN_XPATH);
    }

    //Cofiguration Button
    public void action_Navigate_To_Sales_Manager_Configuration_Page() {
        seleniumBase.click(WQCLIENT_SM_DASHBOARD_CONFIGURATION_BTN_XPATH,WQCLIENT_SM_DASHBOARD_CONFIGURATION_BTN_CSS);
    }

    public String check_Sales_Manager_Configuration_Page_Name() {
        return seleniumBase.getText(WQCLIENT_SM_DASHBOARD_SM_CONFIGURATION_PAGE_TITLE_CSS,WQCLIENT_SM_DASHBOARD_SM_CONFIGURATION_PAGE_TITLE_XPATH);
    }

    public void check_Company_Name_Text_Box_Available() {
        seleniumBase.checkElementIsDisplayed(WQCLIENT_SM_DASHBOARD_COMPANY_NAME_XPATH);
    }

    public String check_CopyRight_Info_Available() {
        return seleniumBase.getText(WQCLIENT_SM_DASHBOARD_COPYRIGHT_INFO_CSS,WQCLIENT_SM_DASHBOARD_COPYRIGHT_INFO_XPATH);
    }
}
