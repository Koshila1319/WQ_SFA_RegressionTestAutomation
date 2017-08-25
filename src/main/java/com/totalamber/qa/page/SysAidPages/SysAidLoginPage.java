package com.totalamber.qa.page.SysAidPages;

import com.totalamber.qa.automation.WebQuartersSeleniumBase;
import com.totalamber.qa.objectproperty.ElementHolder;
import org.openqa.selenium.WebDriver;

import static com.totalamber.qa.objectproperty.ElementHolder.*;

/**
 * Created by e.koshila on 8/16/2017.
 */
public class SysAidLoginPage implements ElementHolder {

    WebQuartersSeleniumBase seleniumBase;


    public SysAidLoginPage(WebDriver driver) {

        seleniumBase = new WebQuartersSeleniumBase(driver);
    }

    public void loginToSysAid(String sysAidUName, String sysAidPW) {

        seleniumBase.type(SYSAID_USERNAME_CSS, SYSAID_USERNAME_XPATH, sysAidUName);
        seleniumBase.type(SYSAID_PASSWORD_CSS, SYSAID_PASSWORD_XPATH, sysAidPW);
        seleniumBase.click(SYSAID_LOGIN_XPATH, SYSAID_LOGIN_CSS);
    }



}
