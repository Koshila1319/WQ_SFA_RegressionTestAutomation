package com.webQuarters.qa.test.Designation;

import com.webQuarters.qa.automation.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by e.koshila on 4/10/2020.
 */
public class SFAAddDesignationTest extends TestBase {

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
                verify_Navigate_To_Designation_Page();
    }

    @AfterMethod
    public void endTestMethod() throws Throwable{
        Thread.sleep(3000);
        quitDriver();
    }

    //Test Case - 3488, 4211
    //-----------UI Testing -------------

    //Verify navigation to Add New Designation Info popup
    @Test
    public void check_And_Validate_Navigation_To_Add_New_Designation_Info_Popup() throws InterruptedException {
        sfaDesignationPage.
                action_Click_On_Add_New_Designation_Button();
        sfaAddDesignationPage.
                check_And_Validate_Navigation_To_Add_New_Designation_Info_Popup();
    }

    //Add New Designation Info popup title
    @Test
    public void check_Add_New_Designation_Info_Popup_Title() throws InterruptedException {
        sfaDesignationPage.action_Click_On_Add_New_Designation_Button();

        String AddNewDesignationPopupTitle = data.getValueByName("AddNewDesignationPopupTitle");
        Assert.assertEquals(sfaAddDesignationPage.check_Popup_Title(), AddNewDesignationPopupTitle);
    }

    //Fields
    @Test
    public void check_Add_New_Designation_Info_Popup_Fields() throws InterruptedException {
        sfaDesignationPage.action_Click_On_Add_New_Designation_Button();

        //Company Name
        String CompanyNameLabel = data.getValueByName("CompanyNameLabel");
        Assert.assertEquals(sfaAddDesignationPage.check_Company_Name_Label(), CompanyNameLabel);

        sfaAddDesignationPage.
                check_Company_Name_DropDown();

        //Designation Name
        String DesignationNameLabel = data.getValueByName("DesignationNameLabel");
        Assert.assertEquals(sfaAddDesignationPage.check_Designation_Name_Label(), DesignationNameLabel);

        sfaAddDesignationPage.
                check_Designation_Name_TextBox();

        //Save button
        String SaveButtonText = data.getValueByName("SaveButtonText");
        Assert.assertEquals(sfaAddDesignationPage.check_Save_Button(), SaveButtonText);

        //Close button
        String CloseButtonText = data.getValueByName("CloseButtonText");
        Assert.assertEquals(sfaAddDesignationPage.check_Close_Button(), CloseButtonText);

        //Close icon
        sfaAddDesignationPage.
                check_Close_Icon();
    }

    //-----------Functional Testing -------------

    //Test Case - 3493
    //Add New Designation
    @Test
    public void check_And_Validate_User_Able_To_Add_New_Designation_Successfully() throws InterruptedException {
        String AddDesignationCompanyName = data.getValueByName("AddDesignationCompanyName");
        String NewDesignationName = sfaAddDesignationPage.create_Random_Designation_Name(data.getValueByName("NewDesignationName"));
        String AddDesignationSuccessMessage = data.getValueByName("AddDesignationSuccessMessage");

        sfaDesignationPage.
                action_Click_On_Add_New_Designation_Button();
        sfaAddDesignationPage.
                step_Add_New_Designation(AddDesignationCompanyName,NewDesignationName);
        Assert.assertEquals(sfaAddDesignationPage.check_And_Validate_Add_Designation_Success_Message(), AddDesignationSuccessMessage);

        sfaDesignationPage.
                action_Select_Company_From_Company_Name_Dropdown_In_Advance_Search_Section(AddDesignationCompanyName);
        sfaDesignationPage.
                action_Click_On_Search_Button_In_Advance_Search_Section();
        sfaDesignationPage.
                check_And_Validate_Is_Value_Exist_In_Data_Table(NewDesignationName);
    }

    //Test Case - 3496
    //Quit from Add New Designation Info popup
    @Test
    public void check_And_Validate_User_Able_To_Close_Add_New_Designation_Info_popup() throws InterruptedException {
        sfaDesignationPage.
                action_Click_On_Add_New_Designation_Button();
        Assert.assertEquals(sfaAddDesignationPage.check_And_Validate_Close_The_Popup_By_Clicking_On_Close_Button(),false);

        sfaDesignationPage.
                action_Click_On_Add_New_Designation_Button();
        Assert.assertEquals(sfaAddDesignationPage.check_And_Validate_Close_The_Popup_By_Clicking_On_Close_Icon(),false);

   }

    //Test Case - 3494
    //Verify required fields
    @Test
    public void check_And_Validate_Required_Fields_When_Adding_New_Designation() throws InterruptedException {
        sfaDesignationPage.
                action_Click_On_Add_New_Designation_Button();

        String RequiredMsg = data.getValueByName("RequiredMsg");
        Assert.assertEquals(sfaAddDesignationPage.check_And_Validate_Company_Name_Is_Required_When_Adding_New_Designation(), RequiredMsg);
        Assert.assertEquals(sfaAddDesignationPage.check_And_Validate_Designation_Name_Is_Required_When_Adding_New_Designation(), RequiredMsg);
    }

    //Test Case - 3495
    //Add duplicate Designation
    @Test
    public void check_And_Validate_System_Not_Allow_To_Add_Duplicate_Designation_Names() throws InterruptedException {

        String AddDesignationCompanyName = data.getValueByName("AddDesignationCompanyName");
        String DuplicateAddDesignationName = sfaAddDesignationPage.create_Random_Designation_Name(data.getValueByName("NewDesignationName"));
        String DuplicateErrorMessage = data.getValueByName("DuplicateDesignationErrorMessage");

        System.out.println("Desig : "+DuplicateAddDesignationName);

        sfaDesignationPage.
                action_Click_On_Add_New_Designation_Button();
        sfaAddDesignationPage.
                step_Add_New_Designation(AddDesignationCompanyName,DuplicateAddDesignationName);
        Thread.sleep(3000);
        sfaDesignationPage.
                action_Click_On_Add_New_Designation_Button();
        sfaAddDesignationPage.
                step_Add_New_Designation(AddDesignationCompanyName,DuplicateAddDesignationName);

        Assert.assertEquals(sfaAddDesignationPage.check_And_Validate_Duplicate_Designation_Error_Message(),DuplicateErrorMessage);
    }



}
