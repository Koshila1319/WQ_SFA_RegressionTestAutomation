package com.totalamber.qa.WQTest;

import com.totalamber.qa.automation.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by t.piyananda on 21/09/2017.
 */
public class WQClientFirstLoginTest extends TestBase{

    @BeforeClass
    public void NavigateToPage() throws InterruptedException, IOException {
        initDomainObjects(DRIVER);

    }

    @AfterClass
    public void endTestMethod() throws Throwable{
        //quitDriver();
    }

    @Test
    public void verify_The_Login_Page_Browser_Title(){
        String siteUrl = data.getValueByName("ClientFirstLogin_link");
        setSiteURL(siteUrl);
        String title="Sign In";
        Assert.assertEquals(title,wqLoginPage.check_Login_Page_Browser_Title());

    }

    @Test
    public void verify_The_WQ_LogoIs_Available(){
        wqLoginPage.check_WQ_Logo_Is_Available();

    }

    @Test
    public void verify_The_Login_Page_Live_Assistance_Option_Is_Available(){
        wqLoginPage.check_Login_Page_Live_Assitane_Option_Available();
    }

    //Username

    @Test
    public void verify_The_Username_Field_Is_Available(){
        wqLoginPage.check_Username_Feild_Is_Available();
    }

    @Test
    public void verify_The_Username_Field_Enter_Text_Types(){
        String name= data.getValueByName("UserName");
        wqLoginPage.check_Username_Feild_Text_Types(name);
        wqLoginPage.step_Clear_Username_Field();
    }

    @Test
    public void verify_The_Username_PlaceHold_Text(){

        Assert.assertEquals(wqLoginPage.check_Username_PlaceHold_Text(),"Username");
    }

    //Password

    @Test
    public void verify_The_Password_Field_Is_Available(){
        wqLoginPage.check_Password_Feild_Is_Available();
    }

    @Test
    public void verify_The_Password_Is_Display_Set_Secured(){
        wqLoginPage.check_Password_Feild_Is_Secured();
        Assert.assertEquals(wqLoginPage.check_Password_Feild_Is_Secured(),"password");

    }

    @Test
    public  void verify_The_Password_Place_Hold_Text(){
        Assert.assertEquals(wqLoginPage.check_Password_PlaceHold_Text(),"Password");
    }

    //Login Button
    @Test
    public void verify_The_Login_Button_Is_Available(){
        wqLoginPage.check_Login_Button_Available();
    }

    @Test
    public void verify_The_Login_Button_Text(){
        Assert.assertEquals(wqLoginPage.check_Login_Button_Text(),"Log me in!");
    }

    @Test
    public void verify_The_Login_Button_With_Given_UN_PW() throws Exception {
        String Uname = data.getValueByName("ClientFirstLogin_UName");
        String Password = data.getValueByName("ClientFirstLogin_PW");
        wqLoginPage.
                step_User_Enter_Given_Credentials(Uname,Password).
                step_User_Click_Login_Button();
    }

    @Test
    public void verify_ChangePassword_Page_views_after_successful_Login(){
        String expectedTitle = data.getValueByName("ClientFirstLogin_ChangePWPageTitle");
        Assert.assertEquals(wqLoginPage.check_Login_Page_Browser_Title(),expectedTitle);
    }

    @Test
    public void verify_Browser_Title(){
        String expectedTitle = data.getValueByName("ClientFirstLogin_ChangePWPageTitle");
        Assert.assertEquals(wqLoginPage.check_Login_Page_Browser_Title(),expectedTitle);
    }


    //Depends with the registered Client (ClientEmail)
    @Test
    public void verify_Page_Title(){
        String expetedTitle1 = data.getValueByName("ChangePW_Title1");
        String expetedTitle2 = data.getValueByName("ClientFirstLogin_UName");
        String expetedTitle3 = data.getValueByName("ChangePW_Title3");
        Assert.assertEquals(wqChangePWPage.validate_the_PageTitle(),expetedTitle1+expetedTitle2+expetedTitle3);
    }

    @Test
    public void verify_PageContent_Text(){
        String expectedContent1 = data.getValueByName("ChangePW_Content1");
        String expectedContent2 = data.getValueByName("ChangePW_Content2");
        Assert.assertEquals(wqChangePWPage.validate_PageContent1(),expectedContent1);
        Assert.assertEquals(wqChangePWPage.validate_PageContent2(),expectedContent2);
    }

    @Test
    public void verify_FieldWrapper_Near_Password_TextBox_IsAvailable(){
        Assert.assertNotNull(wqChangePWPage.validate_FieldWrapper_Is_Available());
    }

    @Test
    public void verify_MouseHover_The_FieldWrapper(){
        wqChangePWPage.step_User_MoouseHover_the_FieldWrapper();
    }

    @Test
    public void verify_The_Lable_Content_Of_FieldWrapper(){
        String fieldwrapperContent = data.getValueByName("ChangePW_FieldWrapper");
        Assert.assertEquals(wqChangePWPage.validate_FieldWrapper_LabelContent(),fieldwrapperContent);
    }

    @Test
    public void verify_EnterPassword_PlaceHolder_IsAvailable(){
        String expectedPlaceHolderText = data.getValueByName("ChangePW_PasswordPlaceholder");
        Assert.assertEquals(wqChangePWPage.validate_PlaceholderText_Of_Password(),expectedPlaceHolderText);
    }

    @Test
    public void verify_EnterPassword_TextBox_IsAvailable(){
        wqChangePWPage.validate_EnterPassword_Textbox_Available();
    }

    @Test
    public void verify_EnterPassword_Textbox_Is_Editable(){
        String textToEnter = data.getValueByName("AM_textToEnter");
        wqChangePWPage.validate_Characters_Can_Enter_in_Password(textToEnter);
    }

    @Test
    public void verify_EnterPassword_Is_Display_Set_Secured(){
        Assert.assertEquals(wqChangePWPage.check_Password_Feild_Is_Secured(),"password");
    }

    @Test
    public void verify_ConfirmPassword_PlaceHolder_IsAvailable(){
        String expectedPlaceHolderText = data.getValueByName("ChangePW_ConfirmPasswordPlaceholder");
        Assert.assertEquals(wqChangePWPage.validate_PlaceholderText_Of_ChangePassword(),expectedPlaceHolderText);
    }

    @Test
    public void verify_ConfirmPassword_TextBox_IsAvailable(){
        wqChangePWPage.validate_ChangePassword_Textbox_Available();
    }

    @Test
    public void verify_ConfirmPassword_Textbox_Is_Editable(){
        String textToEnter = data.getValueByName("AM_textToEnter");
        wqChangePWPage.validate_Characters_Can_Enter_in_ChangePassword(textToEnter);
    }

    @Test
    public void verify_ConfirmPassword_Is_Display_Set_Secured(){
        Assert.assertEquals(wqChangePWPage.check_ChangePassword_Feild_Is_Secured(),"password");
    }

    @Test
    public void verify_ChangePassword_Button_Available(){
        wqChangePWPage.check_ChangePassword_Button_Available();
    }

    @Test
    public void verify_ChangePassword_Button_Text(){
        String expectedButtonText = data.getValueByName("ChangePW_ButtonText");
        Assert.assertEquals(wqChangePWPage.check_ChangePassword_Button_Text(),expectedButtonText);
    }

    @Test
    public void verify_Clicking_ChangePassword_Button_Without_AnyValues_InTextboxes(){
        wqChangePWPage.step_clear_Password_TextBoxes();
        wqChangePWPage.step_Click_ChangePassword_Button();
        String expectedError = data.getValueByName("ChangePW_Error");
        //Validate the error message when there are null values in text boxes.
        Assert.assertEquals(wqChangePWPage.validate_Click_ChangePassword_Button_With_Incorrect_Value_Gives_AnErrorMessage(),expectedError);

    }

    @Test
    public void verify_Clicking_ChangePassword_Button_With_Less_Than_SixValues_1Special_1Num_1Char(){
        wqChangePWPage.step_clear_Password_TextBoxes();
        String testText = data.getValueByName("ChangePW_TextLessSix_1Numeric_1Special");
        wqChangePWPage.Step_Enter_Password_ChangePW(testText);
        wqChangePWPage.step_Click_ChangePassword_Button();
        String expectedError = data.getValueByName("ChangePW_Error");
        //Validate the error message when there are less than six characters in text boxes.
        Assert.assertEquals(wqChangePWPage.validate_Click_ChangePassword_Button_With_Incorrect_Value_Gives_AnErrorMessage(),expectedError);

    }

    @Test
    public void verify_Clicking_ChangePassword_Button_With_Less_Than_SixValues_1Special_4Char(){
        wqChangePWPage.step_clear_Password_TextBoxes();
        String testText = data.getValueByName("ChangePW_TextLessSix_4Char_1Special");
        wqChangePWPage.Step_Enter_Password_ChangePW(testText);
        wqChangePWPage.step_Click_ChangePassword_Button();
        String expectedError = data.getValueByName("ChangePW_Error");
        //Validate the error message when there are less than six characters in text boxes.
        Assert.assertEquals(wqChangePWPage.validate_Click_ChangePassword_Button_With_Incorrect_Value_Gives_AnErrorMessage(),expectedError);

    }

    @Test
    public void verify_Clicking_ChangePassword_Button_With_Less_Than_SixValues_1Special_3Num(){
        wqChangePWPage.step_clear_Password_TextBoxes();
        String testText = data.getValueByName("ChangePW_TextLessSix_3Num_1Special");
        wqChangePWPage.Step_Enter_Password_ChangePW(testText);
        wqChangePWPage.step_Click_ChangePassword_Button();
        String expectedError = data.getValueByName("ChangePW_Error");
        //Validate the error message when there are less than six characters in text boxes.
        Assert.assertEquals(wqChangePWPage.validate_Click_ChangePassword_Button_With_Incorrect_Value_Gives_AnErrorMessage(),expectedError);

    }

    @Test
    public void verify_Clicking_ChangePassword_Button_With_Less_Than_SixValues_4Char_1Num(){
        wqChangePWPage.step_clear_Password_TextBoxes();
        String testText = data.getValueByName("ChangePW_TextLessSix_4Char_1Num");
        wqChangePWPage.Step_Enter_Password_ChangePW(testText);
        wqChangePWPage.step_Click_ChangePassword_Button();
        String expectedError = data.getValueByName("ChangePW_Error");
        //Validate the error message when there are No Special characters in text boxes.
        Assert.assertEquals(wqChangePWPage.validate_Click_ChangePassword_Button_With_Incorrect_Value_Gives_AnErrorMessage(),expectedError);

    }

    @Test
    public void verify_Clicking_ChangePassword_Button_With_More_Than_SixValues_1Special_5Char(){
        wqChangePWPage.step_clear_Password_TextBoxes();
        String testText = data.getValueByName("ChangePW_MoreSix_1Special_5Char");
        wqChangePWPage.Step_Enter_Password_ChangePW(testText);
        wqChangePWPage.step_Click_ChangePassword_Button();
        String expectedError = data.getValueByName("ChangePW_Error");
        //Validate the error message when there are No Special characters in text boxes.
        Assert.assertEquals(wqChangePWPage.validate_Click_ChangePassword_Button_With_Incorrect_Value_Gives_AnErrorMessage(),expectedError);

    }

    @Test
    public void verify_Clicking_ChangePassword_Button_With_More_Than_SixValues_5Char_1Num(){
        wqChangePWPage.step_clear_Password_TextBoxes();
        String testText = data.getValueByName("ChangePW_MoreSix_1Num_5Char");
        wqChangePWPage.Step_Enter_Password_ChangePW(testText);
        wqChangePWPage.step_Click_ChangePassword_Button();
        String expectedError = data.getValueByName("ChangePW_Error");
        //Validate the error message when there are No Special characters in text boxes.
        Assert.assertEquals(wqChangePWPage.validate_Click_ChangePassword_Button_With_Incorrect_Value_Gives_AnErrorMessage(),expectedError);

    }

    @Test
    public void verify_Clicking_ChangePassword_Button_With_PasswordMismatch(){
        wqChangePWPage.step_clear_Password_TextBoxes();
        String password = data.getValueByName("ChangePW_MoreSix_1Num_5Char");
        String changePassword = data.getValueByName("ChangePW_MoreSix_1Special_5Char");
        wqChangePWPage.Step_Enter_Password_ChangePW_with_Mismatch(password,changePassword);
        wqChangePWPage.step_Click_ChangePassword_Button();
        String expectedError = data.getValueByName("ChangePW_PasswordMismatch_Error");
        //Validate the error message when there are No Special characters in text boxes.
        Assert.assertEquals(wqChangePWPage.validate_Click_ChangePassword_Button_With_Incorrect_Value_Gives_AnErrorMessage(),expectedError);

    }

    @Test
    public void verify_Clicking_ChangePassword_Button_with_PasswordMatch(){
        wqChangePWPage.step_clear_Password_TextBoxes();
        String textEqualSix = data.getValueByName("ChangePW_MoreSix_1Num_5Special");
        wqChangePWPage.Step_Enter_Password_ChangePW(textEqualSix);
        wqChangePWPage.step_Click_ChangePassword_Button();
        String expectedPage = data.getValueByName("TandC_Page_Title");
        //Validate the T&C Page navigation
        Assert.assertEquals(wqChangePWPage.check_Page_Browser_Title(),expectedPage);

    }

    @Test
    public void verify_Client_Logins_WithOldPassword_Gives_An_Error_Message() throws Exception {
        initDomainObjects(DRIVER);
        String siteUrl = data.getValueByName("url");
        setSiteURL(siteUrl);
        wqHomePage.
                action_Navigate_To_LoginPage();
        String Uname = data.getValueByName("ClientFirstLogin_UName");
        String Password = data.getValueByName("ClientFirstLogin_PW");
        wqLoginPage.
                step_User_Enter_Given_Credentials(Uname,Password).
                step_User_Click_Login_Button();
        String expectedPage = data.getValueByName("LoginPage_SignInPage");
        //Validate the WQ Login is not Successful
        Assert.assertEquals(wqChangePWPage.check_Page_Browser_Title(),expectedPage);
        String expectedErrorMessage = data.getValueByName("LoginPage_ErrorMessage");
        Assert.assertEquals(wqLoginPage.validate_ErrorMessage_For_Invalid_UNAndPW(),expectedErrorMessage);

    }

    @Test
    public void verify_Client_Logins_WithChangedPassword_goes_to_TAndCPage() throws Exception {
        wqLoginPage.step_Clear_Username_Field();
        wqLoginPage.step_clear_Password_Field();
        String Uname = data.getValueByName("ClientFirstLogin_UName");
        String Password = data.getValueByName("ChangePW_MoreSix_1Num_5Special");
        wqLoginPage.
                step_User_Enter_Given_Credentials(Uname,Password).
                step_User_Click_Login_Button();
        String expectedPage = data.getValueByName("TandC_Page_Title");
        //Validate the WQ Login is not Successful
        Assert.assertEquals(wqChangePWPage.check_Page_Browser_Title(),expectedPage);

    }

    @Test
    public void verify_The_Browser_Title(){
        String expectedTitle = data.getValueByName("TandC_Page_Title");
        Assert.assertEquals(wqTAndCPage.validate_BrowserTitle(), expectedTitle);

    }

    @Test
    public void verify_The_PageTitle(){
        String expectedPageTitle = data.getValueByName("TAndCPage_PageTitle");
        Assert.assertEquals(wqTAndCPage.check_PageTitle_Of_TAndCPage(),expectedPageTitle);

    }

    @Test
    public void verify_IAgree_RadioButton_IsAvailable(){
        Assert.assertNotNull(wqTAndCPage.validate_IAgree_RadioButton_Availability());
    }

    @Test
    public void verify_IDisagree_RadioButton_IsAvailable(){
        Assert.assertNotNull(wqTAndCPage.validate_IDisagree_RadioButton_Availability());
    }

    @Test
    public void verify_IAgree_ContentLabel_IsAvailable(){
        String expectedLabel = data.getValueByName("TAndCPage_IAgreeContent");
        Assert.assertEquals(wqTAndCPage.check_IAgree_Button_Text(),expectedLabel);
    }

    @Test
    public void verify_IDisagree_ContentLabel_IsAvailable(){
        String expectedLabel = data.getValueByName("TAndCPage_IDisagreeContent");
        Assert.assertEquals(wqTAndCPage.check_IDisagree_Button_Text(),expectedLabel);
    }

    @Test
    public void verify_IAgree_RadioButton_IsDefaultSelected(){
        Assert.assertNotNull(wqTAndCPage.validate_IAgree_Button_Default_Selected());
        //Will be completed after radio button deselected method is added by Suranjith
        //remove after testing
        //Assert.assertNotNull(wqTAndCPage.validate_RejectReason_TextArea_Is_NotDisplaying());

    }

    //-----
    @Test
    public void verify_IDisagree_RadioButton_IsDefault_DeSelected(){
        //Will be completed after radio button deselected method is added by Suranjith
        Assert.assertNotNull(wqTAndCPage.validate_IDisgree_Button_Default_deSelected());
    }

    @Test
    public void verify_Selecting_IDoNotAgree_RadioButton_makes_IAgree_RadioButton_Deselected(){
        //Will be completed after radio button deselected method is added by Suranjith
        wqTAndCPage.step_selectDisagreeButton();
        wqTAndCPage.step_refresh_ThePage();
        Assert.assertNotNull(wqTAndCPage.validate_IAgree_Button_DeSelected());

    }

    @Test
    public void verify_selecting_IDoNotAgree_Button_Displays_A_TextArea(){
        wqTAndCPage.step_selectDisagreeButton();
        Assert.assertNotNull(wqTAndCPage.validate_RejectReason_TextArea_IsDisplaying());
    }


    @Test
    public void verify_TextArea_PlaceHolderText(){
        String textAreaPlaceHolder = data.getValueByName("TAndCPage_ReasonPlaceHolder");
        Assert.assertEquals(wqTAndCPage.validate_PlaceholderText_of_DoNotAgree_TextArea(),textAreaPlaceHolder);
    }

    @Test
    public void verify_TextArea_IsEditable(){
        String textToEnter = data.getValueByName("AM_textToEnter");
        wqTAndCPage.validate_TextArea_IsEditable(textToEnter);

    }

    @Test
    public void verify_Confirm_Button_Available(){
        Assert.assertNotNull(wqTAndCPage.validate_ConfirmButton_IsAvailable());

    }

    @Test
    public void verify_ConfirmButton_Text_IsAvailable(){
        String expectedButtonText = data.getValueByName("TAndCPage_ConfirmButton");
        Assert.assertEquals(wqTAndCPage.validate_ConfirmButton_Text(),expectedButtonText);
    }

    @Test
    public void verify_Client_selects_Idisagree_RadioButton__andClicks_Confirm_Without_Reason_Gives_An_Error() throws Exception {

        wqTAndCPage
                .step_clearTextArea()
                .step_selectDisagreeButton()
                .step_click_ConfirmButton();

        //error message code from Shammi
        Assert.assertNotNull(wqTAndCPage.validate_ErrorMessage());

    }

    @Test
    public void verify_Client_selects_Idisagree_RadioButton__andClicks_Confirm_With_Reason_GoesTo_TAndCInprogressPage(){
        String textToEnter = data.getValueByName("AM_textToEnter");
        wqTAndCPage
                .step_selectDisagreeButton()
                .validate_TextArea_IsEditable(textToEnter)
                .step_click_ConfirmButton();
        String expectedBrowserTitle = data.getValueByName("TAndCInprogressPage_BrowserTitle");
        Assert.assertNotNull(wqTAndCPage.validate_BrowserTitle(),expectedBrowserTitle);
    }

    @Test
    public void verify_Client_Logins_And_goesto_TAndC_InProgressPage() throws Exception {
        initDomainObjects(DRIVER);
        String siteUrl = data.getValueByName("url");
        setSiteURL(siteUrl);
        wqHomePage.action_Navigate_To_LoginPage();
        String uName = data.getValueByName("ClientFirstLogin_UName");
        String Password = data.getValueByName("ChangePW_MoreSix_1Num_5Special");
        wqLoginPage.step_User_Enter_Given_Credentials(uName,Password).
                step_User_Click_Login_Button();
        String expectedPage = data.getValueByName("TAndCInprogressPage_BrowserTitle");
        //Validate the WQ Login redirects to T&C page
        Assert.assertEquals(wqChangePWPage.check_Page_Browser_Title(),expectedPage);
    }

    @Test
    public void verify_TAndC_InprogressPage_PageTitle(){
        String expectedPageTitle = data.getValueByName("TAndCInprogressPage_PageTitle");
        Assert.assertEquals(wqTAndCInProgressPage.validate_PageTitle(),expectedPageTitle);

    }

    @Test
    public void verify_PromptAgain_Client() throws IOException {
        initDomainObjects(DRIVER);
        String siteUrl = data.getValueByName("BackOfficeUrl");
        setSiteURL(siteUrl);
        String AMUsername = data.getValueByName("AM_Username");
        String AMPassword = data.getValueByName("AM_Password");
        String WindowsAuthOption = data.getValueByName("SignInOption1");
        wqBackOfficeLoginPage
                .action_Login_as_BOUser(AMUsername,AMPassword);
        wqBackOfficeLoginPage
                .action_selectAuthentication(WindowsAuthOption);

        String clientName = data.getValueByName("ClientFirstLogin_ClientName");
        wqamDashboardPage
                .step_user_clicks_TANDC_Rejected_Client(clientName);

        String eMail = data.getValueByName("ClientFirstLogin_UName");
        Assert.assertEquals(wqTermsEvaluationPage.check_Email_Client_Data_In_ClientTermsEvaluationPage(),eMail);

        String rejectedReason = data.getValueByName("AM_textToEnter");
        Assert.assertEquals(wqTermsEvaluationPage.check_Rejected_Reason_In_ClientTermsEvaluationPage(),rejectedReason);

        wqTermsEvaluationPage
                .step_click_PromptAgain_Button();
        String expectedTitle = data.getValueByName("AM_HomePage");
        Assert.assertEquals(wqamDashboardPage.validate_user_goesTo_Page(),expectedTitle);

    }

    @Test
    public void verify_Client_selects_IAgree_RadioButton__andClicks_Confirm_GoesTo_TCAcceptedPage() throws Exception {
        String siteUrl = data.getValueByName("url");
        setSiteURL(siteUrl);
        wqHomePage.
                action_Navigate_To_LoginPage();
        wqLoginPage.step_Clear_Username_Field();
        String Uname = data.getValueByName("ClientFirstLogin_UName");
        String Password = data.getValueByName("ChangePW_MoreSix_1Num_5Special");
        wqLoginPage.
                step_User_Enter_Given_Credentials(Uname,Password).
                step_User_Click_Login_Button();
        wqTAndCPage
                .step_click_ConfirmButton();
        String expectedBrowserTitle = data.getValueByName("TAndCAcceptedPage_BrowserTitle");
        Assert.assertEquals(wqTAndCPage.validate_BrowserTitle(),expectedBrowserTitle);

    }

    //T And C Accepted Page
    @Test
    public void verify_BrowserTitle_Of_TCAcceptedPage(){
        String expectedBrowserTitle = data.getValueByName("TAndCAcceptedPage_BrowserTitle");
        Assert.assertEquals(wqTAndCAccepted.validate_BrowserTitle(),expectedBrowserTitle);

    }

    @Test
    public void verify_PageTitle_Of_TCAcceptedPage(){
        String expectedPageTitle = data.getValueByName("TAndCAcceptedPage_PageTitle");
        Assert.assertEquals(wqTAndCAccepted.validate_PageTitle(),expectedPageTitle);

    }

    @Test
    public void verify_ProceedButton_Available(){
        Assert.assertNotNull(wqTAndCAccepted.validate_ProceedButton_IsAvailable());
    }

    @Test
    public void verify_ProceedButton_Text(){
        String expectedButtonText = data.getValueByName("TAndCAcceptedPage_ButtonText");
        Assert.assertEquals(wqTAndCAccepted.validate_The_ProceedButton_Text(),expectedButtonText);
    }

    @Test
    public void verify_Clciking_ProceedButton_GoesTo_ClientProfileUpdatePage(){
        wqTAndCAccepted
                .step_Clcking_ProceedButton();
        String expectedPageTitle = data.getValueByName("ClientProfileUpdate_PageTitle");
        Assert.assertEquals(wqClientProfileUpdatePage.validate_PageTitle(),expectedPageTitle);
    }




}
