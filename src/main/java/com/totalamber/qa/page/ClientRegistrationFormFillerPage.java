package com.totalamber.qa.page;

import com.totalamber.qa.automation.WebQuartersSeleniumBase;
import com.totalamber.qa.objectproperty.ElementHolder;
import org.openqa.selenium.WebDriver;
public class ClientRegistrationFormFillerPage implements ElementHolder {

	WebQuartersSeleniumBase seleniumBase;

	public ClientRegistrationFormFillerPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		seleniumBase = new WebQuartersSeleniumBase(driver);
	}

	public void enterClientInfo(String companyName, String fName, String lName, String email, String jobTitle,
								String address, String town, String contactNo) {
		// TODO Auto-generated method stub
		seleniumBase.type(ROBOFORM_FORM_CLIENT_COMPANY_NAME, companyName);
		seleniumBase.type(ROBOFORM_FORM_CLIENT_FNAME, fName);
		seleniumBase.type(ROBOFORM_FORM_CLIENT_LNAME, lName);
		seleniumBase.type(ROBOFORM_FORM_CLIENT_EMAIL, email);
		seleniumBase.type(ROBOFORM_FORM_CLIENT_JOB_TITLE, jobTitle);
		seleniumBase.type(ROBOFORM_FORM_CLIENT_ADDRESS, address);
		seleniumBase.type(ROBOFORM_FORM_CLIENT_TOWN, town);
		seleniumBase.type(ROBOFORM_FORM_CLIENT_CONTACT_NUMBER, contactNo);
	}

	public void selectCountry() {
		// TODO Auto-generated method stub
		seleniumBase.selectByVisibleText(CLIENT_COUNTRY_DROPDOWN_CSS, CLIENT_COUNTRY_DROPDOWN_XPATH, "Sri Lanka");
	}

	public void selectCompanySize() {
		// TODO Auto-generated method stub
		seleniumBase.selectByVisibleText(CLIENT_COMPANY_SIZE_CSS, CLIENT_COMPANY_SIZE_XPATH, "Between 50 to 150");
	}

	public void selectSoftwareApp() {
		// TODO Auto-generated method stub
		seleniumBase.selectByVisibleText(CLIENT_SOFTWARE_APPLICATION_CSS, CLIENT_SOFTWARE_APPLICATION_XPATH, "IFS");
	}

	public void selectModule() {
		// TODO Auto-generated method stub
		seleniumBase.setdropdownElements(CLIENT_MODULE_DIV, CLIENT_MODULE_XPATH);
		// seleniumBase.selectCheckBox(CLIENT_MODULE_XPATH1);
	}

	public void selectVersion() {
		// TODO Auto-generated method stub
		seleniumBase.setdropdownElements(CLIENT_VERSION_DIV, CLIENT_VERSION_XPATH);
		// seleniumBase.selectCheckBox(CLIENT_VERSION_XPATH1);
	}

	public void selectHearAboutUs() {
		// TODO Auto-generated method stub
		seleniumBase.selectByVisibleText(CLIENT_HEAR_ABOUT_US_CSS, CLIENT_HEAR_ABOUT_US_XPATH, "From a friend");
	}

	// Filling update client profile billing details
	public void updateClientBillingInfo(String noOfSites, String annualRevenue, String address, String town) {
		// TODO Auto-generated method stub

		seleniumBase.type(ROBOFORM_FORM_CLIENT_BILLING_NO_OF_SITES_XPATH, noOfSites);
		seleniumBase.type(ROBOFORM_FORM_CLIENT_BILLING_ANNUAL_REVENUE_XPATH, annualRevenue);
		seleniumBase.type(ROBOFORM_FORM_CLIENT_BILLING_ADDRESS_XPATH, address);
		seleniumBase.type(ROBOFORM_FORM_CLIENT_BILLING_TOWN_XPATH, town);
	}

	// Filling user information in manage request page

	public void userInformationPopup(String spUserEmail, String spUserFname, String spUserLname,
									 String spUserDesignation) {

		//seleniumBase.switchedToiFrame("DlgFrame7ff0e024-e410-420a-86a5-c043baa580d6.ms-dlgFrame");
		seleniumBase.type(ROBOFORM_FORM_USER_INFO_EMAIL_NAME, spUserEmail);
		seleniumBase.type(ROBOFORM_FORM_USER_INFO_FNAME_NAME, spUserFname);
		seleniumBase.type(ROBOFORM_FORM_USER_INFO_LNAME_NAME, spUserLname);
		seleniumBase.type(ROBOFORM_FORM_USER_INFO_DESIGNATION_NAME, spUserDesignation);

	}

}

