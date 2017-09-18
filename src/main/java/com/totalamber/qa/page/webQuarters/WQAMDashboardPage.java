package com.totalamber.qa.page.webQuarters;

import com.totalamber.qa.automation.SeleniumBase;
import com.totalamber.qa.automation.TestBase;
import com.totalamber.qa.data.UI.elements.webQuarters.wqAMDashboardPage;
import org.openqa.selenium.WebDriver;

/**
 * Created by t.piyananda on 15/09/2017.
 */
public class WQAMDashboardPage extends TestBase implements wqAMDashboardPage {

    SeleniumBase seleniumBase;
    public WQAMDashboardPage(WebDriver driver) {seleniumBase = new SeleniumBase(driver);}


    public boolean check_Pending_Client_Table_Available() {
        return seleniumBase.verifyAvailableObject(AM_PENDINGCLIENTS_TABLE_XPATH);
    }

    public String check_Client_In_Table_Available(String clientName) {
        return seleniumBase.checkIsValueExist(AM_PENDINGCLIENTS_TABLE_XPATH, clientName);
    }

    public WQAMDashboardPage step_user_clicks_Client(String clientName) {
        seleniumBase.clickOnLink(clientName);
        return this;
    }

    public String validate_user_goesTo_Page() {
        return seleniumBase.driver.getTitle();
    }


    //This needs to be checked


    public boolean check_ClientsTile_Is_Available() {
        return seleniumBase.verifyAvailableObject(AM_DASHBOARD_CLIENTS_TILE_XPATH);
    }

    public String validate_Clients_Tile_Text() {
        return seleniumBase.getText(AM_DASHBOARD_CLIENTS_TILE_CSS, AM_DASHBOARD_CLIENTS_TILE_XPATH);
    }

    public boolean check_SuspiciousConnections_Tile_Is_Available() {
        return seleniumBase.verifyAvailableObject(AM_DASHBOARD_SUS_CON_TILE_XPATH);
    }

    public String validate_SuspiciousConnections_Tile_Text() {
        return seleniumBase.getText(AM_DASHBOARD_SUS_CON_TILE_CSS, AM_DASHBOARD_SUS_CON_TILE_XPATH);
    }

    public boolean check_Contractor_Matching_Tile_Is_Available() {
        return seleniumBase.verifyAvailableObject(AM_DASHBOARD_CONT_MATCH_TILE_XPATH);
    }

    public String validate_Contractor_Matching_Tile_Text() {
        return seleniumBase.getText(AM_DASHBOARD_CONT_MATCH_TILE_CSS, AM_DASHBOARD_CONT_MATCH_TILE_XPATH);
    }

    public boolean check_Reports_Tile_Is_Available() {
        return seleniumBase.verifyAvailableObject(AM_DASHBOARD_REPORTS_TILE_XPATH);
    }

    public String validate_Reports_Tile_Text() {
        return seleniumBase.getText(AM_DASHBOARD_REPORTS_TILE_CSS, AM_DASHBOARD_REPORTS_TILE_XPATH);
    }

    public boolean check_Assign_Users_Tile_Is_Available() {
        return seleniumBase.verifyAvailableObject(AM_DASHBOARD_ASSIGN_USERS_TILE_XPATH);
    }

    public String validate_Assign_Users_Tile_Text() {
        return seleniumBase.getText(AM_DASHBOARD_ASSIGN_USERS_TILE_CSS, AM_DASHBOARD_ASSIGN_USERS_TILE_XPATH);
    }

    public boolean check_Partners_Tile_Is_Available() {
        return seleniumBase.verifyAvailableObject(AM_DASHBOARD_PARTNERS_TILE_XPATH);
    }

    public String validate_Partners_Tile_Text() {
        return seleniumBase.getText(AM_DASHBOARD_PARTNERS_TILE_CSS, AM_DASHBOARD_PARTNERS_TILE_XPATH);
    }

    public boolean check_Contact_Client_Tile_Is_Available() {
        return seleniumBase.verifyAvailableObject(AM_DASHBOARD_CONTACT_CLIENT_TILE_XPATH);
    }

    public String validate_Contact_Client_Tile_Text() {
        return seleniumBase.getText(AM_DASHBOARD_CONTACT_CLIENT_TILE_CSS, AM_DASHBOARD_CONTACT_CLIENT_TILE_XPATH);
    }

    public boolean check_EnterCompanyName_Label_Is_Available() {
        return seleniumBase.verifyAvailableObject(AM_ENTERCOMPANYNAME_LABEL_XPATH);
    }

    public String check_EnterCompanyName_Label_Text() {
        return seleniumBase.getText(AM_ENTERCOMPANYNAME_LABEL_CSS,AM_ENTERCOMPANYNAME_LABEL_XPATH);
    }

    public boolean check_EnterCompanyName_TextBox_Available() {
        return seleniumBase.verifyAvailableObject(AM_ENTERCOMPANYNAME_TEXTBOX_XPATH);
    }

    public WQAMDashboardPage step_Click_Client_Tile() {
        seleniumBase.click(AM_DASHBOARD_CLIENTS_TILE_XPATH,AM_DASHBOARD_CLIENTS_TILE_CSS);
        return this;
    }

    public WQAMDashboardPage step_Click_SuspiciousConnections_Tile() {
        seleniumBase.click(AM_DASHBOARD_SUS_CON_TILE_XPATH,AM_DASHBOARD_SUS_CON_TILE_CSS);
        return this;
    }

    public WQAMDashboardPage step_Click_Contractor_Matching_Tile() {
        seleniumBase.click(AM_DASHBOARD_CONT_MATCH_TILE_XPATH,AM_DASHBOARD_CONT_MATCH_TILE_CSS);
        return this;
    }

    public WQAMDashboardPage step_Click_Reports_Tile() {
        seleniumBase.click(AM_DASHBOARD_REPORTS_TILE_XPATH,AM_DASHBOARD_REPORTS_TILE_CSS);
        return this;
    }

    public WQAMDashboardPage step_Click_Assign_Users_Tile() {
        seleniumBase.click(AM_DASHBOARD_ASSIGN_USERS_TILE_XPATH,AM_DASHBOARD_ASSIGN_USERS_TILE_CSS);
        return this;
    }

    public WQAMDashboardPage step_Click_Partners_Tile() {
        seleniumBase.click(AM_DASHBOARD_PARTNERS_TILE_XPATH,AM_DASHBOARD_PARTNERS_TILE_CSS);
        return this;
    }

    public WQAMDashboardPage step_Click_Contact_Client_Tile() {
        seleniumBase.click(AM_DASHBOARD_CONTACT_CLIENT_TILE_XPATH,AM_DASHBOARD_CONTACT_CLIENT_TILE_CSS);
        return this;
    }

    public WQAMDashboardPage validate_Characters_Can_Enter(String textToEnter) {
        seleniumBase.type(AM_ENTERCOMPANYNAME_TEXTBOX_CSS,AM_ENTERCOMPANYNAME_TEXTBOX_XPATH,textToEnter);
        return this;
    }

    public boolean check_Go_Button_Is_Available() {
        return seleniumBase.verifyAvailableObject(AM_GO_BUTTON_XPATH);
    }

    public String check_GoButton_Text() {

        return seleniumBase.readValueFromTextBox(AM_GO_BUTTON_XPATH);
    }

    public WQAMDashboardPage step_click_Go_Button() {
        seleniumBase.click(AM_GO_BUTTON_XPATH,AM_GO_BUTTON_XPATH);
        return this;
    }

    public String check_Error_Message() {
        return seleniumBase.getText(AM_GO_BUTTON_ERROR_CSS, AM_GO_BUTTON_ERROR_XPATH);
    }


    public WQAMDashboardPage check_EnterCompanyName_TextBox_isEmpty() {
        seleniumBase.clearTextBox(AM_ENTERCOMPANYNAME_TEXTBOX_XPATH);
        return this;
    }

    public boolean validate_Client_List_IsAvailable() {
        return seleniumBase.checkIsElementEnabled(AM_GO_BUTTON_COMPANY_LIST_XPATH);
    }
}
