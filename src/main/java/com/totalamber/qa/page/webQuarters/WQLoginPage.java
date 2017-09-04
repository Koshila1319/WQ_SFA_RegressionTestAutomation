package com.totalamber.qa.page.webQuarters;


import com.totalamber.qa.automation.SeleniumBase;
import com.totalamber.qa.automation.TestBase;
import com.totalamber.qa.data.UI.elements.webQuarters.wqLoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


/**
 * Created by s.rodrigo on 9/1/2017.
 */
public class WQLoginPage extends TestBase implements wqLoginPage {

    SeleniumBase seleniumBase;

    public WQLoginPage(WebDriver driver) {
        seleniumBase = new SeleniumBase(driver);
    }

    public WQLoginPage Step_User_Enter_Given_Credentials (String Uname, String Password) throws Exception{
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
        Assert.assertEquals(seleniumBase.getText(LOGIN_ERROR_MSG_CSS,LOGIN_ERROR_MSG_XPATH),"You username or password is invalid");
        return this;
    }


    public WQLoginPage Check_And_Validate_Dashboard_PageLoad(){
        return this;
    }



}
