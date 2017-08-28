package com.totalamber.qa.WQTest;

import com.totalamber.qa.automation.WebQuartersTestBase;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by s.wathsala on 8/25/2017.
 */
public class WQCloseViewCaseTest extends WebQuartersTestBase {


    @BeforeMethod
    public void NavigateToPage() throws InterruptedException, IOException {

        String passwordSU = data.getValueByName("passwordSupportUser");

        initDomainObjects(DRIVER);
        String siteUrl = data.getValueByName("url");
        setSiteURL(siteUrl);
        supportLoginDom.clientLogin(SupporUserEmail2, passwordSU);
        Thread.sleep(3000);

        CaseID = "48880";

    }
    @AfterMethod
    public void endTestMethod() throws Throwable{
        //quitDriver();
    }

    @Test
    public void verifyUserAbleToViewCloseCasesFromDashboard() throws InterruptedException{

        String caseStatus = data.getValueByName("StatusClosed");

        wqMainDom.navigateToDMDashboardPage();
        wqdmDashboardDom.navigateToSupportDashboardPage();
        wqSupportDashboardDom.searchCasesInWQ(CaseID);
        Thread.sleep(40000);
        Assert.assertEquals(wqSupportDashboardDom.verifyDataEquals(WQ_VIEW_CASE_PAGE_STATUS_XPATH), caseStatus, "Case Status match with WebQuarters !");
        wqSupportDashboardDom.clickOnViewCase();

    }

    @Test
    public void verifyUserAbleToViewResolvedCasesFromViewCasePage() throws InterruptedException{

        String viewSupportCaseTitle = data.getValueByName("viewSupportCaseTitle");
        String caseStatus = data.getValueByName("StatusClosed");

        verifyUserAbleToViewCloseCasesFromDashboard();

         Thread.sleep(3000);
        Assert.assertEquals(wqCaseViewDom.verifyDataEquals(VIEW_SUPPORT_CASE_PAGE_TITLE_XPATH), viewSupportCaseTitle, "Verified CasePage Title");
        Assert.assertEquals(wqCaseViewDom.verifyDataEquals(VIEW_CASE_CASE_ID_XPATH), CaseID, "Case ID match with WebQuarters !");
        Assert.assertEquals(wqCaseViewDom.verifyDataEquals(WEBQUARTERS_VIEW_CASE_PAGE_STATUS_XPATH), caseStatus, "Case Status match with WebQuarters !");

    }

}
