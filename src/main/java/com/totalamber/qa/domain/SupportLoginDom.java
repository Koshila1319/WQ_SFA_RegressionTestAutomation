package com.totalamber.qa.domain;

import com.totalamber.qa.page.SupportLoginPage;
import org.openqa.selenium.WebDriver;



public class SupportLoginDom {

	SupportLoginPage supportLoginPage;

	public SupportLoginDom(WebDriver driver) {
		// TODO Auto-generated constructor stub
		supportLoginPage = new SupportLoginPage(driver);
	}

	public void navigateToLoginPage() {
		// TODO Auto-generated method stub
		supportLoginPage.navigateToLoginPage();
	}

	public void selectClientRadioButton() {
		// TODO Auto-generated method stub
		supportLoginPage.selectClientRadioButton();
	}

	public void navigateToClientRegistrationPage() {
		// TODO Auto-generated method stub
		supportLoginPage.navigateToClientRegistrationPage();
	}

	public String verifySignUpPageNavigation() {
		// TODO Auto-generated method stub
		return supportLoginPage.verifySignUpPageNavigation();
	}

	public String verifyClientRegistrationPageNavigation() {
		// TODO Auto-generated method stub
		return supportLoginPage.verifyClientRegistrationPageNavigation();
	}

	// Add Software applications to the form
	public void addSoftwareApplications() {
		// TODO Auto-generated method stub
		supportLoginPage.addSoftwareApplications();

	}

	// Remove added Software applications
	public void removeSoftwareApplications() {
		// TODO Auto-generated method stub
		supportLoginPage.removeSoftwareApplications();
	}

	// Verify remove Software applications
	public String verifyRemoveSoftwareApplications(String error) {
		// TODO Auto-generated method stub
		return supportLoginPage.verifyRemoveSoftwareApplications(error);
	}

	// Signup as a Support user Client
	public void signupSupportUser() {
		// TODO Auto-generated method stub
		supportLoginPage.signupSupportUser();
	}

	public String verifyClientSignup(String signupMsg) {
		// TODO Auto-generated method stub
		return supportLoginPage.verifyClientSignup(signupMsg);
	}

	public void clickOnVerificationEmail(String mailcatchURL, String clientEmail) throws InterruptedException {
		// TODO Auto-generated method stub
		supportLoginPage.clickOnVerificationEmail(mailcatchURL, clientEmail);
	}


	//--------------shammi-------verify form-----------------------
	public String PageTextVerify(String pageTitle) {
		// TODO Auto-generated method stub
		return supportLoginPage.pageTextAvailable(pageTitle);
	}


	public Object CompanyNameTextBoxExists() {
		// TODO Auto-generated method stub
		return supportLoginPage.companyNameTextBoxExists();
	}

	public Object FirstNameTextBoxExists() {
		// TODO Auto-generated method stub
		return supportLoginPage.firstNameTextBoxExists();
	}

	public Object LastNameTextBoxExists() {
		// TODO Auto-generated method stub
		return supportLoginPage.lastNameTextBoxExists();
	}

	public Object EmailTextBoxExists() {
		// TODO Auto-generated method stub
		return supportLoginPage.emailTextBoxExists();
	}

	public Object DesignationTextBoxExists() {
		// TODO Auto-generated method stub
		return supportLoginPage.designationTextBoxExists();
	}

	public Object CompanyAddressExists() {
		// TODO Auto-generated method stub
		return supportLoginPage.companyAddressTextBoxExists();
	}

	public Object ContactNoTextBoxExists() {
		// TODO Auto-generated method stub
		return supportLoginPage.contactNoTextBoxExists();
	}

	public Object TownNCityTextBoxExists() {
		// TODO Auto-generated method stub
		return supportLoginPage.townCityTextBoxExists();
	}

	// Login
	public void clientLogin(String userNameSU, String passwordSU) {
		// TODO Auto-generated method stub
		supportLoginPage.clickLoginButton();
		supportLoginPage.enterUsername(userNameSU);
		supportLoginPage.enterPassword(passwordSU);
		supportLoginPage.clickLogmeButton();

	}

	//Change password
	public void EnterNewPasswordSU(String newPasswordSU, String confirmPassword) {
		// TODO Auto-generated method stub
		supportLoginPage.enterNewPassword(newPasswordSU);
		supportLoginPage.confirmPassword(confirmPassword);
		supportLoginPage.clickChangePassword();
	}

	public void clickConfirm() {
		supportLoginPage.clickConfirm();
	}

	public void clickProceed() {
		supportLoginPage.clickProceed();
	}

	public String getTemporaryPassword() {
		// TODO Auto-generated method stub
		return supportLoginPage.getTemporaryPassword();
	}


	// Update client profile billing profile details

	public void expandBillingDetails() {
		// TODO Auto-generated method stub
		supportLoginPage.expandBillingDetails();
	}

	public void confirmBillingDetails() {
		// TODO Auto-generated method stub
		supportLoginPage.confirmBillingDetails();
	}

	public void addLicensePreferenceCategory(String licenceCategory) {
		// TODO Auto-generated method stub
		supportLoginPage.selectLicensePreferenceCategory(licenceCategory);
		supportLoginPage.clickLicenseCategoryContinueButton();
	}

	public void addPackage(String licensePackage) {
		// TODO Auto-generated method stub
		supportLoginPage.addPackage(licensePackage);
	}

	public void addAdditionalLicense(String userType, String userCount) {
		// TODO Auto-generated method stub
		supportLoginPage.selectUserType(userType);
		supportLoginPage.selectUserCount(userCount);
		supportLoginPage.clickAddButton();
	}

	public void deleteAdditionalLicense() {
		// TODO Auto-generated method stub
		supportLoginPage.deleteAdditionalLicense();
	}

	public void addPaymentMethod(String paymentMethod) {
		// TODO Auto-generated method stub
		supportLoginPage.selectPaymentMethod(paymentMethod);
		supportLoginPage.clickPaymentMethodContinueButton();
	}

	public void navigateToHomePage() {
		// TODO Auto-generated method stub
		supportLoginPage.navigateToHomePage();
	}

	public String verifyDataEquals(String data) {
		// TODO Auto-generated method stub
		return supportLoginPage.verifyDataEquals(data);
	}

	public Object packageDropdownExists() {
		// TODO Auto-generated method stub
		return supportLoginPage.packageDropdownExists();
	}


	//Request support users

	public void clickHomeTile() {
		// TODO Auto-generated method stub
		supportLoginPage.clickHomeTile();
	}

	public void clickAssignUsersTile() {
		// TODO Auto-generated method stub
		supportLoginPage.clickAssignUsersTile();
	}

	public void clickRequestAssignButton1() throws InterruptedException {
		// TODO Auto-generated method stub
		supportLoginPage.clickRequestAssignButton1();
	}

	public void clickRequestAssignButton2() {
		// TODO Auto-generated method stub
		supportLoginPage.clickRequestAssignButton2();
	}

	public void clickRequestButton() {
		// TODO Auto-generated method stub
		supportLoginPage.clickRequestButton();
	}

	public void clickCancelButton() {
		// TODO Auto-generated method stub
		supportLoginPage.clickCancelButton();
	}

	//Create cases
	public void clickSupportTile() {
		// TODO Auto-generated method stub
		supportLoginPage.clickSupportTile();
	}

	public void addCaseData(String caseTitle, String caseDescription) {
		// TODO Auto-generated method stub
		supportLoginPage.addCaseTitle(caseTitle);
		supportLoginPage.addCaseDescription(caseDescription);
	}

	public void selectCaseType(String caseType) {
		// TODO Auto-generated method stub
		supportLoginPage.selectCaseType(caseType);
	}

	public void selectUrgency(String caseUrgency) {
		// TODO Auto-generated method stub
		supportLoginPage.selectUrgency(caseUrgency);
	}

	public void clickAddAttachmentButton() {
		// TODO Auto-generated method stub
		supportLoginPage.clickAddAttachmentButton();
	}

	public void selectContract(String contract) {
		// TODO Auto-generated method stub
		supportLoginPage.selectContract(contract);
	}

	public void checkMailcatchEmail(String mailcatchURL, String clientEmail, String linkXpath) throws InterruptedException {
		// TODO Auto-generated method stub
		supportLoginPage.checkMailcatchEmail(mailcatchURL, clientEmail, linkXpath);
	}

	public void clickChooseFileButton(String filePath, String elementName) throws InterruptedException {
		// TODO Auto-generated method stub
		supportLoginPage.clickChooseFileButton(filePath, elementName);
	}

	public String getAttachmentName() {
		// TODO Auto-generated method stub
		return supportLoginPage.getAttachmentName();
	}

	public void clickCreateButton() {
		// TODO Auto-generated method stub
		supportLoginPage.clickCreateButton();
	}

	public void clickClearButton() {
		// TODO Auto-generated method stub
		supportLoginPage.clickClearButton();
	}

	public void clickCreateCaseLink(String linkText) {
		// TODO Auto-generated method stub
		supportLoginPage.clickCreateCaseLink(linkText);
	}

	public void verifyOngoingCases(String ongoingCaselink) {
		// TODO Auto-generated method stub
		supportLoginPage.verifyOngoingCases(ongoingCaselink);
	}

	public void verifyClosedCases(String closedCaselink) {
		// TODO Auto-generated method stub
		supportLoginPage.verifyOngoingCases(closedCaselink);
	}

	public String getCaseID() {
		// TODO Auto-generated method stub
		return supportLoginPage.getCaseID();
	}

	public void clickEditButton() {
		// TODO Auto-generated method stub
		supportLoginPage.clickEditButton();
	}

	public void clickBackToViewCaseLink() {
		// TODO Auto-generated method stub
		supportLoginPage.clickBackToViewCaseLink();
	}

	public void clickUpdateCaseSaveButton() {
		// TODO Auto-generated method stub
		supportLoginPage.clickUpdateCaseSaveButton();
	}

	public void addNewLog(String logData) {
		// TODO Auto-generated method stub
		supportLoginPage.addNewLog(logData);
	}

	public void changeContactUser(String newContact) {
		// TODO Auto-generated method stub
		supportLoginPage.changeContactUser(newContact);
	}

	public void clickUpdateCaseCancelButton() {
		// TODO Auto-generated method stub
		supportLoginPage.clickUpdateCaseCancelButton();
	}

	public void clickViewCaseCancelButton() {
		// TODO Auto-generated method stub
		supportLoginPage.clickViewCaseCancelButton();
	}

	public void clickViewCaseLink() {
		// TODO Auto-generated method stub
		supportLoginPage.clickViewCaseLink();
	}

	public void clickSupportUserVerificationLink() throws InterruptedException {
		// TODO Auto-generated method stub
		supportLoginPage.clickSupportUserVerificationLink();
	}

	public String getNewUserTemporaryPassword() {
		// TODO Auto-generated method stub
		return supportLoginPage.getNewUserTemporaryPassword();
	}

	public void supportUserLogin(String userNameSU, String passwordSU) throws InterruptedException {
		// TODO Auto-generated method stub
		supportLoginPage.enterUsername(userNameSU);
		supportLoginPage.enterPassword(passwordSU);
		supportLoginPage.clickLogmeButton();
		Thread.sleep(2000);
	}

	public void fillSupportUserDetails(String fNameSU, String lNameSU) throws InterruptedException {
		// TODO Auto-generated method stub
		supportLoginPage.enterFname(fNameSU);
		Thread.sleep(2000);
		supportLoginPage.enterLname(lNameSU);
		Thread.sleep(2000);
		supportLoginPage.clickUpdateButton();
		Thread.sleep(2000);
	}

	public String verifySupportUserPageNavigation() {
		// TODO Auto-generated method stub
		return supportLoginPage.verifySupportUserPageNavigation();
	}

	public void checkIsElementEnabled(String elementPath) {
		// TODO Auto-generated method stub
		supportLoginPage.checkIsElementEnabled(elementPath);
	}

	public void clickDeactivateButton() {
		// TODO Auto-generated method stub
		supportLoginPage.clickDeactivateButton();
	}

	public void reassignSupportUser(String reassignEmail) {
		// TODO Auto-generated method stub
		supportLoginPage.reassignSupportUser(reassignEmail);
	}

	public Object dashboardSupportExists() {
		// TODO Auto-generated method stub
		return supportLoginPage.dashboardSupportExists();
	}

	public Object dashboardDMExists() {
		// TODO Auto-generated method stub
		return supportLoginPage.dashboardDMExists();
	}

	public Object dashboardSupportSPuserExists() {
		// TODO Auto-generated method stub
		return supportLoginPage.dashboardSupportSPuserExists();
	}

}
