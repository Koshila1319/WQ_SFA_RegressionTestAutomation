package com.webQuarters.qa.test.webQuarters.page.Employee;


import com.webQuarters.qa.automation.SeleniumBase;
import com.webQuarters.qa.data.UI.elements.webQuarters.elements.Employee.sfaEditEmployeePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by e.koshila on 4/21/2020.
 */

public class SFAEditEmployeePage implements sfaEditEmployeePage {

    SeleniumBase seleniumBase;

    public SFAEditEmployeePage(WebDriver driver) {
        seleniumBase = new SeleniumBase(driver);
    }

    //Check UI view of the Edit Employee page

    //Popup title
    public String check_Popup_Title() {
        seleniumBase.checkElementIsDisplayed(EDIT_EMPLOYEE_INFO_POPUP_TITLE_XPATH);
        return seleniumBase.getText(EDIT_EMPLOYEE_INFO_POPUP_TITLE_CSS, EDIT_EMPLOYEE_INFO_POPUP_TITLE_XPATH);
    }

    //Functional

    public void check_And_Validate_Navigation_To_Edit_Employee_Info_Popup() {
        seleniumBase.checkElementIsDisplayed(EDIT_EMPLOYEE_INFO_POPUP_XPATH);
    }

    public String check_Company_Name_Label() throws InterruptedException {
        Thread.sleep(2000);
        seleniumBase.checkElementIsDisplayed(EDIT_EMPLOYEE_INFO_COMPANY_NAME_LABEL_XPATH);
        return seleniumBase.getText(EDIT_EMPLOYEE_INFO_COMPANY_NAME_LABEL_CSS, EDIT_EMPLOYEE_INFO_COMPANY_NAME_LABEL_XPATH);
    }

    public String check_Employee_Name_Label() {
        seleniumBase.checkElementIsDisplayed(EDIT_EMPLOYEE_INFO_EMPLOYEE_NAME_LABEL_XPATH);
        return seleniumBase.getText(EDIT_EMPLOYEE_INFO_EMPLOYEE_NAME_LABEL_CSS, EDIT_EMPLOYEE_INFO_EMPLOYEE_NAME_LABEL_XPATH);
    }

    public void check_Company_Name_DropDown() {
        seleniumBase.checkElementIsDisplayed(EDIT_EMPLOYEE_INFO_COMPANY_NAME_DD_XPATH);
    }

    public void check_Employee_Name_TextBox() {
        seleniumBase.checkElementIsDisplayed(EDIT_EMPLOYEE_INFO_EMPLOYEE_NAME_TEXTBOX_XPATH);
    }

    public String check_Company_Branch_Name_Label() {
        seleniumBase.checkElementIsDisplayed(EDIT_EMPLOYEE_INFO_COMPANY_BRANCH_NAME_LABEL_XPATH);
        return seleniumBase.getText(EDIT_EMPLOYEE_INFO_COMPANY_BRANCH_NAME_LABEL_CSS, EDIT_EMPLOYEE_INFO_COMPANY_BRANCH_NAME_LABEL_XPATH);
    }

    public void check_Company_Branch_Name_Dropdown() {
        seleniumBase.checkElementIsDisplayed(EDIT_EMPLOYEE_INFO_COMPANY_BRANCH_NAME_DD_XPATH);
    }

    public String check_Department_Name_Label() {
        seleniumBase.checkElementIsDisplayed(EDIT_EMPLOYEE_INFO_DEPARTMENT_NAME_LABEL_XPATH);
        return seleniumBase.getText(EDIT_EMPLOYEE_INFO_DEPARTMENT_NAME_LABEL_CSS, EDIT_EMPLOYEE_INFO_DEPARTMENT_NAME_LABEL_XPATH);
    }

    public void check_Department_Dropdown() {
        seleniumBase.checkElementIsDisplayed(EDIT_EMPLOYEE_INFO_DEPARTMENT_NAME_DD_XPATH);
    }

    public String check_Designation_Name_Label() {
        seleniumBase.checkElementIsDisplayed(EDIT_EMPLOYEE_INFO_DESIGNATION_NAME_LABEL_XPATH);
        return seleniumBase.getText(EDIT_EMPLOYEE_INFO_DESIGNATION_NAME_LABEL_CSS, EDIT_EMPLOYEE_INFO_DESIGNATION_NAME_LABEL_XPATH);
    }

    public void check_Designation_Dropdown() {
        seleniumBase.checkElementIsDisplayed(EDIT_EMPLOYEE_INFO_DESIGNATION_NAME_DD_XPATH);
    }

    public String check_Title_Name_Label() {
        seleniumBase.checkElementIsDisplayed(EDIT_EMPLOYEE_INFO_TITLE_LABEL_XPATH);
        return seleniumBase.getText(EDIT_EMPLOYEE_INFO_TITLE_LABEL_CSS, EDIT_EMPLOYEE_INFO_TITLE_LABEL_XPATH);
    }

    public String check_Personal_Title_Radio_Options() {
        seleniumBase.checkElementIsDisplayed(EDIT_EMPLOYEE_INFO_PERSONAL_TITLE_RADIO_OPTION_XPATH);
        return seleniumBase.getText(EDIT_EMPLOYEE_INFO_PERSONAL_TITLE_RADIO_OPTION_CSS, EDIT_EMPLOYEE_INFO_PERSONAL_TITLE_RADIO_OPTION_XPATH);
    }

    public String check_Employee_Number_Label() {
        seleniumBase.checkElementIsDisplayed(EDIT_EMPLOYEE_INFO_EMPLOYEE_NUMBER_LABEL_XPATH);
        return seleniumBase.getText(EDIT_EMPLOYEE_INFO_EMPLOYEE_NUMBER_LABEL_CSS, EDIT_EMPLOYEE_INFO_EMPLOYEE_NUMBER_LABEL_XPATH);
    }

    public void check_Employee_Number_TextBox() {
        seleniumBase.checkElementIsDisplayed(EDIT_EMPLOYEE_INFO_EMPLOYEE_NUMBER_TEXTBOX_XPATH);
    }

    public String check_First_Name_Label() {
        seleniumBase.checkElementIsDisplayed(EDIT_EMPLOYEE_INFO_FIRST_NAME_LABEL_XPATH);
        return seleniumBase.getText(EDIT_EMPLOYEE_INFO_FIRST_NAME_LABEL_CSS, EDIT_EMPLOYEE_INFO_FIRST_NAME_LABEL_XPATH);
    }

    public void check_First_Name_TextBox() {
        seleniumBase.checkElementIsDisplayed(EDIT_EMPLOYEE_INFO_FIRST_NAME_TEXTBOX_XPATH);
    }

    public String check_Middle_Name_Label() {
        seleniumBase.checkElementIsDisplayed(EDIT_EMPLOYEE_INFO_MIDDLE_NAME_LABEL_XPATH);
        return seleniumBase.getText(EDIT_EMPLOYEE_INFO_MIDDLE_NAME_LABEL_CSS, EDIT_EMPLOYEE_INFO_MIDDLE_NAME_LABEL_XPATH);
    }

    public void check_Middle_Name_TextBox() {
        seleniumBase.checkElementIsDisplayed(EDIT_EMPLOYEE_INFO_MIDDLE_NAME_TEXTBOX_XPATH);
    }

    public String check_Last_Name_Label() {
        seleniumBase.checkElementIsDisplayed(EDIT_EMPLOYEE_INFO_LAST_NAME_LABEL_XPATH);
        return seleniumBase.getText(EDIT_EMPLOYEE_INFO_LAST_NAME_LABEL_CSS, EDIT_EMPLOYEE_INFO_LAST_NAME_LABEL_XPATH);
    }

    public void check_Last_Name_TextBox() {
        seleniumBase.checkElementIsDisplayed(EDIT_EMPLOYEE_INFO_LAST_NAME_TEXTBOX_XPATH);
    }

    public String check_Calling_Name_Label() {
        seleniumBase.checkElementIsDisplayed(EDIT_EMPLOYEE_INFO_CALLING_NAME_LABEL_XPATH);
        return seleniumBase.getText(EDIT_EMPLOYEE_INFO_CALLING_NAME_LABEL_CSS, EDIT_EMPLOYEE_INFO_CALLING_NAME_LABEL_XPATH);
    }

    public void check_Calling_Name_TextBox() {
        seleniumBase.checkElementIsDisplayed(EDIT_EMPLOYEE_INFO_CALLING_NAME_TEXTBOX_XPATH);
    }

    public String check_Mobile_Label() {
        seleniumBase.checkElementIsDisplayed(EDIT_EMPLOYEE_INFO_MOBILE_LABEL_XPATH);
        return seleniumBase.getText(EDIT_EMPLOYEE_INFO_MOBILE_LABEL_CSS, EDIT_EMPLOYEE_INFO_MOBILE_LABEL_XPATH);
    }

    public void check_Mobile_TextBox() {
        seleniumBase.checkElementIsDisplayed(EDIT_EMPLOYEE_INFO_MOBILE_TEXTBOX_XPATH);
    }

    public String check_Email_Address_Label() {
        seleniumBase.checkElementIsDisplayed(EDIT_EMPLOYEE_INFO_EMAIL_LABEL_XPATH);
        return seleniumBase.getText(EDIT_EMPLOYEE_INFO_EMAIL_LABEL_CSS, EDIT_EMPLOYEE_INFO_EMAIL_LABEL_XPATH);
    }

    public void check_Email_Address_TextBox() {
        seleniumBase.checkElementIsDisplayed(EDIT_EMPLOYEE_INFO_EMAIL_TEXTBOX_XPATH);
    }

    public String check_Employee_Profile_Image_Label() {
        seleniumBase.checkElementIsDisplayed(EDIT_EMPLOYEE_INFO_EMP_PROFILE_IMG_LABEL_XPATH);
        return seleniumBase.getText(EDIT_EMPLOYEE_INFO_EMP_PROFILE_IMG_LABEL_CSS, EDIT_EMPLOYEE_INFO_EMP_PROFILE_IMG_LABEL_XPATH);
    }

    public String check_Browse_Button() {
        seleniumBase.checkElementIsDisplayed(EDIT_EMPLOYEE_INFO_BROWSE_BUTTON_XPATH);
        return seleniumBase.getText(EDIT_EMPLOYEE_INFO_BROWSE_BUTTON_CSS, EDIT_EMPLOYEE_INFO_BROWSE_BUTTON_XPATH);
    }

    public String check_Save_Button() {
        seleniumBase.checkElementIsDisplayed(EDIT_EMPLOYEE_INFO_SAVE_BUTTON_XPATH);
        return seleniumBase.getText(EDIT_EMPLOYEE_INFO_SAVE_BUTTON_CSS, EDIT_EMPLOYEE_INFO_SAVE_BUTTON_XPATH);
    }

    public String check_Close_Button() {
        seleniumBase.checkElementIsDisplayed(EDIT_EMPLOYEE_INFO_CLOSE_BUTTON_XPATH);
        return seleniumBase.getText(EDIT_EMPLOYEE_INFO_CLOSE_BUTTON_CSS, EDIT_EMPLOYEE_INFO_CLOSE_BUTTON_XPATH);
    }

    public void check_Close_Icon() {
        seleniumBase.checkElementIsDisplayed(EDIT_EMPLOYEE_INFO_CLOSE_ICON_XPATH);
    }


    public String check_And_Validate_Company_Name_Is_Required_When_Editing_Employee() throws InterruptedException {
        Thread.sleep(2000);
        seleniumBase.click(EDIT_EMPLOYEE_INFO_COMPANY_NAME_DD_CLEAR_ICON_XPATH,EDIT_EMPLOYEE_INFO_COMPANY_NAME_DD_CLEAR_ICON_CSS);
        seleniumBase.click(EDIT_EMPLOYEE_INFO_SAVE_BUTTON_XPATH,EDIT_EMPLOYEE_INFO_SAVE_BUTTON_CSS);
        return seleniumBase.getText(EDIT_EMPLOYEE_INFO_COMPANY_NAME_REQUIRED_MSG_CSS,EDIT_EMPLOYEE_INFO_COMPANY_NAME_REQUIRED_MSG_XPATH);
    }

    public String check_And_Validate_Company_Branch_Name_Is_Required_When_Editing_Employee() throws InterruptedException {
        Thread.sleep(2000);
        seleniumBase.click(EDIT_EMPLOYEE_INFO_SAVE_BUTTON_XPATH,EDIT_EMPLOYEE_INFO_SAVE_BUTTON_CSS);
        return seleniumBase.getText(EDIT_EMPLOYEE_INFO_COMPANY_BRANCH_NAME_REQUIRED_MSG_CSS,EDIT_EMPLOYEE_INFO_COMPANY_BRANCH_NAME_REQUIRED_MSG_XPATH);
    }

    public String check_And_Validate_Department_Name_Is_Required_When_Editing_Employee() throws InterruptedException {
        Thread.sleep(2000);
        seleniumBase.click(EDIT_EMPLOYEE_INFO_SAVE_BUTTON_XPATH,EDIT_EMPLOYEE_INFO_SAVE_BUTTON_CSS);
        return seleniumBase.getText(EDIT_EMPLOYEE_INFO_DEPARTMENT_NAME_REQUIRED_MSG_CSS,EDIT_EMPLOYEE_INFO_DEPARTMENT_NAME_REQUIRED_MSG_XPATH);
    }

    public String check_And_Validate_Designation_Name_Is_Required_When_Editing_Employee() throws InterruptedException {
        Thread.sleep(2000);
        seleniumBase.click(EDIT_EMPLOYEE_INFO_SAVE_BUTTON_XPATH,EDIT_EMPLOYEE_INFO_SAVE_BUTTON_CSS);
        return seleniumBase.getText(EDIT_EMPLOYEE_INFO_DESIGNATION_NAME_REQUIRED_MSG_CSS,EDIT_EMPLOYEE_INFO_DESIGNATION_NAME_REQUIRED_MSG_XPATH);
    }

    public String check_And_Validate_Employee_Number_Is_Required_When_Editing_Employee() throws InterruptedException {
        Thread.sleep(2000);
        seleniumBase.clear_Data_Feilds(EDIT_EMPLOYEE_INFO_EMPLOYEE_NUMBER_TEXTBOX_XPATH);
        seleniumBase.click(EDIT_EMPLOYEE_INFO_SAVE_BUTTON_XPATH,EDIT_EMPLOYEE_INFO_SAVE_BUTTON_CSS);
        return seleniumBase.getText(EDIT_EMPLOYEE_INFO_EMPLOYEE_NUMBER_REQUIRED_MSG_CSS,EDIT_EMPLOYEE_INFO_EMPLOYEE_NUMBER_REQUIRED_MSG_XPATH);
    }

    public String check_And_Validate_First_Name_Is_Required_When_Editing_Employee() throws InterruptedException {
        Thread.sleep(2000);
        seleniumBase.clear_Data_Feilds(EDIT_EMPLOYEE_INFO_FIRST_NAME_TEXTBOX_XPATH);
        seleniumBase.click(EDIT_EMPLOYEE_INFO_SAVE_BUTTON_XPATH,EDIT_EMPLOYEE_INFO_SAVE_BUTTON_CSS);
        return seleniumBase.getText(EDIT_EMPLOYEE_INFO_FIRST_NAME_REQUIRED_MSG_CSS,EDIT_EMPLOYEE_INFO_FIRST_NAME_REQUIRED_MSG_XPATH);
    }

    public String check_And_Validate_Calling_Name_Is_Required_When_Editing_Employee() throws InterruptedException {
        Thread.sleep(2000);
        seleniumBase.clear_Data_Feilds(EDIT_EMPLOYEE_INFO_CALLING_NAME_TEXTBOX_XPATH);
        seleniumBase.click(EDIT_EMPLOYEE_INFO_SAVE_BUTTON_XPATH,EDIT_EMPLOYEE_INFO_SAVE_BUTTON_CSS);
        return seleniumBase.getText(EDIT_EMPLOYEE_INFO_CALLING_NAME_REQUIRED_MSG_CSS,EDIT_EMPLOYEE_INFO_CALLING_NAME_REQUIRED_MSG_XPATH);
    }

    public String check_And_Validate_Mobile_Is_Required_When_Editing_Employee() throws InterruptedException {
        Thread.sleep(2000);
        seleniumBase.clear_Data_Feilds(EDIT_EMPLOYEE_INFO_MOBILE_TEXTBOX_XPATH);
        seleniumBase.click(EDIT_EMPLOYEE_INFO_SAVE_BUTTON_XPATH,EDIT_EMPLOYEE_INFO_SAVE_BUTTON_CSS);
        return seleniumBase.getText(EDIT_EMPLOYEE_INFO_MOBILE_REQUIRED_MSG_CSS,EDIT_EMPLOYEE_INFO_MOBILE_REQUIRED_MSG_XPATH);
    }

    public String check_And_Validate_Email_Is_Required_When_Editing_Employee() throws InterruptedException {
        Thread.sleep(2000);
        seleniumBase.clear_Data_Feilds(EDIT_EMPLOYEE_INFO_EMAIL_TEXTBOX_XPATH);
        seleniumBase.click(EDIT_EMPLOYEE_INFO_SAVE_BUTTON_XPATH,EDIT_EMPLOYEE_INFO_SAVE_BUTTON_CSS);
        return seleniumBase.getText(EDIT_EMPLOYEE_INFO_EMPLOYEE_NAME_REQUIRED_MSG_CSS,EDIT_EMPLOYEE_INFO_EMPLOYEE_NAME_REQUIRED_MSG_XPATH);
    }

    public void step_Edit_Employee(String companyName, String email) throws InterruptedException {
        Thread.sleep(3000);
        seleniumBase.click(EDIT_EMPLOYEE_INFO_COMPANY_NAME_DD_XPATH,EDIT_EMPLOYEE_INFO_COMPANY_NAME_DD_CSS);
        seleniumBase.setdropdownValues("AccountIdEdit",companyName);
        seleniumBase.clear_Data_Feilds(EDIT_EMPLOYEE_INFO_EMAIL_TEXTBOX_XPATH);
        seleniumBase.type(EDIT_EMPLOYEE_INFO_EMAIL_TEXTBOX_CSS,EDIT_EMPLOYEE_INFO_EMAIL_TEXTBOX_XPATH,email);
        seleniumBase.click(EDIT_EMPLOYEE_INFO_SAVE_BUTTON_XPATH,EDIT_EMPLOYEE_INFO_SAVE_BUTTON_CSS);
    }

    public void step_Edit_Employee_Details(String companyName, /*String companyBranchName, String deptName, String designationName,*/ String title, String empNumber, String fName, String mName, String lName ,String cName, String mobile, String email) throws InterruptedException {
        Thread.sleep(2000);
        seleniumBase.click(EDIT_EMPLOYEE_INFO_COMPANY_NAME_DD_XPATH,EDIT_EMPLOYEE_INFO_COMPANY_NAME_DD_CSS);
        seleniumBase.setdropdownValues("AccountIdCreate",companyName);

        //Then use the auto select values from other dropdowns

        /*seleniumBase.click(EDIT_EMPLOYEE_INFO_COMPANY_BRANCH_NAME_DD_XPATH,EDIT_EMPLOYEE_INFO_COMPANY_BRANCH_NAME_DD_CSS);
        seleniumBase.setdropdownValues("AccountBranchIdCreate",companyBranchName);
        seleniumBase.click(EDIT_EMPLOYEE_INFO_DEPARTMENT_NAME_DD_XPATH,EDIT_EMPLOYEE_INFO_DEPARTMENT_NAME_DD_CSS);
        seleniumBase.setdropdownValues("DepartmentIdCreate",deptName);
        seleniumBase.click(EDIT_EMPLOYEE_INFO_DESIGNATION_NAME_DD_XPATH,EDIT_EMPLOYEE_INFO_DESIGNATION_NAME_DD_XPATH);
        seleniumBase.setdropdownValues("DesignationIdCreate",designationName);*/

        //seleniumBase.click(".//input[@type='radio'][@value[contains(., 'Mrs')]]","");
        seleniumBase.selectByVisibleText(EDIT_EMPLOYEE_INFO_PERSONAL_TITLE_RADIO_OPTION_CSS,EDIT_EMPLOYEE_INFO_PERSONAL_TITLE_RADIO_OPTION_XPATH, title);
        seleniumBase.type(EDIT_EMPLOYEE_INFO_EMPLOYEE_NUMBER_TEXTBOX_CSS,EDIT_EMPLOYEE_INFO_EMPLOYEE_NAME_TEXTBOX_XPATH,empNumber);
        seleniumBase.type(EDIT_EMPLOYEE_INFO_FIRST_NAME_TEXTBOX_CSS, EDIT_EMPLOYEE_INFO_FIRST_NAME_TEXTBOX_XPATH,fName);
        seleniumBase.type(EDIT_EMPLOYEE_INFO_MIDDLE_NAME_TEXTBOX_XPATH,EDIT_EMPLOYEE_INFO_MIDDLE_NAME_TEXTBOX_XPATH,mName);
        seleniumBase.type(EDIT_EMPLOYEE_INFO_LAST_NAME_TEXTBOX_CSS,EDIT_EMPLOYEE_INFO_LAST_NAME_TEXTBOX_XPATH,lName);
        seleniumBase.type(EDIT_EMPLOYEE_INFO_CALLING_NAME_TEXTBOX_XPATH,EDIT_EMPLOYEE_INFO_CALLING_NAME_TEXTBOX_XPATH
                ,cName);
        seleniumBase.type(EDIT_EMPLOYEE_INFO_MOBILE_TEXTBOX_CSS,EDIT_EMPLOYEE_INFO_MOBILE_TEXTBOX_XPATH,mobile);
        seleniumBase.type(EDIT_EMPLOYEE_INFO_EMAIL_TEXTBOX_CSS,EDIT_EMPLOYEE_INFO_EMAIL_TEXTBOX_XPATH,email);

        seleniumBase.click(EDIT_EMPLOYEE_INFO_SAVE_BUTTON_XPATH,EDIT_EMPLOYEE_INFO_SAVE_BUTTON_CSS);
        Thread.sleep(1000);
    }

    public String check_And_Validate_Duplicate_Employee_Error_Message() throws InterruptedException {
        Thread.sleep(5000);
        String MsgTitle = seleniumBase.getText(By.xpath(EDIT_DUPLICATE_EMPLOYEE_ERROR_MSG_TITLE_XPATH));
        String Msg = seleniumBase.getText(By.xpath(EDIT_DUPLICATE_EMPLOYEE_ERROR_MSG_XPATH));

        String Message = MsgTitle + " " + Msg;

        System.out.println("Title ="+ MsgTitle);
        System.out.println("Msg ="+ Msg);

        return Message;
    }

    public String check_And_Validate_Edit_Employee_Success_Message() throws InterruptedException {
        Thread.sleep(1500);
        String MsgTitle = seleniumBase.getText(By.xpath(EDIT_EMPLOYEE_SUCCESS_MSG_TITLE_XPATH));
        String Msg = seleniumBase.getText(By.xpath(EDIT_EMPLOYEE_SUCCESS_MSG_XPATH));

        String Message = MsgTitle + " " + Msg;

        System.out.println("Title ="+ MsgTitle);
        System.out.println("Msg ="+ Msg);

        return Message;
    }

    public boolean check_And_Validate_Close_The_Popup_By_Clicking_On_Close_Button() throws InterruptedException {
        Thread.sleep(2000);
        seleniumBase.click(EDIT_EMPLOYEE_INFO_CLOSE_BUTTON_XPATH,EDIT_EMPLOYEE_INFO_CLOSE_BUTTON_CSS);
        Thread.sleep(5000);
        return seleniumBase.checkElementPresent("//*[@style=\"display: block;\"]");
    }

    public boolean check_And_Validate_Close_The_Popup_By_Clicking_On_Close_Icon() throws InterruptedException {
        Thread.sleep(2000);
        seleniumBase.click(EDIT_EMPLOYEE_INFO_CLOSE_ICON_XPATH,EDIT_EMPLOYEE_INFO_CLOSE_ICON_CSS);
        Thread.sleep(5000);
        return seleniumBase.checkElementPresent("//*[@style=\"display: block;\"]");
    }
}



