package com.totalamber.qa.WQTest;

import com.totalamber.qa.automation.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by s.wathsala on 10/6/2017.
 */
public class WQUserProfileTest extends TestBase {
    @BeforeMethod
    public void NavigateToPage() throws InterruptedException, IOException {
        initDomainObjects(DRIVER);
        String siteUrl = data.getValueByName("url");
        setSiteURL(siteUrl);

    }

    @AfterMethod
    public void endTestMethod() throws Throwable{
       quitDriver();
    }

    @Test
    public void verify_Clicking_User_profile_Link_Leads_To_User_Profile_Page() throws Exception {

        String Uname = data.getValueByName("DM_SU_UserName");
        String Password = data.getValueByName("DM_SU_Password");
        wqHomePage.
                action_Navigate_To_LoginPage();
        wqLoginPage.
                step_User_Enter_Given_Credentials(Uname,Password).
                step_User_Click_Login_Button();
        wqClientCompanyProfilePage.
                action_Navigate_To_HomePage();
        wqUserProfilePage.click_User_Profile_Link();
        Assert.assertEquals(wqUserProfilePage.check_Page_Name(),"Personal Profile");
    }

    @Test
    public void verify_User_Profile_Browser_Title() throws Exception {
        String Uname = data.getValueByName("DM_SU_UserName");
        String Password = data.getValueByName("DM_SU_Password");
        wqHomePage.
                action_Navigate_To_LoginPage();
        wqLoginPage.
                step_User_Enter_Given_Credentials(Uname,Password).
                step_User_Click_Login_Button();
        wqClientCompanyProfilePage.
                action_Navigate_To_HomePage();
        wqUserProfilePage.click_User_Profile_Link();
        Assert.assertEquals(wqUserProfilePage.check_Page_Title(),"WebQuarters View User Profile");

    }

    @Test
    public void verify_User_Profile_Details_Available() throws Exception {
        String Uname = data.getValueByName("DM_SU_UserName");
        String Password = data.getValueByName("DM_SU_Password");
        String Company_Name=data.getValueByName("CompanyDetails_CompanyName");
        String Company_Address=data.getValueByName("CompanyDetails_Address");
        String City=data.getValueByName("CompanyDetails_City");
        String Country=data.getValueByName("CompanyDetails_Country");
        String FirstName=data.getValueByName("CompanyDetails_FirstName");
        String LastName=data.getValueByName("CompanyDetails_LastName");
        String Designation=data.getValueByName("ClientDetails_Designation");
        String Email=data.getValueByName("ClientDetails_Email");
        String Phone_No=data.getValueByName("CompanyDetails_Phone");

        wqHomePage.
                action_Navigate_To_LoginPage();
        wqLoginPage.
                step_User_Enter_Given_Credentials(Uname,Password).
                step_User_Click_Login_Button();
        wqClientCompanyProfilePage.
                action_Navigate_To_HomePage();
        wqUserProfilePage.click_User_Profile_Link();
        Assert.assertEquals(wqUserProfilePage.check_Page_Info(),Company_Name+" WebQuarters");
        Assert.assertEquals(wqUserProfilePage.check_Contact_Info(),Company_Name+" "+Company_Address+","+" "+City+","+" "+Country+".");
        Assert.assertEquals(wqUserProfilePage.check_First_Name(),FirstName);
        Assert.assertEquals(wqUserProfilePage.check_Last_Name(),LastName);
        Assert.assertEquals(wqUserProfilePage.check_Designation(),Designation);
        Assert.assertEquals(wqUserProfilePage.check_Email(),Email);
        Assert.assertEquals(wqUserProfilePage.check_Phone_No(),Phone_No);

    }

        @Test
        public void verify_Edit_Button_IsAvailable() throws Exception {
            String Uname = data.getValueByName("DM_SU_UserName");
            String Password = data.getValueByName("DM_SU_Password");
            wqHomePage.
                    action_Navigate_To_LoginPage();
            wqLoginPage.
                    step_User_Enter_Given_Credentials(Uname,Password).
                    step_User_Click_Login_Button();
            wqClientCompanyProfilePage.
                    action_Navigate_To_HomePage();
            wqUserProfilePage.click_User_Profile_Link();
            Assert.assertTrue(wqUserProfilePage.check_Edit_Button_Available());

        }

        @Test
        public void verfy_Clicking_Edit_Button_Leads_To_User_Profile_Update_page() throws Exception {
            String Uname = data.getValueByName("DM_SU_UserName");
            String Password = data.getValueByName("DM_SU_Password");
            wqHomePage.
                    action_Navigate_To_LoginPage();
            wqLoginPage.
                    step_User_Enter_Given_Credentials(Uname,Password).
                    step_User_Click_Login_Button();
            wqClientCompanyProfilePage.
                    action_Navigate_To_HomePage();
            wqUserProfilePage.
                    click_User_Profile_Link().
                    click_On_Edit_Button();
            Assert.assertEquals(wqUserProfilePage.check_Profile_Update_Page_Name(),"User Profile Update");
        }

        @Test
        public void verify_Update_Company_Profile_Details() throws Exception {
            String Uname = data.getValueByName("DM_SU_UserName");
            String Password = data.getValueByName("DM_SU_Password");
            String mobile=data.getValueByName("DM_SU_Mobile");
            String office_Site=data.getValueByName("DM_SU_OfficeSite");

            String filepath2 = data.getValueByName("ClientProfileUpdate_ProfilePic2");
            wqHomePage.
                    action_Navigate_To_LoginPage();
            wqLoginPage.
                    step_User_Enter_Given_Credentials(Uname,Password).
                    step_User_Click_Login_Button();
            wqClientCompanyProfilePage.
                    action_Navigate_To_HomePage();
            wqUserProfilePage.
                    click_User_Profile_Link().
                    click_On_Edit_Button().
                    enter_Mobile(mobile).
                    enter_Office_Site(office_Site).
                    step_click_Profile_Pic_Upload_button(filepath2).
                    click_Update_Button();

        }


        @Test
    public void verify_Updated_Details_Available() throws Exception {
            String Uname = data.getValueByName("DM_SU_UserName");
            String Password = data.getValueByName("DM_SU_Password");
            String mobile=data.getValueByName("DM_SU_Mobile");
            String office_Site=data.getValueByName("DM_SU_OfficeSite");

            String filepath2 = data.getValueByName("ClientProfileUpdate_ProfilePic2");
            wqHomePage.
                    action_Navigate_To_LoginPage();
            wqLoginPage.
                    step_User_Enter_Given_Credentials(Uname,Password).
                    step_User_Click_Login_Button();
            wqClientCompanyProfilePage.
                    action_Navigate_To_HomePage();
            wqUserProfilePage.
                    click_User_Profile_Link().
                    click_On_Edit_Button().
                    enter_Mobile(mobile).
                    enter_Office_Site(office_Site).
                    step_click_Profile_Pic_Upload_button(filepath2).
                    click_Update_Button();
            Assert.assertEquals(wqUserProfilePage.check_office_Site(),office_Site);
            Assert.assertEquals(wqUserProfilePage.check_Mobile_No(),mobile);

        }
        }





