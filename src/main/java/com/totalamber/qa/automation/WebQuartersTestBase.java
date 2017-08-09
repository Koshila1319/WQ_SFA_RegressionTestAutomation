package com.totalamber.qa.automation;

import com.totalamber.qa.data.Dataprovider;
import com.totalamber.qa.domain.*;
import com.totalamber.qa.objectproperty.ElementHolder;
import com.totalamber.qa.page.AccountManagerPage;
import com.totalamber.qa.page.SalesManagerPage;
import com.totalamber.qa.page.SupportLoginPage;
import org.openqa.selenium.WebDriver;

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

		data = new Dataprovider(); // Create object of Dataprovider class
		System.out.println("**************** START TESTING ****************");
		
		String useremail = UUID.randomUUID().toString() + "@mailcatch.com";
	}

	public void setSiteURL(String siteUrl) {
		seleniumBase = new WebQuartersSeleniumBase(DRIVER);
		seleniumBase.enterURL(siteUrl);
	}

	public void quitDriver() {
		seleniumBase.endDriver();
	}

	public void setmailinatorURL(String mailinatorURL) {
		seleniumBase = new WebQuartersSeleniumBase(DRIVER);
		seleniumBase.enterURL(mailinatorURL);
	}

}
