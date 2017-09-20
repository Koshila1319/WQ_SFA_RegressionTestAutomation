package com.totalamber.qa.page.webQuarters;

import com.totalamber.qa.automation.SeleniumBase;

import com.totalamber.qa.data.UI.elements.webQuarters.wqSignUpPage;
import org.openqa.selenium.WebDriver;

/**
 * Created by s.wathsala on 9/19/2017.
 */
public class WQSignUpPage implements wqSignUpPage
{
    SeleniumBase seleniumBase;

    public WQSignUpPage(WebDriver driver)
    {
        seleniumBase = new SeleniumBase(driver);
    }

    public String check_Login_Page_Browser_Title() {

        return seleniumBase.getTitle();
    }


    public void check_Constructor_Radio_Option_Available() {
        seleniumBase.checkIsElementEnabled(SIGN_UP_PAGE_CONTRACTOR_OPTION_XPATH);
    }

    public void check_Client_Radio_Option_Available() {
        seleniumBase.checkIsElementEnabled(SIGN_UP_PAGE_CLIENT_OPTION_XPATH);
    }

    public void check_Partner_Radio_Option_Available() {
        seleniumBase.checkIsElementEnabled(SIGN_UP_PAGE_PARTNER_OPTION_XPATH);
    }

    public void check_Copy_Right_Info_Available() {
        seleniumBase.checkIsElementEnabled(SIGN_UP_PAGE_COPY_RIGHT_INFO_XPATH);
    }

    public void check_Step_Info_Available() {
        seleniumBase.checkIsElementEnabled(SIGN_UP_PAGE_STEP_INFO_XPATH);
    }

    public void check_Lets_Go_Button_Is_Disable() {
        seleniumBase.checkIsElementEnabled(SIGN_UP_PAGE_LETS_GO_BUTTON_XPATH);
    }

    public void select_Contractor_Radio_Option_Check_Button_Enable() {
        seleniumBase.selectRadioButton(SIGN_UP_PAGE_CONTRACTOR_OPTION_XPATH);
        seleniumBase.checkIsElementEnabled(SIGN_UP_PAGE_LETS_GO_BUTTON_XPATH);
    }

    public void select_Client_Radio_Option_Check_Button_Enable() {
        seleniumBase.selectRadioButton(SIGN_UP_PAGE_CLIENT_OPTION_XPATH);
        seleniumBase.checkIsElementEnabled(SIGN_UP_PAGE_LETS_GO_BUTTON_XPATH);
    }


    public void select_Partner_Radio_Option_Check_Button_Enable() {
        seleniumBase.selectRadioButton(SIGN_UP_PAGE_PARTNER_OPTION_XPATH);
        seleniumBase.checkIsElementEnabled(SIGN_UP_PAGE_LETS_GO_BUTTON_XPATH);
    }

    public String check_Lets_Go_Button_Text() {

        return  seleniumBase.getTextByAttribute(SIGN_UP_PAGE_LETS_GO_BUTTON_CSS,SIGN_UP_PAGE_LETS_GO_BUTTON_XPATH,"value");

    }

    public  String contractor_Radio_Button_Selection_Leads_To_Consultant_Registration_Page()
    {
        seleniumBase.selectRadioButton(SIGN_UP_PAGE_CONTRACTOR_OPTION_XPATH);
        seleniumBase.click(SIGN_UP_PAGE_LETS_GO_BUTTON_XPATH,SIGN_UP_PAGE_LETS_GO_BUTTON_CSS);
        return seleniumBase.getTitle();
    }

    public  String client_Radio_Button_Selection_Leads_To_Client_Registration_Page()
    {
        seleniumBase.selectRadioButton(SIGN_UP_PAGE_CLIENT_OPTION_XPATH);
        seleniumBase.click(SIGN_UP_PAGE_LETS_GO_BUTTON_XPATH,SIGN_UP_PAGE_LETS_GO_BUTTON_CSS);
        return seleniumBase.getTitle();
    }

    public  String partner_Radio_Button_Selection_Leads_To_Partner_Registration_Page()
    {
        seleniumBase.selectRadioButton(SIGN_UP_PAGE_PARTNER_OPTION_XPATH);
        seleniumBase.click(SIGN_UP_PAGE_LETS_GO_BUTTON_XPATH,SIGN_UP_PAGE_LETS_GO_BUTTON_CSS);
        return seleniumBase.getTitle();
    }


    public String check_The_Page_URL() {
        return seleniumBase.getCurrentUrl();
    }

    public void check_contractor_Radio_Button_Selection_Leads_To_Consultant_Registration_Page() {
        seleniumBase.selectRadioButton(SIGN_UP_PAGE_CONTRACTOR_OPTION_XPATH);
        seleniumBase.click(SIGN_UP_PAGE_LETS_GO_BUTTON_XPATH,SIGN_UP_PAGE_LETS_GO_BUTTON_CSS);
    }

    public void check_client_Radio_Button_Selection_Leads_To_Client_Registration_Page() {
        seleniumBase.selectRadioButton(SIGN_UP_PAGE_CLIENT_OPTION_XPATH);
        seleniumBase.click(SIGN_UP_PAGE_LETS_GO_BUTTON_XPATH,SIGN_UP_PAGE_LETS_GO_BUTTON_CSS);
    }

    public void check_partner_Radio_Button_Selection_Leads_To_Partner_Registration_Page() {
        seleniumBase.selectRadioButton(SIGN_UP_PAGE_PARTNER_OPTION_XPATH);
        seleniumBase.click(SIGN_UP_PAGE_LETS_GO_BUTTON_XPATH,SIGN_UP_PAGE_LETS_GO_BUTTON_CSS);
    }


}