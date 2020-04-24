package com.webQuarters.qa.test.Employee;

import com.webQuarters.qa.automation.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by e.koshila on 4/10/2020.
 */
public class SFAEditEmployeeTest extends TestBase {

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
        quitDriver();
    }

    //Test Case - 3542, 3547
    //-----------UI Testing -------------

    //Verify navigation to Edit New Employee Info popup
    @Test
    public void check_And_Validate_Navigation_To_Edit_Employee_Info_Popup() throws InterruptedException {
        sfaEmployeePage.action_Click_On_Edit_Button_Of_A_Data_Record();
        sfaEditEmployeePage.check_And_Validate_Navigation_To_Edit_Employee_Info_Popup();
    }

    //Edit Employee Info popup title
    @Test
    public void check_Edit_Employee_Info_Popup_Title() throws InterruptedException {
        sfaEmployeePage.action_Click_On_Edit_Button_Of_A_Data_Record();

        String EditNewEmployeePopupTitle = data.getValueByName("EditEmployeePopupTitle");
        Assert.assertEquals(sfaEditEmployeePage.check_Popup_Title(), EditNewEmployeePopupTitle);
    }

    //Fields
    @Test
    public void check_Edit_Employee_Info_Popup_Fields() throws InterruptedException {
        sfaEmployeePage.action_Click_On_Edit_Button_Of_A_Data_Record();

        //Company Name
        String CompanyNameLabel = data.getValueByName("CompanyNameLabel");
        Assert.assertEquals(sfaEditEmployeePage.check_Company_Name_Label(), CompanyNameLabel);

        sfaEditEmployeePage.check_Company_Name_DropDown();

        //Company Branch Name
        String CompanyBranchNameLabel = data.getValueByName("CompanyBranchNameLabel");
        Assert.assertEquals(sfaEditEmployeePage.check_Company_Branch_Name_Label(), CompanyBranchNameLabel);

        sfaEditEmployeePage.
                check_Company_Branch_Name_Dropdown();

        //Department Name
        String DepartmentNameLabel = data.getValueByName("DepartmentNameLabel");
        Assert.assertEquals(sfaEditEmployeePage.check_Department_Name_Label(), DepartmentNameLabel);

        sfaEditEmployeePage.
                check_Department_Dropdown();

        //Designation Name
        String DesignationNameLabel = data.getValueByName("EmpDesignationNameLabel");
        Assert.assertEquals(sfaEditEmployeePage.check_Designation_Name_Label(), DesignationNameLabel);

        sfaEditEmployeePage.
                check_Designation_Dropdown();

        //Personal titles(Miss Mr Mrs)
        String TitleLabel = data.getValueByName("TitleLabel");
        Assert.assertEquals(sfaEditEmployeePage.check_Title_Name_Label(), TitleLabel);

        String PersonalTitleRadioOptions = data.getValueByName("PersonalTitleRadioOptions");
        Assert.assertEquals(sfaEditEmployeePage.check_Personal_Title_Radio_Options(), PersonalTitleRadioOptions);

        //Employee Number
        String EmployeeNumberLabel = data.getValueByName("EmployeeNumberLabel");
        Assert.assertEquals(sfaEditEmployeePage.check_Employee_Number_Label(), EmployeeNumberLabel);

        sfaEditEmployeePage.
                check_Employee_Number_TextBox();

        //First Name
        String FirstNameLabel = data.getValueByName("FirstNameLabel");
        Assert.assertEquals(sfaEditEmployeePage.check_First_Name_Label(), FirstNameLabel);

        sfaEditEmployeePage.
                check_First_Name_TextBox();

        //Middle Name
        String MiddleNameLabel = data.getValueByName("MiddleNameLabel");
        Assert.assertEquals(sfaEditEmployeePage.check_Middle_Name_Label(), MiddleNameLabel);

        sfaEditEmployeePage.
                check_Middle_Name_TextBox();

        //Last Name
        String LastNameLabel = data.getValueByName("LastNameLabel");
        Assert.assertEquals(sfaEditEmployeePage.check_Last_Name_Label(), LastNameLabel);

        sfaEditEmployeePage.
                check_Last_Name_TextBox();

        //Calling Name
        String CallingNameLabel = data.getValueByName("CallingNameLabel");
        Assert.assertEquals(sfaEditEmployeePage.check_Calling_Name_Label(), CallingNameLabel);

        sfaEditEmployeePage.
                check_Calling_Name_TextBox();

        //Mobile
        String MobileLabel = data.getValueByName("MobileLabel");
        Assert.assertEquals(sfaEditEmployeePage.check_Mobile_Label(), MobileLabel);

        sfaEditEmployeePage.
                check_Mobile_TextBox();

        //E-Mail Address
        String EMailAddressLabel = data.getValueByName("EmailAddressLabel");
        Assert.assertEquals(sfaEditEmployeePage.check_Email_Address_Label(), EMailAddressLabel);

        sfaEditEmployeePage.
                check_Email_Address_TextBox();

        //Employee Profile Image
        String EmployeeProfileImageLabel = data.getValueByName("EmployeeProfileImageLabel");
        Assert.assertEquals(sfaEditEmployeePage.check_Employee_Profile_Image_Label(), EmployeeProfileImageLabel);

        //Browse button
        String BrowseButtonText = data.getValueByName("BrowseButtonText");
        Assert.assertEquals(sfaEditEmployeePage.check_Browse_Button(), BrowseButtonText);

        //Save button
        String SaveButtonText = data.getValueByName("SaveButtonText");
        Assert.assertEquals(sfaEditEmployeePage.check_Save_Button(), SaveButtonText);

        //Close button
        String CloseButtonText = data.getValueByName("CloseButtonText");
        Assert.assertEquals(sfaEditEmployeePage.check_Close_Button(), CloseButtonText);

        //Close icon
        sfaEditEmployeePage.check_Close_Icon();
    }

    //-----------Functional Testing -------------

    //Test Case - 3513
    //Verify required fields
    @Test
    public void check_And_Validate_Required_Fields_When_Editing_Employee() throws InterruptedException {
        String AddEmployeeCompanyName = data.getValueByName("AddEmployeeCompanyName");
       /* String AddEmployeeCompanyBranchName = data.getValueByName("AddEmployeeCompanyBranchName");
        String AddEmployeeDepartmentName  = data.getValueByName("AddEmployeeDepartmentName");
        String AddEmployeeDesignationName   = data.getValueByName("AddEmployeeDesignationName");*/
        String AddEmployeeNumber = "Emp_No_" + sfaAddEmployeePage.create_Random_Employee_Records();
        String AddEmployeePersonalTitle = data.getValueByName("AddEmployeePersonalTitle");
        String AddEmployeeFName = "Emp_"+ AddEmployeeNumber;
        String AddEmployeeMName = data.getValueByName("AddEmployeeMName");
        String AddEmployeeLName = data.getValueByName("AddEmployeeLName");
        String AddEmployeeCName = data.getValueByName("AddEmployeeCName");
        String AddEmployeeMobile = data.getValueByName("AddEmployeeMobile");
        String NewEmployeeEmail = AddEmployeeNumber + sfaAddEmployeePage.create_Random_Employee_Email_Address(data.getValueByName("MailinatorDomainName"));
        String RequiredMsg = data.getValueByName("RequiredMsg");

        sfaEmployeePage.
                action_Click_On_Add_New_Employee_Button();
        sfaAddEmployeePage.
                step_Add_New_Employee(AddEmployeeCompanyName, /*AddEmployeeCompanyBranchName, AddEmployeeDepartmentName, AddEmployeeDesignationName,*/ AddEmployeePersonalTitle, AddEmployeeNumber, AddEmployeeFName, AddEmployeeMName, AddEmployeeLName, AddEmployeeCName, AddEmployeeMobile, NewEmployeeEmail);

        //Navigate to Edit popup of the added employee
        sfaEmployeePage.
                action_Select_Company_From_Company_Name_Dropdown_In_Advance_Search_Section(AddEmployeeCompanyName);
        sfaEmployeePage.
                action_Click_On_Search_Button_In_Advance_Search_Section();
        sfaEmployeePage.
                step_Navigate_To_Edit_Popup_Of_A_Selected_Employee_From_Data_Table(NewEmployeeEmail);

        Assert.assertEquals(sfaEditEmployeePage.check_And_Validate_Company_Name_Is_Required_When_Editing_Employee(), RequiredMsg);
        Assert.assertEquals(sfaEditEmployeePage.check_And_Validate_Company_Branch_Name_Is_Required_When_Editing_Employee(), RequiredMsg);
        Assert.assertEquals(sfaEditEmployeePage.check_And_Validate_Department_Name_Is_Required_When_Editing_Employee(), RequiredMsg);
        Assert.assertEquals(sfaEditEmployeePage.check_And_Validate_Designation_Name_Is_Required_When_Editing_Employee(), RequiredMsg);
        Assert.assertEquals(sfaEditEmployeePage.check_And_Validate_Employee_Number_Is_Required_When_Editing_Employee(), RequiredMsg);
        Assert.assertEquals(sfaEditEmployeePage.check_And_Validate_First_Name_Is_Required_When_Editing_Employee(), RequiredMsg);
        Assert.assertEquals(sfaEditEmployeePage.check_And_Validate_Calling_Name_Is_Required_When_Editing_Employee(), RequiredMsg);
        Assert.assertEquals(sfaEditEmployeePage.check_And_Validate_Mobile_Is_Required_When_Editing_Employee(), RequiredMsg);
        Assert.assertEquals(sfaEditEmployeePage.check_And_Validate_Email_Is_Required_When_Editing_Employee(), RequiredMsg);

        System.out.println(" Required fields test");
    }

    //Test Case - 3514
    //Add duplicate Employee when editing
    @Test
    public void check_And_Validate_System_Not_Allow_To_Add_Duplicate_Employee_Names_When_Editing() throws InterruptedException {
        String AddEmployeeCompanyName = data.getValueByName("AddEmployeeCompanyName");
        /* String AddEmployeeCompanyBranchName = data.getValueByName("AddEmployeeCompanyBranchName");
        String AddEmployeeDepartmentName  = data.getValueByName("AddEmployeeDepartmentName");
        String AddEmployeeDesignationName   = data.getValueByName("AddEmployeeDesignationName");*/
        String AddEmployeeNumber = "Emp_No_" + sfaAddEmployeePage.create_Random_Employee_Records();
        String AddEmployeePersonalTitle = data.getValueByName("AddEmployeePersonalTitle");
        String AddEmployeeFName = "Emp_"+ AddEmployeeNumber;
        String AddEmployeeMName = data.getValueByName("AddEmployeeMName");
        String AddEmployeeLName = data.getValueByName("AddEmployeeLName");
        String AddEmployeeCName = data.getValueByName("AddEmployeeCName");
        String AddEmployeeMobile = data.getValueByName("AddEmployeeMobile");
        String NewEmployeeEmail1 = AddEmployeeNumber + sfaAddEmployeePage.create_Random_Employee_Email_Address(data.getValueByName("MailinatorDomainName"));
        String NewEmployeeEmail2 = AddEmployeeNumber + sfaAddEmployeePage.create_Random_Employee_Email_Address(data.getValueByName("MailinatorDomainName"));
        String DuplicateErrorMessage = data.getValueByName("DuplicateEmployeeErrorMessage");

        System.out.println("1st Employee : "+ NewEmployeeEmail1);
        System.out.println("2nd Employee : "+ NewEmployeeEmail2);

        //Add Employee 1
        sfaEmployeePage.
                action_Click_On_Add_New_Employee_Button();
        sfaAddEmployeePage.
                step_Add_New_Employee(AddEmployeeCompanyName, /*AddEmployeeCompanyBranchName, AddEmployeeDepartmentName, AddEmployeeDesignationName,*/ AddEmployeePersonalTitle, AddEmployeeNumber, AddEmployeeFName, AddEmployeeMName, AddEmployeeLName, AddEmployeeCName, AddEmployeeMobile, NewEmployeeEmail1);

        //Add Employee 2
        Thread.sleep(2000);
        sfaEmployeePage.
                action_Click_On_Add_New_Employee_Button();
        sfaAddEmployeePage.
                step_Add_New_Employee(AddEmployeeCompanyName, /*AddEmployeeCompanyBranchName, AddEmployeeDepartmentName, AddEmployeeDesignationName,*/ AddEmployeePersonalTitle, AddEmployeeNumber, AddEmployeeFName, AddEmployeeMName, AddEmployeeLName, AddEmployeeCName, AddEmployeeMobile, NewEmployeeEmail2);


        //Navigate to Edit popup of added Employee
        sfaEmployeePage.
                action_Select_Company_From_Company_Name_Dropdown_In_Advance_Search_Section(AddEmployeeCompanyName);
        sfaEmployeePage.
                action_Click_On_Search_Button_In_Advance_Search_Section();
        sfaEmployeePage.
                step_Navigate_To_Edit_Popup_Of_A_Selected_Employee_From_Data_Table(NewEmployeeEmail2);

        //Enter duplicate data (Employee 1 name as Employee 2)
        sfaEditEmployeePage.step_Edit_Employee(AddEmployeeCompanyName,NewEmployeeEmail2);

        Assert.assertEquals(sfaEditEmployeePage.check_And_Validate_Duplicate_Employee_Error_Message(),DuplicateErrorMessage);


    }



    ///////////////////////////////////////////////



    //Test Case - 3428
    //Edit Employee Name
    @Test
    public void check_And_Validate_User_Able_To_Edit_Employee() throws InterruptedException {
        String AddEmployeeCompanyName = data.getValueByName("AddEmployeeCompanyName");
        /* String AddEmployeeCompanyBranchName = data.getValueByName("AddEmployeeCompanyBranchName");
        String AddEmployeeDepartmentName  = data.getValueByName("AddEmployeeDepartmentName");
        String AddEmployeeDesignationName   = data.getValueByName("AddEmployeeDesignationName");*/
        String AddEmployeeNumber = "Emp_No_" + sfaAddEmployeePage.create_Random_Employee_Records();
        String AddEmployeePersonalTitle = data.getValueByName("AddEmployeePersonalTitle");
        String AddEmployeeFName = "Emp_"+ AddEmployeeNumber;
        String AddEmployeeMName = data.getValueByName("AddEmployeeMName");
        String AddEmployeeLName = data.getValueByName("AddEmployeeLName");
        String AddEmployeeCName = data.getValueByName("AddEmployeeCName");
        String AddEmployeeMobile = data.getValueByName("AddEmployeeMobile");
        String NewEmployeeEmail = AddEmployeeNumber + sfaAddEmployeePage.create_Random_Employee_Email_Address(data.getValueByName("MailinatorDomainName"));
        String EditEmployeeSuccessMessage = data.getValueByName("EditEmployeeSuccessMessage");

        String EditEmployeeNumber = AddEmployeeNumber + "Edit";
        String EditEmployeePersonalTitle = data.getValueByName("EditEmployeePersonalTitle");
        String EditEmployeeFName = AddEmployeeFName + "Edit";
        String EditEmployeeMName = AddEmployeeMName + "Edit";
        String EditEmployeeLName = AddEmployeeLName + "Edit";
        String EditEmployeeCName = AddEmployeeCName + "Edit";
        String EditEmployeeMobile = AddEmployeeMobile + "Edit";
        String EditEmployeeEmail = "Edit" + NewEmployeeEmail;

        System.out.println("new : " + NewEmployeeEmail);
        System.out.println("new : " + EditEmployeeEmail);

        //Add employee
        sfaEmployeePage.
                action_Click_On_Add_New_Employee_Button();
        sfaAddEmployeePage.
                step_Add_New_Employee(AddEmployeeCompanyName, /*AddEmployeeCompanyBranchName, AddEmployeeDepartmentName, AddEmployeeDesignationName,*/ AddEmployeePersonalTitle, AddEmployeeNumber, AddEmployeeFName, AddEmployeeMName, AddEmployeeLName, AddEmployeeCName, AddEmployeeMobile, NewEmployeeEmail);

        //Search employee using Advanced search
        sfaEmployeePage.
                action_Select_Company_From_Company_Name_Dropdown_In_Advance_Search_Section(AddEmployeeCompanyName);
        sfaEmployeePage.
                action_Click_On_Search_Button_In_Advance_Search_Section();
        sfaEmployeePage.
                step_Navigate_To_Edit_Popup_Of_A_Selected_Employee_From_Data_Table(NewEmployeeEmail);

        //Edit previously added employee
        sfaEditEmployeePage.step_Edit_Employee_Details(AddEmployeeCompanyName, /*EditEmployeeCompanyBranchName, EditEmployeeDepartmentName, EditEmployeeDesignationName,*/ EditEmployeePersonalTitle, EditEmployeeNumber, EditEmployeeFName, EditEmployeeMName, EditEmployeeLName, EditEmployeeCName, EditEmployeeMobile, EditEmployeeEmail);
        Assert.assertEquals(sfaEditEmployeePage.check_And_Validate_Edit_Employee_Success_Message(),EditEmployeeSuccessMessage);

        //Search edited employee using Advanced search
        sfaEmployeePage.
                action_Select_Company_From_Company_Name_Dropdown_In_Advance_Search_Section(AddEmployeeCompanyName);
        sfaEmployeePage.
                action_Click_On_Search_Button_In_Advance_Search_Section();
        sfaEmployeePage.
                check_And_Validate_Is_Value_Exist_In_Edit_Data_Table(EditEmployeePersonalTitle, EditEmployeeNumber, EditEmployeeFName, EditEmployeeMName, EditEmployeeLName, EditEmployeeCName, EditEmployeeMobile, EditEmployeeEmail);

    }

    //Test Case - 3467
    //Quit from Edit New Employee Info popup
    @Test
    public void check_And_Validate_User_Able_To_Close_Edit_Employee_Info_popup() throws InterruptedException {
        String AddEmployeeCompanyName = data.getValueByName("AddEmployeeCompanyName");
        /* String AddEmployeeCompanyBranchName = data.getValueByName("AddEmployeeCompanyBranchName");
        String AddEmployeeDepartmentName  = data.getValueByName("AddEmployeeDepartmentName");
        String AddEmployeeDesignationName   = data.getValueByName("AddEmployeeDesignationName");*/
        String AddEmployeeNumber = "Emp_No_" + sfaAddEmployeePage.create_Random_Employee_Records();
        String AddEmployeePersonalTitle = data.getValueByName("AddEmployeePersonalTitle");
        String AddEmployeeFName = "Emp_"+ AddEmployeeNumber;
        String AddEmployeeMName = data.getValueByName("AddEmployeeMName");
        String AddEmployeeLName = data.getValueByName("AddEmployeeLName");
        String AddEmployeeCName = data.getValueByName("AddEmployeeCName");
        String AddEmployeeMobile = data.getValueByName("AddEmployeeMobile");
        String NewEmployeeEmail = AddEmployeeNumber + sfaAddEmployeePage.create_Random_Employee_Email_Address(data.getValueByName("MailinatorDomainName"));

        System.out.println("new : " + NewEmployeeEmail);

        //Add employee
        sfaEmployeePage.
                action_Click_On_Add_New_Employee_Button();
        sfaAddEmployeePage.
                step_Add_New_Employee(AddEmployeeCompanyName, /*AddEmployeeCompanyBranchName, AddEmployeeDepartmentName, AddEmployeeDesignationName,*/ AddEmployeePersonalTitle, AddEmployeeNumber, AddEmployeeFName, AddEmployeeMName, AddEmployeeLName, AddEmployeeCName, AddEmployeeMobile, NewEmployeeEmail);

        //Search employee using Advanced search
        sfaEmployeePage.
                action_Select_Company_From_Company_Name_Dropdown_In_Advance_Search_Section(AddEmployeeCompanyName);
        sfaEmployeePage.
                action_Click_On_Search_Button_In_Advance_Search_Section();
        sfaEmployeePage.
                step_Navigate_To_Edit_Popup_Of_A_Selected_Employee_From_Data_Table(NewEmployeeEmail);

        //Close button
        sfaEmployeePage.
                step_Navigate_To_Edit_Popup_Of_A_Selected_Employee_From_Data_Table(NewEmployeeEmail);
        Assert.assertEquals(sfaEditEmployeePage.check_And_Validate_Close_The_Popup_By_Clicking_On_Close_Button(),false);

        //Close icon
        sfaEmployeePage.
                step_Navigate_To_Edit_Popup_Of_A_Selected_Employee_From_Data_Table(NewEmployeeEmail);
        Assert.assertEquals(sfaEditEmployeePage.check_And_Validate_Close_The_Popup_By_Clicking_On_Close_Icon(),false);

    }
}
