package com.webQuarters.qa.test.Department;

import com.webQuarters.qa.automation.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by e.koshila on 3/17/2020.
 */
public class SFADepartmentTest extends TestBase {

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
        sfaHomePage.verify_Navigate_To_Department_Page();
    }

    @AfterMethod
    public void endTestMethod() throws Throwable{
        Thread.sleep(3000);
        //quitDriver();
    }

    //Test Case - 3469, 3420
    //-----------UI Testing -------------

    //Department page title
    @Test
    public void check_Department_Page_Title() {
        String DepartmentPageTitle = data.getValueByName("DepartmentPageTitle");
        Assert.assertEquals(sfaDepartmentPage.check_Department_Page_Title(), DepartmentPageTitle);
    }

    //Breadcrumb
    @Test
    public void check_Department_Page_Breadcrumb_Is_Available() {
        sfaDepartmentPage.check_Department_Page_Breadcrumb_Is_Available();
    }

    //Add new department button
    @Test
    public void check_Add_New_Department_Button_Is_Available() {
        sfaDepartmentPage.check_Add_New_Department_Button_Is_Available();
    }

    @Test
    public void check_List_of_Department_Section() {
        String ListOfDepartmentTitle = data.getValueByName("ListOfDepartmentTitle");
        Assert.assertEquals(sfaDepartmentPage.check_List_of_Department_Section_Title(),ListOfDepartmentTitle);

        /*String RecordsPerPageText = data.getValueByName("RecordsPerPageText");
        Assert.assertEquals(sfaDepartmentPage.check_Records_Per_Page_Section(),RecordsPerPageText);*/

        String TextBasedSearchText = data.getValueByName("TextBasedSearchText");
        Assert.assertEquals(sfaDepartmentPage.check_Text_Based_Search_Section(),TextBasedSearchText);

        String ButtonsText = data.getValueByName("ListDepartmentsButtonsText");
        Assert.assertEquals(sfaDepartmentPage.check_Buttons_Section(),ButtonsText);

        sfaDepartmentPage.check_Buttons_Section();

        sfaDepartmentPage.check_Data_Table_Is_Available();

        String DepartmentDataTableColumns = data.getValueByName("DepartmentDataTableColumns");
        Assert.assertEquals(sfaDepartmentPage.check_Department_Table_Columns(),DepartmentDataTableColumns);

        String NothingFoundText = data.getValueByName("NothingFoundText");
        Assert.assertEquals(sfaDepartmentPage.check_Nothing_Found_Text_In_Data_Table(),NothingFoundText);

        String NoRecordsText = data.getValueByName("NoRecordsText");
        Assert.assertEquals(sfaDepartmentPage.check_No_Records_Found_Text(),NoRecordsText);

        sfaDepartmentPage.check_Pagination_Section_Available();

    }

    //Test Case - 3418
    //Advanced Search section
    @Test
    public void check_Advance_Search_Section() {
        String AdvancedSearchTitle = data.getValueByName("AdvanceSearchTitle");
        Assert.assertEquals(sfaDepartmentPage.check_Advance_Search_Section_Title(),AdvancedSearchTitle);

        String CompanyNameLabel = data.getValueByName("CompanyNameLabel");
        Assert.assertEquals(sfaDepartmentPage.check_Advance_Search_Section_Company_Name_Label(),CompanyNameLabel);

        sfaDepartmentPage.check_Advance_Search_Section_Company_Name_Dropdown();

        String ResetButtonText = data.getValueByName("ResetButtonText");
        Assert.assertEquals(sfaDepartmentPage.check_Reset_Button(),ResetButtonText);

        String SearchButtonText = data.getValueByName("SearchButtonText");
        Assert.assertEquals(sfaDepartmentPage.check_Search_Button(),SearchButtonText);
    }

    //-----------Functional Testing -------------

    //Pagination disabled when no records
    @Test
    public void check_Pagination_Section_Is_Disabled_When_No_Data_In_Data_Table() {
        Assert.assertEquals(sfaDepartmentPage.check_Pagination_Section_Is_Disabled_When_No_Data_In_Data_Table(), false);
    }

    //Test Case - 3481
    //Verify required fields
    @Test
    public void check_And_Validate_Company_Name_Is_Required_In_Advanced_Search_Section() throws InterruptedException {
        String RequiredMsg = data.getValueByName("RequiredMsg");
        Assert.assertEquals(sfaDepartmentPage.check_And_Validate_Company_Name_Is_Required_In_Advanced_Search_Section(), RequiredMsg);

    }

    //Test Case - 3417
    @Test
    public void check_And_Validate_User_Able_To_Search_Departments() throws InterruptedException {
        String CompanyName = data.getValueByName("DepartmentSearchCompanyName");
        sfaDepartmentPage.action_Select_Company_From_Company_Name_Dropdown_In_Advance_Search_Section(CompanyName);
        sfaDepartmentPage.action_Click_On_Search_Button_In_Advance_Search_Section();
        sfaDepartmentPage.check_and_Validate_Retrieved_Data(CompanyName);
    }

    //Test Case - 3419
    @Test
    public void check_And_Validate_User_Able_To_Reset_Search_Field_Data() throws InterruptedException {
        String DefaultSelectedCompanyName = sfaDepartmentPage.step_Get_Selected_Company_Name();
        String CompanyName = data.getValueByName("DepartmentSearchCompanyName");
        sfaDepartmentPage.action_Select_Company_From_Company_Name_Dropdown_In_Advance_Search_Section(CompanyName);
        sfaDepartmentPage.action_Click_On_Reset_Button_In_Advance_Search_Section();

        String SelectedCompanyNameAfterReset = sfaDepartmentPage.step_Get_Selected_Company_Name();
        Assert.assertEquals(SelectedCompanyNameAfterReset, DefaultSelectedCompanyName);
    }


    //Test Case - 3422
    //Text based search in the Data Table
    @Test
    public void check_And_Validate_Text_Based_Search_In_The_Data_Table() throws InterruptedException {
        String AddDepartmentCompanyName = data.getValueByName("AddDepartmentCompanyName");
        String NewDepartmentName = sfaAddDepartmentPage.create_Random_Department_Name(data.getValueByName("NewDepartmentName"));

        sfaDepartmentPage.
                action_Click_On_Add_New_Department_Button();
        sfaAddDepartmentPage.
                step_Add_New_Department(AddDepartmentCompanyName,NewDepartmentName);
        sfaDepartmentPage.
                action_Select_Company_From_Company_Name_Dropdown_In_Advance_Search_Section(AddDepartmentCompanyName);
        sfaDepartmentPage.
                action_Click_On_Search_Button_In_Advance_Search_Section();
        sfaDepartmentPage.
                Search_Data_By_Text_In_Data_Table(NewDepartmentName);
        sfaDepartmentPage.
                check_And_Validate_Is_Value_Exist_In_Data_Table(NewDepartmentName);
    }

    //Test Case - 3424
    //Pre-Conditions - No of departments should be less than 10 in the data table,  Remove previously downloaded SFA files from 'Download' Folder
    //Copy, Print, PDF and Excel Data
    @Test
    public void check_And_Validate_User_Able_To_Copy_Print_PDF_And_Excel_Data() throws InterruptedException, IOException {
        String AddDepartmentCompanyName = data.getValueByName("AddDepartmentCompanyName");
        String NewDepartmentName = sfaAddDepartmentPage.create_Random_Department_Name(data.getValueByName("NewDepartmentName"));

        sfaDepartmentPage.
                action_Click_On_Add_New_Department_Button();
        sfaAddDepartmentPage.
                step_Add_New_Department(AddDepartmentCompanyName,NewDepartmentName);
        sfaDepartmentPage.
                action_Select_Company_From_Company_Name_Dropdown_In_Advance_Search_Section(AddDepartmentCompanyName);
        sfaDepartmentPage.
                action_Click_On_Search_Button_In_Advance_Search_Section();

        //Copy data
        String CopyToClipboardMsg = data.getValueByName("CopyToClipboardMsgTitle") + "\nCopied " + sfaDepartmentPage.step_Get_No_Of_Records_In_Data_Table() + " rows to clipboard";
        Assert.assertEquals(sfaDepartmentPage.check_and_Validate_Copy_Data(), CopyToClipboardMsg);
        System.out.println("Department data Copied...!");

        //Print data
        String PrintPreviewTitle = data.getValueByName("PrintPreviewTitle");
        /*Assert.assertEquals(sfaDepartmentPage.check_and_Validate_Print_Data(), PrintPreviewTitle);
        System.out.println("Department data able to Print...!");*/

        //PDF data
        String DepartmentsPDFFileName = data.getValueByName("DepartmentsPDFFileName");
        Assert.assertEquals(sfaDepartmentPage.check_and_Validate_PDF_Data(), DepartmentsPDFFileName);
        System.out.println("Department data download as a PDF...!");

        //Excel data
        String DepartmentsExcelFileName = data.getValueByName("DepartmentsExcelFileName");
        Assert.assertEquals(sfaDepartmentPage.check_and_Validate_Excel_Data(), DepartmentsExcelFileName);
        System.out.println("Department data download as an Excel...!");

    }

    //Test Case - 3529
    //Sorting data Ascending and Descending order
    @Test
    public void check_And_Validate_User_Able_To_Sort_Data_Ascending_And_Descending() throws InterruptedException {
        String AddDepartmentCompanyName = data.getValueByName("AddDepartmentCompanyName");
        /*String NewDepartmentName = sfaAddDepartmentPage.create_Random_Department_Name(data.getValueByName("NewDepartmentName"));

        sfaDepartmentPage.
                action_Click_On_Add_New_Department_Button();
        sfaAddDepartmentPage.
                step_Add_New_Department(AddDepartmentCompanyName, NewDepartmentName);*/
        sfaDepartmentPage.
                action_Select_Company_From_Company_Name_Dropdown_In_Advance_Search_Section(AddDepartmentCompanyName);
        sfaDepartmentPage.
                action_Click_On_Search_Button_In_Advance_Search_Section();

        //Check able to sort data ascending
        sfaDepartmentPage
                .check_and_Validate_Order_Data_Ascending();
        System.out.println("Data sort to Ascending...!");

        //Check able to sort data descending
        sfaDepartmentPage
                .check_and_Validate_Order_Data_Descending();
        System.out.println("Data sort to Descending...!");
    }

    //Test Case - 3423
    //Behaviour Of The Pagination Section
    @Test
    public void check_And_Validate_Behaviour_Of_The_Pagination_Section() throws InterruptedException {
        String AddDepartmentCompanyName = data.getValueByName("AddDepartmentCompanyName");
        String RecentlyAddedDepartment="";

        sfaDepartmentPage.
                action_Select_Company_From_Company_Name_Dropdown_In_Advance_Search_Section(AddDepartmentCompanyName);
        sfaDepartmentPage.
                action_Click_On_Search_Button_In_Advance_Search_Section();

        String LastRecordOfTheTable = sfaDepartmentPage.step_Get_Last_Record_Of_The_Table();

        System.out.println("Last record :" + LastRecordOfTheTable);

        Integer noOfRows = Integer.parseInt(sfaDepartmentPage.step_Get_No_Of_Records_In_Data_Table());

        if(noOfRows<= 10)
        {
            for (int i = noOfRows+1; i <= 11; i++) {

                System.out.println("Row Count : " + i);

                String NewDepartment = sfaAddDepartmentPage.create_Random_Department_Name(data.getValueByName("NewDepartmentName"));
                RecentlyAddedDepartment = NewDepartment;
                sfaDepartmentPage.
                        action_Click_On_Add_New_Department_Button();
                sfaAddDepartmentPage.
                        step_Add_New_Department(AddDepartmentCompanyName, NewDepartment);

                Thread.sleep(2000);
            }
        }

        System.out.println("Recently added department :" + RecentlyAddedDepartment);

        //Validate Next button
        sfaDepartmentPage.action_Click_On_Next_Button_From_Pagination_Section();
        sfaDepartmentPage.check_and_Validate_Next_Button_In_Pagination_Section(LastRecordOfTheTable);

        //Validate Previous button
        sfaDepartmentPage.action_Click_On_Previous_Button_From_Pagination_Section();
        sfaDepartmentPage.check_and_Validate_Previous_Button_In_Pagination_Section(RecentlyAddedDepartment);

        //Validate Page 2
        sfaDepartmentPage.action_Click_On_Page_2_From_Pagination_Section();
        sfaDepartmentPage.check_and_Validate_Page_2_In_Pagination_Section(LastRecordOfTheTable);

        //Validate Page 1
        sfaDepartmentPage.action_Click_On_Page_1_From_Pagination_Section();
        sfaDepartmentPage.check_and_Validate_Page_1_In_Pagination_Section(RecentlyAddedDepartment);


    }

}
