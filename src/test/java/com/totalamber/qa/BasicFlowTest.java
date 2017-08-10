package com.totalamber.qa;

import com.totalamber.qa.automation.WebQuartersTestBase;
import org.testng.annotations.Test;



public class BasicFlowTest extends WebQuartersTestBase {
	
	//public SupportLoginTest supportLoginTest;
	
//	public void NavigateToBOPage() throws IOException, InterruptedException {
//		initDomainObjects(DRIVER);
//		String siteUrl = data.getValueByName("BOurl");
//		setSiteURL(siteUrl);
//		Thread.sleep(3000);
//	}
//	
//	public void NavigateToWQPage() throws IOException, InterruptedException {
//		initDomainObjects(DRIVER);
//		String siteUrl = data.getValueByName("url");
//		setSiteURL(siteUrl);
//		Thread.sleep(3000);
//	}

	SupportLoginTest supportLoginTest = new SupportLoginTest();

	
	@Test
	public void basicFlow() throws InterruptedException {
		
		String aaa = seleniumBase.splitTexts("TemporaryPassword: S25$^BW", ": ");
		System.out.println(aaa);
		
	
	}

	@Test
	public void basicFlow2() throws InterruptedException {

		String aaa = seleniumBase.splitTexts("TemporaryPassword: S25$^BW", ": ");
		System.out.println(aaa);


	}
	
}
