package com.webQuarters.qa.test;

import com.webQuarters.qa.automation.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by e.koshila on 3/24/2020.
 */
public class SFAForgotPasswordTest extends TestBase {

    @BeforeMethod
    public void NavigateToLoginPage() throws InterruptedException, IOException {
        initDomainObjects(DRIVER);
        String siteUrl = data.getValueByName("SFAUrl");
        setSiteURL(siteUrl);
        sfaLoginPage.action_Click_On_Forgot_Password_Link();
    }

    @AfterMethod
    public void endTestMethod() throws Throwable{
        Thread.sleep(3000);
        quitDriver();
    }


    //-----------UI Testing-------------
    //TestCase - 3876

    //WQ logo
    @Test
    public void verify_The_WQ_Logo_Is_Available() {
        sfaForgotPasswordPage.check_WQ_Logo_Is_Available();
    }

    //Login page browser title
    @Test
    public void verify_The_Forgot_Password_Page_Browser_Title() {
        String title=data.getValueByName("ForgotPasswordPageBrowserTitle");
        Assert.assertEquals(sfaForgotPasswordPage.check_Forgot_Password_Page_Browser_Title(), title);
    }

    //Forgot Password page title
    @Test
    public void check_Forgot_Password_Page_Title() {
        String ForgotPasswordPageTitle = data.getValueByName("ForgotPasswordPageTitle");
        Assert.assertEquals(sfaForgotPasswordPage.check_Forgot_Password_Page_Title(), ForgotPasswordPageTitle);
    }

    //Forgot Password page text
    @Test
    public void check_Forgot_Password_Page_Text() {
        String ForgotPasswordPageText = data.getValueByName("ForgotPasswordPageText");
        Assert.assertEquals(sfaForgotPasswordPage.check_Forgot_Password_Page_Text(), ForgotPasswordPageText);
    }

    //Email Address field
    @Test
    public void verify_The_Email_Address_Field_Is_Available() {
        sfaForgotPasswordPage.check_Email_Address_Field_Is_Available();
    }

    @Test
    public void verify_The_Email_Address_Icon_Is_Available() {
        sfaForgotPasswordPage.check_Email_Address_Icon_Is_Available();
    }

    @Test
    public  void verify_The_Email_Address_PlaceHolder_Text() {
        String EmailAddressPlaceholder = data.getValueByName("EmailAddressPlaceholder");
        Assert.assertEquals(sfaForgotPasswordPage.check_Email_Address_PlaceHold_Text(),EmailAddressPlaceholder);
    }

    //ResetPassword button
    @Test
    public void check_Reset_Password_Button_Is_Available() {
        sfaForgotPasswordPage.check_Reset_Password_Button_Available();
    }

    @Test
    public void check_Reset_Password_Button_Text() {
       String ResetPasswordBtnText = data.getValueByName("ResetPasswordButtonText");
       Assert.assertEquals(sfaForgotPasswordPage.check_Reset_Password_Button_Text(), ResetPasswordBtnText);
    }

    //Back_To_Login_link
    @Test
    public void check_Back_To_Login_Link_Is_Available() {
        sfaForgotPasswordPage.check_Back_To_Login_Link_Available();
    }

    @Test
    public void check_Back_To_Login_Link_Text() {
        String BackToLoginLinkText = data.getValueByName("BackToLoginLinkText");
        Assert.assertEquals(sfaForgotPasswordPage.check_Back_To_Login_Link_Text(), BackToLoginLinkText);
    }

    //----------Functional testing----------

    //Validate text types for Email Address field
    @Test
    public void verify_The_Email_Address_Field_Enter_Text_Types()
    {
        String name= data.getValueByName("EmailAddressTextTypes");
        sfaForgotPasswordPage.check_Email_Address_Field_Text_Types(name);
    }

    //TestCase - 3870
    //Validate user able to navigate to the Forgot Password page
    @Test
    public void validate_Navigation_To_Forgot_Password_Page() {
        String title=data.getValueByName("ForgotPasswordPageBrowserTitle");
        Assert.assertEquals(sfaForgotPasswordPage.check_Forgot_Password_Page_Browser_Title(), title);
    }

    //TestCase - 3875
    //Validate user able to navigate back to the Login page
    @Test
    public void validate_Navigate_Back_To_The_Login_Page() {
        sfaForgotPasswordPage.action_Click_On_Back_To_Login_Link();

        String title=data.getValueByName("LoginPageBrowserTitle");
        Assert.assertEquals(sfaLoginPage.check_Login_Page_Browser_Title(), title);
    }

    //TestCase - 3874
    //Validate the required field
    @Test
    public void verify_The_Reset_Password_Button_With_Empty_Email_Address() throws Exception {
        String Email = data.getValueByName("BLANKUNAME");
        String RequiredMsg = data.getValueByName("RequiredMsg");

        sfaForgotPasswordPage.
                step_User_Enter_Email_To_Reset_Password(Email).
                step_User_Click_Reset_Password_Button();

        Assert.assertEquals(sfaForgotPasswordPage.check_And_Validate_Required_Email_Field_Error_Message(), RequiredMsg);
    }

    //TestCase - 3873
    //Reset Password with incorrect Email address
    @Test
    public void verify_The_Reset_Password_Button_With_Incorrect_Email_Address() throws Exception {
        String Email = data.getValueByName("INCORRECTUNAME");
        String ResetPasswordIncorrectEmailErrorMsg = data.getValueByName("ResetPasswordIncorrectEmailErrorMsg");

        sfaForgotPasswordPage.
                step_User_Enter_Email_To_Reset_Password(Email).
                step_User_Click_Reset_Password_Button();

        Assert.assertEquals(sfaForgotPasswordPage.check_And_Validate_Incorrect_Email_Field_Error_Message(), ResetPasswordIncorrectEmailErrorMsg);
    }

    //TestCase - 5010
    //Reset Password with incorrect Email address

    //Pre-conditions - Set the orifinal password of the user is to ""
    @Test
    public void verify_The_Reset_Password_Button_With_Invalid_Email_Address() throws Exception {
        String Email = data.getValueByName("INVALIDUNAME");
        String InvalidEmailErrorMsg = data.getValueByName("InvalidEmailErrorMsg");

        sfaForgotPasswordPage.
                step_User_Enter_Email_To_Reset_Password(Email).
                step_User_Click_Reset_Password_Button();

        Assert.assertEquals(sfaForgotPasswordPage.check_And_Validate_Invalid_Email_Field_Error_Message(), InvalidEmailErrorMsg);
    }

    //TestCase - 3872
    //Reset Password
    @Test
    public void verify_Reset_Password() throws Exception {
        String Email = data.getValueByName("FORGOTPASSWORDVALIDUNAME");
        String MailinatorURL = data.getValueByName("MailinatorUrl");

        sfaForgotPasswordPage.
                step_User_Enter_Email_To_Reset_Password(Email).
                step_User_Click_Reset_Password_Button();
        mailinatorEmailPage.
                check_Mailinator_Email(MailinatorURL,Email).
                action_read_Latest_Received_Password_Recovery_Email_In_Mailinator();

        String ActivationCode = mailinatorEmailPage.get_Password_Recovery_Email_Activation_Code();

        mailinatorEmailPage.action_Click_On_Password_Recovery_Email_Recover_Button();

        String NewPassword = sfaAccountActivationPage.create_Random_New_Password();

        sfaAccountActivationPage.
                step_User_Enter_Activation_Details_for_Password_Recovery(ActivationCode, NewPassword, NewPassword).
                step_User_Click_Activate_Button();

        mailinatorEmailPage.
                check_Mailinator_Email(MailinatorURL,Email).
                action_read_Latest_Received_Account_Activation_Email_In_Mailinator();

        String Username = mailinatorEmailPage.get_Account_Activation_Email_Username();

        mailinatorEmailPage.action_Click_On_Account_Activation_Email_SignIn_Button();

        sfaLoginPage.
                step_User_Enter_Given_Credentials(Username,NewPassword).
                step_User_Click_Login_Button();

        Assert.assertEquals(sfaHomePage.check_And_Validate_Logged_In_User_Details(), Email);
    }

    //Validate Recovery Password link Success message
    @Test
    public void verify_Recovery_Password_Link_Success_Message() throws Exception {
        String Email = data.getValueByName("FORGOTPASSWORDVALIDUNAME");
        String RecoveryLinkSuccessMsg = data.getValueByName("RecoveryLinkSuccessMsg");

        sfaForgotPasswordPage.
                step_User_Enter_Email_To_Reset_Password(Email).
                step_User_Click_Reset_Password_Button();

        Assert.assertEquals(sfaForgotPasswordPage.check_And_Validate_Password_Recovery_Link_Success_Message(), RecoveryLinkSuccessMsg);

    }

    //Account Activation Success message
    @Test
    public void verify_Account_Activation_Success_Message() throws Exception {
        String Email = data.getValueByName("FORGOTPASSWORDVALIDUNAME");
        String MailinatorURL = data.getValueByName("MailinatorUrl");
        String ActivationCode = mailinatorEmailPage.get_Password_Recovery_Email_Activation_Code();
        String NewPassword = sfaAccountActivationPage.create_Random_New_Password();
        String AccountActivationSuccessMsg = data.getValueByName("AccountActivationSuccessMsg");

        sfaForgotPasswordPage.
                step_User_Enter_Email_To_Reset_Password(Email).
                step_User_Click_Reset_Password_Button();
        mailinatorEmailPage.
                check_Mailinator_Email(MailinatorURL,Email).
                action_read_Latest_Received_Password_Recovery_Email_In_Mailinator().
                action_Click_On_Password_Recovery_Email_Recover_Button();
        sfaAccountActivationPage.
                step_User_Enter_Activation_Details_for_Password_Recovery(ActivationCode, NewPassword, NewPassword).
                step_User_Click_Activate_Button();

        Assert.assertEquals(sfaAccountActivationPage.check_And_Validate_Account_Activation_Success_Message(), AccountActivationSuccessMsg);
    }





}
