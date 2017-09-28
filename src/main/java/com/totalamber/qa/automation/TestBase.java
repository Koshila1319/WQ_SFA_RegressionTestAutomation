package com.totalamber.qa.automation;

import com.totalamber.qa.data.property.Dataprovider;
import com.totalamber.qa.page.webQuarters.*;
import org.openqa.selenium.WebDriver;

import java.io.IOException;


public class TestBase  {

	protected static WebDriver DRIVER;
	public static Dataprovider data;
	protected SeleniumBase seleniumBase;

	protected WQLoginPage wqLoginPage;
	protected WQHomePage wqHomePage;
	protected WQBackOfficeLoginPage wqBackOfficeLoginPage;
	protected WQSignUpPage wqSignUpPage;
	protected WQClientRegPage wqClientRegPage;
	protected WQAMDashboardPage wqamDashboardPage;
	protected WQAMVerifyClientPage wqamVerifyClientPage;
	protected WQPanel wqPanel;
	protected WQTermsEvaluationPage wqTermsEvaluationPage;
	protected WQCheckMailcatchEmailPage wqCheckMailcatchEmailPage;
	protected WQCheckOutlookEmailPage wqCheckOutLookEmailPage;
	protected WQClientRegCompletePage wqClientRegCompletePage;
	protected WQSMDashboardPage wqSMDashboardPage;
	protected WQDMDashboardPage wqdmDashboardPage;


	public static final String clientEmail = "605e5569-55f2-4fbd-a982-c274113ec83c@mailcatch.com";


	public void initDomainObjects(WebDriver driver) throws IOException {
		data = new Dataprovider();
		wqLoginPage = new WQLoginPage(driver);
		wqHomePage = new WQHomePage(driver);
		wqBackOfficeLoginPage = new WQBackOfficeLoginPage(driver);
		wqSignUpPage = new WQSignUpPage(driver);
		wqClientRegPage = new WQClientRegPage(driver);
		wqamDashboardPage = new WQAMDashboardPage(driver);
		wqamVerifyClientPage = new WQAMVerifyClientPage(driver);
		wqPanel = new WQPanel(driver);
		wqTermsEvaluationPage = new WQTermsEvaluationPage(driver);
		wqCheckMailcatchEmailPage = new WQCheckMailcatchEmailPage(driver);
		wqCheckOutLookEmailPage = new WQCheckOutlookEmailPage(driver);
		wqClientRegCompletePage = new WQClientRegCompletePage(driver);
		wqSMDashboardPage = new WQSMDashboardPage(driver);
		wqdmDashboardPage = new WQDMDashboardPage(driver);
	}

	public void setSiteURL(String siteUrl) {
		seleniumBase = new SeleniumBase(DRIVER);
		seleniumBase.enterURL(siteUrl);
	}

	public void quitDriver() {
		seleniumBase.endDriver();
	}



}