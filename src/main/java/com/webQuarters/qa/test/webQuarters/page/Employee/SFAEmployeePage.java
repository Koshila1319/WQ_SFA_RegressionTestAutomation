package com.webQuarters.qa.test.webQuarters.page.Employee;


import com.webQuarters.qa.automation.SeleniumBase;
import com.webQuarters.qa.data.UI.elements.webQuarters.elements.Employee.sfaEmployeePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

/**
 * Created by e.koshila on 4/17/2020.
 */

public class SFAEmployeePage implements sfaEmployeePage {

    SeleniumBase seleniumBase;

    public SFAEmployeePage(WebDriver driver) {
        seleniumBase = new SeleniumBase(driver);
    }

    //Check UI view of the Employee page

    //Page title
    public String check_Employee_Page_Title() {
        seleniumBase.checkElementIsDisplayed(EMPLOYEE_PAGE_TITLE_XPATH);
        return seleniumBase.getText(EMPLOYEE_PAGE_TITLE_CSS, EMPLOYEE_PAGE_TITLE_XPATH);
    }

    //Breadcrumb
     public void check_Employee_Page_Breadcrumb_Is_Available() {
         seleniumBase.checkElementIsDisplayed(EMPLOYEE_PAGE_BREADCRUMB_XPATH);
     }

    //Add Employee button
     public void check_Add_New_Employee_Button_Is_Available() {
         seleniumBase.checkElementIsDisplayed(EMPLOYEE_PAGE_ADD_NEW_EMPLOYEE_ICON_XPATH);
     }

    //Advanced Search section

    public String check_Advance_Search_Section_Title() {
        seleniumBase.checkElementIsDisplayed(EMPLOYEE_PAGE_ADVANCED_SEARCH_SECTION_XPATH);
        return seleniumBase.getText(EMPLOYEE_PAGE_ADVANCED_SEARCH_SECTION_CSS, EMPLOYEE_PAGE_ADVANCED_SEARCH_SECTION_XPATH);
    }

    public String check_Advance_Search_Section_Company_Name_Label() {
        seleniumBase.checkElementIsDisplayed(EMPLOYEE_PAGE_ADVANCED_SEARCH_COMPANY_NAME_XPATH);
        return seleniumBase.getText(EMPLOYEE_PAGE_ADVANCED_SEARCH_COMPANY_NAME_CSS, EMPLOYEE_PAGE_ADVANCED_SEARCH_COMPANY_NAME_XPATH);
    }

    public void check_Advance_Search_Section_Company_Name_Dropdown() {
        seleniumBase.checkElementIsDisplayed(EMPLOYEE_PAGE_ADVANCED_SEARCH_COMPANY_NAME_DD_XPATH);
    }

    public void check_Advance_Search_Section_Company_Branch_Name_Dropdown() {
        seleniumBase.checkElementIsDisplayed(EMPLOYEE_PAGE_ADVANCED_SEARCH_COMPANY_BRANCH_NAME_DD_XPATH);
    }

    public String check_Advance_Search_Section_Department_Name_Label() {
        seleniumBase.checkElementIsDisplayed(EMPLOYEE_PAGE_ADVANCED_SEARCH_DEPARTMENT_NAME_XPATH);
        return seleniumBase.getText(EMPLOYEE_PAGE_ADVANCED_SEARCH_DEPARTMENT_NAME_CSS, EMPLOYEE_PAGE_ADVANCED_SEARCH_DEPARTMENT_NAME_XPATH);
    }

    public void check_Advance_Search_Section_Department_Name_Dropdown() {
        seleniumBase.checkElementIsDisplayed(EMPLOYEE_PAGE_ADVANCED_SEARCH_DEPARTMENT_NAME_DD_XPATH);
    }

    public String check_Advance_Search_Section_Designation_Label() {
        seleniumBase.checkElementIsDisplayed(EMPLOYEE_PAGE_ADVANCED_SEARCH_DESIGNATION_NAME_XPATH);
        return seleniumBase.getText(EMPLOYEE_PAGE_ADVANCED_SEARCH_DESIGNATION_NAME_CSS, EMPLOYEE_PAGE_ADVANCED_SEARCH_DESIGNATION_NAME_XPATH);
    }

    public void check_Advance_Search_Section_Designation_Dropdown() {
        seleniumBase.checkElementIsDisplayed(EMPLOYEE_PAGE_ADVANCED_SEARCH_DESIGNATION_NAME_DD_XPATH);
    }

    public String check_Advance_Search_Section_Employee_Name_Label() {
        seleniumBase.checkElementIsDisplayed(EMPLOYEE_PAGE_ADVANCED_SEARCH_EMPLOYEE_NAME_XPATH);
        return seleniumBase.getText(EMPLOYEE_PAGE_ADVANCED_SEARCH_EMPLOYEE_NAME_CSS, EMPLOYEE_PAGE_ADVANCED_SEARCH_EMPLOYEE_NAME_XPATH);
    }

    public void check_Advance_Search_Section_Employee_Name_TextBox() {
        seleniumBase.checkElementIsDisplayed(EMPLOYEE_PAGE_ADVANCED_SEARCH_EMPLOYEE_NAME_TEXTBOX_XPATH);
    }

    public String check_Reset_Button() {
        seleniumBase.checkElementIsDisplayed(EMPLOYEE_PAGE_RESET_BUTTON_XPATH);
        return seleniumBase.getText(EMPLOYEE_PAGE_RESET_BUTTON_CSS, EMPLOYEE_PAGE_RESET_BUTTON_XPATH);
    }

    public String check_Search_Button() {
        seleniumBase.checkElementIsDisplayed(EMPLOYEE_PAGE_SEARCH_BUTTON_XPATH);
        return seleniumBase.getText(EMPLOYEE_PAGE_SEARCH_BUTTON_CSS, EMPLOYEE_PAGE_SEARCH_BUTTON_XPATH);
    }

    //List of Employee section

    public String check_List_of_Employee_Section_Title() {
        seleniumBase.checkElementIsDisplayed(EMPLOYEE_PAGE_LIST_OF_EMPLOYEE_SECTION_XPATH);
        return seleniumBase.getText(EMPLOYEE_PAGE_LIST_OF_EMPLOYEE_SECTION_CSS, EMPLOYEE_PAGE_LIST_OF_EMPLOYEE_SECTION_XPATH);
    }

    public String check_Records_Per_Page_Section() {
        seleniumBase.checkElementIsDisplayed(EMPLOYEE_PAGE_RECORDS_PER_PAGE_XPATH);
        return seleniumBase.getText(EMPLOYEE_PAGE_RECORDS_PER_PAGE_CSS, EMPLOYEE_PAGE_RECORDS_PER_PAGE_XPATH);
    }

    public String check_Text_Based_Search_Section() {
        seleniumBase.checkElementIsDisplayed(EMPLOYEE_PAGE_TEXT_BASED_SEARCH_FIELD_XPATH);
        seleniumBase.checkElementIsDisplayed(EMPLOYEE_PAGE_TEXT_BASED_SEARCH_LABEL_XPATH);
        return seleniumBase.getText(EMPLOYEE_PAGE_TEXT_BASED_SEARCH_LABEL_CSS, EMPLOYEE_PAGE_TEXT_BASED_SEARCH_LABEL_XPATH);
    }

    public String check_Buttons_Section() {
        seleniumBase.checkElementIsDisplayed(EMPLOYEE_PAGE_BUTTONS_XPATH);
        return seleniumBase.getText(EMPLOYEE_PAGE_BUTTONS_CSS, EMPLOYEE_PAGE_BUTTONS_XPATH);
    }

    public void check_Data_Table_Is_Available() {
        seleniumBase.checkElementIsDisplayed(EMPLOYEE_PAGE_DATA_TABLE_XPATH);
    }

    public String check_Employee_Table_Columns() {
         seleniumBase.checkElementIsDisplayed(EMPLOYEE_PAGE_TABLE_COLUMNS_XPATH);
         return seleniumBase.getText(EMPLOYEE_PAGE_TABLE_COLUMNS_CSS,EMPLOYEE_PAGE_TABLE_COLUMNS_XPATH);
    }

    public String check_Nothing_Found_Text_In_Data_Table() {
         seleniumBase.checkElementIsDisplayed(EMPLOYEE_PAGE_TABLE_NOTHING_FOUND_TEXT_XPATH);
         return seleniumBase.getText(EMPLOYEE_PAGE_TABLE_NOTHING_FOUND_TEXT_CSS,EMPLOYEE_PAGE_TABLE_NOTHING_FOUND_TEXT_XPATH);
    }

    public String check_No_Records_Found_Text() {
         seleniumBase.checkElementIsDisplayed(EMPLOYEE_PAGE_TABLE_NO_RECORDS_FOUND_TEXT_XPATH);
         return seleniumBase.getText(EMPLOYEE_PAGE_TABLE_NO_RECORDS_FOUND_TEXT_CSS,EMPLOYEE_PAGE_TABLE_NO_RECORDS_FOUND_TEXT_XPATH);
    }

    public void check_Pagination_Section_Available() {
         seleniumBase.checkElementIsDisplayed(EMPLOYEE_PAGE_PAGINATION_SECTION_XPATH);
    }

    //Functional
    public boolean check_Pagination_Section_Is_Disabled_When_No_Data_In_Data_Table() {
        return seleniumBase.checkElementPresent(EMPLOYEE_PAGE_PAGINATION_PAGE_XPATH);
    }

    public void action_Click_On_Add_New_Employee_Button() throws InterruptedException {
        seleniumBase.click(EMPLOYEE_PAGE_ADD_NEW_EMPLOYEE_ICON_XPATH,EMPLOYEE_PAGE_ADD_NEW_EMPLOYEE_ICON_CSS);
        Thread.sleep(3000);
    }

    public void action_Click_On_Search_Button_In_Advance_Search_Section() throws InterruptedException {
        Thread.sleep(2000);
        seleniumBase.click(EMPLOYEE_PAGE_SEARCH_BUTTON_XPATH,EMPLOYEE_PAGE_SEARCH_BUTTON_CSS);
    }

    public void action_Click_On_Reset_Button_In_Advance_Search_Section() throws InterruptedException {
        Thread.sleep(2000);
        seleniumBase.click(EMPLOYEE_PAGE_RESET_BUTTON_XPATH,EMPLOYEE_PAGE_RESET_BUTTON_CSS);
        //Thread.sleep(3000);
    }

    public void action_Click_On_Edit_Button_Of_A_Data_Record() throws InterruptedException {
        action_Click_On_Search_Button_In_Advance_Search_Section();
        Thread.sleep(3000);
        seleniumBase.click(EMPLOYEE_PAGE_TABLE_FIRST_DATA_3_DOTS_BUTTON_XPATH,EMPLOYEE_PAGE_TABLE_FIRST_DATA_3_DOTS_BUTTON_CSS);
        Thread.sleep(2000);
        seleniumBase.click(EMPLOYEE_PAGE_TABLE_FIRST_DATA_EDIT_BUTTON_XPATH,EMPLOYEE_PAGE_TABLE_FIRST_DATA_EDIT_BUTTON_CSS);
        Thread.sleep(3000);
    }

    public String check_And_Validate_Company_Name_Is_Required_In_Advanced_Search_Section() throws InterruptedException {
        seleniumBase.click(EMPLOYEE_PAGE_ADVANCED_SEARCH_COMPANY_NAME_DD_CLEAR_ICON_XPATH,EMPLOYEE_PAGE_ADVANCED_SEARCH_COMPANY_NAME_DD_CLEAR_ICON_CSS);
        action_Click_On_Search_Button_In_Advance_Search_Section();
        return seleniumBase.getText(EMPLOYEE_PAGE_COMPANY_NAME_REQUIRED_MSG_CSS,EMPLOYEE_PAGE_COMPANY_NAME_REQUIRED_MSG_XPATH);
    }

    public void action_Select_Company_From_Company_Name_Dropdown_In_Advance_Search_Section(String CompanyName) throws InterruptedException {
        Thread.sleep(2000);
        seleniumBase.click(EMPLOYEE_PAGE_ADVANCED_SEARCH_COMPANY_NAME_DD_XPATH,EMPLOYEE_PAGE_ADVANCED_SEARCH_COMPANY_NAME_DD_CSS);
        seleniumBase.setdropdownValues("AccountId",CompanyName);
        Thread.sleep(2000);
    }

    public void check_and_Validate_Retrieved_Data(String CompanyName) {
        seleniumBase.check_Retrieved_Column_Data_Of_A_Table(CompanyName,EMPLOYEE_PAGE_DATA_TABLE_XPATH);
    }

    public void check_And_Validate_Is_Value_Exist_In_Data_Table(String EditEmployeeEmail) {
            seleniumBase.checkIsValueExistInTable(EMPLOYEE_PAGE_DATA_TABLE_XPATH,EditEmployeeEmail);
    }

    public void check_And_Validate_Is_Value_Exist_In_Edit_Data_Table(String EditEmployeePersonalTitle, String EditEmployeeNumber, String EditEmployeeFName, String EditEmployeeMName, String EditEmployeeLName, String EditEmployeeCName, String EditEmployeeMobile, String EditEmployeeEmail) {
        seleniumBase.checkIsValueExistInTable(EMPLOYEE_PAGE_DATA_TABLE_XPATH,EditEmployeePersonalTitle);
        seleniumBase.checkIsValueExistInTable(EMPLOYEE_PAGE_DATA_TABLE_XPATH,EditEmployeeNumber);
        seleniumBase.checkIsValueExistInTable(EMPLOYEE_PAGE_DATA_TABLE_XPATH,EditEmployeeFName);
        seleniumBase.checkIsValueExistInTable(EMPLOYEE_PAGE_DATA_TABLE_XPATH,EditEmployeeMName);
        seleniumBase.checkIsValueExistInTable(EMPLOYEE_PAGE_DATA_TABLE_XPATH,EditEmployeeLName);
        seleniumBase.checkIsValueExistInTable(EMPLOYEE_PAGE_DATA_TABLE_XPATH,EditEmployeeCName);
        seleniumBase.checkIsValueExistInTable(EMPLOYEE_PAGE_DATA_TABLE_XPATH,EditEmployeeMobile);
        seleniumBase.checkIsValueExistInTable(EMPLOYEE_PAGE_DATA_TABLE_XPATH,EditEmployeeEmail);
    }



    public String step_Get_Selected_Company_Name() throws InterruptedException {
        Thread.sleep(5000);
        return seleniumBase.getText(By.className("select2-selection__rendered"));
    }

    public void step_Navigate_To_Edit_Popup_Of_A_Selected_Employee_From_Data_Table(String deptName) throws InterruptedException {
        Thread.sleep(2000);
        seleniumBase.clickEditButtonOfASelectedRecord(EMPLOYEE_PAGE_DATA_TABLE_XPATH,deptName);
    }

    public void step_Navigate_To_Remove_Alert_Of_A_Selected_Employee_From_Data_Table(String deptName) throws InterruptedException {
        Thread.sleep(2000);
        seleniumBase.clickRemoveButtonOfASelectedRecord(EMPLOYEE_PAGE_DATA_TABLE_XPATH,deptName);
    }

    public String check_And_Validate_Is_Employee_Removed_From_The_Data_Table(String deptName) {
        return seleniumBase.checkIsValueExistInTable(EMPLOYEE_PAGE_DATA_TABLE_XPATH,deptName);
    }

    public void Search_Data_By_Text_In_Data_Table(String Data) {
        seleniumBase.type(EMPLOYEE_PAGE_TEXT_BASED_SEARCH_FIELD_CSS,EMPLOYEE_PAGE_TEXT_BASED_SEARCH_FIELD_XPATH,Data);
    }

    public String check_and_Validate_Copy_Data() {
        seleniumBase.click(EMPLOYEE_PAGE_COPY_BUTTON_XPATH,EMPLOYEE_PAGE_COPY_BUTTON_CSS);
        return seleniumBase.getText(EMPLOYEE_PAGE_COPY_TO_CLIPBOARD_MSG_CSS,EMPLOYEE_PAGE_COPY_TO_CLIPBOARD_MSG_XPATH);
    }

    public String step_Get_No_Of_Records_In_Data_Table() {
         return Integer.toString(seleniumBase.getNoOfRowsInATable(EMPLOYEE_PAGE_DATA_TABLE_XPATH));
    }

    public String check_and_Validate_Print_Data() throws InterruptedException {
        seleniumBase.click(EMPLOYEE_PAGE_PRINT_BUTTON_XPATH,EMPLOYEE_PAGE_PRINT_BUTTON_CSS);
        Thread.sleep(5000);
        seleniumBase.switchToNewTab();
        System.out.println("Title : " + seleniumBase.getTitle());
        seleniumBase.click("/html" ,"");
        return seleniumBase.getText(EMPLOYEE_PAGE_PRINT_PREVIEW_TITLE_CSS,EMPLOYEE_PAGE_PRINT_PREVIEW_TITLE_XPATH);
    }

    public void step_Navigate_Print_Window() throws InterruptedException {
        seleniumBase.click(EMPLOYEE_PAGE_PRINT_BUTTON_XPATH,EMPLOYEE_PAGE_PRINT_BUTTON_CSS);
        Thread.sleep(5000);
        seleniumBase.switchToNewTab();

        seleniumBase.click(EMPLOYEE_PAGE_PRINT_BUTTON_XPATH,EMPLOYEE_PAGE_PRINT_BUTTON_CSS);
        Thread.sleep(5000);
        seleniumBase.switchToNewTab();
        System.out.println("Title : " + seleniumBase.getTitle());
        WebDriver driver = null;
       /* seleniumBase.click("/html" ,"");
        return seleniumBase.getText(EMPLOYEE_PAGE_PRINT_PREVIEW_TITLE_CSS,EMPLOYEE_PAGE_PRINT_PREVIEW_TITLE_XPATH);*/

        WebElement print_button = driver.findElement(By.xpath("//*[@id=\"sidebar\"]//print-preview-button-strip//cr-button[1]"));

        // click on the print button and wait for print to be called
        driver.manage().timeouts().setScriptTimeout(20, TimeUnit.SECONDS);
        ((JavascriptExecutor)driver).executeAsyncScript(
                "var callback = arguments[1];" +
                        "window.print = function(){callback();};" +
                        "arguments[0].click();"
                , print_button);

        System.out.println("clicked");
    }

    public String check_and_Validate_Excel_Data() throws InterruptedException {
        seleniumBase.click(EMPLOYEE_PAGE_EXCEL_BUTTON_XPATH,EMPLOYEE_PAGE_EXCEL_BUTTON_CSS);
        Thread.sleep(5000);
        return seleniumBase.getLatestFileFromDir("C:\\Users\\e.koshila\\Downloads");
    }

    public String check_and_Validate_PDF_Data() throws InterruptedException {
        seleniumBase.click(EMPLOYEE_PAGE_PDF_BUTTON_XPATH,EMPLOYEE_PAGE_PDF_BUTTON_CSS);
        Thread.sleep(5000);
        return seleniumBase.getLatestFileFromDir("C:\\Users\\e.koshila\\Downloads");
    }

    public void check_and_Validate_Order_Data_Ascending() throws InterruptedException {
        seleniumBase.click(EMPLOYEE_PAGE_EMPLOYEE_NAME_SORTING_BUTTON_XPATH,EMPLOYEE_PAGE_EMPLOYEE_NAME_SORTING_BUTTON_CSS);
        seleniumBase.checkIsElementEnabled("//*[@aria-label=\"Employee: activate to sort column descending\"]");
    }

    public void check_and_Validate_Order_Data_Descending() throws InterruptedException {
        seleniumBase.click(EMPLOYEE_PAGE_EMPLOYEE_NAME_SORTING_BUTTON_XPATH,EMPLOYEE_PAGE_EMPLOYEE_NAME_SORTING_BUTTON_CSS);
        seleniumBase.checkIsElementEnabled("//*[@aria-label=\"Employee: activate to sort column ascending\"]");
    }

    public String step_Get_Last_Record_Of_The_Table() {
        return seleniumBase.getLastRecordOfATable(EMPLOYEE_PAGE_DATA_TABLE_XPATH);
    }

    public void action_Click_On_Next_Button_From_Pagination_Section() {
        seleniumBase.checkIsElementEnabled(EMPLOYEE_PAGE_PAGINATION_NEXT_BUTTON_XPATH);
        seleniumBase.click(EMPLOYEE_PAGE_PAGINATION_NEXT_BUTTON_XPATH, EMPLOYEE_PAGE_PAGINATION_NEXT_BUTTON_CSS);
    }

    public void check_and_Validate_Next_Button_In_Pagination_Section(String data) {
        seleniumBase.checkIsValueExistInTable(EMPLOYEE_PAGE_DATA_TABLE_XPATH, data);
        System.out.println("Check Next : "+ data);
    }

    public void action_Click_On_Previous_Button_From_Pagination_Section() {
        seleniumBase.checkIsElementEnabled(EMPLOYEE_PAGE_PAGINATION_PREVIOUS_BUTTON_XPATH);
        seleniumBase.click(EMPLOYEE_PAGE_PAGINATION_PREVIOUS_BUTTON_XPATH, EMPLOYEE_PAGE_PAGINATION_PREVIOUS_BUTTON_CSS);
    }

    public void check_and_Validate_Previous_Button_In_Pagination_Section(String data) throws InterruptedException {
        seleniumBase.checkIsValueExistInTable(EMPLOYEE_PAGE_DATA_TABLE_XPATH, data);
        System.out.println("Check Previous : "+ data);
    }

    public void action_Click_On_Page_2_From_Pagination_Section() {
        seleniumBase.checkIsElementEnabled(EMPLOYEE_PAGE_PAGINATION_PAGE_2_BUTTON_XPATH);
        seleniumBase.click(EMPLOYEE_PAGE_PAGINATION_PAGE_2_BUTTON_XPATH, EMPLOYEE_PAGE_PAGINATION_PAGE_2_BUTTON_XPATH);
    }

    public void check_and_Validate_Page_2_In_Pagination_Section(String data) {
        seleniumBase.checkIsValueExistInTable(EMPLOYEE_PAGE_DATA_TABLE_XPATH, data);
        System.out.println("Check Page 2 : "+ data);
    }

    public void action_Click_On_Page_1_From_Pagination_Section() {
        seleniumBase.checkIsElementEnabled(EMPLOYEE_PAGE_PAGINATION_PAGE_1_BUTTON_XPATH);
        seleniumBase.click(EMPLOYEE_PAGE_PAGINATION_PAGE_1_BUTTON_XPATH, EMPLOYEE_PAGE_PAGINATION_PAGE_1_BUTTON_CSS);
    }

    public void check_and_Validate_Page_1_In_Pagination_Section(String data) throws InterruptedException {
        seleniumBase.checkIsValueExistInTable(EMPLOYEE_PAGE_DATA_TABLE_XPATH, data);
        System.out.println("Check Page 1 : "+ data);
    }

    public String check_Advance_Search_Section_Company_Branch_Name_Label() {
        seleniumBase.checkElementIsDisplayed(EMPLOYEE_PAGE_ADVANCED_SEARCH_COMPANY_BRANCH_NAME_XPATH);
        return seleniumBase.getText(EMPLOYEE_PAGE_ADVANCED_SEARCH_COMPANY_BRANCH_NAME_CSS, EMPLOYEE_PAGE_ADVANCED_SEARCH_COMPANY_BRANCH_NAME_XPATH);
    }



}



