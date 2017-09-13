package com.totalamber.qa.WQTest;

import com.totalamber.qa.automation.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import java.io.IOException;

/**
 * Created by t.piyananda on 13/09/2017.
 */
public class WQBackOfficeLoginTest extends TestBase{

    @BeforeMethod
    public void NavigateToPage() throws InterruptedException, IOException {
        initDomainObjects(DRIVER);
        String siteUrl = data.getValueByName("backOfficeUrl");
        setSiteURL(siteUrl);

    }
    @AfterMethod
    public void endTestMethod() throws Throwable{
        //quitDriver();
    }

    @Test (enabled = false)
    public void verify_The_Page_Browser_Title(){
        String expectedTitle = data.getValueByName("BOSignInPage");
        Assert.assertEquals(wqBackOfficeLoginPage.validate_BrowserTitle(), expectedTitle);

    }

    @Test (enabled = false)
    public void verify_Sign_In_Text(){
        String expectedText = data.getValueByName("BOSignInText");
        Assert.assertEquals(wqBackOfficeLoginPage.validate_SignInText(), expectedText);

    }

    //Need To WRite again
    @Test (enabled = false)
    public void verify_The_Page_Content(){
        String expectedPageContent = data.getValueByName("SignInPageContent");
        Assert.assertEquals(wqBackOfficeLoginPage.validate_pageContent(),expectedPageContent);

    }

/*    @Test (enabled = false)
    public void verify_The_Availiability_Of_The_DropDown(){
        Assert.assertNotNull(wqBackOfficeLoginPage.validate_Dropdown_Availability(),);

    }*/

    @Test (enabled = false)
    public void verify_User_Can_Select_The_Sign_In_Option_From_The_DropDown(){
        wqBackOfficeLoginPage.validate_selectingDropdown();

    }

    @Test
    public void verify_Two_Options_Available_In_The_DropDown(){
        String SignInOption1 = data.getValueByName("SignInOption1");
        String SignInOption2 = data.getValueByName("SignInOption2");

        wqBackOfficeLoginPage.validate_Option_Value_In_Dropdown(SignInOption1);
        //wqBackOfficeLoginPage.validate_Option_Value_In_Dropdown(SignInOption2);

    }


}
