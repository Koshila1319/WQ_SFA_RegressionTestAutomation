package com.totalamber.qa.page;

import com.totalamber.qa.automation.WebQuartersSeleniumBase;
import com.totalamber.qa.objectproperty.ElementHolder;
import org.openqa.selenium.WebDriver;



public class AccountManagerPage implements ElementHolder {

	WebQuartersSeleniumBase seleniumBase;

	public AccountManagerPage(WebDriver driver) {
		// TODO Auto-generated constructor stub

		seleniumBase = new WebQuartersSeleniumBase(driver);
	}

	public void enterTheCompanyDetails(String com) {
		// TODO Auto-generated method stub
		seleniumBase.replaceText(AM_COMPANY_NAME_CSS, AM_COMPANY_NAME_XPATH,com);
		
	}

	public void clickOnGoButtonAccountManagerPage() {
		// TODO Auto-generated method stub
		seleniumBase.click(AM_GO_BUTTON_XPATH, AM_GO_BUTTON_CSS);
	}

	public String verifyMessage() {
		// TODO Auto-generated method stub
		return seleniumBase.getText(AM_COMPANY_VERIFICATION_MSG_CSS, AM_COMPANY_VERIFICATION_MSG_XPATH);
	}

	public String verifyInvalidCompanyName() {
		// TODO Auto-generated method stub
		return seleniumBase.getText(AM_INVALID_COMPANY_DATA_CSS, AM_INVALID_COMPANY_DATA_XPATH);
	}

	public void clickonVerificationLink() {
		// TODO Auto-generated method stub
		seleniumBase.click(AM_COMPANY_VERIFICATION_MSG_XPATH, AM_COMPANY_VERIFICATION_MSG_CSS);
	}

	public void clickOnVerifyButton() {
		// TODO Auto-generated method stub
		seleniumBase.click(AM_CLICK_ON_VERIFY_BUTTON_XPATH, AM_CLICK_ON_VERIFY_BUTTON_CSS);
	}

	public void clickOnRejectButton() {
		// TODO Auto-generated method stub
		seleniumBase.click(AM_CLICK_ON_REJECT_BUTTON_XPATH, AM_CLICK_ON_REJECT_BUTTON_CSS);
	}

	public void enterTheComment(String comment) {
		// TODO Auto-generated method stub
		seleniumBase.type(AM_REJECT_COMMENT_CSS, AM_REJECT_COMMENT_XPATH,comment);
	}

	public void clickOnRejectCommentButton() {
		// TODO Auto-generated method stub
		seleniumBase.click(AM_CLICK_REJECT_COMMENT_BUTTON_XPATH, AM_CLICK_REJECT_COMMENT_BUTTON_CSS);
	}

	public String verifyRejectCommentMandotoryMessage() {
		// TODO Auto-generated method stub
		return seleniumBase.getText(AM_COMMENT_MANDOTORY_MSG_CSS, AM_COMMENT_MANDOTORY_MSG_XPATH);
	}

	public void selectCompanyLink(String com) {
		// TODO Auto-generated method stub
		seleniumBase.clickOnLink(com);
	}
	
	public void checkOutlookEmail(String outlookURL, String email, String emailPassword) throws InterruptedException {
		// TODO Auto-generated method stub
		seleniumBase.openTab(outlookURL);
		Thread.sleep(2000);
		seleniumBase.click(OUTLOOK_SIGN_IN_BUTTON_XPATH, OUTLOOK_SIGN_IN_BUTTON_CSS);
		Thread.sleep(2000);
		seleniumBase.type(OUTLOOK_EMAIL_FIELD_CSS, OUTLOOK_EMAIL_FIELD_XPATH, email);
		Thread.sleep(2000);
		seleniumBase.click(OUTLOOK_NEXT_BUTTON_XPATH, OUTLOOK_NEXT_BUTTON_CSS);
		Thread.sleep(2000);
		seleniumBase.type(OUTLOOK_PASSWORD_FIELD_CSS, OUTLOOK_PASSWORD_FIELD_XPATH, emailPassword);
		Thread.sleep(2000);
		seleniumBase.click(OUTLOOK_SIGN_IN_CONFIRM_XPATH, OUTLOOK_SIGN_IN_CONFIRM_CSS);
		Thread.sleep(3000);

		seleniumBase.hardReaload();
		Thread.sleep(4000);
	}

	public String getDMSPUserEmailData() {
		// TODO Auto-generated method stub
		return seleniumBase.getText(NEW_DM_SPUSER_ASSIGN_REQUEST_EMAIL_DATA_CSS, NEW_DM_SPUSER_ASSIGN_REQUEST_EMAIL_DATA_XPATH);
	}

	public String getDMSPUserRoleData() {
		// TODO Auto-generated method stub
		return seleniumBase.getText(NEW_DM_SPUSER_ASSIGN_REQUEST_ROLE_DATA_CSS, NEW_DM_SPUSER_ASSIGN_REQUEST_ROLE_DATA_XPATH);
	}

	public void navigateToRequestAssignEmail(String emailXpath) {
		// TODO Auto-generated method stub
		seleniumBase.confirmationEmail(emailXpath);
	}

	public String getSPUserRoleData() {
		// TODO Auto-generated method stub
		return seleniumBase.getText(NEW_SPUSER_ASSIGN_REQUEST_ROLE_DATA_CSS, NEW_SPUSER_ASSIGN_REQUEST_ROLE_DATA_XPATH);
	}

	public String getSPUserEmailData() {
		// TODO Auto-generated method stub
		return seleniumBase.getText(NEW_SPUSER_ASSIGN_REQUEST_EMAIL_DATA_CSS, NEW_SPUSER_ASSIGN_REQUEST_EMAIL_DATA_XPATH);
	}

	public void clickAssignUserTile() {
		// TODO Auto-generated method stub
		seleniumBase.click(AM_ASSIGN_USERS_TILE_XPATH, AM_ASSIGN_USERS_TILE_CSS);
	}

	public void selectCompany(String company) {
		// TODO Auto-generated method stub
		seleniumBase.selectByVisibleText(AM_SELECT_COMPANY_DROPDOWN_CSS, AM_SELECT_COMPANY_DROPDOWN_XPATH, company);
	}

	public void addUsers(String userEmail, String userRole) throws InterruptedException {
		// TODO Auto-generated method stub
		seleniumBase.replaceText(AM_ADD_USERS_TEXTBOX_CSS, AM_ADD_USERS_TEXTBOX_XPATH, userEmail);
		Thread.sleep(3000);
		seleniumBase.selectByVisibleText(AM_USER_ROLE_DROPDOWN_CSS, AM_USER_ROLE_DROPDOWN_XPATH, userRole);
		Thread.sleep(3000);
		seleniumBase.click(AM_USER_ROLE_ACTIVATE_BUTTON_XPATH, AM_USER_ROLE_ACTIVATE_BUTTON_CSS);
		Thread.sleep(3000);
		
	}

	public String verifyDataEquals(String data) {
		// TODO Auto-generated method stub
		return seleniumBase.verifyDataEquals(data);
	}

	public void clickBrowserBackButton() {
		// TODO Auto-generated method stub
		seleniumBase.clickBrowserBackButton();
	}
	 

}

