package com.totalamber.qa;

import com.totalamber.qa.automation.WebQuartersTestBase;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.IOException;


public class AccountManagerTest extends WebQuartersTestBase {

	public static String splitedEmailDM = "", splitedRoleDM = "", splitedEmailSP = "", splitedRoleSP = "" , newSupportUserEmail;
	
	@BeforeMethod
	public void NavigateToPage() throws IOException, InterruptedException {
		initDomainObjects(DRIVER);
		String siteUrl = data.getValueByName("BOurl");
		setSiteURL(siteUrl);
		Thread.sleep(3000);
	}

	@AfterMethod
	public void endingTest() {
		// quitDriver();
		//seleniumBase.clearCache();
	}

	@Test
	public void accountManagerSignInNavigation() throws InterruptedException, AWTException {

		String userNameAM = data.getValueByName("userNameAM");
		String passwordAM = data.getValueByName("passwordAM");
		
		seleniumBase.login(userNameAM, passwordAM);
		seleniumBase.selectSignInOption();
		Thread.sleep(2000);
	}

	@Test
	public void accountManagerViewUserDetails() throws InterruptedException, AWTException {
		
		String com = data.getValueByName("companyName");
		
		accountManagerSignInNavigation();
		
		accountManagerDom.enterTheCompnayName(com);
		accountManagerDom.clickOnGoButton();
		Thread.sleep(7000);
		Assert.assertEquals(accountManagerDom.companyNameVerify(), com + " - Not verified");
		Thread.sleep(2000);
	}

	@Test
	public void accountManagerViewInvalidCompanyDetails() throws InterruptedException, AWTException {

		accountManagerViewUserDetails();
		
		String invalidCompany = "InvalidCompany";
		accountManagerDom.enterTheCompnayName(invalidCompany);
		accountManagerDom.clickOnGoButton();
		Thread.sleep(2000);
		Assert.assertEquals(accountManagerDom.invalidcompanyNameVerify(), "Company details not found");
		Thread.sleep(2000);
	}

	@Test
	public void accountManagerVerifyUserInfo() throws InterruptedException, AWTException {
		String com = data.getValueByName("companyName");
		
		accountManagerViewInvalidCompanyDetails();
		
		accountManagerDom.clickOnData(com);
		accountManagerDom.clickOnVerifyButton();
		Thread.sleep(12000);
		
		// verify client details successfully approved
	
		//================================================================================================================================
		accountManagerDom.enterTheCompnayName(com);
		Thread.sleep(5000);
		accountManagerDom.clickOnGoButton();
		Thread.sleep(6000);
		Assert.assertEquals(accountManagerDom.companyNameVerify(), com);
		Thread.sleep(2000);

	}

	//Verify AM able to reject client verification
	@Test
	public void accountManagerRejectUserInfo() throws InterruptedException, AWTException {
		String com = data.getValueByName("companyName");
		String comment = data.getValueByName("comment");
		accountManagerViewUserDetails();
		accountManagerDom.clickOnData(com);
		accountManagerDom.clickOnRejectButton();
		accountManagerDom.enterTheComment(comment);
		accountManagerDom.clickOnRejectButtonInCommentBox();
		Assert.assertEquals(accountManagerDom.commentVerification(), "Please enter the comment");
	}
	
	
//###################################################################################################	
	
	//-------------------Assign requested Users--------------------

	
	//Verify email client for requested support users
	@Test
	public void checkSupportUserRequestedEmails() throws InterruptedException, AWTException {
	
		String outlookURL = data.getValueByName("outlookURL");
		String emailAM = data.getValueByName("emailAM");
		String emailPasswordAM = data.getValueByName("emailPasswordAM");

		accountManagerDom.checkOutlookEmail(outlookURL, emailAM, emailPasswordAM);
		Thread.sleep(3000);

	}

	//Verify AM able to get new assigned user Data from email
	@Test
	public void getNewUserAssignRequestData() throws InterruptedException, AWTException {
		
		String emailDataDM, roleDataDM, emailDataSP, roleDataSP;
		
		checkSupportUserRequestedEmails();
		
		//Click on new support user(DM) assign request
		accountManagerDom.navigateToRequestAssignEmail(NEW_DM_SPUSER_ASSIGN_REQUEST_EMAIL_XPATH);
		Thread.sleep(3000);
		
		//Get Support User(DM) data
		emailDataDM = accountManagerDom.getDMSPUserEmailData();
		roleDataDM = accountManagerDom.getDMSPUserRoleData();
		
		Thread.sleep(2000);
		
		splitedEmailDM = seleniumBase.splitTexts(emailDataDM, " : ");	
		splitedRoleDM = seleniumBase.splitTexts(roleDataDM,  " : ");	
		
		accountManagerDom.clickBrowserBackButton();
		Thread.sleep(7000);
		
		//Click on new support user assign request
		accountManagerDom.navigateToRequestAssignEmail(NEW_SPUSER_ASSIGN_REQUEST_EMAIL_XPATH);
		Thread.sleep(3000);
		
		//Get Support User(DM) data
		emailDataSP = accountManagerDom.getSPUserEmailData();
		roleDataSP = accountManagerDom.getSPUserRoleData();
		
		splitedEmailSP = seleniumBase.splitTexts(emailDataSP, " : ");	
		splitedRoleSP = seleniumBase.splitTexts(roleDataSP,  " : ");
		
	}
	
	@Test
	public void assignUsers() throws InterruptedException, AWTException, IOException {
		
		String assignUsersPageTitle = data.getValueByName("assignUsersPageTitle");
		String company = data.getValueByName("companyName");
		String assignUsersSuccessMsg = data.getValueByName("assignUsersSuccessMsg");
		newSupportUserEmail = "newsupportUser@mailinator.com";
					
		getNewUserAssignRequestData();
		
		NavigateToPage();
		accountManagerSignInNavigation();
		
		accountManagerDom.clickAssignUserTile();
		Thread.sleep(2000);
		
		accountManagerDom.selectCompany(company); //Select Company
		Thread.sleep(4000);
		Assert.assertEquals(accountManagerDom.verifyDataEquals(AM_ASSIGN_USERS_TITLE_XPATH), assignUsersPageTitle); //verify navigated page title
		Thread.sleep(2000); 
		
		accountManagerDom.addUsers(splitedEmailDM, splitedRoleDM); //Add DM as a support user
		Thread.sleep(4000);	
		Assert.assertEquals(accountManagerDom.verifyDataEquals(AM_SUCCESS_ACTIVATE_MESSAGE_XPATH), assignUsersSuccessMsg + splitedEmailDM);
		Thread.sleep(2000); 
				
		verifyAssigningAlreadyExistingUser(); //Verify adding already existing user
		
		verifyReassigningUsers();   //Verify reassigning users
		
		verifydeactivatingUsers();
		
		//----------------------testing------------
		
		accountManagerDom.addUsers(splitedEmailSP, splitedRoleSP); //Add new user as a support user
		Thread.sleep(3000);
		
	//	accountManagerDom.addUsers("testsupport546@mailcatch.com", splitedRoleSP); //Add new user as a support user
	//	Thread.sleep(5000);
		
		//------------------------------------------
		
		Assert.assertEquals(accountManagerDom.verifyDataEquals(AM_SUCCESS_ACTIVATE_MESSAGE_XPATH), assignUsersSuccessMsg + splitedEmailSP);
		Thread.sleep(5000);	
		
	}
	

	//Verify that unable to assign already existing support user
	@Test
	public void verifyAssigningAlreadyExistingUser() throws InterruptedException, AWTException {
			
		String userExistInSameGroupMsg = data.getValueByName("userExistInSameGroupMsg");
		
		//--------------testing------------------
		accountManagerDom.addUsers(splitedEmailDM, splitedRoleDM);
		
		//accountManagerDom.addUsers("october@polyfaust.com", splitedRoleDM); //Add DM as a support user
		Thread.sleep(3000);
	
		//----------------------------------------
		
		Assert.assertEquals(accountManagerDom.verifyDataEquals(AM_ADD_SAME_USER_ERROR_MSG_XPATH), userExistInSameGroupMsg);
		Thread.sleep(4000);
	
		}

	
	// Verify that AM able to reassign users
	@Test
	public void verifyReassigningUsers() throws InterruptedException, AWTException {

		String userReassignedMsg = data.getValueByName("userReassignedMsg");
		String reassignSupportUser = "reassignedEmail@mailcatch.com";

		accountManagerDom.addUsers(newSupportUserEmail, splitedRoleSP);
		Thread.sleep(5000);

		supportLoginDom.reassignSupportUser("reassignedEmail@mailcatch.com");
		Thread.sleep(5000);

		Assert.assertEquals(accountManagerDom.verifyDataEquals(AM_REASSIGNED_MESSAGE_XPATH),
				userReassignedMsg + newSupportUserEmail + " to " + reassignSupportUser);
		Thread.sleep(4000);

	}
		
		
	// Verify that AM able to deactivate users
	@Test
	public void verifydeactivatingUsers() throws InterruptedException, AWTException {

		String userDeactivateMsg = data.getValueByName("userDeactivateMsg");

		supportLoginDom.clickDeactivateButton();
		Assert.assertEquals(accountManagerDom.verifyDataEquals(AM_DEACTIVATE_MESSAGE_XPATH), userDeactivateMsg);
		Thread.sleep(2000);

	}
}