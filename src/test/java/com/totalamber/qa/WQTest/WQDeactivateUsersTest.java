package com.totalamber.qa.WQTest;

import com.totalamber.qa.automation.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

import static com.totalamber.qa.data.UI.elements.webQuarters.wqAMAssignUsersPage.WQ_AM_ASSIGN_USERS_SELECTED_COMPANY_XPATH;

/**
 * Created by s.wathsala on 9/15/2017.
 */
public class WQDeactivateUsersTest extends TestBase{

    @BeforeMethod
    public void NavigateToPage() throws InterruptedException, IOException {
        initDomainObjects(DRIVER);
    }
    @AfterMethod
    public void endTestMethod() throws Throwable{
        quitDriver();
    }

    @Test
    public void verify_AM_Navigate_To_Assign_Users_Page() throws Exception {
        String siteUrl = data.getValueByName("BackOfficeUrl");
        String AMUsername = data.getValueByName("AM_Username");
        String AMPassword = data.getValueByName("AM_Password");
        String WindowsAuthOption = data.getValueByName("SignInOption1");
        String assignUsersBrowserTitle = data.getValueByName("AM_assignUsersTilePage");

        setSiteURL(siteUrl);

        wqBackOfficeLoginPage.
                action_Login_as_BOUser(AMUsername,AMPassword);
        Thread.sleep(10000);
        wqBackOfficeLoginPage.
                action_selectAuthentication(WindowsAuthOption);
        Thread.sleep(10000);
        wqamDashboardPage.step_Click_Assign_Users_Tile();

        Assert.assertEquals(wqamDashboardPage.validate_user_goesTo_Page(),assignUsersBrowserTitle);
    }

    @Test
    public void verify_Selecting_Company() throws Exception {
        String siteUrl = data.getValueByName("BackOfficeUrl");
        String AMUsername = data.getValueByName("AM_Username");
        String AMPassword = data.getValueByName("AM_Password");
        String WindowsAuthOption = data.getValueByName("SignInOption1");

        setSiteURL(siteUrl);

        wqBackOfficeLoginPage.
                action_Login_as_BOUser(AMUsername,AMPassword);
        Thread.sleep(10000);
        wqBackOfficeLoginPage.
                action_selectAuthentication(WindowsAuthOption);
        Thread.sleep(10000);
        wqamDashboardPage.
                step_Click_Assign_Users_Tile();
        wqamAssignUsersPage.
                action_Select_Company(CompanySU);
        Thread.sleep(5000);

        Assert.assertEquals(wqamAssignUsersPage.verify_Data_Equals(WQ_AM_ASSIGN_USERS_SELECTED_COMPANY_XPATH),CompanySU);
    }

    // Deactivate SU
    @Test
    public void verify_Successfully_Deactivate_SU() throws Exception {
        String siteUrl = data.getValueByName("BackOfficeUrl");
        String AMUsername = data.getValueByName("AM_Username");
        String AMPassword = data.getValueByName("AM_Password");
        String WindowsAuthOption = data.getValueByName("SignInOption1");

        setSiteURL(siteUrl);

        wqBackOfficeLoginPage.
                action_Login_as_BOUser(AMUsername,AMPassword);
        Thread.sleep(10000);
        wqBackOfficeLoginPage.
                action_selectAuthentication(WindowsAuthOption);
        Thread.sleep(10000);
        wqamDashboardPage.
                step_Click_Assign_Users_Tile();
        wqamAssignUsersPage.
                action_Select_Company(CompanySU);
        Thread.sleep(5000);
        wqamAssignUsersPage.action_Click_Deactivate_Button(WQ_AM_ASSIGN_USERS_SELECTED_COMPANY_XPATH);


    }

}
