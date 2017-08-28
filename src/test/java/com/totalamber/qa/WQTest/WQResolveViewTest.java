package com.totalamber.qa.WQTest;

import com.totalamber.qa.automation.WebQuartersTestBase;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;

public class WQResolveViewTest extends WebQuartersTestBase {

    @BeforeMethod
    public void NavigateToPage() throws InterruptedException, IOException {

        String passwordSU = data.getValueByName("passwordSupportUser");

        initDomainObjects(DRIVER);
        String siteUrl = data.getValueByName("url");
        setSiteURL(siteUrl);
        wqHomeDom.clickLoginButton();
        wqLoginDom.supportUserLogin(SupportUserEmail, passwordSU);

        Thread.sleep(3000);

    }
    @AfterMethod
    public void endTestMethod() throws Throwable{
        //quitDriver();
    }

    @Test
    public void verifyUserAbleToViewResolvedCasesFromDashboard() throws InterruptedException{

        String caseStatus = data.getValueByName("StatusResolved");

        wqMainDom.navigateToDMDashboardPage();
        wqdmDashboardDom.navigateToSupportDashboardPage();

        wqSupportDashboardDom.checkCaseInDashboard(CaseID);
        wqSupportDashboardDom.searchCases(CaseID);
        Thread.sleep(10000);

        List<String> list = wqSupportDashboardDom.matchWithRowValue(SYSAID_DASHBOARD_CASE_TABLE_XPATH, CaseID);

     /*   Assert.assertEquals(list.get(0), CaseID, "Case ID match with SysAid ! ");
        Assert.assertEquals(list.get(2), caseStatus, "Case Status match with SysAid ! ");
        Assert.assertEquals(list.get(4), "Pending Approval", "Verify Client approval is - "+ list.get(4));
*/
    }

    @Test
    public void verifyUserAbleToViewResolvedCasesFromViewCasePage() throws InterruptedException{

        String viewSupportCaseTitle = data.getValueByName("viewSupportCaseTitle");
        String caseStatus = data.getValueByName("StatusResolved");

        verifyUserAbleToViewResolvedCasesFromDashboard();
        Thread.sleep(5000);

        wqSupportDashboardDom.navigateToViewCasePage();
        Thread.sleep(7000);
        Assert.assertEquals(wqCaseViewDom.verifyDataEquals(VIEW_SUPPORT_CASE_PAGE_TITLE_XPATH), viewSupportCaseTitle, "Verified CasePage Title");
        Assert.assertEquals(wqCaseViewDom.verifyDataEquals(VIEW_CASE_CASE_ID_XPATH), CaseID, "Case ID match with SysAid !");
        Assert.assertEquals(wqCaseViewDom.verifyDataEquals(SYSAID_VIEW_CASE_PAGE_STATUS_XPATH), caseStatus, "Case Status match with SysAid !");

    }

    @Test
    public void verifyUserAbleToViewResolvedCasesFromResolveCasePage() throws InterruptedException{

        String resolvedCasesPageTitle = data.getValueByName("resolvedCasesPageTitle");
        String viewSupportCaseTitle = data.getValueByName("viewSupportCaseTitle");
        String caseStatus = data.getValueByName("StatusResolved");
        String existValue;

        verifyUserAbleToViewResolvedCasesFromViewCasePage();

        wqCaseViewDom.navigateToHomePage();
        wqdmDashboardDom.navigateToSupportDashboardPage();
        wqSupportDashboardDom.clickApproveBillableHoursTile();

        Assert.assertEquals(wqResolveCasesDom.verifyDataEquals(SYSAID_RESOLVE_CASE_PAGE_TITLE_XPATH),resolvedCasesPageTitle);

        existValue = wqResolveCasesDom.checkCaseInResolveCasePage(CaseID);
        Assert.assertEquals(existValue, CaseID, "CaseID exist !");
        wqResolveCasesDom.clickResolveCaseViewButton(CaseID);

        Assert.assertEquals(wqCaseViewDom.verifyDataEquals(VIEW_SUPPORT_CASE_PAGE_TITLE_XPATH), viewSupportCaseTitle, "Verified CasePage Title");
        Assert.assertEquals(wqCaseViewDom.verifyDataEquals(VIEW_CASE_CASE_ID_XPATH), CaseID, "Case ID match with SysAid !");
        Assert.assertEquals(wqCaseViewDom.verifyDataEquals(SYSAID_VIEW_CASE_PAGE_STATUS_XPATH), caseStatus, "Case Status match with SysAid !");
        Thread.sleep(3000);
    }

    @Test
    public void verifyUserAbleToAcceptCasesFromResolveCasePage() throws InterruptedException{

        String existValue;

        verifyUserAbleToViewResolvedCasesFromResolveCasePage();

        wqCaseViewDom.navigateBackToResolveCasePage();
        Thread.sleep(5000);

        wqResolveCasesDom.clickResolveCaseAcceptButton(CaseID);

        existValue = wqResolveCasePage.checkCaseInResolveCasePage(CaseID);
        Assert.assertNotEquals(existValue, CaseID, "Case Accepted !");

    }
}
