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

    public WQClientProfileUpdatePage step_click_AppInfo_Accordian() {
        seleniumBase.click(PROFILEUPDATE_PAGE_APPLICATIONINFO_ACCORDIAN_XPATH, PROFILEUPDATE_PAGE_APPLICATIONINFO_ACCORDIAN_CSS);
        return this;
    }

    public boolean validate_AppInfo_Data_Displays() {
        return seleniumBase.verifyAvailableObject(PROFILEUPDATE_PAGE_APPLICATIONINFO_DATA_XPATH);
    }


    public boolean validate_OtherCompanyDetails_Accordian() {
        return seleniumBase.verifyAvailableObject(PROFILEUPDATE_PAGE_OTHERCOMPANYDETAILS_ACCORDIAN_XPATH);
    }

    public WQClientProfileUpdatePage step_click_OtherCompanyDetails_Accordian() {
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

    public String check_Country_Text_Feild() {
        return seleniumBase.getText(PROFILEUPDATE_PAGE_COUNTRY_SELECTED_CSS,PROFILEUPDATE_PAGE_COUNTRY_SELECTED_XPATH);
    }

    public String check_designation_field_In_ClientProfilePage() {
        return seleniumBase.verifyDataEquals(PROFILEUPDATE_PAGE_DESIGNATION_XPATH);
    }

    public String check_OrgSize_Text_Feild() {
        return seleniumBase.getText(PROFILEUPDATE_PAGE_ORGSIZE_SELECTED_CSS,PROFILEUPDATE_PAGE_ORGSIZE_SELECTED_XPATH);
    }

    public String check_website_field_In_ClientProfilePage() {
        return seleniumBase.verifyDataEquals(PROFILEUPDATE_PAGE_WEBSITE_XPATH);
    }

    public WQClientProfileUpdatePage validate_fields_are_Disabled() {
        seleniumBase.verifyDesableObject(PROFILEUPDATE_PAGE_COMPANYNAME_XPATH);
        seleniumBase.verifyDesableObject(PROFILEUPDATE_PAGE_LASTNAME_XPATH);
        seleniumBase.verifyDesableObject(PROFILEUPDATE_PAGE_FIRSTNAME_XPATH);
        seleniumBase.verifyDesableObject(PROFILEUPDATE_PAGE_EMAIL_XPATH);
        return this;
    }


    public WQClientProfileUpdatePage step_update_regNumber_field_In_ClientProfilePage(String regNumber) {
        seleniumBase.clearTextBox(PROFILEUPDATE_PAGE_REGNO_XPATH);
        seleniumBase.type(PROFILEUPDATE_PAGE_REGNO_CSS,PROFILEUPDATE_PAGE_REGNO_XPATH,regNumber);
        return this;
    }

    public WQClientProfileUpdatePage step_update_phone_field_In_ClientProfilePage(String phone) {
        seleniumBase.clearTextBox(PROFILEUPDATE_PAGE_PHONE_XPATH);
        seleniumBase.type(PROFILEUPDATE_PAGE_PHONE_CSS,PROFILEUPDATE_PAGE_PHONE_XPATH,phone);
        return this;
    }

    public WQClientProfileUpdatePage step_update_dialcode_field_In_ClientProfilePage(String dialcode) {
        seleniumBase.clearTextBox(PROFILEUPDATE_PAGE_DIALCODE_XPATH);
        seleniumBase.type(PROFILEUPDATE_PAGE_DIALCODE_CSS,PROFILEUPDATE_PAGE_DIALCODE_XPATH,dialcode);
        return this;
    }

    public WQClientProfileUpdatePage step_update_address_field_In_ClientProfilePage(String address) {
        seleniumBase.clearTextBox(PROFILEUPDATE_PAGE_ADDRESS_XPATH);
        seleniumBase.type(PROFILEUPDATE_PAGE_ADDRESS_CSS,PROFILEUPDATE_PAGE_ADDRESS_XPATH, address);
        return this;
    }

    public WQClientProfileUpdatePage step_update_city_field_In_ClientProfilePage(String city) {
        seleniumBase.clearTextBox(PROFILEUPDATE_PAGE_TOWN_XPATH);
        seleniumBase.type(PROFILEUPDATE_PAGE_TOWN_CSS,PROFILEUPDATE_PAGE_TOWN_XPATH,city);
        return this;
    }

    public WQClientProfileUpdatePage step_update_county_field_In_ClientProfilePage(String county) {
        seleniumBase.clearTextBox(PROFILEUPDATE_PAGE_COUNTY_XPATH);
        seleniumBase.type(PROFILEUPDATE_PAGE_COUNTY_CSS,PROFILEUPDATE_PAGE_COUNTY_XPATH,county);
        return this;
    }

    public WQClientProfileUpdatePage step_update_fax_field_In_ClientProfilePage(String fax) {
        seleniumBase.clearTextBox(PROFILEUPDATE_PAGE_FAX_XPATH);
        seleniumBase.type(PROFILEUPDATE_PAGE_FAX_CSS,PROFILEUPDATE_PAGE_FAX_XPATH,fax);
        return this;
    }

    public WQClientProfileUpdatePage step_update_postcode_field_In_ClientProfilePage(String postcode) {
        seleniumBase.clearTextBox(PROFILEUPDATE_PAGE_ZIP_XPATH);
        seleniumBase.type(PROFILEUPDATE_PAGE_ZIP_CSS,PROFILEUPDATE_PAGE_ZIP_XPATH,postcode);
        return this;
    }

    public WQClientProfileUpdatePage step_update_designation_field_In_ClientProfilePage(String designation) {
        seleniumBase.clearTextBox(PROFILEUPDATE_PAGE_DESIGNATION_XPATH);
        seleniumBase.type(PROFILEUPDATE_PAGE_DESIGNATION_CSS,PROFILEUPDATE_PAGE_DESIGNATION_XPATH,designation);
        return this;
    }

    public WQClientProfileUpdatePage step_update_website_field_In_ClientProfilePage(String website) {
        seleniumBase.clearTextBox(PROFILEUPDATE_PAGE_WEBSITE_XPATH);
        seleniumBase.type(PROFILEUPDATE_PAGE_WEBSITE_CSS,PROFILEUPDATE_PAGE_WEBSITE_XPATH,website);
        return this;
    }

    public WQClientProfileUpdatePage step_update_country_field_In_ClientProfilePage(String country) {
        seleniumBase.selectByVisibleText(PROFILEUPDATE_PAGE_COUNTRY_CSS, PROFILEUPDATE_PAGE_COUNTRY_XPATH,country);
        return this;
    }

    public WQClientProfileUpdatePage step_update_OrgSize_field_In_ClientProfilePage(String orgSize) {
        seleniumBase.selectByVisibleText(PROFILEUPDATE_PAGE_ORGSIZE_CSS, PROFILEUPDATE_PAGE_ORGSIZE_XPATH,orgSize);
        return this;
    }

    public String validate_entered_Software_Isavailable(String software) {
        return seleniumBase.checkIsValueExistInTable(PROFILEUPDATE_PAGE_APPINFO_TABLE_XPATH,software);
    }

    public String validate_entered_Module_Isavailable(String module) {
        return seleniumBase.checkIsValueExistInTable(PROFILEUPDATE_PAGE_APPINFO_TABLE_XPATH,module);
    }

    public String validate_entered_Version_Isavailable(String version) {
        return seleniumBase.checkIsValueExistInTable(PROFILEUPDATE_PAGE_APPINFO_TABLE_XPATH,version);
    }

    public boolean validate_Delete_Button_IsAvailable() {
        return seleniumBase.verifyAvailableObject(PROFILEUPDATE_PAGE_APPINFO_DELETE_BUTTON_XPATH);
    }

    public String validate_DeleteButton_Text() {
        return seleniumBase.getTextByAttribute(PROFILEUPDATE_PAGE_APPINFO_DELETE_BUTTON_CSS,PROFILEUPDATE_PAGE_APPINFO_DELETE_BUTTON_XPATH,"value");
    }

    public WQClientProfileUpdatePage step_click_DeleteBUtton_Of_ARecord() {
        seleniumBase.click(PROFILEUPDATE_PAGE_APPINFO_DELETE_BUTTON_XPATH,PROFILEUPDATE_PAGE_APPINFO_DELETE_BUTTON_CSS);
        return this;
    }


    public boolean validate_SoftwareDropdown_Isavailable() {
        return seleniumBase.verifyAvailableObject(PROFILEUPDATE_PAGE_APPINFO_SW_DROPDOWN_XPATH);
    }

    public String software_Application_Text_Feild() {
        return seleniumBase.getText(PROFILEUPDATE_PAGE_APPINFO_SW_DROPDOWN_SELECTED_CSS,PROFILEUPDATE_PAGE_APPINFO_SW_DROPDOWN_SELECTED_XPATH);
    }

    public boolean validate_Add_Button_IsAvailable() {
        return seleniumBase.verifyAvailableObject(PROFILEUPDATE_PAGE_APPINFO_ADD_BUTTON_XPATH);
    }

    public String validate_AddButton_Text() {
        return seleniumBase.getTextByAttribute(PROFILEUPDATE_PAGE_APPINFO_ADD_BUTTON_CSS,PROFILEUPDATE_PAGE_APPINFO_ADD_BUTTON_XPATH,"value");
    }

    public WQClientProfileUpdatePage step_click_Add_button() {
        seleniumBase.click(PROFILEUPDATE_PAGE_APPINFO_ADD_BUTTON_XPATH,PROFILEUPDATE_PAGE_APPINFO_ADD_BUTTON_CSS);
        return this;
    }

    public String validate_errorMessage_For_Null_Software() {
        return seleniumBase.getText(PROFILEUPDATE_PAGE_APPINFO_SW_ERRORPANEL_CSS,PROFILEUPDATE_PAGE_APPINFO_SW_ERRORPANEL_XPATH);
    }

    public WQClientProfileUpdatePage step_select_a_Software(String software) {
        seleniumBase.selectByVisibleText(PROFILEUPDATE_PAGE_APPINFO_SW_DROPDOWN_CSS,PROFILEUPDATE_PAGE_APPINFO_SW_DROPDOWN_XPATH,software);
        return this;
    }

    public boolean check_Module_List_IsAvailable() {
        return seleniumBase.verifyAvailableObject(PROFILEUPDATE_PAGE_APPINFO_SW_MODULE_LIST_XPATH);
    }

    public boolean check_Version_List_IsAvailable() {
        return seleniumBase.verifyAvailableObject(PROFILEUPDATE_PAGE_APPINFO_SW_VERSION_LIST_XPATH);
    }

    public WQClientProfileUpdatePage step_click_A_Module(String s) {
        seleniumBase.selectCheckBoxFromAList(PROFILEUPDATE_PAGE_APPINFO_SW_MODULE_CHECKBOX_XPATH, s);
        return this;
    }

    public WQClientProfileUpdatePage step_click_A_Version(String s) {
        seleniumBase.selectCheckBoxFromAList(PROFILEUPDATE_PAGE_APPINFO_SW_VERSION_LIST_XPATH, s);
        return this;
    }
}
