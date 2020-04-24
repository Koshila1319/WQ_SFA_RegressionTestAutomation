package com.webQuarters.qa.test;

import com.webQuarters.qa.automation.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by e.koshila on 3/26/2020.
 */
public class SFAAccountActivationTest extends TestBase {

    public static String ActivationCode = "";

    @BeforeMethod
    public void NavigateToLoginPage() throws InterruptedException, IOException {
        initDomainObjects(DRIVER);
        String siteUrl = data.getValueByName("SFAUrl");
        setSiteURL(siteUrl);
    }

    @AfterMethod
    public void endTestMethod() throws Throwable {
        Thread.sleep(3000);
        quitDriver();
    }


    //-----------UI Testing-------------
    //When in Forgot password scenarios

    @Test
    public void navigate_To_Account_Activation_Page_When_Recover_Password() throws Exception {

        String Email = data.getValueByName("FORGOTPASSWORDVALIDUNAME");
        String MailinatorURL = data.getValueByName("MailinatorUrl");

        sfaLoginPage.action_Click_On_Forgot_Password_Link();

        sfaForgotPasswordPage.
                step_User_Enter_Email_To_Reset_Password(Email).
                step_User_Click_Reset_Password_Button();
        mailinatorEmailPage.
                check_Mailinator_Email(MailinatorURL, Email).
                action_read_Latest_Received_Password_Recovery_Email_In_Mailinator();

        ActivationCode = mailinatorEmailPage.get_Password_Recovery_Email_Activation_Code();

        mailinatorEmailPage.action_Click_On_Password_Recovery_Email_Recover_Button();
    }

    //Test Case - 5013
    //Validate Account Activation page UI
    @Test
    public void verify_The_Activation_Page_UI_View() throws Exception {
        navigate_To_Account_Activation_Page_When_Recover_Password();

        //WQ Logo
        sfaForgotPasswordPage.check_WQ_Logo_Is_Available();

        //Browser Title
        String title = data.getValueByName("AccountActivationPageBrowserTitle");
        Assert.assertEquals(sfaAccountActivationPage.check_Account_Activation_Page_Browser_Title(), title);

        //Page Title
        String AccountActivationPageTitle = data.getValueByName("AccountActivationPageTitle");
        Assert.assertEquals(sfaAccountActivationPage.check_Account_Activation_Page_Title(), AccountActivationPageTitle);

        //Page Text
        String AccountActivationPageText = data.getValueByName("AccountActivationPageText");
        Assert.assertEquals(sfaAccountActivationPage.check_Account_Activation_Page_Text(), AccountActivationPageText);

        //Username
        sfaAccountActivationPage.check_Username_Field_Is_Available();
        sfaAccountActivationPage.check_Username_Icon_Is_Available();

        //Activation code
        sfaAccountActivationPage.check_Activation_Code_Field_Is_Available();
        sfaAccountActivationPage.check_Activation_Code_Icon_Is_Available();

        String ActivationCodePlaceholder = data.getValueByName("ActivationCodePlaceholder");
        Assert.assertEquals(sfaAccountActivationPage.check_Activation_Code_PlaceHold_Text(), ActivationCodePlaceholder);

        //New Password
        sfaAccountActivationPage.check_New_Password_Field_Is_Available();
        sfaAccountActivationPage.check_New_Password_Icon_Is_Available();

        String NewPasswordPlaceholder = data.getValueByName("NewPasswordPlaceholder");
        Assert.assertEquals(sfaAccountActivationPage.check_New_Password_PlaceHold_Text(), NewPasswordPlaceholder);

        //Retype Password
        sfaAccountActivationPage.check_Retype_Password_Field_Is_Available();
        sfaAccountActivationPage.check_Retype_Password_Icon_Is_Available();

        String RetypePasswordPlaceholder = data.getValueByName("RetypePasswordPlaceholder");
        Assert.assertEquals(sfaAccountActivationPage.check_Retype_Password_PlaceHold_Text(), RetypePasswordPlaceholder);

        //Activate button
        sfaAccountActivationPage.check_Activate_Button_Available();
        String ActivationPageActivateButtonText = data.getValueByName("ActivationPageActivateButtonText");
        Assert.assertEquals(sfaAccountActivationPage.check_Activate_Button_Text(), ActivationPageActivateButtonText);
    }
    //Test Case - 5014
    //Verify activation with incorrect Activation Code
    @Test
    public void verify_Account_Activation_With_Incorrect_Activation_Code() throws Exception {
        String IncorrectActivationCodeErrorMsg = data.getValueByName("IncorrectActivationCodeErrorMsg");
        String IncorrectActivationCode = data.getValueByName("INCORRECTACTIVATIONCODE");
        String NewPassword = sfaAccountActivationPage.create_Random_New_Password();

        navigate_To_Account_Activation_Page_When_Recover_Password();
        sfaAccountActivationPage.
                step_User_Enter_Activation_Details_for_Password_Recovery(IncorrectActivationCode, NewPassword, NewPassword).
                step_User_Click_Activate_Button();

        Assert.assertEquals(sfaAccountActivationPage.check_Incorrect_Activation_Error_Message(), IncorrectActivationCodeErrorMsg);
    }

    //Test Case - 5015
    //Verify activation with empty Activation Code
    @Test
    public void verify_Account_Activation_With_Empty_Activation_Code() throws Exception {
        String IncorrectActivationCodeErrorMsg = data.getValueByName("IncorrectActivationCodeErrorMsg");
        String EmptyActivationCode = data.getValueByName("BLANKACTIVATIONCODE");
        String NewPassword = sfaAccountActivationPage.create_Random_New_Password();

        navigate_To_Account_Activation_Page_When_Recover_Password();
        sfaAccountActivationPage.
                step_User_Enter_Activation_Details_for_Password_Recovery(EmptyActivationCode, NewPassword, NewPassword).
                step_User_Click_Activate_Button();

        Assert.assertEquals(sfaAccountActivationPage.check_Incorrect_Activation_Error_Message(), IncorrectActivationCodeErrorMsg);
    }

    //Test Case - 5014
    //Verify activation with invalid Activation Code
    @Test
    public void verify_Account_Activation_With_Invalid_Activation_Code() throws Exception {
        String InvalidActivationCodeErrorMsg = data.getValueByName("InvalidActivationCodeErrorMsg");
        String InvalidActivationCode = data.getValueByName("INVALIDACTIVATIONCODE");
        String NewPassword = sfaAccountActivationPage.create_Random_New_Password();

        navigate_To_Account_Activation_Page_When_Recover_Password();
        sfaAccountActivationPage.
                step_User_Enter_Activation_Details_for_Password_Recovery(InvalidActivationCode, NewPassword, NewPassword).
                step_User_Click_Activate_Button();

        Assert.assertEquals(sfaAccountActivationPage.check_Invalid_Activation_Error_Message(), InvalidActivationCodeErrorMsg);
    }

    //Test Case - 5017
    //Verify activation with empty Password
    @Test
    public void verify_Account_Activation_With_Empty_Password() throws Exception {
        String PasswordRequiredErrorMsg = data.getValueByName("PasswordRequiredMsg");
        String BlankPassword = data.getValueByName("BLANKPASSWORD");

        navigate_To_Account_Activation_Page_When_Recover_Password();
        sfaAccountActivationPage.
                step_User_Enter_Activation_Details_for_Password_Recovery(ActivationCode, BlankPassword, BlankPassword).
                step_User_Click_Activate_Button();

        Assert.assertEquals(sfaAccountActivationPage.check_Password_Required_Error_Message(), PasswordRequiredErrorMsg);
    }

    //Test Case - 5016
    //Verify activation with invalid Password
    @Test
    public void verify_Account_Activation_With_Invalid_Password() throws Exception {
        String InvalidPasswordErrorMsg = data.getValueByName("InvalidPasswordErrorMsg");
        String InvalidPassword = data.getValueByName("INVALIDPASSWORD");

        navigate_To_Account_Activation_Page_When_Recover_Password();
        sfaAccountActivationPage.
                step_User_Enter_Activation_Details_for_Password_Recovery(ActivationCode, InvalidPassword, "").
                step_User_Click_Activate_Button();

        Assert.assertEquals(sfaAccountActivationPage.check_Invalid_Password_Error_Message(), InvalidPasswordErrorMsg);
    }

    //Test Case - 5018
    //Verify activation with invalid ConfirmPassword
    @Test
    public void verify_Account_Activation_With_Unmatching_Confirm_Password() throws Exception {
        String UnmatchingConfirmPasswordErrorMsg = data.getValueByName("UnmatchingConfirmPasswordErrorMsg");
        String UnmatchingConfirmPassword = data.getValueByName("UNMATCHINGCONFIRMPASSWORD");
        String NewPassword = sfaAccountActivationPage.create_Random_New_Password();

        navigate_To_Account_Activation_Page_When_Recover_Password();
        sfaAccountActivationPage.
                step_User_Enter_Activation_Details_for_Password_Recovery(ActivationCode, NewPassword, UnmatchingConfirmPassword).
                step_User_Click_Activate_Button();

        Assert.assertEquals(sfaAccountActivationPage.check_Unmatching_Confirm_Password_Error_Message(), UnmatchingConfirmPasswordErrorMsg);
    }

    //Test Case - 5019
    //Verify activation with valid details
    @Test
    public void verify_Account_Activation_With_Valid_Details() throws Exception {
        String NewPassword = sfaAccountActivationPage.create_Random_New_Password();
        String AccountActivationSuccessMsg = data.getValueByName("AccountActivationSuccessMsg");

        navigate_To_Account_Activation_Page_When_Recover_Password();
        sfaAccountActivationPage.
                step_User_Enter_Activation_Details_for_Password_Recovery(ActivationCode, NewPassword, NewPassword).
                step_User_Click_Activate_Button();

        Assert.assertEquals(sfaAccountActivationPage.check_And_Validate_Account_Activation_Success_Message(), AccountActivationSuccessMsg);
    }

}
