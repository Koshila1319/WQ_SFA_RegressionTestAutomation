package com.totalamber.qa.domain.WQDom;

import com.totalamber.qa.page.WQPages.WQCaseViewPage;
import com.totalamber.qa.page.WQPages.WQHomePage;
import org.openqa.selenium.WebDriver;

/**
 * Created by e.koshila on 8/22/2017.
 */
public class WQHomeDom {

    WQHomePage wqHomePage;

    public WQHomeDom(WebDriver driver) {

        wqHomePage = new WQHomePage(driver);
    }

    public void clickLoginButton() {

        wqHomePage.clickLoginButton();
    }

}
