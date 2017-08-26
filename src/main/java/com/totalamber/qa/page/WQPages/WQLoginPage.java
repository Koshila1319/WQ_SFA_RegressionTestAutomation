package com.totalamber.qa.page.WQPages;

import com.totalamber.qa.automation.WebQuartersSeleniumBase;
import com.totalamber.qa.objectproperty.ElementHolder;
import org.openqa.selenium.WebDriver;

/**
 * Created by e.koshila on 8/22/2017.
 */
public class WQLoginPage implements ElementHolder {

    WebQuartersSeleniumBase seleniumBase;

    public WQLoginPage(WebDriver driver) {

        seleniumBase = new WebQuartersSeleniumBase(driver);
    }

    public void enterUsername(String userNameSU) {

        seleniumBase.type(CLIENT_LOGIN_USERNAME_CSS, CLIENT_LOGIN_USERNAME_XPATH, userNameSU);
    }

    public void enterPassword(String passwordSU) {

        seleniumBase.type(CLIENT_LOGIN_PASSWORD_CSS, CLIENT_LOGIN_PASSWORD_XPATH, passwordSU);
    }

    public void clickLogmeButton() {

        seleniumBase.click(CLIENT_LOGME_BUTTON_XPATH, CLIENT_LOGME_BUTTON_CSS);
    }
}
