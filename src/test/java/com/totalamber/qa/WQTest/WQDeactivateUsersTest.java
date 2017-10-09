package com.totalamber.qa.WQTest;

import com.totalamber.qa.automation.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by s.wathsala on 9/15/2017.
 */
public class WQDeactivateUsersTest extends TestBase{

    @BeforeMethod
    public void NavigateToPage() throws InterruptedException, IOException {
        initDomainObjects(DRIVER);
        String siteUrl = data.getValueByName("BackOfficeUrl");
        String AMUsername = data.getValueByName("AM_Username");
        String AMPassword = data.getValueByName("AM_Password");
        String WindowsAuthOption = data.getValueByName("SignInOption1");
        setSiteURL(siteUrl);

        wqBackOfficeLoginPage.
                action_Login_as_BOUser(AMUsername, AMPassword);
        Thread.sleep(10000);
        wqBackOfficeLoginPage.
                action_selectAuthentication(WindowsAuthOption);
        Thread.sleep(10000);
    }
    @AfterMethod
    public void endTestMethod() throws Throwable{
        quitDriver();
    }

    @Test
    public void verify_AM_Navigate_To_Assign_Users_Page() throws Exception {
        NavigateToPage();
        wqamDashboardPage.
                step_Click_Assign_Users_Tile();
    }

    @Test
    public void verify_Selecting_Company() throws Exception {
        NavigateToPage();
        wqamDashboardPage.
                step_Click_Assign_Users_Tile();
        wqamAssignUsersPage.
                action_Select_Company();
        Thread.sleep(5000);

    }
}
