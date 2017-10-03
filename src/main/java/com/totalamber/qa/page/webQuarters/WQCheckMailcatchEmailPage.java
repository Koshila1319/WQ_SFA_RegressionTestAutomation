package com.totalamber.qa.page.webQuarters;

import com.totalamber.qa.automation.SeleniumBase;
import com.totalamber.qa.automation.TestBase;
import com.totalamber.qa.data.UI.elements.webQuarters.wqCheckMailCatchEmailPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import static com.totalamber.qa.data.UI.elements.webQuarters.wqCheckMailCatchEmailPage.*;


/**
 * Created by e.koshila on 09/22/2017.
 */
public class WQCheckMailcatchEmailPage extends TestBase implements wqCheckMailCatchEmailPage {

    SeleniumBase seleniumBase;

    public WQCheckMailcatchEmailPage(WebDriver driver) {
        seleniumBase = new SeleniumBase(driver);
    }

    //Check data equals
    public String verify_Data_Equals(String data) {
        return seleniumBase.verifyDataEquals(data);
    }

    //Check element is available
    public boolean verify_Element_Is_Available(String elementXpath) {
        return seleniumBase.checkElementIsDisplayed(elementXpath);
    }

    public WQCheckMailcatchEmailPage step_switch_ToFrame() {
        seleniumBase.switchedToiFrame("emailframe");
        return this;
    }

    public WQCheckMailcatchEmailPage check_Mailcatch_Email(String mailcatchURL, String clientEmail) {
        setSiteURL(mailcatchURL);
        seleniumBase.type(CLICK_ON_EMAIL_CSS, CLICK_ON_EMAIL_XPATH, clientEmail); //Enter email
        seleniumBase.click(EMAIL_GO_XPATH, EMAIL_GO_CSS); //Click go button to login
        return this;
    }

    public WQCheckMailcatchEmailPage action_read_Latest_Received_Email_In_Mailcatch() {
        seleniumBase.getElement(LATEST_RECEIVED_MAILCATCH_EMAIL_CSS,LATEST_RECEIVED_MAILCATCH_EMAIL_XPATH).click();
        return this;
    }

    public String step_get_First_Name_Of_The_Client() {
        seleniumBase.switchedToiFrame("emailframe");
        return seleniumBase.splitTextGetNthWord(seleniumBase.splitTextGetNthWord(seleniumBase.getText(WQ_CLIENT_EMAIL_FNAME_CSS, WQ_CLIENT_EMAIL_FNAME_XPATH), " ",2),",",1);
    }

    //----------Client Signup Confirmation------------

    public void action_Click_On_Link() throws InterruptedException {
        seleniumBase.linkOpenInANewTab(WQ_CLIENT_EMAIL_CONTENT_LINK_XPATH);
    }

    public String check_Browser_Title() {
       return seleniumBase.getNewlyOpenedTabTitle();
    }

    public boolean verify_Element_Is_Enabled(String elementXpath) {
        return seleniumBase.checkIsElementEnabled(elementXpath);
    }

    public String step_Get_Activated_User_Details(String xpath) {
        return seleniumBase.splitTextGetNthWord(seleniumBase.getText("",xpath),": ",2);
    }

    public String step_get_Temp_Pw_Text() {
        return seleniumBase.splitTextGetNthWord(seleniumBase.getText(WQ_CLIENT_ACTIVATE_EMAIL_TEMP_PASSWORD_CSS, WQ_CLIENT_ACTIVATE_EMAIL_TEMP_PASSWORD_XPATH), ": ",1);
    }

    public String step_Get_Email_User_Details_Texts(String xpath) {
        return seleniumBase.splitTextGetNthWord(seleniumBase.getText("", xpath), ": ",1);
    }
}
