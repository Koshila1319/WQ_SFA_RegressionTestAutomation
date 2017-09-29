package com.totalamber.qa.WQTest;

import com.totalamber.qa.automation.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by s.wathsala on 9/28/2017.
 */
public class WQVerifyClientTest extends TestBase{

    @BeforeMethod
    public void NavigateToPage() throws InterruptedException, IOException {
        initDomainObjects(DRIVER);
        String siteUrl = data.getValueByName("BackOfficeUrl");
        setSiteURL(siteUrl);

    }

    @AfterMethod
    public void endTestMethod() throws Throwable{
        quitDriver();
    }


    //Login Page-BackOffice (SM Login)
    @Test
    public void verify_Login_Button_Leads_To_Sales_Manager_Dashboard_Page() throws InterruptedException {
        String AMUsername = data.getValueByName("SM_Username");
        String AMPassword = data.getValueByName("SM_Password");
        String WindowsAuthOption = data.getValueByName("SignInOption1");

        wqBackOfficeLoginPage.
                action_Login_as_BOUser(AMUsername,AMPassword);
        Thread.sleep(10000);
        wqBackOfficeLoginPage.
                action_selectAuthentication(WindowsAuthOption);

    }

    @Test
    public void verify_The_Page_Browser_Title() throws InterruptedException {
        String homePageBrowserTitle = data.getValueByName("SM_HomePage");
        verify_Login_Button_Leads_To_Sales_Manager_Dashboard_Page();
        Thread.sleep(10000);
        Assert.assertEquals(wqBackOfficeLoginPage.validate_BrowserTitle(), homePageBrowserTitle);
    }

    @Test
    public void verify_Created_Company_Name_Available_In_The_Pending_Clients_Section() throws InterruptedException {
        // Please run the below method after you registered the client details successfully

        verify_Login_Button_Leads_To_Sales_Manager_Dashboard_Page();
        String companyName = data.getValueByName("Company_Name");
        Assert.assertEquals(wqVerifyClientPage.check_Company_Is_Available(companyName), true);

    }

    //client tile verifications
    @Test
    public void verify_Clients_Title_Text() throws InterruptedException {

        String title="Clients";
        verify_Login_Button_Leads_To_Sales_Manager_Dashboard_Page();
        Assert.assertEquals(wqVerifyClientPage.check_Client_Tile_Name(),title);
    }

    @Test
    public void verify_Clients_Title_Leads_To_WebQuarters_Clients_List_Page() throws InterruptedException {
        String page_Name="WebQuarters Client List";
        verify_Login_Button_Leads_To_Sales_Manager_Dashboard_Page();
        wqVerifyClientPage.
                action_Navigate_To_WQ_Client_List_Page();
        Assert.assertEquals(wqVerifyClientPage.check_WQ_Client_List_Page_Name(),page_Name);
    }

    //To Be Assigned Clients Tile Verifications
    @Test
    public void verify_To_Be_Assigned_Clients_Tile_Text() throws InterruptedException {
        String title="To be assigned clients";
        verify_Login_Button_Leads_To_Sales_Manager_Dashboard_Page();
        Assert.assertEquals(wqVerifyClientPage.check_To_Be_Assigned_Client_Tile_Name(),title);
    }

    @Test
    public void verify_To_Be_Assigned_Clients_Tile_Leads_To_Pending_Clients_Page() throws InterruptedException {
        String page_Name="Pending Clients";
        verify_Login_Button_Leads_To_Sales_Manager_Dashboard_Page();
        wqVerifyClientPage.
                action_Navigate_To_Pending_Clients_Page();
        Assert.assertEquals(wqVerifyClientPage.check_WQ_Pending_Clients_Page_Name(),page_Name);
    }

    //Contractor Matching Tile Verifications
    @Test
    public void verify_Contractor_Matching_Tile_Text() throws InterruptedException {
        String title="Contractor Matching";
        verify_Login_Button_Leads_To_Sales_Manager_Dashboard_Page();
        Assert.assertEquals(wqVerifyClientPage.check_Contractor_Matching_Tile_Name(),title);
    }

    @Test
    public void verify_Contractor_Matching_Tile_Leads_To_Contractor_Match_Builder_Page() throws InterruptedException {
        String page_Name="Contractor Match Builder";
        verify_Login_Button_Leads_To_Sales_Manager_Dashboard_Page();
        wqVerifyClientPage.
                action_Navigate_To_Contractor_Match_Builder_Page();
        Assert.assertEquals(wqVerifyClientPage.check_WQ_Contractor_Match_Builder_Page_Name(),page_Name);
    }

    //Connections To Be Verified Tile Verifications
    @Test
    public void verify_Connections_To_Be_Verified_Tile_Text() throws InterruptedException {
        String title="Connections to be verified";
        verify_Login_Button_Leads_To_Sales_Manager_Dashboard_Page();
        Assert.assertEquals(wqVerifyClientPage.check_Connection_To_Be_Verified_Tile_Name(),title);
    }

    @Test
    public void verify_Connections_To_Be_Verified_Tile_Leads_To_Connection_Verification_Page() throws InterruptedException {
        String page_Name="Connection Verification";
        verify_Login_Button_Leads_To_Sales_Manager_Dashboard_Page();
        wqVerifyClientPage.
                action_Navigate_To_Connection_Verification_Page();
        Assert.assertEquals(wqVerifyClientPage.check_WQ_Connection_Verification_Page_Name(),page_Name);
    }

    //Engagements To Be Verified Tile Verifications
    @Test
    public void verify_Engagements_To_Be_Verified_Tile_Text() throws InterruptedException {
        String title="Engagements to be verified";
        verify_Login_Button_Leads_To_Sales_Manager_Dashboard_Page();
        Assert.assertEquals(wqVerifyClientPage.check_Engagement_To_Be_Verified_Tile_Name(),title);
    }

    @Test
    public void verify_Engagements_To_Be_Verified_Tile_Leads_To_Engagement_Survey_Approval_Page() throws InterruptedException {
        String page_Name="Engagement Survey Approval";
        verify_Login_Button_Leads_To_Sales_Manager_Dashboard_Page();
        wqVerifyClientPage.
                action_Navigate_To_Engagement_Survey_Approval_Page();
        Assert.assertEquals(wqVerifyClientPage.check_WQ_Engagement_Survey_Approval_Page_Name(),page_Name);

    }

    //Reports Tile Verifications
    @Test
    public void verify_Reports_Tile_Text() throws InterruptedException {
        String title="Reports";
        verify_Login_Button_Leads_To_Sales_Manager_Dashboard_Page();
        Assert.assertEquals(wqVerifyClientPage.check_Reports_Tile_Name(),title);
    }

    @Test
    public void verify_Reports_Tile_Leads_To_Back_Office_Reports_Page() throws InterruptedException {
        String page_Name="Back Office Reports";
        verify_Login_Button_Leads_To_Sales_Manager_Dashboard_Page();
        wqVerifyClientPage.
                action_Navigate_To_Back_Office_Reports_Page();
        Assert.assertEquals(wqVerifyClientPage.check_WQ_Report_Page_Name(),page_Name);

    }

    //Case ID Prefix Verifications
    @Test
    public void verify_Case_ID_Prefix_Tile_Text() throws InterruptedException {
        String title="Case ID Prefix";
        verify_Login_Button_Leads_To_Sales_Manager_Dashboard_Page();
        Assert.assertEquals(wqVerifyClientPage.check_Case_ID_Prefix_Tile_Name(),title);

    }

    @Test
    public void verify_Case_ID_Prefix_Tile_Leads_To_Set_Case_ID_Prefix_Page() throws InterruptedException {
        String page_Name="Set Case ID Prefix";
        verify_Login_Button_Leads_To_Sales_Manager_Dashboard_Page();
        wqVerifyClientPage.
                action_Navigate_To_Set_Case_ID_Prefix_Page();
        Assert.assertEquals(wqVerifyClientPage.check_Set_Case_ID_Prefix_Page_Name(),page_Name);
    }

    //Assign Users Verifcations
    @Test
    public void verify_Assign_Users_Tile_Text() throws InterruptedException {
        String title="Assign Users";
        verify_Login_Button_Leads_To_Sales_Manager_Dashboard_Page();
        Assert.assertEquals(wqVerifyClientPage.check_Assign_Users_Tile_Name(),title);
    }

    @Test
    public void verify_Assign_Users_Tile_Leads_To_Assign_Users_Page() throws InterruptedException {
        String page_Name="Assign Users";
        verify_Login_Button_Leads_To_Sales_Manager_Dashboard_Page();
        wqVerifyClientPage.
                action_Navigate_To_Assign_Users_Page();
        Assert.assertEquals(wqVerifyClientPage.check_Assign_Users_Page_Name(),page_Name);
    }

    //To Be Asiigned Partners Verifications
    @Test
    public void verify_To_Be_Assigned_Partners_Tile() throws InterruptedException {
        String title="To be assigned partners";
        verify_Login_Button_Leads_To_Sales_Manager_Dashboard_Page();
        Assert.assertEquals(wqVerifyClientPage.check_To_Be_Assigned_Partner_Tile_Name(),title);
    }

    //Verify Configuration Button Text
    @Test
    public void verify_Configuration_Button_Text() throws InterruptedException {
        String button_title="Configuration";
        verify_Login_Button_Leads_To_Sales_Manager_Dashboard_Page();
        Assert.assertEquals(wqVerifyClientPage.check_Configuration_Button_Text(),button_title);
    }

    @Test
    public void verify_Click_On_Configuration_Button_Leads_To_Sales_Manager_Configuration_Page() throws InterruptedException {
        String page_Name="Sales Manager Configuration";
        verify_Login_Button_Leads_To_Sales_Manager_Dashboard_Page();
        wqVerifyClientPage.
                action_Navigate_To_Sales_Manager_Configuration_Page();
        Assert.assertEquals(wqVerifyClientPage.check_Sales_Manager_Configuration_Page_Name(),page_Name);
    }

    @Test
    public void verify_Enter_Company_Name_Text_Feild_Available() throws InterruptedException {
        verify_Login_Button_Leads_To_Sales_Manager_Dashboard_Page();
        wqVerifyClientPage.
                check_Company_Name_Text_Box_Available();
    }

    @Test
    public void verify_The_Copyright_Info_Available_At_The_Bottom_Of_The_Page() throws InterruptedException {
        String copyRightInfo="Copyright WebQuarters 2015";
        verify_Login_Button_Leads_To_Sales_Manager_Dashboard_Page();
        Assert.assertEquals(wqVerifyClientPage.check_CopyRight_Info_Available(),copyRightInfo);
    }




}
