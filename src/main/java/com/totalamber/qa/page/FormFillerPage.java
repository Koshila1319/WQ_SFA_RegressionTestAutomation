package com.totalamber.qa.page;

import com.totalamber.qa.automation.WebQuartersSeleniumBase;
import com.totalamber.qa.objectproperty.ElementHolder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class FormFillerPage implements ElementHolder {
	
	WebQuartersSeleniumBase seleniumBase;
	
	public FormFillerPage(WebDriver driver){
		seleniumBase = new WebQuartersSeleniumBase(driver);
	}

	public void enterNameInfor(String title, String fName, String mName, String lName, String ccType) {
		seleniumBase.type(ROBOFORM_FORM_TITLE_NAME, title);
		seleniumBase.type(ROBOFORM_FORM_FNAME_NAME, fName);
		seleniumBase.type(ROBOFORM_FORM_MNAME_NAME, mName);
		//seleniumBase.type(ROBOFORM_FORM_LNAME_NAME, lName);
		seleniumBase.click(ROBOFORM_FORM_CCTYPE_XPATH, ROBOFORM_FORM_CCTYPE_CSS);
		seleniumBase.selectByVisibleText(By.name("40cc__type"),ccType);
		seleniumBase.click(By.name("40cc__type"));
		seleniumBase.type(ROBOFORM_FORM_LNAME_NAME, lName);
	}

	public String nameOfLink() {
		// TODO Auto-generated method stub
		return seleniumBase.getTextXPATH(ROBOFORM_LINK_TEXT_XPATH);
	}

	public void clickOnPasswordManagerLink() {
		// TODO Auto-generated method stub
		seleniumBase.click(ROBOFORM_LINK_TEXT_XPATH, ROBOFORM_LINK_TEXT_CSS);
	}

	public void clickReSetForme() {
		// TODO Auto-generated method stub
		seleniumBase.click(ROBOFORM_RESET_BUTTON_XPATH, ROBOFORM_RESET_BUTTON_CSS);
	}

}
