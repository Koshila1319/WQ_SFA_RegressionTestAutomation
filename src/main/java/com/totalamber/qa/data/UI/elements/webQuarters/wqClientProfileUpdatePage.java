package com.totalamber.qa.data.UI.elements.webQuarters;

/**
 * Created by t.piyananda on 27/09/2017.
 */
public interface wqClientProfileUpdatePage {

    public final String PROFILEUPDATE_PAGE_PAGETITLE_XPATH = "//*[@id='client-update']/h1";
    public final String PROFILEUPDATE_PAGE_PAGETITLE_CSS  = "";

    public final String PROFILEUPDATE_PAGE_APPLICATIONINFO_ACCORDIAN_XPATH = "//*[contains(@id,'client-update')]/div[1]/h3[2]";
    public final String PROFILEUPDATE_PAGE_APPLICATIONINFO_ACCORDIAN_CSS  = "";

    public final String PROFILEUPDATE_PAGE_APPLICATIONINFO_DATA_XPATH = "//*[contains(@id,'_ApplicationDetaisDataList')]/tbody";
    public final String PROFILEUPDATE_PAGE_APPLICATIONINFO_DATA_CSS  = "";

    public final String PROFILEUPDATE_PAGE_OTHERCOMPANYDETAILS_ACCORDIAN_XPATH = "//*[contains(@id,'client-update')]/div[1]/h3[3]";
    public final String PROFILEUPDATE_PAGE_OTHERCOMPANYDETAILS_ACCORDIAN_CSS  = "";

    public final String PROFILEUPDATE_PAGE_OTHERCOMPANYDETAILS_DATA_XPATH = "//*[contains(@id,'client-update')]/div[1]/div[3]";
    public final String PROFILEUPDATE_PAGE_OTHERCOMPANYDETAILS_DATA_CSS  = "";

    public final String PROFILEUPDATE_PAGE_BILLINGDETAILS_ACCORDIAN_XPATH = "//*[contains(@id,'client-update')]/div[1]/h3[4]";
    public final String PROFILEUPDATE_PAGE_BILLINGDETAILS_ACCORDIAN_CSS  = "";

    public final String PROFILEUPDATE_PAGE_BILLINGDETAILS_DATA_XPATH = "//*[contains(@id,'client-update')]/div[1]/div[4]";
    public final String PROFILEUPDATE_PAGE_BILLINGDETAILS_DATA_CSS  = "";

    //Application Information

    public final String PROFILEUPDATE_PAGE_APPINFO_TABLE_XPATH = "//table[contains(@id,'_ApplicationDetaisDataList')]";
    public final String PROFILEUPDATE_PAGE_APPINFO_TABLE_CSS  = "";

    public final String PROFILEUPDATE_PAGE_APPINFO_DELETE_BUTTON_XPATH = "//*[contains(@name,'deleteButton')]";
    public final String PROFILEUPDATE_PAGE_APPINFO_DELETE_BUTTON_CSS  = "";

    public final String PROFILEUPDATE_PAGE_APPINFO_ADD_BUTTON_XPATH = "//*[contains(@name,'AddButton')]";
    public final String PROFILEUPDATE_PAGE_APPINFO_ADD_BUTTON_CSS  = "";

    public final String PROFILEUPDATE_PAGE_APPINFO_SW_DROPDOWN_XPATH = "//*[contains(@name,'ApplicationNameDropDownList')]";
    public final String PROFILEUPDATE_PAGE_APPINFO_SW_DROPDOWN_CSS  = "";

    public final String PROFILEUPDATE_PAGE_APPINFO_SW_DROPDOWN_SELECTED_XPATH = "//select[contains(@name,'ApplicationNameDropDownList')]/option[(@selected='selected')]";
    public final String PROFILEUPDATE_PAGE_APPINFO_SW_DROPDOWN_SELECTED_CSS  = "";

    public final String PROFILEUPDATE_PAGE_APPINFO_SW_ERRORPANEL_XPATH = "//*[contains(@id,'ApplicationDetaisDataList')][contains(@id,'ErrorPanel')]";
    public final String PROFILEUPDATE_PAGE_APPINFO_SW_ERRORPANEL_CSS  = "";

    public final String PROFILEUPDATE_PAGE_APPINFO_SW_MODULE_LIST_XPATH = "//table[contains(@id,'moduleNameCheckBoxList')]";
    public final String PROFILEUPDATE_PAGE_APPINFO_SW_MODULE_LIST_CSS  = "";

    public final String PROFILEUPDATE_PAGE_APPINFO_SW_MODULE_CHECKBOX_XPATH = "//label[contains(@for,'moduleNameCheckBoxList')]";
    public final String PROFILEUPDATE_PAGE_APPINFO_SW_MODULE_CHECKBOX_CSS  = "";

    public final String PROFILEUPDATE_PAGE_APPINFO_SW_VERSION_LIST_XPATH = "//label[contains(@for,'versionNameCheckBoxList')]";
    public final String PROFILEUPDATE_PAGE_APPINFO_SW_VERSION_LIST_CSS  = "";

    public final String PROFILEUPDATE_PAGE_ERRORPANEL_XPATH = "//div[contains(@id,'_ctl00_ErrorPanel')]";
    public final String PROFILEUPDATE_PAGE_ERRORPANEL_CSS  = "";


    //Other Company Details

    public final String PROFILEUPDATE_PAGE_OCOMPANY_UPLOAD_COMPANYLOGO_XPATH = "//*[contains(@name,'companyLogoUpload')]";
    public final String PROFILEUPDATE_PAGE_OCOMPANY_UPLOAD_COMPANYLOGO_CSS  = "";

    public final String PROFILEUPDATE_PAGE_OCOMPANY_UPLOAD_COMPANYLOGO_LABEL_XPATH = "(//td[@class='w232'])[1]";
    public final String PROFILEUPDATE_PAGE_OCOMPANY_UPLOAD_COMPANYLOGO_LABEL_CSS  = "";

    public final String PROFILEUPDATE_PAGE_OCOMPANY_UPLOAD_COMPANYLOGO_ERROR_XPATH = "//span[contains(@id,'RegularExpressionValidator1')]";
    public final String PROFILEUPDATE_PAGE_OCOMPANY_UPLOAD_COMPANYLOGO_ERROR_CSS  = "";

    public final String PROFILEUPDATE_PAGE_OCOMPANY_UPLOAD_PROFILEPIC_XPATH = "//*[contains(@name,'profilePictureUpload')]";
    public final String PROFILEUPDATE_PAGE_OCOMPANY_UPLOAD_PROFILEPIC_CSS  = "";

    public final String PROFILEUPDATE_PAGE_OCOMPANY_UPLOAD_PROFPIC_LABEL_XPATH = "(//td[@class='w232'])[2]";
    public final String PROFILEUPDATE_PAGE_OCOMPANY_UPLOAD_PROFPIC_LABEL_CSS  = "";

    public final String PROFILEUPDATE_PAGE_OCOMPANY_UPLOAD_PROFPIC_ERROR_XPATH = "//span[contains(@id,'RegularExpressionValidator2')]";
    public final String PROFILEUPDATE_PAGE_OCOMPANY_UPLOAD_PROFPIC_ERROR_CSS  = "";

    public final String PROFILEUPDATE_PAGE_OCOMPANY_COMPANYTYPE_XPATH = "//*[contains(@name,'typeDropDownList')]";
    public final String PROFILEUPDATE_PAGE_OCOMPANY_COMPANYTYPE_CSS  = "";

    public final String PROFILEUPDATE_PAGE_OCOMPANY_COMPANYTYPE_SELECTED_XPATH = "//select[contains(@name,'typeDropDownList')]/option[(@selected='selected')]";
    public final String PROFILEUPDATE_PAGE_OCOMPANY_COMPANYTYPE_SELECTED_CSS  = "";

    public final String PROFILEUPDATE_PAGE_OCOMPANY_COMP_FORMAT_XPATH = "//*[contains(@name,'formatDropDownList')]";
    public final String PROFILEUPDATE_PAGE_OCOMPANY_COMP_FORMAT_CSS  = "";

    public final String PROFILEUPDATE_PAGE_OCOMPANY_COMP_FORMAT_SELECTED_XPATH = "//select[contains(@name,'formatDropDownList')]/option[(@selected='selected')]";
    public final String PROFILEUPDATE_PAGE_OCOMPANY_COMP_FORMAT_SELECTED_CSS  = "";

    public final String PROFILEUPDATE_PAGE_OCOMPANY_INDUSTRY_XPATH = "//*[contains(@name,'industryDropDownList')]";
    public final String PROFILEUPDATE_PAGE_OCOMPANY_INDUSTRY_CSS  = "";

    public final String PROFILEUPDATE_PAGE_OCOMPANY_INDUSTRY_SELECTED_XPATH = "//select[contains(@name,'industryDropDownList')]/option[(@selected='selected')]";
    public final String PROFILEUPDATE_PAGE_OCOMPANY_INDUSTRY_SELECTED_CSS  = "";

    public final String PROFILEUPDATE_PAGE_OCOMPANY_SUBMARKET_XPATH = "//*[contains(@name,'subMarketDropDownList')]";
    public final String PROFILEUPDATE_PAGE_OCOMPANY_SUBMARKET_CSS  = "";

    public final String PROFILEUPDATE_PAGE_OCOMPANY_SUBMARKET_SELECTED_XPATH = "//select[contains(@name,'subMarketDropDownList')]/option[(@selected='selected')]";
    public final String PROFILEUPDATE_PAGE_OCOMPANY_SUBMARKET_SELECTED_CSS  = "";

    public final String PROFILEUPDATE_PAGE_OCOMPANY_VERTICALMARKET_XPATH = "//*[contains(@name,'verticalMarketDropDownList')]";
    public final String PROFILEUPDATE_PAGE_OCOMPANY_VERTICALMARKET_CSS  = "";

    public final String PROFILEUPDATE_PAGE_OCOMPANY_VERTICALMARKET_SELECTED_XPATH = "//select[contains(@name,'verticalMarketDropDownList')]/option[(@selected='selected')]";
    public final String PROFILEUPDATE_PAGE_OCOMPANY_VERTICALMARKET_SELECTED_CSS  = "";

    public final String PROFILEUPDATE_PAGE_OCOMPANY_STOCKPRICE_LABEL_XPATH = "//*[@class='other-Com-Det'][1]/following::tr[3]/td[1]";
    public final String PROFILEUPDATE_PAGE_OCOMPANY_STOCKPRICE_LABEL_CSS  = "";

    public final String PROFILEUPDATE_PAGE_OCOMPANY_STOCKPRICE_XPATH = "//*[contains(@name,'stockPriceTextBox')]";
    public final String PROFILEUPDATE_PAGE_OCOMPANY_STOCKPRICE_CSS  = "";

    public final String PROFILEUPDATE_PAGE_OCOMPANY_COUNTRY_XPATH = "//*[contains(@name,'countryServedDropDownList')]";
    public final String PROFILEUPDATE_PAGE_OCOMPANY_COUNTRY_CSS  = "";

    public final String PROFILEUPDATE_PAGE_OCOMPANY_COUNTRY_SELECTED_XPATH = "//select[contains(@name,'countryServedDropDownList')]/option[(@selected='selected')]";
    public final String PROFILEUPDATE_PAGE_OCOMPANY_COUNTRY_SELECTED_CSS  = "";

    public final String PROFILEUPDATE_PAGE_OCOMPANY_COUNTRY_ADD_BUTTON_XPATH = "//*[contains(@name,'addCountryButton')]";
    public final String PROFILEUPDATE_PAGE_OCOMPANY_COUNTRY_ADD_BUTTON_CSS  = "";

    public final String PROFILEUPDATE_PAGE_OCOMPANY_COUNTRY_REMOVE_BUTTON_XPATH = "//*[contains(@name,'removeCountryButton')]";
    public final String PROFILEUPDATE_PAGE_OCOMPANY_COUNTRY_REMOVE_BUTTON_CSS  = "";

    public final String PROFILEUPDATE_PAGE_OCOMPANY_COUNTRY_COUNTRYSERVEDLIST_XPATH = "//*[contains(@name,'countryServedListBox')]";
    public final String PROFILEUPDATE_PAGE_OCOMPANY_COUNTRY_COUNTRYSERVEDLIST_CSS  = "";


    //Company Details Section

    public final String PROFILEUPDATE_PAGE_REGNO_XPATH = "//*[contains(@name,'businessRegistrationNumberTextBox')]";
    public final String PROFILEUPDATE_PAGE_REGNO_CSS  = "";

    public final String PROFILEUPDATE_PAGE_COMPANYNAME_XPATH = "//*[contains(@name,'companyNameTextBox')]";
    public final String PROFILEUPDATE_PAGE_COMPANYNAME_CSS  = "";

    public final String PROFILEUPDATE_PAGE_LASTNAME_XPATH = "//*[contains(@name,'lastNameTextBox')]";
    public final String PROFILEUPDATE_PAGE_LASTNAME_CSS  = "";

    public final String PROFILEUPDATE_PAGE_FIRSTNAME_XPATH = "//*[contains(@name,'firstNameTextBox')]";
    public final String PROFILEUPDATE_PAGE_FIRSTNAME_CSS  = "";

    public final String PROFILEUPDATE_PAGE_EMAIL_XPATH = "//*[contains(@name,'emailTextBox')]";
    public final String PROFILEUPDATE_PAGE_EMAIL_CSS  = "";

    public final String PROFILEUPDATE_PAGE_PHONE_XPATH = "//*[contains(@name,'phoneTextBox')]";
    public final String PROFILEUPDATE_PAGE_PHONE_CSS  = "";

    public final String PROFILEUPDATE_PAGE_DIALCODE_XPATH = "//*[contains(@name,'dialingCodeTextBox')]";
    public final String PROFILEUPDATE_PAGE_DIALCODE_CSS  = "";

    public final String PROFILEUPDATE_PAGE_ADDRESS_XPATH = "//*[contains(@name,'addressTextBox')]";
    public final String PROFILEUPDATE_PAGE_ADDRESS_CSS  = "";

    public final String PROFILEUPDATE_PAGE_TOWN_XPATH = "//*[contains(@name,'cityTextBox')]";
    public final String PROFILEUPDATE_PAGE_TOWN_CSS  = "";

    public final String PROFILEUPDATE_PAGE_COUNTY_XPATH = "//*[contains(@name,'stateTextBox')]";
    public final String PROFILEUPDATE_PAGE_COUNTY_CSS  = "";

    public final String PROFILEUPDATE_PAGE_FAX_XPATH = "//*[contains(@name,'faxTextBox')]";
    public final String PROFILEUPDATE_PAGE_FAX_CSS  = "";

    public final String PROFILEUPDATE_PAGE_ZIP_XPATH = "//*[contains(@name,'postalCodeTextBox')]";
    public final String PROFILEUPDATE_PAGE_ZIP_CSS  = "";

    public final String PROFILEUPDATE_PAGE_COUNTRY_XPATH = "//*[contains(@name,'countryDropDownList')]";
    public final String PROFILEUPDATE_PAGE_COUNTRY_CSS  = "";

    public final String PROFILEUPDATE_PAGE_ORGSIZE_XPATH = "//*[contains(@name,'organizationSizeDropDownList')]";
    public final String PROFILEUPDATE_PAGE_ORGSIZE_CSS  = "";

    public final String PROFILEUPDATE_PAGE_COUNTRY_SELECTED_XPATH = "//select[contains(@name,'countryDropDownList')]/option[(@selected='selected')]";
    public final String PROFILEUPDATE_PAGE_COUNTRY_SELECTED_CSS  = "";

    public final String PROFILEUPDATE_PAGE_ORGSIZE_SELECTED_XPATH = "//select[contains(@name,'organizationSizeDropDownList')]/option[(@selected='selected')]";
    public final String PROFILEUPDATE_PAGE_ORGSIZE_SELECTED_CSS  = "";

    public final String PROFILEUPDATE_PAGE_DESIGNATION_XPATH = "//*[contains(@name,'designationTextBox')]";
    public final String PROFILEUPDATE_PAGE_DESIGNATION_CSS  = "";

    public final String PROFILEUPDATE_PAGE_WEBSITE_XPATH = "//*[contains(@name,'companyWebsiteTextBox')]";
    public final String PROFILEUPDATE_PAGE_WEBSITE_CSS  = "";

    //Billing Details Section

    public final String PROFILEUPDATE_PAGE_BILLING_NUMBEROFSITES_XPATH = "//*[contains(@name,'numberOfSitesTextBox')]";
    public final String PROFILEUPDATE_PAGE_BILLING_NUMBEROFSITES_CSS  = "";

    public final String PROFILEUPDATE_PAGE_BILLING_ANNUALREV_XPATH = "//*[contains(@name,'annualRevenueTextBox')]";
    public final String PROFILEUPDATE_PAGE_BILLING_ANNUALREV_CSS  = "";

    public final String PROFILEUPDATE_PAGE_BILLING_ADDRESS_XPATH = "//*[contains(@name,'billingAddressTextBox')]";
    public final String PROFILEUPDATE_PAGE_BILLING_ADDRESS_CSS  = "";

    public final String PROFILEUPDATE_PAGE_BILLING_TOWN_XPATH = "//*[contains(@name,'billingCityTextBox')]";
    public final String PROFILEUPDATE_PAGE_BILLING_TOWN_CSS  = "";

    public final String PROFILEUPDATE_PAGE_BILLING_COUNTY_XPATH = "//*[contains(@name,'billingStateTextBox')]";
    public final String PROFILEUPDATE_PAGE_BILLING_COUNTY_CSS  = "";

    public final String PROFILEUPDATE_PAGE_BILLING_POSTAL_XPATH = "//*[contains(@name,'billingPostalCodeTextBox')]";
    public final String PROFILEUPDATE_PAGE_BILLING_POSTAL_CSS  = "";

    public final String PROFILEUPDATE_PAGE_BILLING_COUNTRY_XPATH = "//*[contains(@name,'billingCountryDropDownList')]";
    public final String PROFILEUPDATE_PAGE_BILLING_COUNTRY_CSS  = "";

    public final String PROFILEUPDATE_PAGE_BILLING_TURNOVER_XPATH = "//*[contains(@name,'turnoverDropDownList')]";
    public final String PROFILEUPDATE_PAGE_BILLING_TURNOVER_CSS  = "";

    public final String PROFILEUPDATE_PAGE_BILLING_DESCRIPTION_XPATH = "//*[contains(@name,'descriptionTextBox')]";
    public final String PROFILEUPDATE_PAGE_BILLING_DESCRIPTION_CSS  = "";

}
