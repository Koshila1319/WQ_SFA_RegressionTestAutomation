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

    public WQHomePage check_Login_Page_URL() {
        String URL= seleniumBase.getCurrentUrl();
        Assert.assertEquals(URL,"http://qa.webquarters.com:33366/_layouts/15/TA.WQ.Web/Login.aspx");
        System.out.println("Login Button Link Leads To Login Page");
        return this;
    }

    public WQHomePage check_SignUp_Link_Available() {
        seleniumBase.checkIsElementEnabled(HOMEPAGE_SIGNUP_BTN_XPATH);
        return this;
    }

    public WQHomePage check_SignUp_Link_Text() {
        String text=seleniumBase.getText(HOMEPAGE_SIGNUP_BTN_CSS,HOMEPAGE_SIGNUP_BTN_XPATH);
        Assert.assertEquals(text,"Sign Up");
        System.out.println("Sign Up Button Link Text Verified");
        return this;

    }

    public WQHomePage check_SignUp_Page_URL() {

        String URL= seleniumBase.getCurrentUrl();
        Assert.assertEquals(URL,"http://qa.webquarters.com:33366/Pages/UserSignUp.aspx");
        System.out.println("Sign Up Button Link Leads To SignUp Page");
        return this;
    }

    public WQHomePage check_Login_Button_Text()  {
        String text = seleniumBase.getTextByAttribute( HOMEPAGE_LOGIN_BTN_CSS,HOMEPAGE_LOGIN_BTN_XPATH,"value" );
        System.out.println("Text is:" + text);
        return this;
    }
}
