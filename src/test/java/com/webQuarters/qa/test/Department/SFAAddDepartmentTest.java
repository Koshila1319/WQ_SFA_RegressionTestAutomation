package com.webQuarters.qa.test.Department;

import com.webQuarters.qa.automation.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by e.koshila on 3/17/2020.
 */
public class SFAAddDepartmentTest extends TestBase {

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
                verify_Navigate_To_Department_Page();
    }

    @AfterMethod
    public void endTestMethod() throws Throwable{
        Thread.sleep(3000);
        quitDriver();
    }

    //Test Case - 4210, 3456
    //-----------UI Testing -------------

    //Verify navigation to Add New Department Info popup
    @Test
    public void check_And_Validate_Navigation_To_Add_New_Department_Info_Popup() throws InterruptedException {
        sfaDepartmentPage.
                action_Click_On_Add_New_Department_Button();
        sfaAddDepartmentPage.
                check_And_Validate_Navigation_To_Add_New_Department_Info_Popup();
    }

    //Add New Department Info popup title
    @Test
    public void check_Add_New_Department_Info_Popup_Title() throws InterruptedException {
        sfaDepartmentPage.action_Click_On_Add_New_Department_Button();

        String AddNewDepartmentPopupTitle = data.getValueByName("AddNewDepartmentPopupTitle");
        Assert.assertEquals(sfaAddDepartmentPage.check_Popup_Title(), AddNewDepartmentPopupTitle);
    }

    //Fields
    @Test
    public void check_Add_New_Department_Info_Popup_Fields() throws InterruptedException {
        sfaDepartmentPage.action_Click_On_Add_New_Department_Button();

        //Company Name
        String CompanyNameLabel = data.getValueByName("CompanyNameLabel");
        Assert.assertEquals(sfaAddDepartmentPage.check_Company_Name_Label(), CompanyNameLabel);

        sfaAddDepartmentPage.
                check_Company_Name_DropDown();

        //Department Name
        String DepartmentNameLabel = data.getValueByName("DepartmentNameLabel");
        Assert.assertEquals(sfaAddDepartmentPage.check_Department_Name_Label(), DepartmentNameLabel);

        sfaAddDepartmentPage.
                check_Department_Name_TextBox();

        //Save button
        String SaveButtonText = data.getValueByName("SaveButtonText");
        Assert.assertEquals(sfaAddDepartmentPage.check_Save_Button(), SaveButtonText);

        //Close button
        String CloseButtonText = data.getValueByName("CloseButtonText");
        Assert.assertEquals(sfaAddDepartmentPage.check_Close_Button(), CloseButtonText);

        //Close icon
        sfaAddDepartmentPage.
                check_Close_Icon();
    }

    //-----------Functional Testing -------------

    //Test Case - 3462
    //Add New Department
    @Test
    public void check_And_Validate_User_Able_To_Add_New_Department_Successfully() throws InterruptedException {
        String AddDepartmentCompanyName = data.getValueByName("AddDepartmentCompanyName");
        String NewDepartmentName = sfaAddDepartmentPage.create_Random_Department_Name(data.getValueByName("NewDepartmentName"));
        String AddDepartmentSuccessMessage = data.getValueByName("AddDepartmentSuccessMessage");

        sfaDepartmentPage.
                action_Click_On_Add_New_Department_Button();
        sfaAddDepartmentPage.
                step_Add_New_Department(AddDepartmentCompanyName,NewDepartmentName);
        Assert.assertEquals(sfaAddDepartmentPage.check_And_Validate_Add_Department_Success_Message(), AddDepartmentSuccessMessage);

        sfaDepartmentPage.
                action_Select_Company_From_Company_Name_Dropdown_In_Advance_Search_Section(AddDepartmentCompanyName);
        sfaDepartmentPage.
                action_Click_On_Search_Button_In_Advance_Search_Section();
        sfaDepartmentPage.
                check_And_Validate_Is_Value_Exist_In_Data_Table(NewDepartmentName);
    }

    //Test Case - 3465
    //Quit from Add New Department Info popup
    @Test
    public void check_And_Validate_User_Able_To_Close_Add_New_Department_Info_popup() throws InterruptedException {
        sfaDepartmentPage.
                action_Click_On_Add_New_Department_Button();
        Assert.assertEquals(sfaAddDepartmentPage.check_And_Validate_Close_The_Popup_By_Clicking_On_Close_Button(),false);

        sfaDepartmentPage.
                action_Click_On_Add_New_Department_Button();
        Assert.assertEquals(sfaAddDepartmentPage.check_And_Validate_Close_The_Popup_By_Clicking_On_Close_Icon(),false);

   }

    //Test Case - 3463
    //Verify required fields
    @Test
    public void check_And_Validate_Required_Fields_When_Adding_New_Department() throws InterruptedException {
        sfaDepartmentPage.
                action_Click_On_Add_New_Department_Button();

        String RequiredMsg = data.getValueByName("RequiredMsg");
        Assert.assertEquals(sfaAddDepartmentPage.check_And_Validate_Company_Name_Is_Required_When_Adding_New_Department(), RequiredMsg);
        Assert.assertEquals(sfaAddDepartmentPage.check_And_Validate_Department_Name_Is_Required_When_Adding_New_Department(), RequiredMsg);
    }

    //Test Case - 3464
    //Add duplicate department
    @Test
    public void check_And_Validate_System_Not_Allow_To_Add_Duplicate_Department_Names() throws InterruptedException {

        String AddDepartmentCompanyName = data.getValueByName("AddDepartmentCompanyName");
        String DuplicateAddDepartmentName = sfaAddDepartmentPage.create_Random_Department_Name(data.getValueByName("NewDepartmentName"));
        String DuplicateErrorMessage = data.getValueByName("DuplicateDepartmentErrorMessage");

        System.out.println("Dept : "+DuplicateAddDepartmentName);

        sfaDepartmentPage.
                action_Click_On_Add_New_Department_Button();
        sfaAddDepartmentPage.
                step_Add_New_Department(AddDepartmentCompanyName,DuplicateAddDepartmentName);
        sfaDepartmentPage.
                action_Click_On_Add_New_Department_Button();
        sfaAddDepartmentPage.
                step_Add_New_Department(AddDepartmentCompanyName,DuplicateAddDepartmentName);

        Assert.assertEquals(sfaAddDepartmentPage.check_And_Validate_Duplicate_Department_Error_Message(),DuplicateErrorMessage);
    }



}
