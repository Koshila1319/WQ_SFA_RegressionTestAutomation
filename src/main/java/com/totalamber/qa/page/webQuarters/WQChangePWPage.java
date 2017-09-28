package com.totalamber.qa.page.webQuarters;

import com.totalamber.qa.automation.SeleniumBase;
import com.totalamber.qa.data.UI.elements.webQuarters.wqChangePWPage;
import org.openqa.selenium.WebDriver;

/**
 * Created by t.piyananda on 21/09/2017.
 */
public class WQChangePWPage implements wqChangePWPage {

    SeleniumBase seleniumBase;
    public WQChangePWPage(WebDriver driver) {
        seleniumBase = new SeleniumBase(driver);
    }


    public String validate_the_PageTitle() {
        return seleniumBase.verifyDataEquals(CHANGEPWPAGE_TITLE_XPATH);
    }

    public String validate_PageContent1() {
        return seleniumBase.verifyDataEquals(CHANGEPWPAGE_CONTENT1_XPATH);
    }

    public String validate_PageContent2() {
        return seleniumBase.verifyDataEquals(CHANGEPWPAGE_CONTENT2_XPATH);
    }

    public boolean validate_FieldWrapper_Is_Available() {
        return seleniumBase.verifyAvailableObject(CHANGEPWPAGE_FIELDWRAPPER_XPATH);
    }

    public WQChangePWPage step_User_MoouseHover_the_FieldWrapper() {
        seleniumBase.mouseHoverAnElement(CHANGEPWPAGE_FIELDWRAPPER_XPATH);
        return this;
    }

    public String validate_FieldWrapper_LabelContent() {
        return seleniumBase.getTextByAttribute(CHANGEPWPAGE_FIELDWRAPPER_CSS,CHANGEPWPAGE_FIELDWRAPPER_XPATH,"title");
    }

    public String validate_PlaceholderText_Of_Password() {
        return seleniumBase.getTextByAttribute(CHANGEPWPAGE_PASSWORD_CSS,CHANGEPWPAGE_PASSWORD_XPATH,"placeholder");
    }

    public WQChangePWPage validate_EnterPassword_Textbox_Available() {
        seleniumBase.verifyAvailableObject(CHANGEPWPAGE_PASSWORD_XPATH);
        return this;
    }

    public WQChangePWPage validate_Characters_Can_Enter_in_Password(String textToEnter) {
        seleniumBase.type(CHANGEPWPAGE_PASSWORD_CSS,CHANGEPWPAGE_PASSWORD_XPATH, textToEnter);
        return this;
    }

    public String check_Password_Feild_Is_Secured() {
        return seleniumBase.getTextByAttribute(CHANGEPWPAGE_PASSWORD_CSS,CHANGEPWPAGE_PASSWORD_XPATH,"type");
    }

    public String validate_PlaceholderText_Of_ChangePassword() {
        return seleniumBase.getTextByAttribute(CHANGEPWPAGE_CONFIRM_PASSWORD_CSS,CHANGEPWPAGE_CONFIRM_PASSWORD_XPATH,"placeholder");
    }

    public WQChangePWPage validate_ChangePassword_Textbox_Available() {
        seleniumBase.verifyAvailableObject(CHANGEPWPAGE_CONFIRM_PASSWORD_XPATH);
        return this;
    }

    public WQChangePWPage validate_Characters_Can_Enter_in_ChangePassword(String textToEnter) {
        seleniumBase.type(CHANGEPWPAGE_CONFIRM_PASSWORD_CSS,CHANGEPWPAGE_CONFIRM_PASSWORD_XPATH, textToEnter);
        return this;
    }

    public String check_ChangePassword_Feild_Is_Secured() {
        return seleniumBase.getTextByAttribute(CHANGEPWPAGE_CONFIRM_PASSWORD_CSS,CHANGEPWPAGE_CONFIRM_PASSWORD_XPATH,"type");
    }


    public WQChangePWPage check_ChangePassword_Button_Available() {
        seleniumBase.checkIsElementEnabled(CHANGEPWPAGE_CHANGEPASSWORD_BUTTON_XPATH);
        return this;
    }

    public String check_ChangePassword_Button_Text() {
        return seleniumBase.getTextByAttribute(CHANGEPWPAGE_CHANGEPASSWORD_BUTTON_CSS, CHANGEPWPAGE_CHANGEPASSWORD_BUTTON_XPATH, "value");
    }

    public WQChangePWPage step_clear_Password_TextBoxes() {
        seleniumBase.clearTextBox(CHANGEPWPAGE_PASSWORD_XPATH);
        seleniumBase.clearTextBox(CHANGEPWPAGE_CONFIRM_PASSWORD_XPATH);
        return this;
    }

    public WQChangePWPage step_Click_ChangePassword_Button() {
        seleniumBase.click(CHANGEPWPAGE_CHANGEPASSWORD_BUTTON_XPATH, CHANGEPWPAGE_CHANGEPASSWORD_BUTTON_CSS);
        return this;
    }

    public String validate_Click_ChangePassword_Button_With_Incorrect_Value_Gives_AnErrorMessage() {
        return seleniumBase.getText(CHANGEPWPAGE_NULL_ERROR_MSG_CSS,CHANGEPWPAGE_NULL_ERROR_MSG_XPATH);
    }

    public WQChangePWPage Step_Enter_Password_ChangePW(String testText) {
        seleniumBase.type(CHANGEPWPAGE_PASSWORD_CSS, CHANGEPWPAGE_PASSWORD_XPATH,testText);
        seleniumBase.type(CHANGEPWPAGE_CONFIRM_PASSWORD_CSS, CHANGEPWPAGE_CONFIRM_PASSWORD_XPATH, testText);
        return this;
    }

    public WQChangePWPage Step_Enter_Password_ChangePW_with_Mismatch(String password, String changepassword) {
        seleniumBase.type(CHANGEPWPAGE_PASSWORD_CSS, CHANGEPWPAGE_PASSWORD_XPATH,password);
        seleniumBase.type(CHANGEPWPAGE_CONFIRM_PASSWORD_CSS, CHANGEPWPAGE_CONFIRM_PASSWORD_XPATH, changepassword);
        return this;
    }

    public WQChangePWPage Step_Enter_Values_More_Than_Six(String textMoreSix) {
        seleniumBase.type(CHANGEPWPAGE_PASSWORD_CSS, CHANGEPWPAGE_PASSWORD_XPATH,textMoreSix);
        seleniumBase.type(CHANGEPWPAGE_CONFIRM_PASSWORD_CSS, CHANGEPWPAGE_CONFIRM_PASSWORD_XPATH, textMoreSix);
        return this;
    }

    public WQChangePWPage Step_Enter_Values_Equal_Than_Six(String textEqualSix) {
        seleniumBase.type(CHANGEPWPAGE_PASSWORD_CSS, CHANGEPWPAGE_PASSWORD_XPATH,textEqualSix);
        seleniumBase.type(CHANGEPWPAGE_CONFIRM_PASSWORD_CSS, CHANGEPWPAGE_CONFIRM_PASSWORD_XPATH, textEqualSix);
        return this;
    }

    public String check_Page_Browser_Title() {
        return seleniumBase.getTitle();
    }

    public WQChangePWPage Step_Enter_Password_With_SpecialCahracter_Without_NumericCharacter_InBothTextBoxes(String text_with_specialChar) {
        seleniumBase.type(CHANGEPWPAGE_PASSWORD_CSS, CHANGEPWPAGE_PASSWORD_XPATH,text_with_specialChar);
        seleniumBase.type(CHANGEPWPAGE_CONFIRM_PASSWORD_CSS, CHANGEPWPAGE_CONFIRM_PASSWORD_XPATH, text_with_specialChar);
        return this;
    }

    public WQChangePWPage Step_Enter_Password_ChangePW_WithNumeric_WithoutSpecialChar_InBothTextBoxes(String text_with_numericChar) {
        seleniumBase.type(CHANGEPWPAGE_PASSWORD_CSS, CHANGEPWPAGE_PASSWORD_XPATH,text_with_numericChar);
        seleniumBase.type(CHANGEPWPAGE_CONFIRM_PASSWORD_CSS, CHANGEPWPAGE_CONFIRM_PASSWORD_XPATH, text_with_numericChar);
        return this;
    }


}