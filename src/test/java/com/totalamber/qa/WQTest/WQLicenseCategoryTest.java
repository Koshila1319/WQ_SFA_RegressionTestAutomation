package com.totalamber.qa.WQTest;

import com.totalamber.qa.automation.TestBase;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.Assert;

/**
 * Created by t.piyananda on 09/10/2017.
 */
public class WQLicenseCategoryTest extends TestBase {
    @BeforeClass
    public void NavigateToPage() throws Exception {
        initDomainObjects(DRIVER);
        String siteUrl = data.getValueByName("url");
        setSiteURL(siteUrl);

    }

    @AfterClass
    public void endTestMethod() throws Throwable{
        //quitDriver();
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

    @Test (enabled = false)
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

    //Early Adopter Package Page
    @Test (enabled = false)
    public void verify_PAgeTitle_Of_LicensePackage_Page() throws Exception {
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
        Thread.sleep(3000);
        String pageTitle = data.getValueByName("LicensePackage_PageTitle");
        Assert.assertEquals(wqPackagePage.validate_LicensePackage_PageTitle(),pageTitle);
    }

    @Test (enabled = false)
    public void verify_WebQuarters_Logo_Available() throws Exception {
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
        Thread.sleep(3000);
        Assert.assertNotNull(wqPanel.check_WQLogo_Is_Available());
    }

    @Test (enabled = false)
    public void verify_SignedIn_As_User_IsAvailable() throws Exception {
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
        Thread.sleep(3000);
        String firstName = data.getValueByName("First_Name");
        String lastName = data.getValueByName("Last_Name");
        String signedInAs = firstName + " " + lastName;
        Assert.assertEquals(wqPanel.validate_signIn_As(),signedInAs);
    }

    @Test (enabled = false)
    public void verify_SignOut_button_IsAvailable() throws Exception {
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
        Thread.sleep(3000);
        Assert.assertNotNull(wqPanel.check_Signout_link_Is_Available_In_Client());
    }

    @Test (enabled = false)
    public void verify_FooterArea_IsAvailable() throws Exception {
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
        Thread.sleep(3000);
        Assert.assertNotNull(wqPanel.check_FooterArea_Text_Avaialble());
    }




    //Package Details
    @Test (enabled = false)
    public void verify_PackageLabel_IsAvailable() throws Exception {
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
        Thread.sleep(3000);
        Assert.assertNotNull(wqPackagePage.check_PackageLabel_Is_Available());
    }


    @Test (enabled = false)
    public void verify_DefaultValue_Of_The_Package_Dropdown() throws Exception {
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
        Thread.sleep(3000);
        Assert.assertEquals(wqPackagePage.check_Default_Dropdown_Value_of_Package(),"Select Package");
    }





    @Test (enabled = false)
    public void verify_Package_Dropdown_Isavailable() throws Exception {
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
        Thread.sleep(3000);
        Assert.assertNotNull(wqPackagePage.check_Package_Dropdown_IsAvailable());
    }




    @Test (enabled = false)
    public void verify_Selecting_Package() throws Exception {
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
        Thread.sleep(3000);
        String licensePackage = data.getValueByName("LicensePackage_Package");
        wqPackagePage
                .step_select_a_Package(licensePackage);
    }


    @Test (enabled = false)
    public void verify_licenseFee_IsPopulated() throws Exception {
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
        Thread.sleep(3000);
        String licensePackage = data.getValueByName("LicensePackage_Package");
        wqPackagePage
                .step_select_a_Package(licensePackage);
        Assert.assertNotNull(wqPackagePage.check_License_Fee_Is_Populated());
    }

    @Test (enabled = false)
    public void verify_LicenseDuration_IsPopulated() throws Exception {
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
        Thread.sleep(3000);
        String licensePackage = data.getValueByName("LicensePackage_Package");
        wqPackagePage
                .step_select_a_Package(licensePackage);
        Assert.assertNotNull(wqPackagePage.check_LicenseDuration_IsPopulated());
    }

    @Test (enabled = false)
    public void verify_LicenseUserDetails_IsPopulated() throws Exception {
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
        Thread.sleep(3000);
        String licensePackage = data.getValueByName("LicensePackage_Package");
        wqPackagePage
                .step_select_a_Package(licensePackage);
        Assert.assertNotNull(wqPackagePage.check_LicenseUserDetails_IsPopulated());
    }

    @Test (enabled = false)
    public void verify_TotalValue_IsPopulated() throws Exception {
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
        Thread.sleep(3000);
        String licensePackage = data.getValueByName("LicensePackage_Package");
        wqPackagePage
                .step_select_a_Package(licensePackage);
        Assert.assertNotNull(wqPackagePage.check_TotalValue_IsPopulated());
    }

    @Test (enabled = false)
    public void verify_ADditional_License_Title_IsAvailable() throws Exception {
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
        Thread.sleep(3000);
        String addTitle = data.getValueByName("LicensePackage_AdditionalLicenseTitle");
        Assert.assertEquals(wqPackagePage.check_AddTitle_Text(),addTitle);
    }

    @Test (enabled = false)
    public void verify_UserTypeDropdown_IsAvailable() throws Exception {
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
        Thread.sleep(3000);
        Assert.assertNotNull(wqPackagePage.checkUserType_Dropdown_Is_Available());
    }

    @Test (enabled = false)
    public void verify_DefaultValue_Of_The_UserType_Dropdown() throws Exception {
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
        Thread.sleep(3000);
        String userTypeDefault = data.getValueByName("LicensePackage_UserType_Default");
        Assert.assertEquals(wqPackagePage.check_DefaultValue_Of_The_UserType_Dropdown(),userTypeDefault);
    }

    @Test (enabled = false)
    public void verify_UserCountDropdown_IsAvailable() throws Exception {
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
        Thread.sleep(3000);
        Assert.assertNotNull(wqPackagePage.check_UserCountDropdown_IsAvailable());
    }

    @Test (enabled = false)
    public void verify_DefaultValue_Of_The_UserCount_Dropdown() throws Exception {
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
        Thread.sleep(3000);
        String userCountDefault = data.getValueByName("LicensePackage_UserCount_Default");
        Assert.assertEquals(wqPackagePage.check_DefaultValue_Of_The_UserCount_Dropdown(),userCountDefault);
    }

    @Test (enabled = false)
    public void verify_PriceOf_UserType_Record_IsPopulated() throws Exception {
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
        Thread.sleep(3000);
        String licensePackage = data.getValueByName("LicensePackage_Package");
        wqPackagePage
                .step_select_a_Package(licensePackage);
        Thread.sleep(3000);
        String userType1 = data.getValueByName("LicensePackage_AdditionalLicense_UserType1");
        String userType2 = data.getValueByName("LicensePackage_AdditionalLicense_UserType2");
        String userCount1 = data.getValueByName("LicensePackage_AdditionalLicense_UserCount1");
        String userCount2 = data.getValueByName("LicensePackage_AdditionalLicense_UserCount2");
        String amount = data.getValueByName("LicensePackage_AdditionalLicense_UserCount_Amount");
        wqPackagePage
                .step_select_a_UserType(userType1)
                .step_select_a_UserCount(userCount1);
        Thread.sleep(8000);
        Assert.assertEquals(wqPackagePage.check_UserAmount_Is_available(),amount);
        wqPackagePage
                .step_select_a_UserType(userType2)
                .step_select_a_UserCount(userCount2);
        Thread.sleep(8000);
        Assert.assertEquals(wqPackagePage.check_UserAmount_Is_available(),amount);
    }

    @Test (enabled = false)
    public void verify_Add_button_IsAvailable_In_AdditionalLicenses() throws Exception {
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
        Assert.assertNotNull(wqPackagePage.check_AddButton_InAdditionalLicenses_Is_available());
    }

    @Test (enabled = false)
    public void verify_AddButton_Text_In_AdditionalLicenses() throws Exception {
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
        Assert.assertNotNull(wqPackagePage.check_AddButtonText_InAdditionalLicenses(),"Add");
    }

    @Test (enabled = false)
    public void verify_Clicking_AddButton_Without_AnyUserType_InAdditionalLicenses() throws Exception {
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
        wqLicenseCategoryPage
                .step_select_LicenseCategory(category)
                .step_click_Continue_Btn();
        wqPackagePage
                .step_Click_add_button_In_AdditionalLicenses();
        Thread.sleep(2000);
        String error = data.getValueByName("LicensePackage_AdditionalLicense_ErrorMessage");
        Assert.assertEquals(wqPackagePage.check_Error_Message_by_clickAddButton_withoutAdditionalLicenses(),error);
    }

    @Test (enabled = false)
    public void verify_Clicking_AddButton_With_UserTypeOnly() throws Exception {
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
        wqLicenseCategoryPage
                .step_select_LicenseCategory(category)
                .step_click_Continue_Btn();
        String licensePackage = data.getValueByName("LicensePackage_Package");
        wqPackagePage
                .step_select_a_Package(licensePackage);

        Thread.sleep(3000);
        String userType1 = data.getValueByName("LicensePackage_AdditionalLicense_UserType1");
        wqPackagePage
                .step_select_a_UserType(userType1);
        wqPackagePage
                .step_Click_add_button_In_AdditionalLicenses();
        Thread.sleep(2000);
        String error = data.getValueByName("LicensePackage_AdditionalLicense_ErrorMessage");
        Assert.assertEquals(wqPackagePage.check_Error_Message_by_clickAddButton_withoutAdditionalLicenses(),error);
    }

    @Test (enabled = false)
    public void verify_Clicking_AddButton_With_Users_And_USerCount_Adds_to_theTable() throws Exception {
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
        wqLicenseCategoryPage
                .step_select_LicenseCategory(category)
                .step_click_Continue_Btn();
        String licensePackage = data.getValueByName("LicensePackage_Package");
        wqPackagePage
                .step_select_a_Package(licensePackage);
        Thread.sleep(3000);
        String userType1 = data.getValueByName("LicensePackage_AdditionalLicense_UserType1");
        String userType2 = data.getValueByName("LicensePackage_AdditionalLicense_UserType2");
        String userCount1 = data.getValueByName("LicensePackage_AdditionalLicense_UserCount1");
        String userCount2 = data.getValueByName("LicensePackage_AdditionalLicense_UserCount2");
        String amount = data.getValueByName("LicensePackage_AdditionalLicense_UserCount_Amount");
        wqPackagePage
                .step_select_a_UserType(userType1)
                .step_select_a_UserCount(userCount1);
        Thread.sleep(8000);
        wqPackagePage
                .step_Click_add_button_In_AdditionalLicenses();
        wqPackagePage
                .step_select_a_UserType(userType2)
                .step_select_a_UserCount(userCount2);
        Thread.sleep(8000);
        wqPackagePage
                .step_Click_add_button_In_AdditionalLicenses();

        Assert.assertNotNull(wqPackagePage.check_AdditionalLicenses_Table_Is_Available());
    }

    @Test (enabled = false)
    public void verify_Delete_button_IsAvailable_InTable() throws Exception {
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
        wqLicenseCategoryPage
                .step_select_LicenseCategory(category)
                .step_click_Continue_Btn();
        String licensePackage = data.getValueByName("LicensePackage_Package");
        wqPackagePage
                .step_select_a_Package(licensePackage);
        Thread.sleep(3000);
        String userType1 = data.getValueByName("LicensePackage_AdditionalLicense_UserType1");
        String userType2 = data.getValueByName("LicensePackage_AdditionalLicense_UserType2");
        String userCount1 = data.getValueByName("LicensePackage_AdditionalLicense_UserCount1");
        String userCount2 = data.getValueByName("LicensePackage_AdditionalLicense_UserCount2");
        String amount = data.getValueByName("LicensePackage_AdditionalLicense_UserCount_Amount");
        wqPackagePage
                .step_select_a_UserType(userType1)
                .step_select_a_UserCount(userCount1);
        Thread.sleep(8000);
        wqPackagePage
                .step_Click_add_button_In_AdditionalLicenses();
        wqPackagePage
                .step_select_a_UserType(userType2)
                .step_select_a_UserCount(userCount2);
        Thread.sleep(8000);
        wqPackagePage
                .step_Click_add_button_In_AdditionalLicenses();

        Assert.assertNotNull(wqPackagePage.check_AdditionalLicenses_Table_Delete_Button_Is_Available());
    }

    @Test (enabled = false)
    public void verify_DeleteButton_Text() throws Exception {
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
        wqLicenseCategoryPage
                .step_select_LicenseCategory(category)
                .step_click_Continue_Btn();
        String licensePackage = data.getValueByName("LicensePackage_Package");
        wqPackagePage
                .step_select_a_Package(licensePackage);
        Thread.sleep(3000);
        String userType1 = data.getValueByName("LicensePackage_AdditionalLicense_UserType1");
        String userType2 = data.getValueByName("LicensePackage_AdditionalLicense_UserType2");
        String userCount1 = data.getValueByName("LicensePackage_AdditionalLicense_UserCount1");
        String userCount2 = data.getValueByName("LicensePackage_AdditionalLicense_UserCount2");
        String amount = data.getValueByName("LicensePackage_AdditionalLicense_UserCount_Amount");
        wqPackagePage
                .step_select_a_UserType(userType1)
                .step_select_a_UserCount(userCount1);
        Thread.sleep(8000);
        wqPackagePage
                .step_Click_add_button_In_AdditionalLicenses();
        wqPackagePage
                .step_select_a_UserType(userType2)
                .step_select_a_UserCount(userCount2);
        Thread.sleep(8000);
        wqPackagePage
                .step_Click_add_button_In_AdditionalLicenses();

        Assert.assertEquals(wqPackagePage.check_AdditionalLicenses_Table_Delete_Button_Text(),"Delete");
    }

    @Test (enabled = false)
    public void verify_Clicking_Delete_button_removesRecord_In_Additional_License_Table() throws Exception {
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
        wqLicenseCategoryPage
                .step_select_LicenseCategory(category)
                .step_click_Continue_Btn();
        String licensePackage = data.getValueByName("LicensePackage_Package");
        wqPackagePage
                .step_select_a_Package(licensePackage);
        Thread.sleep(3000);
        String userType1 = data.getValueByName("LicensePackage_AdditionalLicense_UserType1");
        String userType2 = data.getValueByName("LicensePackage_AdditionalLicense_UserType2");
        String userCount1 = data.getValueByName("LicensePackage_AdditionalLicense_UserCount1");
        String userCount2 = data.getValueByName("LicensePackage_AdditionalLicense_UserCount2");
        wqPackagePage
                .step_select_a_UserType(userType1)
                .step_select_a_UserCount(userCount1);
        Thread.sleep(8000);
        wqPackagePage
                .step_Click_add_button_In_AdditionalLicenses();
        wqPackagePage
                .step_select_a_UserType(userType2)
                .step_select_a_UserCount(userCount2);
        Thread.sleep(8000);
        wqPackagePage
                .step_Click_add_button_In_AdditionalLicenses();
        Thread.sleep(5000);
        wqPackagePage
                .step_click_DeleteBUtton_Of_ARecord_InAdditional_License_Table();
    }

    @Test (enabled = false)
    public void verify_Total_Value_Calculation_IsAvailable() throws Exception {
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
        wqLicenseCategoryPage
                .step_select_LicenseCategory(category)
                .step_click_Continue_Btn();
        String licensePackage = data.getValueByName("LicensePackage_Package");
        wqPackagePage
                .step_select_a_Package(licensePackage);
        Thread.sleep(3000);
        String userType1 = data.getValueByName("LicensePackage_AdditionalLicense_UserType1");
        String userType2 = data.getValueByName("LicensePackage_AdditionalLicense_UserType2");
        String userCount1 = data.getValueByName("LicensePackage_AdditionalLicense_UserCount1");
        String userCount2 = data.getValueByName("LicensePackage_AdditionalLicense_UserCount2");
        wqPackagePage
                .step_select_a_UserType(userType1)
                .step_select_a_UserCount(userCount1);
        Thread.sleep(8000);
        wqPackagePage
                .step_Click_add_button_In_AdditionalLicenses();
        wqPackagePage
                .step_select_a_UserType(userType2)
                .step_select_a_UserCount(userCount2);
        Thread.sleep(8000);
        wqPackagePage
                .step_Click_add_button_In_AdditionalLicenses();
        Thread.sleep(5000);
        Assert.assertNotNull(wqPackagePage.check_TotalValue_with_AdditionalLicenses_IsAvailable());
    }

    @Test (enabled = false)
    public void Vverify_PaymentMethod_LabelText_Available() throws Exception {
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
        wqLicenseCategoryPage
                .step_select_LicenseCategory(category)
                .step_click_Continue_Btn();

        Assert.assertEquals(wqPackagePage.check_Payment_Method_LabelText(),"Payment Method");
    }

    @Test (enabled = false)
    public void Vverify_PaymentMethod_Dropdown_Is_Available() throws Exception {
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
        wqLicenseCategoryPage
                .step_select_LicenseCategory(category)
                .step_click_Continue_Btn();

        Assert.assertNotNull(wqPackagePage.check_Payment_Method_Dropdown_IsAvailable());
    }

    @Test (enabled = false)
    public void verify_PaymentMethod_defaultValue_IsSelected() throws Exception {
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
        wqLicenseCategoryPage
                .step_select_LicenseCategory(category)
                .step_click_Continue_Btn();

        Assert.assertEquals(wqPackagePage.check_Payment_Method_Dropdown_DefaultValue(),"Select Payment Method");
    }

    @Test (enabled = false)
    public void verify_Continue_Button_IsAvailable() throws Exception {
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
        wqLicenseCategoryPage
                .step_select_LicenseCategory(category)
                .step_click_Continue_Btn();

        Assert.assertNotNull(wqPackagePage.check_Continue_button_IsAvailable_In_LicensePage());
    }

    @Test (enabled = false)
    public void verify_Continue_Button_Text() throws Exception {
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
        wqLicenseCategoryPage
                .step_select_LicenseCategory(category)
                .step_click_Continue_Btn();

        Assert.assertEquals(wqPackagePage.check_Continue_button_Text_In_LicensePage(),"Continue");
    }

    @Test (enabled = false)
    public void verify_Clicking_ContinueButton_Without_SelectingAny_PaymentMethod() throws Exception {
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
        wqLicenseCategoryPage
                .step_select_LicenseCategory(category)
                .step_click_Continue_Btn();
        Thread.sleep(2000);
        //-----------
        String licensePackage = data.getValueByName("LicensePackage_Package");
        wqPackagePage
                .step_select_a_Package(licensePackage);
        Thread.sleep(3000);
        String userType1 = data.getValueByName("LicensePackage_AdditionalLicense_UserType1");
        String userType2 = data.getValueByName("LicensePackage_AdditionalLicense_UserType2");
        String userCount1 = data.getValueByName("LicensePackage_AdditionalLicense_UserCount1");
        String userCount2 = data.getValueByName("LicensePackage_AdditionalLicense_UserCount2");
        wqPackagePage
                .step_select_a_UserType(userType1)
                .step_select_a_UserCount(userCount1);
        Thread.sleep(8000);
        wqPackagePage
                .step_Click_add_button_In_AdditionalLicenses();
        wqPackagePage
                .step_select_a_UserType(userType2)
                .step_select_a_UserCount(userCount2);
        Thread.sleep(8000);
        wqPackagePage
                .step_Click_add_button_In_AdditionalLicenses();
        Thread.sleep(5000);
        //-----------
        wqPackagePage.step_click_Continue_Btn_InLicense_Page();
        String error = data.getValueByName("LicensePackage_Continue_Error");
        Assert.assertEquals(wqPackagePage.check_Error_message_by_clickContinueButton_Without_Payment(),error);
    }

    @Test (enabled = false)
    public void verify_Clicking_ContinueButton_WithoutPackage_And_WithoutPaymentMethod() throws Exception {
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
        wqLicenseCategoryPage
                .step_select_LicenseCategory(category)
                .step_click_Continue_Btn();
        Thread.sleep(2000);
        wqPackagePage.step_click_Continue_Btn_InLicense_Page();
        String error = data.getValueByName("LicensePackage_Continue_Error");
        Assert.assertEquals(wqPackagePage.check_Error_message_by_clickContinueButton_Without_Payment(),error);
    }

    @Test (enabled = false)
    public void verify_Clicking_ContinueButton_WithoutPackage_And_WithPaymentMethod() throws Exception {
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
        wqLicenseCategoryPage
                .step_select_LicenseCategory(category)
                .step_click_Continue_Btn();
        Thread.sleep(2000);
        //-----------
        String paymentMethod = data.getValueByName("LicensePackage_Payment_Method");
        wqPackagePage
                .step_select_a_PaymentMethod(paymentMethod);
        wqPackagePage
                .step_click_Continue_Btn_InLicense_Page();
        String error = data.getValueByName("LicensePackage_Continue_Error_without_Package");
        Assert.assertEquals(wqPackagePage.check_Error_message_by_clickContinueButton_Without_Payment(),error);
    }

    @Test (enabled = false)
    public void verify_Clicking_CotinueButton_BySelecting_Package_And_PaymentMethod() throws Exception {
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
        wqLicenseCategoryPage
                .step_select_LicenseCategory(category)
                .step_click_Continue_Btn();
        Thread.sleep(2000);
        //-----------
        String licensePackage = data.getValueByName("LicensePackage_Package");
        wqPackagePage
                .step_select_a_Package(licensePackage);
        Thread.sleep(3000);
        //------------
        String userType1 = data.getValueByName("LicensePackage_AdditionalLicense_UserType1");
        String userType2 = data.getValueByName("LicensePackage_AdditionalLicense_UserType2");
        String userCount1 = data.getValueByName("LicensePackage_AdditionalLicense_UserCount1");
        String userCount2 = data.getValueByName("LicensePackage_AdditionalLicense_UserCount2");
        wqPackagePage
                .step_select_a_UserType(userType1)
                .step_select_a_UserCount(userCount1);
        Thread.sleep(8000);
        wqPackagePage
                .step_Click_add_button_In_AdditionalLicenses();
        wqPackagePage
                .step_select_a_UserType(userType2)
                .step_select_a_UserCount(userCount2);
        Thread.sleep(8000);
        wqPackagePage
                .step_Click_add_button_In_AdditionalLicenses();
        Thread.sleep(5000);
        //-----------------
        String paymentMethod = data.getValueByName("LicensePackage_Payment_Method");
        wqPackagePage
                .step_select_a_PaymentMethod(paymentMethod);
        wqPackagePage
                .step_click_Continue_Btn_InLicense_Page();
        Thread.sleep(3000);
        String browserTitle = data.getValueByName("LicenseSuccessful_BrowserTitle");
        Assert.assertEquals(wqPackagePage.validate_browser_title_of_LicenseSuccessful(),browserTitle);
    }
}
