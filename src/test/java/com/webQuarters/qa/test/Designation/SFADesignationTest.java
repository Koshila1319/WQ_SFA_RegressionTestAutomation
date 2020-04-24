package com.webQuarters.qa.test.Designation;

import com.webQuarters.qa.automation.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by e.koshila on 4/10/2020.
 */
public class SFADesignationTest extends TestBase {

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
        sfaHomePage.verify_Navigate_To_Designation_Page();
    }

    @AfterMethod
    public void endTestMethod() throws Throwable{
        Thread.sleep(3000);
        //quitDriver();
    }

    //Test Case - 3504, 3487
    //-----------UI Testing -------------

    //Designation page title
    @Test
    public void check_Designation_Page_Title() {
        String DesignationPageTitle = data.getValueByName("DesignationPageTitle");
        Assert.assertEquals(sfaDesignationPage.check_Designation_Page_Title(), DesignationPageTitle);
    }

    //Breadcrumb
    @Test
    public void check_Designation_Page_Breadcrumb_Is_Available() {
        sfaDesignationPage.check_Designation_Page_Breadcrumb_Is_Available();
    }

    //Add new Designation button
    @Test
    public void check_Add_New_Designation_Button_Is_Available() {
        sfaDesignationPage.check_Add_New_Designation_Button_Is_Available();
    }

    @Test
    public void check_List_of_Designation_Section() {
        String ListOfDesignationTitle = data.getValueByName("ListOfDesignationTitle");
        Assert.assertEquals(sfaDesignationPage.check_List_of_Designation_Section_Title(),ListOfDesignationTitle);

        /*String RecordsPerPageText = data.getValueByName("RecordsPerPageText");
        Assert.assertEquals(sfaDesignationPage.check_Records_Per_Page_Section(),RecordsPerPageText);*/

        String TextBasedSearchText = data.getValueByName("TextBasedSearchText");
        Assert.assertEquals(sfaDesignationPage.check_Text_Based_Search_Section(),TextBasedSearchText);

        String ButtonsText = data.getValueByName("ListDesignationsButtonsText");
        Assert.assertEquals(sfaDesignationPage.check_Buttons_Section(),ButtonsText);

        sfaDesignationPage.check_Buttons_Section();

        sfaDesignationPage.check_Data_Table_Is_Available();

        String DesignationDataTableColumns = data.getValueByName("DesignationDataTableColumns");
        Assert.assertEquals(sfaDesignationPage.check_Designation_Table_Columns(),DesignationDataTableColumns);

        String NothingFoundText = data.getValueByName("NothingFoundText");
        Assert.assertEquals(sfaDesignationPage.check_Nothing_Found_Text_In_Data_Table(),NothingFoundText);

        String NoRecordsText = data.getValueByName("NoRecordsText");
        Assert.assertEquals(sfaDesignationPage.check_No_Records_Found_Text(),NoRecordsText);

        sfaDesignationPage.check_Pagination_Section_Available();

    }

    //Test Case - 3498
    //Advanced Search section
    @Test
    public void check_Advance_Search_Section() {
        String AdvancedSearchTitle = data.getValueByName("AdvanceSearchTitle");
        Assert.assertEquals(sfaDesignationPage.check_Advance_Search_Section_Title(),AdvancedSearchTitle);

        String CompanyNameLabel = data.getValueByName("CompanyNameLabel");
        Assert.assertEquals(sfaDesignationPage.check_Advance_Search_Section_Company_Name_Label(),CompanyNameLabel);

        sfaDesignationPage.check_Advance_Search_Section_Company_Name_Dropdown();

        String ResetButtonText = data.getValueByName("ResetButtonText");
        Assert.assertEquals(sfaDesignationPage.check_Reset_Button(),ResetButtonText);

        String SearchButtonText = data.getValueByName("SearchButtonText");
        Assert.assertEquals(sfaDesignationPage.check_Search_Button(),SearchButtonText);
    }

    //-----------Functional Testing -------------

    //Pagination disabled when no records
    @Test
    public void check_Pagination_Section_Is_Disabled_When_No_Data_In_Data_Table() {
        Assert.assertEquals(sfaDesignationPage.check_Pagination_Section_Is_Disabled_When_No_Data_In_Data_Table(), false);
    }

    //Test Case - 3503
    //Verify required fields
    @Test
    public void check_And_Validate_Company_Name_Is_Required_In_Advanced_Search_Section() throws InterruptedException {
        String RequiredMsg = data.getValueByName("RequiredMsg");
        Assert.assertEquals(sfaDesignationPage.check_And_Validate_Company_Name_Is_Required_In_Advanced_Search_Section(), RequiredMsg);

    }

    //Test Case - 3497
    @Test
    public void check_And_Validate_User_Able_To_Search_Designations() throws InterruptedException {
        String CompanyName = data.getValueByName("DesignationSearchCompanyName");
        sfaDesignationPage.action_Select_Company_From_Company_Name_Dropdown_In_Advance_Search_Section(CompanyName);
        sfaDesignationPage.action_Click_On_Search_Button_In_Advance_Search_Section();
        sfaDesignationPage.check_and_Validate_Retrieved_Data(CompanyName);
    }

    //Test Case - 3502
    @Test
    public void check_And_Validate_User_Able_To_Reset_Search_Field_Data() throws InterruptedException {
        String DefaultSelectedCompanyName = sfaDesignationPage.step_Get_Selected_Company_Name();
        String CompanyName = data.getValueByName("DesignationSearchCompanyName");
        sfaDesignationPage.action_Select_Company_From_Company_Name_Dropdown_In_Advance_Search_Section(CompanyName);
        sfaDesignationPage.action_Click_On_Reset_Button_In_Advance_Search_Section();

        String SelectedCompanyNameAfterReset = sfaDesignationPage.step_Get_Selected_Company_Name();
        Assert.assertEquals(SelectedCompanyNameAfterReset, DefaultSelectedCompanyName);
    }


    //Test Case - 3506
    //Text based search in the Data Table
    @Test
    public void check_And_Validate_Text_Based_Search_In_The_Data_Table() throws InterruptedException {
        String AddDesignationCompanyName = data.getValueByName("AddDesignationCompanyName");
        String NewDesignationName = sfaAddDesignationPage.create_Random_Designation_Name(data.getValueByName("NewDesignationName"));

        sfaDesignationPage.
                action_Click_On_Add_New_Designation_Button();
        sfaAddDesignationPage.
                step_Add_New_Designation(AddDesignationCompanyName,NewDesignationName);
        sfaDesignationPage.
                action_Select_Company_From_Company_Name_Dropdown_In_Advance_Search_Section(AddDesignationCompanyName);
        sfaDesignationPage.
                action_Click_On_Search_Button_In_Advance_Search_Section();
        sfaDesignationPage.
                Search_Data_By_Text_In_Data_Table(NewDesignationName);
        sfaDesignationPage.
                check_And_Validate_Is_Value_Exist_In_Data_Table(NewDesignationName);
    }

    //Test Case - 3508
    //Pre-Conditions - No of Designations should be less than 10 in the data table,  Remove previously downloaded SFA files from 'Download' Folder
    //Copy, Print, PDF and Excel Data
    @Test
    public void check_And_Validate_User_Able_To_Copy_Print_PDF_And_Excel_Data() throws InterruptedException {
        String AddDesignationCompanyName = data.getValueByName("AddDesignationCompanyName");
        String NewDesignationName = sfaAddDesignationPage.create_Random_Designation_Name(data.getValueByName("NewDesignationName"));

        sfaDesignationPage.
                action_Click_On_Add_New_Designation_Button();
        sfaAddDesignationPage.
                step_Add_New_Designation(AddDesignationCompanyName,NewDesignationName);
        sfaDesignationPage.
                action_Select_Company_From_Company_Name_Dropdown_In_Advance_Search_Section(AddDesignationCompanyName);
        sfaDesignationPage.
                action_Click_On_Search_Button_In_Advance_Search_Section();

        //Copy data
        String CopyToClipboardMsg = data.getValueByName("CopyToClipboardMsgTitle") + "\nCopied " + sfaDesignationPage.step_Get_No_Of_Records_In_Data_Table() + " rows to clipboard";
        Assert.assertEquals(sfaDesignationPage.check_and_Validate_Copy_Data(), CopyToClipboardMsg);
        System.out.println("Designation data Copied...!");

        //Print data
        String PrintPreviewTitle = data.getValueByName("PrintPreviewTitle");
        /*Assert.assertEquals(sfaDesignationPage.check_and_Validate_Print_Data(), PrintPreviewTitle);
        System.out.println("Designation data able to Print...!");*/

        //PDF data
        String DesignationsPDFFileName = data.getValueByName("DesignationsPDFFileName");
        Assert.assertEquals(sfaDesignationPage.check_and_Validate_PDF_Data(), DesignationsPDFFileName);
        System.out.println("Designation data download as a PDF...!");

        //Excel data
        String DesignationsExcelFileName = data.getValueByName("DesignationsExcelFileName");
        Assert.assertEquals(sfaDesignationPage.check_and_Validate_Excel_Data(), DesignationsExcelFileName);
        System.out.println("Designation data download as an Excel...!");

    }

    //Test Case - 3505
    //Sorting data Ascending and Descending order
    @Test
    public void check_And_Validate_User_Able_To_Sort_Data_Ascending_And_Descending() throws InterruptedException {
        String AddDesignationCompanyName = data.getValueByName("AddDesignationCompanyName");
        String NewDesignationName = sfaAddDesignationPage.create_Random_Designation_Name(data.getValueByName("NewDesignationName"));

        sfaDesignationPage.
                action_Click_On_Add_New_Designation_Button();
        sfaAddDesignationPage.
                step_Add_New_Designation(AddDesignationCompanyName, NewDesignationName);
        sfaDesignationPage.
                action_Select_Company_From_Company_Name_Dropdown_In_Advance_Search_Section(AddDesignationCompanyName);
        sfaDesignationPage.
                action_Click_On_Search_Button_In_Advance_Search_Section();

        //Check able to sort data ascending
        sfaDesignationPage
                .check_and_Validate_Order_Data_Ascending();
        System.out.println("Data sort to Ascending...!");

        //Check able to sort data descending
        sfaDesignationPage
                .check_and_Validate_Order_Data_Descending();
        System.out.println("Data sort to Descending...!");
    }

    //Test Case - 3507
    //Behaviour Of The Pagination Section
    @Test
    public void check_And_Validate_Behaviour_Of_The_Pagination_Section() throws InterruptedException {
        String AddDesignationCompanyName = data.getValueByName("AddDesignationCompanyName");
        String RecentlyAddedDesignation="";

        sfaDesignationPage.
                action_Select_Company_From_Company_Name_Dropdown_In_Advance_Search_Section(AddDesignationCompanyName);
        sfaDesignationPage.
                action_Click_On_Search_Button_In_Advance_Search_Section();

        String LastRecordOfTheTable = sfaDesignationPage.step_Get_Last_Record_Of_The_Table();

        System.out.println("Last record :" + LastRecordOfTheTable);

        Integer noOfRows = Integer.parseInt(sfaDesignationPage.step_Get_No_Of_Records_In_Data_Table());

        if(noOfRows<= 10)
        {
            for (int i = noOfRows+1; i <= 11; i++) {

                System.out.println("Row Count : " + i);

                String NewDesignation = sfaAddDesignationPage.create_Random_Designation_Name(data.getValueByName("NewDesignationName"));
                RecentlyAddedDesignation = NewDesignation;
                sfaDesignationPage.
                        action_Click_On_Add_New_Designation_Button();
                sfaAddDesignationPage.
                        step_Add_New_Designation(AddDesignationCompanyName, NewDesignation);

                Thread.sleep(2000);
            }
        }

        System.out.println("Recently added Designation :" + RecentlyAddedDesignation);

        //Validate Next button
        sfaDesignationPage.action_Click_On_Next_Button_From_Pagination_Section();
        sfaDesignationPage.check_and_Validate_Next_Button_In_Pagination_Section(LastRecordOfTheTable);

        //Validate Previous button
        sfaDesignationPage.action_Click_On_Previous_Button_From_Pagination_Section();
        sfaDesignationPage.check_and_Validate_Previous_Button_In_Pagination_Section(RecentlyAddedDesignation);

        //Validate Page 2
        sfaDesignationPage.action_Click_On_Page_2_From_Pagination_Section();
        sfaDesignationPage.check_and_Validate_Page_2_In_Pagination_Section(LastRecordOfTheTable);

        //Validate Page 1
        sfaDesignationPage.action_Click_On_Page_1_From_Pagination_Section();
        sfaDesignationPage.check_and_Validate_Page_1_In_Pagination_Section(RecentlyAddedDesignation);


    }

}
