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

    //Page Navigations

    public WQHomePage action_Navigate_To_LoginPage() {
        seleniumBase.click(HOMEPAGE_LOGIN_BTN_XPATH, HOMEPAGE_LOGIN_BTN_CSS);
        return this;
    }

    public WQHomePage action_Navigate_To_SignUp_Page(){
        seleniumBase.click(HOMEPAGE_SIGNUP_BTN_XPATH,HOMEPAGE_SIGNUP_BTN_CSS);
        return this;
    }

    public WQHomePage action_Navigate_To_Activation_Screen_Overlay(){
        seleniumBase.click(HOMEPAGE_ACTIVATE_SCREEN_SHARING_BTN_XPATH,HOMEPAGE_ACTIVATE_SCREEN_SHARING_BTN_CSS);
        return this;
    }

    public WQHomePage action_Navigate_To_Live_Assistance_Option() {
        seleniumBase.click(HOMEPAGE_LIVE_ASSISTANCE_OPTION_XPATH,HOMEPAGE_LIVE_ASSISTANCE_OPTION_CSS);
        return this;
    }

    //Login Features
    public Boolean check_Login_Link_Available()  {
        return seleniumBase.checkIsElementEnabled(HOMEPAGE_LOGIN_BTN_XPATH);
    }

    public String check_Login_Link_Text() {
        return  seleniumBase.getTextByAttribute(HOMEPAGE_SIGNUP_BTN_CSS,HOMEPAGE_LOGIN_BTN_XPATH,"value");
    }

    public String check_Login_Page_URL() {
        return seleniumBase.getCurrentUrl();
    }

    //SignUp Features
    public Boolean check_SignUp_Link_Available() {
       return seleniumBase.checkIsElementEnabled(HOMEPAGE_SIGNUP_BTN_XPATH);
    }

    public String check_SignUp_Link_Text() {
        return  seleniumBase.getTextByAttribute(HOMEPAGE_SIGNUP_BTN_CSS,HOMEPAGE_SIGNUP_BTN_XPATH,"value");
    }

    public String check_SignUp_Page_URL() {
        return seleniumBase.getCurrentUrl();
    }

    //Active Screen Sharing Features
    public boolean check_Active_Screen_Sharing_Link_Available() {
        return seleniumBase.checkIsElementEnabled(HOMEPAGE_ACTIVATE_SCREEN_SHARING_BTN_XPATH);
    }

    public String check_Active_Screen_Sharing_Link_Text() {
        return  seleniumBase.getTextByAttribute(HOMEPAGE_ACTIVATE_SCREEN_SHARING_BTN_CSS,HOMEPAGE_ACTIVATE_SCREEN_SHARING_BTN_XPATH,"value");
    }


    public void check_Active_Screen_Sharing_Overlay() throws InterruptedException {
        seleniumBase.swichToPopup(1);
    }

    public String check_Browser_Title() {
        return seleniumBase.getCurrentUrl();
    }

    public boolean verify_Logo_Available() {
        return seleniumBase.checkIsElementEnabled(HOMEPAGE_WQ_LOGO_XPATH);
    }


    public void check_Watch_Video_Options_Available() {
        seleniumBase.checkIsElementEnabled(HOMEPAGE_WQ_MIDDLEMAN_VIDEO_XPATH);
        seleniumBase.checkIsElementEnabled(HOMEPAGE_WQ_SUPERHEROES_VIDEO_XPATH);

    }

    public void check_Middleman_Video_Link() {
        seleniumBase.click(HOMEPAGE_WQ_MIDDLEMAN_VIDEO1_XPATH,HOMEPAGE_WQ_MIDDLEMAN_VIDEO1_CSS);
    }

    public void check_Superheroes_Video_Link() {
        seleniumBase.click(HOMEPAGE_WQ_SUPERHEROES1_VIDEO_XPATH,HOMEPAGE_WQ_SUPERHEROES1_VIDEO_CSS);
    }


}
