package com.totalamber.qa.domain.WQDom;

import com.totalamber.qa.page.WQPages.WQSupportDashboardPage;
import org.openqa.selenium.WebDriver;

import java.util.List;

/**
 * Created by e.koshila on 8/22/2017.
 */
public class WQSupportDashboardDom {


    WQSupportDashboardPage wqSupportDashboardPage;


    public WQSupportDashboardDom(WebDriver driver) {
        // TODO Auto-generated constructor stub
        wqSupportDashboardPage = new WQSupportDashboardPage(driver);
    }

    public void checkCaseInDashboard(String caseID) {

        wqSupportDashboardPage.checkCaseInDashboard(caseID);
    }

    public List<String> matchWithRowValue(String caseTableXpath, String caseID) {

        return wqSupportDashboardPage.matchWithRowValue(caseTableXpath, caseID);
    }

    public void searchCases(String caseID) {

        wqSupportDashboardPage.searchCases(caseID);
    }

    public void navigateToViewCasePage() {
        wqSupportDashboardPage.navigateToViewCasePage();
    }

    public void clickApproveBillableHoursTile() {

        wqSupportDashboardPage.clickApproveBillableHoursTile();

    }


    public void searchCasesInWQ(String caseID) {

        wqSupportDashboardPage.searchWQCases(caseID);
    }

    public String verifyDataEquals(String data) {
        return wqSupportDashboardPage.verifyDataEquals(data);
    }

    public void clickOnViewCase() {

        wqSupportDashboardPage.clickViewCase();
    }
}
