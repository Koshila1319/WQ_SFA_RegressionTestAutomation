package com.totalamber.qa.WQTest;

import com.totalamber.qa.automation.TestBase;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.Assert;

/**
 * Created by t.piyananda on 09/10/2017.
 */
public class LicenseCategoryTest extends TestBase {
    @BeforeClass
    public void NavigateToPage() throws Exception {
        initDomainObjects(DRIVER);
        String siteUrl = data.getValueByName("url");
        setSiteURL(siteUrl);

    }

    @AfterClass
    public void endTestMethod() throws Throwable{
        quitDriver();
    }

    @Test (enabled = false)
    public void verify_Page_Title() throws Exception {
        //Below line added as Suranjith told to proceed as individual tests
        //-------------------
        wqHomePage.
                action_Navigate_To_LoginPage();
        //wqLoginPage.step_Clear_Username_Field();
        String Uname = data.getValueByName("ClientProf_Update_UN");
        String Password = data.getValueByName("ClientProf_Update_PW");
        wqLoginPage
                .step_User_Enter_Given_Credentials(Uname,Password)
                .step_User_Click_Login_Button();
        //--------------------------

        String pageTitle = data.getValueByName("LicensePreference_PageTitle");
        Assert.assertEquals(wqLicenseCategoryPage.validate_License_PageTitle(),pageTitle);

    }

    @Test (enabled = false)
    public void verify_DropdownLabel_Text_Available() throws Exception {
        //Below line added as Suranjith told to proceed as individual tests
        //-------------------
        wqHomePage.
                action_Navigate_To_LoginPage();
        //wqLoginPage.step_Clear_Username_Field();
        String Uname = data.getValueByName("ClientProf_Update_UN");
        String Password = data.getValueByName("ClientProf_Update_PW");
        wqLoginPage
                .step_User_Enter_Given_Credentials(Uname,Password)
                .step_User_Click_Login_Button();
        //--------------------------

        Assert.assertEquals(wqLicenseCategoryPage.validate_License_Category_Label(),"License Category");

    }

    @Test (enabled = false)
    public void verify_LicenseCategory_Dropdown_Available() throws Exception {
        //Below line added as Suranjith told to proceed as individual tests
        //-------------------
        wqHomePage.
                action_Navigate_To_LoginPage();
        //wqLoginPage.step_Clear_Username_Field();
        String Uname = data.getValueByName("ClientProf_Update_UN");
        String Password = data.getValueByName("ClientProf_Update_PW");
        wqLoginPage
                .step_User_Enter_Given_Credentials(Uname,Password)
                .step_User_Click_Login_Button();
        //--------------------------

        Assert.assertNotNull(wqLicenseCategoryPage.validate_License_Category_Dropdown_Is_Available());

    }

    @Test (enabled = false)
    public void verify_DropdownDefaultValue() throws Exception {
        //Below line added as Suranjith told to proceed as individual tests
        //-------------------
        wqHomePage.
                action_Navigate_To_LoginPage();
        //wqLoginPage.step_Clear_Username_Field();
        String Uname = data.getValueByName("ClientProf_Update_UN");
        String Password = data.getValueByName("ClientProf_Update_PW");
        wqLoginPage
                .step_User_Enter_Given_Credentials(Uname,Password)
                .step_User_Click_Login_Button();
        //--------------------------

        Assert.assertEquals(wqLicenseCategoryPage.check_License_Category_Dropdown_DefaultValue(),"Select Category");
    }

    @Test (enabled = false)
    public void verify_ContinueButton_Available() throws Exception {
        //Below line added as Suranjith told to proceed as individual tests
        //-------------------
        wqHomePage.
                action_Navigate_To_LoginPage();
        //wqLoginPage.step_Clear_Username_Field();
        String Uname = data.getValueByName("ClientProf_Update_UN");
        String Password = data.getValueByName("ClientProf_Update_PW");
        wqLoginPage
                .step_User_Enter_Given_Credentials(Uname,Password)
                .step_User_Click_Login_Button();
        //--------------------------

        Assert.assertNotNull(wqLicenseCategoryPage.check_Continue_button_Available());
    }

    @Test (enabled = false)
    public void verify_ContinueButton_Text() throws Exception {
        //Below line added as Suranjith told to proceed as individual tests
        //-------------------
        wqHomePage.
                action_Navigate_To_LoginPage();
        //wqLoginPage.step_Clear_Username_Field();
        String Uname = data.getValueByName("ClientProf_Update_UN");
        String Password = data.getValueByName("ClientProf_Update_PW");
        wqLoginPage
                .step_User_Enter_Given_Credentials(Uname,Password)
                .step_User_Click_Login_Button();
        //--------------------------

        Assert.assertEquals(wqLicenseCategoryPage.check_Continue_button_Text(),"Continue");
    }

    @Test (enabled = false)
    public void verify_Clicking_ContinueButton_WithoutAnyValue() throws Exception {
        //Below line added as Suranjith told to proceed as individual tests
        //-------------------
        wqHomePage.
                action_Navigate_To_LoginPage();
        //wqLoginPage.step_Clear_Username_Field();
        String Uname = data.getValueByName("ClientProf_Update_UN");
        String Password = data.getValueByName("ClientProf_Update_PW");
        wqLoginPage
                .step_User_Enter_Given_Credentials(Uname,Password)
                .step_User_Click_Login_Button();
        //--------------------------

        wqLicenseCategoryPage.step_click_Continue_Btn();
        Assert.assertEquals(wqLicenseCategoryPage.check_Null_Selected_License_ErrorMessage(),"Please select category");
    }

    @Test (enabled = true)
    public void verify_Clicking_ContinueButton_With_LicenseCategory_Value() throws Exception {
        //Below line added as Suranjith told to proceed as individual tests
        //-------------------
        wqHomePage.
                action_Navigate_To_LoginPage();
        //wqLoginPage.step_Clear_Username_Field();
        String Uname = data.getValueByName("ClientProf_Update_UN");
        String Password = data.getValueByName("ClientProf_Update_PW");
        wqLoginPage
                .step_User_Enter_Given_Credentials(Uname,Password)
                .step_User_Click_Login_Button();
        //--------------------------
        String category = data.getValueByName("LicensePreference_Category");
        wqLicenseCategoryPage.step_select_LicenseCategory(category);
        wqLicenseCategoryPage.step_click_Continue_Btn();
        String browserTitle = data.getValueByName("LicensePackage_BrowserTitle");
        Assert.assertEquals(wqLicenseCategoryPage.validate_Browser_Title_Of_Page(),browserTitle);
    }



}
