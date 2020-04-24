package com.webQuarters.qa.test;

import com.webQuarters.qa.automation.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by e.koshila on 3/17/2020.
 */
public class SFALoginTest extends TestBase {

    @BeforeMethod
    public void NavigateToLoginPage() throws InterruptedException, IOException {
        initDomainObjects(DRIVER);
        String siteUrl = data.getValueByName("SFAUrl");
        setSiteURL(siteUrl);

    }

    @AfterMethod
    public void endTestMethod() throws Throwable{
        Thread.sleep(3000);
        quitDriver();
    }


    //-----------UI Testing-------------
    //TestCase - 3862

    //WQ logo
    @Test
    public void verify_The_WQ_Logo_Is_Available() {
        sfaLoginPage.check_WQ_Logo_Is_Available();
    }

    //Login page browser title
    @Test
    public void verify_The_Login_Page_Browser_Title() {
        String title=data.getValueByName("LoginPageBrowserTitle");
        Assert.assertEquals(sfaLoginPage.check_Login_Page_Browser_Title(), title);
    }

    //Login page title
    @Test
    public void check_Login_Page_Title() {
        String LoginPageTitle = data.getValueByName("LoginPageTitle");
        Assert.assertEquals(sfaLoginPage.check_Login_Page_Title(), LoginPageTitle);
    }

    //Login page text
    @Test
    public void check_Login_Page_Text() {
        String LoginPageTitle = data.getValueByName("LoginPageText");
        Assert.assertEquals(sfaLoginPage.check_Login_Page_Text(), LoginPageTitle);
    }

    //Username field
    @Test
    public void verify_The_Username_Field_Is_Available() {
        sfaLoginPage.check_Username_Field_Is_Available();
    }

    @Test
    public void verify_The_Username_Icon_Is_Available() {
        sfaLoginPage.check_Username_Icon_Is_Available();
    }

    @Test
    public  void verify_The_Username_PlaceHolder_Text() {
        String UsernamePlaceholder = data.getValueByName("UsernamePlaceholderText");
        Assert.assertEquals(sfaLoginPage.check_Username_PlaceHold_Text(),UsernamePlaceholder);
    }

    //Password field
    @Test
    public void verify_The_Password_Field_Is_Available() {
        sfaLoginPage.check_Password_Feild_Is_Available();
    }

    @Test
    public void verify_The_Password_Icon_Is_Available() {
        sfaLoginPage.check_Password_Icon_Is_Available();
    }

    @Test
    public  void verify_The_Password_PlaceHolder_Text() {
        String PasswordPlaceholder = data.getValueByName("PasswordPlaceholderText");
        Assert.assertEquals(sfaLoginPage.check_Password_PlaceHold_Text(),PasswordPlaceholder);
    }

    //Loing button
    @Test
    public void check_Login_Button_Is_Available() {
        sfaLoginPage.check_Login_Button_Available();
    }

    @Test
    public void check_Login_Button_Text() {
       String LoginBtnText = data.getValueByName("LoginButtonText");
       Assert.assertEquals(sfaLoginPage.check_Login_Button_Text(), LoginBtnText);
    }

    //Forgot password link
    @Test
    public void check_Forgot_Password_Link_Is_Available() {
        sfaLoginPage.check_Forgot_Password_Link_Available();
    }

    @Test
    public void check_Forgot_Password_Link_Text() {
        String ForgotPasswordLinkText = data.getValueByName("ForgetPasswordLinkText");
        Assert.assertEquals(sfaLoginPage.check_Forgot_Password_Link_Text(), ForgotPasswordLinkText);
    }

    //----------Functional testing----------

    //Validate text types for Username field
    @Test
    public void verify_The_Username_Field_Enter_Text_Types()
    {
        String name= data.getValueByName("Username");
        sfaLoginPage.check_Username_Field_Text_Types(name);
    }

    //Validate is Password field secured
    @Test
    public void verify_The_Password_Is_Display_Set_Secured() {
        Assert.assertEquals(sfaLoginPage.check_Password_Feild_Is_Secured(),"password");
    }


    //TestCase - 3868/ 3869
    //Validate the required fields
    @Test
    public void verify_The_Login_Button_With_Empty_UserName_Password() throws Exception {
        String Uname = data.getValueByName("BLANKUNAME");
        String Password = data.getValueByName("BLANKPASSWORD");
        String RequiredMsg = data.getValueByName("RequiredMsg");

        sfaLoginPage.
                step_User_Enter_Given_Credentials(Uname,Password).
                step_User_Click_Login_Button();

        Assert.assertEquals(sfaLoginPage.check_And_Validate_Required_Email_Field_Error_Message(), RequiredMsg);
        Assert.assertEquals(sfaLoginPage.check_And_Validate_Required_Password_Field_Error_Message(), RequiredMsg);
    }

    //TestCase - 3863
    //Login to the system with valid username and password
    @Test
    public void verify_The_Login_Button_With_Valid_UserName_Password() throws Exception {
        String Uname = data.getValueByName("VALIDUNAME");
        String Password = data.getValueByName("VALIDPASSWORD");
        String Welcome = data.getValueByName("WelcomeMessage");

        Thread.sleep(5000);
        sfaLoginPage.
                step_User_Enter_Given_Credentials(Uname,Password).
                step_User_Click_Login_Button();

        Assert.assertEquals(sfaLoginPage.check_And_Validate_Welcome_Message(), Welcome);
        Assert.assertEquals(sfaHomePage.check_And_Validate_Logged_In_User_Details(), Uname);
    }

    //TestCase - 3866
    //Login to the system with incorrect username
    @Test
    public void verify_The_Login_Button_With_Incorrect_UserName_Valid_Password() throws Exception {
        String Uname = data.getValueByName("INCORRECTUNAME");
        String Password = data.getValueByName("VALIDPASSWORD");
        String IncorrectEmailErrorMsg = data.getValueByName("IncorrectEmailErrorMsg");

        sfaLoginPage.
                step_User_Enter_Given_Credentials(Uname,Password).
                step_User_Click_Login_Button();

        Assert.assertEquals(sfaLoginPage.check_And_Validate_Incorrect_Email_Error_Message(), "Error The Email Address or Password you’ve entered is incorrect. Please try again or contact the system administrator!");

        //Assert.assertEquals(sfaLoginPage.check_And_Validate_Incorrect_Email_Error_Message(), IncorrectEmailErrorMsg);
    }

    //TestCase - 3865
    //Login to the system with incorrect password
    @Test
    public void verify_The_Login_Button_With_Valid_UserName_Incorrect_Password() throws Exception {
        String Uname = data.getValueByName("VALIDUNAME");
        String Password = data.getValueByName("INCORRECTPASSWORD");
        String IncorrectPasswordErrorMsg = data.getValueByName("IncorrectPasswordErrorMsg");

        sfaLoginPage.
                step_User_Enter_Given_Credentials(Uname,Password).
                step_User_Click_Login_Button();

        Assert.assertEquals(sfaLoginPage.check_And_Validate_Incorrect_Password_Error_Message(), IncorrectPasswordErrorMsg);
    }

    //TestCase - 3866
    //Login to the system with incorrect username and incorrect password
    @Test
    public void verify_The_Login_Button_With_Incorrect_UserName_Incorrect_Password() throws Exception {
        String Uname = data.getValueByName("INCORRECTUNAME");
        String Password = data.getValueByName("INCORRECTPASSWORD");
        String IncorrectEmailErrorMsg = data.getValueByName("IncorrectEmailErrorMsg");

        sfaLoginPage.
                step_User_Enter_Given_Credentials(Uname,Password).
                step_User_Click_Login_Button();

        Assert.assertEquals(sfaLoginPage.check_And_Validate_Incorrect_Email_Incorrect_Password_Error_Message(), "Error The Email Address or Password you’ve entered is incorrect. Please try again or contact the system administrator!");

        //Assert.assertEquals(sfaLoginPage.check_And_Validate_Incorrect_Email_Error_Message(), IncorrectEmailErrorMsg);
    }

    //TestCase - 5008
    //Login to the system with invalid username
    @Test
    public void verify_The_Login_Button_With_Invalid_UserName_Valid_Password() throws Exception {
        String Uname = data.getValueByName("INVALIDUNAME");
        String Password = data.getValueByName("VALIDPASSWORD");
        String InvalidEmailErrorMsg = data.getValueByName("InvalidEmailErrorMsg");

        sfaLoginPage.
                step_User_Enter_Given_Credentials(Uname,Password).
                step_User_Click_Login_Button();

        Assert.assertEquals(sfaLoginPage.check_And_Validate_Invalid_Email_Error_Message(), InvalidEmailErrorMsg);
    }

    //TestCase - 5009
    //Login to the system with invalid password
    @Test
    public void verify_The_Login_Button_With_Valid_UserName_Invalid_Password() throws Exception {
        String Uname = data.getValueByName("VALIDUNAME");
        String Password = data.getValueByName("INVALIDPASSWORD");
        String InvalidPasswordErrorMsg = data.getValueByName("InvalidPasswordErrorMsg");

        sfaLoginPage.
                step_User_Enter_Given_Credentials(Uname,Password).
                step_User_Click_Login_Button();

        Assert.assertEquals(sfaLoginPage.check_And_Validate_Invalid_Password_Error_Message(), InvalidPasswordErrorMsg);
    }

}
