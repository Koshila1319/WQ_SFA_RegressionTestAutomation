package com.totalamber.qa.page.webQuarters;

import com.totalamber.qa.automation.SeleniumBase;
import com.totalamber.qa.automation.TestBase;
import com.totalamber.qa.data.UI.elements.webQuarters.wqAMDashboardPage;
import com.totalamber.qa.data.UI.elements.webQuarters.wqBackOfficeLoginPage;
import org.openqa.selenium.WebDriver;

/**
 * Created by t.piyananda on 15/09/2017.
 */
public class WQAMDashboardPage extends TestBase implements wqAMDashboardPage {

    SeleniumBase seleniumBase;
    public WQAMDashboardPage(WebDriver driver) {seleniumBase = new SeleniumBase(driver);}


    public boolean check_Pending_Client_Table_Available() {
        return seleniumBase.checkIsElementEnabled(AM_PENDINGCLIENTS_TABLE_XPATH);
    }

    public String check_Client_In_Table_Available(String clientName) {
        return seleniumBase.checkIsValueExist(AM_PENDINGCLIENTS_TABLE_XPATH, clientName);
    }

    public WQAMDashboardPage step_user_clicks_Client(String clientName) {
        seleniumBase.clickOnLink(clientName);
        return this;
    }

    public String validate_user_goesTo_Page() {
        return seleniumBase.driver.getTitle();
    }

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

    public WQAMDashboardPage step_Click_VerifyButton() {
        seleniumBase.click(AM_VERIFYCLIENTS_VERIFY_BUTTON_XPATH, AM_VERIFYCLIENTS_VERIFY_BUTTON_CSS);
        return this;
    }

}
