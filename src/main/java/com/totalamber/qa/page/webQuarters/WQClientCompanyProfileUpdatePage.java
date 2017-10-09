package com.totalamber.qa.page.webQuarters;

import com.totalamber.qa.automation.SeleniumBase;
import com.totalamber.qa.data.UI.elements.webQuarters.wqClientCompanyProfileUpdatePage;
import org.openqa.selenium.WebDriver;

/**
 * Created by s.wathsala on 10/6/2017.
 */
public class WQClientCompanyProfileUpdatePage implements wqClientCompanyProfileUpdatePage {
    SeleniumBase seleniumBase;


    public WQClientCompanyProfileUpdatePage(WebDriver driver) {

        seleniumBase = new SeleniumBase(driver);
    }

    public WQClientCompanyProfileUpdatePage enter_Fax_Information() {
        seleniumBase.type(WQ_COMPANY_PROFILE_UPDATE_PAGE_FAX_CSS,WQ_COMPANY_PROFILE_UPDATE_PAGE_FAX_XPATH,"6555545");
        return this;
    }

    public WQClientCompanyProfileUpdatePage enter_Zip_Code()
    {
        seleniumBase.type(WQ_COMPANY_PROFILE_UPDATE_PAGE_ZIP_CODE_CSS,WQ_COMPANY_PROFILE_UPDATE_PAGE_ZIP_CODE_XPATH,"655");
        return this;
    }

    public WQClientCompanyProfileUpdatePage enter_Company_Website() {
        seleniumBase.type(WQ_COMPANY_PROFILE_UPDATE_PAGE_WEBSITE_CSS,WQ_COMPANY_PROFILE_UPDATE_PAGE_WEBSITE_XPATH,"wwwww.lki.okl");
        return this;
    }

    public WQClientCompanyProfileUpdatePage click_On_Collapsible_Item_2() {
        seleniumBase.click(WQ_COMPANY_PROFILE_UPDATE_PAGE_COLLAPSIBLE_ITEM2_XPATH,WQ_COMPANY_PROFILE_UPDATE_PAGE_COLLAPSIBLE_ITEM2_CSS);
        return this;
    }

    public WQClientCompanyProfileUpdatePage  select_SW_App(String m3) {
        seleniumBase.selectByVisibleText(WQ_COMPANY_PROFILE_UPDATE_PAGE_SOFTWARE_APPLICATION_CSS, WQ_COMPANY_PROFILE_UPDATE_PAGE_SOFTWARE_APPLICATION_XPATH, m3);
        return this;
    }

    public WQClientCompanyProfileUpdatePage select_CheckBox_In_Modules(String module) {
        seleniumBase.selectCheckBoxFromAList(WQ_COMPANY_PROFILE_UPDATE_PAGE_MODULES_CHECKBOX_XPATH, module);
        return this;
    }

    public void select_CheckBox_In_Version(String version) {
        seleniumBase.selectCheckBoxFromAList(WQ_COMPANY_PROFILE_UPDATE_PAGE_VERSION_CHECKBOX_XPATH, version);
    }

    public WQClientCompanyProfileUpdatePage click_On_Collapsible_Item_3() {
        seleniumBase.click(WQ_COMPANY_PROFILE_UPDATE_PAGE_COLLAPSIBLE_ITEM3_XPATH,WQ_COMPANY_PROFILE_UPDATE_PAGE_COLLAPSIBLE_ITEM3_CSS);
        return this;
    }

    public WQClientCompanyProfileUpdatePage click_On_Add_Button() {
        seleniumBase.click(WQ_COMPANY_PROFILE_UPDATE_PAGE_CLICK_ON_ADD_BUTTON_XPATH,WQ_COMPANY_PROFILE_UPDATE_PAGE_CLICK_ON_ADD_BUTTON_CSS);
        return this;
    }

    public WQClientCompanyProfileUpdatePage click_On_Collapsible_Item4() {
        seleniumBase.click(WQ_COMPANY_PROFILE_UPDATE_PAGE_COLLAPSIBLE_ITEM4_XPATH,WQ_COMPANY_PROFILE_UPDATE_PAGE_COLLAPSIBLE_ITEM4_CSS);
        return this;
    }

    public WQClientCompanyProfileUpdatePage enter_Number_Of_Sites() {
        seleniumBase.type(WQ_COMPANY_PROFILE_UPDATE_PAGE_ENTER_NO_OF_SITES_CSS,WQ_COMPANY_PROFILE_UPDATE_PAGE_ENTER_NO_OF_SITES_XPATH,"5");
        return this;
    }

    public WQClientCompanyProfileUpdatePage enter_Annual_Revenue() {
        seleniumBase.type(WQ_COMPANY_PROFILE_UPDATE_PAGE_ENTER_ANNUAL_REVENUE_CSS,WQ_COMPANY_PROFILE_UPDATE_PAGE_ENTER_ANNUAL_REVENUE_XPATH,"34535");
        return this;
    }

    public WQClientCompanyProfileUpdatePage enter_Address() {
        seleniumBase.type(WQ_COMPANY_PROFILE_UPDATE_PAGE_ENTER_ADDRESS_CSS,WQ_COMPANY_PROFILE_UPDATE_PAGE_ENTER_ADDRESS_XPATH,"No56,Totalamber");
        return this;
    }

    public WQClientCompanyProfileUpdatePage select_Billing_Country(String country) {
        seleniumBase.selectByVisibleText(WQ_COMPANY_PROFILE_UPDATE_PAGE_ENTER_COUNTRY_CSS,WQ_COMPANY_PROFILE_UPDATE_PAGE_ENTER_COUNTRY_XPATH,country);
        return this;
    }

    public WQClientCompanyProfileUpdatePage enter_Description() {
        seleniumBase.type(WQ_COMPANY_PROFILE_UPDATE_PAGE_ENTER_DESCRIPTION_CSS,WQ_COMPANY_PROFILE_UPDATE_PAGE_ENTER_DESCRIPTION_XPATH,"Updated all the info");
        return this;
    }

    public void click_On_Update_Button() {
        seleniumBase.click(WQ_COMPANY_PROFILE_UPDATE_PAGE_UPDATE_BUTTON_XPATH,WQ_COMPANY_PROFILE_UPDATE_PAGE_UPDATE_BUTTON_CSS);
    }

    public String check_The_Title() {
        return seleniumBase.getText(WQ_COMPANY_PROFILE_UPDATE_PAGE_TITLE_CSS,WQ_COMPANY_PROFILE_UPDATE_PAGE_TITLE_XPATH);
    }

    public boolean check_Company_Logo_Available_In_Client_Profile_Update() {
        return seleniumBase.isElementPresent(WQ_COMPANY_PROFILE_UPDATE_PAGE_COMPANY_LOGO_XPATH);
    }

    public boolean check_Update_Button_Available() {
        return seleniumBase.isElementPresent(WQ_COMPANY_PROFILE_UPDATE_PAGE_UPDATE_BUTTON_XPATH);
    }
}