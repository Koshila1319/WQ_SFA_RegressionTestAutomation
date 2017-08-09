package com.totalamber.qa.domain;

import com.totalamber.qa.page.AccountManagerPage;
import org.openqa.selenium.WebDriver;


public class AccountManagerDom {
	
	AccountManagerPage accountManagerPage;

	public AccountManagerDom(WebDriver driver) {
		// TODO Auto-generated constructor stub
		accountManagerPage = new AccountManagerPage(driver);
	}
	
	public void enterTheCompnayName(String com) {
		// TODO Auto-generated method stub
		accountManagerPage.enterTheCompanyDetails(com);
	}

	public void clickOnGoButton() {
		// TODO Auto-generated method stub
		accountManagerPage.clickOnGoButtonAccountManagerPage();
	}

	public String companyNameVerify() {
		// TODO Auto-generated method stub
		
		return accountManagerPage.verifyMessage();
	}

	public String invalidcompanyNameVerify() {
		// TODO Auto-generated method stub
		return accountManagerPage.verifyInvalidCompanyName();
	}

	public void clickOnVerificationLink() {
		// TODO Auto-generated method stub
		accountManagerPage.clickonVerificationLink();
	}

	public void clickOnVerifyButton() {
		// TODO Auto-generated method stub
		accountManagerPage.clickOnVerifyButton();
	}

	public void clickOnRejectButton() {
		// TODO Auto-generated method stub
		accountManagerPage.clickOnRejectButton();
	}

	public void enterTheComment(String comment) {
		// TODO Auto-generated method stub
		accountManagerPage.enterTheComment(comment);
	}

	public void clickOnRejectButtonInCommentBox() {
		// TODO Auto-generated method stub
		accountManagerPage.clickOnRejectCommentButton();
	}

	public String commentVerification() {
		// TODO Auto-generated method stub
		return accountManagerPage.verifyRejectCommentMandotoryMessage();
	}

	public void clickOnData(String com) {
		// TODO Auto-generated method stub
		accountManagerPage.selectCompanyLink(com);
	}
	
	public void checkOutlookEmail(String outlookURL, String email, String emailPassword) throws InterruptedException {
		// TODO Auto-generated method stub
		accountManagerPage.checkOutlookEmail(outlookURL, email, emailPassword);
	}

	public String getDMSPUserEmailData() {
		// TODO Auto-generated method stub
		return accountManagerPage.getDMSPUserEmailData();
	}

	public String getDMSPUserRoleData() {
		// TODO Auto-generated method stub
		return accountManagerPage.getDMSPUserRoleData();
	}

	public void navigateToRequestAssignEmail(String emailXpath) {
		// TODO Auto-generated method stub
		accountManagerPage.navigateToRequestAssignEmail(emailXpath);
	}

	public String getSPUserRoleData() {
		// TODO Auto-generated method stub
		return accountManagerPage.getSPUserRoleData();
	}

	public String getSPUserEmailData() {
		// TODO Auto-generated method stub
		return accountManagerPage.getSPUserEmailData();
	}

	public void clickAssignUserTile() {
		// TODO Auto-generated method stub
		accountManagerPage.clickAssignUserTile();
	}

	public void selectCompany(String company) {
		// TODO Auto-generated method stub
		accountManagerPage.selectCompany(company);
	}

	public void addUsers(String userEmail, String userRole) throws InterruptedException {
		// TODO Auto-generated method stub
		accountManagerPage.addUsers(userEmail, userRole);
	}

	public String verifyDataEquals(String data) {
		// TODO Auto-generated method stub
		return accountManagerPage.verifyDataEquals(data);
	}

	public void clickBrowserBackButton() {
		// TODO Auto-generated method stub
		accountManagerPage.clickBrowserBackButton();
	}

}
