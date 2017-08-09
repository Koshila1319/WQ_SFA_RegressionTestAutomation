package com.totalamber.qa.domain;

import com.totalamber.qa.page.SalesManagerPage;
import org.openqa.selenium.WebDriver;


public class SalesManagerDom {

	SalesManagerPage salesManagerPage;
	
	public SalesManagerDom(WebDriver driver) {
		// TODO Auto-generated constructor stub
		salesManagerPage = new SalesManagerPage(driver);
	}
	
	public void selectAuthentication() {
		// TODO Auto-generated method stub
		salesManagerPage.selectAuthentication();
	}
	
	public void enterUsernamePassword(String userName, String password) {
		// TODO Auto-generated method stub
		salesManagerPage.enterUsernamePassword(userName,password );
	}

	public void selectClientLink(String companyName) {
		// TODO Auto-generated method stub
		salesManagerPage.selectClientLink(companyName);
	}

	public void assignToAM(String am) {
		// TODO Auto-generated method stub
		salesManagerPage.assignToAM(am);
	}
	

	public void AssignAM() {
		// TODO Auto-generated method stub
		salesManagerPage.AssignAM();
	}

	public String verifyAssignPage(String company) {
		// TODO Auto-generated method stub
		return salesManagerPage.verifyAssignPage(company);
	}

}
