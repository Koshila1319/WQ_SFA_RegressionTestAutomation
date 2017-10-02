package com.totalamber.qa.page.webQuarters;


import com.totalamber.qa.automation.SeleniumBase;
import com.totalamber.qa.data.UI.elements.webQuarters.wqClientAssignPage;
import org.openqa.selenium.WebDriver;

/**
 * Created by s.wathsala on 9/29/2017.
 */
public class WQClientAssignPage implements wqClientAssignPage {
    SeleniumBase seleniumBase;

    public WQClientAssignPage(WebDriver driver) {

        seleniumBase = new SeleniumBase(driver);
    }



    public WQClientAssignPage action_Navigate_To_Assign_Page_By_Click_On_Link(String company_Name) {
        seleniumBase.clickOnLink(company_Name);
        return this;
    }

    public String check_Page_Name() {
        return seleniumBase.getText(WQ_SM_ASSIGN_PAGE_TITLE_TEXT_CSS,WQ_SM_ASSIGN_PAGE_TITLE_TEXT_XPATH);
    }

    public WQClientAssignPage search_Company_Name(String company_name) {
        seleniumBase.type(WQ_SM_ASSIGN_PAGE_COMPANY_NAME_CSS,WQ_SM_ASSIGN_PAGE_COMPANY_NAME_XPATH,company_name);
        return this;
    }

    public void click_On_Go_Button() {
        seleniumBase.click(WQ_SM_ASSIGN_PAGE_GO_BUTTON_XPATH,WQ_SM_ASSIGN_PAGE_GO_BUTTON_CSS);
    }

    public String not_Verified_Data() {
        return seleniumBase.getText(WQ_SM_ASSIGN_PAGE_TEXTBOX_MSG_CSS,WQ_SM_ASSIGN_PAGE_TEXTBOX_MSG_XPATH);
    }

    public void click_On_Enter_Button() {
        seleniumBase.pressEnter();
    }

    public String check_Page_Title() {
        return seleniumBase.getTitle();
    }

    public String check_Company_Name() {
        return seleniumBase.getText(WQ_SM_ASSIGN_COMPANY_NAME_CSS,WQ_SM_ASSIGN_COMPANY_NAME_XPATH);
    }

    public String check_Address() {

        return seleniumBase.getText(WQ_SM_ASSIGN_ADDRESS_CSS,WQ_SM_ASSIGN_ADDRESS_XPATH);
    }


    public String check_City() {

        return seleniumBase.getText(WQ_SM_ASSIGN_CITY_CSS,WQ_SM_ASSIGN_CITY_XPATH);
    }

    public String check_Country() {
        return seleniumBase.getText(WQ_SM_ASSIGN_COUNTRY_CSS,WQ_SM_ASSIGN_COUNTRY_XPATH);
    }

    public String check_Phone() {
        return seleniumBase.getText(WQ_SM_ASSIGN_PHONE_NO_CSS,WQ_SM_ASSIGN_PHONE_NO_XPATH);
    }

    public String check_Client_Name() {
        return seleniumBase.getText(WQ_SM_ASSIGN_CLIENT_NAME_CSS,WQ_SM_ASSIGN_CLIENT_NAME_XPATH);
    }

    public String check_Direct_Dial() {
        return seleniumBase.getText(WQ_SM_ASSIGN_DIRECT_DIAL_CSS,WQ_SM_ASSIGN_DIRECT_DIAL_XPATH);
    }

    public String check_Contact_Email() {
        return seleniumBase.getText(WQ_SM_ASSIGN_CONTACT_EMAIL_CSS,WQ_SM_ASSIGN_CONTACT_EMAIL_XPATH);
    }

    public String check_Designation() {
        return seleniumBase.getText(WQ_SM_ASSIGN_DESIGNATION_CSS,WQ_SM_ASSIGN_DESIGNATION_XPATH);
    }

    public String check_SW_App() {
        return seleniumBase.getText(WQ_SM_ASSIGN_SW_APP_CSS,WQ_SM_ASSIGN_SW_APP_XPATH);
    }

    public String check_SW_Version() {
        return seleniumBase.getText(WQ_SM_ASSIGN_VERSION_CSS,WQ_SM_ASSIGN_VERSION_XPATH);
    }

    public String check_Module() {
        return seleniumBase.getText(WQ_SM_ASSIGN_MODULE_CSS,WQ_SM_ASSIGN_MODULE_XPATH);
    }

    public WQClientAssignPage  check_Drop_Down_Is_Available() {
        seleniumBase.checkIsElementEnabled(WQ_SM_ASSIGN_TO_DROPDOWN_XPATH);
        return this;
    }

    public WQClientAssignPage  check_Assign_Button_Is_Available() {
        seleniumBase.checkIsElementEnabled(WQ_SM_ASSIGN_BUTTON_XPATH);
        return this;
    }

    public String check_Assign_Button_Text() {
        return seleniumBase.getTextByAttribute(WQ_SM_ASSIGN_BUTTON_CSS,WQ_SM_ASSIGN_BUTTON_XPATH,"value");
    }

    public String check_CopyRight_Info() {
        return seleniumBase.getText(WQ_SM_ASSIGN_COPY_RIGHT_INFO_CSS,WQ_SM_ASSIGN_COPY_RIGHT_INFO_XPATH);
    }

    public void select_AM_From_DropDown() {
        seleniumBase.selectByVisibleText(WQ_SM_ASSIGN_AM_DROPDOWN_CSS,WQ_SM_ASSIGN_AM_DROPDOWN_XPATH,"Account Manager 1");
    }

    public void click_On_Assign_Button() {
        seleniumBase.click(WQ_SM_ASSIGN_BUTTON_XPATH,WQ_SM_ASSIGN_BUTTON_CSS);
    }

    public String check_The_Page_Ridirection() {
        return seleniumBase.getCurrentUrl();
    }
}
