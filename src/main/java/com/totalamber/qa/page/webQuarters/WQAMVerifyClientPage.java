package com.totalamber.qa.page.webQuarters;

import com.totalamber.qa.automation.SeleniumBase;
import com.totalamber.qa.automation.TestBase;
import com.totalamber.qa.data.UI.elements.webQuarters.wqAMDashboardPage;
import com.totalamber.qa.data.UI.elements.webQuarters.wqAMVerifyClientPage;
import org.openqa.selenium.WebDriver;

/**
 * Created by t.piyananda on 17/09/2017.
 */
public class WQAMVerifyClientPage extends TestBase implements wqAMVerifyClientPage {
    SeleniumBase seleniumBase;

    public WQAMVerifyClientPage (WebDriver driver){seleniumBase = new SeleniumBase(driver);}

    public String check_CompanyDetails_CompanyName_Data() {
        return seleniumBase.verifyDataEquals(AM_VERIFYCLIENTS_COMPANYNAME_XPATH);

    }

    public String check_BusRegNo_Company_Data() {
        return seleniumBase.verifyDataEquals(AM_VERIFYCLIENTS_BUSREGNO_XPATH);
    }

    public String check_Address_Company_Data() {
        return seleniumBase.verifyDataEquals(AM_VERIFYCLIENTS_ADDRESS_XPATH);
    }

    public String check_City_Company_Data() {
        return seleniumBase.verifyDataEquals(AM_VERIFYCLIENTS_CITY_XPATH);
    }

    public String check_State_Company_Data() {
        return seleniumBase.verifyDataEquals(AM_VERIFYCLIENTS_STATE_XPATH);
    }

    public String check_PostalCode_Company_Data() {
        return seleniumBase.verifyDataEquals(AM_VERIFYCLIENTS_POSTALCODE_XPATH);
    }

    public String check_Country_Company_Data() {
        return seleniumBase.verifyDataEquals(AM_VERIFYCLIENTS_COUNTRY_XPATH);
    }

    public String check_Phone_Company_Data() {
        return seleniumBase.verifyDataEquals(AM_VERIFYCLIENTS_PHONE_XPATH);
    }

    public String check_Fax_Company_Data() {
        return seleniumBase.verifyDataEquals(AM_VERIFYCLIENTS_FAX_XPATH);
    }

    public String check_ClientName_Client_Data() {
        return seleniumBase.verifyDataEquals(AM_VERIFYCLIENTS_CLIENTNAME_XPATH);
    }

    public String check_DirectDial_Client_Data() {
        return seleniumBase.verifyDataEquals(AM_VERIFYCLIENTS_DIRDIAL_XPATH);
    }

    public String check_Email_Client_Data() {
        return seleniumBase.verifyDataEquals(AM_VERIFYCLIENTS_EMAIL_XPATH);
    }

    public String check_Designation_Client_Data() {
        return seleniumBase.verifyDataEquals(AM_VERIFYCLIENTS_DESIGNATION_XPATH);
    }

    public String check_ApplicationName_Client_Data() {
        return seleniumBase.verifyDataEquals(AM_VERIFYCLIENTS_APPLICATION_XPATH);
    }

    public String check_VersionName_Client_Data() {
        return seleniumBase.verifyDataEquals(AM_VERIFYCLIENTS_VERSION_XPATH);
    }

    public String check_ModuleName_Client_Data() {
        return seleniumBase.verifyDataEquals(AM_VERIFYCLIENTS_MODULE_XPATH);
    }

    public String check_VerifyButton_Available() {
        return seleniumBase.verifyDataEquals(AM_VERIFYCLIENTS_VERIFY_BUTTON_XPATH);
    }

    public String check_RejectButton_Available() {
        return seleniumBase.verifyDataEquals(AM_VERIFYCLIENTS_REJECT_BUTTON_XPATH);
    }

    public String check_VerifyButton_Text() {
        return seleniumBase.readValueFromTextBox(AM_VERIFYCLIENTS_VERIFY_BUTTON_XPATH);
    }

    public String check_RejectButton_Text() {
        return seleniumBase.readValueFromTextBox(AM_VERIFYCLIENTS_REJECT_BUTTON_XPATH);
    }

    public WQAMVerifyClientPage step_click_VerifyButton() {
        seleniumBase.click(AM_VERIFYCLIENTS_VERIFY_BUTTON_XPATH, AM_VERIFYCLIENTS_VERIFY_BUTTON_CSS);
        return this;
    }

    public WQAMVerifyClientPage step_click_RejectButton() {
        seleniumBase.click(AM_VERIFYCLIENTS_REJECT_BUTTON_XPATH,AM_VERIFYCLIENTS_REJECT_BUTTON_CSS);
        return this;
    }

    public WQAMVerifyClientPage validate_user_gets_aPopup() throws InterruptedException {
        seleniumBase.checkIsElementEnabled(AM_VERIFYCLIENTS_REJECT_POPUP_XPATH);
        seleniumBase.swichToPopup(1);
        return this;
    }

    public String validate_RejectPopup_Title() throws InterruptedException {
        return seleniumBase.verifyDataEquals(AM_VERIFYCLIENTS_REJECT_POPUP_TITLE_XPATH);
    }

    public boolean check_RejectPopup_CommentBox() {
        return seleniumBase.checkIsElementEnabled(AM_VERIFYCLIENTS_REJECT_POPUP_DESCRIPTION_XPATH);
    }

    public String check_RejectPopup_CommentBox_Placeholder() {
        return seleniumBase.getPlaceHolderValueFromTextBox(AM_VERIFYCLIENTS_REJECT_POPUP_DESCRIPTION_XPATH);
    }


    public wqAMVerifyClientPage validate_Characters_Can_Enter(String textToEnter) {
        seleniumBase.type(AM_VERIFYCLIENTS_REJECT_POPUP_DESCRIPTION_CSS,AM_VERIFYCLIENTS_REJECT_POPUP_DESCRIPTION_XPATH,textToEnter);
        return this;
    }

    public boolean check_Rejectbutton_Available_inRejectPopup() {
        return seleniumBase.verifyAvailableObject(AM_VERIFYCLIENTS_REJECT_POPUP_REJECT_BUTTON_XPATH);
    }

    public boolean check_Cancelbutton_Available_inRejectPopup() {
        return seleniumBase.verifyAvailableObject(AM_VERIFYCLIENTS_REJECT_POPUP_CANCEL_BUTTON_XPATH);
    }

    public boolean check_closeCross_Available_inRejectPopup() {
        return seleniumBase.verifyAvailableObject(AM_VERIFYCLIENTS_REJECT_POPUP_CLOSE_CROSS_XPATH);
    }

    public WQAMVerifyClientPage clear_Rejectreason_TextArea() {
        seleniumBase.clearTextBox(AM_VERIFYCLIENTS_REJECT_POPUP_DESCRIPTION_XPATH);
        return this;
    }

    public WQAMVerifyClientPage step_click_Reject_Button() {
        seleniumBase.click(AM_VERIFYCLIENTS_REJECT_POPUP_REJECT_BUTTON_XPATH,AM_VERIFYCLIENTS_REJECT_POPUP_REJECT_BUTTON_CSS);
        return this;
    }

    public String check_Error_Message() {
        return seleniumBase.verifyDataEquals(AM_VERIFYCLIENTS_REJECT_POPUP_ERRORMESSAGE_XPATH);
    }

    public WQAMVerifyClientPage step_click_Cancel_Button() {
        seleniumBase.click(AM_VERIFYCLIENTS_REJECT_POPUP_CANCEL_BUTTON_XPATH,AM_VERIFYCLIENTS_REJECT_POPUP_CANCEL_BUTTON_CSS);
        return this;
    }
}
