package com.webQuarters.qa.test.webQuarters.page;


import com.webQuarters.qa.automation.SeleniumBase;
import com.webQuarters.qa.automation.TestBase;
import com.webQuarters.qa.data.UI.elements.webQuarters.elements.mailinatorEmailPage;
import org.openqa.selenium.WebDriver;

/**
 * Created by e.koshila on 3/25/2020.
 */

public class MailinatorEmailPage extends TestBase implements mailinatorEmailPage {

    SeleniumBase seleniumBase;
    WebDriver driver = null;

    public MailinatorEmailPage(WebDriver driver) {
        seleniumBase = new SeleniumBase(driver);
    }

    public MailinatorEmailPage check_Mailinator_Email(String mailinatorURL, String clientEmail) {
        seleniumBase.openTab(mailinatorURL);
        seleniumBase.type(CLICK_ON_EMAIL_FIELD_CSS, CLICK_ON_EMAIL_FIELD_XPATH, clientEmail); //Enter email
        seleniumBase.click(EMAIL_GO_XPATH, EMAIL_GO_CSS); //Click go button to login
        return this;
    }

    //Password Recovery email

    public MailinatorEmailPage action_read_Latest_Received_Password_Recovery_Email_In_Mailinator() throws InterruptedException {
        Thread.sleep(5000);
        seleniumBase.getElement(LATEST_RECEIVED_PASSWORD_RECOVERY_MAILINATOR_EMAIL_CSS,LATEST_RECEIVED_PASSWORD_RECOVERY_MAILINATOR_EMAIL_XPATH).click();
        Thread.sleep(5000);
        return this;
    }

    public String get_Password_Recovery_Email_Username() throws InterruptedException {
        Thread.sleep(3000);
        seleniumBase.switchedToiFrame("msg_body");
        return seleniumBase.getText(MAILINATOR_PASSWORD_RECOVERY_EMAIL_USER_NAME_CSS,MAILINATOR_PASSWORD_RECOVERY_EMAIL_USER_NAME_XPATH);
    }

    public String get_Password_Recovery_Email_Activation_Code() throws InterruptedException {
        Thread.sleep(3000);
        seleniumBase.switchedToiFrame("msg_body");
        return seleniumBase.getText(MAILINATOR_PASSWORD_RECOVERY_EMAIL_ACTIVATION_CODE_NAME_CSS,MAILINATOR_PASSWORD_RECOVERY_EMAIL_ACTIVATION_CODE_NAME_XPATH);
    }

    public void action_Click_On_Password_Recovery_Email_Recover_Button() throws InterruptedException {
        seleniumBase.scrollContent(MAILINATOR_PASSWORD_RECOVERY_EMAIL_RECOVER_BUTTON_XPATH);
        seleniumBase.click(MAILINATOR_PASSWORD_RECOVERY_EMAIL_RECOVER_BUTTON_XPATH,MAILINATOR_PASSWORD_RECOVERY_EMAIL_RECOVER_BUTTON_CSS);
        seleniumBase.switchToNewTab();
    }

    //Activation Email

    public MailinatorEmailPage action_read_Latest_Received_Account_Activation_Email_In_Mailinator() {
        seleniumBase.getElement(LATEST_RECEIVED_ACCOUNT_ACTIVATION_SUCCESS_EMAIL_MAILINATOR_EMAIL_CSS,LATEST_RECEIVED_ACCOUNT_ACTIVATION_SUCCESS_EMAIL_MAILINATOR_EMAIL_XPATH).click();
        return this;
    }

    public String get_Account_Activation_Email_Username() {
        seleniumBase.switchedToiFrame("msg_body");
        return seleniumBase.getText(MAILINATOR_ACCOUNT_ACTIVATION_SUCCESS_EMAIL_USER_NAME_CSS,MAILINATOR_ACCOUNT_ACTIVATION_SUCCESS_EMAIL_USER_NAME_XPATH);
    }

    public void action_Click_On_Account_Activation_Email_SignIn_Button() {
        seleniumBase.scrollContent(MAILINATOR_PASSWORD_RECOVERY_EMAIL_RECOVER_BUTTON_XPATH);
        seleniumBase.click(MAILINATOR_ACCOUNT_ACTIVATION_SUCCESS_EMAIL_SIGNIN_BUTTON_XPATH,MAILINATOR_ACCOUNT_ACTIVATION_SUCCESS_EMAIL_SIGNIN_BUTTON_XPATH);
        seleniumBase.switchToNewTab();
    }
}
