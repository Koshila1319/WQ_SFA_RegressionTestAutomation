package com.totalamber.qa.WQTest;

import com.totalamber.qa.automation.TestBase;
import com.totalamber.qa.page.webQuarters.WQClientRegPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.UUID;

/**
 * Created by s.wathsala on 9/19/2017.
 */
public class WQClientRegTest extends TestBase {

    String Clientemail = UUID.randomUUID().toString() + "@mailcatch.com";

    @BeforeMethod
    public void NavigateToPage() throws InterruptedException, IOException {
        initDomainObjects(DRIVER);
        String siteUrl = data.getValueByName("url");
        setSiteURL(siteUrl);

    }

    @AfterMethod
    public void endTestMethod() throws Throwable{
        quitDriver();
    }

    //company name field validations
    @Test
    public void verify_Company_Name_Text_Feild_Is_Single_Line_Of_Text()
    {
        wqHomePage.
                action_Navigate_To_SignUp_Page();
        wqSignUpPage.
                check_client_Radio_Button_Selection_Leads_To_Client_Registration_Page();
        wqClientRegPage.
                verify_Company_Name_Text_Feild_Single_Line_Of_Text_Feild();
    }

    @Test
    public void verify_Company_Name_Feild_Text() {
        wqHomePage.
                action_Navigate_To_SignUp_Page();
        wqSignUpPage.
                check_client_Radio_Button_Selection_Leads_To_Client_Registration_Page();
        Assert.assertEquals(wqClientRegPage.check_Company_Name_Feild_Text(),"Company name");
        System.out.println("Company Name Text Verified");
    }

    @Test
    public void verify_User_Can_Type_Numbers_Or_Any_Character_In_the_Company_Name_Text_Feild()
    {
        String company_name=data.getValueByName("Company_Name");
        wqHomePage.
                action_Navigate_To_SignUp_Page();
        wqSignUpPage.
                check_client_Radio_Button_Selection_Leads_To_Client_Registration_Page();
        wqClientRegPage.
                check_text_feild_data_type(company_name);
    }

    //Business reg no field validations
    @Test
    public void verify_Business_Reg_No_Text_Feild_Is_Single_Line_Of_Text()
    {
        wqHomePage.
                action_Navigate_To_SignUp_Page();
        wqSignUpPage.
                check_client_Radio_Button_Selection_Leads_To_Client_Registration_Page();
        wqClientRegPage.
                verify_Business_Reg_No_Text_Feild_Single_Line_Of_Text_Feild();
    }

    @Test
    public void verify_Business_Reg_No_Feild_Text() {
        wqHomePage.
                action_Navigate_To_SignUp_Page();
        wqSignUpPage.
                check_client_Radio_Button_Selection_Leads_To_Client_Registration_Page();
        Assert.assertEquals(wqClientRegPage.check_Business_Reg_No_Feild_Text(),"Business registration number");
        System.out.println("Business Registration Number Text Verified");
    }

    @Test
    public void verify_User_Can_Type_Numbers_Or_Any_Character_In_the_Business_Reg_No_Text_Feild()
    {
        String business_reg_no=data.getValueByName("Business_Reg_No");
        wqHomePage.
                action_Navigate_To_SignUp_Page();
        wqSignUpPage.
                check_client_Radio_Button_Selection_Leads_To_Client_Registration_Page();
        wqClientRegPage.
                check_text_feild_data_type(business_reg_no);
    }

    //first name field validations
    @Test
    public void verify_Your_First_Name_Text_Feild_Is_Single_Line_Of_Text()
    {
        wqHomePage.
                action_Navigate_To_SignUp_Page();
        wqSignUpPage.
                check_client_Radio_Button_Selection_Leads_To_Client_Registration_Page();
        wqClientRegPage.
                verify_First_Name_Text_Feild_Single_Line_Of_Text_Feild();
    }

    @Test
    public void verify_Your_First_Name_Feild_Text() {
        wqHomePage.
                action_Navigate_To_SignUp_Page();
        wqSignUpPage.
                check_client_Radio_Button_Selection_Leads_To_Client_Registration_Page();
        Assert.assertEquals(wqClientRegPage.check_First_Name_Feild_Text(),"Your first name");
        System.out.println("First Name Text Verified");
    }

    @Test
    public void verify_User_Can_Type_Numbers_Or_Any_Character_In_the_Your_First_Name_Text_Feild()
    {
        String first_name=data.getValueByName("First_Name");
        wqHomePage.
                action_Navigate_To_SignUp_Page();
        wqSignUpPage.
                check_client_Radio_Button_Selection_Leads_To_Client_Registration_Page();
        wqClientRegPage.
                check_text_feild_data_type(first_name);
    }

    //last name field validations
    @Test
    public void verify_Your_Last_Name_Text_Feild_Is_Single_Line_Of_Text()
    {
        wqHomePage.
                action_Navigate_To_SignUp_Page();
        wqSignUpPage.
                check_client_Radio_Button_Selection_Leads_To_Client_Registration_Page();
        wqClientRegPage.
                verify_Last_Name_Text_Feild_Single_Line_Of_Text_Feild();
    }

    @Test
    public void verify_Your_Last_Name_Feild_Text() {
        wqHomePage.
                action_Navigate_To_SignUp_Page();
        wqSignUpPage.
                check_client_Radio_Button_Selection_Leads_To_Client_Registration_Page();
        Assert.assertEquals(wqClientRegPage.check_Last_Name_Feild_Text(),"Your last name");
        System.out.println("Last Name Text Verified");
    }

    @Test
    public void verify_User_Can_Type_Numbers_Or_Any_Character_In_the_Your_Last_Name_Text_Feild()
    {
        String last_name=data.getValueByName("Last_Name");
        wqHomePage.
                action_Navigate_To_SignUp_Page();
        wqSignUpPage.
                check_client_Radio_Button_Selection_Leads_To_Client_Registration_Page();
        wqClientRegPage.
                check_text_feild_data_type(last_name);
    }

    //Email Address Feature Validations

    @Test
    public void verify_Your_Email_Text_Feild_Is_Single_Line_Of_Text()
    {
        wqHomePage.
                action_Navigate_To_SignUp_Page();
        wqSignUpPage.
                check_client_Radio_Button_Selection_Leads_To_Client_Registration_Page();
        wqClientRegPage.
                verify_Your_Email_Text_Feild_Single_Line_Of_Text_Feild();
    }

    @Test
    public void verify_Your_Email_Feild_Text() {
        wqHomePage.
                action_Navigate_To_SignUp_Page();
        wqSignUpPage.
                check_client_Radio_Button_Selection_Leads_To_Client_Registration_Page();
        Assert.assertEquals(wqClientRegPage.check_Your_Email_Text_Feild(),"Your Email");
        System.out.println("Email Text Verified");
    }

    @Test
    public void verify_Email_Address_Is_Validated()
    {
        String email=data.getValueByName("Email_Address");
        wqHomePage.
                action_Navigate_To_SignUp_Page();
        wqSignUpPage.
                check_client_Radio_Button_Selection_Leads_To_Client_Registration_Page();
        wqClientRegPage.check_Email_Feild_Text_Types(email);
    }

    //Title Feild Features

    @Test
    public void verify_Your_Title_Designation_Text_Feild_Is_Single_Line_Of_Text()
    {
        wqHomePage.
                action_Navigate_To_SignUp_Page();
        wqSignUpPage.
                check_client_Radio_Button_Selection_Leads_To_Client_Registration_Page();
        wqClientRegPage.
                verify_Your_Title_Designation_Feild_Single_Line_Of_Text_Feild();
    }

    @Test
    public void verify_Your_Title_Designation_Feild_Text() {
        wqHomePage.
                action_Navigate_To_SignUp_Page();
        wqSignUpPage.
                check_client_Radio_Button_Selection_Leads_To_Client_Registration_Page();
        Assert.assertEquals(wqClientRegPage.check_Your_Title_Designation_Text_Feild(),"Your Title / Designation");
        System.out.println("Title / Designation Text Verified");
    }

    @Test
    public void verify_User_Can_Type_Numbers_Or_Any_Character_In_the_Your_Title_Designation_Text_Feild()
    {
        String title=data.getValueByName("Title_Designation");
        wqHomePage.
                action_Navigate_To_SignUp_Page();
        wqSignUpPage.
                check_client_Radio_Button_Selection_Leads_To_Client_Registration_Page();
        wqClientRegPage.
                check_text_feild_data_type(title);
    }

    //company address features

    @Test
    public void verify_Company_Address_Text_Feild_Is_Single_Line_Of_Text()
    {
        wqHomePage.
                action_Navigate_To_SignUp_Page();
        wqSignUpPage.
                check_client_Radio_Button_Selection_Leads_To_Client_Registration_Page();
        wqClientRegPage.
                verify_Company_Address_Feild_Single_Line_Of_Text_Feild();
    }

    @Test
    public void verify_Company_Address_Feild_Text() {
        wqHomePage.
                action_Navigate_To_SignUp_Page();
        wqSignUpPage.
                check_client_Radio_Button_Selection_Leads_To_Client_Registration_Page();
        Assert.assertEquals(wqClientRegPage.check_Company_Address_Text_Feild(),"Company Address");
        System.out.println("Company Address Text Verified");
    }

    @Test
    public void verify_User_Can_Type_Numbers_Or_Any_Character_In_the_Company_Address_Text_Feild()
    {
        String company_address=data.getValueByName("Company_Address");
        wqHomePage.
                action_Navigate_To_SignUp_Page();
        wqSignUpPage.
                check_client_Radio_Button_Selection_Leads_To_Client_Registration_Page();
        wqClientRegPage.
                check_text_feild_data_type(company_address);
    }

    //Town City Features

    @Test
    public void verify_Town_City_Text_Feild_Is_Single_Line_Of_Text()
    {
        wqHomePage.
                action_Navigate_To_SignUp_Page();
        wqSignUpPage.
                check_client_Radio_Button_Selection_Leads_To_Client_Registration_Page();
        wqClientRegPage.
                verify_Town_City_Feild_Single_Line_Of_Text_Feild();
    }

    @Test
    public void verify_Town_City_Feild_Text() {
        wqHomePage.
                action_Navigate_To_SignUp_Page();
        wqSignUpPage.
                check_client_Radio_Button_Selection_Leads_To_Client_Registration_Page();
        Assert.assertEquals(wqClientRegPage.check_Town_City_Text_Feild(),"Town / City");
        System.out.println("Town / City Text Verified");
    }

    @Test
    public void verify_User_Can_Type_Numbers_Or_Any_Character_In_the_Town_City_Text_Feild()
    {
        String town_city=data.getValueByName("Town_City");
        wqHomePage.
                action_Navigate_To_SignUp_Page();
        wqSignUpPage.
                check_client_Radio_Button_Selection_Leads_To_Client_Registration_Page();
        wqClientRegPage.
                check_text_feild_data_type(town_city);
    }

    //Country State Features

    @Test
    public void verify_Country_State_Text_Feild_Is_Single_Line_Of_Text()
    {
        wqHomePage.
                action_Navigate_To_SignUp_Page();
        wqSignUpPage.
                check_client_Radio_Button_Selection_Leads_To_Client_Registration_Page();
        wqClientRegPage.
                verify_Country_State_Feild_Single_Line_Of_Text_Feild();
    }

    @Test
    public void verify_Country_State_Feild_Text() {
        wqHomePage.
                action_Navigate_To_SignUp_Page();
        wqSignUpPage.
                check_client_Radio_Button_Selection_Leads_To_Client_Registration_Page();
        Assert.assertEquals(wqClientRegPage.check_Country_State_Text_Feild(),"County / State");
        System.out.println("County / State Text Verified");
    }

    @Test
    public void verify_User_Can_Type_Numbers_Or_Any_Character_In_the_Country_State_Text_Feild()
    {
        String country_state=data.getValueByName("Country_State");
        wqHomePage.
                action_Navigate_To_SignUp_Page();
        wqSignUpPage.
                check_client_Radio_Button_Selection_Leads_To_Client_Registration_Page();
        wqClientRegPage.
                check_text_feild_data_type(country_state);
    }

    //postal zip code features

    @Test
    public void verify_Postal_Zip_Code_Text_Feild_Is_Single_Line_Of_Text()
    {
        wqHomePage.
                action_Navigate_To_SignUp_Page();
        wqSignUpPage.
                check_client_Radio_Button_Selection_Leads_To_Client_Registration_Page();
        wqClientRegPage.
                verify_Postal_Zip_Code_Feild_Single_Line_Of_Text_Feild();
    }

    @Test
    public void verify_Postal_Zip_Code_Feild_Text() {
        wqHomePage.
                action_Navigate_To_SignUp_Page();
        wqSignUpPage.
                check_client_Radio_Button_Selection_Leads_To_Client_Registration_Page();
        Assert.assertEquals(wqClientRegPage.check_Postal_Zip_Code_Text_Feild(),"Postal / Zip code");
        System.out.println("Postal / Zip code Text Verified");
    }

    @Test
    public void verify_User_Can_Type_Numbers_Or_Any_Character_In_the_Postal_Zip_Code_Text_Feild()
    {
        String postal_zip_code=data.getValueByName("Postal_Code");
        wqHomePage.
                action_Navigate_To_SignUp_Page();
        wqSignUpPage.
                check_client_Radio_Button_Selection_Leads_To_Client_Registration_Page();
        wqClientRegPage.
                check_text_feild_data_type(postal_zip_code);
    }

    //country features
    @Test
    public void verify_Country_Feild_Text()
    {

        wqHomePage.
                action_Navigate_To_SignUp_Page();
        wqSignUpPage.
                check_client_Radio_Button_Selection_Leads_To_Client_Registration_Page();
        Assert.assertEquals(wqClientRegPage.check_Country_Text_Feild(),"Country (please select)");
        System.out.println("Country Text Verified");
    }

    //contact number features

    @Test
    public void verify_Contact_Number_Text_Feild_Is_Single_Line_Of_Text()
    {
        wqHomePage.
                action_Navigate_To_SignUp_Page();
        wqSignUpPage.
                check_client_Radio_Button_Selection_Leads_To_Client_Registration_Page();
        wqClientRegPage.
                verify_Contact_Number_Feild_Single_Line_Of_Text_Feild();
    }

    @Test
    public void verify_Contact_Number_Feild_Text() {
        wqHomePage.
                action_Navigate_To_SignUp_Page();
        wqSignUpPage.
                check_client_Radio_Button_Selection_Leads_To_Client_Registration_Page();
        Assert.assertEquals(wqClientRegPage.check_Contact_Number_Text_Feild(),"Contact Number +001...");
        System.out.println("Contact Number Text Verified");
    }

    @Test
    public void verify_User_Can_Enter_Numbers_To_Contact_Number_Feild(){
        String contact_no=data.getValueByName("Contact_No");
        wqHomePage.
                action_Navigate_To_SignUp_Page();
        wqSignUpPage.
                check_client_Radio_Button_Selection_Leads_To_Client_Registration_Page();
        wqClientRegPage.
                check_text_feild_data_type(contact_no);
    }

    //Dialing Code Features

    @Test
    public void verify_Dialing_Code_Text_Feild_Is_Single_Line_Of_Text()
    {
        wqHomePage.
                action_Navigate_To_SignUp_Page();
        wqSignUpPage.
                check_client_Radio_Button_Selection_Leads_To_Client_Registration_Page();
        wqClientRegPage.
                verify_Dialing_Code_Feild_Single_Line_Of_Text_Feild();
    }

    @Test
    public void verify_Dialing_Code_Feild_Text() {
        wqHomePage.
                action_Navigate_To_SignUp_Page();
        wqSignUpPage.
                check_client_Radio_Button_Selection_Leads_To_Client_Registration_Page();
        Assert.assertEquals(wqClientRegPage.check_Dialing_Code_Text_Feild(),"Dialing code");
        System.out.println("Dialing Text Verified");
    }

    @Test
    public void verify_User_Can_Type_Numbers_Or_Any_Character_In_the_Dialing_Code_Text_Feild()
    {
        String dialling_code=data.getValueByName("Dialing_Code");
        wqHomePage.
                action_Navigate_To_SignUp_Page();
        wqSignUpPage.
                check_client_Radio_Button_Selection_Leads_To_Client_Registration_Page();
        wqClientRegPage.
                check_text_feild_data_type(dialling_code);
    }

    //Fax Features

    @Test
    public void verify_Fax_Text_Feild_Is_Single_Line_Of_Text()
    {
        wqHomePage.
                action_Navigate_To_SignUp_Page();
        wqSignUpPage.
                check_client_Radio_Button_Selection_Leads_To_Client_Registration_Page();
        wqClientRegPage.
                verify_Fax_Feild_Single_Line_Of_Text_Feild();
    }

    @Test
    public void verify_Fax_Feild_Text() {
        wqHomePage.
                action_Navigate_To_SignUp_Page();
        wqSignUpPage.
                check_client_Radio_Button_Selection_Leads_To_Client_Registration_Page();
        Assert.assertEquals(wqClientRegPage.check_Fax_Text_Feild(),"Fax");
        System.out.println("Fax Text Verified");
    }

    @Test
    public void verify_User_Can_Type_Numbers_Or_Any_Character_In_the_Fax_Text_Feild()
    {
        String fax=data.getValueByName("Fax");
        wqHomePage.
                action_Navigate_To_SignUp_Page();
        wqSignUpPage.
                check_client_Radio_Button_Selection_Leads_To_Client_Registration_Page();
        wqClientRegPage.
                check_text_feild_data_type(fax);
    }

    //Organization Size Features

    @Test
    public void verify_Organization_Size_Text()
    {
        wqHomePage.
                action_Navigate_To_SignUp_Page();
        wqSignUpPage.
                check_client_Radio_Button_Selection_Leads_To_Client_Registration_Page();
        Assert.assertEquals(wqClientRegPage.Organization_Size_Text_Feild(),"Organisation size");
        System.out.println("Organisation size Text Verified");
    }


    @Test
    public void verify_User_Can_Select_Organization_Size_From_Organization_Size_Feild()
    {
        wqHomePage.
                action_Navigate_To_SignUp_Page();
        wqSignUpPage.
                check_client_Radio_Button_Selection_Leads_To_Client_Registration_Page();
        wqClientRegPage.
                select_Organization_Size();
    }

    //Web Address Features

    @Test
    public void verify_Company_Web_Address_Feild_Is_Single_Line_Of_Text()
    {
        wqHomePage.
                action_Navigate_To_SignUp_Page();
        wqSignUpPage.
                check_client_Radio_Button_Selection_Leads_To_Client_Registration_Page();
        wqClientRegPage.
                verify_Company_Web_Address_Feild_Single_Line_Of_Text_Feild();
    }

    @Test
    public void verify_Company_Web_Address_Feild_Text() {
        wqHomePage.
                action_Navigate_To_SignUp_Page();
        wqSignUpPage.
                check_client_Radio_Button_Selection_Leads_To_Client_Registration_Page();
        Assert.assertEquals(wqClientRegPage.check_Company_Web_Address_Text_Feild(),"Company web address");
        System.out.println("Company web address Text Verified");
    }

    @Test
    public void verify_User_Can_Type_Numbers_Or_Any_Character_In_the_Company_Web_Address_Text_Feild()
    {
        String company_web_address=data.getValueByName("Company_web_address");
        wqHomePage.
                action_Navigate_To_SignUp_Page();
        wqSignUpPage.
                check_client_Radio_Button_Selection_Leads_To_Client_Registration_Page();
        wqClientRegPage.
                check_text_feild_data_type(company_web_address);
    }

    //Software Application Features
    @Test
    public void verify_Software_Application_Text(){
        wqHomePage.
            action_Navigate_To_SignUp_Page();
        wqSignUpPage.
                check_client_Radio_Button_Selection_Leads_To_Client_Registration_Page();
        Assert.assertEquals(wqClientRegPage.software_Application_Text_Feild(),"Software application");
        System.out.println("Software application Text Verified");

    }

    @Test
    public void verify_User_Can_Select_A_Software_From_Software_Application_Feild() throws InterruptedException {
        wqHomePage.
                action_Navigate_To_SignUp_Page();
        wqSignUpPage.
                check_client_Radio_Button_Selection_Leads_To_Client_Registration_Page();
        Thread.sleep(5000);
        wqClientRegPage.
                select_SW_Application();

    }

    //Module Features
    @Test
    public void verify_Modules_Text() {
        wqHomePage.
                action_Navigate_To_SignUp_Page();
        wqSignUpPage.
                check_client_Radio_Button_Selection_Leads_To_Client_Registration_Page();
        Assert.assertEquals(wqClientRegPage.check_Modules_Text_Feild(),"Modules");
        System.out.println("Modules Text Verified");
    }

    @Test
    public void verify_Data_Availability_In_Modules_When_User_Selecting_A_SW_Application() throws InterruptedException {
        verify_User_Can_Select_A_Software_From_Software_Application_Feild();
        Thread.sleep(5000);
        wqClientRegPage.select_Modules();

    }

    @Test
    public void verify_User_Can_Tick_The_Module_Checkboxes_According_To_SW_Application() throws InterruptedException {
        verify_User_Can_Select_A_Software_From_Software_Application_Feild();
        Thread.sleep(5000);
        wqClientRegPage.select_CheckBox_In_Modules();
    }

    @Test
    public void verify_Data_Availiability_In_Modules_Without_User_Selecting_A_SW_Application() throws InterruptedException {
        wqHomePage.
                action_Navigate_To_SignUp_Page();
        wqSignUpPage.
                check_client_Radio_Button_Selection_Leads_To_Client_Registration_Page();
        Thread.sleep(5000);

        Assert.assertEquals(wqClientRegPage.select_Modules_Without_The_SW(),true);

    }



    //Version Features
    @Test
    public void verify_Versions_Text() {
        wqHomePage.
                action_Navigate_To_SignUp_Page();
        wqSignUpPage.
                check_client_Radio_Button_Selection_Leads_To_Client_Registration_Page();
        Assert.assertEquals(wqClientRegPage.check_Versions_Text_Feild(),"Versions");
        System.out.println("Versions Text Verified");
    }

    @Test
    public void verify_Data_Availability_In_Version_When_User_Selecting_A_SW_Application() throws InterruptedException {
        verify_User_Can_Tick_The_Module_Checkboxes_According_To_SW_Application();
        Thread.sleep(5000);
        wqClientRegPage.select_Versions();
    }

    @Test
    public void verify_User_Can_Tick_The_Version_Checkboxes_According_To_SW_Application() throws InterruptedException {
        verify_User_Can_Tick_The_Module_Checkboxes_According_To_SW_Application();
        Thread.sleep(5000);
        wqClientRegPage.select_CheckBox_In_Versions();
    }


    @Test
    public void verify_Data_Availiability_In_Versions_Without_User_Selecting_A_SW_Application() throws InterruptedException {
        wqHomePage.
                action_Navigate_To_SignUp_Page();
        wqSignUpPage.
                check_client_Radio_Button_Selection_Leads_To_Client_Registration_Page();
        Thread.sleep(5000);
        Assert.assertEquals(wqClientRegPage.select_Versions_Without_The_SW(),true);


    }

    //Add Button Features

    @Test
    public void verify_Add_Button_Text_Feild()
    {
        wqHomePage.
                action_Navigate_To_SignUp_Page();
        wqSignUpPage.
                check_client_Radio_Button_Selection_Leads_To_Client_Registration_Page();
        Assert.assertEquals(wqClientRegPage.check_Add_Button_Text_Feild(),"Add");
        System.out.println("Add Button Text Verified");
    }

    @Test
    public void verify_The_Mandatory_feilds() throws InterruptedException {

        String application_name_error_msg="Please select application name";
        String module_error_msg="Please select at least one module";

        wqHomePage.
                action_Navigate_To_SignUp_Page();
        wqSignUpPage.
                check_client_Radio_Button_Selection_Leads_To_Client_Registration_Page();
        Thread.sleep(5000);
        wqClientRegPage.
                click_Add_Button();
        Thread.sleep(10000);
        Assert.assertEquals(wqClientRegPage.check_App_Name_Error_Msg(),application_name_error_msg);
        Thread.sleep(5000);
        wqClientRegPage.
                select_SW_Application();
        wqClientRegPage.
                click_Add_Button();
        Thread.sleep(10000);
        Assert.assertEquals(wqClientRegPage.check_Module_Error_Msg(),module_error_msg);
    }

    @Test
    public void verify_User_Can_Successfully_Add_SW_App_Info() throws InterruptedException {
        wqHomePage.
                action_Navigate_To_SignUp_Page();
        wqSignUpPage.
                check_client_Radio_Button_Selection_Leads_To_Client_Registration_Page();
        Thread.sleep(5000);
        wqClientRegPage.
                select_SW_Application();
        Thread.sleep(5000);
        wqClientRegPage.
                select_CheckBox_In_Modules();
        Thread.sleep(5000);
        wqClientRegPage.
                select_CheckBox_In_Versions();
        Thread.sleep(5000);
        wqClientRegPage.
                click_Add_Button();
    }

    @Test
    public void verify_Delete_Button_Text_Feild() throws InterruptedException {
        verify_User_Can_Successfully_Add_SW_App_Info();
        Thread.sleep(5000);
        Assert.assertEquals(wqClientRegPage.check_Delete_Button_Text_Feild(),"Delete");
        System.out.println("Delete Button Text Verified");
    }

    @Test
    public void verify_User_Can_Successfully_Delete_SW_App_Info() throws InterruptedException {
        verify_User_Can_Successfully_Add_SW_App_Info();
        Thread.sleep(5000);
        wqClientRegPage.
                check_User_Can_Delete_App_Info();

    }

    @Test
    public void verify_How_Did_You_Hear_About_Us_Title(){
        String title="How did you hear about us";
        wqHomePage.
                action_Navigate_To_SignUp_Page();
        wqSignUpPage.
                check_client_Radio_Button_Selection_Leads_To_Client_Registration_Page();
        Assert.assertEquals(wqClientRegPage.check_How_Did_You_Hear_About_Us_Title(),title);
    }

    @Test
    public void verify_The_Selection_Dropdown_Text()
    {
        wqHomePage.
                action_Navigate_To_SignUp_Page();
        wqSignUpPage.
                check_client_Radio_Button_Selection_Leads_To_Client_Registration_Page();
        Assert.assertEquals(wqClientRegPage.check_Selection_DropDown_Text(),"Please select");
    }

    @Test
    public void verify_User_Can_Select_An_Email_Marketing_Using_The_DropDown()
    {
        wqHomePage.
                action_Navigate_To_SignUp_Page();
        wqSignUpPage.
                check_client_Radio_Button_Selection_Leads_To_Client_Registration_Page();
        wqClientRegPage.
                select_An_Email_Marketing();
    }

    @Test
    public void verify_Sign_Me_Up_Button_Text_Feild()
    {
        wqHomePage.
                action_Navigate_To_SignUp_Page();
        wqSignUpPage.
                check_client_Radio_Button_Selection_Leads_To_Client_Registration_Page();
        Assert.assertEquals(wqClientRegPage.check_Sign_Me_Up_Button_Text(),"Sign me up!");
    }

    @Test
    public void verify_The_Client_Reg_Form_Mandatory_feilds()
    {
        wqHomePage.
                action_Navigate_To_SignUp_Page();
        wqSignUpPage.
                check_client_Radio_Button_Selection_Leads_To_Client_Registration_Page();
        wqClientRegPage.
                click_Sign_Me_Up_Button();
        Assert.assertEquals("rgba(255, 0, 0, 1)",wqClientRegPage.check_Company_Name_Feild_Is_Mandatory());
        Assert.assertEquals("rgba(255, 0, 0, 1)",wqClientRegPage.check_First_Name_Feild_Is_Mandatory());
        Assert.assertEquals("rgba(255, 0, 0, 1)",wqClientRegPage.check_Last_Name_Feild_Is_Mandatory());
        Assert.assertEquals("rgba(255, 0, 0, 1)",wqClientRegPage.check_Email_Feild_Is_Mandatory());
        Assert.assertEquals("rgba(255, 0, 0, 1)",wqClientRegPage.check_Title_Feild_Is_Mandatory());
        Assert.assertEquals("rgba(255, 0, 0, 1)",wqClientRegPage.check_Company_Address_Feild_Is_Mandatory());
        Assert.assertEquals("rgba(255, 0, 0, 1)",wqClientRegPage.check_Town_City_Feild_Is_Mandatory());
        Assert.assertEquals("rgba(255, 0, 0, 1)",wqClientRegPage.check_Contact_Number_Feild_Is_Mandatory());
    }

    @Test
    public void verify_Adding_Organization_Size_Is_Mandatory()
    {
        String organization_Size_Error_Msg="Please select organisation size";
        String fName = data.getValueByName("First_Name");
        String lName = data.getValueByName("Last_Name");
        String email = Clientemail;
        String jobTitle = data.getValueByName("Title_Designation");
        String address = data.getValueByName("Company_Address");
        String town = data.getValueByName("Town_City");
        String contactNo = data.getValueByName("Contact_No");
        String companyName = data.getValueByName("Company_Name");
        wqHomePage.
                action_Navigate_To_SignUp_Page();
        wqSignUpPage.
                check_client_Radio_Button_Selection_Leads_To_Client_Registration_Page();
        wqClientRegPage.
                fill_Client_Registration_Info(companyName,fName,lName,email,jobTitle,address,town,contactNo).
                click_Sign_Me_Up_Button();
        Assert.assertEquals(wqClientRegPage.check_Organization_Size_Error_Msg(),organization_Size_Error_Msg);
    }

    @Test
    public void verify_How_Did_You_Hear_About_Us_Feild_Is_Mandatory(){
        String Error_Msg="Please select How did you get to know WQ?";
        verify_Adding_Organization_Size_Is_Mandatory();
        wqClientRegPage.
                select_Organization_Size().
                click_Sign_Me_Up_Button();
        Assert.assertEquals(wqClientRegPage.check_How_Did_You_Hear_About_Us_Error_Msg(),Error_Msg);
    }

    @Test
    public void verify_Adding_Country_Is_Mandatory(){
        String Error_Msg="Please select country";
        verify_How_Did_You_Hear_About_Us_Feild_Is_Mandatory();
        wqClientRegPage.
                select_An_Email_Marketing().
                click_Sign_Me_Up_Button();
        Assert.assertEquals(wqClientRegPage.check_Country_Error_Msg(),Error_Msg);

    }

    @Test
    public void verify_Adding_A_SW_App_Info_Is_Mandatory(){
        String Error_Msg="Please select application,version and modules details";
        verify_Adding_Country_Is_Mandatory();
        wqClientRegPage.
                select_Country().
                click_Sign_Me_Up_Button();
        Assert.assertEquals(wqClientRegPage.check_Country_Error_Msg(),Error_Msg);

    }

    @Test
    public void verify_User_Can_Register_The_Client_Info_Successfully() throws InterruptedException {
        verify_Adding_A_SW_App_Info_Is_Mandatory();

        Thread.sleep(5000);
        wqClientRegPage.
                select_SW_Application();
        Thread.sleep(5000);
        wqClientRegPage.
                select_CheckBox_In_Modules();
        Thread.sleep(5000);
        wqClientRegPage.
                select_CheckBox_In_Versions();
        Thread.sleep(5000);
        wqClientRegPage.
                click_Add_Button();
        Thread.sleep(5000);
        wqClientRegPage.click_Sign_Me_Up_Button();

    }

    @Test
    public void verify_Sign_Me_Up_Button_Leads_To_Thank_You_For_SignUp_Page() throws InterruptedException {
        verify_User_Can_Register_The_Client_Info_Successfully();
        Assert.assertEquals(wqClientRegPage.check_Thank_You_Page_Title(),"WebQuarters Registration Complete - Status");
    }

    @Test
    public void verify_Exsiting_Emails() throws InterruptedException {
        String fName = data.getValueByName("First_Name");
        String lName = data.getValueByName("Last_Name");
        String email = data.getValueByName("Email_Address");
        String jobTitle = data.getValueByName("Title_Designation");
        String address = data.getValueByName("Company_Address");
        String town = data.getValueByName("Town_City");
        String contactNo = data.getValueByName("Contact_No");
        String companyName = data.getValueByName("Company_Name");
        wqHomePage.
                action_Navigate_To_SignUp_Page();
        wqSignUpPage.
                check_client_Radio_Button_Selection_Leads_To_Client_Registration_Page();
        wqClientRegPage.
                fill_Client_Registration_Info(companyName,fName,lName,email,jobTitle,address,town,contactNo);
        wqClientRegPage.select_Organization_Size();
        wqClientRegPage.select_Country();
        Thread.sleep(5000);
        wqClientRegPage.
                select_SW_Application();
        Thread.sleep(5000);
        wqClientRegPage.
                select_CheckBox_In_Modules();
        Thread.sleep(5000);
        wqClientRegPage.
                select_CheckBox_In_Versions();
        Thread.sleep(5000);
        wqClientRegPage.
                click_Add_Button();
        Thread.sleep(5000);

        wqClientRegPage.
                select_An_Email_Marketing();
        wqClientRegPage.
                click_Sign_Me_Up_Button();
        Assert.assertEquals(wqClientRegPage.check_Email_Error_Msg(),"Email address already exist");

    }


}
