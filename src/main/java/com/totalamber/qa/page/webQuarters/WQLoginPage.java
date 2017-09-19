package com.totalamber.qa.page.webQuarters;


import com.totalamber.qa.automation.SeleniumBase;
import com.totalamber.qa.data.UI.elements.webQuarters.wqLoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


/**
 * Created by s.rodrigo on 9/1/2017.
 */
public class WQLoginPage implements wqLoginPage {

    SeleniumBase seleniumBase;

    public WQLoginPage(WebDriver driver) {
        seleniumBase = new SeleniumBase(driver);
    }

    //suranjith
    public WQLoginPage step_User_Enter_Given_Credentials (String Uname, String Password) throws Exception{
        action_Set_User_Credentials(Uname,Password);
        return this;
    }


    private void action_Set_User_Credentials(String Uname, String Password) throws Exception {
        seleniumBase.type(LOGIN_USER_NAME_CSS,LOGIN_USER_NAME_XPATH,Uname);
        seleniumBase.type(LOGIN_PASSWORD_CSS,LOGIN_PASSWORD_XPATH,Password);
    }

    public WQLoginPage check_And_Validate_Elements_Of_Login_UI() {

        return this;
    }

    public WQLoginPage step_User_Click_Login_Button() throws Exception {
        seleniumBase.click(LOGIN_BTN_XPATH,LOGIN_BTN_CSS);
        return this;
    }

    public WQLoginPage check_And_Validate_Error_Message(){
        Assert.assertEquals(seleniumBase.getText(LOGIN_ERROR_MSG_CSS,LOGIN_ERROR_MSG_XPATH),"Your username or password is invalid");
        return this;
    }


    public WQLoginPage Check_And_Validate_Dashboard_PageLoad(){
        return this;
    }

    //shammi

    public String check_Login_Page_Browser_Title() {

        return seleniumBase.getTitle();
    }

    public void check_WQ_Logo_Is_Available() {

        seleniumBase.checkIsElementEnabled(LOGIN_PAGE_WQ_LOGO_XPATH);
    }

    public void check_Login_Page_Live_Assitane_Option_Available() {

        seleniumBase.checkIsElementEnabled(LOGIN_PAGE_ACTIVATE_SCREEN_SHARING_XPATH);
    }

    public void check_Username_Feild_Is_Available() {
        seleniumBase.checkIsElementEnabled(LOGIN_USER_NAME_XPATH);
    }


    public void check_Username_Feild_Text_Types(String name) {

        seleniumBase.type(LOGIN_USER_NAME_CSS,LOGIN_USER_NAME_XPATH,name);
        seleniumBase.validate_Email_Address(name);

    }

    public void check_Username_PlaceHold_Text() {

        Assert.assertEquals(seleniumBase.getTextByAttribute(LOGIN_USER_NAME_CSS,LOGIN_USER_NAME_XPATH,"placeholder"),"Username");

    }

    public void check_Password_Feild_Is_Available() {

        seleniumBase.checkIsElementEnabled(LOGIN_PASSWORD_XPATH);
    }

    public void check_Password_Feild_Is_Secured() {
        Assert.assertEquals(seleniumBase.getTextByAttribute(LOGIN_PASSWORD_CSS,LOGIN_PASSWORD_XPATH,"type"),"password");
    }

    public void check_Password_PlaceHold_Text() {
        Assert.assertEquals(seleniumBase.getTextByAttribute(LOGIN_PASSWORD_CSS,LOGIN_PASSWORD_XPATH,"placeholder"),"Password");
    }

    public void check_Login_Button_Available() {
        seleniumBase.checkIsElementEnabled(LOGIN_BTN_XPATH);

    }

    public String check_Login_Button_Text() {
        return  seleniumBase.getTextByAttribute(LOGIN_BTN_CSS,LOGIN_BTN_XPATH,"value");
    }
}



