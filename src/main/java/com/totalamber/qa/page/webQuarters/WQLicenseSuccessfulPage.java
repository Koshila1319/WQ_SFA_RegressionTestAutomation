package com.totalamber.qa.page.webQuarters;

import com.totalamber.qa.automation.SeleniumBase;
import com.totalamber.qa.data.UI.elements.webQuarters.wqLicenseSuccessfulPage;
import org.openqa.selenium.WebDriver;

/**
 * Created by t.piyananda on 09/10/2017.
 */
public class WQLicenseSuccessfulPage implements wqLicenseSuccessfulPage {
    SeleniumBase seleniumBase;

    public WQLicenseSuccessfulPage(WebDriver driver){ seleniumBase = new SeleniumBase(driver);}

    public String validate_LicenseSuccessful_Page_Title() {
        return seleniumBase.getText(LICENSE_SUCCESSFUL_PAGE_PAGETITLE_CSS,LICENSE_SUCCESSFUL_PAGE_PAGETITLE_XPATH);
    }

    public String check_selectedPackage_exist_In_SuccessfulPage() {
        return seleniumBase.getText(LICENSE_SUCCESSFUL_PAGE_PACKAGE_CSS,LICENSE_SUCCESSFUL_PAGE_PACKAGE_XPATH);
    }

    public boolean check_Home_Button_IsAvailable() {
        return seleniumBase.verifyAvailableObject(LICENSE_SUCCESSFUL_PAGE_HOMEBUTTON_XPATH);
    }

    public String check_HomeButton_Text() {
        return seleniumBase.getText(LICENSE_SUCCESSFUL_PAGE_HOMEBUTTON_CSS,LICENSE_SUCCESSFUL_PAGE_HOMEBUTTON_XPATH);
    }

    public WQLicenseSuccessfulPage step_click_Home_button() {
        seleniumBase.click(LICENSE_SUCCESSFUL_PAGE_HOMEBUTTON_XPATH,LICENSE_SUCCESSFUL_PAGE_HOMEBUTTON_CSS);
        return this;
    }

    public String validate_browser_Title_of_MainPage() {
        return seleniumBase.getTitle();
    }
}
