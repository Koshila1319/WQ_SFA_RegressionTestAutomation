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
	protected WQManageUserRequestsPage wqManageUserRequestsPage;
	protected WQAMAssignUsersPage wqamAssignUsersPage;
	protected WQUserProfileUpdatePage wqUserProfileUpdatePage;
	protected WQChangePWPage wqChangePWPage;
	protected WQTAndCPage wqTAndCPage;
	protected WQTAndCInProgressPage wqTAndCInProgressPage;
	protected WQTAndCAccepted wqTAndCAccepted;
	protected WQClientProfileUpdatePage wqClientProfileUpdatePage;
	protected WQVerifyClientPage wqVerifyClientPage;
	protected WQClientAssignPage wqClientAssignPage;
	protected WQClientCompanyProfilePage wqClientCompanyProfilePage;
	protected WQClientCompanyProfileUpdatePage wqClientCompanyProfileUpdatePage;
	protected WQUserProfilePage wqUserProfilePage;
	protected WQLicenseCategoryPage wqLicenseCategoryPage;
	protected WQPackagePage wqPackagePage;
	protected WQLicenseSuccessfulPage wqLicenseSuccessfulPage;

	//Request to change DM
	public static String newDmEmailByEmail = "";

	//Request to add new SU
	public static String newSUEmailByEmail = "";
	public static String newSURoleByEmail = "";
	public static String userAssignRequestedCompany = "";
	public static String newSUTempPwByEmail = "";
	public static final String clientEmail = "4f13c64d-e10f-4ca2-8c70-c16aa4cb8592@mailcatch.com";
	public static final String newDMEmail = "596b2cf8-5fe3-4a42-95b0-2dc4845148c4@mailcatch.com";
	public static final String SUEmail = "drftgyhu@mailcatch.com";





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
		wqManageUserRequestsPage = new WQManageUserRequestsPage(driver);
		wqamAssignUsersPage = new WQAMAssignUsersPage(driver);
		wqChangePWPage = new WQChangePWPage(driver);
		wqTAndCPage = new WQTAndCPage(driver);
		wqTAndCInProgressPage = new WQTAndCInProgressPage(driver);
		wqTAndCAccepted = new WQTAndCAccepted(driver);
		wqClientProfileUpdatePage = new WQClientProfileUpdatePage(driver);
		wqVerifyClientPage = new WQVerifyClientPage(driver);
		wqUserProfileUpdatePage = new WQUserProfileUpdatePage(driver);
		wqClientAssignPage = new WQClientAssignPage(driver);
		wqClientCompanyProfilePage = new WQClientCompanyProfilePage(driver);
		wqClientCompanyProfileUpdatePage=new WQClientCompanyProfileUpdatePage(driver);
		wqUserProfilePage = new WQUserProfilePage(driver);
		wqLicenseCategoryPage = new WQLicenseCategoryPage(driver);
		wqPackagePage = new WQPackagePage(driver);
		wqLicenseSuccessfulPage = new WQLicenseSuccessfulPage(driver);

	}

	public void setSiteURL(String siteUrl) {
		seleniumBase = new SeleniumBase(DRIVER);
		seleniumBase.enterURL(siteUrl);
	}

	public void quitDriver() {

		seleniumBase.endDriver();
	}



}