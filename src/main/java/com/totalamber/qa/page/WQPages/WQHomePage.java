package com.totalamber.qa.page.WQPages;

import com.totalamber.qa.automation.WebQuartersSeleniumBase;
import com.totalamber.qa.objectproperty.ElementHolder;
import org.openqa.selenium.WebDriver;

/**
 * Created by e.koshila on 8/22/2017.
 */
public class WQHomePage implements ElementHolder {

    WebQuartersSeleniumBase seleniumBase;

    public WQHomePage(WebDriver driver) {

        seleniumBase = new WebQuartersSeleniumBase(driver);
    }

    public void navigateToLoginPage() {

        seleniumBase.click(HOME_TILE_XPATH,HOME_TILE_CSS);
    }

    public void clickLoginButton() {
        // TODO Auto-generated method stub
        seleniumBase.click(CLIENT_LOGIN_BUTTON_XPATH, CLIENT_LOGIN_BUTTON_CSS);
    }

}
