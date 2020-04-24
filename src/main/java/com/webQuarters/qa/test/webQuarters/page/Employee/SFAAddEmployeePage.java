package com.webQuarters.qa.test.webQuarters.page.Employee;


import com.webQuarters.qa.automation.SeleniumBase;
import com.webQuarters.qa.data.UI.elements.webQuarters.elements.Employee.sfaAddEmployeePage;
import com.webQuarters.qa.data.UI.elements.webQuarters.elements.Employee.sfaEmployeePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by e.koshila on 4/20/2020.
 */

public class SFAAddEmployeePage implements sfaEmployeePage, sfaAddEmployeePage {

    SeleniumBase seleniumBase;

    public SFAAddEmployeePage(WebDriver driver) {
        seleniumBase = new SeleniumBase(driver);
    }

    //Check UI view of the Employee page

    //Popup title
    public String check_Popup_Title() {
        seleniumBase.checkElementIsDisplayed(ADD_NEW_EMPLOYEE_INFO_POPUP_TITLE_XPATH);
        return seleniumBase.getText(ADD_NEW_EMPLOYEE_INFO_POPUP_TITLE_CSS, ADD_NEW_EMPLOYEE_INFO_POPUP_TITLE_XPATH);
    }

    public String check_Company_Name_Label() {
        seleniumBase.checkElementIsDisplayed(ADD_NEW_EMPLOYEE_INFO_COMPANY_NAME_LABEL_XPATH);
        return seleniumBase.getText(ADD_NEW_EMPLOYEE_INFO_COMPANY_NAME_LABEL_CSS, ADD_NEW_EMPLOYEE_INFO_COMPANY_NAME_LABEL_XPATH);
    }

    public void check_Company_Name_DropDown() {
        seleniumBase.checkElementIsDisplayed(ADD_NEW_EMPLOYEE_INFO_COMPANY_NAME_DD_XPATH);
    }

    public String check_Company_Branch_Name_Label() {
        seleniumBase.checkElementIsDisplayed(ADD_NEW_EMPLOYEE_INFO_COMPANY_BRANCH_NAME_LABEL_XPATH);
        return seleniumBase.getText(ADD_NEW_EMPLOYEE_INFO_COMPANY_BRANCH_NAME_LABEL_CSS, ADD_NEW_EMPLOYEE_INFO_COMPANY_BRANCH_NAME_LABEL_XPATH);
    }

    public void check_Company_Branch_Name_Dropdown() {
        seleniumBase.checkElementIsDisplayed(ADD_NEW_EMPLOYEE_INFO_COMPANY_BRANCH_NAME_DD_XPATH);
    }

    public String check_Department_Name_Label() {
        seleniumBase.checkElementIsDisplayed(ADD_NEW_EMPLOYEE_INFO_DEPARTMENT_NAME_LABEL_XPATH);
        return seleniumBase.getText(ADD_NEW_EMPLOYEE_INFO_DEPARTMENT_NAME_LABEL_CSS, ADD_NEW_EMPLOYEE_INFO_DEPARTMENT_NAME_LABEL_XPATH);
    }

    public void check_Department_Dropdown() {
        seleniumBase.checkElementIsDisplayed(ADD_NEW_EMPLOYEE_INFO_DEPARTMENT_NAME_DD_XPATH);
    }

    public String check_Designation_Name_Label() {
        seleniumBase.checkElementIsDisplayed(ADD_NEW_EMPLOYEE_INFO_DESIGNATION_NAME_LABEL_XPATH);
        return seleniumBase.getText(ADD_NEW_EMPLOYEE_INFO_DESIGNATION_NAME_LABEL_CSS, ADD_NEW_EMPLOYEE_INFO_DESIGNATION_NAME_LABEL_XPATH);
    }

    public void check_Designation_Dropdown() {
        seleniumBase.checkElementIsDisplayed(ADD_NEW_EMPLOYEE_INFO_DESIGNATION_NAME_DD_XPATH);
    }

    public String check_Title_Name_Label() {
        seleniumBase.checkElementIsDisplayed(ADD_NEW_EMPLOYEE_INFO_TITLE_LABEL_XPATH);
        return seleniumBase.getText(ADD_NEW_EMPLOYEE_INFO_TITLE_LABEL_CSS, ADD_NEW_EMPLOYEE_INFO_TITLE_LABEL_XPATH);
    }

    public String check_Personal_Title_Radio_Options() {
        seleniumBase.checkElementIsDisplayed(ADD_NEW_EMPLOYEE_INFO_PERSONAL_TITLE_RADIO_OPTION_XPATH);
        return seleniumBase.getText(ADD_NEW_EMPLOYEE_INFO_PERSONAL_TITLE_RADIO_OPTION_CSS, ADD_NEW_EMPLOYEE_INFO_PERSONAL_TITLE_RADIO_OPTION_XPATH);
    }

    public String check_Employee_Number_Label() {
        seleniumBase.checkElementIsDisplayed(ADD_NEW_EMPLOYEE_INFO_EMPLOYEE_NUMBER_LABEL_XPATH);
        return seleniumBase.getText(ADD_NEW_EMPLOYEE_INFO_EMPLOYEE_NUMBER_LABEL_CSS, ADD_NEW_EMPLOYEE_INFO_EMPLOYEE_NUMBER_LABEL_XPATH);
    }

    public void check_Employee_Number_TextBox() {
        seleniumBase.checkElementIsDisplayed(ADD_NEW_EMPLOYEE_INFO_EMPLOYEE_NUMBER_TEXTBOX_XPATH);
    }

    public String check_First_Name_Label() {
        seleniumBase.checkElementIsDisplayed(ADD_NEW_EMPLOYEE_INFO_FIRST_NAME_LABEL_XPATH);
        return seleniumBase.getText(ADD_NEW_EMPLOYEE_INFO_FIRST_NAME_LABEL_CSS, ADD_NEW_EMPLOYEE_INFO_FIRST_NAME_LABEL_XPATH);
    }

    public void check_First_Name_TextBox() {
        seleniumBase.checkElementIsDisplayed(ADD_NEW_EMPLOYEE_INFO_FIRST_NAME_TEXTBOX_XPATH);
    }

    public String check_Middle_Name_Label() {
        seleniumBase.checkElementIsDisplayed(ADD_NEW_EMPLOYEE_INFO_MIDDLE_NAME_LABEL_XPATH);
        return seleniumBase.getText(ADD_NEW_EMPLOYEE_INFO_MIDDLE_NAME_LABEL_CSS, ADD_NEW_EMPLOYEE_INFO_MIDDLE_NAME_LABEL_XPATH);
    }

    public void check_Middle_Name_TextBox() {
        seleniumBase.checkElementIsDisplayed(ADD_NEW_EMPLOYEE_INFO_MIDDLE_NAME_TEXTBOX_XPATH);
    }

    public String check_Last_Name_Label() {
        seleniumBase.checkElementIsDisplayed(ADD_NEW_EMPLOYEE_INFO_LAST_NAME_LABEL_XPATH);
        return seleniumBase.getText(ADD_NEW_EMPLOYEE_INFO_LAST_NAME_LABEL_CSS, ADD_NEW_EMPLOYEE_INFO_LAST_NAME_LABEL_XPATH);
    }

    public void check_Last_Name_TextBox() {
        seleniumBase.checkElementIsDisplayed(ADD_NEW_EMPLOYEE_INFO_LAST_NAME_TEXTBOX_XPATH);
    }

    public String check_Calling_Name_Label() {
        seleniumBase.checkElementIsDisplayed(ADD_NEW_EMPLOYEE_INFO_CALLING_NAME_LABEL_XPATH);
        return seleniumBase.getText(ADD_NEW_EMPLOYEE_INFO_CALLING_NAME_LABEL_CSS, ADD_NEW_EMPLOYEE_INFO_CALLING_NAME_LABEL_XPATH);
    }

    public void check_Calling_Name_TextBox() {
        seleniumBase.checkElementIsDisplayed(ADD_NEW_EMPLOYEE_INFO_CALLING_NAME_TEXTBOX_XPATH);
    }

    public String check_Mobile_Label() {
        seleniumBase.checkElementIsDisplayed(ADD_NEW_EMPLOYEE_INFO_MOBILE_LABEL_XPATH);
        return seleniumBase.getText(ADD_NEW_EMPLOYEE_INFO_MOBILE_LABEL_CSS, ADD_NEW_EMPLOYEE_INFO_MOBILE_LABEL_XPATH);
    }

    public void check_Mobile_TextBox() {
        seleniumBase.checkElementIsDisplayed(ADD_NEW_EMPLOYEE_INFO_MOBILE_TEXTBOX_XPATH);
    }

    public String check_Email_Address_Label() {
        seleniumBase.checkElementIsDisplayed(ADD_NEW_EMPLOYEE_INFO_EMAIL_LABEL_XPATH);
        return seleniumBase.getText(ADD_NEW_EMPLOYEE_INFO_EMAIL_LABEL_CSS, ADD_NEW_EMPLOYEE_INFO_EMAIL_LABEL_XPATH);
    }

    public void check_Email_Address_TextBox() {
        seleniumBase.checkElementIsDisplayed(ADD_NEW_EMPLOYEE_INFO_EMAIL_TEXTBOX_XPATH);
    }

    public String check_Employee_Profile_Image_Label() {
        seleniumBase.checkElementIsDisplayed(ADD_NEW_EMPLOYEE_INFO_EMP_PROFILE_IMG_LABEL_XPATH);
        return seleniumBase.getText(ADD_NEW_EMPLOYEE_INFO_EMP_PROFILE_IMG_LABEL_CSS, ADD_NEW_EMPLOYEE_INFO_EMP_PROFILE_IMG_LABEL_XPATH);
    }

    public String check_Browse_Button() {
        seleniumBase.checkElementIsDisplayed(ADD_NEW_EMPLOYEE_INFO_BROWSE_BUTTON_XPATH);
        return seleniumBase.getText(ADD_NEW_EMPLOYEE_INFO_BROWSE_BUTTON_CSS, ADD_NEW_EMPLOYEE_INFO_BROWSE_BUTTON_XPATH);
    }

    public String check_Save_Button() {
        seleniumBase.checkElementIsDisplayed(ADD_NEW_EMPLOYEE_INFO_SAVE_BUTTON_XPATH);
        return seleniumBase.getText(ADD_NEW_EMPLOYEE_INFO_SAVE_BUTTON_CSS, ADD_NEW_EMPLOYEE_INFO_SAVE_BUTTON_XPATH);
    }

    public String check_Close_Button() {
        seleniumBase.checkElementIsDisplayed(ADD_NEW_EMPLOYEE_INFO_CLOSE_BUTTON_XPATH);
        return seleniumBase.getText(ADD_NEW_EMPLOYEE_INFO_CLOSE_BUTTON_CSS, ADD_NEW_EMPLOYEE_INFO_CLOSE_BUTTON_XPATH);
    }

    public void check_Close_Icon() {
        seleniumBase.checkElementIsDisplayed(ADD_NEW_EMPLOYEE_INFO_CLOSE_ICON_XPATH);
    }

    //Functional

    public String create_Random_Employee_Email_Address(String EmailDomainName) {
        return seleniumBase.createRandomEmail(EmailDomainName);
    }

    public String create_Random_Employee_Records() {
        return Integer.toString(seleniumBase.createRandomInt());
    }

    public void check_And_Validate_Navigation_To_Add_New_Employee_Info_Popup() throws InterruptedException {
        Thread.sleep(5000);
        seleniumBase.checkElementIsDisplayed(ADD_NEW_EMPLOYEE_INFO_POPUP_XPATH);
    }

    public String check_And_Validate_Company_Name_Is_Required_When_Adding_New_Employee() throws InterruptedException {
        Thread.sleep(5000);
        seleniumBase.click(ADD_NEW_EMPLOYEE_INFO_COMPANY_NAME_DD_CLEAR_ICON_XPATH,ADD_NEW_EMPLOYEE_INFO_COMPANY_NAME_DD_CLEAR_ICON_CSS);
        Thread.sleep(2000);
        seleniumBase.click(ADD_NEW_EMPLOYEE_INFO_SAVE_BUTTON_XPATH,ADD_NEW_EMPLOYEE_INFO_SAVE_BUTTON_CSS);
        return seleniumBase.getText(ADD_NEW_EMPLOYEE_INFO_COMPANY_NAME_REQUIRED_MSG_CSS,ADD_NEW_EMPLOYEE_INFO_COMPANY_NAME_REQUIRED_MSG_XPATH);
    }

    public String check_And_Validate_Company_Branch_Name_Is_Required_When_Adding_New_Employee() throws InterruptedException {
        Thread.sleep(2000);
        seleniumBase.click(ADD_NEW_EMPLOYEE_INFO_SAVE_BUTTON_XPATH,ADD_NEW_EMPLOYEE_INFO_SAVE_BUTTON_CSS);
        return seleniumBase.getText(ADD_NEW_EMPLOYEE_INFO_COMPANY_BRANCH_NAME_REQUIRED_MSG_CSS,ADD_NEW_EMPLOYEE_INFO_COMPANY_BRANCH_NAME_REQUIRED_MSG_XPATH);
    }

    public String check_And_Validate_Department_Name_Is_Required_When_Adding_New_Employee() throws InterruptedException {
        Thread.sleep(2000);
        seleniumBase.click(ADD_NEW_EMPLOYEE_INFO_SAVE_BUTTON_XPATH,ADD_NEW_EMPLOYEE_INFO_SAVE_BUTTON_CSS);
        return seleniumBase.getText(ADD_NEW_EMPLOYEE_INFO_DEPARTMENT_NAME_REQUIRED_MSG_CSS,ADD_NEW_EMPLOYEE_INFO_DEPARTMENT_NAME_REQUIRED_MSG_XPATH);
    }

    public String check_And_Validate_Designation_Name_Is_Required_When_Adding_New_Employee() throws InterruptedException {
        Thread.sleep(2000);
        seleniumBase.click(ADD_NEW_EMPLOYEE_INFO_SAVE_BUTTON_XPATH,ADD_NEW_EMPLOYEE_INFO_SAVE_BUTTON_CSS);
        return seleniumBase.getText(ADD_NEW_EMPLOYEE_INFO_DESIGNATION_NAME_REQUIRED_MSG_CSS,ADD_NEW_EMPLOYEE_INFO_DESIGNATION_NAME_REQUIRED_MSG_XPATH);
    }

    public String check_And_Validate_Employee_Number_Is_Required_When_Adding_New_Employee() throws InterruptedException {
        Thread.sleep(2000);
        seleniumBase.click(ADD_NEW_EMPLOYEE_INFO_SAVE_BUTTON_XPATH,ADD_NEW_EMPLOYEE_INFO_SAVE_BUTTON_CSS);
        return seleniumBase.getText(ADD_NEW_EMPLOYEE_INFO_EMPLOYEE_NUMBER_REQUIRED_MSG_CSS,ADD_NEW_EMPLOYEE_INFO_EMPLOYEE_NUMBER_REQUIRED_MSG_XPATH);
    }

    public String check_And_Validate_First_Name_Is_Required_When_Adding_New_Employee() throws InterruptedException {
        Thread.sleep(2000);
        seleniumBase.click(ADD_NEW_EMPLOYEE_INFO_SAVE_BUTTON_XPATH,ADD_NEW_EMPLOYEE_INFO_SAVE_BUTTON_CSS);
        return seleniumBase.getText(ADD_NEW_EMPLOYEE_INFO_FIRST_NAME_REQUIRED_MSG_CSS,ADD_NEW_EMPLOYEE_INFO_FIRST_NAME_REQUIRED_MSG_XPATH);
    }

    public String check_And_Validate_Calling_Name_Is_Required_When_Adding_New_Employee() throws InterruptedException {
        Thread.sleep(2000);
        seleniumBase.click(ADD_NEW_EMPLOYEE_INFO_SAVE_BUTTON_XPATH,ADD_NEW_EMPLOYEE_INFO_SAVE_BUTTON_CSS);
        return seleniumBase.getText(ADD_NEW_EMPLOYEE_INFO_CALLING_NAME_REQUIRED_MSG_CSS,ADD_NEW_EMPLOYEE_INFO_CALLING_NAME_REQUIRED_MSG_XPATH);
    }

    public String check_And_Validate_Mobile_Is_Required_When_Adding_New_Employee() throws InterruptedException {
        Thread.sleep(2000);
        seleniumBase.click(ADD_NEW_EMPLOYEE_INFO_SAVE_BUTTON_XPATH,ADD_NEW_EMPLOYEE_INFO_SAVE_BUTTON_CSS);
        return seleniumBase.getText(ADD_NEW_EMPLOYEE_INFO_MOBILE_REQUIRED_MSG_CSS,ADD_NEW_EMPLOYEE_INFO_MOBILE_REQUIRED_MSG_XPATH);
    }

    public String check_And_Validate_Email_Is_Required_When_Adding_New_Employee() throws InterruptedException {
        Thread.sleep(2000);
        seleniumBase.click(ADD_NEW_EMPLOYEE_INFO_SAVE_BUTTON_XPATH,ADD_NEW_EMPLOYEE_INFO_SAVE_BUTTON_CSS);
        return seleniumBase.getText(ADD_NEW_EMPLOYEE_INFO_EMAIL_REQUIRED_MSG_CSS,ADD_NEW_EMPLOYEE_INFO_EMAIL_REQUIRED_MSG_XPATH);
    }

    public void step_Add_New_Employee(String companyName, /*String companyBranchName, String deptName, String designationName,*/ String title, String empNumber, String fName, String mName, String lName ,String cName, String mobile, String email) throws InterruptedException {
        Thread.sleep(2000);
        seleniumBase.click(ADD_NEW_EMPLOYEE_INFO_COMPANY_NAME_DD_XPATH,ADD_NEW_EMPLOYEE_INFO_COMPANY_NAME_DD_CSS);
        seleniumBase.setdropdownValues("AccountIdCreate",companyName);

        //Then use the auto select values from other dropdowns

        /*seleniumBase.click(ADD_NEW_EMPLOYEE_INFO_COMPANY_BRANCH_NAME_DD_XPATH,ADD_NEW_EMPLOYEE_INFO_COMPANY_BRANCH_NAME_DD_CSS);
        seleniumBase.setdropdownValues("AccountBranchIdCreate",companyBranchName);
        seleniumBase.click(ADD_NEW_EMPLOYEE_INFO_DEPARTMENT_NAME_DD_XPATH,ADD_NEW_EMPLOYEE_INFO_DEPARTMENT_NAME_DD_CSS);
        seleniumBase.setdropdownValues("DepartmentIdCreate",deptName);
        seleniumBase.click(ADD_NEW_EMPLOYEE_INFO_DESIGNATION_NAME_DD_XPATH,ADD_NEW_EMPLOYEE_INFO_DESIGNATION_NAME_DD_XPATH);
        seleniumBase.setdropdownValues("DesignationIdCreate",designationName);*/

        //seleniumBase.click(".//input[@type='radio'][@value[contains(., 'Mrs')]]","");
        seleniumBase.selectByVisibleText(ADD_NEW_EMPLOYEE_INFO_PERSONAL_TITLE_RADIO_OPTION_CSS,ADD_NEW_EMPLOYEE_INFO_PERSONAL_TITLE_RADIO_OPTION_XPATH, title);
        seleniumBase.type(ADD_NEW_EMPLOYEE_INFO_EMPLOYEE_NUMBER_TEXTBOX_CSS,ADD_NEW_EMPLOYEE_INFO_EMPLOYEE_NAME_TEXTBOX_XPATH,empNumber);
        seleniumBase.type(ADD_NEW_EMPLOYEE_INFO_FIRST_NAME_TEXTBOX_CSS, ADD_NEW_EMPLOYEE_INFO_FIRST_NAME_TEXTBOX_XPATH,fName);
        seleniumBase.type(ADD_NEW_EMPLOYEE_INFO_MIDDLE_NAME_TEXTBOX_XPATH,ADD_NEW_EMPLOYEE_INFO_MIDDLE_NAME_TEXTBOX_XPATH,mName);
        seleniumBase.type(ADD_NEW_EMPLOYEE_INFO_LAST_NAME_TEXTBOX_CSS,ADD_NEW_EMPLOYEE_INFO_LAST_NAME_TEXTBOX_XPATH,lName);
        seleniumBase.type(ADD_NEW_EMPLOYEE_INFO_CALLING_NAME_TEXTBOX_XPATH,ADD_NEW_EMPLOYEE_INFO_CALLING_NAME_TEXTBOX_XPATH
                ,cName);
        seleniumBase.type(ADD_NEW_EMPLOYEE_INFO_MOBILE_TEXTBOX_CSS,ADD_NEW_EMPLOYEE_INFO_MOBILE_TEXTBOX_XPATH,mobile);
        seleniumBase.type(ADD_NEW_EMPLOYEE_INFO_EMAIL_TEXTBOX_CSS,ADD_NEW_EMPLOYEE_INFO_EMAIL_TEXTBOX_XPATH,email);

        seleniumBase.click(ADD_NEW_EMPLOYEE_INFO_SAVE_BUTTON_XPATH,ADD_NEW_EMPLOYEE_INFO_SAVE_BUTTON_CSS);
        Thread.sleep(1000);
    }

    public String check_And_Validate_Add_Employee_Success_Message() throws InterruptedException {
        String MsgTitle = seleniumBase.getText(By.xpath(ADD_EMPLOYEE_SUCCESS_MSG_TITLE_XPATH));
        String Msg = seleniumBase.getText(By.xpath(ADD_EMPLOYEE_SUCCESS_MSG_XPATH));

        String Message = MsgTitle + " " + Msg;

        System.out.println("Title ="+ MsgTitle);
        System.out.println("Msg ="+ Msg);

        return Message;
    }

    public boolean check_And_Validate_Close_The_Popup_By_Clicking_On_Close_Button() throws InterruptedException {
        Thread.sleep(3000);
        seleniumBase.click(ADD_NEW_EMPLOYEE_INFO_CLOSE_BUTTON_XPATH,ADD_NEW_EMPLOYEE_INFO_CLOSE_BUTTON_CSS);
        Thread.sleep(5000);
        return seleniumBase.checkElementPresent("//div[contains(@style, \"display: block\")]");
    }

    public boolean check_And_Validate_Close_The_Popup_By_Clicking_On_Close_Icon() throws InterruptedException {
        Thread.sleep(2000);
        seleniumBase.click(ADD_NEW_EMPLOYEE_INFO_CLOSE_ICON_XPATH,ADD_NEW_EMPLOYEE_INFO_CLOSE_ICON_CSS);
        Thread.sleep(5000);
        return seleniumBase.checkElementPresent("//div[contains(@style, \"display: block\")]");
    }

    public String check_And_Validate_Duplicate_Employee_Error_Message() throws InterruptedException {
        Thread.sleep(5000);
        String MsgTitle = seleniumBase.getText(By.xpath(ADD_DUPLICATE_EMPLOYEE_ERROR_MSG_TITLE_XPATH));
        String Msg = seleniumBase.getText(By.xpath(ADD_DUPLICATE_EMPLOYEE_ERROR_MSG_XPATH));

        String Message = MsgTitle + " " + Msg;

        System.out.println("Title ="+ MsgTitle);
        System.out.println("Msg ="+ Msg);

        return Message;
    }

}



