package com.totalamber.qa.page.webQuarters;

import com.totalamber.qa.automation.SeleniumBase;
import com.totalamber.qa.data.UI.elements.webQuarters.wqLicenseCategoryPage;
import org.openqa.selenium.WebDriver;

/**
 * Created by t.piyananda on 09/10/2017.
 */
public class WQLicenseCategoryPage implements wqLicenseCategoryPage{
    SeleniumBase seleniumBase;

    public WQLicenseCategoryPage (WebDriver driver) {seleniumBase = new SeleniumBase(driver);}

    public String validate_License_PageTitle() {
        return seleniumBase.getText(LICENSEPREF_PAGE_TITLE_CSS,LICENSEPREF_PAGE_TITLE_XPATH);
    }

    public String validate_License_Category_Label() {
        return seleniumBase.getText(LICENSEPREF_PAGE_LICENSECAT_LABEL_CSS,LICENSEPREF_PAGE_LICENSECAT_LABEL_XPATH);
    }

    public boolean validate_License_Category_Dropdown_Is_Available() {
        return seleniumBase.verifyAvailableObject(LICENSEPREF_PAGE_LICENSECAT_DROPDOWN_XPATH);
    }

    public String check_License_Category_Dropdown_DefaultValue() {
        return seleniumBase.getText(LICENSEPREF_PAGE_LICENSECAT_DROPDOWN_SELECTED_CSS,LICENSEPREF_PAGE_LICENSECAT_DROPDOWN_SELECTED_XPATH);
    }

    public boolean check_Continue_button_Available() {
        return seleniumBase.verifyAvailableObject(LICENSEPREF_PAGE_LICENSECAT_CONT_BTN_XPATH);
    }

    public String check_Continue_button_Text() {
        return seleniumBase.getTextByAttribute(LICENSEPREF_PAGE_LICENSECAT_CONT_BTN_CSS,LICENSEPREF_PAGE_LICENSECAT_CONT_BTN_XPATH,"value");
    }


    public WQLicenseCategoryPage step_click_Continue_Btn() {
        seleniumBase.click(LICENSEPREF_PAGE_LICENSECAT_CONT_BTN_XPATH,LICENSEPREF_PAGE_LICENSECAT_CONT_BTN_CSS);
        return this;
    }

    public String check_Null_Selected_License_ErrorMessage() {
        return seleniumBase.getText(LICENSEPREF_PAGE_LICENSECAT_ERROR_CSS,LICENSEPREF_PAGE_LICENSECAT_ERROR_XPATH);
    }

    public WQLicenseCategoryPage step_select_LicenseCategory(String s) {
        seleniumBase.selectByVisibleText(LICENSEPREF_PAGE_LICENSECAT_DROPDOWN_CSS,LICENSEPREF_PAGE_LICENSECAT_DROPDOWN_XPATH,s);
        return this;
    }

    public String validate_Browser_Title_Of_Page() {
        return seleniumBase.getTitle();
    }
}
