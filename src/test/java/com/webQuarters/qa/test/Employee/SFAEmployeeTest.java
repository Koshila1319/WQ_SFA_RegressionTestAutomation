package com.webQuarters.qa.test.Employee;

import com.webQuarters.qa.automation.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by e.koshila on 4/17/2020.
 */
public class SFAEmployeeTest extends TestBase {

    @BeforeMethod
    public void NavigateToLoginPage() throws Exception {
        initDomainObjects(DRIVER);
        String siteUrl = data.getValueByName("SFAUrl");
        setSiteURL(siteUrl);

        String Uname = data.getValueByName("VALIDUNAME");
        String Password = data.getValueByName("VALIDPASSWORD");

        Thread.sleep(5000);
        sfaLoginPage.
                step_User_Enter_Given_Credentials(Uname, Password).
                step_User_Click_Login_Button();
        sfaHomePage.verify_Navigate_To_Employee_Page();
    }

    @AfterMethod
    public void endTestMethod() throws Throwable{
        Thread.sleep(3000);
        //quitDriver();
    }

    //Test Case - 3517, 3520
    //-----------UI Testing -------------

    //Employee page title
    @Test
    public void check_Employee_Page_Title() {
        String EmployeePageTitle = data.getValueByName("EmployeePageTitle");
        Assert.assertEquals(sfaEmployeePage.check_Employee_Page_Title(), EmployeePageTitle);
    }

    //Breadcrumb
    @Test
    public void check_Employee_Page_Breadcrumb_Is_Available() {
        sfaEmployeePage.check_Employee_Page_Breadcrumb_Is_Available();
    }

    //Add new Employee button
    @Test
    public void check_Add_New_Employee_Button_Is_Available() {
        sfaEmployeePage.check_Add_New_Employee_Button_Is_Available();
    }

    @Test
    public void check_List_of_Employee_Section() {
        String ListOfEmployeeTitle = data.getValueByName("ListOfEmployeeTitle");
        Assert.assertEquals(sfaEmployeePage.check_List_of_Employee_Section_Title(),ListOfEmployeeTitle);

        /*String RecordsPerPageText = data.getValueByName("RecordsPerPageText");
        Assert.assertEquals(sfaEmployeePage.check_Records_Per_Page_Section(),RecordsPerPageText);*/

        String TextBasedSearchText = data.getValueByName("TextBasedSearchText");
        Assert.assertEquals(sfaEmployeePage.check_Text_Based_Search_Section(),TextBasedSearchText);

        String ButtonsText = data.getValueByName("ListEmployeesButtonsText");
        Assert.assertEquals(sfaEmployeePage.check_Buttons_Section(),ButtonsText);

        sfaEmployeePage.check_Buttons_Section();

        sfaEmployeePage.check_Data_Table_Is_Available();

        String EmployeeDataTableColumns = data.getValueByName("EmployeeDataTableColumns");
        Assert.assertEquals(sfaEmployeePage.check_Employee_Table_Columns(),EmployeeDataTableColumns);

        String NothingFoundText = data.getValueByName("NothingFoundText");
        Assert.assertEquals(sfaEmployeePage.check_Nothing_Found_Text_In_Data_Table(),NothingFoundText);

        String NoRecordsText = data.getValueByName("NoRecordsText");
        Assert.assertEquals(sfaEmployeePage.check_No_Records_Found_Text(),NoRecordsText);

        sfaEmployeePage.check_Pagination_Section_Available();

    }

    //Test Case - 3532
    //Advanced Search section
    @Test
    public void check_Advance_Search_Section() {
        String AdvancedSearchTitle = data.getValueByName("AdvanceSearchTitle");
        Assert.assertEquals(sfaEmployeePage.check_Advance_Search_Section_Title(),AdvancedSearchTitle);

        //Company Name
        String CompanyNameLabel = data.getValueByName("CompanyNameLabel");
        Assert.assertEquals(sfaEmployeePage.check_Advance_Search_Section_Company_Name_Label(),CompanyNameLabel);

        sfaEmployeePage.check_Advance_Search_Section_Company_Name_Dropdown();

        //Company Branch Name
        String CompanyBranchNameLabel = data.getValueByName("CompanyBranchNameLabel");
        Assert.assertEquals(sfaEmployeePage.check_Advance_Search_Section_Company_Branch_Name_Label(),CompanyBranchNameLabel);

        sfaEmployeePage.check_Advance_Search_Section_Company_Branch_Name_Dropdown();

        //Department Name
        String DepartmentNameLabel = data.getValueByName("DepartmentNameLabel");
        Assert.assertEquals(sfaEmployeePage.check_Advance_Search_Section_Department_Name_Label(),DepartmentNameLabel);

        sfaEmployeePage.check_Advance_Search_Section_Department_Name_Dropdown();

        //Designation Name
        String DesignationLabel = data.getValueByName("DesignationNameLabel");
        Assert.assertEquals(sfaEmployeePage.check_Advance_Search_Section_Designation_Label(),DesignationLabel);

        sfaEmployeePage.check_Advance_Search_Section_Designation_Dropdown();

        //Employee Name
        String EmployeeNameLabel = data.getValueByName("EmployeeNameLabel");
        Assert.assertEquals(sfaEmployeePage.check_Advance_Search_Section_Employee_Name_Label(),EmployeeNameLabel);

        sfaEmployeePage.check_Advance_Search_Section_Employee_Name_TextBox();

        String ResetButtonText = data.getValueByName("ResetButtonText");
        Assert.assertEquals(sfaEmployeePage.check_Reset_Button(),ResetButtonText);

        String SearchButtonText = data.getValueByName("SearchButtonText");
        Assert.assertEquals(sfaEmployeePage.check_Search_Button(),SearchButtonText);
    }


/*

    // check column filter

    //-----------Functional Testing -------------

    //Pagination disabled when no records
    @Test
    public void check_Pagination_Section_Is_Disabled_When_No_Data_In_Data_Table() {
        Assert.assertEquals(sfaEmployeePage.check_Pagination_Section_Is_Disabled_When_No_Data_In_Data_Table(), false);
    }

    //Test Case - 3503
    //Verify required fields
    @Test
    public void check_And_Validate_Company_Name_Is_Required_In_Advanced_Search_Section() throws InterruptedException {
        String RequiredMsg = data.getValueByName("RequiredMsg");
        Assert.assertEquals(sfaEmployeePage.check_And_Validate_Company_Name_Is_Required_In_Advanced_Search_Section(), RequiredMsg);

    }

    //Test Case - 3497
    @Test
    public void check_And_Validate_User_Able_To_Search_Employees() throws InterruptedException {
        String CompanyName = data.getValueByName("EmployeeSearchCompanyName");
        sfaEmployeePage.action_Select_Company_From_Company_Name_Dropdown_In_Advance_Search_Section(CompanyName);
        sfaEmployeePage.action_Click_On_Search_Button_In_Advance_Search_Section();
        sfaEmployeePage.check_and_Validate_Retrieved_Data(CompanyName);
    }

    //Test Case - 3502
    @Test
    public void check_And_Validate_User_Able_To_Reset_Search_Field_Data() throws InterruptedException {
        String DefaultSelectedCompanyName = sfaEmployeePage.step_Get_Selected_Company_Name();
        String CompanyName = data.getValueByName("EmployeeSearchCompanyName");
        sfaEmployeePage.action_Select_Company_From_Company_Name_Dropdown_In_Advance_Search_Section(CompanyName);
        sfaEmployeePage.action_Click_On_Reset_Button_In_Advance_Search_Section();

        String SelectedCompanyNameAfterReset = sfaEmployeePage.step_Get_Selected_Company_Name();
        Assert.assertEquals(SelectedCompanyNameAfterReset, DefaultSelectedCompanyName);
    }


    //Test Case - 3506
    //Text based search in the Data Table
    @Test
    public void check_And_Validate_Text_Based_Search_In_The_Data_Table() throws InterruptedException {
        String AddEmployeeCompanyName = data.getValueByName("AddEmployeeCompanyName");
        String NewEmployeeName = sfaAddEmployeePage.create_Random_Employee_Name(data.getValueByName("NewEmployeeName"));

        sfaEmployeePage.
                action_Click_On_Add_New_Employee_Button();
        sfaAddEmployeePage.
                step_Add_New_Employee(AddEmployeeCompanyName,NewEmployeeName);
        sfaEmployeePage.
                action_Select_Company_From_Company_Name_Dropdown_In_Advance_Search_Section(AddEmployeeCompanyName);
        sfaEmployeePage.
                action_Click_On_Search_Button_In_Advance_Search_Section();
        sfaEmployeePage.
                Search_Data_By_Text_In_Data_Table(NewEmployeeName);
        sfaEmployeePage.
                check_And_Validate_Is_Value_Exist_In_Data_Table(NewEmployeeName);
    }

    //Test Case - 3508
    //Pre-Conditions - No of Employees should be less than 10 in the data table,  Remove previously downloaded SFA files from 'Download' Folder
    //Copy, Print, PDF and Excel Data
    @Test
    public void check_And_Validate_User_Able_To_Copy_Print_PDF_And_Excel_Data() throws InterruptedException {
        String AddEmployeeCompanyName = data.getValueByName("AddEmployeeCompanyName");
        String NewEmployeeName = sfaAddEmployeePage.create_Random_Employee_Name(data.getValueByName("NewEmployeeName"));

        sfaEmployeePage.
                action_Click_On_Add_New_Employee_Button();
        sfaAddEmployeePage.
                step_Add_New_Employee(AddEmployeeCompanyName,NewEmployeeName);
        sfaEmployeePage.
                action_Select_Company_From_Company_Name_Dropdown_In_Advance_Search_Section(AddEmployeeCompanyName);
        sfaEmployeePage.
                action_Click_On_Search_Button_In_Advance_Search_Section();

        //Copy data
        String CopyToClipboardMsg = data.getValueByName("CopyToClipboardMsgTitle") + "\nCopied " + sfaEmployeePage.step_Get_No_Of_Records_In_Data_Table() + " rows to clipboard";
        Assert.assertEquals(sfaEmployeePage.check_and_Validate_Copy_Data(), CopyToClipboardMsg);
        System.out.println("Employee data Copied...!");

        //Print data
        String PrintPreviewTitle = data.getValueByName("PrintPreviewTitle");
Assert.assertEquals(sfaEmployeePage.check_and_Validate_Print_Data(), PrintPreviewTitle);
        System.out.println("Employee data able to Print...!");


        //PDF data
        String EmployeesPDFFileName = data.getValueByName("EmployeesPDFFileName");
        Assert.assertEquals(sfaEmployeePage.check_and_Validate_PDF_Data(), EmployeesPDFFileName);
        System.out.println("Employee data download as a PDF...!");

        //Excel data
        String EmployeesExcelFileName = data.getValueByName("EmployeesExcelFileName");
        Assert.assertEquals(sfaEmployeePage.check_and_Validate_Excel_Data(), EmployeesExcelFileName);
        System.out.println("Employee data download as an Excel...!");

    }

    //Test Case - 3505
    //Sorting data Ascending and Descending order
    @Test
    public void check_And_Validate_User_Able_To_Sort_Data_Ascending_And_Descending() throws InterruptedException {
        String AddEmployeeCompanyName = data.getValueByName("AddEmployeeCompanyName");
        String NewEmployeeName = sfaAddEmployeePage.create_Random_Employee_Name(data.getValueByName("NewEmployeeName"));

        sfaEmployeePage.
                action_Click_On_Add_New_Employee_Button();
        sfaAddEmployeePage.
                step_Add_New_Employee(AddEmployeeCompanyName, NewEmployeeName);
        sfaEmployeePage.
                action_Select_Company_From_Company_Name_Dropdown_In_Advance_Search_Section(AddEmployeeCompanyName);
        sfaEmployeePage.
                action_Click_On_Search_Button_In_Advance_Search_Section();

        //Check able to sort data ascending
        sfaEmployeePage
                .check_and_Validate_Order_Data_Ascending();
        System.out.println("Data sort to Ascending...!");

        //Check able to sort data descending
        sfaEmployeePage
                .check_and_Validate_Order_Data_Descending();
        System.out.println("Data sort to Descending...!");
    }

    //Test Case - 3507
    //Behaviour Of The Pagination Section
    @Test
    public void check_And_Validate_Behaviour_Of_The_Pagination_Section() throws InterruptedException {
        String AddEmployeeCompanyName = data.getValueByName("AddEmployeeCompanyName");
        String RecentlyAddedEmployee="";

        sfaEmployeePage.
                action_Select_Company_From_Company_Name_Dropdown_In_Advance_Search_Section(AddEmployeeCompanyName);
        sfaEmployeePage.
                action_Click_On_Search_Button_In_Advance_Search_Section();

        String LastRecordOfTheTable = sfaEmployeePage.step_Get_Last_Record_Of_The_Table();

        System.out.println("Last record :" + LastRecordOfTheTable);

        Integer noOfRows = Integer.parseInt(sfaEmployeePage.step_Get_No_Of_Records_In_Data_Table());

        if(noOfRows<= 10)
        {
            for (int i = noOfRows+1; i <= 11; i++) {

                System.out.println("Row Count : " + i);

                String NewEmployee = sfaAddEmployeePage.create_Random_Employee_Name(data.getValueByName("NewEmployeeName"));
                RecentlyAddedEmployee = NewEmployee;
                sfaEmployeePage.
                        action_Click_On_Add_New_Employee_Button();
                sfaAddEmployeePage.
                        step_Add_New_Employee(AddEmployeeCompanyName, NewEmployee);

                Thread.sleep(2000);
            }
        }

        System.out.println("Recently added Employee :" + RecentlyAddedEmployee);

        //Validate Next button
        sfaEmployeePage.action_Click_On_Next_Button_From_Pagination_Section();
        sfaEmployeePage.check_and_Validate_Next_Button_In_Pagination_Section(LastRecordOfTheTable);

        //Validate Previous button
        sfaEmployeePage.action_Click_On_Previous_Button_From_Pagination_Section();
        sfaEmployeePage.check_and_Validate_Previous_Button_In_Pagination_Section(RecentlyAddedEmployee);

        //Validate Page 2
        sfaEmployeePage.action_Click_On_Page_2_From_Pagination_Section();
        sfaEmployeePage.check_and_Validate_Page_2_In_Pagination_Section(LastRecordOfTheTable);

        //Validate Page 1
        sfaEmployeePage.action_Click_On_Page_1_From_Pagination_Section();
        sfaEmployeePage.check_and_Validate_Page_1_In_Pagination_Section(RecentlyAddedEmployee);
    }
*/

}
