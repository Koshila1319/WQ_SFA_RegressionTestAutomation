package com.totalamber.qa.page.webQuarters;

import com.totalamber.qa.automation.SeleniumBase;
import com.totalamber.qa.automation.TestBase;
import com.totalamber.qa.data.UI.elements.webQuarters.wqCheckOutLookEmailPage;
import org.openqa.selenium.WebDriver;

import static com.totalamber.qa.data.UI.elements.webQuarters.ElementHolder.*;


/**
 * Created by e.koshila on 09/22/2017.
 */
public class WQCheckOutlookEmailPage extends TestBase implements wqCheckOutLookEmailPage{

    SeleniumBase seleniumBase;
    public WQCheckOutlookEmailPage(WebDriver driver) {

        seleniumBase = new SeleniumBase(driver);}

    public void checkOutlookEmail(String outlookURL, String BOUserEmail, String BOUserPassword) throws InterruptedException {
        setSiteURL(outlookURL);
        seleniumBase.click(OUTLOOK_SIGN_IN_BUTTON_XPATH, OUTLOOK_SIGN_IN_BUTTON_CSS); //Click sign in button
        seleniumBase.type(OUTLOOK_EMAIL_FIELD_CSS, OUTLOOK_EMAIL_FIELD_XPATH, BOUserEmail); //Enter email
        seleniumBase.click(OUTLOOK_NEXT_BUTTON_XPATH, OUTLOOK_NEXT_BUTTON_CSS); //Click next button
        seleniumBase.type(OUTLOOK_PASSWORD_FIELD_CSS, OUTLOOK_PASSWORD_FIELD_XPATH, BOUserPassword); //Enter password
        Thread.sleep(3000);
        seleniumBase.click(OUTLOOK_SIGN_IN_CONFIRM_XPATH, OUTLOOK_SIGN_IN_CONFIRM_CSS); //Click sign in button to login

    }

    public void readLatestReceivedEmailInOutLook() {
        seleniumBase.getElement(LATEST_RECEIVED_OUTLOOK_EMAIL_CSS,LATEST_RECEIVED_OUTLOOK_EMAIL_XPATH).click();
    }
}
