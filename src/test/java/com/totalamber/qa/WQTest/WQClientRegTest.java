package com.totalamber.qa.WQTest;

import com.totalamber.qa.automation.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by s.wathsala on 9/19/2017.
 */
public class WQClientRegTest extends TestBase {

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


}
