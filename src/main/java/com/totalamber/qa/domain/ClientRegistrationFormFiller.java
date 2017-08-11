package com.totalamber.qa.domain;

import com.totalamber.qa.page.ClientRegistrationFormFillerPage;
import org.openqa.selenium.WebDriver;



public class ClientRegistrationFormFiller {

	ClientRegistrationFormFillerPage clientRegistrationFormFillerPage;

	public ClientRegistrationFormFiller(WebDriver driver) {

		clientRegistrationFormFillerPage = new ClientRegistrationFormFillerPage(driver);

	}

	public void fillingClientRegistrationForm(String companyName, String fName, String lName, String email,
											  String jobTitle, String address, String town, String contactNo) {

		clientRegistrationFormFillerPage.enterClientInfo(companyName, fName, lName, email, jobTitle, address, town,
				contactNo);

	}

	public void selectCountry() {

		clientRegistrationFormFillerPage.selectCountry();
	}

	public void selectCompanySize() {

		clientRegistrationFormFillerPage.selectCompanySize();
	}

	public void selectSoftwareApp() {

		clientRegistrationFormFillerPage.selectSoftwareApp();
	}

	public void selectModule() {

		clientRegistrationFormFillerPage.selectModule();
	}

	public void selectVersion() {

		clientRegistrationFormFillerPage.selectVersion();
	}

	public void selectHearAboutUs() {

		clientRegistrationFormFillerPage.selectHearAboutUs();
	}

	// Filling update client profile billing details

	public void updateClientProfileBillingForm(String noOfSites, String annualRevenue, String address, String town) {

		clientRegistrationFormFillerPage.updateClientBillingInfo(noOfSites, annualRevenue, address, town);

	}

	// Filling user information in manage request page

	public void userInformationPopup(String spUserEmail, String spUserFname, String spUserLname, String spUserDesignation) {

		clientRegistrationFormFillerPage.userInformationPopup(spUserEmail, spUserFname, spUserLname, spUserDesignation);

	}

}