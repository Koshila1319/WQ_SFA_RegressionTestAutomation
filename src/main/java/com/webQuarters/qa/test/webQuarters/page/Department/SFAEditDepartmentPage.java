package com.webQuarters.qa.test.webQuarters.page.Department;


import com.webQuarters.qa.automation.SeleniumBase;
import com.webQuarters.qa.data.UI.elements.webQuarters.elements.Department.sfaEditDepartmentPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by e.koshila on 3/31/2020.
 */

public class SFAEditDepartmentPage implements sfaEditDepartmentPage {

    SeleniumBase seleniumBase;

    public SFAEditDepartmentPage(WebDriver driver) {
        seleniumBase = new SeleniumBase(driver);
    }

    //Check UI view of the Edit Department page

    //Popup title
    public String check_Popup_Title() {
        seleniumBase.checkElementIsDisplayed(EDIT_DEPARTMENT_INFO_POPUP_TITLE_XPATH);
        return seleniumBase.getText(EDIT_DEPARTMENT_INFO_POPUP_TITLE_CSS, EDIT_DEPARTMENT_INFO_POPUP_TITLE_XPATH);
    }

    //Functional

    public void check_And_Validate_Navigation_To_Edit_Department_Info_Popup() {
        seleniumBase.checkElementIsDisplayed(EDIT_DEPARTMENT_INFO_POPUP_XPATH);
    }

    public String check_Company_Name_Label() {
        seleniumBase.checkElementIsDisplayed(EDIT_DEPARTMENT_INFO_COMPANY_NAME_LABEL_XPATH);
        return seleniumBase.getText(EDIT_DEPARTMENT_INFO_COMPANY_NAME_LABEL_CSS, EDIT_DEPARTMENT_INFO_COMPANY_NAME_LABEL_XPATH);
    }

    public String check_Department_Name_Label() {
        seleniumBase.checkElementIsDisplayed(EDIT_DEPARTMENT_INFO_DEPARTMENT_NAME_LABEL_XPATH);
        return seleniumBase.getText(EDIT_DEPARTMENT_INFO_DEPARTMENT_NAME_LABEL_CSS, EDIT_DEPARTMENT_INFO_DEPARTMENT_NAME_LABEL_XPATH);
    }

    public void check_Company_Name_DropDown() {
        seleniumBase.checkElementIsDisplayed(EDIT_DEPARTMENT_INFO_COMPANY_NAME_DD_XPATH);
    }

    public void check_Department_Name_TextBox() {
        seleniumBase.checkElementIsDisplayed(EDIT_DEPARTMENT_INFO_DEPARTMENT_NAME_TEXTBOX_XPATH);
    }

    public String check_Save_Button() {
        seleniumBase.checkElementIsDisplayed(EDIT_DEPARTMENT_INFO_SAVE_BUTTON_XPATH);
        return seleniumBase.getText(EDIT_DEPARTMENT_INFO_SAVE_BUTTON_CSS, EDIT_DEPARTMENT_INFO_SAVE_BUTTON_XPATH);
    }

    public String check_Close_Button() {
        seleniumBase.checkElementIsDisplayed(EDIT_DEPARTMENT_INFO_CLOSE_BUTTON_XPATH);
        return seleniumBase.getText(EDIT_DEPARTMENT_INFO_CLOSE_BUTTON_CSS, EDIT_DEPARTMENT_INFO_CLOSE_BUTTON_XPATH);
    }

    public void check_Close_Icon() {
        seleniumBase.checkElementIsDisplayed(EDIT_DEPARTMENT_INFO_CLOSE_ICON_XPATH);
    }


    public String check_And_Validate_Company_Name_Is_Required_When_Editing_Department() throws InterruptedException {
        Thread.sleep(2000);
        seleniumBase.click(EDIT_DEPARTMENT_INFO_COMPANY_NAME_DD_CLEAR_ICON_XPATH,EDIT_DEPARTMENT_INFO_COMPANY_NAME_DD_CLEAR_ICON_CSS);
        seleniumBase.click(EDIT_DEPARTMENT_INFO_SAVE_BUTTON_XPATH,EDIT_DEPARTMENT_INFO_SAVE_BUTTON_CSS);
        return seleniumBase.getText(EDIT_DEPARTMENT_INFO_COMPANY_NAME_REQUIRED_MSG_CSS,EDIT_DEPARTMENT_INFO_COMPANY_NAME_REQUIRED_MSG_XPATH);
    }

    public String check_And_Validate_Department_Name_Is_Required_When_Editing_Department() {
        seleniumBase.clear_Data_Feilds(EDIT_DEPARTMENT_INFO_DEPARTMENT_NAME_TEXTBOX_XPATH);
        seleniumBase.click(EDIT_DEPARTMENT_INFO_SAVE_BUTTON_XPATH,EDIT_DEPARTMENT_INFO_SAVE_BUTTON_CSS);
        return seleniumBase.getText(EDIT_DEPARTMENT_INFO_DEPARTMENT_NAME_REQUIRED_MSG_CSS,EDIT_DEPARTMENT_INFO_DEPARTMENT_NAME_REQUIRED_MSG_XPATH);
    }

    public void step_Edit_Department(String companyName, String deptName) throws InterruptedException {
        Thread.sleep(3000);
        seleniumBase.click(EDIT_DEPARTMENT_INFO_COMPANY_NAME_DD_XPATH,EDIT_DEPARTMENT_INFO_COMPANY_NAME_DD_CSS);
        seleniumBase.setdropdownValues("AccountIdEdit",companyName);
        seleniumBase.clear_Data_Feilds(EDIT_DEPARTMENT_INFO_DEPARTMENT_NAME_TEXTBOX_XPATH);
        seleniumBase.type(EDIT_DEPARTMENT_INFO_DEPARTMENT_NAME_TEXTBOX_CSS,EDIT_DEPARTMENT_INFO_DEPARTMENT_NAME_TEXTBOX_XPATH,deptName);
        seleniumBase.click(EDIT_DEPARTMENT_INFO_SAVE_BUTTON_XPATH,EDIT_DEPARTMENT_INFO_SAVE_BUTTON_CSS);
    }

    public String check_And_Validate_Duplicate_Department_Error_Message() throws InterruptedException {
        Thread.sleep(5000);
        String MsgTitle = seleniumBase.getText(By.xpath(EDIT_DUPLICATE_DEPARTMENT_ERROR_MSG_TITLE_XPATH));
        String Msg = seleniumBase.getText(By.xpath(EDIT_DUPLICATE_DEPARTMENT_ERROR_MSG_XPATH));

        String Message = MsgTitle + " " + Msg;

        System.out.println("Title ="+ MsgTitle);
        System.out.println("Msg ="+ Msg);

        return Message;
    }

    public String check_And_Validate_Edit_Department_Success_Message() throws InterruptedException {
        Thread.sleep(1500);
        String MsgTitle = seleniumBase.getText(By.xpath(EDIT_DEPARTMENT_SUCCESS_MSG_TITLE_XPATH));
        String Msg = seleniumBase.getText(By.xpath(EDIT_DEPARTMENT_SUCCESS_MSG_XPATH));

        String Message = MsgTitle + " " + Msg;

        System.out.println("Title ="+ MsgTitle);
        System.out.println("Msg ="+ Msg);

        return Message;
    }

    public boolean check_And_Validate_Close_The_Popup_By_Clicking_On_Close_Button() throws InterruptedException {
        Thread.sleep(2000);
        seleniumBase.click(EDIT_DEPARTMENT_INFO_CLOSE_BUTTON_XPATH,EDIT_DEPARTMENT_INFO_CLOSE_BUTTON_CSS);
        Thread.sleep(5000);
        return seleniumBase.checkElementPresent("//div[contains(@style, \"display: block\")]");
    }

    public boolean check_And_Validate_Close_The_Popup_By_Clicking_On_Close_Icon() throws InterruptedException {
        Thread.sleep(2000);
        seleniumBase.click(EDIT_DEPARTMENT_INFO_CLOSE_ICON_XPATH,EDIT_DEPARTMENT_INFO_CLOSE_ICON_CSS);
        Thread.sleep(5000);
        return seleniumBase.checkElementPresent("//div[contains(@style, \"display: block\")]");
    }
}



