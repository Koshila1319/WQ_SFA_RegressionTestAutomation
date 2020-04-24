package com.webQuarters.qa.test.Designation;

import com.webQuarters.qa.automation.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by e.koshila on 4/15/2020.
 */
public class SFARemoveDesignationTest extends TestBase {

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

    //Test Case - 3425
    //Remove Designation Name
    @Test
    public void check_And_Validate_User_Able_To_Remove_Designation() throws InterruptedException {
        String AddDesignationCompanyName = data.getValueByName("AddDesignationCompanyName");
        String NewDesignationName = sfaAddDesignationPage.create_Random_Designation_Name(data.getValueByName("NewDesignationName"));
        String RemoveDesignationAlertMessage = data.getValueByName("RemoveDesignationAlertMessage") + NewDesignationName;
        String RemoveDesignationSuccessMessage = data.getValueByName("RemoveDesignationSuccessMessage");

        System.out.println("new : " + NewDesignationName);

        //Add dept
        sfaDesignationPage.
                action_Click_On_Add_New_Designation_Button();
        sfaAddDesignationPage.
                step_Add_New_Designation(AddDesignationCompanyName,NewDesignationName);

        //Click on Remove after search dept using Advanced search
        sfaDesignationPage.
                action_Select_Company_From_Company_Name_Dropdown_In_Advance_Search_Section(AddDesignationCompanyName);
        sfaDesignationPage.
                action_Click_On_Search_Button_In_Advance_Search_Section();
        sfaDesignationPage.
                step_Navigate_To_Remove_Alert_Of_A_Selected_Designation_From_Data_Table(NewDesignationName);
        Assert.assertEquals(sfaRemoveDesignationPage.check_And_Validate_Remove_Designation_Alert(),RemoveDesignationAlertMessage);

        //Remove previously added department
        sfaRemoveDesignationPage.action_Click_On_Yes_Button_Of_Remove_Designation_Alert();
        Assert.assertEquals(sfaRemoveDesignationPage.check_And_Validate_Remove_Designation_Success_Message(),RemoveDesignationSuccessMessage);

        //Search removed dept is available using Advanced search
        sfaDesignationPage.
                action_Select_Company_From_Company_Name_Dropdown_In_Advance_Search_Section(AddDesignationCompanyName);
        sfaDesignationPage.
                action_Click_On_Search_Button_In_Advance_Search_Section();
        Assert.assertEquals(sfaDesignationPage.check_And_Validate_Is_Designation_Removed_From_The_Data_Table(NewDesignationName),null);

    }

    //Test Case - 3426
    //Remove Designation Name
    @Test
    public void check_And_Validate_User_Able_To_Cancel_Remove_Designation() throws InterruptedException {
        String AddDesignationCompanyName = data.getValueByName("AddDesignationCompanyName");
        String NewDesignationName = sfaAddDesignationPage.create_Random_Designation_Name(data.getValueByName("NewDesignationName"));
        String RemoveDesignationAlertMessage = data.getValueByName("RemoveDesignationAlertMessage") + NewDesignationName;
        String RemoveDesignationCancelMessage = data.getValueByName("RemoveDesignationCancelMessage");

        System.out.println("new : " + NewDesignationName);

        //Add dept
        sfaDesignationPage.
                action_Click_On_Add_New_Designation_Button();
        sfaAddDesignationPage.
                step_Add_New_Designation(AddDesignationCompanyName,NewDesignationName);

        //Click on Remove after search dept using Advanced search
        sfaDesignationPage.
                action_Select_Company_From_Company_Name_Dropdown_In_Advance_Search_Section(AddDesignationCompanyName);
        sfaDesignationPage.
                action_Click_On_Search_Button_In_Advance_Search_Section();
        sfaDesignationPage.
                step_Navigate_To_Remove_Alert_Of_A_Selected_Designation_From_Data_Table(NewDesignationName);
        Assert.assertEquals(sfaRemoveDesignationPage.check_And_Validate_Remove_Designation_Alert(),RemoveDesignationAlertMessage);

        //Remove previously added department
        sfaRemoveDesignationPage.action_Click_On_Cancel_Button_Of_Remove_Designation_Alert();
        Assert.assertEquals(sfaRemoveDesignationPage.check_And_Validate_Cancel_Remove_Designation_Message(),RemoveDesignationCancelMessage);
        sfaRemoveDesignationPage.action_Click_On_Ok_Button_Of_Cancel_Remove_Designation_Alert();

        //Search removed dept is available using Advanced search
        sfaDesignationPage.
                action_Select_Company_From_Company_Name_Dropdown_In_Advance_Search_Section(AddDesignationCompanyName);
        sfaDesignationPage.
                action_Click_On_Search_Button_In_Advance_Search_Section();
        sfaDesignationPage.
                check_And_Validate_Is_Designation_Removed_From_The_Data_Table(NewDesignationName);
    }

}
