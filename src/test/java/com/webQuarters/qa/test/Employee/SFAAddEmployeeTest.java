package com.webQuarters.qa.test.Employee;

import com.webQuarters.qa.automation.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by e.koshila on 4/20/2020.
 */
public class SFAAddEmployeeTest extends TestBase {

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
        sfaHomePage.
                verify_Navigate_To_Employee_Page();
    }

    @AfterMethod
    public void endTestMethod() throws Throwable{
        Thread.sleep(3000);
       // quitDriver();
    }

    //Test Case - 3535, 3539
    //-----------UI Testing -------------

    //Verify navigation to Add New Employee Info popup
    @Test
    public void check_And_Validate_Navigation_To_Add_New_Employee_Info_Popup() throws InterruptedException {
        sfaEmployeePage.
                action_Click_On_Add_New_Employee_Button();
        sfaAddEmployeePage.
                check_And_Validate_Navigation_To_Add_New_Employee_Info_Popup();
    }

    //Add New Employee Info popup title
    @Test
    public void check_Add_New_Employee_Info_Popup_Title() throws InterruptedException {
        sfaEmployeePage.action_Click_On_Add_New_Employee_Button();

        String AddNewEmployeePopupTitle = data.getValueByName("AddNewEmployeePopupTitle");
        Assert.assertEquals(sfaAddEmployeePage.check_Popup_Title(), AddNewEmployeePopupTitle);
    }

    //Fields
    @Test
    public void check_Add_New_Employee_Info_Popup_Fields() throws InterruptedException {
        sfaEmployeePage.action_Click_On_Add_New_Employee_Button();

        //Company Name
        String CompanyNameLabel = data.getValueByName("CompanyNameLabel");
        Assert.assertEquals(sfaAddEmployeePage.check_Company_Name_Label(), CompanyNameLabel);

        sfaAddEmployeePage.
                check_Company_Name_DropDown();

        //Company Branch Name
        String CompanyBranchNameLabel = data.getValueByName("CompanyBranchNameLabel");
        Assert.assertEquals(sfaAddEmployeePage.check_Company_Branch_Name_Label(), CompanyBranchNameLabel);

        sfaAddEmployeePage.
                check_Company_Branch_Name_Dropdown();

        //Department Name
        String DepartmentNameLabel = data.getValueByName("DepartmentNameLabel");
        Assert.assertEquals(sfaAddEmployeePage.check_Department_Name_Label(), DepartmentNameLabel);

        sfaAddEmployeePage.
                check_Department_Dropdown();

        //Designation Name
        String DesignationNameLabel = data.getValueByName("EmpDesignationNameLabel");
        Assert.assertEquals(sfaAddEmployeePage.check_Designation_Name_Label(), DesignationNameLabel);

        sfaAddEmployeePage.
                check_Designation_Dropdown();

        //Personal titles(Miss Mr Mrs)
        String TitleLabel = data.getValueByName("TitleLabel");
        Assert.assertEquals(sfaAddEmployeePage.check_Title_Name_Label(), TitleLabel);

        String PersonalTitleRadioOptions = data.getValueByName("PersonalTitleRadioOptions");
        Assert.assertEquals(sfaAddEmployeePage.check_Personal_Title_Radio_Options(), PersonalTitleRadioOptions);

        //Employee Number
        String EmployeeNumberLabel = data.getValueByName("EmployeeNumberLabel");
        Assert.assertEquals(sfaAddEmployeePage.check_Employee_Number_Label(), EmployeeNumberLabel);

        sfaAddEmployeePage.
                check_Employee_Number_TextBox();

        //First Name
        String FirstNameLabel = data.getValueByName("FirstNameLabel");
        Assert.assertEquals(sfaAddEmployeePage.check_First_Name_Label(), FirstNameLabel);

        sfaAddEmployeePage.
                check_First_Name_TextBox();

        //Middle Name
        String MiddleNameLabel = data.getValueByName("MiddleNameLabel");
        Assert.assertEquals(sfaAddEmployeePage.check_Middle_Name_Label(), MiddleNameLabel);

        sfaAddEmployeePage.
                check_Middle_Name_TextBox();

        //Last Name
        String LastNameLabel = data.getValueByName("LastNameLabel");
        Assert.assertEquals(sfaAddEmployeePage.check_Last_Name_Label(), LastNameLabel);

        sfaAddEmployeePage.
                check_Last_Name_TextBox();

        //Calling Name
        String CallingNameLabel = data.getValueByName("CallingNameLabel");
        Assert.assertEquals(sfaAddEmployeePage.check_Calling_Name_Label(), CallingNameLabel);

        sfaAddEmployeePage.
                check_Calling_Name_TextBox();

        //Mobile
        String MobileLabel = data.getValueByName("MobileLabel");
        Assert.assertEquals(sfaAddEmployeePage.check_Mobile_Label(), MobileLabel);

        sfaAddEmployeePage.
                check_Mobile_TextBox();

        //E-Mail Address
        String EMailAddressLabel = data.getValueByName("EmailAddressLabel");
        Assert.assertEquals(sfaAddEmployeePage.check_Email_Address_Label(), EMailAddressLabel);

        sfaAddEmployeePage.
                check_Email_Address_TextBox();

        //Employee Profile Image
        String EmployeeProfileImageLabel = data.getValueByName("EmployeeProfileImageLabel");
        Assert.assertEquals(sfaAddEmployeePage.check_Employee_Profile_Image_Label(), EmployeeProfileImageLabel);

        //Browse button
        String BrowseButtonText = data.getValueByName("BrowseButtonText");
        Assert.assertEquals(sfaAddEmployeePage.check_Browse_Button(), BrowseButtonText);

        //Save button
        String SaveButtonText = data.getValueByName("SaveButtonText");
        Assert.assertEquals(sfaAddEmployeePage.check_Save_Button(), SaveButtonText);

        //Close button
        String CloseButtonText = data.getValueByName("CloseButtonText");
        Assert.assertEquals(sfaAddEmployeePage.check_Close_Button(), CloseButtonText);

        //Close icon
        sfaAddEmployeePage.
                check_Close_Icon();
    }

    //-----------Functional Testing -------------

    //Test Case - 3493
    //Add New Employee
    @Test
    public void check_And_Validate_User_Able_To_Add_New_Employee_Successfully() throws InterruptedException {
        String AddEmployeeCompanyName = data.getValueByName("AddEmployeeCompanyName");
        String AddEmployeeCompanyBranchName = data.getValueByName("AddEmployeeCompanyBranchName");
        String AddEmployeeDepartmentName  = data.getValueByName("AddEmployeeDepartmentName");
        String AddEmployeeDesignationName   = data.getValueByName("AddEmployeeDesignationName");
        String AddEmployeeNumber = "Emp_No_" + sfaAddEmployeePage.create_Random_Employee_Records();
        String AddEmployeePersonalTitle = data.getValueByName("AddEmployeePersonalTitle");
        String AddEmployeeFName = "Emp_"+ AddEmployeeNumber;
        String AddEmployeeMName = data.getValueByName("AddEmployeeMName");
        String AddEmployeeLName = data.getValueByName("AddEmployeeLName");
        String AddEmployeeCName = data.getValueByName("AddEmployeeCName");
        String AddEmployeeMobile = data.getValueByName("AddEmployeeMobile");
        String AddEmployeeEmail = AddEmployeeNumber + sfaAddEmployeePage.create_Random_Employee_Email_Address(data.getValueByName("MailinatorDomainName"));
        String AddEmployeeSuccessMessage = data.getValueByName("AddEmployeeSuccessMessage");

        sfaEmployeePage.
                action_Click_On_Add_New_Employee_Button();
        sfaAddEmployeePage.
                step_Add_New_Employee(AddEmployeeCompanyName, /*AddEmployeeCompanyBranchName, AddEmployeeDepartmentName, AddEmployeeDesignationName,*/ AddEmployeePersonalTitle, AddEmployeeNumber, AddEmployeeFName, AddEmployeeMName, AddEmployeeLName, AddEmployeeCName, AddEmployeeMobile, AddEmployeeEmail);
        Assert.assertEquals(sfaAddEmployeePage.check_And_Validate_Add_Employee_Success_Message(), AddEmployeeSuccessMessage);

        sfaEmployeePage.
                action_Select_Company_From_Company_Name_Dropdown_In_Advance_Search_Section(AddEmployeeCompanyName);
        sfaEmployeePage.
                action_Click_On_Search_Button_In_Advance_Search_Section();
        sfaEmployeePage.
                check_And_Validate_Is_Value_Exist_In_Data_Table(AddEmployeeEmail);
    }

    //Test Case - 3540
    //Quit from Add New Employee Info popup
    @Test
    public void check_And_Validate_User_Able_To_Close_Add_New_Employee_Info_popup() throws InterruptedException {
        sfaEmployeePage.
                action_Click_On_Add_New_Employee_Button();
        Assert.assertEquals(sfaAddEmployeePage.check_And_Validate_Close_The_Popup_By_Clicking_On_Close_Button(),false);

        sfaEmployeePage.
                action_Click_On_Add_New_Employee_Button();
        Assert.assertEquals(sfaAddEmployeePage.check_And_Validate_Close_The_Popup_By_Clicking_On_Close_Icon(),false);

   }

    //Test Case - 3537
    //Verify required fields
    @Test
    public void check_And_Validate_Required_Fields_When_Adding_New_Employee() throws InterruptedException {
        sfaEmployeePage.
                action_Click_On_Add_New_Employee_Button();

        String RequiredMsg = data.getValueByName("RequiredMsg");
        Assert.assertEquals(sfaAddEmployeePage.check_And_Validate_Company_Name_Is_Required_When_Adding_New_Employee(), RequiredMsg);
        Assert.assertEquals(sfaAddEmployeePage.check_And_Validate_Company_Branch_Name_Is_Required_When_Adding_New_Employee(), RequiredMsg);
        Assert.assertEquals(sfaAddEmployeePage.check_And_Validate_Department_Name_Is_Required_When_Adding_New_Employee(), RequiredMsg);
        Assert.assertEquals(sfaAddEmployeePage.check_And_Validate_Designation_Name_Is_Required_When_Adding_New_Employee(), RequiredMsg);
        Assert.assertEquals(sfaAddEmployeePage.check_And_Validate_Employee_Number_Is_Required_When_Adding_New_Employee(), RequiredMsg);
        Assert.assertEquals(sfaAddEmployeePage.check_And_Validate_First_Name_Is_Required_When_Adding_New_Employee(), RequiredMsg);
        Assert.assertEquals(sfaAddEmployeePage.check_And_Validate_Calling_Name_Is_Required_When_Adding_New_Employee(), RequiredMsg);
        Assert.assertEquals(sfaAddEmployeePage.check_And_Validate_Mobile_Is_Required_When_Adding_New_Employee(), RequiredMsg);
        Assert.assertEquals(sfaAddEmployeePage.check_And_Validate_Email_Is_Required_When_Adding_New_Employee(), RequiredMsg);
    }

    //Test Case - 3538
    //Add duplicate Employee
    @Test
    public void check_And_Validate_System_Not_Allow_To_Add_Duplicate_Employee_Names() throws InterruptedException {

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
        String DuplicateEmployeeEmail = AddEmployeeNumber + sfaAddEmployeePage.create_Random_Employee_Email_Address(data.getValueByName("MailinatorDomainName"));
        String DuplicateErrorMessage = data.getValueByName("DuplicateEmployeeErrorMessage");

        System.out.println("Emp : "+DuplicateEmployeeEmail);

        sfaEmployeePage.
                action_Click_On_Add_New_Employee_Button();
        sfaAddEmployeePage.
                step_Add_New_Employee(AddEmployeeCompanyName, /*AddEmployeeCompanyBranchName, AddEmployeeDepartmentName, AddEmployeeDesignationName,*/ AddEmployeePersonalTitle, AddEmployeeNumber, AddEmployeeFName, AddEmployeeMName, AddEmployeeLName, AddEmployeeCName, AddEmployeeMobile, DuplicateEmployeeEmail);

        Thread.sleep(3000);
        sfaEmployeePage.
                action_Click_On_Add_New_Employee_Button();
        sfaAddEmployeePage.
                step_Add_New_Employee(AddEmployeeCompanyName, /*AddEmployeeCompanyBranchName, AddEmployeeDepartmentName, AddEmployeeDesignationName,*/ AddEmployeePersonalTitle, AddEmployeeNumber, AddEmployeeFName, AddEmployeeMName, AddEmployeeLName, AddEmployeeCName, AddEmployeeMobile, DuplicateEmployeeEmail);


        Assert.assertEquals(sfaAddEmployeePage.check_And_Validate_Duplicate_Employee_Error_Message(),DuplicateErrorMessage);
    }
}
