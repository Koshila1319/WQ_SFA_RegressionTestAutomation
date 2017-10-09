package com.totalamber.qa.page.webQuarters;

import com.totalamber.qa.automation.SeleniumBase;
import com.totalamber.qa.data.UI.elements.webQuarters.wqClientProfileUpdatePage;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

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

    public String check_Upload_Company_Logo_Label_IsAvailable() {
        return seleniumBase.getText(PROFILEUPDATE_PAGE_OCOMPANY_UPLOAD_COMPANYLOGO_LABEL_CSS,PROFILEUPDATE_PAGE_OCOMPANY_UPLOAD_COMPANYLOGO_LABEL_XPATH);
    }

    public String check_Upload_Profile_Pic_Label_IsAvailable() {
        return seleniumBase.getText(PROFILEUPDATE_PAGE_OCOMPANY_UPLOAD_PROFPIC_LABEL_CSS,PROFILEUPDATE_PAGE_OCOMPANY_UPLOAD_PROFPIC_LABEL_XPATH);
    }

    public boolean check_chooseFile_Button_InCompanyLogo_IsAvailable() {
        return seleniumBase.verifyAvailableObject(PROFILEUPDATE_PAGE_OCOMPANY_UPLOAD_COMPANYLOGO_XPATH);
    }

    public WQClientProfileUpdatePage step_click_Company_Logo_Upload_button_for_InvalidFile(String filepath) {
        seleniumBase.uploadFiles(filepath,PROFILEUPDATE_PAGE_OCOMPANY_UPLOAD_COMPANYLOGO_XPATH);
        return this;
    }

    public WQClientProfileUpdatePage step_click_Company_Logo_Upload_button(String filepath) {
        seleniumBase.uploadFiles(filepath,PROFILEUPDATE_PAGE_OCOMPANY_UPLOAD_COMPANYLOGO_XPATH);
        return this;
    }

    public String validate_ErrorMessage_For_wrong_file_Type_in_CompLogo() {
        return seleniumBase.getText(PROFILEUPDATE_PAGE_OCOMPANY_UPLOAD_COMPANYLOGO_ERROR_CSS,PROFILEUPDATE_PAGE_OCOMPANY_UPLOAD_COMPANYLOGO_ERROR_XPATH);
    }

    public boolean check_chooseFile_Button_InProfilePic_IsAvailable() {
        return seleniumBase.verifyAvailableObject(PROFILEUPDATE_PAGE_OCOMPANY_UPLOAD_PROFILEPIC_XPATH);
    }

    public WQClientProfileUpdatePage step_click_Profile_Pic_Upload_button_for_InvalidFile(String filepath) {
        seleniumBase.uploadFiles(filepath,PROFILEUPDATE_PAGE_OCOMPANY_UPLOAD_PROFILEPIC_XPATH);
        return this;
    }

    public String validate_ErrorMessage_For_wrong_file_Type_in_ProfPic() {
        return seleniumBase.getText(PROFILEUPDATE_PAGE_OCOMPANY_UPLOAD_PROFPIC_ERROR_CSS,PROFILEUPDATE_PAGE_OCOMPANY_UPLOAD_PROFPIC_ERROR_XPATH);
    }

    public WQClientProfileUpdatePage step_click_Profile_Pic_Upload_button(String filepath) {
        seleniumBase.uploadFiles(filepath,PROFILEUPDATE_PAGE_OCOMPANY_UPLOAD_PROFILEPIC_XPATH);
        return this;
    }

    public boolean validate_CompanyType_DropdownAvailable() {
        return seleniumBase.verifyAvailableObject(PROFILEUPDATE_PAGE_OCOMPANY_COMPANYTYPE_XPATH);
    }

    public String check_Default_Dropdown_Value_of_CompanyType() {
        return seleniumBase.getText(PROFILEUPDATE_PAGE_OCOMPANY_COMPANYTYPE_SELECTED_CSS,PROFILEUPDATE_PAGE_OCOMPANY_COMPANYTYPE_SELECTED_XPATH);
    }

    public WQClientProfileUpdatePage step_select_a_CompanyType(String s) {
        seleniumBase.selectByVisibleText(PROFILEUPDATE_PAGE_OCOMPANY_COMPANYTYPE_CSS,PROFILEUPDATE_PAGE_OCOMPANY_COMPANYTYPE_XPATH,s);
        return this;
    }

    public boolean validate_CompanyFormat_DropdownAvailable() {
        return seleniumBase.verifyAvailableObject(PROFILEUPDATE_PAGE_OCOMPANY_COMP_FORMAT_XPATH);
    }

    public String check_Default_Dropdown_Value_of_CompanyFormat() {
        return seleniumBase.getText(PROFILEUPDATE_PAGE_OCOMPANY_COMP_FORMAT_SELECTED_CSS,PROFILEUPDATE_PAGE_OCOMPANY_COMP_FORMAT_SELECTED_XPATH);
    }

    public WQClientProfileUpdatePage step_select_a_CompanyFormat(String s) {
        seleniumBase.selectByVisibleText(PROFILEUPDATE_PAGE_OCOMPANY_COMP_FORMAT_CSS,PROFILEUPDATE_PAGE_OCOMPANY_COMP_FORMAT_XPATH,s);
        return this;
    }

    public boolean validate_Industry_DropdownAvailable() {
        return seleniumBase.verifyAvailableObject(PROFILEUPDATE_PAGE_OCOMPANY_INDUSTRY_XPATH);
    }

    public String check_Default_Dropdown_Value_of_Industry() {
        return seleniumBase.getText(PROFILEUPDATE_PAGE_OCOMPANY_INDUSTRY_SELECTED_CSS,PROFILEUPDATE_PAGE_OCOMPANY_INDUSTRY_SELECTED_XPATH);
    }

    public WQClientProfileUpdatePage step_select_a_Industry(String s) {
        seleniumBase.selectByVisibleText(PROFILEUPDATE_PAGE_OCOMPANY_INDUSTRY_CSS,PROFILEUPDATE_PAGE_OCOMPANY_INDUSTRY_XPATH,s);
        return this;
    }

    public boolean validate_SubMarket_DropdownAvailable() {
        return seleniumBase.verifyAvailableObject(PROFILEUPDATE_PAGE_OCOMPANY_SUBMARKET_XPATH);
    }

    public String check_Default_Dropdown_Value_of_SubMarket() {
        return seleniumBase.getText(PROFILEUPDATE_PAGE_OCOMPANY_SUBMARKET_SELECTED_CSS,PROFILEUPDATE_PAGE_OCOMPANY_SUBMARKET_SELECTED_XPATH);
    }

    public WQClientProfileUpdatePage step_select_a_SubMarket(String s) {
        seleniumBase.selectByVisibleText(PROFILEUPDATE_PAGE_OCOMPANY_SUBMARKET_CSS,PROFILEUPDATE_PAGE_OCOMPANY_SUBMARKET_XPATH,s);
        return this;
    }

    public boolean validate_VerticalMarket_DropdownAvailable() {
        return seleniumBase.verifyAvailableObject(PROFILEUPDATE_PAGE_OCOMPANY_VERTICALMARKET_XPATH);
    }

    public String check_Default_Dropdown_Value_of_VerticalMarket() {
        return seleniumBase.getText(PROFILEUPDATE_PAGE_OCOMPANY_VERTICALMARKET_SELECTED_CSS,PROFILEUPDATE_PAGE_OCOMPANY_VERTICALMARKET_SELECTED_XPATH);
    }

    public WQClientProfileUpdatePage step_select_a_VerticalMarket(String s) {
        seleniumBase.selectByVisibleText(PROFILEUPDATE_PAGE_OCOMPANY_VERTICALMARKET_CSS, PROFILEUPDATE_PAGE_OCOMPANY_VERTICALMARKET_XPATH,s);
        return this;
    }

    public String check_StockPrice_Label_IsAvailable() {
        return seleniumBase.getText(PROFILEUPDATE_PAGE_OCOMPANY_STOCKPRICE_LABEL_CSS,PROFILEUPDATE_PAGE_OCOMPANY_STOCKPRICE_LABEL_XPATH);
    }

    public boolean check_StockPrice_TextBox_IsAvailable() {
        return seleniumBase.verifyAvailableObject(PROFILEUPDATE_PAGE_OCOMPANY_STOCKPRICE_XPATH);
    }

    public String check_PlaceHolderText_of_StockProce_Textbox() {
        return seleniumBase.getTextByAttribute(PROFILEUPDATE_PAGE_OCOMPANY_STOCKPRICE_CSS,PROFILEUPDATE_PAGE_OCOMPANY_STOCKPRICE_XPATH,"placeholder");
    }

    public WQClientProfileUpdatePage step_enter_Characters_In_StockPrice_Textbox(String s) {
        seleniumBase.type(PROFILEUPDATE_PAGE_OCOMPANY_STOCKPRICE_CSS, PROFILEUPDATE_PAGE_OCOMPANY_STOCKPRICE_XPATH,s);
        return this;
    }

    public boolean check_addingCountry_Dropdown_IsAvailable() {
        return seleniumBase.verifyAvailableObject(PROFILEUPDATE_PAGE_OCOMPANY_COUNTRY_XPATH);
    }

    public String check_Default_Dropdown_Value_of_SelectCountry() {
        return seleniumBase.verifyDataEquals(PROFILEUPDATE_PAGE_OCOMPANY_COUNTRY_SELECTED_XPATH);
    }

    public WQClientProfileUpdatePage step_select_a_Country(String s) {
        seleniumBase.selectByVisibleText(PROFILEUPDATE_PAGE_OCOMPANY_COUNTRY_CSS,PROFILEUPDATE_PAGE_OCOMPANY_COUNTRY_XPATH,s);
        return this;
    }

    public boolean check_AddButton_IsAvailable() {
        return seleniumBase.verifyAvailableObject(PROFILEUPDATE_PAGE_OCOMPANY_COUNTRY_ADD_BUTTON_XPATH);
    }

    public String check_AddButton_Text() {
        return seleniumBase.getTextByAttribute(PROFILEUPDATE_PAGE_OCOMPANY_COUNTRY_ADD_BUTTON_CSS,PROFILEUPDATE_PAGE_OCOMPANY_COUNTRY_ADD_BUTTON_XPATH,"value");
    }

    public WQClientProfileUpdatePage step_click_AddCountry_button() {
        seleniumBase.click(PROFILEUPDATE_PAGE_OCOMPANY_COUNTRY_ADD_BUTTON_XPATH,PROFILEUPDATE_PAGE_OCOMPANY_COUNTRY_ADD_BUTTON_CSS);
        return this;
    }

    public boolean check_RemoveButton_IsAvailable() {
        return seleniumBase.verifyAvailableObject(PROFILEUPDATE_PAGE_OCOMPANY_COUNTRY_REMOVE_BUTTON_XPATH);
    }

    public String check_RemoveButton_Text() {
        return seleniumBase.getTextByAttribute(PROFILEUPDATE_PAGE_OCOMPANY_COUNTRY_REMOVE_BUTTON_CSS,PROFILEUPDATE_PAGE_OCOMPANY_COUNTRY_REMOVE_BUTTON_XPATH,"value");
    }

    public String check_AddedCountry_In_CountryList(String country) {
       return seleniumBase.checkDropdownTextValueInList(PROFILEUPDATE_PAGE_OCOMPANY_COUNTRY_COUNTRYSERVEDLIST_XPATH,country);
    }

    public WQClientProfileUpdatePage step_click_Country_from_List(String s) {
        seleniumBase.clickTextValueInList(PROFILEUPDATE_PAGE_OCOMPANY_COUNTRY_COUNTRYSERVEDLIST_XPATH,s);
        return this;
    }

    public WQClientProfileUpdatePage step_click_RemoveButton() {
        seleniumBase.click(PROFILEUPDATE_PAGE_OCOMPANY_COUNTRY_REMOVE_BUTTON_XPATH,PROFILEUPDATE_PAGE_OCOMPANY_COUNTRY_REMOVE_BUTTON_CSS);
        return this;
    }

    public boolean check_NumberOfSites_TextBox_IsAvailable() {
        return seleniumBase.verifyAvailableObject(PROFILEUPDATE_PAGE_BILLING_NUMBEROFSITES_XPATH);
    }

    public String check_NumberOfSites_TextBox_PlaceHolder() {
        return seleniumBase.getTextByAttribute(PROFILEUPDATE_PAGE_BILLING_NUMBEROFSITES_CSS,PROFILEUPDATE_PAGE_BILLING_NUMBEROFSITES_XPATH,"placeholder");
    }

    public WQClientProfileUpdatePage step_enter_Characters_In_NumberOfSites_Textbox(String s) {
        seleniumBase.type(PROFILEUPDATE_PAGE_BILLING_NUMBEROFSITES_CSS,PROFILEUPDATE_PAGE_BILLING_NUMBEROFSITES_XPATH,s);
        return this;
    }

    public boolean check_AnnualRevenue_TextBox_IsAvailable() {
        return seleniumBase.verifyAvailableObject(PROFILEUPDATE_PAGE_BILLING_ANNUALREV_XPATH);
    }

    public String check_AnnualRevenue_TextBox_PlaceHolder() {
        return seleniumBase.getTextByAttribute(PROFILEUPDATE_PAGE_BILLING_ANNUALREV_CSS,PROFILEUPDATE_PAGE_BILLING_ANNUALREV_XPATH,"placeholder");
    }

    public WQClientProfileUpdatePage step_enter_Characters_In_AnnualRevenue_Textbox(String s) {
        seleniumBase.type(PROFILEUPDATE_PAGE_BILLING_ANNUALREV_CSS,PROFILEUPDATE_PAGE_BILLING_ANNUALREV_XPATH,s);
        return this;
    }

    public boolean check_Address_TextBox_IsAvailable() {
        return seleniumBase.verifyAvailableObject(PROFILEUPDATE_PAGE_BILLING_ADDRESS_XPATH);
    }

    public String check_Address_TextBox_PlaceHolder() {
        return seleniumBase.getTextByAttribute(PROFILEUPDATE_PAGE_BILLING_ADDRESS_CSS,PROFILEUPDATE_PAGE_BILLING_ADDRESS_XPATH,"placeholder");
    }

    public WQClientProfileUpdatePage step_enter_Characters_In_Address_Textbox(String s) {
        seleniumBase.type(PROFILEUPDATE_PAGE_BILLING_ADDRESS_CSS,PROFILEUPDATE_PAGE_BILLING_ADDRESS_XPATH,s);
        return this;
    }

    public boolean check_Town_TextBox_IsAvailable() {
        return seleniumBase.verifyAvailableObject(PROFILEUPDATE_PAGE_BILLING_TOWN_XPATH);
    }

    public String check_Town_TextBox_PlaceHolder() {
        return seleniumBase.getTextByAttribute(PROFILEUPDATE_PAGE_BILLING_TOWN_CSS,PROFILEUPDATE_PAGE_BILLING_TOWN_XPATH,"placeholder");
    }

    public WQClientProfileUpdatePage step_enter_Characters_In_Town_Textbox(String s) {
        seleniumBase.type(PROFILEUPDATE_PAGE_BILLING_TOWN_CSS,PROFILEUPDATE_PAGE_BILLING_TOWN_XPATH,s);
        return this;
    }

    public boolean check_County_TextBox_IsAvailable() {
        return seleniumBase.verifyAvailableObject(PROFILEUPDATE_PAGE_BILLING_COUNTY_XPATH);
    }

    public String check_County_TextBox_PlaceHolder() {
        return seleniumBase.getTextByAttribute(PROFILEUPDATE_PAGE_BILLING_COUNTY_CSS,PROFILEUPDATE_PAGE_BILLING_COUNTY_XPATH,"placeholder");
    }

    public WQClientProfileUpdatePage step_enter_Characters_In_County_Textbox(String s) {
        seleniumBase.type(PROFILEUPDATE_PAGE_BILLING_COUNTY_CSS,PROFILEUPDATE_PAGE_BILLING_COUNTY_XPATH,s);
        return this;
    }

    public boolean check_Post_TextBox_IsAvailable() {
        return seleniumBase.verifyAvailableObject(PROFILEUPDATE_PAGE_BILLING_POSTAL_XPATH);
    }

    public String check_Post_TextBox_PlaceHolder() {
        return seleniumBase.getTextByAttribute(PROFILEUPDATE_PAGE_BILLING_POSTAL_CSS,PROFILEUPDATE_PAGE_BILLING_POSTAL_XPATH,"placeholder");
    }

    public WQClientProfileUpdatePage step_enter_Characters_In_Post_Textbox(String s) {
        seleniumBase.type(PROFILEUPDATE_PAGE_BILLING_POSTAL_CSS,PROFILEUPDATE_PAGE_BILLING_POSTAL_XPATH,s);
        return this;
    }

    public boolean check_BillingCountry_Dropdown_IsAvailable() {
        return seleniumBase.verifyAvailableObject(PROFILEUPDATE_PAGE_BILLING_COUNTRY_XPATH);
    }

    public String check_BillingCountry_DefaultValue() {
        return seleniumBase.getText(PROFILEUPDATE_PAGE_BILLING_COUNTRY_SELECTED_CSS,PROFILEUPDATE_PAGE_BILLING_COUNTRY_SELECTED_XPATH);
    }

    public WQClientProfileUpdatePage step_select_a_BillingCountry(String s) {
        seleniumBase.selectByVisibleText(PROFILEUPDATE_PAGE_BILLING_COUNTRY_CSS,PROFILEUPDATE_PAGE_BILLING_COUNTRY_XPATH,s);
        return this;
    }

    public boolean check_Turnover_Dropdown_IsAvailable() {
        return seleniumBase.verifyAvailableObject(PROFILEUPDATE_PAGE_BILLING_TURNOVER_XPATH);
    }

    public String check_TurnOver_DefaultValue() {
        return seleniumBase.getText(PROFILEUPDATE_PAGE_BILLING_TURNOVER_SELECTED_CSS,PROFILEUPDATE_PAGE_BILLING_TURNOVER_SELECTED_XPATH);
    }

    public WQClientProfileUpdatePage step_select_a_TurnOver(String s) {
        seleniumBase.selectByVisibleText(PROFILEUPDATE_PAGE_BILLING_TURNOVER_CSS,PROFILEUPDATE_PAGE_BILLING_TURNOVER_XPATH,s);
        return this;
    }

    public boolean check_Description_TextArea_IsAvailable() {
        return seleniumBase.verifyAvailableObject(PROFILEUPDATE_PAGE_BILLING_DESCRIPTION_XPATH);
    }

    public String check_Description_TextArea_PlaceHolder() {
        return seleniumBase.getTextByAttribute(PROFILEUPDATE_PAGE_BILLING_DESCRIPTION_CSS,PROFILEUPDATE_PAGE_BILLING_DESCRIPTION_XPATH,"placeholder");
    }

    public WQClientProfileUpdatePage step_enter_Characters_In_Description_TextArea(String s) {
        seleniumBase.type(PROFILEUPDATE_PAGE_BILLING_DESCRIPTION_CSS,PROFILEUPDATE_PAGE_BILLING_DESCRIPTION_XPATH,s);
        return this;
    }

    public boolean validate_Update_Button_IsAvailable() {
        return seleniumBase.verifyAvailableObject(PROFILEUPDATE_PAGE_UPDATE_BUTTON_XPATH);
    }

    public String validate_UpdateButton_Text() {
        return seleniumBase.getTextByAttribute(PROFILEUPDATE_PAGE_UPDATE_BUTTON_CSS,PROFILEUPDATE_PAGE_UPDATE_BUTTON_XPATH,"value");
    }

    public WQClientProfileUpdatePage step_click_Update_Button() {
        seleniumBase.click(PROFILEUPDATE_PAGE_UPDATE_BUTTON_XPATH,PROFILEUPDATE_PAGE_UPDATE_BUTTON_CSS);
        return this;
    }

    public String check_NumberOfSites_TextBox_IsMandatory() {
        return seleniumBase.check_CSS_Value(PROFILEUPDATE_PAGE_BILLING_NUMBEROFSITES_XPATH);
    }

    public String check_AnnualRevenue_TextBox_IsMandatory() {
        return seleniumBase.check_CSS_Value(PROFILEUPDATE_PAGE_BILLING_ANNUALREV_XPATH);
    }

    public String check_Address_TextBox_IsMandatory() {
        return seleniumBase.check_CSS_Value(PROFILEUPDATE_PAGE_BILLING_ADDRESS_XPATH);
    }

    public String check_Town_TextBox_IsMandatory() {
        return seleniumBase.check_CSS_Value(PROFILEUPDATE_PAGE_BILLING_TOWN_XPATH);
    }

    public String check_Error_Message() {
        return seleniumBase.getText(PROFILEUPDATE_PAGE_ERROR_MSG_CSS,PROFILEUPDATE_PAGE_ERROR_MSG_XPATH);
    }

    public WQClientProfileUpdatePage step_clear_BillingDetail_Mandatory_TextBoxes() {
        seleniumBase.clearTextBox(PROFILEUPDATE_PAGE_BILLING_NUMBEROFSITES_XPATH);
        seleniumBase.clearTextBox(PROFILEUPDATE_PAGE_BILLING_ANNUALREV_XPATH);
        seleniumBase.clearTextBox(PROFILEUPDATE_PAGE_BILLING_ADDRESS_XPATH);
        seleniumBase.clearTextBox(PROFILEUPDATE_PAGE_BILLING_TOWN_XPATH);
        return this;
    }

    public String validate_user_Goes_To_Page() {
        return seleniumBase.driver.getTitle();
    }

}
