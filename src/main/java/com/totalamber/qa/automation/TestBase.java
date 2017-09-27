package com.totalamber.qa.automation;

import com.totalamber.qa.data.UI.elements.webQuarters.wqAMDashboardPage;
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
	protected WQChangePWPage wqChangePWPage;
	protected WQTAndCPage wqTAndCPage;
	protected WQTAndCInProgressPage wqTAndCInProgressPage;
	protected WQTAndCAccepted wqTAndCAccepted;
	protected WQClientProfileUpdatePage wqClientProfileUpdatePage;


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
		wqChangePWPage = new WQChangePWPage(driver);
		wqTAndCPage = new WQTAndCPage(driver);
		wqTAndCInProgressPage = new WQTAndCInProgressPage(driver);
		wqTAndCAccepted = new WQTAndCAccepted(driver);
		wqClientProfileUpdatePage = new WQClientProfileUpdatePage(driver);

	}

	public void setSiteURL(String siteUrl) {
		seleniumBase = new SeleniumBase(DRIVER);
		seleniumBase.enterURL(siteUrl);
	}

	public void quitDriver() {
		seleniumBase.endDriver();
	}



}