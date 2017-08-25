package com.totalamber.qa.page.WQPages;

import com.totalamber.qa.automation.WebQuartersSeleniumBase;
import com.totalamber.qa.objectproperty.ElementHolder;
import org.openqa.selenium.WebDriver;

import java.util.List;

/**
 * Created by e.koshila on 8/22/2017.
 */
public class WQSupportDashboardPage implements ElementHolder {

    WebQuartersSeleniumBase seleniumBase;

    public WQSupportDashboardPage(WebDriver driver) {
        // TODO Auto-generated constructor stub

        seleniumBase = new WebQuartersSeleniumBase(driver);
    }

    public void checkCaseInDashboard(String caseID) {

        seleniumBase.checkIsValueExist(SYSAID_DASHBOARD_CASE_TABLE_XPATH, caseID);
    }

    public List<String> matchWithRowValue(String caseTableXpath, String caseID) {
       return seleniumBase.matchWithRowValue(caseTableXpath,caseID);
    }

    public void searchCases(String caseID) {
        seleniumBase.type(SYSAID_DASHBOARD_CASE_SEARCH_TEXTBOX_CSS,SYSAID_DASHBOARD_CASE_SEARCH_TEXTBOX_XPATH, caseID);
        seleniumBase.click(SYSAID_DASHBOARD_CASE_SEARCH_BUTTON_XPATH,SYSAID_DASHBOARD_CASE_SEARCH_BUTTON_CSS);
    }

    public void navigateToViewCasePage() {

        seleniumBase.click(SYSAID_DASHBOARD_VIEW_CASE_LINK_XPATH, SYSAID_DASHBOARD_VIEW_CASE_LINK_CSS);
    }

    public void clickApproveBillableHoursTile() {
        seleniumBase.click(SYSAID_APPROVE_BILLABLE_HOURS_TILE_XPATH, SYSAID_APPROVE_BILLABLE_HOURS_TILE_CSS);
    }
}
