package com.totalamber.qa.page.webQuarters;

import com.totalamber.qa.automation.SeleniumBase;
import com.totalamber.qa.automation.TestBase;
import com.totalamber.qa.data.UI.elements.webQuarters.wqBackOfficeLoginPage;
import org.openqa.selenium.WebDriver;

import java.util.List;

/**
 * Created by t.piyananda on 13/09/2017.
 */
public class WQBackOfficeLoginPage implements wqBackOfficeLoginPage{

    SeleniumBase seleniumBase;
    public WQBackOfficeLoginPage(WebDriver driver) { seleniumBase = new SeleniumBase(driver);}

    public String validate_BrowserTitle() {
        return seleniumBase.driver.getTitle();

    }

    public String validate_SignInText() {
        return seleniumBase.getText(BO_SIGNIN_TEXT_CSS, BO_SIGNIN_TEXT_XPATH);

    }


    public boolean validate_Dropdown_Availability() {
        return seleniumBase.checkIsElementEnabled(BO_SIGNIN_DROPDOWN_XPATH);
    }

    public WQBackOfficeLoginPage validate_selectingDropdown() {
        seleniumBase.click(BO_SIGNIN_DROPDOWN_XPATH,BO_SIGNIN_DROPDOWN_CSS);
        return this;
    }

/*    public void validate_Options_In_Dropdown() {
        seleniumBase.checkDropdownCount(BO_SIGNIN_DROPDOWN_XPATH);
        seleniumBase.checkDropdownTextValue(BO_SIGNIN_DROPDOWN_XPATH);
    }*/

    public String validate_Option_Value_In_Dropdown(String option) {
        return seleniumBase.checkDropdownTextValue(BO_SIGNIN_DROPDOWN_XPATH, option);
    }

    public WQBackOfficeLoginPage validate_selecting_WindowsAuth_In_Dropdown(String option) throws InterruptedException {
        seleniumBase.selectByVisibleText(BO_SIGNIN_DROPDOWN_CSS, BO_SIGNIN_DROPDOWN_XPATH, option);
        return this;
    }

    public WQBackOfficeLoginPage action_Login_as_BOUser(String userName, String password) {
        seleniumBase.passValuesThroughUrl(userName,password);
        return this;
    }

    public WQBackOfficeLoginPage action_selectAuthentication(String authentication) {
        seleniumBase.selectByVisibleText(BO_SIGNIN_DROPDOWN_CSS, BO_SIGNIN_DROPDOWN_XPATH, authentication);
        return this;
    }

    public String validate_Sign_In_Page_Content() {
        return seleniumBase.splitTextGetNthWord(seleniumBase.getText(BO_SIGNIN_PAGE_CONTENT_CSS, BO_SIGNIN_PAGE_CONTENT_XPATH),":",1);
    }

    public List<String> verify_Dropdown_Options() {
       // seleniumBase.click(BO_SIGNIN_DROPDOWN_XPATH,BO_SIGNIN_DROPDOWN_CSS);
        return seleniumBase.listDropdownOptions(BO_SIGNIN_DROPDOWN_XPATH);
    }
}
