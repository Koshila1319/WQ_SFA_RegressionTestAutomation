package com.webQuarters.qa.test.webQuarters.page.Department;


import com.webQuarters.qa.automation.SeleniumBase;
import com.webQuarters.qa.data.UI.elements.webQuarters.elements.Department.sfaAddDepartmentPage;
import com.webQuarters.qa.data.UI.elements.webQuarters.elements.Department.sfaDepartmentPage;
import com.webQuarters.qa.data.UI.elements.webQuarters.elements.sfaHomePage;
import com.webQuarters.qa.data.UI.elements.webQuarters.elements.sfaLoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by e.koshila on 3/30/2020.
 */

public class SFAAddDepartmentPage implements sfaLoginPage,sfaHomePage, sfaDepartmentPage, sfaAddDepartmentPage {

    SeleniumBase seleniumBase;

    public SFAAddDepartmentPage(WebDriver driver) {
        seleniumBase = new SeleniumBase(driver);
    }

    //Check UI view of the Department page

    //Popup title
    public String check_Popup_Title() {
        seleniumBase.checkElementIsDisplayed(ADD_NEW_DEPARTMENT_INFO_POPUP_TITLE_XPATH);
        return seleniumBase.getText(ADD_NEW_DEPARTMENT_INFO_POPUP_TITLE_CSS, ADD_NEW_DEPARTMENT_INFO_POPUP_TITLE_XPATH);
    }

    public String check_Company_Name_Label() {
        seleniumBase.checkElementIsDisplayed(ADD_NEW_DEPARTMENT_INFO_COMPANY_NAME_LABEL_XPATH);
        return seleniumBase.getText(ADD_NEW_DEPARTMENT_INFO_COMPANY_NAME_LABEL_CSS, ADD_NEW_DEPARTMENT_INFO_COMPANY_NAME_LABEL_XPATH);
    }

    public String check_Department_Name_Label() {
        seleniumBase.checkElementIsDisplayed(ADD_NEW_DEPARTMENT_INFO_DEPARTMENT_NAME_LABEL_XPATH);
        return seleniumBase.getText(ADD_NEW_DEPARTMENT_INFO_DEPARTMENT_NAME_LABEL_CSS, ADD_NEW_DEPARTMENT_INFO_DEPARTMENT_NAME_LABEL_XPATH);
    }

    public void check_Company_Name_DropDown() {
        seleniumBase.checkElementIsDisplayed(ADD_NEW_DEPARTMENT_INFO_COMPANY_NAME_DD_XPATH);
    }

    public void check_Department_Name_TextBox() {
        seleniumBase.checkElementIsDisplayed(ADD_NEW_DEPARTMENT_INFO_DEPARTMENT_NAME_TEXTBOX_XPATH);
    }

    public String check_Save_Button() {
        seleniumBase.checkElementIsDisplayed(ADD_NEW_DEPARTMENT_INFO_SAVE_BUTTON_XPATH);
        return seleniumBase.getText(ADD_NEW_DEPARTMENT_INFO_SAVE_BUTTON_CSS, ADD_NEW_DEPARTMENT_INFO_SAVE_BUTTON_XPATH);
    }

    public String check_Close_Button() {
        seleniumBase.checkElementIsDisplayed(ADD_NEW_DEPARTMENT_INFO_CLOSE_BUTTON_XPATH);
        return seleniumBase.getText(ADD_NEW_DEPARTMENT_INFO_CLOSE_BUTTON_CSS, ADD_NEW_DEPARTMENT_INFO_CLOSE_BUTTON_XPATH);
    }

    public void check_Close_Icon() {
        seleniumBase.checkElementIsDisplayed(ADD_NEW_DEPARTMENT_INFO_CLOSE_ICON_XPATH);
    }

    //Functional

    public String create_Random_Department_Name(String departmentNameToCombine) {
        return seleniumBase.createRandomText(departmentNameToCombine);
    }

    public void check_And_Validate_Navigation_To_Add_New_Department_Info_Popup() throws InterruptedException {
        Thread.sleep(3000);
        seleniumBase.checkElementIsDisplayed(ADD_NEW_DEPARTMENT_INFO_POPUP_XPATH);
    }

    public String check_And_Validate_Company_Name_Is_Required_When_Adding_New_Department() throws InterruptedException {
        Thread.sleep(2000);
        seleniumBase.click(ADD_NEW_DEPARTMENT_INFO_COMPANY_NAME_DD_CLEAR_ICON_XPATH,ADD_NEW_DEPARTMENT_INFO_COMPANY_NAME_DD_CLEAR_ICON_CSS);
        seleniumBase.click(ADD_NEW_DEPARTMENT_INFO_SAVE_BUTTON_XPATH,ADD_NEW_DEPARTMENT_INFO_SAVE_BUTTON_CSS);
        return seleniumBase.getText(ADD_NEW_DEPARTMENT_INFO_COMPANY_NAME_REQUIRED_MSG_CSS,ADD_NEW_DEPARTMENT_INFO_COMPANY_NAME_REQUIRED_MSG_XPATH);
    }

    public String check_And_Validate_Department_Name_Is_Required_When_Adding_New_Department() {
        seleniumBase.click(ADD_NEW_DEPARTMENT_INFO_SAVE_BUTTON_XPATH,ADD_NEW_DEPARTMENT_INFO_SAVE_BUTTON_CSS);
        return seleniumBase.getText(ADD_NEW_DEPARTMENT_INFO_DEPARTMENT_NAME_REQUIRED_MSG_CSS,ADD_NEW_DEPARTMENT_INFO_DEPARTMENT_NAME_REQUIRED_MSG_XPATH);
    }

    public void step_Add_New_Department(String companyName, String deptName) throws InterruptedException {
        seleniumBase.click(ADD_NEW_DEPARTMENT_INFO_COMPANY_NAME_DD_XPATH,ADD_NEW_DEPARTMENT_INFO_COMPANY_NAME_DD_CSS);
        seleniumBase.setdropdownValues("AccountIdCreate",companyName);
        seleniumBase.type(ADD_NEW_DEPARTMENT_INFO_DEPARTMENT_NAME_TEXTBOX_CSS,ADD_NEW_DEPARTMENT_INFO_DEPARTMENT_NAME_TEXTBOX_XPATH,deptName);
        seleniumBase.click(ADD_NEW_DEPARTMENT_INFO_SAVE_BUTTON_XPATH,ADD_NEW_DEPARTMENT_INFO_SAVE_BUTTON_CSS);
        Thread.sleep(1000);
    }

    public String check_And_Validate_Add_Department_Success_Message() throws InterruptedException {
        String MsgTitle = seleniumBase.getText(By.xpath(ADD_DEPARTMENT_SUCCESS_MSG_TITLE_XPATH));
        String Msg = seleniumBase.getText(By.xpath(ADD_DEPARTMENT_SUCCESS_MSG_XPATH));

        String Message = MsgTitle + " " + Msg;

        System.out.println("Title ="+ MsgTitle);
        System.out.println("Msg ="+ Msg);

        return Message;
    }

    public boolean check_And_Validate_Close_The_Popup_By_Clicking_On_Close_Button() throws InterruptedException {
        Thread.sleep(2000);
        seleniumBase.click(ADD_NEW_DEPARTMENT_INFO_CLOSE_BUTTON_XPATH,ADD_NEW_DEPARTMENT_INFO_CLOSE_BUTTON_CSS);
        Thread.sleep(5000);
        return seleniumBase.checkElementPresent("//div[contains(@style, \"display: block\")]");
    }

    public boolean check_And_Validate_Close_The_Popup_By_Clicking_On_Close_Icon() throws InterruptedException {
        Thread.sleep(2000);
        seleniumBase.click(ADD_NEW_DEPARTMENT_INFO_CLOSE_ICON_XPATH,ADD_NEW_DEPARTMENT_INFO_CLOSE_ICON_CSS);
        Thread.sleep(5000);
        return seleniumBase.checkElementPresent("//div[contains(@style, \"display: block\")]");
    }

    public String check_And_Validate_Duplicate_Department_Error_Message() throws InterruptedException {
        Thread.sleep(5000);
        String MsgTitle = seleniumBase.getText(By.xpath(ADD_DUPLICATE_DEPARTMENT_ERROR_MSG_TITLE_XPATH));
        String Msg = seleniumBase.getText(By.xpath(ADD_DUPLICATE_DEPARTMENT_ERROR_MSG_XPATH));

        String Message = MsgTitle + " " + Msg;

        System.out.println("Title ="+ MsgTitle);
        System.out.println("Msg ="+ Msg);

        return Message;
    }

}



