package com.totalamber.qa.page.webQuarters;

import com.totalamber.qa.automation.SeleniumBase;
import com.totalamber.qa.automation.TestBase;
import com.totalamber.qa.data.UI.elements.webQuarters.wqUserProfileUpdatePage;
import org.openqa.selenium.WebDriver;

/**
 * Created by e.koshila on 10/2/2017.
 */
public class WQUserProfileUpdatePage extends TestBase implements wqUserProfileUpdatePage {

    SeleniumBase seleniumBase;
    public WQUserProfileUpdatePage(WebDriver driver) {seleniumBase = new SeleniumBase(driver);}

    public boolean verify_Element_Is_Available(String elementXpath) {
        return seleniumBase.checkElementIsDisplayed(elementXpath);
    }

    public boolean verify_Element_Is_Enabled(String elementXpath) {
        return seleniumBase.checkIsElementEnabled(elementXpath);
    }

    public WQUserProfileUpdatePage action_add_Update_User_Profile_Details(String fname, String lname, String phone, String mobile, String designation, String office) throws InterruptedException {
        seleniumBase.type(WQ_USER_PROFILE_UPDATE_FNAME_CSS,WQ_USER_PROFILE_UPDATE_FNAME_XPATH, fname);
        seleniumBase.type(WQ_USER_PROFILE_UPDATE_LNAME_CSS,WQ_USER_PROFILE_UPDATE_LNAME_XPATH, lname);
        seleniumBase.type(WQ_USER_PROFILE_UPDATE_PHONE_CSS,WQ_USER_PROFILE_UPDATE_PHONE_XPATH, phone);
        seleniumBase.type(WQ_USER_PROFILE_UPDATE_MOBILE_CSS,WQ_USER_PROFILE_UPDATE_MOBILE_XPATH, mobile);
        seleniumBase.type(WQ_USER_PROFILE_UPDATE_DESIGNATION_CSS,WQ_USER_PROFILE_UPDATE_DESIGNATION_XPATH, designation);
        seleniumBase.type(WQ_USER_PROFILE_UPDATE_OFFICE_CSS,WQ_USER_PROFILE_UPDATE_OFFICE_XPATH,office);
        return this;
    }

    public void action_click_Update_Button() {
        seleniumBase.click(WQ_USER_PROFILE_UPDATE_BUTTON_XPATH, WQ_USER_PROFILE_UPDATE_BUTTON_CSS);
    }
}
