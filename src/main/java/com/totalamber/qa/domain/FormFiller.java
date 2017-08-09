package com.totalamber.qa.domain;

import com.totalamber.qa.page.FormFillerPage;
import org.openqa.selenium.WebDriver;


public class FormFiller {
	
	FormFillerPage formFillerPage;

	public FormFiller(WebDriver driver) {
		
		formFillerPage = new FormFillerPage(driver);
		
	}

	public void fillingForm(String title, String fName, String mName, String lName, String ccType){
		
		formFillerPage.enterNameInfor(title, fName, mName, lName, ccType);
		
	}

	public String getNameofLink() {
		// TODO Auto-generated method stub
		return formFillerPage.nameOfLink();
	}

	public void clickOnPasswordManagerLink() {
		// TODO Auto-generated method stub
		formFillerPage.clickOnPasswordManagerLink();
	}

	public void reSetForme() {
		// TODO Auto-generated method stub
		formFillerPage.clickReSetForme();
	}
	
}

