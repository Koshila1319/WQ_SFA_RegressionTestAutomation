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
        return seleniumBase.getText(WQ_COMPANY_PROFILE_PAGE_COMPANY_NAME_CSS,WQ_COMPANY_PROFILE_PAGE_COMPANY_NAME_XPATH);
    }

    public String check_Company_Address() {
        return seleniumBase.getText(WQ_COMPANY_PROFILE_PAGE_COMPANY_ADDRESS_CSS,WQ_COMPANY_PROFILE_PAGE_COMPANY_ADDRESS_XPATH);
    }

    public String check_City() {
        return seleniumBase.getText(WQ_COMPANY_PROFILE_PAGE_COMPANY_CITY_CSS,WQ_COMPANY_PROFILE_PAGE_COMPANY_CITY_XPATH);
    }

    public String check_Country() {
        return seleniumBase.getText(WQ_COMPANY_PROFILE_PAGE_COUNTRY_CSS,WQ_COMPANY_PROFILE_PAGE_COUNTRY_XPATH);
    }

    public String check_PhoneNo() {
        return seleniumBase.getText(WQ_COMPANY_PROFILE_PAGE_PHONE_NO_CSS,WQ_COMPANY_PROFILE_PAGE_PHONE_NO_XPATH);
    }

    public String check_Billing_Name() {
        return seleniumBase.getText(WQ_COMPANY_PROFILE_PAGE_BILLING_NAME_CSS,WQ_COMPANY_PROFILE_PAGE_BILLING_NAME_XPATH);
    }

    public String check_Phone_Number() {
        return seleniumBase.getText(WQ_COMPANY_PROFILE_PAGE_PHONE_NUMBER_CSS,WQ_COMPANY_PROFILE_PAGE_PHONE_NUMBER_XPATH);
    }

    public String check_Organization_Size() {
        return seleniumBase.getText(WQ_COMPANY_PROFILE_PAGE_ORGANIZATION_SIZE_CSS,WQ_COMPANY_PROFILE_PAGE_ORGANIZATION_SIZE_XPATH);
    }

    public String check_SW_App() {
        return seleniumBase.getText(WQ_COMPANY_PROFILE_PAGE_APP_NAME_CSS,WQ_COMPANY_PROFILE_PAGE_APP_NAME_XPATH);
    }

    public String check_Module() {
        return seleniumBase.getText(WQ_COMPANY_PROFILE_PAGE_MODULE_NAME_CSS,WQ_COMPANY_PROFILE_PAGE_MODULE_NAME_XPATH);
    }

    public String check_Version() {
        return seleniumBase.getText(WQ_COMPANY_PROFILE_PAGE_VERSION_NAME_CSS,WQ_COMPANY_PROFILE_PAGE_VERSION_NAME_XPATH);
    }

    public String check_Company_Profile_Page_Browser_Title() {
        return seleniumBase.getTitle();
    }

    public String check_Company_Name_Info() {
        return seleniumBase.getText(WQ_COMPANY_PROFILE_PAGE_COMPANY_INFO_CSS,WQ_COMPANY_PROFILE_PAGE_COMPANY_INFO_XPATH);
    }

    public String check_Company_Profile_Text() {
        return seleniumBase.getText(WQ_COMPANY_PROFILE_PAGE_COMPANY_PROFILE_CSS,WQ_COMPANY_PROFILE_PAGE_COMPANY_PROFILE_XPATH);
    }

    public String check_Company() {
        return seleniumBase.getText(WQ_COMPANY_PROFILE_PAGE_COMPANY_NAME_INFO_CSS,WQ_COMPANY_PROFILE_PAGE_COMPANY_NAME_INFO_XPATH);
    }

    public String check_Company_Address_Info() {
        return seleniumBase.getText(WQ_COMPANY_PROFILE_PAGE_COMPANY_ADDRESS_INFO_CSS,WQ_COMPANY_PROFILE_PAGE_COMPANY_ADDRESS_INFO_XPATH);
    }


    public String check_Company_City_Info() {
        return seleniumBase.getText(WQ_COMPANY_PROFILE_PAGE_COMPANY_CITY_INFO_CSS,WQ_COMPANY_PROFILE_PAGE_COMPANY_CITY_INFO_XPATH);
    }

    public String check_Country_Info() {
        return seleniumBase.getText(WQ_COMPANY_PROFILE_PAGE_COMPANY_COUNTRY_INFO_CSS,WQ_COMPANY_PROFILE_PAGE_COMPANY_COUNTRY_INFO_XPATH);
    }


    public boolean check_Edit_Button_Available() {
        return seleniumBase.checkIsElementEnabled(WQ_COMPANY_PROFILE_PAGE_EDIT_BUTTON_XPATH);
    }

    public WQClientCompanyProfilePage click_Edit_Button() {
        seleniumBase.click(WQ_COMPANY_PROFILE_PAGE_EDIT_BUTTON_XPATH,WQ_COMPANY_PROFILE_PAGE_EDIT_BUTTON_CSS);
        return this;
    }

    public String check_Client_Profile_Update_Page_Title() {
        return seleniumBase.getText(WQ_COMPANY_PROFILE_PAGE_EDIT_PAGE_TITLE_CSS,WQ_COMPANY_PROFILE_PAGE_EDIT_PAGE_TITLE_XPATH);
    }

    public boolean check_CopyRight_Info_Available() {
        return seleniumBase.checkIsElementEnabled(WQ_COMPANY_PROFILE_PAGE_COPYRIGHT_INFO_XPATH);
    }

    public boolean check_Company_Logo_Available() {
        return seleniumBase.isElementPresent(WQ_COMPANY_PROFILE_PAGE_COMPANY_LOGO_XPATH);
    }

    public String check_Link_Leads_To_WQ_DM_Portal_Page() {
        return seleniumBase.getTitle();
    }

    public void click_DM_Dashboard_Link() throws InterruptedException {
        seleniumBase.click(WQ_COMPANY_PROFILE_PAGE_DM_DASHBOARD_LINK_XPATH, WQ_COMPANY_PROFILE_PAGE_DM_DASHBOARD_LINK_CSS);
    }


    public void click_User_Profile_Link() {
        seleniumBase.click(WQ_COMPANY_PROFILE_PAGE_USER_PROFILE_LINK_XPATH,WQ_COMPANY_PROFILE_PAGE_USER_PROFILE_LINK_CSS);
    }

    public String check_Link_Leads_To_User_Profile_Page() {
        return seleniumBase.getTitle();
    }

    public String check_User_Redirect_To_Home_Page() {
        return seleniumBase.getTitle();
    }

    public void click_On_Sign_Out_Button() {
        seleniumBase.isAlertPresent();
        seleniumBase.click(WQ_COMPANY_PROFILE_PAGE_SIGN_OUT_LINK_XPATH,WQ_COMPANY_PROFILE_PAGE_SIGN_OUT_LINK_CSS);
    }

    public boolean verify_Top_Navigation_Panel_Available() {
        return seleniumBase.checkIsElementEnabled(WQ_COMPANY_PROFILE_TOP_NAVIGATION_XPATH);
    }

    public boolean verify_WQ_Logo_Available() {
        return seleniumBase.checkIsElementEnabled(WQ_COMPANY_PROFILE_WQ_LOGO_XPATH);
    }

    public WQClientCompanyProfilePage click_On_Settings_Option() {
        seleniumBase.click(WQ_COMPANY_PROFILE_SETTINGS_XPATH,WQ_COMPANY_PROFILE_SETTINGS_CSS);
        return this;
    }

    public void click_On_Update_Profile_Link() {
        seleniumBase.click(WQ_COMPANY_PROFILE_PAGE_UPDATE_PROFILE_XPATH,WQ_COMPANY_PROFILE_PAGE_UPDATE_PROFILE_CSS);
    }

    public String check_User_Ridirects_To_Update_Profile_Page() {
        return seleniumBase.getTitle();
    }

    public void click_On_Change_Password_Link() {
        seleniumBase.click(WQ_COMPANY_PROFILE_PAGE_CHANGE_PASSWORD_XPATH,WQ_COMPANY_PROFILE_PAGE_CHANGE_PASSWORD_CSS);
    }

    public String check_User_Ridirects_To_Change_Password_Page() {
        return seleniumBase.getTitle();
    }

    public void click_On_DM_Dashboard_Link() {
        seleniumBase.click(WQ_COMPANY_PROFILE_PAGE_DM_DASHBOARD_XPATH,WQ_COMPANY_PROFILE_PAGE_DM_DASHBOARD_CSS);
    }

    public String check_User_Ridirects_To_DM_Dashboard_Page() {
        return seleniumBase.getTitle();
    }
}
