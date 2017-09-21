package com.totalamber.qa.WQTest;

import com.totalamber.qa.automation.TestBase;
import org.testng.Assert;
import org.testng.annotations.*;


import java.io.IOException;

/**
 * Created by t.piyananda on 13/09/2017.
 */
public class WQBackOfficeLoginTest extends TestBase{

    @BeforeClass
    public void NavigateToPage() throws InterruptedException, IOException {
        initDomainObjects(DRIVER);
        String siteUrl = data.getValueByName("BackOfficeUrl");
        setSiteURL(siteUrl);

    }
    @AfterClass
    public void endTestMethod() throws Throwable{
       // quitDriver();
    }

    @Test
    public void verify_The_Page_Browser_Title(){
        String expectedTitle = data.getValueByName("BOSignInPage");
        Assert.assertEquals(wqBackOfficeLoginPage.validate_BrowserTitle(), expectedTitle);
    }

    @Test
    public void verify_Sign_In_Text(){
        String expectedText = data.getValueByName("BOSignInText");
        Assert.assertEquals(wqBackOfficeLoginPage.validate_SignInText(), expectedText);
    }

    @Test
    public void verify_The_Availiability_Of_The_DropDown(){
        Assert.assertNotNull(wqBackOfficeLoginPage.validate_Dropdown_Availability());
    }

    @Test
    public void verify_User_Can_Select_The_Sign_In_Option_From_The_DropDown(){
        wqBackOfficeLoginPage.validate_selectingDropdown();
    }

    @Test
    public void verify_Login_as_BO_Users() throws InterruptedException {
        String AMUsername = data.getValueByName("AM_Username");
        String AMPassword = data.getValueByName("AM_Password");
        String WindowsAuthOption = data.getValueByName("SignInOption1");
        wqBackOfficeLoginPage.action_Login_as_BOUser(AMUsername,AMPassword);
        Thread.sleep(10000);
        wqBackOfficeLoginPage.action_selectAuthentication(WindowsAuthOption);
        Thread.sleep(10000);
    }

    @Test
    public void verify_Login_Leads_To_Account_Manager_Dashboard_Page(){
        String expectedTitle = data.getValueByName("AM_HomePage");
        Assert.assertEquals(wqBackOfficeLoginPage.validate_BrowserTitle(), expectedTitle);
    }






}
