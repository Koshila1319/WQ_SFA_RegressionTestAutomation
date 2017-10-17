package com.totalamber.qa.WQTest;

import com.totalamber.qa.automation.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

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
    }

    @AfterMethod
    public void endTestMethod() throws Throwable {
        quitDriver();
    }

    @Test
    public void verify_Support_Dashboard_Link_IsAvailable() throws Exception {
       NavigateToPage();

       Assert.assertEquals(wqsuDashboardPage.verify_Element_Is_Available(WQ_SU_DASHBOARD_LINK_XPATH), true, "Support Dshboard link is available !");
    }

    @Test
    public void verify_Support_Dashboard_Link_Text() throws Exception {
       String dashboardSULink = data.getValueByName("SU_DashboardPage_SUDashboardLink");

       NavigateToPage();

       Assert.assertEquals(wqsuDashboardPage.verify_Data_Equals(WQ_SU_DASHBOARD_LINK_XPATH),dashboardSULink, "Support Dashboard Link verified !");
    }

    @Test
    public void verify_Clicking_Support_Dashboard_Link_Leads_To_Support_Dashboard_Of_The_User() throws Exception {
        String supportDashboardBrowserTitle = data.getValueByName("SU_DashboardPage_SupportDashboardBrowserTitle");

        NavigateToPage();
        wqdmDashboardPage.
                action_Click_Support_dsahboard_Link();

        Assert.assertEquals(wqsuDashboardPage.check_Browser_Title(),supportDashboardBrowserTitle, "Support Dashboard browser title verified ! !");
    }

    @Test
    public void verify_24x7Support_Tab_IsEnabled() throws Exception {
        NavigateToPage();
        wqdmDashboardPage.
                action_Click_Support_dsahboard_Link();

        Assert.assertEquals(wqsuDashboardPage.step_Get_Support_Dashboard_Status(WQ_SUPPORT_TILE_XPATH), "CaseMatch","Support Dashboard enabled !");
    }

    @Test
    public void verify_Clicking_24x7Support_Tab_Leads_To_Create_New_Case_Page() throws Exception {
        String createNewCasePageBrowserTitle = data.getValueByName("SU_CrateNewCasePage_BrowserTitle");

        NavigateToPage();
        wqdmDashboardPage.
                action_Click_Support_dsahboard_Link();
        wqsuDashboardPage.
                action_Click_24x7Support_Tab();

        Assert.assertEquals(wqsuDashboardPage.check_Browser_Title(),createNewCasePageBrowserTitle,"Browser title verified !");
    }

    @Test
    public void verify_Create_New_Case_Button_IsAvailable() throws Exception {
        NavigateToPage();
        wqdmDashboardPage.
                action_Click_Support_dsahboard_Link();

        Assert.assertEquals(wqsuDashboardPage.verify_Element_Is_Available(WQ_SU_CREATE_NEW_CASE_BUTTON_XPATH), true,"Create New Case button available !");
    }

    @Test
    public void verify_Clicking_Create_New_Case_Button_Leads_To_Create_New_Case_Page() throws Exception {
        String createNewCasePageBrowserTitle = data.getValueByName("SU_CrateNewCasePage_BrowserTitle");

        NavigateToPage();
        wqdmDashboardPage.
                action_Click_Support_dsahboard_Link();
        wqsuDashboardPage.
                action_Click_Create_Case_Button();

        Assert.assertEquals(wqsuDashboardPage.check_Browser_Title(),createNewCasePageBrowserTitle,"Browser title verified !");
    }

    // Approve Billable Hours Tile
    @Test
    public void  verify_Approve_Billable_Hours_Tile_IsAvailable() throws Exception {
        NavigateToPage();
        wqdmDashboardPage.
                action_Click_Support_dsahboard_Link();

        Assert.assertEquals(wqsuDashboardPage.verify_Element_Is_Available(WQ_SU_APPROVE_BILLABLE_HOURS_TILE_XPATH), true, "Approve Billable tile is available !" );
    }

    @Test
    public void verify_Approve_Billable_Hours_Tile_Text_IsAvailable() throws Exception {
        NavigateToPage();
        wqdmDashboardPage.
                action_Click_Support_dsahboard_Link();

        Assert.assertEquals(wqsuDashboardPage.verify_Data_Equals(WQ_SU_APPROVE_BILLABLE_HOURS_TILE_TEXT_XPATH), "Approve Billable Hours", "Approve Billable tile text verified !" );
    }

    @Test
    public void verify_Clicking_Approve_Billable_Hours_Tile_Leads_To_Resolved_Cases_Page() throws Exception {

        NavigateToPage();
        wqdmDashboardPage.
                action_Click_Support_dsahboard_Link();
        wqsuDashboardPage.
                action_Click_Approve_Billable_Hours_Tile();

        Assert.assertEquals(wqsuDashboardPage.verify_Data_Equals(WQ_SU_RESOLVE_CASE_PAGE_TILE_TEXT_XPATH), "Resolved Cases", "Verified navigation to Resolve case page !" );
    }

    // Open Case Tile
    @Test
    public void  verify_Open_Cases_Tile_IsAvailable() throws Exception {
        NavigateToPage();
        wqdmDashboardPage.
                action_Click_Support_dsahboard_Link();

        Assert.assertEquals(wqsuDashboardPage.verify_Element_Is_Available(WQ_SU_OPEN_CASES_TILE_XPATH), true, "Open Cases tile is available !" );
    }

    @Test
    public void verify_Open_Cases_Tile_Text_IsAvailable() throws Exception {
        NavigateToPage();
        wqdmDashboardPage.
                action_Click_Support_dsahboard_Link();

        Assert.assertEquals(wqsuDashboardPage.verify_Data_Equals(WQ_SU_OPEN_CASES_TILE_TEXT_XPATH), "Open Cases", "Approve Billable tile text verified !" );
    }

    @Test
    public void verify_Clicking_Open_Cases_Tile_Leads_To_New_Cases_Page() throws Exception {

        NavigateToPage();
        wqdmDashboardPage.
                action_Click_Support_dsahboard_Link();
        wqsuDashboardPage.
                action_Click_Open_Cases_Tile();

        Assert.assertEquals(wqsuDashboardPage.verify_Data_Equals(WQ_SU_NEW_CASES_PAGE_TILE_TEXT_XPATH), "New Cases", "Verified navigation to New Cases page !" );
    }

    // Response Required Tile
    @Test
    public void  verify_Response_Required_Tile_IsAvailable() throws Exception {
        NavigateToPage();
        wqdmDashboardPage.
                action_Click_Support_dsahboard_Link();

        Assert.assertEquals(wqsuDashboardPage.verify_Element_Is_Available(WQ_SU_RESPONSE_REQUIRED_TILE_XPATH), true, "Response Required tile is available !" );
    }

    @Test
    public void verify_Response_Required_Tile_Text_IsAvailable() throws Exception {
        NavigateToPage();
        wqdmDashboardPage.
                action_Click_Support_dsahboard_Link();

        Assert.assertEquals(wqsuDashboardPage.verify_Data_Equals(WQ_SU_RESPONSE_REQUIRED_TILE_TEXT_XPATH), "Response Required", "Approve Billable tile text verified !" );
    }

    @Test
    public void verify_Clicking_Response_Required_Tile_Leads_To_Awaiting_Response_Page() throws Exception {

        NavigateToPage();
        wqdmDashboardPage.
                action_Click_Support_dsahboard_Link();
        wqsuDashboardPage.
                action_Click_Response_Required_Tile();

        Assert.assertEquals(wqsuDashboardPage.verify_Data_Equals(WQ_SU_AWAITING_RESPONSE_PAGE_TITLE_TEXT_XPATH), "Awaiting Response", "Verified navigation to New Cases page !" );
    }

    // Closed Cases Tile
    @Test
    public void  verify_Closed_Cases_Tile_IsAvailable() throws Exception {
        NavigateToPage();
        wqdmDashboardPage.
                action_Click_Support_dsahboard_Link();

        Assert.assertEquals(wqsuDashboardPage.verify_Element_Is_Available(WQ_SU_CLOSED_CASES_TILE_XPATH), true, "Closed Cases tile is available !" );
    }

    @Test
    public void verify_Closed_Cases_Tile_Text_IsAvailable() throws Exception {
        NavigateToPage();
        wqdmDashboardPage.
                action_Click_Support_dsahboard_Link();

        Assert.assertEquals(wqsuDashboardPage.verify_Data_Equals(WQ_SU_CLOSED_CASES_TILE_TEXT_XPATH), "Closed Cases", "Approve Billable tile text verified !" );
    }

    @Test
    public void verify_Clicking_Closed_Cases_Tile_Leads_To_Closed_Cases_Page() throws Exception {

        NavigateToPage();
        wqdmDashboardPage.
                action_Click_Support_dsahboard_Link();
        wqsuDashboardPage.
                action_Click_Closed_Cases_Tile();

        Assert.assertEquals(wqsuDashboardPage.verify_Data_Equals(WQ_SU_CLOSED_CASES_PAGE_TITLE_TEXT_XPATH), "Closed Cases", "Verified navigation to New Cases page !" );
    }

    // All Cases Tile
    @Test
    public void  verify_All_Cases_Tile_IsAvailable() throws Exception {
        NavigateToPage();
        wqdmDashboardPage.
                action_Click_Support_dsahboard_Link();

        Assert.assertEquals(wqsuDashboardPage.verify_Element_Is_Available(WQ_SU_ALL_CASES_TILE_XPATH), true, "All Cases tile is available !" );
    }

    @Test
    public void verify_All_Cases_Tile_Text_IsAvailable() throws Exception {
        NavigateToPage();
        wqdmDashboardPage.
                action_Click_Support_dsahboard_Link();

        Assert.assertEquals(wqsuDashboardPage.verify_Data_Equals(WQ_SU_ALL_CASES_TILE_TEXT_XPATH), "All Cases", "Approve Billable tile text verified !" );
    }

    @Test
    public void verify_All_Closed_Cases_Tile_Leads_To_All_Cases_Page() throws Exception {

        NavigateToPage();
        wqdmDashboardPage.
                action_Click_Support_dsahboard_Link();
        wqsuDashboardPage.
                action_Click_All_Cases_Tile();

        Assert.assertEquals(wqsuDashboardPage.verify_Data_Equals(WQ_SU_ALL_CASES_PAGE_TITLE_TEXT_XPATH), "All Cases", "Verified navigation to New Cases page !" );
    }
}
