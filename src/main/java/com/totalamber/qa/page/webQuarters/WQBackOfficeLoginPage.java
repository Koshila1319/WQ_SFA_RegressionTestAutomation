package com.totalamber.qa.page.webQuarters;

import com.totalamber.qa.automation.SeleniumBase;
import com.totalamber.qa.automation.TestBase;
import com.totalamber.qa.data.UI.elements.webQuarters.wqBackOfficeLoginPage;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by t.piyananda on 13/09/2017.
 */
public class WQBackOfficeLoginPage extends TestBase implements wqBackOfficeLoginPage{

    SeleniumBase seleniumBase;
    public WQBackOfficeLoginPage(WebDriver driver) { seleniumBase = new SeleniumBase(driver);}

    public String validate_BrowserTitle() {
        return seleniumBase.driver.getTitle();

    }

    public String validate_SignInText() {
        return seleniumBase.getText(BO_SIGNIN_TEXT_CSS, BO_SIGNIN_TEXT_XPATH);

    }

    public String validate_pageContent() {
        return seleniumBase.getText(BO_SIGNIN_PAGECONTENT_CSS, BO_SIGNIN_PAGECONTENT_XPATH);
    }

    public void validate_Dropdown_Availability() {
        Assert.assertNotNull(BO_SIGNIN_DROPDOWN_XPATH);
    }

    public void validate_selectingDropdown() {
        seleniumBase.click(BO_SIGNIN_DROPDOWN_XPATH,BO_SIGNIN_DROPDOWN_CSS);
    }

    public void validate_Options_In_Dropdown() {
        seleniumBase.checkDropdownCount(BO_SIGNIN_DROPDOWN_XPATH);
        seleniumBase.checkDropdownTextValue(BO_SIGNIN_DROPDOWN_XPATH);
    }

    public void validate_Option_Value_In_Dropdown(String option) {
        Assert.assertEquals(option, seleniumBase.checkDropdownTextValue(BO_SIGNIN_DROPDOWN_XPATH));
    }
}
