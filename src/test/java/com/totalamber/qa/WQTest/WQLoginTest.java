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


    //suranjith

    @Test
    public void verify_User_Enter_A_Valid_UName_And_Blank_Password() throws Exception{
        String Uname = "VALIDUNAME";
        String Password = "BLANKPASSWORD";
        wqHomePage.
                action_Navigate_To_LoginPage();
        wqLoginPage.
                step_User_Enter_Given_Credentials(Uname,Password).
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
                step_User_Enter_Given_Credentials(Uname,Password).
                step_User_Click_Login_Button().
                check_And_Validate_Error_Message();
    }
//shammi
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
        String name= data.getValueByName("username");
        wqHomePage.
                action_Navigate_To_LoginPage();
        wqLoginPage.check_Username_Feild_Text_Types(name);
    }

    @Test
    public void verify_The_Username_PlaceHold_Text()
    {
        wqHomePage.
                action_Navigate_To_LoginPage();
        Assert.assertEquals(wqLoginPage.check_Username_PlaceHold_Text(),"Username");
    }

    //Password

    @Test
    public void verify_The_Password_Field_Is_Available()
    {
        wqHomePage.
                action_Navigate_To_LoginPage();
        wqLoginPage.check_Password_Feild_Is_Available();
    }

    @Test
    public void verify_The_Password_Is_Display_Set_Secured()
    {
        wqHomePage.
                action_Navigate_To_LoginPage();
        wqLoginPage.check_Password_Feild_Is_Secured();
        Assert.assertEquals(wqLoginPage.check_Password_Feild_Is_Secured(),"password");

    }

    @Test
    public  void verify_The_Password_Place_Hold_Text() {
        wqHomePage.
                action_Navigate_To_LoginPage();
        Assert.assertEquals(wqLoginPage.check_Password_PlaceHold_Text(),"Password");
    }

    //log me in button

    @Test
    public void verify_The_Login_Button_Is_Available()
    {
        wqHomePage.
                action_Navigate_To_LoginPage();
        wqLoginPage.check_Login_Button_Available();
    }

    @Test
    public void verify_The_Login_Button_Text()
    {
        wqHomePage.
                action_Navigate_To_LoginPage();
        Assert.assertEquals(wqLoginPage.check_Login_Button_Text(),"Log me in!");
        System.out.println("Login Button Text Verified");
    }



    @Test
    public void verify_The_Login_Button_With_Cor_UN_PW() throws Exception {
        String Uname = data.getValueByName("VALIDUNAME");
        String Password = data.getValueByName("VALIDPASSWORD");
        wqHomePage.
                action_Navigate_To_LoginPage();
        wqLoginPage.
                step_User_Enter_Given_Credentials(Uname,Password).
                step_User_Click_Login_Button();
    }

    @Test
    public void verify_The_Login_Button_With_Incor_UN_Corr_PW() throws Exception{
        String Uname = data.getValueByName("INVALIDUNAME");
        String Password = data.getValueByName("VALIDPASSWORD");
        wqHomePage.
                action_Navigate_To_LoginPage();
        wqLoginPage.
                step_User_Enter_Given_Credentials(Uname,Password).
                step_User_Click_Login_Button().
                check_And_Validate_Error_Message();
    }

    @Test
    public void verify_The_Login_Button_With_Cor_UN_Incor_PW() throws Exception{
        String Uname = data.getValueByName("VALIDUNAME");
        String Password = data.getValueByName("INVALIDPASSWORD");
        wqHomePage.
                action_Navigate_To_LoginPage();
        wqLoginPage.
                step_User_Enter_Given_Credentials(Uname,Password).
                step_User_Click_Login_Button().
                check_And_Validate_Error_Message();
    }

    @Test
    public void verify_The_Login_Button_With_Incor_UN_Incor_PW() throws Exception{
        String Uname = data.getValueByName("INVALIDUNAME");
        String Password = data.getValueByName("INVALIDPASSWORD");
        wqHomePage.
                action_Navigate_To_LoginPage();
        wqLoginPage.
                step_User_Enter_Given_Credentials(Uname,Password).
                step_User_Click_Login_Button().
                check_And_Validate_Error_Message();
    }

    @Test
    public void verify_The_Login_Button_With_Empty_Credentials() throws Exception{
        String Uname = data.getValueByName("BLANKUNAME");
        String Password = data.getValueByName("BLANKPASSWORD");
        wqHomePage.
                action_Navigate_To_LoginPage();
        wqLoginPage.
                step_User_Enter_Given_Credentials(Uname,Password).
                step_User_Click_Login_Button().
                check_And_Validate_Error_Message();
    }

    @Test
    public void verify_The_Login_Button_With_Empty_UN_Corr_PW() throws Exception {
        String Uname = data.getValueByName("BLANKUNAME");
        String Password = data.getValueByName("VALIDPASSWORD");
        wqHomePage.
                action_Navigate_To_LoginPage();
        wqLoginPage.
                step_User_Enter_Given_Credentials(Uname,Password).
                step_User_Click_Login_Button().
                check_And_Validate_Error_Message();
    }


    @Test
    public void verify_The_Login_Button_With_Empty_PW_Corr_UN() throws Exception {
        String Uname = data.getValueByName("VALIDUNAME");
        String Password = data.getValueByName("BLANKPASSWORD");
        wqHomePage.
                action_Navigate_To_LoginPage();
        wqLoginPage.
                step_User_Enter_Given_Credentials(Uname,Password).
                step_User_Click_Login_Button().
                check_And_Validate_Error_Message();
    }
}
