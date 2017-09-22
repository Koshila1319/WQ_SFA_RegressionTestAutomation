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
        String siteUrl = data.getValueByName("ClientFirstLogin_link");
        setSiteURL(siteUrl);
    }

    @AfterClass
    public void endTestMethod() throws Throwable{
        //quitDriver();
    }

    @Test
    public void verify_The_Login_Page_Browser_Title(){
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
    public void verify_Clicking_ChangePassword_Button_With_Less_Than_SixValues_InBothTextBoxes(){
        String textLessSix = data.getValueByName("ChangePW_TextLessSix");
        wqChangePWPage.Step_Enter_Values_Less_Than_Six(textLessSix);
        wqChangePWPage.step_Click_ChangePassword_Button();
        String expectedError = data.getValueByName("ChangePW_Error");
        //Validate the error message when there are less than six characters in text boxes.
        Assert.assertEquals(wqChangePWPage.validate_Click_ChangePassword_Button_With_Incorrect_Value_Gives_AnErrorMessage(),expectedError);

    }

    //This depends with the client who is registering and needs to run at the end
    @Test
    public void verify_Clicking_ChangePassword_Button_With_more_Than_SixValues_InBothTextBoxes(){
        /*wqChangePWPage.step_clear_Password_TextBoxes();
        String textMoreSix = data.getValueByName("ChangePW_TextMoreSix");
        wqChangePWPage.Step_Enter_Values_More_Than_Six(textMoreSix);
        wqChangePWPage.step_Click_ChangePassword_Button();
        String expectedPage = data.getValueByName("TandC_Page_Title");
        //Validate the error message when there are six characters in text boxes.
        Assert.assertEquals(wqChangePWPage.check_TandC_Page_Browser_Title(),expectedPage);*/

    }

    //This depends with the client who is registering and needs to run at the end
    @Test
    public void verify_Clicking_ChangePassword_Button_With_SixValues_InBothTextBoxes(){
        /*wqChangePWPage.step_clear_Password_TextBoxes();
        String textEqualSix = data.getValueByName("ChangePW_TextEqualSix");
        wqChangePWPage.Step_Enter_Values_Equal_Than_Six(textEqualSix);
        wqChangePWPage.step_Click_ChangePassword_Button();
        String expectedPage = data.getValueByName("TandC_Page_Title");
        //Validate the error message when there are six characters in text boxes.
        Assert.assertEquals(wqChangePWPage.check_TandC_Page_Browser_Title(),expectedPage);*/

    }

    @Test
    public void verify_Clicking_ChangePassword_Button_With_SpecialCahracter_Without_NumericCharacter_InBothTextBoxes(){

    }

}
