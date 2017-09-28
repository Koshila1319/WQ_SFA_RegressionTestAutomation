package com.totalamber.qa.page.webQuarters;

import com.totalamber.qa.automation.SeleniumBase;
import com.totalamber.qa.data.UI.elements.webQuarters.wqClientProfileUpdatePage;
import org.openqa.selenium.WebDriver;

/**
 * Created by t.piyananda on 27/09/2017.
 */
public class WQClientProfileUpdatePage implements wqClientProfileUpdatePage{
    SeleniumBase seleniumBase;

    public WQClientProfileUpdatePage (WebDriver driver){seleniumBase = new SeleniumBase(driver);}

    public String validate_PageTitle() {
        return seleniumBase.getText(PROFILEUPDATE_PAGE_PAGETITLE_CSS, PROFILEUPDATE_PAGE_PAGETITLE_XPATH);
    }

    public boolean validate_ApplicationInformation_Accordian() {
        return seleniumBase.verifyAvailableObject(PROFILEUPDATE_PAGE_APPLICATIONINFO_ACCORDIAN_XPATH);
    }

    public WQClientProfileUpdatePage click_AppInfo_Accordian() {
        seleniumBase.click(PROFILEUPDATE_PAGE_APPLICATIONINFO_ACCORDIAN_XPATH, PROFILEUPDATE_PAGE_APPLICATIONINFO_ACCORDIAN_CSS);
        return this;
    }

    public boolean validate_AppInfo_Data_Displays() {
        return seleniumBase.verifyAvailableObject(PROFILEUPDATE_PAGE_APPLICATIONINFO_DATA_XPATH);
    }


    public boolean validate_OtherCompanyDetails_Accordian() {
        return seleniumBase.verifyAvailableObject(PROFILEUPDATE_PAGE_OTHERCOMPANYDETAILS_ACCORDIAN_XPATH);
    }

    public WQClientProfileUpdatePage click_OtherCompanyDetails_Accordian() {
        seleniumBase.click(PROFILEUPDATE_PAGE_OTHERCOMPANYDETAILS_ACCORDIAN_XPATH, PROFILEUPDATE_PAGE_OTHERCOMPANYDETAILS_ACCORDIAN_CSS);
        return this;
    }

    public boolean validate_OtherCompanyDetails_Data_Displays() {
        return seleniumBase.verifyAvailableObject(PROFILEUPDATE_PAGE_OTHERCOMPANYDETAILS_DATA_XPATH);
    }

    public boolean validate_BillingDetails_Accordian() {
        return seleniumBase.verifyAvailableObject(PROFILEUPDATE_PAGE_BILLINGDETAILS_ACCORDIAN_XPATH);
    }

    public WQClientProfileUpdatePage click_BillingDetails_Accordian() {
        seleniumBase.click(PROFILEUPDATE_PAGE_BILLINGDETAILS_ACCORDIAN_XPATH, PROFILEUPDATE_PAGE_BILLINGDETAILS_ACCORDIAN_CSS);
        return this;
    }

    public boolean validate_BillingDetails_Data_Displays() {
        return seleniumBase.verifyAvailableObject(PROFILEUPDATE_PAGE_BILLINGDETAILS_DATA_XPATH);
    }

    public String check_regNumber_field_In_ClientProfilePage() {
        return seleniumBase.verifyDataEquals(PROFILEUPDATE_PAGE_REGNO_XPATH);
    }

    public String check_companyName_field_In_ClientProfilePage() {
        return seleniumBase.verifyDataEquals(PROFILEUPDATE_PAGE_COMPANYNAME_XPATH);
    }

    public String check_lastname_field_In_ClientProfilePage() {
        return seleniumBase.verifyDataEquals(PROFILEUPDATE_PAGE_LASTNAME_XPATH);
    }

    public String check_firstname_field_In_ClientProfilePage() {
        return seleniumBase.verifyDataEquals(PROFILEUPDATE_PAGE_FIRSTNAME_XPATH);
    }

    public String check_email_field_In_ClientProfilePage() {
        return seleniumBase.verifyDataEquals(PROFILEUPDATE_PAGE_EMAIL_XPATH);
    }

    public String check_phone_field_In_ClientProfilePage() {
        return seleniumBase.verifyDataEquals(PROFILEUPDATE_PAGE_PHONE_XPATH);
    }

    public String check_dialcode_field_In_ClientProfilePage() {
        return seleniumBase.verifyDataEquals(PROFILEUPDATE_PAGE_DIALCODE_XPATH);
    }

    public String check_address_field_In_ClientProfilePage() {
        return seleniumBase.verifyDataEquals(PROFILEUPDATE_PAGE_ADDRESS_XPATH);
    }

    public String check_city_field_In_ClientProfilePage() {
        return seleniumBase.verifyDataEquals(PROFILEUPDATE_PAGE_TOWN_XPATH);
    }

    public String check_county_field_In_ClientProfilePage() {
        return seleniumBase.verifyDataEquals(PROFILEUPDATE_PAGE_COUNTY_XPATH);
    }

    public String check_fax_field_In_ClientProfilePage() {
        return seleniumBase.verifyDataEquals(PROFILEUPDATE_PAGE_FAX_XPATH);
    }

    public String check_postcode_field_In_ClientProfilePage() {
        return seleniumBase.verifyDataEquals(PROFILEUPDATE_PAGE_ZIP_XPATH);
    }

    public String check_designation_field_In_ClientProfilePage() {
        return seleniumBase.verifyDataEquals(PROFILEUPDATE_PAGE_DESIGNATION_XPATH);
    }

    public String check_website_field_In_ClientProfilePage() {
        return seleniumBase.verifyDataEquals(PROFILEUPDATE_PAGE_WEBSITE_XPATH);
    }
}
