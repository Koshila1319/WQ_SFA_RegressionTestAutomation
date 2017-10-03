package com.totalamber.qa.page.webQuarters;

import com.totalamber.qa.automation.SeleniumBase;
import com.totalamber.qa.data.UI.elements.webQuarters.wqClientCompanyProfilePage;
import org.openqa.selenium.WebDriver;

/**
 * Created by s.wathsala on 10/3/2017.
 */
public class WQClientCompanyProfilePage implements wqClientCompanyProfilePage {
    SeleniumBase seleniumBase;


    public WQClientCompanyProfilePage(WebDriver driver) {

        seleniumBase = new SeleniumBase(driver);
    }

    public WQClientCompanyProfilePage action_Navigate_To_HomePage() {
        seleniumBase.click(WQ_CLIENT_HOME_ICON_XPATH,WQ_CLIENT_HOME_ICON_CSS);
        return this;
    }

    public WQClientCompanyProfilePage action_Navigate_To_Company_Profile_Page() {
        seleniumBase.click(WQ_CLIENT_CLIENT_PROFILE_XPATH,WQ_CLIENT_CLIENT_PROFILE_CSS);
        return this;
    }

    public String check_Company_Name() {
        return seleniumBase.getText(WQ_COMPANY_PROFILE_PAGE_COMPANY_NAME_XPATH,WQ_COMPANY_PROFILE_PAGE_COMPANY_NAME_CSS);
    }

    public String check_Company_Address() {
        return seleniumBase.getText(WQ_COMPANY_PROFILE_PAGE_COMPANY_ADDRESS_XPATH,WQ_COMPANY_PROFILE_PAGE_COMPANY_ADDRESS_CSS);
    }

    public String check_City() {
        return seleniumBase.getText(WQ_COMPANY_PROFILE_PAGE_COMPANY_CITY_XPATH,WQ_COMPANY_PROFILE_PAGE_COMPANY_CITY_CSS);
    }

    public String check_Country() {
        return seleniumBase.getText(WQ_COMPANY_PROFILE_PAGE_COUNTRY_XPATH,WQ_COMPANY_PROFILE_PAGE_COUNTRY_CSS);
    }

    public String check_PhoneNo() {
        return seleniumBase.getText(WQ_COMPANY_PROFILE_PAGE_PHONE_NO_XPATH,WQ_COMPANY_PROFILE_PAGE_PHONE_NO_CSS);
    }

    public String check_Billing_Name() {
        return seleniumBase.getText(WQ_COMPANY_PROFILE_PAGE_BILLING_NAME_XPATH,WQ_COMPANY_PROFILE_PAGE_BILLING_NAME_CSS);
    }

    public String check_Phone_Number() {
        return seleniumBase.getText(WQ_COMPANY_PROFILE_PAGE_PHONE_NUMBER_XPATH,WQ_COMPANY_PROFILE_PAGE_PHONE_NUMBER_CSS);
    }

    public String check_Organization_Size() {
        return seleniumBase.getText(WQ_COMPANY_PROFILE_PAGE_ORGANIZATION_SIZE_XPATH,WQ_COMPANY_PROFILE_PAGE_ORGANIZATION_SIZE_CSS);
    }

    public String check_SW_App() {
        return seleniumBase.getText(WQ_COMPANY_PROFILE_PAGE_APP_NAME_XPATH,WQ_COMPANY_PROFILE_PAGE_APP_NAME_CSS);
    }

    public String check_Module() {
        return seleniumBase.getText(WQ_COMPANY_PROFILE_PAGE_MODULE_NAME_XPATH,WQ_COMPANY_PROFILE_PAGE_MODULE_NAME_CSS);
    }

    public String check_Version() {
        return seleniumBase.getText(WQ_COMPANY_PROFILE_PAGE_VERSION_NAME_XPATH,WQ_COMPANY_PROFILE_PAGE_VERSION_NAME_CSS);
    }
}
