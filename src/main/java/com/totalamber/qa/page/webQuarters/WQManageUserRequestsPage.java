package com.totalamber.qa.page.webQuarters;

import com.totalamber.qa.automation.SeleniumBase;
import com.totalamber.qa.automation.TestBase;
import com.totalamber.qa.data.UI.elements.webQuarters.wqManageUserRequestsPage;
import org.openqa.selenium.WebDriver;

/**
 * Created by e.koshila on 9/18/2017.
 */
public class WQManageUserRequestsPage extends TestBase implements wqManageUserRequestsPage {

    SeleniumBase seleniumBase;
    public WQManageUserRequestsPage(WebDriver driver) {seleniumBase = new SeleniumBase(driver);}

    //Check element is available
    public boolean verify_Element_Is_Available(String elementXpath) {
        return seleniumBase.checkElementIsDisplayed(elementXpath);
    }

    //Check data equals
    public String verify_Data_Equals(String data) {
        return seleniumBase.verifyDataEquals(data);
    }

    //Get browser title
    public String check_Browser_Title() {
        return seleniumBase.getTitle();
    }


    public WQManageUserRequestsPage action_Click_Request_Button(String xpath) {
        seleniumBase.click(xpath,"");
        return this;
    }

    public String step_get_requests_user_popup_title() throws InterruptedException {
      seleniumBase.swichToPopup(1);
      Thread.sleep(3000);
      return seleniumBase.getText(WQ_CLIENT_CHANGE_POPUP_TITLE_CSS, WQ_CLIENT_CHANGE_POPUP_TITLE_XPATH);
    }

    public WQManageUserRequestsPage action_Click_Request_Button_In_Popup() throws InterruptedException {
     //  seleniumBase.swichToPopup(1);
       seleniumBase.click(WQ_CLIENT_CHANGE_POPUP_REQUEST_BUTTON_XPATH,WQ_CLIENT_CHANGE_POPUP_REQUEST_BUTTON_CSS);
       return this;
    }

    public WQManageUserRequestsPage step_Add_Data_To_User_Request_Popup(String email, String fname,String lname, String designation) throws InterruptedException {
        seleniumBase.type(WQ_CLIENT_CHANGE_POPUP_EMAIL_CSS, WQ_CLIENT_CHANGE_POPUP_EMAIL_XPATH, email);
        seleniumBase.type(WQ_CLIENT_CHANGE_POPUP_FNAME_CSS, WQ_CLIENT_CHANGE_POPUP_FNAME_XPATH, fname);
        seleniumBase.type(WQ_CLIENT_CHANGE_POPUP_LNAME_CSS, WQ_CLIENT_CHANGE_POPUP_LNAME_XPATH, lname);
        seleniumBase.type(WQ_CLIENT_CHANGE_POPUP_DESIGNATION_CSS, WQ_CLIENT_CHANGE_POPUP_DESIGNATION_XPATH, designation);
        return this;
    }

    public boolean verify_Element_Is_Enabled(String elementXpath) {
        return seleniumBase.checkIsElementEnabled(elementXpath);
    }

    public void action_Click_Cancel_Button_In_Popup() {
        seleniumBase.click(WQ_CLIENT_CHANGE_POPUP_CANCEL_BUTTON_XPATH,WQ_CLIENT_CHANGE_POPUP_CANCEL_BUTTON_CSS);
    }


    public boolean Is_Element_Not_Available(String xpath) {
       return seleniumBase.isElementNotAvailable(xpath);
    }
}
