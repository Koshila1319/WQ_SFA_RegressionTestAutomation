package com.webQuarters.qa.test.Department;

import com.webQuarters.qa.automation.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by e.koshila on 3/17/2020.
 */
public class SFAEditDepartmentTest extends TestBase {

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
        quitDriver();
    }

    //Test Case - 3468, 3427
    //-----------UI Testing -------------

    //Verify navigation to Edit New Department Info popup
    @Test
    public void check_And_Validate_Navigation_To_Edit_Department_Info_Popup() throws InterruptedException {
        sfaDepartmentPage.action_Click_On_Edit_Button_Of_A_Data_Record();
        sfaEditDepartmentPage.check_And_Validate_Navigation_To_Edit_Department_Info_Popup();
    }

    //Edit New Department Info popup title
    @Test
    public void check_Edit_Department_Info_Popup_Title() throws InterruptedException {
        sfaDepartmentPage.action_Click_On_Edit_Button_Of_A_Data_Record();

        String EditNewDepartmentPopupTitle = data.getValueByName("EditNewDepartmentPopupTitle");
        Assert.assertEquals(sfaEditDepartmentPage.check_Popup_Title(), EditNewDepartmentPopupTitle);
    }

    //Fields
    @Test
    public void check_Edit_Department_Info_Popup_Fields() throws InterruptedException {
        sfaDepartmentPage.action_Click_On_Edit_Button_Of_A_Data_Record();

        //Company Name
        String CompanyNameLabel = data.getValueByName("CompanyNameLabel");
        Assert.assertEquals(sfaEditDepartmentPage.check_Company_Name_Label(), CompanyNameLabel);

        sfaEditDepartmentPage.check_Company_Name_DropDown();

        //Department Name
        String DepartmentNameLabel = data.getValueByName("DepartmentNameLabel");
        Assert.assertEquals(sfaEditDepartmentPage.check_Department_Name_Label(), DepartmentNameLabel);

        sfaEditDepartmentPage.check_Department_Name_TextBox();

        //Save button
        String SaveButtonText = data.getValueByName("SaveButtonText");
        Assert.assertEquals(sfaEditDepartmentPage.check_Save_Button(), SaveButtonText);

        //Close button
        String CloseButtonText = data.getValueByName("CloseButtonText");
        Assert.assertEquals(sfaEditDepartmentPage.check_Close_Button(), CloseButtonText);

        //Close icon
        sfaEditDepartmentPage.check_Close_Icon();
    }

    //-----------Functional Testing -------------

    //Test Case - 3429
    //Verify required fields
    @Test
    public void check_And_Validate_Required_Fields_When_Editing_Department() throws InterruptedException {
        String AddDepartmentCompanyName = data.getValueByName("AddDepartmentCompanyName");
        String NewDepartmentName = sfaAddDepartmentPage.create_Random_Department_Name(data.getValueByName("NewDepartmentName"));
        String RequiredMsg = data.getValueByName("RequiredMsg");

        sfaDepartmentPage.
                action_Click_On_Add_New_Department_Button();
        sfaAddDepartmentPage.
                step_Add_New_Department(AddDepartmentCompanyName,NewDepartmentName);

        //Navigate to Edit popup of the added dept
        sfaDepartmentPage.
                action_Select_Company_From_Company_Name_Dropdown_In_Advance_Search_Section(AddDepartmentCompanyName);
        sfaDepartmentPage.
                action_Click_On_Search_Button_In_Advance_Search_Section();
        sfaDepartmentPage.
                step_Navigate_To_Edit_Popup_Of_A_Selected_Department_From_Data_Table(NewDepartmentName);

        Assert.assertEquals(sfaEditDepartmentPage.check_And_Validate_Company_Name_Is_Required_When_Editing_Department(), RequiredMsg);
        Assert.assertEquals(sfaEditDepartmentPage.check_And_Validate_Department_Name_Is_Required_When_Editing_Department(), RequiredMsg);
    }

    //Add duplicate department when editing
    @Test
    public void check_And_Validate_System_Not_Allow_To_Add_Duplicate_Department_Names_When_Editing() throws InterruptedException {
        String AddDepartmentCompanyName = data.getValueByName("AddDepartmentCompanyName");
        String NewDepartmentName1 = sfaAddDepartmentPage.create_Random_Department_Name(data.getValueByName("NewDepartmentName"));
        String NewDepartmentName2 = sfaAddDepartmentPage.create_Random_Department_Name(data.getValueByName("NewDepartmentName"));
        String DuplicateErrorMessage = data.getValueByName("DuplicateDepartmentErrorMessage");

        System.out.println("1st DEpt : "+ NewDepartmentName1);
        System.out.println("2nd DEpt : "+ NewDepartmentName2);

        //Add dept 1
        sfaDepartmentPage.
                action_Click_On_Add_New_Department_Button();
        sfaAddDepartmentPage.
                step_Add_New_Department(AddDepartmentCompanyName,NewDepartmentName1);

        //Add dept 2
        sfaDepartmentPage.
                action_Click_On_Add_New_Department_Button();
        sfaAddDepartmentPage.
                step_Add_New_Department(AddDepartmentCompanyName,NewDepartmentName2);

        //Navigate to Edit popup of added dept
        sfaDepartmentPage.
                action_Select_Company_From_Company_Name_Dropdown_In_Advance_Search_Section(AddDepartmentCompanyName);
        sfaDepartmentPage.
                action_Click_On_Search_Button_In_Advance_Search_Section();
        sfaDepartmentPage.
                step_Navigate_To_Edit_Popup_Of_A_Selected_Department_From_Data_Table(NewDepartmentName2);

        //Enter duplicate data (dept1 name as dept 2)
        sfaEditDepartmentPage.step_Edit_Department(AddDepartmentCompanyName,NewDepartmentName1);

        Assert.assertEquals(sfaEditDepartmentPage.check_And_Validate_Duplicate_Department_Error_Message(),DuplicateErrorMessage);


    }

    //Test Case - 3428
    //Edit Department Name
    @Test
    public void check_And_Validate_User_Able_To_Edit_Department() throws InterruptedException {
        String AddDepartmentCompanyName = data.getValueByName("AddDepartmentCompanyName");
        String NewDepartmentName = sfaAddDepartmentPage.create_Random_Department_Name(data.getValueByName("NewDepartmentName"));
        String EditDepartmentName = NewDepartmentName + "Edit";
        String EditDepartmentSuccessMessage = data.getValueByName("EditDepartmentSuccessMessage");

        System.out.println("new : " + NewDepartmentName);

        //Add dept
        sfaDepartmentPage.
                action_Click_On_Add_New_Department_Button();
        sfaAddDepartmentPage.
                step_Add_New_Department(AddDepartmentCompanyName,NewDepartmentName);

        //Search depts using Advanced search
        sfaDepartmentPage.
                action_Select_Company_From_Company_Name_Dropdown_In_Advance_Search_Section(AddDepartmentCompanyName);
        sfaDepartmentPage.
                action_Click_On_Search_Button_In_Advance_Search_Section();
        sfaDepartmentPage.
                step_Navigate_To_Edit_Popup_Of_A_Selected_Department_From_Data_Table(NewDepartmentName);

        //Edit previously added department
        sfaEditDepartmentPage.step_Edit_Department(AddDepartmentCompanyName,EditDepartmentName);
       // Assert.assertEquals(sfaEditDepartmentPage.check_And_Validate_Edit_Department_Success_Message(),EditDepartmentSuccessMessage);

        //Search edited dept using Advanced search
        sfaDepartmentPage.
                action_Select_Company_From_Company_Name_Dropdown_In_Advance_Search_Section(AddDepartmentCompanyName);
        sfaDepartmentPage.
                action_Click_On_Search_Button_In_Advance_Search_Section();
        sfaDepartmentPage.
                check_And_Validate_Is_Value_Exist_In_Data_Table(EditDepartmentName);

    }

    //Test Case - 3467
    //Quit from Edit New Department Info popup
    @Test
    public void check_And_Validate_User_Able_To_Close_Edit_Department_Info_popup() throws InterruptedException {
        String AddDepartmentCompanyName = data.getValueByName("AddDepartmentCompanyName");
        String NewDepartmentName = sfaAddDepartmentPage.create_Random_Department_Name(data.getValueByName("NewDepartmentName"));

        //Add dept
        sfaDepartmentPage.
                action_Click_On_Add_New_Department_Button();
        sfaAddDepartmentPage.
                step_Add_New_Department(AddDepartmentCompanyName,NewDepartmentName);

        //Search added dept using Advanced search
        sfaDepartmentPage.
                action_Select_Company_From_Company_Name_Dropdown_In_Advance_Search_Section(AddDepartmentCompanyName);
        sfaDepartmentPage.
                action_Click_On_Search_Button_In_Advance_Search_Section();

        //Close button
        sfaDepartmentPage.
                step_Navigate_To_Edit_Popup_Of_A_Selected_Department_From_Data_Table(NewDepartmentName);
        Assert.assertEquals(sfaEditDepartmentPage.check_And_Validate_Close_The_Popup_By_Clicking_On_Close_Button(),false);

        //Close icon
        sfaDepartmentPage.
                step_Navigate_To_Edit_Popup_Of_A_Selected_Department_From_Data_Table(NewDepartmentName);
        Assert.assertEquals(sfaEditDepartmentPage.check_And_Validate_Close_The_Popup_By_Clicking_On_Close_Icon(),false);

    }

}
