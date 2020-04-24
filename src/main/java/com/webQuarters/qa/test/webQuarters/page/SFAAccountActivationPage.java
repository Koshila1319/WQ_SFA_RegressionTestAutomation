package com.webQuarters.qa.test.webQuarters.page;


import com.webQuarters.qa.automation.SeleniumBase;
import com.webQuarters.qa.automation.TestBase;
import com.webQuarters.qa.data.UI.elements.webQuarters.elements.sfaAccountActivationPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by e.koshila on 3/25/2020.
 */

public class SFAAccountActivationPage extends TestBase implements sfaAccountActivationPage {

    SeleniumBase seleniumBase;

    public SFAAccountActivationPage(WebDriver driver) {
        seleniumBase = new SeleniumBase(driver);
    }

    //UI view
    public String check_Account_Activation_Page_Browser_Title() {
        return seleniumBase.getTitle();
    }

    public String check_Account_Activation_Page_Title() {
        return seleniumBase.getText(ACTIVATION_PAGE_TITLE_CSS,ACTIVATION_PAGE_TITLE_XPATH);
    }

    public String check_Account_Activation_Page_Text() {
        return seleniumBase.getText(ACTIVATION_PAGE_TEXT_CSS,ACTIVATION_PAGE_TEXT_XPATH);
    }

    public void check_Username_Field_Is_Available() {
        seleniumBase.checkIsElementEnabled(ACTIVATION_PAGE_EMAIL_FIELD_XPATH);
    }

    public void check_Username_Icon_Is_Available() {
        seleniumBase.checkIsElementEnabled(ACTIVATION_PAGE_EMAIL_FIELD_XPATH);
    }

    public String check_Username_PlaceHold_Text() {
        return (seleniumBase.getTextByAttribute(ACTIVATION_PAGE_EMAIL_FIELD_CSS,ACTIVATION_PAGE_EMAIL_FIELD_XPATH,"placeholder"));

    }



    public void check_Activation_Code_Field_Is_Available() {
        seleniumBase.checkIsElementEnabled(ACTIVATION_PAGE_ACTIVATION_CODE_FIELD_XPATH);
    }

    public void check_Activation_Code_Icon_Is_Available() {
        seleniumBase.checkIsElementEnabled(ACTIVATION_PAGE_ACTIVATION_CODE_FIELD_XPATH);
    }

    public String check_Activation_Code_PlaceHold_Text() {
        return (seleniumBase.getTextByAttribute(ACTIVATION_PAGE_ACTIVATION_CODE_FIELD_CSS,ACTIVATION_PAGE_ACTIVATION_CODE_FIELD_XPATH,"placeholder"));
    }



    public void check_New_Password_Field_Is_Available() {
        seleniumBase.checkIsElementEnabled(ACTIVATION_PAGE_NEW_PASSWORD_FIELD_XPATH);
    }

    public void check_New_Password_Icon_Is_Available() {
        seleniumBase.checkIsElementEnabled(ACTIVATION_PAGE_NEW_PASSWORD_FIELD_XPATH);
    }

    public String check_New_Password_PlaceHold_Text() {
        return (seleniumBase.getTextByAttribute(ACTIVATION_PAGE_NEW_PASSWORD_FIELD_CSS,ACTIVATION_PAGE_NEW_PASSWORD_FIELD_XPATH,"placeholder"));
    }



    public void check_Retype_Password_Field_Is_Available() {
        seleniumBase.checkIsElementEnabled(ACTIVATION_PAGE_RETYPE_PASSWORD_FIELD_XPATH);
    }

    public void check_Retype_Password_Icon_Is_Available() {
        seleniumBase.checkIsElementEnabled(ACTIVATION_PAGE_RETYPE_PASSWORD_FIELD_XPATH);
    }

    public String check_Retype_Password_PlaceHold_Text() {
        return (seleniumBase.getTextByAttribute(ACTIVATION_PAGE_RETYPE_PASSWORD_FIELD_CSS,ACTIVATION_PAGE_RETYPE_PASSWORD_FIELD_XPATH,"placeholder"));
    }


    public void check_Activate_Button_Available() {
        seleniumBase.checkIsElementEnabled(ACTIVATION_PAGE_ACTIVATE_BUTTON_XPATH);
    }

    public String check_Activate_Button_Text() {
        return  seleniumBase.getText(ACTIVATION_PAGE_ACTIVATE_BUTTON_CSS,ACTIVATION_PAGE_ACTIVATE_BUTTON_XPATH);
    }


    public SFAAccountActivationPage step_User_Enter_Activation_Details_for_Password_Recovery(String activationCode, String newPassword, String retypePassword) throws Exception {
        action_Set_Activation_Details_for_Password_Recovery(activationCode, newPassword,retypePassword);
        return this;
    }
    private void action_Set_Activation_Details_for_Password_Recovery(String activationCode, String newPassword, String retypePassword) throws Exception {
        Thread.sleep(3000);
        seleniumBase.type(ACTIVATION_PAGE_ACTIVATION_CODE_FIELD_CSS,ACTIVATION_PAGE_ACTIVATION_CODE_FIELD_XPATH,activationCode);
        seleniumBase.type(ACTIVATION_PAGE_NEW_PASSWORD_FIELD_CSS,ACTIVATION_PAGE_NEW_PASSWORD_FIELD_XPATH,newPassword);
        seleniumBase.type(ACTIVATION_PAGE_RETYPE_PASSWORD_FIELD_CSS,ACTIVATION_PAGE_RETYPE_PASSWORD_FIELD_XPATH,retypePassword);
    }

    public void step_User_Click_Activate_Button() {
        seleniumBase.click(ACTIVATION_PAGE_ACTIVATE_BUTTON_XPATH,ACTIVATION_PAGE_ACTIVATE_BUTTON_CSS);
    }

    public String create_Random_New_Password() {
        return seleniumBase.createRandomNumberForPassword();
    }

    public String check_And_Validate_Account_Activation_Success_Message() throws InterruptedException {
        Thread.sleep(2000);
        String ToastTitle = seleniumBase.getText(By.xpath(ACTIVATION_PAGE_ACTIVATION_SUCCESS_MSG_TITLE_XPATH));
        String ToastMsg = seleniumBase.getText(By.xpath(ACTIVATION_PAGE_ACTIVATION_SUCCESS_MSG_XPATH));

        String Message = ToastTitle + " " + ToastMsg;

        System.out.println("ToastTitle ="+ ToastTitle);
        System.out.println("ToastMsg ="+ ToastMsg);

        return Message;
    }

    public String check_Incorrect_Activation_Error_Message() {
        return  seleniumBase.getText(ACTIVATION_PAGE_INCORRECT_ACTIVATION_ERROR_MESSAGE_CSS,ACTIVATION_PAGE_INCORRECT_ACTIVATION_ERROR_MESSAGE_XPATH);
    }

    public String check_Invalid_Activation_Error_Message() {
        return  seleniumBase.getText(ACTIVATION_PAGE_INVALID_ACTIVATION_ERROR_MESSAGE_CSS,ACTIVATION_PAGE_INVALID_ACTIVATION_ERROR_MESSAGE_XPATH);
    }

    public String check_Password_Required_Error_Message() {
        return  seleniumBase.getText(ACTIVATION_PAGE_PASSWORD_REQUIRED_ERROR_MESSAGE_CSS,ACTIVATION_PAGE_PASSWORD_REQUIRED_ERROR_MESSAGE_XPATH);
    }

    public String check_Invalid_Password_Error_Message() {
        return  seleniumBase.getText(ACTIVATION_PAGE_INVALID_PASSWORD_ERROR_MESSAGE_CSS,ACTIVATION_PAGE_INVALID_PASSWORD_ERROR_MESSAGE_XPATH);
    }

    public String check_Unmatching_Confirm_Password_Error_Message() {
        return  seleniumBase.getText(ACTIVATION_PAGE_UNMATCHING_CONFIRM_PASSWORD_ERROR_MESSAGE_CSS,ACTIVATION_PAGE_UNMATCHING_CONFIRM_PASSWORD_ERROR_MESSAGE_XPATH);
    }

}
