package com.totalamber.qa;

import com.totalamber.qa.automation.WebQuartersTestBase;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;


public class SalesManagerTest extends WebQuartersTestBase {

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
		 seleniumBase.clearCache();
	}

	@Test
	public void verifySMLoginPageNavigation() throws InterruptedException {

		String userNameSM = data.getValueByName("userNameSM");
		String passwordSM = data.getValueByName("passwordSM");
		salesManagerDom.enterUsernamePassword(userNameSM,passwordSM);
		Thread.sleep(1000);
		salesManagerDom.selectAuthentication();
		Thread.sleep(10000);
	}
	
	@Test
	public void verifyAssignClientToAM() throws InterruptedException {

		String company = ".//*[@id='ctl00_ctl39_g_7B6AE4AA_1CED_4039_AB72_0DE8298BCFF3_ctl00_ErrorPanel']/div";
		String companyName = data.getValueByName("companyName");
		String am = data.getValueByName("am");
		
		verifySMLoginPageNavigation();
		
		salesManagerDom.selectClientLink(companyName);
		Thread.sleep(2000);
		
		Assert.assertEquals(salesManagerDom.verifyAssignPage(company),companyName);
		
		salesManagerDom.assignToAM(am);
		Thread.sleep(1000);
		salesManagerDom.AssignAM();
	}
	

}
