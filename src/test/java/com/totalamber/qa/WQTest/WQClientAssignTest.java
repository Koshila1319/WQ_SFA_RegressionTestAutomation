package com.totalamber.qa.WQTest;

import com.totalamber.qa.automation.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by s.wathsala on 9/29/2017.
 */
public class WQClientAssignTest extends TestBase{

    @BeforeMethod
    public void NavigateToPage() throws InterruptedException, IOException {

        initDomainObjects(DRIVER);
        String siteUrl = data.getValueByName("BackOfficeUrl");
        setSiteURL(siteUrl);
        String AMUsername = data.getValueByName("SM_Username");
        String AMPassword = data.getValueByName("SM_Password");
        String WindowsAuthOption = data.getValueByName("SignInOption1");
        wqBackOfficeLoginPage.
                action_Login_as_BOUser(AMUsername,AMPassword);
        Thread.sleep(10000);
        wqBackOfficeLoginPage.
                action_selectAuthentication(WindowsAuthOption);
        Thread.sleep(10000);

    }

    @AfterMethod
    public void endTestMethod() throws Throwable{
       quitDriver();
    }


    @Test
    public void verify_Company_Name_Link_Leads_To_Assign_Page() throws InterruptedException {

        String Company_Name=data.getValueByName("CompanyDetails_CompanyName");
        wqClientAssignPage.
                action_Navigate_To_Assign_Page_By_Click_On_Link(Company_Name);
        Assert.assertEquals(wqClientAssignPage.check_Page_Name(),"Assign");
    }

    @Test
    public void verify_New_Company_Data_Display_As_Not_Verified_By_Click_On_Go_Button() throws InterruptedException {

        String Company_Name="Taprobane";
        wqClientAssignPage.
                search_Company_Name(Company_Name).
                click_On_Go_Button();
        Assert.assertEquals(wqClientAssignPage.not_Verified_Data(),"Taprobane - Not verified");
    }

    @Test
    public void verify_Verified_Company_Names_Can_Be_Searched_By_Click_On_Go_Button() throws InterruptedException {

        String Company_Name="Taprobane";
        wqClientAssignPage.
                search_Company_Name(Company_Name).
                click_On_Go_Button();

    }

    @Test
    public void verify_User_Can_Search_Company_In_The_Enter_Company_Name_Text_Feild() throws InterruptedException {
        String Company_Name="Taprobane";
        wqClientAssignPage.search_Company_Name(Company_Name);
        Thread.sleep(2000);
        wqClientAssignPage.
                click_On_Enter_Button();
    }

    @Test
    public void verify_The_Page_Browser_Title(){
        String Company_Name=data.getValueByName("CompanyDetails_CompanyName");
        wqClientAssignPage.
                action_Navigate_To_Assign_Page_By_Click_On_Link(Company_Name);
        Assert.assertEquals(wqClientAssignPage.check_Page_Title(),"WebQuarters Pending Client Assignment Page");
    }

    @Test
    public void verify_The_Assign_Page_Title()
    {
        String Company_Name=data.getValueByName("CompanyDetails_CompanyName");
        wqClientAssignPage.
                action_Navigate_To_Assign_Page_By_Click_On_Link(Company_Name);
        Assert.assertEquals(wqClientAssignPage.check_Page_Name(),"Assign");
    }

    @Test
    public void verify_Company_Details_Info_Are_Correct()
    {
        String Company_Name=data.getValueByName("CompanyDetails_CompanyName");
        String Address=data.getValueByName("CompanyDetails_Address");
        String City=data.getValueByName("CompanyDetails_City");
        String Country=data.getValueByName("CompanyDetails_Country");
        String Phone_Number=data.getValueByName("CompanyDetails_Phone");

        wqClientAssignPage.
                action_Navigate_To_Assign_Page_By_Click_On_Link(Company_Name);
        Assert.assertEquals(wqClientAssignPage.check_Company_Name(),Company_Name);
        Assert.assertEquals(wqClientAssignPage.check_Address(),Address);
        Assert.assertEquals(wqClientAssignPage.check_City(),City);
        Assert.assertEquals(wqClientAssignPage.check_Country(),Country);
        Assert.assertEquals(wqClientAssignPage.check_Phone(),Phone_Number);

    }

    @Test
    public void verify_Client_Details_Info_Are_Correct(){
        String Company_Name=data.getValueByName("CompanyDetails_CompanyName");
        String FirstName=data.getValueByName("CompanyDetails_FirstName");
        String LastName=data.getValueByName("CompanyDetails_LastName");
        String Direct_Dial=data.getValueByName("ClientDetails_Dial");
        String Contact_Email=data.getValueByName("ClientDetails_Email");
        String Designation=data.getValueByName("ClientDetails_Designation");
        wqClientAssignPage.
                action_Navigate_To_Assign_Page_By_Click_On_Link(Company_Name);
        Assert.assertEquals(wqClientAssignPage.check_Client_Name(),FirstName+" "+LastName);
        Assert.assertEquals(wqClientAssignPage.check_Direct_Dial(),Direct_Dial);
        Assert.assertEquals(wqClientAssignPage.check_Contact_Email(),Contact_Email);
        Assert.assertEquals(wqClientAssignPage.check_Designation(),Designation);

    }

    @Test
    public void verify_Software_Experience_Info_Are_Correct(){
        String Company_Name=data.getValueByName("CompanyDetails_CompanyName");
        String SW_App=data.getValueByName("Software_Application");
        String SW_Version=data.getValueByName("Software_Version");
        String SW_Module=data.getValueByName("Software_Module");
        wqClientAssignPage.
                action_Navigate_To_Assign_Page_By_Click_On_Link(Company_Name);
        Assert.assertEquals(wqClientAssignPage.check_SW_App(),SW_App);
        Assert.assertEquals(wqClientAssignPage.check_SW_Version(),SW_Version);
        Assert.assertEquals(wqClientAssignPage.check_Module(),SW_Module);
    }


    @Test
    public void verify_The_Assign_To_Drop_Down_Is_Available()
    {
        String Company_Name=data.getValueByName("CompanyDetails_CompanyName");
        wqClientAssignPage.
                action_Navigate_To_Assign_Page_By_Click_On_Link(Company_Name).
                check_Drop_Down_Is_Available();
    }

    @Test
    public void verify_Assign_Button_Available()
    {
        String Company_Name=data.getValueByName("CompanyDetails_CompanyName");
        wqClientAssignPage.
                action_Navigate_To_Assign_Page_By_Click_On_Link(Company_Name).
                check_Assign_Button_Is_Available();
    }

    @Test
    public void verify_Assign_Button_Text()
    {
        String Company_Name=data.getValueByName("CompanyDetails_CompanyName");
        wqClientAssignPage.
                action_Navigate_To_Assign_Page_By_Click_On_Link(Company_Name);
        Assert.assertEquals(wqClientAssignPage.check_Assign_Button_Text(),"Assign");
    }

    @Test
    public void verify_The_Copy_Right_Info()
    {
        String Company_Name=data.getValueByName("CompanyDetails_CompanyName");
        wqClientAssignPage.
                action_Navigate_To_Assign_Page_By_Click_On_Link(Company_Name);
        Assert.assertEquals(wqClientAssignPage.check_CopyRight_Info(),"Copyright WebQuarters 2015");
    }

    @Test
    public void verify_User_Can_Select_AM_From_The_DropDown()
    {
        String Company_Name=data.getValueByName("CompanyDetails_CompanyName");
        wqClientAssignPage.
                action_Navigate_To_Assign_Page_By_Click_On_Link(Company_Name);
        wqClientAssignPage.select_AM_From_DropDown();
    }

    @Test
    public void verify_User_Can_Assign_A_AM_Successfully() throws InterruptedException {
        String Company_Name=data.getValueByName("CompanyDetails_CompanyName");
        wqClientAssignPage.
                action_Navigate_To_Assign_Page_By_Click_On_Link(Company_Name);
        wqClientAssignPage.select_AM_From_DropDown();
        Thread.sleep(1000);
        wqClientAssignPage.click_On_Assign_Button();
    }

    /*@Test
    public void verify_User_Cannot_Assign_An_AM_Without_Selecting_AM_From_The_DropDown() throws InterruptedException {
        String URL="http://qa.webquarters.com:33366/Pages/WQSMDashboard.aspx";
        String Company_Name=data.getValueByName("CompanyDetails_CompanyName");
        wqClientAssignPage.
                action_Navigate_To_Assign_Page_By_Click_On_Link(Company_Name);
        wqClientAssignPage.click_On_Assign_Button();
        Thread.sleep(1000);
        Assert.assertEquals(wqClientAssignPage.check_The_Page_Ridirection(),URL);
    }
    */

    @Test
    public void verify_User_Redirects_SM_Dashboard_After_Assigning_AM() throws InterruptedException {
        String Company_Name=data.getValueByName("CompanyDetails_CompanyName");
        String URL="http://qa.webquarters.com:33366/Pages/WQSMDashboard.aspx";
        wqClientAssignPage.
                action_Navigate_To_Assign_Page_By_Click_On_Link(Company_Name);
        wqClientAssignPage.select_AM_From_DropDown();
        Thread.sleep(1000);
        wqClientAssignPage.click_On_Assign_Button();
        Assert.assertEquals(wqClientAssignPage.check_The_Page_Ridirection(),URL);

    }



}
