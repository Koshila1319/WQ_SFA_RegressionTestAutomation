package com.webQuarters.qa.automation;

import com.webQuarters.qa.data.property.Dataprovider;
import com.webQuarters.qa.test.webQuarters.page.*;
import com.webQuarters.qa.test.webQuarters.page.Department.SFAAddDepartmentPage;
import com.webQuarters.qa.test.webQuarters.page.Department.SFADepartmentPage;
import com.webQuarters.qa.test.webQuarters.page.Department.SFAEditDepartmentPage;
import com.webQuarters.qa.test.webQuarters.page.Department.SFARemoveDepartmentPage;
import com.webQuarters.qa.test.webQuarters.page.Designation.SFAAddDesignationPage;
import com.webQuarters.qa.test.webQuarters.page.Designation.SFADesignationPage;
import com.webQuarters.qa.test.webQuarters.page.Designation.SFAEditDesignationPage;
import com.webQuarters.qa.test.webQuarters.page.Designation.SFARemoveDesignationPage;
import com.webQuarters.qa.test.webQuarters.page.Employee.SFAAddEmployeePage;
import com.webQuarters.qa.test.webQuarters.page.Employee.SFAEditEmployeePage;
import com.webQuarters.qa.test.webQuarters.page.Employee.SFAEmployeePage;
import org.openqa.selenium.WebDriver;

import java.io.IOException;


public class TestBase  {

	protected static WebDriver DRIVER;
	public static Dataprovider data;
	protected SeleniumBase seleniumBase;

	//SFA
	protected SFALoginPage sfaLoginPage;
	protected SFAHomePage sfaHomePage;
	protected SFAForgotPasswordPage sfaForgotPasswordPage;
	protected MailinatorEmailPage mailinatorEmailPage;
	protected SFAAccountActivationPage sfaAccountActivationPage;
	protected SFADepartmentPage sfaDepartmentPage;
	protected SFAAddDepartmentPage sfaAddDepartmentPage;
	protected SFAEditDepartmentPage sfaEditDepartmentPage;
	protected SFARemoveDepartmentPage sfaRemoveDepartmentPage;
	protected SFADesignationPage sfaDesignationPage;
	protected SFAAddDesignationPage sfaAddDesignationPage;
	protected SFAEditDesignationPage sfaEditDesignationPage;
	protected SFARemoveDesignationPage sfaRemoveDesignationPage;
	protected SFAEmployeePage sfaEmployeePage;
	protected SFAAddEmployeePage sfaAddEmployeePage;
	protected SFAEditEmployeePage sfaEditEmployeePage;

	public void initDomainObjects(WebDriver driver) throws IOException {
		data = new Dataprovider();

		sfaLoginPage = new SFALoginPage(driver);
		sfaHomePage = new SFAHomePage(driver);
		sfaForgotPasswordPage = new SFAForgotPasswordPage(driver);
		mailinatorEmailPage = new MailinatorEmailPage(driver);
		sfaAccountActivationPage = new SFAAccountActivationPage(driver);
		sfaDepartmentPage = new SFADepartmentPage(driver);
		sfaAddDepartmentPage = new SFAAddDepartmentPage(driver);
		sfaEditDepartmentPage = new SFAEditDepartmentPage(driver);
		sfaRemoveDepartmentPage = new SFARemoveDepartmentPage(driver);
		sfaDesignationPage = new SFADesignationPage(driver);
		sfaAddDesignationPage = new SFAAddDesignationPage(driver);
		sfaEditDesignationPage = new SFAEditDesignationPage(driver);
		sfaRemoveDesignationPage = new SFARemoveDesignationPage(driver);
		sfaEmployeePage = new SFAEmployeePage(driver);
		sfaEditEmployeePage = new SFAEditEmployeePage(driver);
	}

	public void setSiteURL(String siteUrl) {
		seleniumBase = new SeleniumBase(DRIVER);
		seleniumBase.enterURL(siteUrl);
	}

	public void quitDriver() {
		seleniumBase.endDriver();
	}



}