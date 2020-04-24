package com.webQuarters.qa.test.webQuarters.page;


import com.webQuarters.qa.automation.SeleniumBase;
import com.webQuarters.qa.data.UI.elements.webQuarters.elements.sfaForgotPasswordPage;
import com.webQuarters.qa.data.UI.elements.webQuarters.elements.sfaHomePage;
import com.webQuarters.qa.data.UI.elements.webQuarters.elements.sfaLoginPage;
import org.openqa.selenium.WebDriver;

/**
 * Created by e.koshila on 3/24/2020.
 */

public class SFAForgotPasswordPage implements sfaLoginPage,sfaHomePage, sfaForgotPasswordPage {

    SeleniumBase seleniumBase;

    public SFAForgotPasswordPage(WebDriver driver) {
        seleniumBase = new SeleniumBase(driver);
    }

    //Check UI view of the page

    public void check_WQ_Logo_Is_Available() {
        seleniumBase.checkIsElementEnabled(FORGOT_PW_PAGE_COMPANY_LOGO_XPATH);
    }

    public String check_Forgot_Password_Page_Browser_Title() {
        return seleniumBase.getTitle();
    }

    public String check_Forgot_Password_Page_Title() {
        return seleniumBase.getText(FORGOT_PW_PAGE_TITLE_CSS, FORGOT_PW_PAGE_TITLE_XPATH);
    }

    public String check_Forgot_Password_Page_Text() {
        return seleniumBase.getText(FORGOT_PW_PAGE_TEXT_CSS, FORGOT_PW_PAGE_TEXT_XPATH);
    }

    public void check_Email_Address_Field_Is_Available() {
        seleniumBase.checkIsElementEnabled(FORGOT_PW_EMAIL_XPATH);
    }

    public void check_Email_Address_Icon_Is_Available() {
        seleniumBase.checkIsElementEnabled(FORGOT_PW_PAGE_EMAIL_ICON_XPATH);
    }

    public String check_Email_Address_PlaceHold_Text() {
        return (seleniumBase.getTextByAttribute(FORGOT_PW_EMAIL_CSS, FORGOT_PW_EMAIL_XPATH, "placeholder"));
    }

    public void check_Reset_Password_Button_Available() {
        seleniumBase.checkIsElementEnabled(RESET_PW_BTN_XPATH);
    }

    public String check_Reset_Password_Button_Text() {
        return  seleniumBase.getText(RESET_PW_BTN_CSS,RESET_PW_BTN_XPATH);
    }

    public void check_Back_To_Login_Link_Available() {
        seleniumBase.checkIsElementEnabled(BACK_TO_LOGIN_LINK_XPATH);
    }

    public String check_Back_To_Login_Link_Text() {
        return  seleniumBase.getText(BACK_TO_LOGIN_LINK_CSS,BACK_TO_LOGIN_LINK_XPATH);
    }

    //Functional

    public SFAForgotPasswordPage step_User_Enter_Email_To_Reset_Password(String email) throws Exception {
        action_Set_User_Email_To_Reset_Password(email);
        return this;
    }
    private void action_Set_User_Email_To_Reset_Password(String email) throws Exception {
        Thread.sleep(3000);
        seleniumBase.type(FORGOT_PW_EMAIL_CSS,FORGOT_PW_EMAIL_XPATH,email);
    }

    public void step_User_Click_Reset_Password_Button() {
        seleniumBase.click(RESET_PW_BTN_XPATH,RESET_PW_BTN_CSS);
    }

    public void check_Email_Address_Field_Text_Types(String name) {
        seleniumBase.type(FORGOT_PW_EMAIL_CSS,FORGOT_PW_EMAIL_XPATH,name);
        seleniumBase.validate_Email_Address(name);
    }

    public void action_Click_On_Back_To_Login_Link() {
        seleniumBase.click(BACK_TO_LOGIN_LINK_XPATH,BACK_TO_LOGIN_LINK_CSS);
    }

    public String check_And_Validate_Required_Email_Field_Error_Message() {
        return seleniumBase.getText(FORGOT_PW_PAGE_REQUIRED_EMAIL_ERROR_MSG_CSS,FORGOT_PW_PAGE_REQUIRED_EMAIL_ERROR_MSG_XPATH);
    }

    public String check_And_Validate_Incorrect_Email_Field_Error_Message() {
        return seleniumBase.getText(FORGOT_PW_INCORRECT_EMAIL_ERROR_MSG_CSS,FORGOT_PW_INCORRECT_EMAIL_ERROR_MSG_XPATH);
    }

    public String check_And_Validate_Invalid_Email_Field_Error_Message() {
        return seleniumBase.getText(FORGOT_PW_INVALID_EMAIL_ERROR_MSG_CSS,FORGOT_PW_INVALID_EMAIL_ERROR_MSG_XPATH);
    }

    public String check_And_Validate_Password_Recovery_Link_Success_Message() {
        return seleniumBase.getText(FORGOT_PW_RECOVERY_LINK_SUCCESS_MSG_CSS,FORGOT_PW_RECOVERY_LINK_SUCCESS_MSG_XPATH);
    }



 }
