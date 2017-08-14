package com.totalamber.qa.page;

import com.totalamber.qa.automation.WebQuartersSeleniumBase;
import com.totalamber.qa.objectproperty.ElementHolder;
import org.openqa.selenium.WebDriver;


public class SalesManagerPage implements ElementHolder{

	WebQuartersSeleniumBase seleniumBase;

	public SalesManagerPage(WebDriver driver) {
		// TODO Auto-generated constructor stub

		seleniumBase = new WebQuartersSeleniumBase(driver);
	}

	public void selectAuthentication() {
		// TODO Auto-generated method stub
		seleniumBase.selectByVisibleText(BO_AUTHENTICATION_DROPDOWN_CSS, BO_AUTHENTICATION_DROPDOWN_XPATH, "Windows Authentication");
	}

	public void enterUsernamePassword(String userName, String password) {
		// TODO Auto-generated method stub
		seleniumBase.passValuesThroughUrl(userName, password);
	}

	public void selectClientLink(String companyName) {
		// TODO Auto-generated method stub
		seleniumBase.clickOnLink(companyName);

	}

	public void assignToAM(String am) {
		// TODO Auto-generated method stub
		seleniumBase.selectByVisibleText(SM_ASSIGN_AM_DROPDOWN_CSS, SM_ASSIGN_AM_DROPDOWN_XPATH, am);
	}

	public void AssignAM() {
		// TODO Auto-generated method stub
		seleniumBase.click(SM_ASSIGN_AM_BUTTON_XPATH, SM_ASSIGN_AM_BUTTON_CSS);
	}

	public String verifyAssignPage(String company) {
		// TODO Auto-generated method stub
		return seleniumBase.getText(SM_ASSIGN_AM_COMPANY_NAME_CSS, SM_ASSIGN_AM_COMPANY_NAME_XPATH);
	}

}
