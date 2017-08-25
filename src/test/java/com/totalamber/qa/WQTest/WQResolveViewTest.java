package com.totalamber.qa.WQTest;

import com.totalamber.qa.automation.WebQuartersTestBase;
import com.totalamber.qa.domain.SupportLoginDom;
import com.totalamber.qa.domain.WQDom.WQSupportDashboardDom;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WQResolveViewTest extends WebQuartersTestBase {

    @BeforeMethod
    public void NavigateToPage() throws InterruptedException, IOException {

        String passwordSU = data.getValueByName("newPasswordSupportUser");

        initDomainObjects(DRIVER);
        String siteUrl = data.getValueByName("url");
        setSiteURL(siteUrl);
        supportLoginDom.clientLogin(SupportUserEmail, passwordSU);
        Thread.sleep(3000);

    }
    @AfterMethod
    public void endTestMethod() throws Throwable{
        //quitDriver();
    }

    @Test
    public void verifyUserAbleToViewResolvedCasesFromDashboard() throws InterruptedException{

        String caseStatus = data.getValueByName("StatusResolved");

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

        wqSupportDashboardDom.navigateToViewCasePage();
        Thread.sleep(3000);
        Assert.assertEquals(wqCaseViewDom.verifyDataEquals(VIEW_SUPPORT_CASE_PAGE_TITLE_XPATH), viewSupportCaseTitle, "Verified CasePage Title");
        Assert.assertEquals(wqCaseViewDom.verifyDataEquals(VIEW_CASE_CASE_ID_XPATH), CaseID, "Case ID match with SysAid !");
        Assert.assertEquals(wqCaseViewDom.verifyDataEquals(SYSAID_VIEW_CASE_PAGE_STATUS_XPATH), caseStatus, "Case Status match with SysAid !");

    }

    @Test
    public void verifyUserAbleToViewResolvedCasesFromResolveCasePage() throws InterruptedException{

        String resolvedCasesPageTitle = data.getValueByName("resolvedCasesPageTitle");

        verifyUserAbleToViewResolvedCasesFromViewCasePage();

        wqCaseViewDom.navigateToHomePage();
        wqSupportDashboardDom.clickApproveBillableHoursTile();

        Assert.assertEquals(wqResolveCasesDom.verifyDataEquals(SYSAID_RESOLVE_CASE_PAGE_TITLE_XPATH),resolvedCasesPageTitle);

        wqResolveCasesDom.checkCaseInResolveCasePage(CaseID);
        wqResolveCasesDom.clickResolveCaseViewButton(CaseID);

    }

    @Test
    public void verifyUserAbleToAcceptCasesFromResolveCasePage() throws InterruptedException{

        wqResolveCasesDom.clickResolveCaseAcceptButton(CaseID);


    }
}
