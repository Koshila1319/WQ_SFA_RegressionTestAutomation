package com.totalamber.qa.WQTest;

import com.totalamber.qa.automation.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

import static com.totalamber.qa.data.UI.elements.webQuarters.wqAMAssignUsersPage.*;
import static com.totalamber.qa.data.UI.elements.webQuarters.wqCheckMailCatchEmailPage.*;
import static com.totalamber.qa.data.UI.elements.webQuarters.wqDMDashboardPage.SUPPORT_TILE_DESABLED_XPATH;
import static com.totalamber.qa.data.UI.elements.webQuarters.wqSUDashboardPage.WQ_SU_DASHBOARD_LINK_XPATH;

/**
 * Created by e.koshila on 10/10/2017.
 */
public class WQSupportDashboardTest extends TestBase {

    @BeforeMethod
    public void NavigateToPage() throws Exception {
        initDomainObjects(DRIVER);
        String siteUrl = data.getValueByName("url");
        String passwordSU = data.getValueByName("SU_Password");
        setSiteURL(siteUrl);
        wqHomePage.
                action_Navigate_To_LoginPage();
        wqLoginPage.
                step_User_Enter_Given_Credentials(SU, passwordSU);
        wqLoginPage.
                step_User_Click_Login_Button();
        wqdmDashboardPage.
                step_Click_Home_Button();
    }

    @AfterMethod
    public void endTestMethod() throws Throwable {
        quitDriver();
    }

    @Test
    public void verify_Support_Dashboard_Link_Is_Available() throws Exception {
       NavigateToPage();
       Assert.assertEquals(wqsuDashboardPage.verify_Element_Is_Available(WQ_SU_DASHBOARD_LINK_XPATH), true, "Support Dshboard link is available !");
    }

    @Test
    public void verify_Support_Dashboard_Link_Text() throws Exception {
       String dashboardSULink = data.getValueByName("SU_DashboardPage_SUDashboardLink");

       NavigateToPage();
       Assert.assertEquals(wqsuDashboardPage.verify_Element_Is_Available(WQ_SU_DASHBOARD_LINK_XPATH),dashboardSULink, "SupportDashboard Link verified !");
    }

    @Test
    public void verify_Clicking_Support_Dashboard_Link_Leads_To_Support_Dashboard_Of_The_User() throws Exception {
        String supportDashboardBrowserTitle = data.getValueByName("SU_DashboardPage_SupportDashboardBrowserTitle");

        NavigateToPage();
        wqsuDashboardPage.step_Click_Support_dsahboard_Link();
        Assert.assertEquals(wqsuDashboardPage.check_Browser_Title(),supportDashboardBrowserTitle, "Support Dashboard browser title verified ! !");
    }

}
