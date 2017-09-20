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

}
