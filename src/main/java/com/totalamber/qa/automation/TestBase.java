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

	public void initDomainObjects(WebDriver driver) throws IOException {
		data = new Dataprovider();
		wqLoginPage = new WQLoginPage(driver);
		wqHomePage = new WQHomePage(driver);
		wqBackOfficeLoginPage = new WQBackOfficeLoginPage(driver);
		wqSignUpPage = new WQSignUpPage(driver);
		wqClientRegPage = new WQClientRegPage(driver);

	}

	public void setSiteURL(String siteUrl) {
		seleniumBase = new SeleniumBase(DRIVER);
		seleniumBase.enterURL(siteUrl);
	}

	public void quitDriver() {
		seleniumBase.endDriver();
	}



}