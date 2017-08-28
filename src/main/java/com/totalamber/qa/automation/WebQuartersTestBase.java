package com.totalamber.qa.automation;

import com.totalamber.qa.data.Dataprovider;
import com.totalamber.qa.domain.*;
import com.totalamber.qa.domain.SysAidDom.SysAidCaseDom;
import com.totalamber.qa.domain.SysAidDom.SysAidHomeDom;
import com.totalamber.qa.domain.SysAidDom.SysAidLoginDom;
import com.totalamber.qa.domain.WQDom.*;
import com.totalamber.qa.objectproperty.ElementHolder;
import com.totalamber.qa.page.AccountManagerPage;
import com.totalamber.qa.page.SalesManagerPage;
import com.totalamber.qa.page.SupportLoginPage;
import com.totalamber.qa.page.WQPages.*;
import org.openqa.selenium.WebDriver;

import com.totalamber.qa.page.SysAidPages.SysAidCasePage;
import com.totalamber.qa.page.SysAidPages.SysAidHomePage;
import com.totalamber.qa.page.SysAidPages.SysAidLoginPage;


import java.io.IOException;


public class WebQuartersTestBase implements ElementHolder {

	protected static WebDriver DRIVER;

	public static Dataprovider data;

	protected WebQuartersSeleniumBase seleniumBase;
	protected FormFiller formFiller;
	protected ClientRegistrationFormFiller clientRegistrationFormFiller;

	protected SalesManagerDom salesManagerDom;
	protected SalesManagerPage salesManagerPage;

	protected AccountManagerDom accountManagerDom;
	protected AccountManagerPage accountManagerPage;

	protected SupportLoginDom supportLoginDom;
	protected SupportLoginPage supportLoginPage;

	protected SysAidLoginDom sysAidLoginDom;
	protected SysAidLoginPage sysAidLoginPage;

	protected SysAidHomePage sysAidHomePage;
	protected SysAidHomeDom sysAidHomeDom;

	protected SysAidCasePage sysAidCasePage;
	protected SysAidCaseDom sysAidCaseDom;

	protected WQSupportDashboardPage wqSupportDashboardPage;
	protected WQSupportDashboardDom wqSupportDashboardDom;

	protected WQCaseViewDom wqCaseViewDom;
	protected WQCaseViewPage wqCaseViewPage;

	protected WQResolveCasesDom wqResolveCasesDom;
	protected WQResolveCasesPage wqResolveCasePage;

	protected WQHomeDom wqHomeDom;
	protected WQHomePage wqHomePage;

	protected WQLoginDom wqLoginDom;
	protected WQLoginPage wqLoginPage;

	protected WQMainDom wqMainDom;
	protected WQMainPage wqMainPage;

	protected WQDMDashboardDom wqdmDashboardDom;
	protected WQDMDashboardPage wqdmDashboardPage;

	protected WQCloseCasesPage wqCloseCasesPage;
	protected WQCloseCasesDom wqCloseCasesDom;


	public static String CaseID = "";

//	public static final String SupportUserEmail = UUID.randomUUID().toString() + "@mailcatch.com";
	public static final String SupportUserEmail ="7a99f3a9-eaf5-43e4-991e-2fadc49eac1a@mailcatch.com";
	public static final String SupporUserEmail2 = "596b2cf8-5fe3-4a42-95b0-2dc4845148c4@mailcatch.com";


	public WebQuartersTestBase() {
		// TODO Auto-generated constructor stub
		WebQuartersTestBase webQuartersTestBase;
	}

	public void initDomainObjects(WebDriver driver) throws IOException {
		formFiller = new FormFiller(driver);
		clientRegistrationFormFiller = new ClientRegistrationFormFiller(driver);
		supportLoginDom = new SupportLoginDom(driver);
		supportLoginPage = new SupportLoginPage(driver);

		salesManagerDom = new SalesManagerDom(driver);
		salesManagerPage = new SalesManagerPage(driver);

		accountManagerDom = new AccountManagerDom(driver);
		accountManagerPage = new AccountManagerPage(driver);

		sysAidLoginPage = new SysAidLoginPage(driver);
		sysAidLoginDom = new SysAidLoginDom(driver);

		sysAidHomePage = new SysAidHomePage(driver);
		sysAidHomeDom = new SysAidHomeDom(driver);

		sysAidCasePage = new SysAidCasePage(driver);
		sysAidCaseDom = new SysAidCaseDom(driver);

		wqSupportDashboardPage = new WQSupportDashboardPage(driver);
		wqSupportDashboardDom = new WQSupportDashboardDom(driver);

		wqCaseViewPage = new WQCaseViewPage(driver);
		wqCaseViewDom = new WQCaseViewDom(driver);

		wqResolveCasePage = new WQResolveCasesPage(driver);
		wqResolveCasesDom = new WQResolveCasesDom(driver);


        wqHomePage = new WQHomePage(driver);
        wqHomeDom = new WQHomeDom(driver);

        wqLoginPage = new WQLoginPage(driver);
        wqLoginDom = new WQLoginDom(driver);





		wqMainPage = new WQMainPage(driver);
		wqMainDom = new WQMainDom(driver);

		wqCloseCasesPage = new WQCloseCasesPage(driver);
		wqCloseCasesDom = new WQCloseCasesDom(driver);

		wqdmDashboardPage = new WQDMDashboardPage(driver);
		wqdmDashboardDom = new WQDMDashboardDom(driver);






		data = new Dataprovider(); // Create object of Dataprovider class
		System.out.println("**************** START TESTING ****************");


	}

	public void setSiteURL(String siteUrl) {
		seleniumBase = new WebQuartersSeleniumBase(DRIVER);
		seleniumBase.enterURL(siteUrl);
	}

	public void quitDriver() {
		seleniumBase.endDriver();
	}

}