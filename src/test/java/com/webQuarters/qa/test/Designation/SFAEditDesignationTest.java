package com.webQuarters.qa.test.Designation;

import com.webQuarters.qa.automation.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by e.koshila on 4/10/2020.
 */
public class SFAEditDesignationTest extends TestBase {

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
        quitDriver();
    }

    //Test Case - 3516, 3511
    //-----------UI Testing -------------

    //Verify navigation to Edit New Designation Info popup
    @Test
    public void check_And_Validate_Navigation_To_Edit_Designation_Info_Popup() throws InterruptedException {
        sfaDesignationPage.action_Click_On_Edit_Button_Of_A_Data_Record();
        sfaEditDesignationPage.check_And_Validate_Navigation_To_Edit_Designation_Info_Popup();
    }

    //Edit New Designation Info popup title
    @Test
    public void check_Edit_Designation_Info_Popup_Title() throws InterruptedException {
        sfaDesignationPage.action_Click_On_Edit_Button_Of_A_Data_Record();

        String EditNewDesignationPopupTitle = data.getValueByName("EditNewDesignationPopupTitle");
        Assert.assertEquals(sfaEditDesignationPage.check_Popup_Title(), EditNewDesignationPopupTitle);
    }

    //Fields
    @Test
    public void check_Edit_Designation_Info_Popup_Fields() throws InterruptedException {
        sfaDesignationPage.action_Click_On_Edit_Button_Of_A_Data_Record();

        //Company Name
        String CompanyNameLabel = data.getValueByName("CompanyNameLabel");
        Assert.assertEquals(sfaEditDesignationPage.check_Company_Name_Label(), CompanyNameLabel);

        sfaEditDesignationPage.check_Company_Name_DropDown();

        //Designation Name
        String DesignationNameLabel = data.getValueByName("DesignationNameLabel");
        Assert.assertEquals(sfaEditDesignationPage.check_Designation_Name_Label(), DesignationNameLabel);

        sfaEditDesignationPage.check_Designation_Name_TextBox();

        //Save button
        String SaveButtonText = data.getValueByName("SaveButtonText");
        Assert.assertEquals(sfaEditDesignationPage.check_Save_Button(), SaveButtonText);

        //Close button
        String CloseButtonText = data.getValueByName("CloseButtonText");
        Assert.assertEquals(sfaEditDesignationPage.check_Close_Button(), CloseButtonText);

        //Close icon
        sfaEditDesignationPage.check_Close_Icon();
    }

    //-----------Functional Testing -------------

    //Test Case - 3513
    //Verify required fields
    @Test
    public void check_And_Validate_Required_Fields_When_Editing_Designation() throws InterruptedException {
        String AddDesignationCompanyName = data.getValueByName("AddDesignationCompanyName");
        String NewDesignationName = sfaAddDesignationPage.create_Random_Designation_Name(data.getValueByName("NewDesignationName"));
        String RequiredMsg = data.getValueByName("RequiredMsg");

        sfaDesignationPage.
                action_Click_On_Add_New_Designation_Button();
        sfaAddDesignationPage.
                step_Add_New_Designation(AddDesignationCompanyName,NewDesignationName);

        //Navigate to Edit popup of the added dept
        sfaDesignationPage.
                action_Select_Company_From_Company_Name_Dropdown_In_Advance_Search_Section(AddDesignationCompanyName);
        sfaDesignationPage.
                action_Click_On_Search_Button_In_Advance_Search_Section();
        sfaDesignationPage.
                step_Navigate_To_Edit_Popup_Of_A_Selected_Designation_From_Data_Table(NewDesignationName);

        Assert.assertEquals(sfaEditDesignationPage.check_And_Validate_Company_Name_Is_Required_When_Editing_Designation(), RequiredMsg);
        Assert.assertEquals(sfaEditDesignationPage.check_And_Validate_Designation_Name_Is_Required_When_Editing_Designation(), RequiredMsg);

        System.out.println(" Required fields test");
    }

    //Test Case - 3514
    //Add duplicate designation when editing
    @Test
    public void check_And_Validate_System_Not_Allow_To_Add_Duplicate_Designation_Names_When_Editing() throws InterruptedException {
        String AddDesignationCompanyName = data.getValueByName("AddDesignationCompanyName");
        String NewDesignationName1 = sfaAddDesignationPage.create_Random_Designation_Name(data.getValueByName("NewDesignationName"));
        String NewDesignationName2 = sfaAddDesignationPage.create_Random_Designation_Name(data.getValueByName("NewDesignationName"));
        String DuplicateErrorMessage = data.getValueByName("DuplicateDesignationErrorMessage");

        System.out.println("1st Designation : "+ NewDesignationName1);
        System.out.println("2nd Designation : "+ NewDesignationName2);

        //Add designation 1
        sfaDesignationPage.
                action_Click_On_Add_New_Designation_Button();
        sfaAddDesignationPage.
                step_Add_New_Designation(AddDesignationCompanyName,NewDesignationName1);

        //Add designation 2
        Thread.sleep(2000);
        sfaDesignationPage.
                action_Click_On_Add_New_Designation_Button();
        sfaAddDesignationPage.
                step_Add_New_Designation(AddDesignationCompanyName,NewDesignationName2);

        //Navigate to Edit popup of added designation
        sfaDesignationPage.
                action_Select_Company_From_Company_Name_Dropdown_In_Advance_Search_Section(AddDesignationCompanyName);
        sfaDesignationPage.
                action_Click_On_Search_Button_In_Advance_Search_Section();
        sfaDesignationPage.
                step_Navigate_To_Edit_Popup_Of_A_Selected_Designation_From_Data_Table(NewDesignationName2);

        //Enter duplicate data (designation 1 name as designation 2)
        sfaEditDesignationPage.step_Edit_Designation(AddDesignationCompanyName,NewDesignationName1);

        Assert.assertEquals(sfaEditDesignationPage.check_And_Validate_Duplicate_Designation_Error_Message(),DuplicateErrorMessage);


    }

    //Test Case - 3428
    //Edit Designation Name
    @Test
    public void check_And_Validate_User_Able_To_Edit_Designation() throws InterruptedException {
        String AddDesignationCompanyName = data.getValueByName("AddDesignationCompanyName");
        String NewDesignationName = sfaAddDesignationPage.create_Random_Designation_Name(data.getValueByName("NewDesignationName"));
        String EditDesignationName = NewDesignationName + "Edit";
        String EditDesignationSuccessMessage = data.getValueByName("EditDesignationSuccessMessage");

        System.out.println("new : " + NewDesignationName);

        //Add dept
        sfaDesignationPage.
                action_Click_On_Add_New_Designation_Button();
        sfaAddDesignationPage.
                step_Add_New_Designation(AddDesignationCompanyName,NewDesignationName);

        //Search depts using Advanced search
        sfaDesignationPage.
                action_Select_Company_From_Company_Name_Dropdown_In_Advance_Search_Section(AddDesignationCompanyName);
        sfaDesignationPage.
                action_Click_On_Search_Button_In_Advance_Search_Section();
        sfaDesignationPage.
                step_Navigate_To_Edit_Popup_Of_A_Selected_Designation_From_Data_Table(NewDesignationName);

        //Edit previously added department
        sfaEditDesignationPage.step_Edit_Designation(AddDesignationCompanyName,EditDesignationName);
       // Assert.assertEquals(sfaEditDesignationPage.check_And_Validate_Edit_Designation_Success_Message(),EditDesignationSuccessMessage);

        //Search edited dept using Advanced search
        sfaDesignationPage.
                action_Select_Company_From_Company_Name_Dropdown_In_Advance_Search_Section(AddDesignationCompanyName);
        sfaDesignationPage.
                action_Click_On_Search_Button_In_Advance_Search_Section();
        sfaDesignationPage.
                check_And_Validate_Is_Value_Exist_In_Data_Table(EditDesignationName);

    }

    //Test Case - 3467
    //Quit from Edit New Designation Info popup
    @Test
    public void check_And_Validate_User_Able_To_Close_Edit_Designation_Info_popup() throws InterruptedException {
        String AddDesignationCompanyName = data.getValueByName("AddDesignationCompanyName");
        String NewDesignationName = sfaAddDesignationPage.create_Random_Designation_Name(data.getValueByName("NewDesignationName"));

        //Add dept
        sfaDesignationPage.
                action_Click_On_Add_New_Designation_Button();
        sfaAddDesignationPage.
                step_Add_New_Designation(AddDesignationCompanyName,NewDesignationName);

        //Search added dept using Advanced search
        sfaDesignationPage.
                action_Select_Company_From_Company_Name_Dropdown_In_Advance_Search_Section(AddDesignationCompanyName);
        sfaDesignationPage.
                action_Click_On_Search_Button_In_Advance_Search_Section();

        //Close button
        sfaDesignationPage.
                step_Navigate_To_Edit_Popup_Of_A_Selected_Designation_From_Data_Table(NewDesignationName);
        Assert.assertEquals(sfaEditDesignationPage.check_And_Validate_Close_The_Popup_By_Clicking_On_Close_Button(),false);

        //Close icon
        sfaDesignationPage.
                step_Navigate_To_Edit_Popup_Of_A_Selected_Designation_From_Data_Table(NewDesignationName);
        Assert.assertEquals(sfaEditDesignationPage.check_And_Validate_Close_The_Popup_By_Clicking_On_Close_Icon(),false);

    }

}
