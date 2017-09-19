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
public class WQSignUpTest extends TestBase{

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

    //Sign Up Page General
    @Test
    public void verify_The_SignUp_Browser_Title(){
        String title="WebQuarters User Sign-Up";
        wqHomePage.
                action_Navigate_To_SignUp_Page();
        Assert.assertEquals(title,wqSignUpPage.check_Login_Page_Browser_Title());
    }

    @Test
    public void verify_The_Constructor_Radio_Option()
    {
        wqHomePage.
                action_Navigate_To_SignUp_Page();
        wqSignUpPage.check_Constructor_Radio_Option_Available();

    }

    @Test
    public void verify_The_Client_Radio_Option()
    {
        wqHomePage.
                action_Navigate_To_SignUp_Page();
        wqSignUpPage.check_Client_Radio_Option_Available();

    }

    @Test
    public void verify_The_Partner_Radio_Option()
    {
        wqHomePage.
                action_Navigate_To_SignUp_Page();
        wqSignUpPage.check_Partner_Radio_Option_Available();

    }

    @Test
    public void verify_Copy_Right_Info_Availability()
    {
        wqHomePage.
                action_Navigate_To_SignUp_Page();
        wqSignUpPage.check_Copy_Right_Info_Available();
    }

    @Test
    public void verify_Step_Info_Availability()
    {
        wqHomePage.
                action_Navigate_To_SignUp_Page();
        wqSignUpPage.check_Step_Info_Available();
    }

    @Test
    public void verify_By_Default_Lets_Go_Button_Is_Disable()
    {
        wqHomePage.
                action_Navigate_To_SignUp_Page();
        wqSignUpPage.check_Lets_Go_Button_Is_Disable();
    }

    @Test
    public void verify_Button_Enable_When_User_Select_An_Option()
    {
        wqHomePage.
                action_Navigate_To_SignUp_Page();
        wqSignUpPage.select_Contractor_Radio_Option_Check_Button_Enable();
        wqSignUpPage.select_Client_Radio_Option_Check_Button_Enable();
        wqSignUpPage.select_Partner_Radio_Option_Check_Button_Enable();
    }

    @Test
    public void verify_The_Lets_Go_Button_Text()
    {
        wqHomePage.
                action_Navigate_To_SignUp_Page();

        Assert.assertEquals(wqSignUpPage.check_Lets_Go_Button_Text(),"Let's go!");
        System.out.println("Let's Go Button Text Verified");
    }

    @Test
    public void verify_The_Option_Redirected_Page_Browser_Title_Consultant_Registration_Page(){
        String title1="WebQuarters Consultant Registration";

        wqHomePage.
                action_Navigate_To_SignUp_Page();

        Assert.assertEquals(title1,wqSignUpPage.contractor_Radio_Button_Selection_Leads_To_Consultant_Registration_Page());


    }

    @Test
    public void verify_The_Option_Redirected_Page_Browser_Title_Client_Registration_Page(){
        String title2="WebQuarters Client Registration";

        wqHomePage.
                action_Navigate_To_SignUp_Page();
        Assert.assertEquals(title2,wqSignUpPage.client_Radio_Button_Selection_Leads_To_Client_Registration_Page());
    }

    @Test
    public void verify_The_Option_Redirected_Page_Browser_Title_Partner_Registration_Page(){
        String title3="WebQuarters Partner Registration";
        wqHomePage.
                action_Navigate_To_SignUp_Page();

        Assert.assertEquals(title3,wqSignUpPage.partner_Radio_Button_Selection_Leads_To_Partner_Registration_Page());
    }

    @Test
    public void verify_Lets_Go_Button_Leads_To_Selected_Option_Consultant_Registration_Page()
    {
        String URL="http://qa.webquarters.com:33366/Pages/ConsultantRegistration.aspx";
        wqHomePage.
                action_Navigate_To_SignUp_Page();
        wqSignUpPage.check_contractor_Radio_Button_Selection_Leads_To_Consultant_Registration_Page();
        Assert.assertEquals(URL,wqSignUpPage.check_The_Page_URL());

    }

    @Test
    public void verify_Lets_Go_Button_Leads_To_Selected_Option_Client_Registration_Page()
    {
        String URL="http://qa.webquarters.com:33366/Pages/ClientRegistration.aspx";
        wqHomePage.
                action_Navigate_To_SignUp_Page();
        wqSignUpPage.check_client_Radio_Button_Selection_Leads_To_Client_Registration_Page();
        Assert.assertEquals(URL,wqSignUpPage.check_The_Page_URL());

    }

    @Test
    public void verify_Lets_Go_Button_Leads_To_Selected_Option_Partner_Registration_Page()
    {
        String URL="http://qa.webquarters.com:33366/Pages/PartnerRegistration.aspx";
        wqHomePage.
                action_Navigate_To_SignUp_Page();
        wqSignUpPage.check_partner_Radio_Button_Selection_Leads_To_Partner_Registration_Page();
        Assert.assertEquals(URL,wqSignUpPage.check_The_Page_URL());

    }


}
