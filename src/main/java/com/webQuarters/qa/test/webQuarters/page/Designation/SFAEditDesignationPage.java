package com.webQuarters.qa.test.webQuarters.page.Designation;


import com.webQuarters.qa.automation.SeleniumBase;
import com.webQuarters.qa.data.UI.elements.webQuarters.elements.Designation.sfaEditDesignationPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by e.koshila on 3/31/2020.
 */

public class SFAEditDesignationPage implements sfaEditDesignationPage {

    SeleniumBase seleniumBase;

    public SFAEditDesignationPage(WebDriver driver) {
        seleniumBase = new SeleniumBase(driver);
    }

    //Check UI view of the Edit Designation page

    //Popup title
    public String check_Popup_Title() {
        seleniumBase.checkElementIsDisplayed(EDIT_DESIGNATION_INFO_POPUP_TITLE_XPATH);
        return seleniumBase.getText(EDIT_DESIGNATION_INFO_POPUP_TITLE_CSS, EDIT_DESIGNATION_INFO_POPUP_TITLE_XPATH);
    }

    //Functional

    public void check_And_Validate_Navigation_To_Edit_Designation_Info_Popup() {
        seleniumBase.checkElementIsDisplayed(EDIT_DESIGNATION_INFO_POPUP_XPATH);
    }

    public String check_Company_Name_Label() throws InterruptedException {
        Thread.sleep(2000);
        seleniumBase.checkElementIsDisplayed(EDIT_DESIGNATION_INFO_COMPANY_NAME_LABEL_XPATH);
        return seleniumBase.getText(EDIT_DESIGNATION_INFO_COMPANY_NAME_LABEL_CSS, EDIT_DESIGNATION_INFO_COMPANY_NAME_LABEL_XPATH);
    }

    public String check_Designation_Name_Label() {
        seleniumBase.checkElementIsDisplayed(EDIT_DESIGNATION_INFO_DESIGNATION_NAME_LABEL_XPATH);
        return seleniumBase.getText(EDIT_DESIGNATION_INFO_DESIGNATION_NAME_LABEL_CSS, EDIT_DESIGNATION_INFO_DESIGNATION_NAME_LABEL_XPATH);
    }

    public void check_Company_Name_DropDown() {
        seleniumBase.checkElementIsDisplayed(EDIT_DESIGNATION_INFO_COMPANY_NAME_DD_XPATH);
    }

    public void check_Designation_Name_TextBox() {
        seleniumBase.checkElementIsDisplayed(EDIT_DESIGNATION_INFO_DESIGNATION_NAME_TEXTBOX_XPATH);
    }

    public String check_Save_Button() {
        seleniumBase.checkElementIsDisplayed(EDIT_DESIGNATION_INFO_SAVE_BUTTON_XPATH);
        return seleniumBase.getText(EDIT_DESIGNATION_INFO_SAVE_BUTTON_CSS, EDIT_DESIGNATION_INFO_SAVE_BUTTON_XPATH);
    }

    public String check_Close_Button() {
        seleniumBase.checkElementIsDisplayed(EDIT_DESIGNATION_INFO_CLOSE_BUTTON_XPATH);
        return seleniumBase.getText(EDIT_DESIGNATION_INFO_CLOSE_BUTTON_CSS, EDIT_DESIGNATION_INFO_CLOSE_BUTTON_XPATH);
    }

    public void check_Close_Icon() {
        seleniumBase.checkElementIsDisplayed(EDIT_DESIGNATION_INFO_CLOSE_ICON_XPATH);
    }


    public String check_And_Validate_Company_Name_Is_Required_When_Editing_Designation() throws InterruptedException {
        Thread.sleep(2000);
        seleniumBase.click(EDIT_DESIGNATION_INFO_COMPANY_NAME_DD_CLEAR_ICON_XPATH,EDIT_DESIGNATION_INFO_COMPANY_NAME_DD_CLEAR_ICON_CSS);
        seleniumBase.click(EDIT_DESIGNATION_INFO_SAVE_BUTTON_XPATH,EDIT_DESIGNATION_INFO_SAVE_BUTTON_CSS);
        return seleniumBase.getText(EDIT_DESIGNATION_INFO_COMPANY_NAME_REQUIRED_MSG_CSS,EDIT_DESIGNATION_INFO_COMPANY_NAME_REQUIRED_MSG_XPATH);
    }

    public String check_And_Validate_Designation_Name_Is_Required_When_Editing_Designation() {
        seleniumBase.clear_Data_Feilds(EDIT_DESIGNATION_INFO_DESIGNATION_NAME_TEXTBOX_XPATH);
        seleniumBase.click(EDIT_DESIGNATION_INFO_SAVE_BUTTON_XPATH,EDIT_DESIGNATION_INFO_SAVE_BUTTON_CSS);
        return seleniumBase.getText(EDIT_DESIGNATION_INFO_DESIGNATION_NAME_REQUIRED_MSG_CSS,EDIT_DESIGNATION_INFO_DESIGNATION_NAME_REQUIRED_MSG_XPATH);
    }

    public void step_Edit_Designation(String companyName, String deptName) throws InterruptedException {
        Thread.sleep(3000);
        seleniumBase.click(EDIT_DESIGNATION_INFO_COMPANY_NAME_DD_XPATH,EDIT_DESIGNATION_INFO_COMPANY_NAME_DD_CSS);
        seleniumBase.setdropdownValues("AccountIdEdit",companyName);
        seleniumBase.clear_Data_Feilds(EDIT_DESIGNATION_INFO_DESIGNATION_NAME_TEXTBOX_XPATH);
        seleniumBase.type(EDIT_DESIGNATION_INFO_DESIGNATION_NAME_TEXTBOX_CSS,EDIT_DESIGNATION_INFO_DESIGNATION_NAME_TEXTBOX_XPATH,deptName);
        seleniumBase.click(EDIT_DESIGNATION_INFO_SAVE_BUTTON_XPATH,EDIT_DESIGNATION_INFO_SAVE_BUTTON_CSS);
    }

    public String check_And_Validate_Duplicate_Designation_Error_Message() throws InterruptedException {
        Thread.sleep(5000);
        String MsgTitle = seleniumBase.getText(By.xpath(EDIT_DUPLICATE_DESIGNATION_ERROR_MSG_TITLE_XPATH));
        String Msg = seleniumBase.getText(By.xpath(EDIT_DUPLICATE_DESIGNATION_ERROR_MSG_XPATH));

        String Message = MsgTitle + " " + Msg;

        System.out.println("Title ="+ MsgTitle);
        System.out.println("Msg ="+ Msg);

        return Message;
    }

    public String check_And_Validate_Edit_Designation_Success_Message() throws InterruptedException {
        Thread.sleep(1500);
        String MsgTitle = seleniumBase.getText(By.xpath(EDIT_DESIGNATION_SUCCESS_MSG_TITLE_XPATH));
        String Msg = seleniumBase.getText(By.xpath(EDIT_DESIGNATION_SUCCESS_MSG_XPATH));

        String Message = MsgTitle + " " + Msg;

        System.out.println("Title ="+ MsgTitle);
        System.out.println("Msg ="+ Msg);

        return Message;
    }

    public boolean check_And_Validate_Close_The_Popup_By_Clicking_On_Close_Button() throws InterruptedException {
        Thread.sleep(2000);
        seleniumBase.click(EDIT_DESIGNATION_INFO_CLOSE_BUTTON_XPATH,EDIT_DESIGNATION_INFO_CLOSE_BUTTON_CSS);
        Thread.sleep(5000);
        return seleniumBase.checkElementPresent("//*[@style=\"display: block;\"]");
    }

    public boolean check_And_Validate_Close_The_Popup_By_Clicking_On_Close_Icon() throws InterruptedException {
        Thread.sleep(2000);
        seleniumBase.click(EDIT_DESIGNATION_INFO_CLOSE_ICON_XPATH,EDIT_DESIGNATION_INFO_CLOSE_ICON_CSS);
        Thread.sleep(5000);
        return seleniumBase.checkElementPresent("//*[@style=\"display: block;\"]");
    }
}



