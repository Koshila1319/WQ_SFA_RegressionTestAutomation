package com.totalamber.qa.WQTest;

import com.totalamber.qa.automation.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static com.totalamber.qa.data.UI.elements.webQuarters.wqAMAssignUsersPage.*;
import static com.totalamber.qa.data.UI.elements.webQuarters.wqCheckMailCatchEmailPage.*;
import static com.totalamber.qa.data.UI.elements.webQuarters.wqDMDashboardPage.SUPPORT_TILE_DESABLED_XPATH;
import static com.totalamber.qa.data.UI.elements.webQuarters.wqSUDashboardPage.*;

/**
 * Created by e.koshila on 10/10/2017.
 */
public class WQSupportDashboardTest extends TestBase {

    @BeforeMethod
    public void NavigateToPage() throws Exception {
        initDomainObjects(DRIVER);
        /*String siteUrl = data.getValueByName("url");
        String passwordSU = data.getValueByName("SU_Password");

        setSiteURL(siteUrl);
        wqHomePage.
                action_Navigate_To_LoginPage();
        wqLoginPage.
                step_User_Enter_Given_Credentials(SU, passwordSU);
        wqLoginPage.
                step_User_Click_Login_Button();
        wqdmDashboardPage.
                step_Click_Home_Button();*/
    }

    @AfterMethod
    public void endTestMethod() throws Throwable {
       // quitDriver();
    }

    @Test
    public void verify_Support_Dashboard_Link_IsAvailable() throws Exception {
       Assert.assertEquals(wqsuDashboardPage.verify_Element_Is_Available(WQ_SU_DASHBOARD_LINK_XPATH), true, "Support Dshboard link is available !");
    }

    @Test
    public void verify_Support_Dashboard_Link_Text() throws Exception {
       String dashboardSULink = data.getValueByName("SU_DashboardPage_SUDashboardLink");

       Assert.assertEquals(wqsuDashboardPage.verify_Data_Equals(WQ_SU_DASHBOARD_LINK_XPATH),dashboardSULink, "Support Dashboard Link verified !");
    }

    @Test
    public void verify_Clicking_Support_Dashboard_Link_Leads_To_Support_Dashboard_Of_The_User() throws Exception {
        String supportDashboardBrowserTitle = data.getValueByName("SU_DashboardPage_SupportDashboardBrowserTitle");

        wqdmDashboardPage.
                action_Click_Support_dsahboard_Link();

        Assert.assertEquals(wqsuDashboardPage.check_Browser_Title(),supportDashboardBrowserTitle, "Support Dashboard browser title verified ! !");
    }

    @Test
    public void verify_Company_Profile_Link_IsAvailable() throws Exception {
        wqdmDashboardPage.
                action_Click_Support_dsahboard_Link();

        Assert.assertEquals(wqsuDashboardPage.verify_Element_Is_Available(WQ_SU_COMPANY_PROFILE_LINK_XPATH), true, "Verified Company Profile link is available !" );
    }

    @Test
    public void verify_Company_Profile_Link_Text() throws Exception {

        NavigateToPage();
        wqdmDashboardPage.
                action_Click_Support_dsahboard_Link();

        Assert.assertEquals(wqsuDashboardPage.verify_Data_Equals(WQ_SU_COMPANY_PROFILE_LINK_XPATH), "Company Profile", "Verified Company Profile link text !" );
    }

    @Test
    public void verify_User_Profile_Link_IsAvailable() throws Exception {
        wqdmDashboardPage.
                action_Click_Support_dsahboard_Link();

        Assert.assertEquals(wqsuDashboardPage.verify_Element_Is_Available(WQ_SU_USER_PROFILE_LINK_XPATH), true, "Verified User Profile link is available !" );
    }

    @Test
    public void verify_User_Profile_Link_Text() throws Exception {
        wqdmDashboardPage.
                action_Click_Support_dsahboard_Link();

        Assert.assertEquals(wqsuDashboardPage.verify_Data_Equals(WQ_SU_USER_PROFILE_LINK_XPATH), "User Profile", "Verified User Profile link text !" );
    }

    @Test
    public void verify_24x7Support_Tab_IsEnabled() throws Exception {
        wqdmDashboardPage.
                action_Click_Support_dsahboard_Link();

        Assert.assertEquals(wqsuDashboardPage.step_Get_Support_Dashboard_Status(WQ_SUPPORT_TILE_XPATH), "CaseMatch","Support Dashboard enabled !");
    }

    @Test
    public void verify_Clicking_24x7Support_Tab_Leads_To_Create_New_Case_Page() throws Exception {
        String createNewCasePageBrowserTitle = data.getValueByName("SU_CrateNewCasePage_BrowserTitle");

        wqdmDashboardPage.
                action_Click_Support_dsahboard_Link();
        wqsuDashboardPage.
                action_Click_24x7Support_Tab();

        Assert.assertEquals(wqsuDashboardPage.check_Browser_Title(),createNewCasePageBrowserTitle,"Browser title verified !");
    }

    @Test
    public void verify_Create_New_Case_Button_IsAvailable() throws Exception {
        wqdmDashboardPage.
                action_Click_Support_dsahboard_Link();

        Assert.assertEquals(wqsuDashboardPage.verify_Element_Is_Available(WQ_SU_CREATE_NEW_CASE_BUTTON_XPATH), true,"Create New Case button available !");
    }

    @Test
    public void verify_Clicking_Create_New_Case_Button_Leads_To_Create_New_Case_Page() throws Exception {
        String createNewCasePageBrowserTitle = data.getValueByName("SU_CrateNewCasePage_BrowserTitle");

        wqdmDashboardPage.
                action_Click_Support_dsahboard_Link();
        wqsuDashboardPage.
                action_Click_Create_Case_Button();

        Assert.assertEquals(wqsuDashboardPage.check_Browser_Title(),createNewCasePageBrowserTitle,"Browser title verified !");
    }

    // Approve Billable Hours Tile
    @Test
    public void  verify_Approve_Billable_Hours_Tile_IsAvailable() throws Exception {
        wqdmDashboardPage.
                action_Click_Support_dsahboard_Link();

        Assert.assertEquals(wqsuDashboardPage.verify_Element_Is_Available(WQ_SU_APPROVE_BILLABLE_HOURS_TILE_XPATH), true, "Approve Billable tile is available !" );
    }

    @Test
    public void verify_Approve_Billable_Hours_Tile_Text_IsAvailable() throws Exception {
        wqdmDashboardPage.
                action_Click_Support_dsahboard_Link();

        Assert.assertEquals(wqsuDashboardPage.verify_Data_Equals(WQ_SU_APPROVE_BILLABLE_HOURS_TILE_TEXT_XPATH), "Approve Billable Hours", "Approve Billable tile text verified !" );
    }

    @Test
    public void verify_Clicking_Approve_Billable_Hours_Tile_Leads_To_Resolved_Cases_Page() throws Exception {
        wqdmDashboardPage.
                action_Click_Support_dsahboard_Link();
        wqsuDashboardPage.
                action_Click_Approve_Billable_Hours_Tile();

        Assert.assertEquals(wqsuDashboardPage.verify_Data_Equals(WQ_SU_RESOLVE_CASE_PAGE_TILE_TEXT_XPATH), "Resolved Cases", "Verified navigation to Resolve case page !" );
    }

    // Open Case Tile
    @Test
    public void  verify_Open_Cases_Tile_IsAvailable() throws Exception {
        wqdmDashboardPage.
                action_Click_Support_dsahboard_Link();

        Assert.assertEquals(wqsuDashboardPage.verify_Element_Is_Available(WQ_SU_OPEN_CASES_TILE_XPATH), true, "Open Cases tile is available !" );
    }

    @Test
    public void verify_Open_Cases_Tile_Text_IsAvailable() throws Exception {
        wqdmDashboardPage.
                action_Click_Support_dsahboard_Link();

        Assert.assertEquals(wqsuDashboardPage.verify_Data_Equals(WQ_SU_OPEN_CASES_TILE_TEXT_XPATH), "Open Cases", "Approve Billable tile text verified !" );
    }

    @Test
    public void verify_Clicking_Open_Cases_Tile_Leads_To_New_Cases_Page() throws Exception {
        wqdmDashboardPage.
                action_Click_Support_dsahboard_Link();
        wqsuDashboardPage.
                action_Click_Open_Cases_Tile();

        Assert.assertEquals(wqsuDashboardPage.verify_Data_Equals(WQ_SU_NEW_CASES_PAGE_TILE_TEXT_XPATH), "New Cases", "Verified navigation to New Cases page !" );
    }

    // Response Required Tile
    @Test
    public void  verify_Response_Required_Tile_IsAvailable() throws Exception {
        wqdmDashboardPage.
                action_Click_Support_dsahboard_Link();

        Assert.assertEquals(wqsuDashboardPage.verify_Element_Is_Available(WQ_SU_RESPONSE_REQUIRED_TILE_XPATH), true, "Response Required tile is available !" );
    }

    @Test
    public void verify_Response_Required_Tile_Text_IsAvailable() throws Exception {
        wqdmDashboardPage.
                action_Click_Support_dsahboard_Link();

        Assert.assertEquals(wqsuDashboardPage.verify_Data_Equals(WQ_SU_RESPONSE_REQUIRED_TILE_TEXT_XPATH), "Response Required", "Approve Billable tile text verified !" );
    }

    @Test
    public void verify_Clicking_Response_Required_Tile_Leads_To_Awaiting_Response_Page() throws Exception {
        wqdmDashboardPage.
                action_Click_Support_dsahboard_Link();
        wqsuDashboardPage.
                action_Click_Response_Required_Tile();

        Assert.assertEquals(wqsuDashboardPage.verify_Data_Equals(WQ_SU_AWAITING_RESPONSE_PAGE_TITLE_TEXT_XPATH), "Awaiting Response", "Verified navigation to New Cases page !" );
    }

    // Closed Cases Tile
    @Test
    public void  verify_Closed_Cases_Tile_IsAvailable() throws Exception {
        wqdmDashboardPage.
                action_Click_Support_dsahboard_Link();

        Assert.assertEquals(wqsuDashboardPage.verify_Element_Is_Available(WQ_SU_CLOSED_CASES_TILE_XPATH), true, "Closed Cases tile is available !" );
    }

    @Test
    public void verify_Closed_Cases_Tile_Text_IsAvailable() throws Exception {
        wqdmDashboardPage.
                action_Click_Support_dsahboard_Link();

        Assert.assertEquals(wqsuDashboardPage.verify_Data_Equals(WQ_SU_CLOSED_CASES_TILE_TEXT_XPATH), "Closed Cases", "Approve Billable tile text verified !" );
    }

    @Test
    public void verify_Clicking_Closed_Cases_Tile_Leads_To_Closed_Cases_Page() throws Exception {
        wqdmDashboardPage.
                action_Click_Support_dsahboard_Link();
        wqsuDashboardPage.
                action_Click_Closed_Cases_Tile();

        Assert.assertEquals(wqsuDashboardPage.verify_Data_Equals(WQ_SU_CLOSED_CASES_PAGE_TITLE_TEXT_XPATH), "Closed Cases", "Verified navigation to New Cases page !" );
    }

    // All Cases Tile
    @Test
    public void  verify_All_Cases_Tile_IsAvailable() throws Exception {
        wqdmDashboardPage.
                action_Click_Support_dsahboard_Link();

        Assert.assertEquals(wqsuDashboardPage.verify_Element_Is_Available(WQ_SU_ALL_CASES_TILE_XPATH), true, "All Cases tile is available !" );
    }

    @Test
    public void verify_All_Cases_Tile_Text_IsAvailable() throws Exception {
        wqdmDashboardPage.
                action_Click_Support_dsahboard_Link();

        Assert.assertEquals(wqsuDashboardPage.verify_Data_Equals(WQ_SU_ALL_CASES_TILE_TEXT_XPATH), "All Cases", "Approve Billable tile text verified !" );
    }

    @Test
    public void verify_All_Closed_Cases_Tile_Leads_To_All_Cases_Page() throws Exception {
        wqdmDashboardPage.
                action_Click_Support_dsahboard_Link();
        wqsuDashboardPage.
                action_Click_All_Cases_Tile();

        Assert.assertEquals(wqsuDashboardPage.verify_Data_Equals(WQ_SU_ALL_CASES_PAGE_TITLE_TEXT_XPATH), "All Cases", "Verified navigation to New Cases page !" );
    }

    @Test
    public void verify_Buy_more_Button_IsAvailable() throws Exception {
        wqdmDashboardPage.
                action_Click_Support_dsahboard_Link();

        Assert.assertEquals(wqsuDashboardPage.verify_Element_Is_Available(WQ_SU_BUY_MORE_BUTTON_TEXT_XPATH), true, "Verified Buy more button is available !" );
    }

    @Test
    public void verify_Buy_more_Button_Text() throws Exception {
        wqdmDashboardPage.
                action_Click_Support_dsahboard_Link();

        Assert.assertEquals(wqsuDashboardPage.verify_Data_Equals(WQ_SU_BUY_MORE_BUTTON_TEXT_XPATH), "Buy more", "Verified Buy more button text !" );
    }

    @Test
    public void verify_Support_Hours_Remaining_Text() throws Exception {
        wqdmDashboardPage.
                action_Click_Support_dsahboard_Link();

        Assert.assertEquals(wqsuDashboardPage.verify_Data_Equals(WQ_SU_SUPPORT_HOURS_REMAINING_TEXT_XPATH), "Support Hours Remaining", "Verified Support Hours Remaining text !" );
    }

    @Test
    public void verify_Support_Hours_Remaining_Slider_IsAvailable() throws Exception {
        wqdmDashboardPage.
                action_Click_Support_dsahboard_Link();

        Assert.assertEquals(wqsuDashboardPage.verify_Element_Is_Available(WQ_SU_SUPPORT_HOURS_REMAINING_SLIDER_XPATH), true, "Verified Support Hours Remaining Slider is available !" );
    }

    @Test
    public void verify_Contact_WQ_Support_Consultant_Button_IsAvailable() throws Exception {
        wqdmDashboardPage.
                action_Click_Support_dsahboard_Link();

        Assert.assertEquals(wqsuDashboardPage.verify_Element_Is_Available(WQ_SU_CONTACT_WQ_SUPPORT_CONSULTANT_XPATH), true, "Verified Contact WQ Support Consultant button is available !" );
    }

    @Test
    public void verify_Contact_WQ_Support_Consultant_Button_Text() throws Exception {
        wqdmDashboardPage.
                action_Click_Support_dsahboard_Link();

        Assert.assertEquals(wqsuDashboardPage.verify_Data_Equals(WQ_SU_CONTACT_WQ_SUPPORT_CONSULTANT_XPATH), "Contact WQ Support Consultant", "Verified Contact WQ Support Consultant button text !" );
    }

    @Test
    public void verify_Clicking_Contact_WQ_Support_Consultant_Button_Leads_To_Contact_Web_Quarters_Page() throws Exception {
        wqdmDashboardPage.
                action_Click_Support_dsahboard_Link();
        wqsuDashboardPage.
                action_Click_Contact_WQ_Support_Consultant_Button();

        Assert.assertEquals(wqsuDashboardPage.check_Browser_Title(), "WebQuarters Contact WQ SM", "Verified Contact WebQuarters page browser title !" );
    }

    @Test
    public void verify_Support_Cases_Heading_Text() throws Exception {
        wqdmDashboardPage.
                action_Click_Support_dsahboard_Link();

        Assert.assertEquals(wqsuDashboardPage.verify_Data_Equals(WQ_SU_SUPPORT_CASES_HEADING_XPATH), "Support Cases", "Verified Support cases heading is available !" );
    }

    @Test
    public void verify_Case_Search_Box_IsAvailable() throws Exception {
        wqdmDashboardPage.
                action_Click_Support_dsahboard_Link();

        Assert.assertEquals(wqsuDashboardPage.verify_Element_Is_Available(WQ_SU_CASE_SEARCH_BOX_XPATH), true, "Verified case search box is available !" );
    }

    @Test
    public void verify_Case_Search_Button_IsAvailable() throws Exception {
        wqdmDashboardPage.
                action_Click_Support_dsahboard_Link();

        Assert.assertEquals(wqsuDashboardPage.verify_Element_Is_Available(WQ_SU_CASE_SEARCH_BUTTON_XPATH), true, "Verified case search button is available !" );
    }

    @Test
    public void verify_Created_By_Dropdown_IsAvailable() throws Exception {
        wqdmDashboardPage.
                action_Click_Support_dsahboard_Link();

        List<String> list = wqsuDashboardPage.step_Get_Filter_DropDown_Text(WQ_SU_CREATED_BY_DROPDOWN_XPATH);

        Assert.assertEquals(list.get(0),"Created By" , "Verified Created By dropdown is available !" );
    }

    @Test
    public void verify_Case_Type_Dropdown_IsAvailable() throws Exception {
        wqdmDashboardPage.
                action_Click_Support_dsahboard_Link();

        List<String> list = wqsuDashboardPage.step_Get_Filter_DropDown_Text(WQ_SU_CASE_TYPE_DROPDOWN_XPATH);

        Assert.assertEquals(list.get(0),"Case Type" , "Verified Case Type dropdown is available !" );
    }

    @Test
    public void verify_Priority_Dropdown_IsAvailable() throws Exception {
        wqdmDashboardPage.
                action_Click_Support_dsahboard_Link();

        List<String> list = wqsuDashboardPage.step_Get_Filter_DropDown_Text(WQ_SU_PRIORITY_DROPDOWN_XPATH);

        Assert.assertEquals(list.get(0),"Priority" , "Verified Priority dropdown is available !" );
    }

    @Test
    public void verify_Status_Dropdown_IsAvailable() throws Exception {
        wqdmDashboardPage.
                action_Click_Support_dsahboard_Link();

        List<String> list = wqsuDashboardPage.step_Get_Filter_DropDown_Text(WQ_SU_STATUS_DROPDOWN_XPATH);

        Assert.assertEquals(list.get(0),"Status" , "Verified Priority dropdown is available !" );
    }

    @Test
    public void verify_Urgency_Dropdown_IsAvailable() throws Exception {
        wqdmDashboardPage.
                action_Click_Support_dsahboard_Link();

        List<String> list = wqsuDashboardPage.step_Get_Filter_DropDown_Text(WQ_SU_URGENCY_DROPDOWN_XPATH);

        Assert.assertEquals(list.get(0),"Urgency" , "Verified Urgency dropdown is available !" );
    }

    @Test
    public void verify_Case_Created_Date_Dropdown_IsAvailable() throws Exception {
        wqdmDashboardPage.
                action_Click_Support_dsahboard_Link();

        Assert.assertEquals(wqsuDashboardPage.verify_Element_Is_Available(WQ_SU_CASE_CREATED_DATE_DROPDOWN_XPATH), true, "Verified Case Created Date dropdown is available !" );
    }

    @Test
    public void verify_Filter_Button_IsAvailable() throws Exception {
        wqdmDashboardPage.
                action_Click_Support_dsahboard_Link();

        Assert.assertEquals(wqsuDashboardPage.verify_Element_Is_Available(WQ_SU_FILTER_BUTTON_XPATH), true, "Verified Filter button is available !" );
    }

    @Test
    public void verify_Clear_Button_IsAvailable() throws Exception {
        wqdmDashboardPage.
                action_Click_Support_dsahboard_Link();

        Assert.assertEquals(wqsuDashboardPage.verify_Element_Is_Available(WQ_SU_CLEAR_BUTTON_XPATH), true, "Verified Clear button is available !" );
    }

    @Test
    public void verify_Case_Result_Table_IsAvailable() throws Exception {
        wqdmDashboardPage.
                action_Click_Support_dsahboard_Link();

        Assert.assertEquals(wqsuDashboardPage.verify_Element_Is_Available(WQ_SU_CASE_RESULT_TABLE_XPATH), true, "Verified Case result table is available !" );
    }

    @Test
    public void verify_User_Able_To_Search_Cases() throws Exception {
        wqdmDashboardPage.
                action_Click_Support_dsahboard_Link();
        wqsuDashboardPage.step_Enter_Case_Id(searchCaseId).
                action_Click_search_Button();

        Thread.sleep(40000);

        List<String> list = wqsuDashboardPage.check_Search_Case_Id(WQ_SU_CASE_RESULT_TABLE_XPATH, searchCaseId);
        System.out.println(list);
        Assert.assertEquals(list.get(0),searchCaseId, "Search case Id matched !" );
    }

    @Test
    public void verify_Case_Results_Table_Column_Header_Texts() throws Exception {
        String siteUrl = data.getValueByName("url");
        String passwordSU = data.getValueByName("SU_Password");

        setSiteURL(siteUrl);
        wqHomePage.
                action_Navigate_To_LoginPage();
        wqLoginPage.
                step_User_Enter_Given_Credentials(SU, passwordSU);
        wqLoginPage.
                step_User_Click_Login_Button();
        wqdmDashboardPage.
                step_Click_Home_Button();

        wqdmDashboardPage.
                action_Click_Support_dsahboard_Link();

        List<String> list = wqsuDashboardPage.check_Case_Table_Column_Headers(WQ_SU_CASE_RESULT_TABLE_XPATH);
        System.out.println(list);
        Assert.assertEquals(list.get(0),"Case ID", "Header Case ID available !" );
        Assert.assertEquals(list.get(1),"Description", "Header Description available !" );
        Assert.assertEquals(list.get(2),"Case Status", "Header Case Status available !" );
        Assert.assertEquals(list.get(3),"Hours Utilized", "Header Hours Utilized available !" );
        Assert.assertEquals(list.get(4),"Client Approval", "Header Client Approval available !" );
    }

}
