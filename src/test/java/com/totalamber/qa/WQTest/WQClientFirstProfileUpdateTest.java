package com.totalamber.qa.WQTest;

import com.totalamber.qa.automation.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by t.piyananda on 30/09/2017.
 */
public class WQClientFirstProfileUpdateTest extends TestBase {
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
    public void verify_Entered_CompanyDetails_areSameAs_Registration_Data() throws Exception {

        //Below line added as Suranjith told to proceed as individual tests
        //-------------------
        wqHomePage.
                action_Navigate_To_LoginPage();
        //wqLoginPage.step_Clear_Username_Field();
        String Uname = data.getValueByName("ClientProf_Update_UN");
        String Password = data.getValueByName("ClientProf_Update_PW");
        wqLoginPage.
                step_User_Enter_Given_Credentials(Uname,Password).
                step_User_Click_Login_Button();
        String profileUpdateURL = data.getValueByName("ClientProfileUpdate_ProfileUpdateURL");
        wqHomePage
                .action_Navigate_To_ClientProfilePage(profileUpdateURL);
        //--------------------------

        String regNumber = data.getValueByName("Business_Reg_No");
        String companyName = data.getValueByName("Company_Name");
        String lastname = data.getValueByName("Last_Name");
        String firstname = data.getValueByName("First_Name");
        String email = data.getValueByName("Email_Address");
        String phone = data.getValueByName("Contact_No");
        String dialcode = data.getValueByName("Dialing_Code");
        String address = data.getValueByName("Company_Address");
        String city = data.getValueByName("Town_City");
        String county = data.getValueByName("Country_State");
        String fax = data.getValueByName("Fax");
        String postcode = data.getValueByName("Postal_Code");
        String country = data.getValueByName("Country");
        String designation = data.getValueByName("Title_Designation");
        String orgsize = data.getValueByName("orgsize");
        String website = data.getValueByName("Company_web_address");

        Assert.assertEquals(wqClientProfileUpdatePage.check_regNumber_field_In_ClientProfilePage(),regNumber);
        Assert.assertEquals(wqClientProfileUpdatePage.check_companyName_field_In_ClientProfilePage(),companyName);
        Assert.assertEquals(wqClientProfileUpdatePage.check_lastname_field_In_ClientProfilePage(),lastname);
        Assert.assertEquals(wqClientProfileUpdatePage.check_firstname_field_In_ClientProfilePage(),firstname);
        Assert.assertEquals(wqClientProfileUpdatePage.check_email_field_In_ClientProfilePage(),email);
        Assert.assertEquals(wqClientProfileUpdatePage.check_phone_field_In_ClientProfilePage(),phone);
        Assert.assertEquals(wqClientProfileUpdatePage.check_dialcode_field_In_ClientProfilePage(),dialcode);
        Assert.assertEquals(wqClientProfileUpdatePage.check_address_field_In_ClientProfilePage(),address);
        Assert.assertEquals(wqClientProfileUpdatePage.check_city_field_In_ClientProfilePage(),city);
        Assert.assertEquals(wqClientProfileUpdatePage.check_county_field_In_ClientProfilePage(),county);
        Assert.assertEquals(wqClientProfileUpdatePage.check_fax_field_In_ClientProfilePage(),fax);
        Assert.assertEquals(wqClientProfileUpdatePage.check_postcode_field_In_ClientProfilePage(),postcode);
        Assert.assertEquals(wqClientProfileUpdatePage.check_Country_Text_Feild(),country);
        Assert.assertEquals(wqClientProfileUpdatePage.check_designation_field_In_ClientProfilePage(),designation);
        Assert.assertEquals(wqClientProfileUpdatePage.check_OrgSize_Text_Feild(),orgsize);
        Assert.assertEquals(wqClientProfileUpdatePage.check_website_field_In_ClientProfilePage(),website);

    }

    @Test (enabled = false)
    public void verify_nonEditableFields_in_CompanyDetails_Section() throws Exception {
        //Below line added as Suranjith told to proceed as individual tests
        //-------------------
        wqHomePage.
                action_Navigate_To_LoginPage();
        //wqLoginPage.step_Clear_Username_Field();
        String Uname = data.getValueByName("ClientProf_Update_UN");
        String Password = data.getValueByName("ClientProf_Update_PW");
        wqLoginPage.
                step_User_Enter_Given_Credentials(Uname,Password).
                step_User_Click_Login_Button();
        String profileUpdateURL = data.getValueByName("ClientProfileUpdate_ProfileUpdateURL");
        wqHomePage
                .action_Navigate_To_ClientProfilePage(profileUpdateURL);
        //--------------------------
        wqClientProfileUpdatePage.validate_fields_are_Disabled();
    }

    @Test (enabled = false)
    public void verify_Updating_CompanyDetails() throws Exception {
        //Below line added as Suranjith told to proceed as individual tests
        //-------------------
        wqHomePage.
                action_Navigate_To_LoginPage();
        //wqLoginPage.step_Clear_Username_Field();
        String Uname = data.getValueByName("ClientProf_Update_UN");
        String Password = data.getValueByName("ClientProf_Update_PW");
        wqLoginPage.
                step_User_Enter_Given_Credentials(Uname,Password).
                step_User_Click_Login_Button();
        String profileUpdateURL = data.getValueByName("ClientProfileUpdate_ProfileUpdateURL");
        wqHomePage
                .action_Navigate_To_ClientProfilePage(profileUpdateURL);
        //--------------------------

        String regNumber = data.getValueByName("CompanyDetails_BusRegNumber");
        String phone = data.getValueByName("CompanyDetails_Phone");
        String dialcode = data.getValueByName("ClientDetails_Dial");
        String address = data.getValueByName("CompanyDetails_Address");
        String city = data.getValueByName("CompanyDetails_City");
        String county = data.getValueByName("CompanyDetails_State");
        String fax = data.getValueByName("CompanyDetails_Fax");
        String postcode = data.getValueByName("CompanyDetails_PostalCode");
        String country = data.getValueByName("CompanyDetails_Country");
        String designation = data.getValueByName("ClientDetails_Designation");
        String orgSize = data.getValueByName("CompanyDetails_OrgSize");
        String website = data.getValueByName("ClientDetails_Website");

        wqClientProfileUpdatePage
                .step_update_regNumber_field_In_ClientProfilePage(regNumber);
        wqClientProfileUpdatePage
                .step_update_phone_field_In_ClientProfilePage(phone);
        wqClientProfileUpdatePage
                .step_update_dialcode_field_In_ClientProfilePage(dialcode);
        wqClientProfileUpdatePage
                .step_update_address_field_In_ClientProfilePage(address);
        wqClientProfileUpdatePage
                .step_update_city_field_In_ClientProfilePage(city);
        wqClientProfileUpdatePage
                .step_update_county_field_In_ClientProfilePage(county);
        wqClientProfileUpdatePage
                .step_update_fax_field_In_ClientProfilePage(fax);
        wqClientProfileUpdatePage
                .step_update_postcode_field_In_ClientProfilePage(postcode);
        wqClientProfileUpdatePage
                .step_update_country_field_In_ClientProfilePage(country);
        wqClientProfileUpdatePage
                .step_update_designation_field_In_ClientProfilePage(designation);
        wqClientProfileUpdatePage
                .step_update_OrgSize_field_In_ClientProfilePage(orgSize);
        wqClientProfileUpdatePage
                .step_update_website_field_In_ClientProfilePage(website);

    }

    //Application Information
    @Test (enabled = false)
    public void verify_ApplicationInformation_Accordian_IsAvailable() throws Exception {
        //Below line added as Suranjith told to proceed as individual tests
        //-------------------
        wqHomePage.
                action_Navigate_To_LoginPage();
        //wqLoginPage.step_Clear_Username_Field();
        String Uname = data.getValueByName("ClientProf_Update_UN");
        String Password = data.getValueByName("ClientProf_Update_PW");
        wqLoginPage.
                step_User_Enter_Given_Credentials(Uname,Password).
                step_User_Click_Login_Button();
        String profileUpdateURL = data.getValueByName("ClientProfileUpdate_ProfileUpdateURL");
        wqHomePage
                .action_Navigate_To_ClientProfilePage(profileUpdateURL);
        //--------------------------
        wqClientProfileUpdatePage
                .validate_ApplicationInformation_Accordian();

    }

    @Test (enabled = false)
    public void verify_Clicking_ApplicationInformation_Accordian_Displays_Information() throws Exception {
        //Below line added as Suranjith told to proceed as individual tests
        //-------------------
        wqHomePage.
                action_Navigate_To_LoginPage();
        //wqLoginPage.step_Clear_Username_Field();
        String Uname = data.getValueByName("ClientProf_Update_UN");
        String Password = data.getValueByName("ClientProf_Update_PW");
        wqLoginPage.
                step_User_Enter_Given_Credentials(Uname,Password).
                step_User_Click_Login_Button();
        String profileUpdateURL = data.getValueByName("ClientProfileUpdate_ProfileUpdateURL");
        wqHomePage
                .action_Navigate_To_ClientProfilePage(profileUpdateURL);
        //--------------------------
        wqClientProfileUpdatePage
                .step_click_AppInfo_Accordian();
        Assert.assertNotNull(wqClientProfileUpdatePage.validate_AppInfo_Data_Displays());
        Thread.sleep(5000);
    }

    @Test (enabled = false)
    public void verify_Entered_ApplicationInformation_areSameAs_Registration_Data() throws Exception {
        //Below line added as Suranjith told to proceed as individual tests
        //-------------------
        wqHomePage.
                action_Navigate_To_LoginPage();
        //wqLoginPage.step_Clear_Username_Field();
        String Uname = data.getValueByName("ClientProf_Update_UN");
        String Password = data.getValueByName("ClientProf_Update_PW");
        wqLoginPage.
                step_User_Enter_Given_Credentials(Uname,Password).
                step_User_Click_Login_Button();
        String profileUpdateURL = data.getValueByName("ClientProfileUpdate_ProfileUpdateURL");
        wqHomePage
                .action_Navigate_To_ClientProfilePage(profileUpdateURL);
        //--------------------------
        wqClientProfileUpdatePage
                .step_click_AppInfo_Accordian();
        String software = data.getValueByName("Software_Application");
        String module = data.getValueByName("Software_Module");
        String version = data.getValueByName("Software_Version");
        Assert.assertEquals(wqClientProfileUpdatePage.validate_entered_Software_Isavailable(software),software);
        Assert.assertEquals(wqClientProfileUpdatePage.validate_entered_Module_Isavailable(module),module);
        Assert.assertEquals(wqClientProfileUpdatePage.validate_entered_Version_Isavailable(version),version);

    }

    @Test (enabled = false)
    public void verify_DeleteButton_Isavailble_In_AppInfo_Page() throws Exception {
        //Below line added as Suranjith told to proceed as individual tests
        //-------------------
        wqHomePage.
                action_Navigate_To_LoginPage();
        //wqLoginPage.step_Clear_Username_Field();
        String Uname = data.getValueByName("ClientProf_Update_UN");
        String Password = data.getValueByName("ClientProf_Update_PW");
        wqLoginPage.
                step_User_Enter_Given_Credentials(Uname,Password).
                step_User_Click_Login_Button();
        String profileUpdateURL = data.getValueByName("ClientProfileUpdate_ProfileUpdateURL");
        wqHomePage
                .action_Navigate_To_ClientProfilePage(profileUpdateURL);
        //--------------------------
        wqClientProfileUpdatePage
                .step_click_AppInfo_Accordian();
        Assert.assertNotNull(wqClientProfileUpdatePage.validate_Delete_Button_IsAvailable());
    }

    @Test (enabled = false)
    public void verify_delete_Button_Text() throws Exception {
        //Below line added as Suranjith told to proceed as individual tests
        //-------------------
        wqHomePage.
                action_Navigate_To_LoginPage();
        //wqLoginPage.step_Clear_Username_Field();
        String Uname = data.getValueByName("ClientProf_Update_UN");
        String Password = data.getValueByName("ClientProf_Update_PW");
        wqLoginPage.
                step_User_Enter_Given_Credentials(Uname,Password).
                step_User_Click_Login_Button();
        String profileUpdateURL = data.getValueByName("ClientProfileUpdate_ProfileUpdateURL");
        wqHomePage
                .action_Navigate_To_ClientProfilePage(profileUpdateURL);
        //--------------------------
        wqClientProfileUpdatePage
                .step_click_AppInfo_Accordian();
        String expectedText = "Delete";
        Assert.assertEquals(wqClientProfileUpdatePage.validate_DeleteButton_Text(),expectedText);
    }

    @Test (enabled = false)
    public void verify_Clicking_Delete_Button_Removes_SWInfo() throws Exception {
        //Below line added as Suranjith told to proceed as individual tests
        //-------------------
        wqHomePage.
                action_Navigate_To_LoginPage();
        //wqLoginPage.step_Clear_Username_Field();
        String Uname = data.getValueByName("ClientProf_Update_UN");
        String Password = data.getValueByName("ClientProf_Update_PW");
        wqLoginPage.
                step_User_Enter_Given_Credentials(Uname,Password).
                step_User_Click_Login_Button();
        String profileUpdateURL = data.getValueByName("ClientProfileUpdate_ProfileUpdateURL");
        wqHomePage
                .action_Navigate_To_ClientProfilePage(profileUpdateURL);
        //--------------------------
        wqClientProfileUpdatePage
                .step_click_AppInfo_Accordian();
        wqClientProfileUpdatePage
                .step_click_DeleteBUtton_Of_ARecord();
        Thread.sleep(10000);
        String software = data.getValueByName("Software_Application");
        String module = data.getValueByName("Software_Module");
        String version = data.getValueByName("Software_Version");
        Assert.assertNull(wqClientProfileUpdatePage.validate_entered_Software_Isavailable(software),software);
        Assert.assertNull(wqClientProfileUpdatePage.validate_entered_Module_Isavailable(module),module);
        Assert.assertNull(wqClientProfileUpdatePage.validate_entered_Version_Isavailable(version),version);
    }

    @Test (enabled = false)
    public void verify_SW_Dropdown_IsAvailable() throws Exception {
        //Below line added as Suranjith told to proceed as individual tests
        //-------------------
        wqHomePage.
                action_Navigate_To_LoginPage();
        //wqLoginPage.step_Clear_Username_Field();
        String Uname = data.getValueByName("ClientProf_Update_UN");
        String Password = data.getValueByName("ClientProf_Update_PW");
        wqLoginPage.
                step_User_Enter_Given_Credentials(Uname,Password).
                step_User_Click_Login_Button();
        String profileUpdateURL = data.getValueByName("ClientProfileUpdate_ProfileUpdateURL");
        wqHomePage
                .action_Navigate_To_ClientProfilePage(profileUpdateURL);
        //--------------------------
        wqClientProfileUpdatePage
                .step_click_AppInfo_Accordian();
        Assert.assertNotNull(wqClientProfileUpdatePage.validate_SoftwareDropdown_Isavailable());

    }

    @Test (enabled = false)
    public void verify_SW_Dropdown_defaultValue() throws Exception {
        //Below line added as Suranjith told to proceed as individual tests
        //-------------------
        wqHomePage.
                action_Navigate_To_LoginPage();
        //wqLoginPage.step_Clear_Username_Field();
        String Uname = data.getValueByName("ClientProf_Update_UN");
        String Password = data.getValueByName("ClientProf_Update_PW");
        wqLoginPage.
                step_User_Enter_Given_Credentials(Uname,Password).
                step_User_Click_Login_Button();
        String profileUpdateURL = data.getValueByName("ClientProfileUpdate_ProfileUpdateURL");
        wqHomePage
                .action_Navigate_To_ClientProfilePage(profileUpdateURL);
        //--------------------------
        wqClientProfileUpdatePage
                .step_click_AppInfo_Accordian();
        Assert.assertEquals(wqClientProfileUpdatePage.software_Application_Text_Feild(),"Software");
    }

    @Test (enabled = false)
    public void verify_AddButton_Isavailble_In_AppInfo_Page() throws Exception {
        //Below line added as Suranjith told to proceed as individual tests
        //-------------------
        wqHomePage.
                action_Navigate_To_LoginPage();
        //wqLoginPage.step_Clear_Username_Field();
        String Uname = data.getValueByName("ClientProf_Update_UN");
        String Password = data.getValueByName("ClientProf_Update_PW");
        wqLoginPage.
                step_User_Enter_Given_Credentials(Uname,Password).
                step_User_Click_Login_Button();
        String profileUpdateURL = data.getValueByName("ClientProfileUpdate_ProfileUpdateURL");
        wqHomePage
                .action_Navigate_To_ClientProfilePage(profileUpdateURL);
        //--------------------------
        wqClientProfileUpdatePage
                .step_click_AppInfo_Accordian();
        Assert.assertNotNull(wqClientProfileUpdatePage.validate_Add_Button_IsAvailable());
    }

    @Test (enabled = false)
    public void verify_add_Button_Text() throws Exception {
        //Below line added as Suranjith told to proceed as individual tests
        //-------------------
        wqHomePage.
                action_Navigate_To_LoginPage();
        //wqLoginPage.step_Clear_Username_Field();
        String Uname = data.getValueByName("ClientProf_Update_UN");
        String Password = data.getValueByName("ClientProf_Update_PW");
        wqLoginPage.
                step_User_Enter_Given_Credentials(Uname,Password).
                step_User_Click_Login_Button();
        String profileUpdateURL = data.getValueByName("ClientProfileUpdate_ProfileUpdateURL");
        wqHomePage
                .action_Navigate_To_ClientProfilePage(profileUpdateURL);
        //--------------------------
        wqClientProfileUpdatePage
                .step_click_AppInfo_Accordian();
        String expectedText = "Add";
        Assert.assertEquals(wqClientProfileUpdatePage.validate_AddButton_Text(),expectedText);
    }

    @Test (enabled = false)
    public void verify_clicking_AddButton_Without_Any_selected_SW() throws Exception {
        //Below line added as Suranjith told to proceed as individual tests
        //-------------------
        wqHomePage.
                action_Navigate_To_LoginPage();
        //wqLoginPage.step_Clear_Username_Field();
        String Uname = data.getValueByName("ClientProf_Update_UN");
        String Password = data.getValueByName("ClientProf_Update_PW");
        wqLoginPage.
                step_User_Enter_Given_Credentials(Uname,Password).
                step_User_Click_Login_Button();
        String profileUpdateURL = data.getValueByName("ClientProfileUpdate_ProfileUpdateURL");
        wqHomePage
                .action_Navigate_To_ClientProfilePage(profileUpdateURL);
        //--------------------------
        wqClientProfileUpdatePage
                .step_click_AppInfo_Accordian();
        wqClientProfileUpdatePage.step_click_Add_button();
        Thread.sleep(5000);
        Assert.assertEquals(wqClientProfileUpdatePage.validate_errorMessage_For_Null_Software(), "Please select a application name");

    }

    @Test (enabled = false)
    public void verify_Selected_SW_Displays_ModuleList_And_Version_List() throws Exception {
        //Below line added as Suranjith told to proceed as individual tests
        //-------------------
        wqHomePage.
                action_Navigate_To_LoginPage();
        //wqLoginPage.step_Clear_Username_Field();
        String Uname = data.getValueByName("ClientProf_Update_UN");
        String Password = data.getValueByName("ClientProf_Update_PW");
        wqLoginPage.
                step_User_Enter_Given_Credentials(Uname,Password).
                step_User_Click_Login_Button();
        String profileUpdateURL = data.getValueByName("ClientProfileUpdate_ProfileUpdateURL");
        wqHomePage
                .action_Navigate_To_ClientProfilePage(profileUpdateURL);
        //--------------------------
        wqClientProfileUpdatePage
                .step_click_AppInfo_Accordian();
        wqClientProfileUpdatePage
                .step_select_a_Software("IFS");
        Thread.sleep(10000);
        Assert.assertNotNull(wqClientProfileUpdatePage.check_Module_List_IsAvailable());
        Assert.assertNotNull(wqClientProfileUpdatePage.check_Version_List_IsAvailable());

    }

    @Test (enabled = false)
    public void verify_Clicking_AddButton_Selecting_Version_AccordingTo_SW() throws Exception {
        //Below line added as Suranjith told to proceed as individual tests
        //-------------------
        wqHomePage.
                action_Navigate_To_LoginPage();
        //wqLoginPage.step_Clear_Username_Field();
        String Uname = data.getValueByName("ClientProf_Update_UN");
        String Password = data.getValueByName("ClientProf_Update_PW");
        wqLoginPage.
                step_User_Enter_Given_Credentials(Uname,Password).
                step_User_Click_Login_Button();
        String profileUpdateURL = data.getValueByName("ClientProfileUpdate_ProfileUpdateURL");
        wqHomePage
                .action_Navigate_To_ClientProfilePage(profileUpdateURL);
        //--------------------------
        wqClientProfileUpdatePage
                .step_click_AppInfo_Accordian();
        wqClientProfileUpdatePage
                .step_click_A_Module("IFS Report Designer")
                .step_click_A_Module("IFS Developer Studio")
                .step_click_A_Module("IFS Connected (Extended Server)")
                .step_click_Add_button();
        Thread.sleep(5000);

    }

    @Test (enabled = false)
    public void verify_Clicking_AddButton_Selecting_Module_AccordingTo_SW() throws Exception {
        //Below line added as Suranjith told to proceed as individual tests
        //-------------------
        wqHomePage.
                action_Navigate_To_LoginPage();
        //wqLoginPage.step_Clear_Username_Field();
        String Uname = data.getValueByName("ClientProf_Update_UN");
        String Password = data.getValueByName("ClientProf_Update_PW");
        wqLoginPage.
                step_User_Enter_Given_Credentials(Uname,Password).
                step_User_Click_Login_Button();
        String profileUpdateURL = data.getValueByName("ClientProfileUpdate_ProfileUpdateURL");
        wqHomePage
                .action_Navigate_To_ClientProfilePage(profileUpdateURL);
        //--------------------------
        wqClientProfileUpdatePage
                .step_click_AppInfo_Accordian();
        wqClientProfileUpdatePage
                .step_select_a_Software("IFS");
        Thread.sleep(5000);
        wqClientProfileUpdatePage
                .step_click_A_Version("IFS App 7.5")
                .step_click_A_Version("IFS 2001-3")
                .step_click_A_Version("IFS App 9")
                .step_click_Add_button();
        Thread.sleep(5000);

    }

    @Test (enabled = false)
    public void verify_Clicking_AddButton_Selecting_Module_And_Version_AccordingTo_SW() throws Exception {
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
        String profileUpdateURL = data.getValueByName("ClientProfileUpdate_ProfileUpdateURL");
        wqHomePage
                .action_Navigate_To_ClientProfilePage(profileUpdateURL);
        //--------------------------
        wqClientProfileUpdatePage
                .step_click_AppInfo_Accordian();
        wqClientProfileUpdatePage
                .step_select_a_Software("IFS");
        Thread.sleep(5000);
        wqClientProfileUpdatePage
                .step_click_A_Module("IFS Report Designer")
                .step_click_A_Module("IFS Developer Studio")
                .step_click_A_Module("IFS Connected (Extended Server)");
        wqClientProfileUpdatePage
                .step_click_A_Version("IFS App 7.5")
                .step_click_A_Version("IFS 2001-3")
                .step_click_A_Version("IFS App 9")
                .step_click_Add_button();
        Thread.sleep(5000);

    }

    @Test (enabled = false)
    public void verify_Clicking_AddButton_WithSW() throws Exception {
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
        String profileUpdateURL = data.getValueByName("ClientProfileUpdate_ProfileUpdateURL");
        wqHomePage
                .action_Navigate_To_ClientProfilePage(profileUpdateURL);
        //--------------------------
        wqClientProfileUpdatePage
                .step_click_AppInfo_Accordian();
        wqClientProfileUpdatePage
                .step_select_a_Software("IFS");
        Thread.sleep(5000);
        wqClientProfileUpdatePage
                .step_click_Add_button();
    }

    //Other Company Details
    @Test (enabled = false)
    public void verify_OtherCompanyDetails_Accordian_IsAvailable() throws Exception {
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
        String profileUpdateURL = data.getValueByName("ClientProfileUpdate_ProfileUpdateURL");
        wqHomePage
                .action_Navigate_To_ClientProfilePage(profileUpdateURL);
        //--------------------------
        wqClientProfileUpdatePage.validate_OtherCompanyDetails_Accordian();

    }

    @Test (enabled = false)
    public void verify_Clicking_OtherCompanyDetails_Accordian_displays_Information() throws Exception {
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
        String profileUpdateURL = data.getValueByName("ClientProfileUpdate_ProfileUpdateURL");
        wqHomePage
                .action_Navigate_To_ClientProfilePage(profileUpdateURL);
        //--------------------------
        wqClientProfileUpdatePage
                .step_click_OtherCompanyDetails_Accordian();
        Assert.assertNotNull(wqClientProfileUpdatePage.validate_OtherCompanyDetails_Data_Displays());

    }

    @Test (enabled = false)
    public void verify_UploadCompanyLogo_Label_IsAvailable() throws Exception {
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
        String profileUpdateURL = data.getValueByName("ClientProfileUpdate_ProfileUpdateURL");
        wqHomePage
                .action_Navigate_To_ClientProfilePage(profileUpdateURL);
        //--------------------------
        wqClientProfileUpdatePage
                .step_click_OtherCompanyDetails_Accordian();
        Assert.assertEquals(wqClientProfileUpdatePage.check_Upload_Company_Logo_Label_IsAvailable(),"Upload your company logo");
    }

    @Test (enabled = false)
    public void verify_UploadCompanyLogo_ChooseFile_BUtton_IsAvailable() throws Exception {
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
        String profileUpdateURL = data.getValueByName("ClientProfileUpdate_ProfileUpdateURL");
        wqHomePage
                .action_Navigate_To_ClientProfilePage(profileUpdateURL);
        //--------------------------
        wqClientProfileUpdatePage
                .step_click_OtherCompanyDetails_Accordian();
        Assert.assertNotNull(wqClientProfileUpdatePage.check_chooseFile_Button_InCompanyLogo_IsAvailable());
    }

    @Test (enabled = false)
    public void verify_Choosing_InvalidFile_In_UploadCompanyLogo_gives_an_Error() throws Exception {
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
        String profileUpdateURL = data.getValueByName("ClientProfileUpdate_ProfileUpdateURL");
        wqHomePage
                .action_Navigate_To_ClientProfilePage(profileUpdateURL);
        //--------------------------
        wqClientProfileUpdatePage
                .step_click_OtherCompanyDetails_Accordian();
        String filepath = data.getValueByName("ClientProfileUpdate_Invalid_Upload");
        wqClientProfileUpdatePage
                .step_click_Company_Logo_Upload_button_for_InvalidFile(filepath);
        String errormessage = data.getValueByName("ClientProfileUpdate_Invalid_Upload_Error");
        Assert.assertEquals(wqClientProfileUpdatePage.validate_ErrorMessage_For_wrong_file_Type_in_CompLogo(),errormessage);
    }

    @Test (enabled = false)
    public void verify_Choosing_CorrectType_Of_File_in_Upload_CompanyLogo() throws Exception {
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
        String profileUpdateURL = data.getValueByName("ClientProfileUpdate_ProfileUpdateURL");
        wqHomePage
                .action_Navigate_To_ClientProfilePage(profileUpdateURL);
        //--------------------------
        wqClientProfileUpdatePage
                .step_click_OtherCompanyDetails_Accordian();
        String filepath = data.getValueByName("ClientProfileUpdate_CompanyLogo_Upload");
        wqClientProfileUpdatePage
                .step_click_Company_Logo_Upload_button(filepath);

    }

    @Test (enabled = false)
    public void verify_UploadProfilePicture_Label_IsAvailable() throws Exception {
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
        String profileUpdateURL = data.getValueByName("ClientProfileUpdate_ProfileUpdateURL");
        wqHomePage
                .action_Navigate_To_ClientProfilePage(profileUpdateURL);
        //--------------------------
        wqClientProfileUpdatePage
                .step_click_OtherCompanyDetails_Accordian();
        Assert.assertEquals(wqClientProfileUpdatePage.check_Upload_Profile_Pic_Label_IsAvailable(),"Upload your profile picture");
    }

    @Test (enabled = false)
    public void verify_UploadProfilePic_ChooseFile_BUtton_IsAvailable() throws Exception {
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
        String profileUpdateURL = data.getValueByName("ClientProfileUpdate_ProfileUpdateURL");
        wqHomePage
                .action_Navigate_To_ClientProfilePage(profileUpdateURL);
        //--------------------------
        wqClientProfileUpdatePage
                .step_click_OtherCompanyDetails_Accordian();
        Assert.assertNotNull(wqClientProfileUpdatePage.check_chooseFile_Button_InProfilePic_IsAvailable());
    }

    @Test (enabled = false)
    public void verify_Choosing_InvalidFile_In_ProfilePic_gives_an_Error() throws Exception {
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
        String profileUpdateURL = data.getValueByName("ClientProfileUpdate_ProfileUpdateURL");
        wqHomePage
                .action_Navigate_To_ClientProfilePage(profileUpdateURL);
        //--------------------------
        wqClientProfileUpdatePage
                .step_click_OtherCompanyDetails_Accordian();
        String filepath = data.getValueByName("ClientProfileUpdate_Invalid_Upload");
        wqClientProfileUpdatePage
                .step_click_Profile_Pic_Upload_button_for_InvalidFile(filepath);
        String errormessage = data.getValueByName("ClientProfileUpdate_Invalid_Upload_Error");
        Assert.assertEquals(wqClientProfileUpdatePage.validate_ErrorMessage_For_wrong_file_Type_in_ProfPic(),errormessage);
    }

    @Test (enabled = false)
    public void verify_Choosing_CorrectType_Of_File_Upload_ProfilePic() throws Exception {
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
        String profileUpdateURL = data.getValueByName("ClientProfileUpdate_ProfileUpdateURL");
        wqHomePage
                .action_Navigate_To_ClientProfilePage(profileUpdateURL);
        //--------------------------
        wqClientProfileUpdatePage
                .step_click_OtherCompanyDetails_Accordian();
        String filepath = data.getValueByName("ClientProfileUpdate_ProfilePic_Upload");
        wqClientProfileUpdatePage
                .step_click_Profile_Pic_Upload_button(filepath);

    }

    @Test (enabled = false)
    public void verify_CompanyType_Dropdown_IsAvailable() throws Exception {
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
        String profileUpdateURL = data.getValueByName("ClientProfileUpdate_ProfileUpdateURL");
        wqHomePage
                .action_Navigate_To_ClientProfilePage(profileUpdateURL);
        //--------------------------
        wqClientProfileUpdatePage
                .step_click_OtherCompanyDetails_Accordian();
        Assert.assertNotNull(wqClientProfileUpdatePage.validate_CompanyType_DropdownAvailable());
    }

    @Test (enabled = false)
    public void verify_CompanyType_DefaultValue() throws Exception {
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
        String profileUpdateURL = data.getValueByName("ClientProfileUpdate_ProfileUpdateURL");
        wqHomePage
                .action_Navigate_To_ClientProfilePage(profileUpdateURL);
        //--------------------------
        wqClientProfileUpdatePage
                .step_click_OtherCompanyDetails_Accordian();
        Assert.assertEquals(wqClientProfileUpdatePage.check_Default_Dropdown_Value_of_CompanyType(),"Company type");
    }

    @Test (enabled = false)
    public void verify_Selecting_CompanyType() throws Exception {
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
        String profileUpdateURL = data.getValueByName("ClientProfileUpdate_ProfileUpdateURL");
        wqHomePage
                .action_Navigate_To_ClientProfilePage(profileUpdateURL);
        //--------------------------
        wqClientProfileUpdatePage
                .step_click_OtherCompanyDetails_Accordian();
        wqClientProfileUpdatePage
                .step_select_a_CompanyType("Client-Customer");
    }

    @Test (enabled = false)
    public void verify_CompanyFormat_Dropdown_IsAvailable() throws Exception {
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
        String profileUpdateURL = data.getValueByName("ClientProfileUpdate_ProfileUpdateURL");
        wqHomePage
                .action_Navigate_To_ClientProfilePage(profileUpdateURL);
        //--------------------------
        wqClientProfileUpdatePage
                .step_click_OtherCompanyDetails_Accordian();
        Assert.assertNotNull(wqClientProfileUpdatePage.validate_CompanyFormat_DropdownAvailable());
    }

    @Test (enabled = false)
    public void verify_CompanyFormat_DefaultValue() throws Exception {
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
        String profileUpdateURL = data.getValueByName("ClientProfileUpdate_ProfileUpdateURL");
        wqHomePage
                .action_Navigate_To_ClientProfilePage(profileUpdateURL);
        //--------------------------
        wqClientProfileUpdatePage
                .step_click_OtherCompanyDetails_Accordian();
        Assert.assertEquals(wqClientProfileUpdatePage.check_Default_Dropdown_Value_of_CompanyFormat(),"Company format");
    }

    @Test (enabled = false)
    public void verify_Selecting_CompanyFormat() throws Exception {
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
        String profileUpdateURL = data.getValueByName("ClientProfileUpdate_ProfileUpdateURL");
        wqHomePage
                .action_Navigate_To_ClientProfilePage(profileUpdateURL);
        //--------------------------
        wqClientProfileUpdatePage
                .step_click_OtherCompanyDetails_Accordian();
        wqClientProfileUpdatePage
                .step_select_a_CompanyFormat("Subsidiary");
    }

    @Test (enabled = false)
    public void verify_Industry_Dropdown_IsAvailable() throws Exception {
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
        String profileUpdateURL = data.getValueByName("ClientProfileUpdate_ProfileUpdateURL");
        wqHomePage
                .action_Navigate_To_ClientProfilePage(profileUpdateURL);
        //--------------------------
        wqClientProfileUpdatePage
                .step_click_OtherCompanyDetails_Accordian();
        Assert.assertNotNull(wqClientProfileUpdatePage.validate_Industry_DropdownAvailable());
    }

    @Test (enabled = false)
    public void verify_Industry_DefaultValue() throws Exception {
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
        String profileUpdateURL = data.getValueByName("ClientProfileUpdate_ProfileUpdateURL");
        wqHomePage
                .action_Navigate_To_ClientProfilePage(profileUpdateURL);
        //--------------------------
        wqClientProfileUpdatePage
                .step_click_OtherCompanyDetails_Accordian();
        Assert.assertEquals(wqClientProfileUpdatePage.check_Default_Dropdown_Value_of_Industry(),"Industry");
    }

    @Test (enabled = false)
    public void verify_Selecting_Industry() throws Exception {
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
        String profileUpdateURL = data.getValueByName("ClientProfileUpdate_ProfileUpdateURL");
        wqHomePage
                .action_Navigate_To_ClientProfilePage(profileUpdateURL);
        //--------------------------
        wqClientProfileUpdatePage
                .step_click_OtherCompanyDetails_Accordian();
        wqClientProfileUpdatePage
                .step_select_a_Industry("Engineering");
    }

    @Test (enabled = false)
    public void verify_SubMarket_Dropdown_IsAvailable() throws Exception {
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
        String profileUpdateURL = data.getValueByName("ClientProfileUpdate_ProfileUpdateURL");
        wqHomePage
                .action_Navigate_To_ClientProfilePage(profileUpdateURL);
        //--------------------------
        wqClientProfileUpdatePage
                .step_click_OtherCompanyDetails_Accordian();
        Assert.assertNotNull(wqClientProfileUpdatePage.validate_SubMarket_DropdownAvailable());
    }

    @Test (enabled = false)
    public void verify_SubMarket_DefaultValue() throws Exception {
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
        String profileUpdateURL = data.getValueByName("ClientProfileUpdate_ProfileUpdateURL");
        wqHomePage
                .action_Navigate_To_ClientProfilePage(profileUpdateURL);
        //--------------------------
        wqClientProfileUpdatePage
                .step_click_OtherCompanyDetails_Accordian();
        Assert.assertEquals(wqClientProfileUpdatePage.check_Default_Dropdown_Value_of_SubMarket(),"Sub market");
    }

    @Test (enabled = false)
    public void verify_Selecting_SubMarket() throws Exception {
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
        String profileUpdateURL = data.getValueByName("ClientProfileUpdate_ProfileUpdateURL");
        wqHomePage
                .action_Navigate_To_ClientProfilePage(profileUpdateURL);
        //--------------------------
        wqClientProfileUpdatePage
                .step_click_OtherCompanyDetails_Accordian();
        wqClientProfileUpdatePage
                .step_select_a_SubMarket("Computer Networking Equipment");
    }

    @Test (enabled = false)
    public void verify_VerticalMarket_Dropdown_IsAvailable() throws Exception {
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
        String profileUpdateURL = data.getValueByName("ClientProfileUpdate_ProfileUpdateURL");
        wqHomePage
                .action_Navigate_To_ClientProfilePage(profileUpdateURL);
        //--------------------------
        wqClientProfileUpdatePage
                .step_click_OtherCompanyDetails_Accordian();
        Assert.assertNotNull(wqClientProfileUpdatePage.validate_VerticalMarket_DropdownAvailable());
    }

    @Test (enabled = false)
    public void verify_VerticalMarket_DefaultValue() throws Exception {
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
        String profileUpdateURL = data.getValueByName("ClientProfileUpdate_ProfileUpdateURL");
        wqHomePage
                .action_Navigate_To_ClientProfilePage(profileUpdateURL);
        //--------------------------
        wqClientProfileUpdatePage
                .step_click_OtherCompanyDetails_Accordian();
        Assert.assertEquals(wqClientProfileUpdatePage.check_Default_Dropdown_Value_of_VerticalMarket(),"Vertical market");
    }

    @Test (enabled = false)
    public void verify_Selecting_VerticalMarket() throws Exception {
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
        String profileUpdateURL = data.getValueByName("ClientProfileUpdate_ProfileUpdateURL");
        wqHomePage
                .action_Navigate_To_ClientProfilePage(profileUpdateURL);
        //--------------------------
        wqClientProfileUpdatePage
                .step_click_OtherCompanyDetails_Accordian();
        wqClientProfileUpdatePage
                .step_select_a_VerticalMarket("Energy Environment");
    }

    @Test (enabled = false)
    public void verify_StockPriceLabel_IsAvailable() throws Exception {
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
        String profileUpdateURL = data.getValueByName("ClientProfileUpdate_ProfileUpdateURL");
        wqHomePage
                .action_Navigate_To_ClientProfilePage(profileUpdateURL);
        //--------------------------

        wqClientProfileUpdatePage
                .step_click_OtherCompanyDetails_Accordian();
        Thread.sleep(2000);
        Assert.assertEquals(wqClientProfileUpdatePage.check_StockPrice_Label_IsAvailable(),"Stock Price");

    }

    @Test (enabled = false)
    public void verify_StrockPrice_Textbox_IsAvailable() throws Exception {
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
        String profileUpdateURL = data.getValueByName("ClientProfileUpdate_ProfileUpdateURL");
        wqHomePage
                .action_Navigate_To_ClientProfilePage(profileUpdateURL);
        //--------------------------

        wqClientProfileUpdatePage
                .step_click_OtherCompanyDetails_Accordian();
        Assert.assertNotNull(wqClientProfileUpdatePage.check_StockPrice_TextBox_IsAvailable());

    }

    @Test (enabled = false)
    public void verifyStockPriceTextBox_PlaceHolderText() throws Exception {
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
        String profileUpdateURL = data.getValueByName("ClientProfileUpdate_ProfileUpdateURL");
        wqHomePage
                .action_Navigate_To_ClientProfilePage(profileUpdateURL);
        //--------------------------

        wqClientProfileUpdatePage
                .step_click_OtherCompanyDetails_Accordian();
        Assert.assertEquals(wqClientProfileUpdatePage.check_PlaceHolderText_of_StockProce_Textbox(),"Stock Price1");

    }

    @Test (enabled = false)
    public void verify_StockPriceTextBox_ISEditable() throws Exception {
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
        String profileUpdateURL = data.getValueByName("ClientProfileUpdate_ProfileUpdateURL");
        wqHomePage
                .action_Navigate_To_ClientProfilePage(profileUpdateURL);
        //--------------------------

        wqClientProfileUpdatePage
                .step_click_OtherCompanyDetails_Accordian();
        Thread.sleep(2000);
        wqClientProfileUpdatePage
                .step_enter_Characters_In_StockPrice_Textbox("1we%");

    }

    @Test (enabled = false)
    public void verify_Country_DefaultValue() throws Exception {
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
        String profileUpdateURL = data.getValueByName("ClientProfileUpdate_ProfileUpdateURL");
        wqHomePage
                .action_Navigate_To_ClientProfilePage(profileUpdateURL);
        //--------------------------

        Assert.assertEquals(wqClientProfileUpdatePage.check_addingCountry_Dropdown_IsAvailable(),"");

    }

    @Test (enabled = false)
    public void verify_Country_Dropdown_IsAvailable() throws Exception {
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
        String profileUpdateURL = data.getValueByName("ClientProfileUpdate_ProfileUpdateURL");
        wqHomePage
                .action_Navigate_To_ClientProfilePage(profileUpdateURL);
        //--------------------------

        Assert.assertNotNull(wqClientProfileUpdatePage.check_Default_Dropdown_Value_of_SelectCountry(),"--- Please select ---");

    }

    @Test (enabled = true)
    public void verify_Selecting_Country() throws Exception {
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
        String profileUpdateURL = data.getValueByName("ClientProfileUpdate_ProfileUpdateURL");
        wqHomePage
                .action_Navigate_To_ClientProfilePage(profileUpdateURL);
        //--------------------------

        Assert.assertNotNull(wqClientProfileUpdatePage.check_Default_Dropdown_Value_of_SelectCountry(),"--- Please select ---");

    }

    /*
    //Billing Details
    @Test
    public void verify_BillingDetails_Accordian_IsAvailable(){
        wqClientProfileUpdatePage.validate_BillingDetails_Accordian();
    }

    @Test
    public void verify_Clicking_BillingDetails_Accordian_displays_Information() throws InterruptedException {
        Thread.sleep(5000);
        wqClientProfileUpdatePage.click_BillingDetails_Accordian();
        Assert.assertNotNull(wqClientProfileUpdatePage.validate_BillingDetails_Data_Displays());
    }*/
}
