package com.totalamber.qa.WQTest;

import com.totalamber.qa.automation.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by s.wathsala on 10/3/2017.
 */
public class WQClientCompanyProfileTest extends TestBase {

    @BeforeMethod
    public void NavigateToPage() throws InterruptedException, IOException {
        initDomainObjects(DRIVER);
        String siteUrl = data.getValueByName("url");
        setSiteURL(siteUrl);

    }

    @AfterMethod
    public void endTestMethod() throws Throwable{
        //quitDriver();
    }

    @Test
    public void verify_The_Compnay_Profile_Link_Leads_To_Company_Profile_Page()    throws Exception {
        String Uname = data.getValueByName("VALIDUNAME");
        String Password = data.getValueByName("VALIDPASSWORD");
        wqHomePage.
                action_Navigate_To_LoginPage();
        wqLoginPage.
                step_User_Enter_Given_Credentials(Uname,Password).
                step_User_Click_Login_Button();
        wqClientCompanyProfilePage.
                action_Navigate_To_HomePage().
                action_Navigate_To_Company_Profile_Page();
    }

   @Test
    public void verify_The_Page_Mandatory_Information() throws Exception {
        String Uname = data.getValueByName("VALIDUNAME");
        String Password = data.getValueByName("VALIDPASSWORD");
        String Company_Name=data.getValueByName("CompanyDetails_CompanyName");
        String Company_Address=data.getValueByName("CompanyDetails_Address");
        String City=data.getValueByName("CompanyDetails_City");
        String Country= data.getValueByName("CompanyDetails_Country");
        String PhoneNo=data.getValueByName("ClientDetails_Dial");
        String Billing_Name=data.getValueByName("CompanyDetails_CompanyName");
        String Phone_Number=data.getValueByName("ClientDetails_Dial");
        String Organization_Size= data.getValueByName("CompanyDetails_Organization_Size");
        String SWApp=data.getValueByName("Software_Application");
        String Module= data.getValueByName("Software_Module");
        String Version=data.getValueByName("Software_Version");

       wqHomePage.
                action_Navigate_To_LoginPage();
        wqLoginPage.
                step_User_Enter_Given_Credentials(Uname,Password).
                step_User_Click_Login_Button();
        wqClientCompanyProfilePage.
                action_Navigate_To_HomePage().
                action_Navigate_To_Company_Profile_Page();
        Assert.assertEquals(wqClientCompanyProfilePage.check_Company_Name(),Company_Name);
        Assert.assertEquals(wqClientCompanyProfilePage.check_Company_Address(),Company_Address);
        Assert.assertEquals(wqClientCompanyProfilePage.check_City(),City);
        Assert.assertEquals(wqClientCompanyProfilePage.check_Country(),Country);
        Assert.assertEquals(wqClientCompanyProfilePage.check_PhoneNo(),PhoneNo);
        Assert.assertEquals(wqClientCompanyProfilePage.check_Billing_Name(),Billing_Name);
        Assert.assertEquals(wqClientCompanyProfilePage.check_Phone_Number(),Phone_Number);
        Assert.assertEquals(wqClientCompanyProfilePage.check_Organization_Size(),Organization_Size);
        Assert.assertEquals(wqClientCompanyProfilePage.check_SW_App(),SWApp);
        Assert.assertEquals(wqClientCompanyProfilePage.check_Module(),Module);
        Assert.assertEquals(wqClientCompanyProfilePage.check_Version(),Version);
    }

    @Test
    public void verify_Company_Profile_Browser_Title() throws Exception {
        String Uname = data.getValueByName("VALIDUNAME");
        String Password = data.getValueByName("VALIDPASSWORD");
        wqHomePage.
                action_Navigate_To_LoginPage();
        wqLoginPage.
                step_User_Enter_Given_Credentials(Uname,Password).
                step_User_Click_Login_Button();
        wqClientCompanyProfilePage.
                action_Navigate_To_HomePage().
                action_Navigate_To_Company_Profile_Page();
         Assert.assertEquals(wqClientCompanyProfilePage.check_Company_Profile_Page_Browser_Title(),"WebQuarters Company Profile");

    }

    @Test
    public void verify_Company_Profile_Details_Available() throws Exception {
        String Uname = data.getValueByName("VALIDUNAME");
        String Password = data.getValueByName("VALIDPASSWORD");
        String Company_Name=data.getValueByName("CompanyDetails_CompanyName");
        String Company_Address=data.getValueByName("CompanyDetails_Address");
        String City=data.getValueByName("CompanyDetails_City");
        String Country=data.getValueByName("CompanyDetails_Country");
        wqHomePage.
                action_Navigate_To_LoginPage();
        wqLoginPage.
                step_User_Enter_Given_Credentials(Uname,Password).
                step_User_Click_Login_Button();
        wqClientCompanyProfilePage.
                action_Navigate_To_HomePage().
                action_Navigate_To_Company_Profile_Page();

        Assert.assertEquals(wqClientCompanyProfilePage.check_Company_Name_Info(),Company_Name+" WebQuarters");
        Assert.assertEquals(wqClientCompanyProfilePage.check_Company_Profile_Text(),"Company Profile");
        Assert.assertEquals(wqClientCompanyProfilePage.check_Company(),Company_Name+",");
        Assert.assertEquals(wqClientCompanyProfilePage.check_Company_Address_Info(),Company_Address+",");
        Assert.assertEquals(wqClientCompanyProfilePage.check_Company_City_Info(),City+",");
        Assert.assertEquals(wqClientCompanyProfilePage.check_Country_Info(),Country);
    }

    @Test
    public void verify_Edit_Button_IsAvailable() throws Exception {
        String Uname = data.getValueByName("VALIDUNAME");
        String Password = data.getValueByName("VALIDPASSWORD");
        wqHomePage.
                action_Navigate_To_LoginPage();
        wqLoginPage.
                step_User_Enter_Given_Credentials(Uname,Password).
                step_User_Click_Login_Button();
        wqClientCompanyProfilePage.
                action_Navigate_To_HomePage().
                action_Navigate_To_Company_Profile_Page();
        Assert.assertTrue(wqClientCompanyProfilePage.check_Edit_Button_Available());
    }

    @Test
    public void verify_Clicking_Edit_Button_Leads_To_Client_Profile_Update_page() throws Exception {
        String Uname = data.getValueByName("VALIDUNAME");
        String Password = data.getValueByName("VALIDPASSWORD");
        wqHomePage.
                action_Navigate_To_LoginPage();
        wqLoginPage.
                step_User_Enter_Given_Credentials(Uname,Password).
                step_User_Click_Login_Button();
        wqClientCompanyProfilePage.
                action_Navigate_To_HomePage().
                action_Navigate_To_Company_Profile_Page().
                click_Edit_Button();
        Assert.assertEquals(wqClientCompanyProfilePage.check_Client_Profile_Update_Page_Title(),"Client Profile Update");
    }

    @Test
    public void verify_CopyRight_Info_Availability() throws Exception {
        String Uname = data.getValueByName("VALIDUNAME");
        String Password = data.getValueByName("VALIDPASSWORD");
        wqHomePage.
                action_Navigate_To_LoginPage();
        wqLoginPage.
                step_User_Enter_Given_Credentials(Uname,Password).
                step_User_Click_Login_Button();
        wqClientCompanyProfilePage.
                action_Navigate_To_HomePage().
                action_Navigate_To_Company_Profile_Page();
        Assert.assertTrue(wqClientCompanyProfilePage.check_CopyRight_Info_Available(),"Copyright WebQuarters 2015");

    }

    @Test
    public void verify_Company_Logo_Availability() throws Exception {
        String Uname = data.getValueByName("VALIDUNAME");
        String Password = data.getValueByName("VALIDPASSWORD");
        wqHomePage.
                action_Navigate_To_LoginPage();
        wqLoginPage.
                step_User_Enter_Given_Credentials(Uname,Password).
                step_User_Click_Login_Button();
        wqClientCompanyProfilePage.
                action_Navigate_To_HomePage().
                action_Navigate_To_Company_Profile_Page();
        Assert.assertTrue(wqClientCompanyProfilePage.check_Company_Logo_Available());
    }

    @Test
    public void verify_User_Profile_Link_Leads_To_User_Profile_Page() throws Exception {
        String Uname = data.getValueByName("VALIDUNAME");
        String Password = data.getValueByName("VALIDPASSWORD");
        wqHomePage.
                action_Navigate_To_LoginPage();
        wqLoginPage.
                step_User_Enter_Given_Credentials(Uname,Password).
                step_User_Click_Login_Button();
        wqClientCompanyProfilePage.
                action_Navigate_To_HomePage().
                action_Navigate_To_Company_Profile_Page().
                click_User_Profile_Link();
        Assert.assertEquals(wqClientCompanyProfilePage.check_Link_Leads_To_User_Profile_Page(),"WebQuarters View User Profile");
    }

    @Test
    public void verify_Dicision_Maker_Dashboard_Link_Leads_To_WQ_DM_Portal_Page() throws Exception {
        String Uname = data.getValueByName("VALIDUNAME");
        String Password = data.getValueByName("VALIDPASSWORD");
        wqHomePage.
                action_Navigate_To_LoginPage();
        wqLoginPage.
                step_User_Enter_Given_Credentials(Uname,Password).
                step_User_Click_Login_Button();
        wqClientCompanyProfilePage.
                action_Navigate_To_HomePage().
                action_Navigate_To_Company_Profile_Page();
                Thread.sleep(10000);
        wqClientCompanyProfilePage.click_DM_Dashboard_Link();
        Assert.assertEquals(wqClientCompanyProfilePage.check_Link_Leads_To_WQ_DM_Portal_Page(),"WebQuarters DM Portal");
    }

    @Test
    public void verify_User_Can_Logout_From_The_System() throws Exception {String Uname = data.getValueByName("VALIDUNAME");
        String Password = data.getValueByName("VALIDPASSWORD");
        wqHomePage.
                action_Navigate_To_LoginPage();
        wqLoginPage.
                step_User_Enter_Given_Credentials(Uname,Password).
                step_User_Click_Login_Button();
        wqClientCompanyProfilePage.
                action_Navigate_To_HomePage().
                action_Navigate_To_Company_Profile_Page().
                click_On_Sign_Out_Button();
        Assert.assertEquals(wqClientCompanyProfilePage.check_User_Redirect_To_Home_Page(),"WebQuarters Home Page");
    }

    @Test
    public void verify_Top_Navigation_Panel_Available() throws Exception {
        String Uname = data.getValueByName("VALIDUNAME");
        String Password = data.getValueByName("VALIDPASSWORD");
        wqHomePage.
                action_Navigate_To_LoginPage();
        wqLoginPage.
                step_User_Enter_Given_Credentials(Uname,Password).
                step_User_Click_Login_Button();
        wqClientCompanyProfilePage.
                action_Navigate_To_HomePage().
                action_Navigate_To_Company_Profile_Page();
        Assert.assertTrue(wqClientCompanyProfilePage.verify_Top_Navigation_Panel_Available());
    }

    @Test
    public void verify_WQ_Logo_Available() throws Exception {String Uname = data.getValueByName("VALIDUNAME");
        String Password = data.getValueByName("VALIDPASSWORD");
        wqHomePage.
                action_Navigate_To_LoginPage();
        wqLoginPage.
                step_User_Enter_Given_Credentials(Uname,Password).
                step_User_Click_Login_Button();
        wqClientCompanyProfilePage.
                action_Navigate_To_HomePage().
                action_Navigate_To_Company_Profile_Page();
        Assert.assertTrue(wqClientCompanyProfilePage.verify_WQ_Logo_Available());
    }

    @Test
    public void verify_User_Can_Navigate_To_Update_Profile_Page_Using_The_Setting_Option() throws Exception {String Uname = data.getValueByName("VALIDUNAME");
        String Password = data.getValueByName("VALIDPASSWORD");
        wqHomePage.
                action_Navigate_To_LoginPage();
        wqLoginPage.
                step_User_Enter_Given_Credentials(Uname,Password).
                step_User_Click_Login_Button();
        wqClientCompanyProfilePage.
                action_Navigate_To_HomePage().
                action_Navigate_To_Company_Profile_Page().
                click_On_Settings_Option().
                click_On_Update_Profile_Link();
        Assert.assertEquals(wqClientCompanyProfilePage.check_User_Ridirects_To_Update_Profile_Page(),"WebQuarters Company Profile Update");
    }

    @Test
    public void verify_User_Can_Navigate_To_Change_Password_Page_Using_The_Setting_Option() throws Exception {String Uname = data.getValueByName("VALIDUNAME");
        String Password = data.getValueByName("VALIDPASSWORD");
        wqHomePage.
                action_Navigate_To_LoginPage();
        wqLoginPage.
                step_User_Enter_Given_Credentials(Uname,Password).
                step_User_Click_Login_Button();
        wqClientCompanyProfilePage.
                action_Navigate_To_HomePage().
                action_Navigate_To_Company_Profile_Page().
                click_On_Settings_Option().
                click_On_Change_Password_Link();
        Assert.assertEquals(wqClientCompanyProfilePage.check_User_Ridirects_To_Change_Password_Page(),"WebQuarters Change User Credential");
    }

    @Test
    public void verify_User_Can_Navigate_To_Decision_Maker_Decision_Dashboard_Page_Using_The_Setting_Option() throws Exception {String Uname = data.getValueByName("VALIDUNAME");
        String Password = data.getValueByName("VALIDPASSWORD");
        wqHomePage.
                action_Navigate_To_LoginPage();
        wqLoginPage.
                step_User_Enter_Given_Credentials(Uname,Password).
                step_User_Click_Login_Button();
        wqClientCompanyProfilePage.
                action_Navigate_To_HomePage().
                action_Navigate_To_Company_Profile_Page().
                click_On_Settings_Option().
                click_On_DM_Dashboard_Link();
        Assert.assertEquals(wqClientCompanyProfilePage.check_User_Ridirects_To_DM_Dashboard_Page(),"WebQuarters DM Portal");
    }

    @Test
    public void verify_Client_Profile_Update() throws Exception {
        String Uname = data.getValueByName("VALIDUNAME");
        String Password = data.getValueByName("VALIDPASSWORD");
        wqHomePage.
                action_Navigate_To_LoginPage();
        wqLoginPage.
                step_User_Enter_Given_Credentials(Uname,Password).
                step_User_Click_Login_Button();
        wqClientCompanyProfilePage.
                action_Navigate_To_HomePage().
                action_Navigate_To_Company_Profile_Page().
                click_Edit_Button();
    }




}
