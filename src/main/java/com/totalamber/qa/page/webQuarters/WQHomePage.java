package com.totalamber.qa.page.webQuarters;

import com.totalamber.qa.automation.SeleniumBase;
import com.totalamber.qa.data.UI.elements.webQuarters.wqHomePage;
import org.openqa.selenium.WebDriver;


/**
 * Created by s.rodrigo on 9/1/2017.
 */
public class WQHomePage  implements wqHomePage {

    SeleniumBase seleniumBase;

    public WQHomePage(WebDriver driver) {
        seleniumBase = new SeleniumBase(driver);
    }

    public WQHomePage action_Navigate_To_LoginPage() {
        seleniumBase.click(HOMEPAGE_LOGIN_BTN_XPATH, HOMEPAGE_LOGIN_BTN_CSS);
       // return new WQLoginPage(DRIVER);
        return this;
    }
}
