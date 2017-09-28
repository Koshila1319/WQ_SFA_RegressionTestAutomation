package com.totalamber.qa.WQTest;

import com.totalamber.qa.automation.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by t.piyananda on 15/09/2017.
 */
public class WQDMManageUserRequestTest extends TestBase {

    @BeforeClass
    public void NavigateToPage() throws Exception {
        initDomainObjects(DRIVER);
        String siteUrl = data.getValueByName("url");
        setSiteURL(siteUrl);
        wqLoginPage.step_User_Enter_Given_Credentials(clientEmail,"asdf1234%");
        wqLoginPage.step_User_Click_Login_Button();
        wqdmDashboardPage.step_Click_Home_Button();
    }

    @AfterClass
    public void endTestMethod() throws Throwable{
        //quitDriver();
    }

    @Test
    public void verify_Assign_Users_Tile_IsAvailable() throws InterruptedException {

        wqdmDashboardPage.
        return seleniumBase.checkElementIsDisplayed(elementXpath)
    }


    @Test
    public void verify_Assign_Users_Tile_IsAvailable() throws InterruptedException {

    }



}