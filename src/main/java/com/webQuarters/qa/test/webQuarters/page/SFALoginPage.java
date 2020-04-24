package com.webQuarters.qa.test.webQuarters.page;


import com.webQuarters.qa.automation.SeleniumBase;
import com.webQuarters.qa.data.UI.elements.webQuarters.elements.sfaHomePage;
import com.webQuarters.qa.data.UI.elements.webQuarters.elements.sfaLoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by e.koshila on 3/17/2020.
 */

public class SFALoginPage implements sfaLoginPage,sfaHomePage {

    SeleniumBase seleniumBase;

    public SFALoginPage(WebDriver driver) {
        seleniumBase = new SeleniumBase(driver);
    }

    //Check UIview of the page

    public void check_WQ_Logo_Is_Available() {
        seleniumBase.checkIsElementEnabled(LOGIN_PAGE_COMPANY_LOGO_XPATH);
    }

    public String check_Login_Page_Browser_Title() {
        return seleniumBase.getTitle();
    }

    public String check_Login_Page_Title() {
        return seleniumBase.getText(LOGIN_PAGE_TITLE_CSS,LOGIN_PAGE_TITLE_XPATH);
    }

    public String check_Login_Page_Text() {
        return seleniumBase.getText(LOGIN_PAGE_TEXT_CSS,LOGIN_PAGE_TEXT_XPATH);
    }

    public void check_Username_Field_Is_Available() {
        seleniumBase.checkIsElementEnabled(LOGIN_USER_NAME_XPATH);
    }

    public void check_Username_Icon_Is_Available() {
        seleniumBase.checkIsElementEnabled(LOGIN_USER_NAME_ICON_XPATH);
    }

    public String check_Username_PlaceHold_Text() {
        return (seleniumBase.getTextByAttribute(LOGIN_USER_NAME_CSS,LOGIN_USER_NAME_XPATH,"placeholder"));

    }

    public void check_Password_Feild_Is_Available() {
        seleniumBase.checkIsElementEnabled(LOGIN_PASSWORD_XPATH);
    }

    public void check_Password_Icon_Is_Available() {
        seleniumBase.checkIsElementEnabled(LOGIN_PASSWORD_ICON_XPATH);
    }

    public String check_Password_PlaceHold_Text() {
        return (seleniumBase.getTextByAttribute(LOGIN_PASSWORD_CSS,LOGIN_PASSWORD_XPATH,"placeholder"));

    }
    public void check_Login_Button_Available() {
        seleniumBase.checkIsElementEnabled(LOGIN_BTN_XPATH);
    }

    public void check_Forgot_Password_Link_Available() {
        seleniumBase.checkIsElementEnabled(LOGIN_FORGOT_PASSWORD_XPATH);
    }

    public String check_Login_Button_Text() {
        return  seleniumBase.getText(LOGIN_BTN_CSS,LOGIN_BTN_XPATH);
    }

    public String check_Forgot_Password_Link_Text() {
        return  seleniumBase.getText(LOGIN_FORGOT_PASSWORD_CSS,LOGIN_FORGOT_PASSWORD_XPATH);
    }

    public void check_Username_Field_Text_Types(String name) {
        seleniumBase.type(LOGIN_USER_NAME_CSS,LOGIN_USER_NAME_XPATH,name);
        seleniumBase.validate_Email_Address(name);
    }

    public String check_Password_Feild_Is_Secured() {
        return seleniumBase.getTextByAttribute(LOGIN_PASSWORD_CSS,LOGIN_PASSWORD_XPATH,"type");
    }

    public SFALoginPage step_User_Click_Login_Button() throws Exception {
        seleniumBase.click(LOGIN_BTN_XPATH,LOGIN_BTN_CSS);
        return this;
    }

    public SFALoginPage step_User_Enter_Given_Credentials (String UN, String PW) throws Exception{
        action_Set_User_Credentials(UN,PW);
        return this;
    }

    private void action_Set_User_Credentials(String Uname, String Password) throws Exception {
        Thread.sleep(3000);
        seleniumBase.clear_Data_Feilds(LOGIN_USER_NAME_XPATH);
        seleniumBase.type(LOGIN_USER_NAME_CSS,LOGIN_USER_NAME_XPATH,Uname);
        seleniumBase.type(LOGIN_PASSWORD_CSS,LOGIN_PASSWORD_XPATH,Password);
    }

    public String check_And_Validate_Welcome_Message() throws InterruptedException {
        Thread.sleep(5000);
        String ToastTitle = seleniumBase.getText(By.xpath(HOME_PAGE_WELCOME_MSG_TITLE_XPATH));
        String ToastMsg = seleniumBase.getText(By.xpath(HOME_PAGE_WELCOME_MSG_XPATH));

        String Message = ToastTitle + " " + ToastMsg;

        System.out.println("ToastTitle ="+ ToastTitle);
        System.out.println("ToastMsg ="+ ToastMsg);

        return Message;
    }

    public String check_And_Validate_Incorrect_Email_Error_Message() {
        String ToastTitle = seleniumBase.getText(By.xpath(LOGIN_PAGE_TOAST_MSG_TITLE_XPATH));
        String ToastMsg = seleniumBase.getText(By.xpath(LOGIN_PAGE_TOAST_MSG_XPATH));

        String Message = ToastTitle + " " + ToastMsg;

        System.out.println("ToastTitle ="+ ToastTitle);
        System.out.println("ToastMsg ="+ ToastMsg);

        return Message;
    }

    public String check_And_Validate_Incorrect_Password_Error_Message() {
        String ToastTitle = seleniumBase.getText(By.xpath(LOGIN_PAGE_TOAST_MSG_TITLE_XPATH));
        String ToastMsg = seleniumBase.getText(By.xpath(LOGIN_PAGE_TOAST_MSG_XPATH));

        String Message = ToastTitle + " " + ToastMsg;

        System.out.println("ToastTitle ="+ ToastTitle);
        System.out.println("ToastMsg ="+ ToastMsg);

        return Message;
    }

    public String check_And_Validate_Incorrect_Email_Incorrect_Password_Error_Message() {
        String ToastTitle = seleniumBase.getText(By.xpath(LOGIN_PAGE_TOAST_MSG_TITLE_XPATH));
        String ToastMsg = seleniumBase.getText(By.xpath(LOGIN_PAGE_TOAST_MSG_XPATH));

        String Message = ToastTitle + " " + ToastMsg;

        System.out.println("ToastTitle ="+ ToastTitle);
        System.out.println("ToastMsg ="+ ToastMsg);

        return Message;
    }

    public String check_And_Validate_Invalid_Email_Error_Message() throws InterruptedException {
        Thread.sleep(2000);
        return seleniumBase.getText(INVALID_EMAIL_ERROR_MSG_CSS,INVALID_EMAIL_ERROR_MSG_XPATH);
    }

    public String check_And_Validate_Invalid_Password_Error_Message() {
        seleniumBase.clear_Data_Feilds(LOGIN_USER_NAME_XPATH);
        return seleniumBase.getText(INVALID_PASSWORD_ERROR_MSG_CSS,INVALID_PASSWORD_ERROR_MSG_XPATH);
    }

    public String check_And_Validate_Required_Email_Field_Error_Message() {
        return seleniumBase.getText(REQUIRED_EMAIL_ERROR_MSG_CSS,REQUIRED_EMAIL_ERROR_MSG_XPATH);
    }

    public String check_And_Validate_Required_Password_Field_Error_Message() {
        return seleniumBase.getText(REQUIRED_PASSWORD_ERROR_MSG_CSS,REQUIRED_PASSWORD_ERROR_MSG_XPATH);
    }

    public void action_Click_On_Forgot_Password_Link() {
        seleniumBase.click(LOGIN_FORGOT_PASSWORD_XPATH,LOGIN_FORGOT_PASSWORD_CSS);
    }


}



