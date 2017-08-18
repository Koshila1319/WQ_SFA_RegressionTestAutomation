package com.totalamber.qa.domain;

import com.totalamber.qa.page.SysAidLoginPage;
import org.openqa.selenium.WebDriver;

/**
 * Created by e.koshila on 8/16/2017.
 */
public class SysAidLoginDom {

    SysAidLoginPage sysAidLoginPage;

    public SysAidLoginDom(WebDriver driver) {

        sysAidLoginPage = new SysAidLoginPage(driver);
    }

    public void login(String sysAidUName, String sysAidPW) {

        sysAidLoginPage.loginToSysAid(sysAidUName,sysAidPW);
    }


}
