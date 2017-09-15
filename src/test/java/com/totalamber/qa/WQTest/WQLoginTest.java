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

    //Login Features

    @Test
    public void verify_The_Login_Link_Is_Available(){

        Assert.assertTrue(wqHomePage.check_Login_Link_Available(),"Login Button is Available");
    }

    @Test
    public void verify_The_Login_Link_Text(){
        Assert.assertEquals(wqHomePage.check_Login_Link_Text(),"Login");
       System.out.println("Login Text Verified");
    }

    @Test
    public void verify_The_Login_Link_Leads_To_Login_Page()
    {
        String URL="http://qa.webquarters.com:33366/_layouts/15/TA.WQ.Web/Login.aspx";
        wqHomePage.
                action_Navigate_To_LoginPage();
        Assert.assertEquals(URL,wqHomePage.check_Login_Page_URL());
    }

    //Sign Up Features

    @Test
    public void verify_The_SignUp_Link_Is_Available(){

        Assert.assertTrue(wqHomePage.check_SignUp_Link_Available(),"Login Button is Available");

    }

    @Test
    public void verify_The_SignUp_Link_Text(){

        Assert.assertEquals(wqHomePage.check_SignUp_Link_Text(),"Sign Up");
        System.out.println("Sign Up Text Verified");
    }

    @Test
    public void verify_The_SignUp_Link_Leads_To_SignUp_Page()
    {
        String URL="http://qa.webquarters.com:33366/Pages/UserSignUp.aspx";
        wqHomePage.
                action_Navigate_To_SignUp_Page();
        Assert.assertEquals(URL,wqHomePage.check_SignUp_Page_URL());

    }

    //Activate Screen Sharing Features

    @Test
    public void verify_The_Active_Screen_Sharing_Link_Is_Available(){

        Assert.assertTrue(wqHomePage.check_Active_Screen_Sharing_Link_Available(),"Activate Screen Sharing Button is Available");

    }

    @Test
    public void verify_The_Active_Screen_Sharing_Link_Text(){

        Assert.assertEquals(wqHomePage.check_Active_Screen_Sharing_Link_Text(),"Activate Screen Sharing");
        System.out.println("Activate Screen Sharing Button Text Verified");
    }

    @Test
    public void verify_The_Active_Screen_Sharing_Link_Leads_To_Activation_Screen_Overlay() throws InterruptedException {
        wqHomePage.
                action_Navigate_To_Activation_Screen_Overlay().
                check_Active_Screen_Sharing_Overlay();


    }

    // Home Page General Features

    @Test
    public void verify_The_Home_Page_Browser_Title()
    {
        String URL="http://qa.webquarters.com:33366/Pages/home.aspx";
        Assert.assertEquals(URL,wqHomePage.check_Browser_Title());
        System.out.println("Browser Title Verified");

    }

    @Test
    public void verify_The_WQ_Logo_On_Home_Page()
    {
        Assert.assertTrue(wqHomePage.verify_Logo_Available(),"WQ Logo is Available");
    }

    @Test
    public void verify_Home_Page_The_Live_Assistance_Option_Is_Available() throws InterruptedException {
        wqHomePage.
                action_Navigate_To_Live_Assistance_Option().
                check_Active_Screen_Sharing_Overlay();
    }

    @Test
    public void verify_The_Watch_Video_Option_Is_Available() throws InterruptedException {
        wqHomePage.check_Watch_Video_Options_Available();
    }

    @Test
    public void verify_Video_One_Link_Leads_To_Lose_Your_Middleman_Video()
    {
        wqHomePage.check_Middleman_Video_Link();
    }

    @Test
    public void verify_Video_Two_Link_Leads_To_Support_Your_Superheroes_Video()
    {
        wqHomePage.check_Superheroes_Video_Link();
    }

}
