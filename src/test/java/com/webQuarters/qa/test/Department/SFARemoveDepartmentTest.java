package com.webQuarters.qa.test.Department;

import com.webQuarters.qa.automation.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by e.koshila on 4/6/2020.
 */
public class SFARemoveDepartmentTest extends TestBase {

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

    //Test Case - 3425
    //Remove Department Name
    @Test
    public void check_And_Validate_User_Able_To_Remove_Department() throws InterruptedException {
        String AddDepartmentCompanyName = data.getValueByName("AddDepartmentCompanyName");
        String NewDepartmentName = sfaAddDepartmentPage.create_Random_Department_Name(data.getValueByName("NewDepartmentName"));
        String RemoveDepartmentAlertMessage = data.getValueByName("RemoveDepartmentAlertMessage") + NewDepartmentName;
        String RemoveDepartmentSuccessMessage = data.getValueByName("RemoveDepartmentSuccessMessage");

        System.out.println("new : " + NewDepartmentName);

        //Add dept
        sfaDepartmentPage.
                action_Click_On_Add_New_Department_Button();
        sfaAddDepartmentPage.
                step_Add_New_Department(AddDepartmentCompanyName,NewDepartmentName);

        //Click on Remove after search dept using Advanced search
        sfaDepartmentPage.
                action_Select_Company_From_Company_Name_Dropdown_In_Advance_Search_Section(AddDepartmentCompanyName);
        sfaDepartmentPage.
                action_Click_On_Search_Button_In_Advance_Search_Section();
        sfaDepartmentPage.
                step_Navigate_To_Remove_Alert_Of_A_Selected_Department_From_Data_Table(NewDepartmentName);
        Assert.assertEquals(sfaRemoveDepartmentPage.check_And_Validate_Remove_Department_Alert(),RemoveDepartmentAlertMessage);

        //Remove previously added department
        sfaRemoveDepartmentPage.action_Click_On_Yes_Button_Of_Remove_Department_Alert();
        Assert.assertEquals(sfaRemoveDepartmentPage.check_And_Validate_Remove_Department_Success_Message(),RemoveDepartmentSuccessMessage);

        //Search removed dept is available using Advanced search
        sfaDepartmentPage.
                action_Select_Company_From_Company_Name_Dropdown_In_Advance_Search_Section(AddDepartmentCompanyName);
        sfaDepartmentPage.
                action_Click_On_Search_Button_In_Advance_Search_Section();
        Assert.assertEquals(sfaDepartmentPage.check_And_Validate_Is_Department_Removed_From_The_Data_Table(NewDepartmentName),null);

    }

    //Test Case - 3426
    //Remove Department Name
    @Test
    public void check_And_Validate_User_Able_To_Cancel_Remove_Department() throws InterruptedException {
        String AddDepartmentCompanyName = data.getValueByName("AddDepartmentCompanyName");
        String NewDepartmentName = sfaAddDepartmentPage.create_Random_Department_Name(data.getValueByName("NewDepartmentName"));
        String RemoveDepartmentAlertMessage = data.getValueByName("RemoveDepartmentAlertMessage") + NewDepartmentName;
        String RemoveDepartmentCancelMessage = data.getValueByName("RemoveDepartmentCancelMessage");

        System.out.println("new : " + NewDepartmentName);

        //Add dept
        sfaDepartmentPage.
                action_Click_On_Add_New_Department_Button();
        sfaAddDepartmentPage.
                step_Add_New_Department(AddDepartmentCompanyName,NewDepartmentName);

        //Click on Remove after search dept using Advanced search
        sfaDepartmentPage.
                action_Select_Company_From_Company_Name_Dropdown_In_Advance_Search_Section(AddDepartmentCompanyName);
        sfaDepartmentPage.
                action_Click_On_Search_Button_In_Advance_Search_Section();
        sfaDepartmentPage.
                step_Navigate_To_Remove_Alert_Of_A_Selected_Department_From_Data_Table(NewDepartmentName);
        Assert.assertEquals(sfaRemoveDepartmentPage.check_And_Validate_Remove_Department_Alert(),RemoveDepartmentAlertMessage);

        //Remove previously added department
        sfaRemoveDepartmentPage.action_Click_On_Cancel_Button_Of_Remove_Department_Alert();
        Assert.assertEquals(sfaRemoveDepartmentPage.check_And_Validate_Cancel_Remove_Department_Message(),RemoveDepartmentCancelMessage);
        sfaRemoveDepartmentPage.action_Click_On_Ok_Button_Of_Cancel_Remove_Department_Alert();

        //Search removed dept is available using Advanced search
        sfaDepartmentPage.
                action_Select_Company_From_Company_Name_Dropdown_In_Advance_Search_Section(AddDepartmentCompanyName);
        sfaDepartmentPage.
                action_Click_On_Search_Button_In_Advance_Search_Section();
        sfaDepartmentPage.
                check_And_Validate_Is_Department_Removed_From_The_Data_Table(NewDepartmentName);
    }

}
