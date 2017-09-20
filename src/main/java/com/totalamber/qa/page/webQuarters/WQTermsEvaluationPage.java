package com.totalamber.qa.page.webQuarters;

import com.totalamber.qa.automation.SeleniumBase;
import org.openqa.selenium.WebDriver;
import com.totalamber.qa.data.UI.elements.webQuarters.wqTermsEvaluationPage;

/**
 * Created by t.piyananda on 20/09/2017.
 */
public class WQTermsEvaluationPage implements wqTermsEvaluationPage{

    SeleniumBase seleniumBase;

    public WQTermsEvaluationPage(WebDriver driver) {seleniumBase = new SeleniumBase(driver);}

    public String check_CompanyDetails_CompanyName_Data_In_ClientTermsEvaluationPage() {
        return seleniumBase.verifyDataEquals(AM_CLIENTEVALUATION_COMPANYNAME_XPATH);
    }

    public String check_BusRegNo_Company_Data_In_ClientTermsEvaluationPage() {
        return seleniumBase.verifyDataEquals(AM_CLIENTEVALUATION_BUSREGNO_XPATH);
    }

    public String check_Address_Company_Data_In_ClientTermsEvaluationPage() {
        return seleniumBase.verifyDataEquals(AM_CLIENTEVALUATION_ADDRESS_XPATH);
    }

    public String check_City_Company_Data_In_ClientTermsEvaluationPage() {
        return seleniumBase.verifyDataEquals(AM_CLIENTEVALUATION_CITY_XPATH);
    }

    public String check_State_Company_Data_In_ClientTermsEvaluationPage() {
        return seleniumBase.verifyDataEquals(AM_CLIENTEVALUATION_STATE_XPATH);
    }

    public String check_PostalCode_Company_Data_In_ClientTermsEvaluationPage() {
        return seleniumBase.verifyDataEquals(AM_CLIENTEVALUATION_POSTALCODE_XPATH);
    }

    public String check_Country_Company_Data_In_ClientTermsEvaluationPage() {
        return seleniumBase.verifyDataEquals(AM_CLIENTEVALUATION_COUNTRY_XPATH);
    }

    public String check_Phone_Company_Data_In_ClientTermsEvaluationPage() {
        return seleniumBase.verifyDataEquals(AM_CLIENTEVALUATION_PHONE_XPATH);
    }

    public String check_Fax_Company_Data_In_ClientTermsEvaluationPage() {
        return seleniumBase.verifyDataEquals(AM_CLIENTEVALUATION_FAX_XPATH);
    }

    public String check_ClientName_Client_Data_In_ClientTermsEvaluationPage() {
        return seleniumBase.verifyDataEquals(AM_CLIENTEVALUATION_CLIENTNAME_XPATH);
    }

    public String check_DirectDial_Client_Data_In_ClientTermsEvaluationPage() {
        return seleniumBase.verifyDataEquals(AM_CLIENTEVALUATION_DIRDIAL_XPATH);
    }

    public String check_Email_Client_Data_In_ClientTermsEvaluationPage() {
        return seleniumBase.verifyDataEquals(AM_CLIENTEVALUATION_EMAIL_XPATH);
    }

    public String check_Designation_Client_Data_In_ClientTermsEvaluationPage() {
        return seleniumBase.verifyDataEquals(AM_CLIENTEVALUATION_DESIGNATION_XPATH);
    }

    public String check_ApplicationName_Client_Data_In_ClientTermsEvaluationPage() {
        return seleniumBase.verifyDataEquals(AM_CLIENTEVALUATION_APPLICATION_XPATH);
    }

    public String check_VersionName_Client_Data_In_ClientTermsEvaluationPage() {
        return seleniumBase.verifyDataEquals(AM_CLIENTEVALUATION_VERSION_XPATH);
    }

    public String check_ModuleName_Client_Data_In_ClientTermsEvaluationPage() {
        return seleniumBase.verifyDataEquals(AM_CLIENTEVALUATION_MODULE_XPATH);
    }

    public String check_Rejected_Reason_In_ClientTermsEvaluationPage() {
        return seleniumBase.verifyDataEquals(AM_CLIENTEVALUATION_REJECTED_REASON_XPATH);
    }

    public WQTermsEvaluationPage check_PromptAgain_Button_Available() {
        seleniumBase.verifyAvailableObject(AM_CLIENTEVALUATION_PROMPTAGAIN_BUTTON_XPATH);
        return this;
    }

    public String check_PromptAgain_Button_Text() {
        return seleniumBase.readValueFromTextBox(AM_CLIENTEVALUATION_PROMPTAGAIN_BUTTON_XPATH);
    }

    public WQTermsEvaluationPage click_PromptAgain_Button() {
        seleniumBase.click(AM_CLIENTEVALUATION_PROMPTAGAIN_BUTTON_XPATH,AM_CLIENTEVALUATION_PROMPTAGAIN_BUTTON_CSS);
        return this;
    }
}
