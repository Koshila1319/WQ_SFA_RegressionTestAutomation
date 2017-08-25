package com.totalamber.qa.page;

import com.totalamber.qa.automation.WebQuartersSeleniumBase;
import com.totalamber.qa.objectproperty.ElementHolder;
import org.openqa.selenium.WebDriver;



public class SupportLoginPage implements ElementHolder {

	WebQuartersSeleniumBase seleniumBase;

	public SupportLoginPage(WebDriver driver) {

		seleniumBase = new WebQuartersSeleniumBase(driver);
	}

	public void navigateToLoginPage() {
		// TODO Auto-generated method stub
		seleniumBase.click(USER_SIGNUP_LINK_XPATH, USER_SIGNUP_LINK_CSS);
	}

	public void selectClientRadioButton() {
		// TODO Auto-generated method stub
		seleniumBase.selectRadioButton(CLIENT_RADIO_BUTTON_XPATH);
	}

	public void navigateToClientRegistrationPage() {
		// TODO Auto-generated method stub
		seleniumBase.click(CLIENT_SIGNUP_PAGE_NAVIGATE_BUTTON_XPATH, CLIENT_SIGNUP_PAGE_NAVIGATE_BUTTON_CSS);
	}

	public String verifySignUpPageNavigation() {
		// TODO Auto-generated method stub
		return seleniumBase.getCurrentUrl();
	}

	public String verifyClientRegistrationPageNavigation() {
		// TODO Auto-generated method stub
		return seleniumBase.getCurrentUrl();
	}

	public void addSoftwareApplications() {
		// TODO Auto-generated method stub
		seleniumBase.click(CLIENT_FORM_ADD_BUTTON_XPATH, CLIENT_FORM_ADD_BUTTON_CSS);
	}

	public void removeSoftwareApplications() {
		// TODO Auto-generated method stub
		seleniumBase.click(CLIENT_FORM_DELETE_BUTTON_XPATH, CLIENT_FORM_DELETE_BUTTON_CSS);

	}

	public String verifyRemoveSoftwareApplications(String error) {
		// TODO Auto-generated method stub
		return seleniumBase.getText("", error);
	}

	public void signupSupportUser() {
		// TODO Auto-generated method stub
		seleniumBase.click(CLIENT_FORM_SIGNUP_BUTTON_XPATH, CLIENT_FORM_SIGNUP_BUTTON_CSS);
	}

	public String verifyClientSignup(String signupMsg) {
		// TODO Auto-generated method stub
		return seleniumBase.getText("", signupMsg);
	}

	public void clickOnVerificationEmail(String mailcatchURL, String clientEmail) throws InterruptedException {
		// TODO Auto-generated method stub
		seleniumBase.openTab(mailcatchURL);
		seleniumBase.type(CLICK_ON_EMAIL_XPATH, CLICK_ON_EMAIL_XPATH, clientEmail);

		seleniumBase.click(EMAIL_GO_XPATH, EMAIL_GO_CSS);
		Thread.sleep(7000);

		System.out.println("Client mail in view verification mail = " + clientEmail);

		seleniumBase.hardReaload();
		Thread.sleep(4000);

		seleniumBase.confirmationEmail(ACTIVATE_EMAIL_XPATH);
	}


	// ------------Shammi----------verify form-----------------

	public Object companyNameTextBoxExists() {
		// TODO Auto-generated method stub
		return seleniumBase.getElement(COMPANY_NAME_TEXTBOX_CSS, COMPANY_NAME_TEXTBOX_XPATH);
	}

	public String pageTextAvailable(String pageTitle) {

		String p;
		p = seleniumBase.getText("", pageTitle);
		return p;
	}

	public Object firstNameTextBoxExists() {
		// TODO Auto-generated method stub
		return seleniumBase.getElement(FIRST_NAME_TEXTBOX_CSS, FIRST_NAME_TEXTBOX_XPATH);
	}

	public Object lastNameTextBoxExists() {
		// TODO Auto-generated method stub
		return seleniumBase.getElement(LAST_NAME_TEXTBOX_CSS, LAST_NAME_TEXTBOX_XPATH);
	}

	public Object emailTextBoxExists() {
		// TODO Auto-generated method stub
		return seleniumBase.getElement(EMAIL_TEXTBOX_CSS, EMAIL_TEXTBOX_XPATH);
	}

	public Object designationTextBoxExists() {
		// TODO Auto-generated method stub
		return seleniumBase.getElement(TITLE_TEXTBOX_CSS, TITLE_TEXTBOX_XPATH);
	}

	public Object companyAddressTextBoxExists() {
		// TODO Auto-generated method stub
		return seleniumBase.getElement(COMPANY_ADDRESS_CSS, COMPANY_ADDRESS_XPATH);
	}

	public Object contactNoTextBoxExists() {
		// TODO Auto-generated method stub
		return seleniumBase.getElement(CONTACT_NUMBER_CSS, CONTACT_NUMBER_XPATH);
	}

	public Object townCityTextBoxExists() {
		// TODO Auto-generated method stub
		return seleniumBase.getElement(TOWN_CITY_CSS, TOWN_CITY_XPATH);
	}

	// Login
	public void clickLoginButton() {
		// TODO Auto-generated method stub
		seleniumBase.click(CLIENT_LOGIN_BUTTON_XPATH, CLIENT_LOGIN_BUTTON_CSS);
	}

	public void enterUsername(String userNameSU) {
		// TODO Auto-generated method stub
		seleniumBase.type(CLIENT_LOGIN_USERNAME_CSS, CLIENT_LOGIN_USERNAME_XPATH, userNameSU);
	}

	public void enterPassword(String passwordSU) {
		// TODO Auto-generated method stub
		seleniumBase.type(CLIENT_LOGIN_PASSWORD_CSS, CLIENT_LOGIN_PASSWORD_XPATH, passwordSU);
	}

	public void clickLogmeButton() {
		// TODO Auto-generated method stub
		seleniumBase.click(CLIENT_LOGME_BUTTON_XPATH, CLIENT_LOGME_BUTTON_CSS);
	}

	// Change Password
	public void enterNewPassword(String newPasswordSU) {
		// TODO Auto-generated method stub
		seleniumBase.type(CLIENT_NEW_PASSWORD_CSS, CLIENT_NEW_PASSWORD_XPATH, newPasswordSU);
	}

	public void confirmPassword(String confirmPassword) {
		// TODO Auto-generated method stub
		seleniumBase.type(CLIENT_CONFIRM_PASSWORD_CSS, CLIENT_CONFIRM_PASSWORD_XPATH, confirmPassword);
	}

	public void clickChangePassword() {
		// TODO Auto-generated method stub
		seleniumBase.click(CLIENT_CHANGE_PASSWORD_BUTTON_XPATH, CLIENT_CHANGE_PASSWORD_BUTTON_CSS);
	}

	public void clickConfirm() {
		// TODO Auto-generated method stub
		seleniumBase.click(CLIENT_CONFIRM_BUTTON_XPATH, CLIENT_CONFIRM_BUTTON_CSS);
	}

	public void clickProceed() {
		// TODO Auto-generated method stub
		seleniumBase.click(CLIENT_PROCEED_BUTTON_XPATH, CLIENT_PROCEED_BUTTON_CSS);
	}

	public String getTemporaryPassword() {
		// TODO Auto-generated method stub
		seleniumBase.switchedToiFrame("emailframe");
		return seleniumBase.getText(CLIENT_TEMP_PASSWORD_CSS, CLIENT_TEMP_PASSWORD_XPATH);
	}

	// Update client profile - Fill Billing details

	public void expandBillingDetails() {
		// TODO Auto-generated method stub
		seleniumBase.click(CLIENT_BILLING_DETAILS_XPATH, CLIENT_BILLING_DETAILS_CSS);
	}

	public void confirmBillingDetails() {
		// TODO Auto-generated method stub
		seleniumBase.click(CLIENT_CONFIRM_BILLING_DETAILS_XPATH, CLIENT_CONFIRM_BILLING_DETAILS_CSS);
	}

	// Update client profile - Add License Preferences

	public void selectLicensePreferenceCategory(String licenceCategory) {
		// TODO Auto-generated method stub
		seleniumBase.selectByVisibleText(CLIENT_LICENSE_CATEGORY_DROPDOWN_CSS, CLIENT_LICENSE_CATEGORY_DROPDOWN_XPATH,
				licenceCategory);
	}

	public void clickLicenseCategoryContinueButton() {
		// TODO Auto-generated method stub
		seleniumBase.click(CLIENT_LICENSE_CATEGORY_CONTINUE_BUTTON_XPATH, CLIENT_LICENSE_CATEGORY_CONTINUE_BUTTON_CSS);
	}

	// Update client profile - Add Package and Additional Details

	public void addPackage(String licensePackage) {
		// TODO Auto-generated method stub
		seleniumBase.selectByVisibleText(CLIENT_ADD_PACKAGE_DROPDOWN_CSS, CLIENT_ADD_PACKAGE_DROPDOWN_XPATH,
				licensePackage);
	}

	public void selectUserType(String userType) {
		// TODO Auto-generated method stub
		seleniumBase.selectByVisibleText(CLIENT_ADDITIONAL_USERS_SELECT_USER_TYPE_CSS,
				CLIENT_ADDITIONAL_USERS_SELECT_USER_TYPE_XPATH, userType);
	}

	public void selectUserCount(String userCount) {
		// TODO Auto-generated method stub
		seleniumBase.selectByVisibleText(CLIENT_ADDITIONAL_USERS_SELECT_USER_COUNT_CSS,
				CLIENT_ADDITIONAL_USERS_SELECT_USER_COUNT_XPATH, userCount);
	}

	public void clickAddButton() {
		// TODO Auto-generated method stub
		seleniumBase.click(CLIENT_ADDITIONAL_LICENSE_ADD_BUTTON_XPATH, CLIENT_ADDITIONAL_LICENSE_ADD_BUTTON_CSS);
	}

	public void deleteAdditionalLicense() {
		// TODO Auto-generated method stub
		seleniumBase.click(CLIENT_ADDITIONAL_LICENSE_DELETE_BUTTON_XPATH, CLIENT_ADDITIONAL_LICENSE_DELETE_BUTTON_CSS);
	}

	// Update client profile - Add Package and Additional Details

	public void clickPaymentMethodContinueButton() {
		// TODO Auto-generated method stub
		seleniumBase.click(CLIENT_PAYMENT_METHOD_CONTINUE_BUTTON_XPATH, CLIENT_PAYMENT_METHOD_CONTINUE_BUTTON_CSS);
	}

	public void selectPaymentMethod(String paymentMethod) {
		// TODO Auto-generated method stub
		seleniumBase.selectByVisibleText(CLIENT_PAYMENT_METHOD_DROPDOWN_CSS, CLIENT_PAYMENT_METHOD_DROPDOWN_XPATH,
				paymentMethod);
	}

	public void navigateToHomePage() {
		// TODO Auto-generated method stub
		seleniumBase.click(CLIENT_HOME_PAGE_BUTTON_XPATH, CLIENT_HOME_PAGE_BUTTON_CSS);
	}

	public String verifyDataEquals(String data) {
		// TODO Auto-generated method stub
		return seleniumBase.verifyDataEquals(data);
	}

	public Object packageDropdownExists() {
		// TODO Auto-generated method stub
		return seleniumBase.getElement(CLIENT_ADD_PACKAGE_DROPDOWN_CSS, CLIENT_ADD_PACKAGE_DROPDOWN_XPATH);
	}

	// Request support users

	public void clickHomeTile() {
		// TODO Auto-generated method stub
		seleniumBase.click(HOME_TILE_XPATH, HOME_TILE_CSS);
	}

	public void clickAssignUsersTile() {
		// TODO Auto-generated method stub
		seleniumBase.click(ASSSIGN_USER_TILE_XPATH, ASSSIGN_USER_TILE_CSS);
	}

	public void clickRequestAssignButton1() throws InterruptedException {
		// TODO Auto-generated method stub
		seleniumBase.click(REQUEST_ASSIGN_BUTTON_1_XPATH, REQUEST_ASSIGN_BUTTON_1_CSS);
		Thread.sleep(3000);
	}

	public void clickRequestAssignButton2() {
		// TODO Auto-generated method stub
		seleniumBase.click(REQUEST_ASSIGN_BUTTON_2_XPATH, REQUEST_ASSIGN_BUTTON_2_CSS);
	}

	public void clickRequestButton() {
		// TODO Auto-generated method stub
		seleniumBase.click(REQUEST_BUTTON_XPATH, REQUEST_BUTTON_CSS);
	}

	public void clickCancelButton() {
		// TODO Auto-generated method stub
		seleniumBase.click(REQUEST_CANCLE_BUTTON_XPATH, REQUEST_CANCLE_BUTTON_CSS);
	}

	public void clickSupportTile() {
		// TODO Auto-generated method stub
		seleniumBase.click(SUPPORT_TILE_XPATH, SUPPORT_TILE_CSS);
	}

	public void addCaseTitle(String caseTitle) {
		// TODO Auto-generated method stub
		seleniumBase.type(CREATE_CASE_TITLE_CSS, CREATE_CASE_TITLE_XPATH, caseTitle);
	}

	public void addCaseDescription(String caseDescription) {
		// TODO Auto-generated method stub
		seleniumBase.type(CREATE_CASE_DESCRIPTION_CSS, CREATE_CASE_DESCRIPTION_XPATH, caseDescription);
	}

	public void selectCaseType(String caseType) {
		// TODO Auto-generated method stub
		seleniumBase.selectByVisibleText(CREATE_CASE_TYPE_DROPDOWN_CSS, CREATE_CASE_TYPE_DROPDOWN_XPATH, caseType);
	}

	public void selectUrgency(String caseUrgency) {
		// TODO Auto-generated method stub
		seleniumBase.selectByVisibleText(CREATE_CASE_URGENCY_DROPDOWN_CSS, CREATE_CASE_URGENCY_DROPDOWN_XPATH, caseUrgency);
	}

	public void clickAddAttachmentButton() {
		// TODO Auto-generated method stub
		seleniumBase.click(CREATE_CASE_ADD_ATTACHMENT_BUTTON_XPATH, CREATE_CASE_ADD_ATTACHMENT_BUTTON_CSS);
	}

	public void selectContract(String contract) {
		// TODO Auto-generated method stub
		seleniumBase.selectByVisibleText(CREATE_CASE_CONTRACT_DROPDOWN_CSS, CREATE_CASE_CONTRACT_DROPDOWN_XPATH,
				contract);
	}

	public void checkMailcatchEmail(String mailcatchURL, String email, String linkXpath) throws InterruptedException {
		// TODO Auto-generated method stub

		seleniumBase.openTab(mailcatchURL);
		seleniumBase.type(CLICK_ON_EMAIL_CSS, CLICK_ON_EMAIL_XPATH, email);
		seleniumBase.click(EMAIL_GO_XPATH, EMAIL_GO_CSS);
		Thread.sleep(6000);

		seleniumBase.hardReaload();
		Thread.sleep(4000);
		seleniumBase.hardReaload();
		Thread.sleep(4000);

		seleniumBase.confirmationEmail(VERIFICATION_EMAIL_XPATH);
		Thread.sleep(5000);
		seleniumBase.clickOnTheVerificationLink(linkXpath);
		Thread.sleep(4000);

	}

	public void clickChooseFileButton(String filePath, String elementName) throws InterruptedException {
		// TODO Auto-generated method stub
		//	seleniumBase.click(CREATE_CASE_CHOOSE_FILE_BUTTON_XPATH, CREATE_CASE_CHOOSE_FILE_BUTTON_CSS);
		Thread.sleep(3000);
		seleniumBase.uploadFiles(filePath, elementName);
	}

	public String getAttachmentName() {
		// TODO Auto-generated method stub
		return seleniumBase.getText(ADDED_ATTACHMENT_CSS, ADDED_ATTACHMENT_XPATH);
	}

	public void clickCreateButton() {
		// TODO Auto-generated method stub
		seleniumBase.click(CREATE_CASE_BUTTON_XPATH, CREATE_CASE_BUTTON_CSS);
	}

	public void clickClearButton() {
		// TODO Auto-generated method stub
		seleniumBase.click(CREATE_CASE_CLEAR_BUTTON_XPATH, CREATE_CASE_CLEAR_BUTTON_CSS);

	}

	public void clickCreateCaseLink(String createCaselink) {
		// TODO Auto-generated method stub
		seleniumBase.clickOnLink(createCaselink);
	}

	public void verifyOngoingCases(String ongoingCaselink) {
		// TODO Auto-generated method stub
		seleniumBase.clickOnLink(ongoingCaselink);
	}

	public void verifyClosedCases(String closedCaselink) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		seleniumBase.clickOnLink(closedCaselink);
	}

	public String getCaseID() {
		// TODO Auto-generated method stub
		return seleniumBase.getText(VIEW_CASE_CASE_ID_CSS, VIEW_CASE_CASE_ID_XPATH);
	}

	public void clickEditButton() {
		// TODO Auto-generated method stub
		seleniumBase.click(VIEW_CASE_EDIT_BUTTON_XPATH, VIEW_CASE_EDIT_BUTTON_CSS);
	}

	public void clickBackToViewCaseLink() {
		// TODO Auto-generated method stub
		seleniumBase.click(BACK_TO_CASE_VIEW_LINK_XPATH, BACK_TO_CASE_VIEW_LINK_CSS);
	}

	public void clickUpdateCaseSaveButton() {
		// TODO Auto-generated method stub
		seleniumBase.click(UPDATE_CASE_SAVE_BUTTON_XPATH, UPDATE_CASE_SAVE_BUTTON_CSS);
	}

	public void addNewLog(String logData) {
		// TODO Auto-generated method stub
		seleniumBase.type(ADD_NEW_LOG_CSS, ADD_NEW_LOG_XPATH, logData);
	}

	public void changeContactUser(String newContact) {
		// TODO Auto-generated method stub
		seleniumBase.selectByVisibleText(UPDATE_CASE_CONTACT_DROPDOWN_CSS, UPDATE_CASE_CONTACT_DROPDOWN_XPATH, newContact);
	}

	public void clickUpdateCaseCancelButton() {
		// TODO Auto-generated method stub
		seleniumBase.click(UPDATE_CASE_CANCEL_BUTTON_XPATH, UPDATE_CASE_CANCEL_BUTTON_CSS);;
	}

	public void clickViewCaseCancelButton() {
		// TODO Auto-generated method stub
		seleniumBase.click(VIEW_CASE_CANCEL_BUTTON_XPATH, VIEW_CASE_CANCEL_BUTTON_CSS);
	}

	public void clickViewCaseLink() {
		// TODO Auto-generated method stub
		seleniumBase.click(ONGOING_CASE_VIEW_CASE_LINK_XPATH, ONGOING_CASE_VIEW_CASE_LINK_CSS);
	}

	//Activate Support User

	public void clickSupportUserVerificationLink() throws InterruptedException {
		// TODO Auto-generated method stub
		seleniumBase.clickOnTheVerificationLink(NEW_SP_USER_EMAIL_VERIFICATION_LINK_XPATH);
		Thread.sleep(3000);
		seleniumBase.switchToNewTab();
	}

	public String getNewUserTemporaryPassword() {
		// TODO Auto-generated method stub
		seleniumBase.switchedToiFrame("emailframe");
		return seleniumBase.getText(NEW_SP_USER_TEMP_PASSWORD_CSS, NEW_SP_USER_TEMP_PASSWORD_XPATH);

	}

	public void enterFname(String fNameSU) {
		// TODO Auto-generated method stub
		seleniumBase.type(NEW_SP_USER_FNAME_CSS, NEW_SP_USER_FNAME_XPATH, fNameSU);
	}

	public void enterLname(String lNameSU) {
		// TODO Auto-generated method stub
		seleniumBase.type(NEW_SP_USER_LNAME_CSS, NEW_SP_USER_LNAME_XPATH, lNameSU);
	}

	public void clickUpdateButton() {
		// TODO Auto-generated method stub
		seleniumBase.click(NEW_SP_USER_PROFILE_UPDATE_BUTTON_XPATH, NEW_SP_USER_PROFILE_UPDATE_BUTTON_CSS);
	}

	public String verifySupportUserPageNavigation() {
		// TODO Auto-generated method stub
		return seleniumBase.getCurrentUrl();
	}

	public void checkIsElementEnabled(String elementPath) {
		// TODO Auto-generated method stub
		seleniumBase.checkIsElementEnabled(elementPath);
	}

	public void clickDeactivateButton() {
		// TODO Auto-generated method stub
		seleniumBase.click(AM_DEACTIVATE_BUTTON_XPATH, AM_DEACTIVATE_BUTTON_CSS);
	}

	public void reassignSupportUser(String reassignEmail) {
		// TODO Auto-generated method stub
		seleniumBase.replaceText(AM_REASSIGN_EMAIL_BOX_CSS, AM_REASSIGN_EMAIL_BOX_XPATH, reassignEmail);
		seleniumBase.click(AM_REASSIGN_BUTTON_XPATH, AM_REASSIGN_BUTTON_CSS);
	}

	public Object dashboardSupportExists() {
		// TODO Auto-generated method stub
		return seleniumBase.getElement(DASHBOARD_SUPPORT_CSS, DASHBOARD_SUPPORT_XPATH);
		//	return seleniumBase.getElement(UP_CSS, UP_XPATH);

	}

	public Object dashboardDMExists() {
		// TODO Auto-generated method stub
		return seleniumBase.getElement(DASHBOARD_DM_CSS, DASHBOARD_DM_XPATH);
	}

	public Object dashboardSupportSPuserExists() {
		// TODO Auto-generated method stub
		return seleniumBase.getElement(DASHBOARD_SUPPORT_SP_USER_CSS, DASHBOARD_SUPPORT_SP_USER_XPATH);
	}

}
