package com.totalamber.qa;

import com.totalamber.qa.automation.WebQuartersTestBase;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.util.UUID;

public class SupportLoginTest extends WebQuartersTestBase {

	SoftAssert s_assert = new SoftAssert();

	WebQuartersTestBase aaa = new WebQuartersTestBase();

	public static final String clientEmail = UUID.randomUUID().toString() + "@mailcatch.com";
	public static final String supportUserEmail = SupportUserEmail;

	@BeforeMethod
	public void NavigateToPage() throws IOException, InterruptedException {
		initDomainObjects(DRIVER);
		String siteUrl = data.getValueByName("url");
		setSiteURL(siteUrl);
		Thread.sleep(3000);
	}

	@AfterMethod
	public void endingTest() {
		// quitDriver();
		//seleniumBase.clearCache();
		//System.out.println("Cache cleared....!");
	}

	@Test
	public void verifyClientUserSignInNavigation() throws InterruptedException {

		supportLoginDom.navigateToLoginPage();
		String spPageURL = data.getValueByName("spPageURL");
		String currentspPage = supportLoginDom.verifySignUpPageNavigation();
		Assert.assertEquals(currentspPage, spPageURL);



	}

	@Test
	public void verifyClientRegistrationNavigation() throws InterruptedException {

		verifyClientUserSignInNavigation();
		Thread.sleep(1000);
		supportLoginDom.selectClientRadioButton();
		Thread.sleep(1000);
		supportLoginDom.navigateToClientRegistrationPage();
		Thread.sleep(1000);
		String crPageURL = data.getValueByName("crPageURL");
		String currentcrPage = supportLoginDom.verifyClientRegistrationPageNavigation();
		Assert.assertEquals(currentcrPage, crPageURL);


		CaseID = "49006";

		System.out.print("SPLoging page = "+ supportUserEmail);


		System.out.print("SPLoging page by TestBase = "+ SupportUserEmail);
	}

	@Test
	public void verifyClientRegistrationDataExist() throws InterruptedException {
		String ClientRegistrationPageTitle = data.getValueByName("ClientRegistrationPageTitle");


		Assert.assertEquals(supportLoginDom.PageTextVerify(CLIENT_REGISTRATION_PAGE_TITLE_XPATH),
				ClientRegistrationPageTitle);
		Assert.assertNotNull(supportLoginDom.CompanyNameTextBoxExists(),
				"Company Name text box is available in Client Registration Page.");
		Assert.assertNotNull(supportLoginDom.FirstNameTextBoxExists(),
				"First Name text box is available in Client Registration Page.");
		Assert.assertNotNull(supportLoginDom.LastNameTextBoxExists(),
				"Last Name text box is available in Client Registration Page.");
		Assert.assertNotNull(supportLoginDom.EmailTextBoxExists(),
				"Email text box is available in Client Registration Page.");
		Assert.assertNotNull(supportLoginDom.DesignationTextBoxExists(),
				"Title/Designation text box is available in Client Registration Page.");
		Assert.assertNotNull(supportLoginDom.CompanyAddressExists(),
				"Company Address text box is available in Client Registration Page.");
		Assert.assertNotNull(supportLoginDom.TownNCityTextBoxExists(),
				"Town/City text box is available in Client Registration Page.");
		Assert.assertNotNull(supportLoginDom.ContactNoTextBoxExists(),
				"Contact Number text box is available in Client Registration Page.");

		Thread.sleep(3000);

	}

	@Test
	public void verifyClientRegistrationFormFilling() throws InterruptedException {

		String companyName = data.getValueByName("companyName");
		String fName = data.getValueByName("fname");
		String lName = data.getValueByName("lname");
		String email = clientEmail;
		String jobTitle = data.getValueByName("jobTitle");
		String address = data.getValueByName("address");
		String town = data.getValueByName("town");
		String contactNo = data.getValueByName("contactNo");

		verifyClientRegistrationNavigation();

		verifyClientRegistrationDataExist();

		// Filling client details
		clientRegistrationFormFiller.fillingClientRegistrationForm(companyName, fName, lName, email, jobTitle, address,
				town, contactNo);
		Thread.sleep(1000);

		clientRegistrationFormFiller.selectCountry();
		clientRegistrationFormFiller.selectCompanySize();

		// Add Software application details
		clientRegistrationFormFiller.selectSoftwareApp();
		Thread.sleep(5000);
		clientRegistrationFormFiller.selectModule();
		Thread.sleep(1000);
		clientRegistrationFormFiller.selectVersion();
		Thread.sleep(1000);
		supportLoginDom.addSoftwareApplications();
		Thread.sleep(5000);

		// Add Hear about details
		clientRegistrationFormFiller.selectHearAboutUs();
		Thread.sleep(1000);

		System.out.println(clientEmail);
	}

	//Verify that client able to signup successfully
	@Test
	public void verifyClientSignup() throws InterruptedException {

		String signupMsg = data.getValueByName("signupMsg");

		verifyClientRegistrationFormFilling();
		// Sign up as a support user
		supportLoginDom.signupSupportUser();
		Thread.sleep(3000);
		Assert.assertEquals(supportLoginDom.verifyClientSignup(SIGN_UP_MESSAGE_XPATH), signupMsg);
		Thread.sleep(3000);

		// open client email and click on verification link

		String mailcatchURL = data.getValueByName("mailcatchURL");
		supportLoginDom.checkMailcatchEmail(mailcatchURL,clientEmail, CLIENT_EMAIL_VERIFICATION_LINK_XPATH );

	}

	//Verify that client able to delete software application
	@Test
	public void verifyDeleteSoftwareApplication() throws InterruptedException {

		String errorMsg = data.getValueByName("errorMsg");

		// Filling details
		verifyClientRegistrationFormFilling();
		// Remove Software Application
		supportLoginDom.removeSoftwareApplications();
		Thread.sleep(5000);
		supportLoginDom.signupSupportUser();
		Thread.sleep(5000);

		String error = supportLoginDom.verifyRemoveSoftwareApplications(ERROR_MESSAGE_XPATH);

		System.out.println(error);

		Assert.assertEquals(supportLoginDom.verifyRemoveSoftwareApplications(ERROR_MESSAGE_XPATH), errorMsg);

	}

	// View Client verification email
	@Test
	public void verifyClientLogin() throws InterruptedException {

		String mailcatchURL = data.getValueByName("mailcatchURL");

		supportLoginDom.clickOnVerificationEmail(mailcatchURL, clientEmail);

		String tempPasword = supportLoginDom.getTemporaryPassword();
		String splitedtempPW = seleniumBase.splitTexts(tempPasword, ": ");

		String userNameSU = clientEmail;
		String passwordSU = splitedtempPW;

		System.out.println("Temp PW is" + tempPasword);
		System.out.println("Splited PW is" + splitedtempPW);

		Thread.sleep(6000);

		String siteUrl = data.getValueByName("url");
		setSiteURL(siteUrl);
		Thread.sleep(7000);

		supportLoginDom.clientLogin(userNameSU, passwordSU);
		Thread.sleep(2000);
	}

	//Verify that user able to change the password
	@Test
	public void verifyChangePasswordClient() throws InterruptedException {

		String newPasswordSU = data.getValueByName("newPasswordClient");

		verifyClientLogin();
		supportLoginDom.EnterNewPasswordSU(newPasswordSU, newPasswordSU);
		Thread.sleep(3000);
	}

	//Verify that client able to successfully signup
	@Test
	public void verifyConfirmClient() throws InterruptedException {

		verifyChangePasswordClient();
		Thread.sleep(5000);
		supportLoginDom.clickConfirm();
		Thread.sleep(4000);
		supportLoginDom.clickProceed();
		Thread.sleep(5000);

	}

	// ----------------------------------------Client Payment/ License Process--------------------------------------------------

	// Verify client able to add billing details in to profile update page successfully
	@Test
	public void updateClientProfileBillingDetails() throws InterruptedException {

		String clientProfilePageTitle = data.getValueByName("clientProfilePageTitle");
		String noOfSites = data.getValueByName("noOfSites");
		String annualRevenue = data.getValueByName("annualRevenue");
		String address = data.getValueByName("address");
		String town = data.getValueByName("town");

		verifyConfirmClient();

		Assert.assertEquals(supportLoginDom.verifyDataEquals(CLIENT_PROFILE_UPDATE_PAGE_TITLE_XPATH), clientProfilePageTitle);
		Thread.sleep(2000);

		supportLoginDom.expandBillingDetails();
		Thread.sleep(4000);
		clientRegistrationFormFiller.updateClientProfileBillingForm(noOfSites, annualRevenue, address, town);
		Thread.sleep(6000);
		supportLoginDom.confirmBillingDetails();
		Thread.sleep(6000);
	}

	// Verify client unable to proceed without selecting license category
	@Test
	public void addLicensePreferencesWithoutSelectingLicenseCategory() throws InterruptedException {

		updateClientProfileBillingDetails();

		String licensePreferencespageTitle = data.getValueByName("licensePreferencespageTitle");

		Assert.assertEquals(supportLoginDom.verifyDataEquals(LICENSE_PREFERENCES_PAGE_TITLE_XPATH),
				licensePreferencespageTitle);
		Thread.sleep(2000);

		supportLoginPage.clickLicenseCategoryContinueButton();
		Thread.sleep(3000);


		String errorLicenseCategory = data.getValueByName("errorLicenseCategory");

		Assert.assertEquals(supportLoginDom.verifyDataEquals(ERROR_LICENSE_CATEGORY_XPATH), errorLicenseCategory);
		Thread.sleep(3000);

	}

	// Verify client add license category successfully
	@Test
	public void succesfullyAddLicenseCategory() throws InterruptedException {

		String licenceCategory = data.getValueByName("licenceCategory");

		addLicensePreferencesWithoutSelectingLicenseCategory();

		supportLoginDom.addLicensePreferenceCategory(licenceCategory);
		Thread.sleep(3000);
	}

	// Verify client unable to proceed without filling package and payment details
	@Test
	public void clickContinueWithoutFillingData() throws InterruptedException {

		String errorProceed = data.getValueByName("errorProceed");

		succesfullyAddLicenseCategory();

		Assert.assertNotNull(supportLoginDom.packageDropdownExists(), "Package dropdown is available");

		supportLoginPage.clickPaymentMethodContinueButton();
		Thread.sleep(3000);

		Assert.assertEquals(supportLoginDom.verifyDataEquals(ERROR_MAIN_XPATH), errorProceed);
		Thread.sleep(2000);

	}

	// Verify client able to add payment method successfully
	@Test
	public void verifyAddPaymentMethodSucessfully() throws InterruptedException {

		String paymentMethod = data.getValueByName("paymentMethod");

		clickContinueWithoutFillingData();

		supportLoginPage.selectPaymentMethod(paymentMethod);
		Thread.sleep(3000);

		System.out.println("Payment Method - Add payment method sucessfully...!");
		Thread.sleep(3000);
	}

	// Verify client unable to proceed only with adding payment method details
	@Test
	public void verifyContinueAddingOnlyPaymentMethod() throws InterruptedException {

		verifyAddPaymentMethodSucessfully();
		supportLoginPage.clickPaymentMethodContinueButton();
		Thread.sleep(3000);

		String errorPackage = data.getValueByName("errorPackage");
		Assert.assertEquals(supportLoginDom.verifyDataEquals(ERROR_MAIN_XPATH), errorPackage);
		Thread.sleep(2000);
	}

	// Verify client able to select package successfully
	@Test
	public void verifySelectPackageSuccessfully() throws InterruptedException {

		String licensePackage1 = data.getValueByName("licensePackage1");
		String noOfSupportUsers1 = data.getValueByName("noOfSupportUsers1");

		String licensePackage2 = data.getValueByName("licensePackage2");
		String noOfSupportUsers2 = data.getValueByName("noOfSupportUsers2");

		verifyContinueAddingOnlyPaymentMethod();

		// Verify adding data package 1
		supportLoginDom.addPackage(licensePackage1);
		Thread.sleep(2000);
		Assert.assertEquals(supportLoginDom.verifyDataEquals(NO_OF_SUPPORT_USERS_XPATH), noOfSupportUsers1);
		Thread.sleep(3000);

		// Verify adding data package 2
		supportLoginDom.addPackage(licensePackage2);
		Thread.sleep(2000);
		Assert.assertEquals(supportLoginDom.verifyDataEquals(NO_OF_SUPPORT_USERS_XPATH), noOfSupportUsers2);
		Thread.sleep(3000);

	}

	// Verify error message when add without selecting any additional license details
	@Test
	public void addAdditionaLicenceWithoutFillingData() throws InterruptedException {

		String errorAdditionalLicense = data.getValueByName("errorAdditionalLicense");

		verifySelectPackageSuccessfully();

		supportLoginPage.clickAddButton();
		Thread.sleep(2000);
		Assert.assertEquals(supportLoginDom.verifyDataEquals(ERROR_ADDITIONAL_LICENSE_XPATH), errorAdditionalLicense);
		Thread.sleep(3000);
	}

	// Verify error message when add additional license without user count
	@Test
	public void verifyAddAdditionaLicenceOnlyWithUserType() throws InterruptedException {

		String errorAdditionalLicense = data.getValueByName("errorAdditionalLicense");
		String userType1 = data.getValueByName("userType1");

		addAdditionaLicenceWithoutFillingData();

		supportLoginPage.selectUserType(userType1);
		Thread.sleep(3000);
		supportLoginPage.clickAddButton();
		Thread.sleep(2000);
		Assert.assertEquals(supportLoginDom.verifyDataEquals(ERROR_ADDITIONAL_LICENSE_XPATH), errorAdditionalLicense);
		Thread.sleep(3000);
	}

	// Verify that client able to add additional license successfully
	@Test
	public void verifyAddAdditionaLicenceSuccessfully() throws InterruptedException {

		String userType1 = data.getValueByName("userType1");
		String userCount1 = data.getValueByName("userCount1");

		String userType2 = data.getValueByName("userType2");
		String userCount2 = data.getValueByName("userCount2");

		verifyAddAdditionaLicenceOnlyWithUserType();

		// Verify user type 1, user count 1
		supportLoginDom.addAdditionalLicense(userType1, userCount1);
		Assert.assertEquals(supportLoginDom.verifyDataEquals(USER_TYPE_1_XPATH), userType1);
		Thread.sleep(3000);
		Assert.assertEquals(supportLoginDom.verifyDataEquals(USER_COUNT_1_XPATH), userCount1);
		Thread.sleep(3000);

		// Verify user type 2, user count 2
		supportLoginDom.addAdditionalLicense(userType2, userCount2);
		Assert.assertEquals(supportLoginDom.verifyDataEquals(USER_TYPE_2_XPATH), userType2);
		Thread.sleep(3000);
		Assert.assertEquals(supportLoginDom.verifyDataEquals(USER_COUNT_2_XPATH), userCount2);
		Thread.sleep(3000);
	}


	// Verify that client able to delete additional License
	@Test
	public void verifyDeleteAdditionalLicense() throws InterruptedException {

		verifyAddAdditionaLicenceSuccessfully();

		supportLoginDom.deleteAdditionalLicense();

		System.out.println("Additional License - User sucessfully Deleted...!");
		Thread.sleep(3000);

	}

	// Verify that client able to add license details and navigate to WebQuarters beta page
	@Test
	public void verifyWebQuartersBetaPage() throws InterruptedException {

		String paymentMethod = data.getValueByName("paymentMethod");
		String wqBetaPageTitle = data.getValueByName("wqBetaPageTitle");
		String wqBetaPackage = data.getValueByName("licensePackage2");
		String wqBetaUserType = data.getValueByName("userType2");
		String wqBetaUserCount = data.getValueByName("userCount2");
		String wqPaymentMethod = data.getValueByName("wqPaymentMethod");

		verifyDeleteAdditionalLicense();

		//Navigate to WebQuaters Beta Page
		supportLoginPage.selectPaymentMethod(paymentMethod);
		Thread.sleep(4000);
		supportLoginPage.clickPaymentMethodContinueButton();
		Thread.sleep(6000);
		System.out.println("Successfully added license details...!");

		// Verify WebQuartersBetaPage
		Assert.assertEquals(supportLoginDom.verifyDataEquals(WQ_BETA_PAGE_TITLE_XPATH), wqBetaPageTitle);
		Thread.sleep(2000);
		Assert.assertEquals(supportLoginDom.verifyDataEquals(WQ_BETA_PACKAGE_XPATH), wqBetaPackage);
		Thread.sleep(2000);
		Assert.assertEquals(supportLoginDom.verifyDataEquals(WQ_USER_TYPE_XPATH), wqBetaUserType);
		Thread.sleep(2000);
		Assert.assertEquals(supportLoginDom.verifyDataEquals(WQ_BETA_USER_COUNT_XPATH), wqBetaUserCount);
		Thread.sleep(2000);
		Assert.assertEquals(supportLoginDom.verifyDataEquals(WQ_BETA_PAYMENT_METHOD_XPATH), wqPaymentMethod);
		Thread.sleep(2000);

		supportLoginDom.navigateToHomePage();
		Thread.sleep(7000);
	}

	// Verify that client able to Complete adding License Details
	@Test
	public void verifyCompleteLicenseDetails() throws InterruptedException {

		String homePageURL = data.getValueByName("url");
		String currentURL = seleniumBase.getCurrentUrl();


		verifyWebQuartersBetaPage();

		seleniumBase.getCurrentUrl();
		Thread.sleep(6000);

		System.out.println("Current url - " + currentURL);

		Assert.assertEquals(currentURL, homePageURL);
		Thread.sleep(4000);

		System.out.println("Succesfully completed Licence process...!");
		Thread.sleep(2000);

	}


	//---------------------------Request to Assign users--------------------

	//Verify that client able to navigate assign users
	@Test
	public void verifyAssignUsers() throws InterruptedException {

		String manageRequestPageTitle = data.getValueByName("manageRequestPageTitle");

		//-----------for testing purpose---------------------

		//	supportLoginDom.clientLogin("095bffdc-af29-44f5-b4ce-4c4ca84fca6b@mailcatch.com", "asdf1234%");
		//	Thread.sleep(2000);

		//---------------------------------------------------

		verifyCompleteLicenseDetails();

		supportLoginDom.clickHomeTile();
		Thread.sleep(5000);
		supportLoginDom.clickAssignUsersTile();
		Thread.sleep(5000);

		//	Assert.assertEquals(supportLoginDom.verifyDataEquals(MANAGE_REQUEST_PAGE_TITLE), manageRequestPageTitle); //verify the title of the manage request page
		//Thread.sleep(5000);

	}


	//Verify that client able to request for users
	@Test
	public void verifyRequestAssignUsers() throws InterruptedException {

		String requestSuccessMsg = data.getValueByName("requestSuccessMsg");

		String popupTitle = data.getValueByName("popupTitle");

		// Already created client(DM) as the Support User
		String spUserFname1 = data.getValueByName("fname");
		String spUserLname1 = data.getValueByName("lname");
		String spUserDesignation1 = data.getValueByName("jobTitle");

		// New client as the Support User
		String spUserFname2 = data.getValueByName("fNameSU");
		String spUserLname2 = data.getValueByName("lNameSU");
		String spUserDesignation2 = data.getValueByName("spUserDesignation");


		verifyAssignUsers();

		//Request already created client(DM) as the Support User

		supportLoginDom.clickRequestAssignButton1();
		Thread.sleep(3000);

		seleniumBase.swichToPopup(1);
		Thread.sleep(3000);

		Assert.assertEquals(supportLoginDom.verifyDataEquals(POPUP_TITLE_XPATH), popupTitle);

		clientRegistrationFormFiller.userInformationPopup(clientEmail, spUserFname1, spUserLname1, spUserDesignation1); //Fill data for DM as a support user
		Thread.sleep(3000);
		System.out.println("Support user email : "+ clientEmail);

		supportLoginDom.clickRequestButton();
		Thread.sleep(2000);

		Assert.assertEquals(supportLoginDom.verifyDataEquals(REQUEST_SUCCESS_MESSAGE_XPATH), requestSuccessMsg); //verify request success message
		Thread.sleep(3000);

		supportLoginDom.clickCancelButton();


		//New client as the Support User

		supportLoginDom.clickRequestAssignButton2();
		Thread.sleep(3000);

		seleniumBase.swichToPopup(1);
		Thread.sleep(3000);

		clientRegistrationFormFiller.userInformationPopup(supportUserEmail, spUserFname2, spUserLname2, spUserDesignation2); //Fill data
		Thread.sleep(3000);
		System.out.println("Support user email : "+ supportUserEmail);

		supportLoginDom.clickRequestButton();
		Thread.sleep(2000);

		Assert.assertEquals(supportLoginDom.verifyDataEquals(REQUEST_SUCCESS_MESSAGE_XPATH), requestSuccessMsg); //verify request success message
		Thread.sleep(3000);

		supportLoginDom.clickCancelButton();
		Thread.sleep(3000);
	}


	//######################################################################################################################


	//---------------------------------Activate newly assign user------------------------------------

	// Verify that able activate newly assigned user
	@Test
	public void verifyActivateNewlyAssignedUser() throws InterruptedException {

		String tempPasword, splitedtempPW, passwordSU;

		String mailcatchURL = data.getValueByName("mailcatchURL");

		//supportLoginDom.checkMailcatchEmail(mailcatchURL, supportUserEmail);

		//-----------------for testing purposes-------------------


		//supportLoginDom.clickOnVerificationEmail(mailcatchURL, "testsupport546@mailcatch.com");

		//---------------------------------------------------------

		supportLoginDom.clickOnVerificationEmail(mailcatchURL, supportUserEmail);

		tempPasword = supportLoginDom.getNewUserTemporaryPassword();
		Thread.sleep(4000);
		splitedtempPW = seleniumBase.splitTexts(tempPasword, ": ");
		passwordSU = splitedtempPW;

		//	userNameSU = "testsupport546@mailcatch.com"; //----------testing-----------------

		System.out.println("Temp PW is" + tempPasword);
		System.out.println("Splited PW is" + splitedtempPW);
		Thread.sleep(5000);

		seleniumBase.backToMain();

		supportLoginDom.clickSupportUserVerificationLink();
		Thread.sleep(4000);

		System.out.println(supportUserEmail);

		supportLoginDom.supportUserLogin(supportUserEmail, passwordSU);
		Thread.sleep(4000);

	}


	// Verify that support user able to change the password
	@Test
	public void verifyChangePasswordSupportUser() throws InterruptedException {

		String newPasswordSupportUser = data.getValueByName("newPasswordSupportUser");

		verifyActivateNewlyAssignedUser();

		supportLoginDom.EnterNewPasswordSU(newPasswordSupportUser, newPasswordSupportUser);
		Thread.sleep(3000);
	}


	//Verify that able to update support user profile
	@Test
	public void verifyUpdateSupportUserProfile() throws InterruptedException {

		String userUpdateProfilePageTitle = data.getValueByName("userUpdateProfilePageTitle");

		String fNameSU = data.getValueByName("fNameSU");
		String lNameSU = data.getValueByName("lNameSU");

		verifyChangePasswordSupportUser();
		Thread.sleep(5000);

		Assert.assertEquals(supportLoginDom.verifyDataEquals(NEW_SP_USER_PROFILE_UPDATE_PAGE_TITLE_XPATH), userUpdateProfilePageTitle);    //Verify case title cleared
		Thread.sleep(2000);

		supportLoginDom.fillSupportUserDetails(fNameSU, lNameSU);
		Thread.sleep(4000);

	}


	//Verify that able to activate support user successfully
	@Test
	public void verifySuccessfullyActivateSupportUser() throws InterruptedException {

		String currentUrl;
		String spDashboardUrl = data.getValueByName("spDashboardUrl");

		verifyUpdateSupportUserProfile();

		currentUrl = supportLoginDom.verifySupportUserPageNavigation();

		Assert.assertEquals(currentUrl, spDashboardUrl);						//Verify support user navigating to correct page

		supportLoginDom.checkIsElementEnabled(SUPPORT_TILE_XPATH);				//Verify 24x7 Support tile is enabled
		Thread.sleep(2000);

        Assert.assertNotNull(supportLoginDom.dashboardSupportSPuserExists(), "Support Dashboard is available");
        Thread.sleep(5000);

	}

	//################################# Create Cases ##########################################

	// ----------------------------Create cases by support user who is only support user---------------------------------

	//Verify that new Support user able to create request case by assigning new support user
	@Test
	public void verifyCreateSupportCaseIncidentBySupportUser() throws InterruptedException {

		// Case3

		String fNameSU = data.getValueByName("fNameSU");
		String lNameSU = data.getValueByName("lNameSU");
		String contract3 = fNameSU + " " + lNameSU;
		String caseTitle3 = data.getValueByName("caseTitle3");
		String caseDescription3 = data.getValueByName("caseDescription3");
		String caseType3 = data.getValueByName("caseType3");
		String caseUrgency3 = data.getValueByName("caseUrgency3");
		String viewSupportCaseTitle = data.getValueByName("viewSupportCaseTitle");
        String newPasswordSupportUser = data.getValueByName("newPasswordSupportUser");

		//-----------------------------------------------------------------------------------------------
			supportLoginDom.clientLogin(supportUserEmail, newPasswordSupportUser);
           // supportLoginDom.clientLogin("7a99f3a9-eaf5-43e4-991e-2fadc49eac1a@mailcatch.com", "asdf1234@");
            Thread.sleep(4000);


		//------------------------------------------------------------------------------------------------

		//verifySuccessfullyActivateSupportUser();



		supportLoginDom.clickSupportTile();
		Thread.sleep(3000);

		supportLoginDom.selectContract(contract3);
		Thread.sleep(2000);
		supportLoginDom.addCaseData(caseTitle3, caseDescription3);
		Thread.sleep(2000);
		supportLoginDom.selectCaseType(caseType3);
		Thread.sleep(5000);
		supportLoginDom.selectUrgency(caseUrgency3);
		Thread.sleep(8000);

		supportLoginDom.clickCreateButton();
		Thread.sleep(5000);

		Assert.assertEquals(supportLoginDom.verifyDataEquals(VIEW_SUPPORT_CASE_PAGE_TITLE_XPATH), viewSupportCaseTitle); // verify view support case page title
		Thread.sleep(3000);

	}

	//Verify that new Support user able to create request case by assigning new support user
	@Test
	public void verifyCreateSupportCaseRequestBySupportUser() throws InterruptedException {

		// Case4

		String fName = data.getValueByName("fname");
		String lName = data.getValueByName("lname");
		String contract4 = fName + " " + lName;
		String caseTitle4 = data.getValueByName("caseTitle4");
		String caseDescription4 = data.getValueByName("caseDescription4");
		String caseType4 = data.getValueByName("caseType4");
		String caseUrgency4 = data.getValueByName("caseUrgency4");
		String viewSupportCaseTitle = data.getValueByName("viewSupportCaseTitle");
		String createCaselink = data.getValueByName("createCaselink");


		verifyCreateSupportCaseIncidentBySupportUser();

		supportLoginDom.clickCreateCaseLink(createCaselink);
		Thread.sleep(3000);

		supportLoginDom.selectContract(contract4);
		Thread.sleep(3000);
		supportLoginDom.addCaseData(caseTitle4, caseDescription4);
		Thread.sleep(2000);
		supportLoginDom.selectCaseType(caseType4);
		Thread.sleep(6000);
		supportLoginDom.selectUrgency(caseUrgency4);
		Thread.sleep(8000);

		supportLoginDom.clickCreateButton();
		Thread.sleep(6000);

		Assert.assertEquals(supportLoginDom.verifyDataEquals(VIEW_SUPPORT_CASE_PAGE_TITLE_XPATH), viewSupportCaseTitle); // verify view support case page title
		Thread.sleep(3000);

	}



	//----------------------------Create cases by support user who is also the DM---------------------------------

	@Test
	public void verifyNavigateToCreateSupportCasesPage() throws InterruptedException {

		String passwordSU = data.getValueByName("newPasswordClient");
		String siteUrl = data.getValueByName("url");
		String createCasePageTitle = data.getValueByName("createCasePageTitle");


		setSiteURL(siteUrl);
		Thread.sleep(3000);

		supportLoginDom.clientLogin(clientEmail, passwordSU);
		//supportLoginDom.clientLogin("47685d50-fed0-432f-8a25-62be5f205cf2@mailcatch.com", "asdf1234%");
		Thread.sleep(4000);

		supportLoginDom.clickHomeTile();
		Thread.sleep(3000);

		Assert.assertNotNull(supportLoginDom.dashboardSupportExists(), "Support Dashboard is available");
		Thread.sleep(2000);

		Assert.assertNotNull(supportLoginDom.dashboardDMExists(), "DM Dashboard is available");
		Thread.sleep(2000);

		supportLoginDom.checkIsElementEnabled(SUPPORT_TILE_XPATH);
		Thread.sleep(2000);

		supportLoginDom.clickSupportTile();
		Thread.sleep(3000);

		Assert.assertEquals(supportLoginDom.verifyDataEquals(SUPPORT_PAGE_TITLE_XPATH), createCasePageTitle); // verify page title
		Thread.sleep(3000);

	}

	//Verify that user unable to add attachments without selecting them
	@Test
	public void verifyClickingAddButtonWithoutAttachments() throws InterruptedException {

		String attachmentError = data.getValueByName("attachmentError");

		supportLoginDom.clickAddAttachmentButton();

		Assert.assertEquals(supportLoginDom.verifyDataEquals(CREATE_CASE_ADD_ATTACHMENT_ERROR_XPATH), attachmentError); // verify error message
		Thread.sleep(3000);

	}


	// Verify that user able to successfully add attachments
	@Test
	public void verifyAddAttachments() throws InterruptedException {

		String attachedFile, splitedFile;
		String filePath = data.getValueByName("filePath");
		String fileName = data.getValueByName("fileName");


		supportLoginDom.clickChooseFileButton(filePath, UPLOAD_ATTACHMENT_NAME);
		Thread.sleep(3000);
		supportLoginDom.clickAddAttachmentButton();
		Thread.sleep(3000);

		attachedFile = supportLoginDom.getAttachmentName();
		splitedFile = seleniumBase.splitTexts(attachedFile, "_");

		Assert.assertEquals(splitedFile, fileName); // verify file name attached
		Thread.sleep(3000);

	}

	// Verify that user able to clear data
	@Test
	public void verifyUserAbleToClearData() throws InterruptedException {

		String fName = data.getValueByName("fname");
		String lName = data.getValueByName("lname");
		String contract1 = fName + " " + lName;
		String caseTitle1 = data.getValueByName("caseTitle1");
		String caseDescription1 = data.getValueByName("caseDescription1");
		String caseType1 = data.getValueByName("caseType1");
		String caseUrgency1 = data.getValueByName("caseUrgency1");

		supportLoginDom.selectContract(contract1);
		Thread.sleep(3000);
		supportLoginDom.addCaseData(caseTitle1, caseDescription1);
		Thread.sleep(3000);
		supportLoginDom.selectCaseType(caseType1);
		Thread.sleep(3000);
		supportLoginDom.selectUrgency(caseUrgency1);
		Thread.sleep(10000);

		supportLoginDom.clickClearButton();
		Thread.sleep(4000);

		Assert.assertEquals(supportLoginDom.verifyDataEquals(CREATE_CASE_TITLE_XPATH), "input");    //Verify case title cleared
		Thread.sleep(2000);
		Assert.assertEquals(supportLoginDom.verifyDataEquals(CREATE_CASE_DESCRIPTION_XPATH), "");   //Verify case description cleared
		Thread.sleep(2000);

	}

	//Verify that Support user(DM) able to create request case by assigning new support user
	@Test
	public void verifyCreateSupportCaseRequestByDM() throws InterruptedException {

		//Case2

		String fNameSU = data.getValueByName("fNameSU");
		String lNameSU = data.getValueByName("lNameSU");
		String contract1 = fNameSU+" "+lNameSU;
		String caseTitle1 = data.getValueByName("caseTitle1");
		String caseDescription1 = data.getValueByName("caseDescription1");
		String caseType1 = data.getValueByName("caseType1");
		String caseUrgency1 = data.getValueByName("caseUrgency1");
		String viewSupportCaseTitle = data.getValueByName("viewSupportCaseTitle");

		verifyCreateSupportCaseRequestBySupportUser();

		verifyNavigateToCreateSupportCasesPage();

		supportLoginDom.selectContract(contract1);
		Thread.sleep(2000);
		supportLoginDom.addCaseData(caseTitle1, caseDescription1);
		Thread.sleep(2000);
		supportLoginDom.selectCaseType(caseType1);
		Thread.sleep(5000);
		supportLoginDom.selectUrgency(caseUrgency1);
		Thread.sleep(8000);

		supportLoginDom.clickCreateButton();
		Thread.sleep(5000);

		Assert.assertEquals(supportLoginDom.verifyDataEquals(VIEW_SUPPORT_CASE_PAGE_TITLE_XPATH), viewSupportCaseTitle); // verify view support case page title
		Thread.sleep(3000);

	}


	//Verify that Support user(DM) able to create incident case by assigning Support user(DM)
	@Test
	public void verifyCreateSupportCaseIncidentByDM() throws InterruptedException {

		//Case1

		String fName = data.getValueByName("fname");
		String lName = data.getValueByName("lname");
		String contract2 =fName+" "+lName;
		String caseTitle2 = data.getValueByName("caseTitle2");
		String caseDescription2 = data.getValueByName("caseDescription2");
		String caseType2 = data.getValueByName("caseType2");
		String caseUrgency2 = data.getValueByName("caseUrgency2");
		String viewSupportCaseTitle = data.getValueByName("viewSupportCaseTitle");

		verifyCreateSupportCaseRequestByDM();

		supportLoginDom.clickSupportTile();		//Navigate to create case page
		Thread.sleep(3000);

		verifyUserAbleToClearData();	//Clear data

		verifyClickingAddButtonWithoutAttachments();   //Add attachments without adding
		Thread.sleep(3000);

		System.out.println(contract2);
		supportLoginDom.selectContract(contract2);
		Thread.sleep(3000);
		supportLoginDom.addCaseData(caseTitle2, caseDescription2);
		Thread.sleep(3000);

		verifyAddAttachments();
		Thread.sleep(2000);

		supportLoginDom.selectCaseType(caseType2);
		Thread.sleep(3000);
		supportLoginDom.selectUrgency(caseUrgency2);
		Thread.sleep(10000);

		supportLoginDom.clickCreateButton();

		Thread.sleep(6000);

		Assert.assertEquals(supportLoginDom.verifyDataEquals(VIEW_SUPPORT_CASE_PAGE_TITLE_XPATH), viewSupportCaseTitle); // verify view case page title
		Thread.sleep(3000);

		Assert.assertEquals(supportLoginDom.verifyDataEquals(VIEW_CASE_CREATED_BY_XPATH), contract2); // verify created by data
		Thread.sleep(3000);

	}


	// Verify that user able to view ongoingCases
	@Test
	public void verifyUserAbleToViewOngoingCases() throws InterruptedException {

		//String caseID;
		String homePageURL = data.getValueByName("url");
		String currentURL = seleniumBase.getCurrentUrl();
		String ongoingCaselink = data.getValueByName("ongoingCaselink");
		String ongoingSupportCaseTitle = data.getValueByName("ongoingSupportCaseTitle");

		verifyCreateSupportCaseIncidentByDM();

		CaseID = supportLoginDom.getCaseID();

		System.out.println("Case ID in Support Loging page"+CaseID);

		supportLoginDom.clickViewCaseCancelButton();
		Thread.sleep(3000);

		Assert.assertEquals(currentURL, homePageURL);    //Verify user able to navigate to home page when click cancel button
		Thread.sleep(4000);

		supportLoginDom.clickSupportTile();
		Thread.sleep(3000);

		supportLoginDom.verifyOngoingCases(ongoingCaselink);
		Thread.sleep(4000);
		Assert.assertEquals(supportLoginDom.verifyDataEquals(ONGOING_CASE_PAGE_TITLE_XPATH), ongoingSupportCaseTitle);    //Verify case title cleared
		Thread.sleep(2000);

		/////////////////////Need to verify filtering options after finish creating cases scenarios

		Assert.assertEquals(supportLoginDom.verifyDataEquals(ONGOING_CASE_CASE_ID_BUTTON_XPATH), CaseID);    //Verify case id is correct
		Thread.sleep(2000);
		Assert.assertEquals(supportLoginDom.verifyDataEquals(ONGOING_CASE_CASE_STATUS_BUTTON_XPATH), "Open");    //Verify case status is open
		Thread.sleep(2000);

		supportLoginDom.clickViewCaseLink();
		Thread.sleep(3000);

	}


	// Verify that user able to update cases
	@Test
	public void verifyUserAbleToUpdateCases() throws InterruptedException {

		String updateCasePageTitle = data.getValueByName("updateCasePageTitle");
		String viewSupportCaseTitle = data.getValueByName("viewSupportCaseTitle");

		verifyUserAbleToViewOngoingCases();

		//Verify navigating update case page
		supportLoginDom.clickEditButton();
		Thread.sleep(5000);

		Assert.assertEquals(supportLoginDom.verifyDataEquals(UPDATE_CASE_PAGE_TITLE_XPATH), updateCasePageTitle); // verify update case page title
		Thread.sleep(5000);

		//Verify navigating back to view case page
		supportLoginDom.clickBackToViewCaseLink();
		Thread.sleep(6000);

		Assert.assertEquals(supportLoginDom.verifyDataEquals(VIEW_SUPPORT_CASE_PAGE_TITLE_XPATH), viewSupportCaseTitle); // verify user is in the view case page
		Thread.sleep(3000);

		supportLoginDom.clickEditButton();
		Thread.sleep(5000);

		verifySaveWithoutChanges();

		verifySaveUpdatedChanges();

	}

	//Verify that system generates an error message when save without making changes
	@Test
	public void verifySaveWithoutChanges() throws InterruptedException {

		String noPendingChangesMsg = data.getValueByName("noPendingChangesMsg");

		supportLoginDom.clickUpdateCaseSaveButton();
		Thread.sleep(6000);

		Assert.assertEquals(supportLoginDom.verifyDataEquals(NO_PENDING_CHANGES_MSG_XPATH), noPendingChangesMsg); // verify user is in the view case page
		Thread.sleep(4000);

	}

	//Verify that user able to save the updated changes
	@Test
	public void verifySaveUpdatedChanges() throws InterruptedException {

		String logData = data.getValueByName("logData");
		String fName = data.getValueByName("fNameSU");
		String lName = data.getValueByName("lNameSU");
		String newContact = fName+" "+lName;
		String changesSubmittedMsg = data.getValueByName("changesSubmittedMsg");

		supportLoginDom.addNewLog(logData);
		Thread.sleep(2000);
		supportLoginDom.changeContactUser(newContact);
		Thread.sleep(5000);

		supportLoginDom.clickUpdateCaseSaveButton();
		Thread.sleep(6000);

		Assert.assertEquals(supportLoginDom.verifyDataEquals(CHANGES_SUBMITTED_MSG_XPATH), changesSubmittedMsg); // verify user is in the view case page
		Thread.sleep(4000);

	}

	//Verify user able to view latest update
	public void verifyUserAbleToViewLatestUpdate() throws InterruptedException {

		String logData = data.getValueByName("logData");

		verifyUserAbleToUpdateCases();

		supportLoginDom.clickUpdateCaseCancelButton();
		Thread.sleep(5000);

		Assert.assertEquals(supportLoginDom.verifyDataEquals(LATEST_UPDATE_XPATH), logData); // verify user is in the view case page
		Thread.sleep(4000);
	}

	// Verify that user able to view closedCases
	@Test
	public void verifyUserAbleToViewClosedCases() throws InterruptedException {

		String closedCaseLink = data.getValueByName("closedCaseLink");
		String closedSupportCaseTitle = data.getValueByName("closedSupportCaseTitle");

		verifyUserAbleToViewLatestUpdate();

		supportLoginDom.verifyClosedCases(closedCaseLink);
		Thread.sleep(4000);

		Assert.assertEquals(supportLoginDom.verifyDataEquals(CLOSED_CASE_PAGE_TITLE_XPATH), closedSupportCaseTitle);    //Verify case title cleared
		Thread.sleep(2000);

	}

}
