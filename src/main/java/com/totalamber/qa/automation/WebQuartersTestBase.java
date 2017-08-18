package com.totalamber.qa.automation;

import com.totalamber.qa.data.Dataprovider;
import com.totalamber.qa.domain.*;
import com.totalamber.qa.objectproperty.ElementHolder;
import com.totalamber.qa.page.AccountManagerPage;
import com.totalamber.qa.page.SalesManagerPage;
import com.totalamber.qa.page.SupportLoginPage;
import org.openqa.selenium.WebDriver;

import com.totalamber.qa.page.SysAidCasePage;
import com.totalamber.qa.page.SysAidHomePage;
import com.totalamber.qa.page.SysAidLoginPage;


import java.io.IOException;
import java.util.UUID;


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

	public static String CaseID = "";

//	public static final String SupportUserEmail = UUID.randomUUID().toString() + "@mailcatch.com";
	public static final String SupportUserEmail ="7a99f3a9-eaf5-43e4-991e-2fadc49eac1a@mailcatch.com";



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