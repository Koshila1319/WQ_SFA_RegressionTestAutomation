package com.totalamber.qa.page.webQuarters;

import com.totalamber.qa.automation.SeleniumBase;
import com.totalamber.qa.data.UI.elements.webQuarters.wqHomePage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


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

    public WQHomePage action_Navigate_To_SignUp_Page(){
    seleniumBase.click(HOMEPAGE_SIGNUP_BTN_XPATH,HOMEPAGE_SIGNUP_BTN_CSS);

        return this;
    }

    public Boolean check_Login_Link_Available()  {
        return seleniumBase.checkIsElementEnabled(HOMEPAGE_LOGIN_BTN_XPATH);
    }


    public String check_Login_Link_Text() {
        return seleniumBase.getText(HOMEPAGE_LOGIN_BTN_CSS,HOMEPAGE_LOGIN_BTN_XPATH);


    }

    public String check_Login_Page_URL() {
        return seleniumBase.getCurrentUrl();
    }

    public Boolean check_SignUp_Link_Available() {
       return seleniumBase.checkIsElementEnabled(HOMEPAGE_SIGNUP_BTN_XPATH);

    }

    public String check_SignUp_Link_Text() {
       return seleniumBase.getText(HOMEPAGE_SIGNUP_BTN_CSS,HOMEPAGE_SIGNUP_BTN_XPATH);
    }

    public String check_SignUp_Page_URL() {
        return seleniumBase.getCurrentUrl();
    }

    public boolean check_Active_Screen_Sharing_Link_Available() {
        return seleniumBase.checkIsElementEnabled(HOMEPAGE_ACTIVATE_SCREEN_SHARING_BTN_XPATH);
    }

    public String check_Active_Screen_Sharing_Link_Text() {
        return seleniumBase.getText(HOMEPAGE_ACTIVATE_SCREEN_SHARING_BTN_CSS,HOMEPAGE_ACTIVATE_SCREEN_SHARING_BTN_XPATH);
    }
}
