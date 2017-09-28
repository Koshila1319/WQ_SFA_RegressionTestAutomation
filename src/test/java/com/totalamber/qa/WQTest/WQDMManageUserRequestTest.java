package com.totalamber.qa.WQTest;

import com.totalamber.qa.automation.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;

import static com.totalamber.qa.data.UI.elements.webQuarters.wqDMDashboardPage.DM_DASHBOARD_ASSIGN_USERS_TILE_XPATH;

/**
 * Created by e.koshila on 9/28/2017.
 */
public class WQDMManageUserRequestTest extends TestBase {

    @BeforeClass
    public void NavigateToPage() throws Exception {
        initDomainObjects(DRIVER);
        String siteUrl = data.getValueByName("url");
        setSiteURL(siteUrl);
        wqHomePage.action_Navigate_To_LoginPage();
        wqLoginPage.step_User_Enter_Given_Credentials(clientEmail,"asdf1234%");
        wqLoginPage.step_User_Click_Login_Button();
        wqdmDashboardPage.step_Click_Home_Button();
      }

    @AfterClass
    public void endTestMethod() throws Throwable{
        //quitDriver();
    }

    @Test
    public void verify_Assign_Users_Tile_Is_Available() throws InterruptedException {
        Assert.assertEquals(wqdmDashboardPage.verify_Element_Is_Available(DM_DASHBOARD_ASSIGN_USERS_TILE_XPATH),true, "Asign Users tile is available !");
    }

    @Test
    public void verify_Clicking_Assign_Users_Tile_Leads_To_Manage_User_Requests_Page() throws InterruptedException {
       wqdmDashboardPage.step_Click_Assign_Users_Tile();
        Thread.sleep(5000);
        System.out.println(wqdmDashboardPage.check_Browser_Title());
       //Assert.assertEquals(wqdmDashboardPage.check_Browser_Title(),"WebQuarters LicensePreferancesManageUserRequests","Browser title verified !");
    }

}