package com.totalamber.qa.page.webQuarters;

import com.totalamber.qa.automation.SeleniumBase;
import com.totalamber.qa.data.UI.elements.webQuarters.wqUserProfilePage;
import org.openqa.selenium.WebDriver;

/**
 * Created by s.wathsala on 10/6/2017.
 */
public class WQUserProfilePage implements wqUserProfilePage {
    SeleniumBase seleniumBase;

    public WQUserProfilePage(WebDriver driver)

    {
        seleniumBase = new SeleniumBase(driver);
    }

    public WQUserProfilePage click_User_Profile_Link() {
        seleniumBase.click(WQCLIENT_USER_PROFILE_LINK_XPATH,WQCLIENT_USER_PROFILE_LINK_CSS);
        return this;
    }

    public String check_Page_Title() {
        return seleniumBase.getTitle();
    }

    public String check_Page_Name() {
        return seleniumBase.getText(WQCLIENT_USER_PROFILE_NAME_CSS,WQCLIENT_USER_PROFILE_NAME_XPATH);
    }

    public String check_Page_Info() {
        return seleniumBase.getText(WQCLIENT_USER_PROFILE_PAGE_INFO_CSS,WQCLIENT_USER_PROFILE_PAGE_INFO_XPATH);
    }

    public String check_Contact_Info() {
        return seleniumBase.getText(WQCLIENT_USER_PROFILE_PAGE_CONTACT_INFO_CSS,WQCLIENT_USER_PROFILE_PAGE_CONTACT_INFO_XPATH);
    }

    public String check_First_Name() {
        return seleniumBase.getText(WQCLIENT_USER_PROFILE_PAGE_FIRSTNAME_CSS,WQCLIENT_USER_PROFILE_PAGE_FIRSTNAME_XPATH);
    }

    public String check_Last_Name() {
        return seleniumBase.getText(WQCLIENT_USER_PROFILE_PAGE_LASTNAME_CSS,WQCLIENT_USER_PROFILE_PAGE_LASTNAME_XPATH);
    }

    public String check_Designation() {
        return seleniumBase.getText(WQCLIENT_USER_PROFILE_PAGE_DESIGNATION_CSS,WQCLIENT_USER_PROFILE_PAGE_DESIGNATION_XPATH);
    }

    public String check_Email() {
        return seleniumBase.getText(WQCLIENT_USER_PROFILE_PAGE_EMAIL_CSS,WQCLIENT_USER_PROFILE_PAGE_EMAIL_XPATH);
    }

    public String check_Phone_No() {
        return seleniumBase.getText(WQCLIENT_USER_PROFILE_PAGE_PHONE_NO_CSS,WQCLIENT_USER_PROFILE_PAGE_PHONE_NO_XPATH);
    }

    public WQUserProfilePage click_On_Edit_Button() {
        seleniumBase.click(WQCLIENT_USER_PROFILE_PAGE_EDIT_BUTTON_XPATH,WQCLIENT_USER_PROFILE_PAGE_EDIT_BUTTON_CSS);
        return this;
    }

    public String check_Profile_Update_Page_Name() {
        return seleniumBase.getText(WQCLIENT_USER_PROFILE_PAGE_PAGE_TITLE_CSS,WQCLIENT_USER_PROFILE_PAGE_PAGE_TITLE_XPATH);
    }

    public boolean check_Edit_Button_Available() {
        return seleniumBase.checkElementIsDisplayed(WQCLIENT_USER_PROFILE_PAGE_EDIT_BUTTON_XPATH);
    }

    public WQUserProfilePage enter_Mobile(String mobile) {
        seleniumBase.clear_Data_Feilds(WQCLIENT_USER_PROFILE_UPDATE_PAGE_MOBILE_NO_XPATH);
        seleniumBase.type(WQCLIENT_USER_PROFILE_UPDATE_PAGE_MOBILE_NO_CSS,WQCLIENT_USER_PROFILE_UPDATE_PAGE_MOBILE_NO_XPATH,mobile);
        return this;
    }

    public WQUserProfilePage enter_Office_Site(String site) {
        seleniumBase.clear_Data_Feilds(WQCLIENT_USER_PROFILE_UPDATE_PAGE_OFFICE_SITE_XPATH);
        seleniumBase.type(WQCLIENT_USER_PROFILE_UPDATE_PAGE_OFFICE_SITE_CSS,WQCLIENT_USER_PROFILE_UPDATE_PAGE_OFFICE_SITE_XPATH,site);
        return this;
    }

    public WQUserProfilePage click_Update_Button() {
        seleniumBase.click(WQCLIENT_USER_PROFILE_UPDATE_PAGE_UPDATE_BUTTON_XPATH,WQCLIENT_USER_PROFILE_UPDATE_PAGE_UPDATE_BUTTON_CSS);
        return this;
    }

    public WQUserProfilePage step_click_Profile_Pic_Upload_button(String filepath2) {
        seleniumBase.uploadFiles(filepath2,PROFILEUPDATE_PAGE_OCOMPANY_UPLOAD_PROFILEPIC_XPATH);
        return this;
    }

    public String check_office_Site() {
        return seleniumBase.getText(WQCLIENT_USER_PROFILE_PAGE_OFFICE_SITE_CSS,WQCLIENT_USER_PROFILE_PAGE_OFFICE_SITE_XPATH);
    }

    public String check_Mobile_No() {
        return seleniumBase.getText(WQCLIENT_USER_PROFILE_PAGE_MOBILE_NO_CSS,WQCLIENT_USER_PROFILE_PAGE_MOBILE_NO_XPATH);
    }
}
