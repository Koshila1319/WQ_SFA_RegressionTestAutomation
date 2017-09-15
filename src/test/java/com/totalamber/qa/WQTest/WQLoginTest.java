package com.totalamber.qa.WQTest;

import com.totalamber.qa.automation.TestBase;
import org.testng.Assert;
import org.testng.annotations.*;

import java.io.IOException;

/**
 * Created by s.wathsala on 8/25/2017.
 */
public class WQLoginTest extends TestBase {


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


    @Test(enabled = false)
    public void verify_User_Enter_Valid_Login_Credentials() throws Exception {
        String Uname = data.getValueByName("VALIDUNAME");
        String Password = data.getValueByName("VALIDPASSWORD");
        wqHomePage.
                action_Navigate_To_LoginPage();
        wqLoginPage.
                Step_User_Enter_Given_Credentials(Uname,Password).
                step_User_Click_Login_Button();
    }

    @Test
    public void verify_User_Leave_User_Credential_Fields_Blank() throws Exception{
        String Uname = data.getValueByName("BLANKUNAME");
        String Password = data.getValueByName("BLANKPASSWORD");
        wqHomePage.
                action_Navigate_To_LoginPage();
        wqLoginPage.
                Step_User_Enter_Given_Credentials(Uname,Password).
                step_User_Click_Login_Button().
                check_And_Validate_Error_Message();
    }

    @Test
    public void verify_User_Enter_A_Invalid_UName_And_Valid_Password() throws Exception{
        String Uname = "INVALIDUNAME";
        String Password = "VALIDPASSWORD";
        wqHomePage.
                action_Navigate_To_LoginPage();
        wqLoginPage.
                Step_User_Enter_Given_Credentials(Uname,Password).
                step_User_Click_Login_Button().
                check_And_Validate_Error_Message();
    }
    @Test
    public void verify_User_Enter_A_Valid_UName_And_Blank_Password() throws Exception{
        String Uname = "VALIDUNAME";
        String Password = "BLANKPASSWORD";
        wqHomePage.
                action_Navigate_To_LoginPage();
        wqLoginPage.
                Step_User_Enter_Given_Credentials(Uname,Password).
                step_User_Click_Login_Button().
                check_And_Validate_Error_Message();
    }
    @Test
    public void verify_User_Enter_A_Valid_UName_And_Invalid_Password() throws Exception{
        String Uname = "VALIDUNAME";
        String Password = "INVALIDPASSWORD";
        wqHomePage.
                action_Navigate_To_LoginPage();
        wqLoginPage.
                Step_User_Enter_Given_Credentials(Uname,Password).
                step_User_Click_Login_Button().
                check_And_Validate_Error_Message();
    }
    @Test
    public void verify_User_Logout() throws Exception{
        String Uname = "VALIDUNAME";
        String Password = "VALIDPASSWORD";
        wqHomePage.
                action_Navigate_To_LoginPage();
        wqLoginPage.
                Step_User_Enter_Given_Credentials(Uname,Password).
                step_User_Click_Login_Button().
                check_And_Validate_Error_Message();
    }

//Login Page General

    @Test
    public void verify_The_Login_Page_Browser_Title()
    {
        String title="Sign In";
        wqHomePage.
                action_Navigate_To_LoginPage();
        Assert.assertEquals(title,wqLoginPage.check_Login_Page_Browser_Title());

    }

    @Test
    public void verify_The_WQ_LogoIs_Available()
    {
        wqHomePage.
                action_Navigate_To_LoginPage();
        wqLoginPage.check_WQ_Logo_Is_Available();

    }

    @Test
    public void verify_The_Login_Page_Live_Assistance_Option_Is_Available()
    {
        wqHomePage.
                action_Navigate_To_LoginPage();
        wqLoginPage.check_Login_Page_Live_Assitane_Option_Available();
    }

    //Username

    @Test
    public void verify_The_Username_Field_Is_Available()
    {
        wqHomePage.
                action_Navigate_To_LoginPage();
        wqLoginPage.check_Username_Feild_Is_Available();
    }

    @Test
    public void verify_The_Username_Field_Enter_Text_Types()
    {
        wqHomePage.
                action_Navigate_To_LoginPage();
        String username;

    //public UsernameCheck(String username) {
       // this.username = username;
    //}

      //  public Boolean isValid() {
        //return this.username.matches("[a-zA-Z0-9\\.]+@[a-zA-Z0-9\\-\\_\\.]+\\.[a-zA-Z0-9]{3}");
    //}
    }

}
