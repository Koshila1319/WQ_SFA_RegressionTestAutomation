package com.webQuarters.qa.test.webQuarters.page.Designation;


import com.webQuarters.qa.automation.SeleniumBase;
import com.webQuarters.qa.data.UI.elements.webQuarters.elements.Designation.sfaDesignationPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

/**
 * Created by e.koshila on 4/10/2020.
 */

public class SFADesignationPage implements sfaDesignationPage {

    SeleniumBase seleniumBase;

    public SFADesignationPage(WebDriver driver) {
        seleniumBase = new SeleniumBase(driver);
    }

    //Check UI view of the Designation page

    //Page title
    public String check_Designation_Page_Title() {
        seleniumBase.checkElementIsDisplayed(DESIGNATION_PAGE_TITLE_XPATH);
        return seleniumBase.getText(DESIGNATION_PAGE_TITLE_CSS, DESIGNATION_PAGE_TITLE_XPATH);
    }

    //Breadcrumb
     public void check_Designation_Page_Breadcrumb_Is_Available() {
         seleniumBase.checkElementIsDisplayed(DESIGNATION_PAGE_BREADCRUMB_XPATH);
     }

    //Add Designation button
     public void check_Add_New_Designation_Button_Is_Available() {
         seleniumBase.checkElementIsDisplayed(DESIGNATION_PAGE_ADD_NEW_DESIGNATION_ICON_XPATH);
     }

    //Advanced Search section

    public String check_Advance_Search_Section_Title() {
        seleniumBase.checkElementIsDisplayed(DESIGNATION_PAGE_ADVANCED_SEARCH_SECTION_XPATH);
        return seleniumBase.getText(DESIGNATION_PAGE_ADVANCED_SEARCH_SECTION_CSS, DESIGNATION_PAGE_ADVANCED_SEARCH_SECTION_XPATH);
    }

    public String check_Advance_Search_Section_Company_Name_Label() {
        seleniumBase.checkElementIsDisplayed(DESIGNATION_PAGE_ADVANCED_SEARCH_COMPANY_NAME_XPATH);
        return seleniumBase.getText(DESIGNATION_PAGE_ADVANCED_SEARCH_COMPANY_NAME_CSS, DESIGNATION_PAGE_ADVANCED_SEARCH_COMPANY_NAME_XPATH);
    }

    public void check_Advance_Search_Section_Company_Name_Dropdown() {
        seleniumBase.checkElementIsDisplayed(DESIGNATION_PAGE_ADVANCED_SEARCH_COMPANY_NAME_DD_XPATH);
    }

    public String check_Reset_Button() {
        seleniumBase.checkElementIsDisplayed(DESIGNATION_PAGE_RESET_BUTTON_XPATH);
        return seleniumBase.getText(DESIGNATION_PAGE_RESET_BUTTON_CSS, DESIGNATION_PAGE_RESET_BUTTON_XPATH);
    }

    public String check_Search_Button() {
        seleniumBase.checkElementIsDisplayed(DESIGNATION_PAGE_SEARCH_BUTTON_XPATH);
        return seleniumBase.getText(DESIGNATION_PAGE_SEARCH_BUTTON_CSS, DESIGNATION_PAGE_SEARCH_BUTTON_XPATH);
    }

    //List of Designation section

    public String check_List_of_Designation_Section_Title() {
        seleniumBase.checkElementIsDisplayed(DESIGNATION_PAGE_LIST_OF_DESIGNATION_SECTION_XPATH);
        return seleniumBase.getText(DESIGNATION_PAGE_LIST_OF_DESIGNATION_SECTION_CSS, DESIGNATION_PAGE_LIST_OF_DESIGNATION_SECTION_XPATH);
    }

    public String check_Records_Per_Page_Section() {
        seleniumBase.checkElementIsDisplayed(DESIGNATION_PAGE_RECORDS_PER_PAGE_XPATH);
        return seleniumBase.getText(DESIGNATION_PAGE_RECORDS_PER_PAGE_CSS, DESIGNATION_PAGE_RECORDS_PER_PAGE_XPATH);
    }

    public String check_Text_Based_Search_Section() {
        seleniumBase.checkElementIsDisplayed(DESIGNATION_PAGE_TEXT_BASED_SEARCH_FIELD_XPATH);
        seleniumBase.checkElementIsDisplayed(DESIGNATION_PAGE_TEXT_BASED_SEARCH_LABEL_XPATH);
        return seleniumBase.getText(DESIGNATION_PAGE_TEXT_BASED_SEARCH_LABEL_CSS, DESIGNATION_PAGE_TEXT_BASED_SEARCH_LABEL_XPATH);
    }

    public String check_Buttons_Section() {
        seleniumBase.checkElementIsDisplayed(DESIGNATION_PAGE_BUTTONS_XPATH);
        return seleniumBase.getText(DESIGNATION_PAGE_BUTTONS_CSS, DESIGNATION_PAGE_BUTTONS_XPATH);
    }

    public void check_Data_Table_Is_Available() {
        seleniumBase.checkElementIsDisplayed(DESIGNATION_PAGE_DATA_TABLE_XPATH);
    }

    public String check_Designation_Table_Columns() {
         seleniumBase.checkElementIsDisplayed(DESIGNATION_PAGE_TABLE_COLUMNS_XPATH);
         return seleniumBase.getText(DESIGNATION_PAGE_TABLE_COLUMNS_CSS,DESIGNATION_PAGE_TABLE_COLUMNS_XPATH);
    }

    public String check_Nothing_Found_Text_In_Data_Table() {
         seleniumBase.checkElementIsDisplayed(DESIGNATION_PAGE_TABLE_NOTHING_FOUND_TEXT_XPATH);
         return seleniumBase.getText(DESIGNATION_PAGE_TABLE_NOTHING_FOUND_TEXT_CSS,DESIGNATION_PAGE_TABLE_NOTHING_FOUND_TEXT_XPATH);
    }

    public String check_No_Records_Found_Text() {
         seleniumBase.checkElementIsDisplayed(DESIGNATION_PAGE_TABLE_NO_RECORDS_FOUND_TEXT_XPATH);
         return seleniumBase.getText(DESIGNATION_PAGE_TABLE_NO_RECORDS_FOUND_TEXT_CSS,DESIGNATION_PAGE_TABLE_NO_RECORDS_FOUND_TEXT_XPATH);
    }

    public void check_Pagination_Section_Available() {
         seleniumBase.checkElementIsDisplayed(DESIGNATION_PAGE_PAGINATION_SECTION_XPATH);
    }

    //Functional
    public boolean check_Pagination_Section_Is_Disabled_When_No_Data_In_Data_Table() {
        return seleniumBase.checkElementPresent(DESIGNATION_PAGE_PAGINATION_PAGE_XPATH);
    }

    public void action_Click_On_Add_New_Designation_Button() throws InterruptedException {
        seleniumBase.click(DESIGNATION_PAGE_ADD_NEW_DESIGNATION_ICON_XPATH,DESIGNATION_PAGE_ADD_NEW_DESIGNATION_ICON_CSS);
        Thread.sleep(3000);
    }

    public void action_Click_On_Search_Button_In_Advance_Search_Section() throws InterruptedException {
        Thread.sleep(2000);
        seleniumBase.click(DESIGNATION_PAGE_SEARCH_BUTTON_XPATH,DESIGNATION_PAGE_SEARCH_BUTTON_CSS);
    }

    public void action_Click_On_Reset_Button_In_Advance_Search_Section() throws InterruptedException {
        Thread.sleep(2000);
        seleniumBase.click(DESIGNATION_PAGE_RESET_BUTTON_XPATH,DESIGNATION_PAGE_RESET_BUTTON_CSS);
        //Thread.sleep(3000);
    }

    public void action_Click_On_Edit_Button_Of_A_Data_Record() throws InterruptedException {
        action_Click_On_Search_Button_In_Advance_Search_Section();
        Thread.sleep(3000);
        seleniumBase.click(DESIGNATION_PAGE_TABLE_FIRST_DATA_3_DOTS_BUTTON_XPATH,DESIGNATION_PAGE_TABLE_FIRST_DATA_3_DOTS_BUTTON_CSS);
        Thread.sleep(2000);
        seleniumBase.click(DESIGNATION_PAGE_TABLE_FIRST_DATA_EDIT_BUTTON_XPATH,DESIGNATION_PAGE_TABLE_FIRST_DATA_EDIT_BUTTON_CSS);
        Thread.sleep(3000);
    }

    public String check_And_Validate_Company_Name_Is_Required_In_Advanced_Search_Section() throws InterruptedException {
        seleniumBase.click(DESIGNATION_PAGE_ADVANCED_SEARCH_COMPANY_NAME_DD_CLEAR_ICON_XPATH,DESIGNATION_PAGE_ADVANCED_SEARCH_COMPANY_NAME_DD_CLEAR_ICON_CSS);
        action_Click_On_Search_Button_In_Advance_Search_Section();
        return seleniumBase.getText(DESIGNATION_PAGE_COMPANY_NAME_REQUIRED_MSG_CSS,DESIGNATION_PAGE_COMPANY_NAME_REQUIRED_MSG_XPATH);
    }

    public void action_Select_Company_From_Company_Name_Dropdown_In_Advance_Search_Section(String CompanyName) throws InterruptedException {
        Thread.sleep(2000);
        seleniumBase.click(DESIGNATION_PAGE_ADVANCED_SEARCH_COMPANY_NAME_DD_XPATH,DESIGNATION_PAGE_ADVANCED_SEARCH_COMPANY_NAME_DD_CSS);
        seleniumBase.setdropdownValues("AccountId",CompanyName);
        Thread.sleep(2000);
    }

    public void check_and_Validate_Retrieved_Data(String CompanyName) {
        seleniumBase.check_Retrieved_Column_Data_Of_A_Table(CompanyName,DESIGNATION_PAGE_DATA_TABLE_XPATH);
    }

    public void check_And_Validate_Is_Value_Exist_In_Data_Table(String deptName) {
        seleniumBase.checkIsValueExistInTable(DESIGNATION_PAGE_DATA_TABLE_XPATH,deptName);
    }

    public String step_Get_Selected_Company_Name() throws InterruptedException {
        Thread.sleep(5000);
        return seleniumBase.getText(By.className("select2-selection__rendered"));
    }

    public void step_Navigate_To_Edit_Popup_Of_A_Selected_Designation_From_Data_Table(String deptName) throws InterruptedException {
        Thread.sleep(2000);
        seleniumBase.clickEditButtonOfASelectedRecord(DESIGNATION_PAGE_DATA_TABLE_XPATH,deptName);
    }

    public void step_Navigate_To_Remove_Alert_Of_A_Selected_Designation_From_Data_Table(String deptName) throws InterruptedException {
        Thread.sleep(2000);
        seleniumBase.clickRemoveButtonOfASelectedRecord(DESIGNATION_PAGE_DATA_TABLE_XPATH,deptName);
    }

    public String check_And_Validate_Is_Designation_Removed_From_The_Data_Table(String deptName) {
        return seleniumBase.checkIsValueExistInTable(DESIGNATION_PAGE_DATA_TABLE_XPATH,deptName);
    }

    public void Search_Data_By_Text_In_Data_Table(String Data) {
        seleniumBase.type(DESIGNATION_PAGE_TEXT_BASED_SEARCH_FIELD_CSS,DESIGNATION_PAGE_TEXT_BASED_SEARCH_FIELD_XPATH,Data);
    }

    public String check_and_Validate_Copy_Data() {
        seleniumBase.click(DESIGNATION_PAGE_COPY_BUTTON_XPATH,DESIGNATION_PAGE_COPY_BUTTON_CSS);
        return seleniumBase.getText(DESIGNATION_PAGE_COPY_TO_CLIPBOARD_MSG_CSS,DESIGNATION_PAGE_COPY_TO_CLIPBOARD_MSG_XPATH);
    }

    public String step_Get_No_Of_Records_In_Data_Table() {
         return Integer.toString(seleniumBase.getNoOfRowsInATable(DESIGNATION_PAGE_DATA_TABLE_XPATH));
    }

    public String check_and_Validate_Print_Data() throws InterruptedException {
        seleniumBase.click(DESIGNATION_PAGE_PRINT_BUTTON_XPATH,DESIGNATION_PAGE_PRINT_BUTTON_CSS);
        Thread.sleep(5000);
        seleniumBase.switchToNewTab();
        System.out.println("Title : " + seleniumBase.getTitle());
        seleniumBase.click("/html" ,"");
        return seleniumBase.getText(DESIGNATION_PAGE_PRINT_PREVIEW_TITLE_CSS,DESIGNATION_PAGE_PRINT_PREVIEW_TITLE_XPATH);
    }

    public void step_Navigate_Print_Window() throws InterruptedException {
        seleniumBase.click(DESIGNATION_PAGE_PRINT_BUTTON_XPATH,DESIGNATION_PAGE_PRINT_BUTTON_CSS);
        Thread.sleep(5000);
        seleniumBase.switchToNewTab();

        seleniumBase.click(DESIGNATION_PAGE_PRINT_BUTTON_XPATH,DESIGNATION_PAGE_PRINT_BUTTON_CSS);
        Thread.sleep(5000);
        seleniumBase.switchToNewTab();
        System.out.println("Title : " + seleniumBase.getTitle());
        WebDriver driver = null;
       /* seleniumBase.click("/html" ,"");
        return seleniumBase.getText(DESIGNATION_PAGE_PRINT_PREVIEW_TITLE_CSS,DESIGNATION_PAGE_PRINT_PREVIEW_TITLE_XPATH);*/

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
        seleniumBase.click(DESIGNATION_PAGE_EXCEL_BUTTON_XPATH,DESIGNATION_PAGE_EXCEL_BUTTON_CSS);
        Thread.sleep(5000);
        return seleniumBase.getLatestFileFromDir("C:\\Users\\e.koshila\\Downloads");
    }

    public String check_and_Validate_PDF_Data() throws InterruptedException {
        seleniumBase.click(DESIGNATION_PAGE_PDF_BUTTON_XPATH,DESIGNATION_PAGE_PDF_BUTTON_CSS);
        Thread.sleep(5000);
        return seleniumBase.getLatestFileFromDir("C:\\Users\\e.koshila\\Downloads");
    }

    public void check_and_Validate_Order_Data_Ascending() throws InterruptedException {
        seleniumBase.click(DESIGNATION_PAGE_DESIGNATION_NAME_SORTING_BUTTON_XPATH,DESIGNATION_PAGE_DESIGNATION_NAME_SORTING_BUTTON_CSS);
        seleniumBase.checkIsElementEnabled("//*[@aria-label=\"Designation: activate to sort column descending\"]");
    }

    public void check_and_Validate_Order_Data_Descending() throws InterruptedException {
        seleniumBase.click(DESIGNATION_PAGE_DESIGNATION_NAME_SORTING_BUTTON_XPATH,DESIGNATION_PAGE_DESIGNATION_NAME_SORTING_BUTTON_CSS);
        seleniumBase.checkIsElementEnabled("//*[@aria-label=\"Designation: activate to sort column ascending\"]");
    }

    public String step_Get_Last_Record_Of_The_Table() {
        return seleniumBase.getLastRecordOfATable(DESIGNATION_PAGE_DATA_TABLE_XPATH);
    }

    public void action_Click_On_Next_Button_From_Pagination_Section() {
        seleniumBase.checkIsElementEnabled(DESIGNATION_PAGE_PAGINATION_NEXT_BUTTON_XPATH);
        seleniumBase.click(DESIGNATION_PAGE_PAGINATION_NEXT_BUTTON_XPATH, DESIGNATION_PAGE_PAGINATION_NEXT_BUTTON_CSS);
    }

    public void check_and_Validate_Next_Button_In_Pagination_Section(String data) {
        seleniumBase.checkIsValueExistInTable(DESIGNATION_PAGE_DATA_TABLE_XPATH, data);
        System.out.println("Check Next : "+ data);
    }

    public void action_Click_On_Previous_Button_From_Pagination_Section() {
        seleniumBase.checkIsElementEnabled(DESIGNATION_PAGE_PAGINATION_PREVIOUS_BUTTON_XPATH);
        seleniumBase.click(DESIGNATION_PAGE_PAGINATION_PREVIOUS_BUTTON_XPATH, DESIGNATION_PAGE_PAGINATION_PREVIOUS_BUTTON_CSS);
    }

    public void check_and_Validate_Previous_Button_In_Pagination_Section(String data) throws InterruptedException {
        seleniumBase.checkIsValueExistInTable(DESIGNATION_PAGE_DATA_TABLE_XPATH, data);
        System.out.println("Check Previous : "+ data);
    }

    public void action_Click_On_Page_2_From_Pagination_Section() {
        seleniumBase.checkIsElementEnabled(DESIGNATION_PAGE_PAGINATION_PAGE_2_BUTTON_XPATH);
        seleniumBase.click(DESIGNATION_PAGE_PAGINATION_PAGE_2_BUTTON_XPATH, DESIGNATION_PAGE_PAGINATION_PAGE_2_BUTTON_XPATH);
    }

    public void check_and_Validate_Page_2_In_Pagination_Section(String data) {
        seleniumBase.checkIsValueExistInTable(DESIGNATION_PAGE_DATA_TABLE_XPATH, data);
        System.out.println("Check Page 2 : "+ data);
    }

    public void action_Click_On_Page_1_From_Pagination_Section() {
        seleniumBase.checkIsElementEnabled(DESIGNATION_PAGE_PAGINATION_PAGE_1_BUTTON_XPATH);
        seleniumBase.click(DESIGNATION_PAGE_PAGINATION_PAGE_1_BUTTON_XPATH, DESIGNATION_PAGE_PAGINATION_PAGE_1_BUTTON_CSS);
    }

    public void check_and_Validate_Page_1_In_Pagination_Section(String data) throws InterruptedException {
        seleniumBase.checkIsValueExistInTable(DESIGNATION_PAGE_DATA_TABLE_XPATH, data);
        System.out.println("Check Page 1 : "+ data);
    }




}



