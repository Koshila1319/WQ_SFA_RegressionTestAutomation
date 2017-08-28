package com.totalamber.qa.domain.WQDom;

import com.totalamber.qa.page.WQPages.WQHomePage;
import com.totalamber.qa.page.WQPages.WQLoginPage;
import org.openqa.selenium.WebDriver;

/**
 * Created by e.koshila on 8/22/2017.
 */
public class WQLoginDom {

    WQLoginPage wqLoginPage;

    public WQLoginDom(WebDriver driver) {

        wqLoginPage = new WQLoginPage(driver);
    }

    public void supportUserLogin(String supportUserEmail, String passwordSU) {
        wqLoginPage.enterUsername(supportUserEmail);
        wqLoginPage.enterPassword(passwordSU);
        wqLoginPage.clickLogmeButton();
    }
}
