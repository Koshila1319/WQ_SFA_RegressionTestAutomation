package com.totalamber.qa.page.webQuarters;

import com.totalamber.qa.automation.SeleniumBase;
import com.totalamber.qa.data.UI.elements.webQuarters.wqLicensePreferencePage;
import org.openqa.selenium.WebDriver;

/**
 * Created by t.piyananda on 09/10/2017.
 */
public class WQPackagePage implements wqLicensePreferencePage {
    SeleniumBase seleniumBase;

    public WQPackagePage(WebDriver driver) {seleniumBase = new SeleniumBase(driver);}

    public boolean check_PackageLabel_Is_Available() {
        return seleniumBase.verifyAvailableObject(EARLYADOP_PAGE_PACKAGE_LABEL_XPATH);
    }

    public String check_Default_Dropdown_Value_of_Package() {
        return seleniumBase.getText(EARLYADOP_PAGE_PACKAGE_DROPDOWN_SELECTED_CSS,EARLYADOP_PAGE_PACKAGE_DROPDOWN_SELECTED_XPATH);
    }

    public boolean check_Package_Dropdown_IsAvailable() {
        return seleniumBase.verifyAvailableObject(EARLYADOP_PAGE_PACKAGE_DROPDOWN_XPATH);
    }

    public WQPackagePage step_select_a_Package(String s) {
        seleniumBase.selectByVisibleText(EARLYADOP_PAGE_PACKAGE_DROPDOWN_CSS,EARLYADOP_PAGE_PACKAGE_DROPDOWN_XPATH,s);
        return this;
    }

    public boolean check_License_Fee_Is_Populated() {
        return seleniumBase.verifyAvailableObject(EARLYADOP_PAGE_LICENSE_FEE_XPATH);
    }

    public String validate_LicensePackage_PageTitle() {
        return seleniumBase.getText(EARLYADOP_PAGE_PAGETITLE_CSS,EARLYADOP_PAGE_PAGETITLE_XPATH);
    }

    public boolean check_LicenseDuration_IsPopulated() {
        return seleniumBase.verifyAvailableObject(EARLYADOP_PAGE_LICENSE_DURATION_XPATH);
    }

    public boolean check_LicenseUserDetails_IsPopulated() {
        return seleniumBase.verifyAvailableObject(EARLYADOP_PAGE_LICENSE_USERDETAILS_XPATH);
    }

    public boolean check_TotalValue_IsPopulated() {
        return seleniumBase.verifyAvailableObject(EARLYADOP_PAGE_LICENSE_PACKAGE_SUM_XPATH);
    }

    public String check_AddTitle_Text() {
        return seleniumBase.getText(EARLYADOP_PAGE_ADDLICENSE_TITLE_CSS,EARLYADOP_PAGE_ADDLICENSE_TITLE_XPATH);
    }

    public boolean checkUserType_Dropdown_Is_Available() {
        return seleniumBase.verifyAvailableObject(EARLYADOP_PAGE_ADDLICENSE_USERTYPE_DROPDOWN_XPATH);
    }

    public String check_DefaultValue_Of_The_UserType_Dropdown() {
        return seleniumBase.getText(EARLYADOP_PAGE_ADDLICENSE_USERTYPE_DROPDOWN_SELECTED_CSS,EARLYADOP_PAGE_ADDLICENSE_USERTYPE_DROPDOWN_SELECTED_XPATH);
    }

    public boolean check_UserCountDropdown_IsAvailable() {
        return seleniumBase.verifyAvailableObject(EARLYADOP_PAGE_ADDLICENSE_USERCOUNT_DROPDOWN_XPATH);
    }

    public String check_DefaultValue_Of_The_UserCount_Dropdown() {
        return seleniumBase.getText(EARLYADOP_PAGE_ADDLICENSE_USERCOUNT_DROPDOWN_SELECTED_CSS,EARLYADOP_PAGE_ADDLICENSE_USERCOUNT_DROPDOWN_SELECTED_XPATH);
    }

    public WQPackagePage step_select_a_UserType(String s) {
        seleniumBase.selectByVisibleText(EARLYADOP_PAGE_ADDLICENSE_USERTYPE_DROPDOWN_CSS,EARLYADOP_PAGE_ADDLICENSE_USERTYPE_DROPDOWN_XPATH,s);
        return this;
    }

    public WQPackagePage step_select_a_UserCount(String s) {
        seleniumBase.selectByVisibleText(EARLYADOP_PAGE_ADDLICENSE_USERCOUNT_DROPDOWN_CSS,EARLYADOP_PAGE_ADDLICENSE_USERCOUNT_DROPDOWN_XPATH,s);
        return this;
    }

    public String check_UserAmount_Is_available() {
        return seleniumBase.getText(EARLYADOP_PAGE_ADDLICENSE_USERAMOUNT_CSS,EARLYADOP_PAGE_ADDLICENSE_USERAMOUNT_XPATH);
    }

    public boolean check_AddButton_InAdditionalLicenses_Is_available() {
        return seleniumBase.verifyAvailableObject(EARLYADOP_PAGE_ADDLICENSE_ADDBUTTON_XPATH);
    }

    public String check_AddButtonText_InAdditionalLicenses() {
        return seleniumBase.getTextByAttribute(EARLYADOP_PAGE_ADDLICENSE_ADDBUTTON_CSS,EARLYADOP_PAGE_ADDLICENSE_ADDBUTTON_XPATH,"value");
    }

    public WQPackagePage step_Click_add_button_In_AdditionalLicenses() {
        seleniumBase.click(EARLYADOP_PAGE_ADDLICENSE_ADDBUTTON_XPATH,EARLYADOP_PAGE_ADDLICENSE_ADDBUTTON_CSS);
        return this;
    }

    public String check_Error_Message_by_clickAddButton_withoutAdditionalLicenses() {
        return seleniumBase.getText(EARLYADOP_PAGE_ADDLICENSE_ADDBUTTON_ERRORMSG_CSS,EARLYADOP_PAGE_ADDLICENSE_ADDBUTTON_ERRORMSG_XPATH);
    }

    public boolean check_AdditionalLicenses_Table_Is_Available() {
        return seleniumBase.verifyAvailableObject(EARLYADOP_PAGE_ADDLICENSE_TABLE_XPATH);
    }

    public boolean check_AdditionalLicenses_Table_Delete_Button_Is_Available() {
        return seleniumBase.verifyAvailableObject(EARLYADOP_PAGE_ADDLICENSE_TABLE_DELBTN_XPATH);
    }

    public String check_AdditionalLicenses_Table_Delete_Button_Text() {
        return seleniumBase.getTextByAttribute(EARLYADOP_PAGE_ADDLICENSE_TABLE_DELBTN_CSS,EARLYADOP_PAGE_ADDLICENSE_TABLE_DELBTN_XPATH,"value");
    }

    public WQPackagePage step_click_DeleteBUtton_Of_ARecord_InAdditional_License_Table() {
        seleniumBase.click(EARLYADOP_PAGE_ADDLICENSE_TABLE_DELBTN_XPATH,EARLYADOP_PAGE_ADDLICENSE_TABLE_DELBTN_CSS);
        return this;
    }

    public boolean check_TotalValue_with_AdditionalLicenses_IsAvailable() {
        return seleniumBase.verifyAvailableObject(EARLYADOP_PAGE_TOTAL_XPATH);
    }

    public String check_Payment_Method_LabelText() {
        return seleniumBase.getText(EARLYADOP_PAGE_PAYMENTMETHOD_LABEL_CSS,EARLYADOP_PAGE_PAYMENTMETHOD_LABEL_XPATH);
    }

    public boolean check_Payment_Method_Dropdown_IsAvailable() {
        return seleniumBase.verifyAvailableObject(EARLYADOP_PAGE_PAYMENTMETHOD_DROPDOWN_XPATH);
    }

    public String check_Payment_Method_Dropdown_DefaultValue() {
        return seleniumBase.getText(EARLYADOP_PAGE_PAYMENTMETHOD_DROPDOWN_SELECTED_CSS,EARLYADOP_PAGE_PAYMENTMETHOD_DROPDOWN_SELECTED_XPATH);
    }

    public boolean check_Continue_button_IsAvailable_In_LicensePage() {
        return seleniumBase.verifyAvailableObject(EARLYADOP_PAGE_CONTINUE_XPATH);
    }

    public String check_Continue_button_Text_In_LicensePage() {
        return seleniumBase.getTextByAttribute(EARLYADOP_PAGE_CONTINUE_CSS,EARLYADOP_PAGE_CONTINUE_XPATH,"value");
    }

    public WQPackagePage step_click_Continue_Btn_InLicense_Page() {
        seleniumBase.click(EARLYADOP_PAGE_CONTINUE_XPATH,EARLYADOP_PAGE_CONTINUE_CSS);
        return this;
    }

    public String check_Error_message_by_clickContinueButton_Without_Payment() {
        return seleniumBase.getText(EARLYADOP_PAGE_CONTINUE_ERROR_CSS,EARLYADOP_PAGE_CONTINUE_ERROR_XPATH);
    }

    public WQPackagePage step_select_a_PaymentMethod(String s) {
        seleniumBase.selectByVisibleText(EARLYADOP_PAGE_PAYMENTMETHOD_DROPDOWN_CSS,EARLYADOP_PAGE_PAYMENTMETHOD_DROPDOWN_XPATH,s);
        return this;
    }

    public String validate_browser_title_of_LicenseSuccessful() {
        return seleniumBase.getTitle();
    }
}
