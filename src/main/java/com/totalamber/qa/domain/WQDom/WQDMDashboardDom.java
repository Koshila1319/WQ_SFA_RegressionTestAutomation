package com.totalamber.qa.domain.WQDom;

import com.totalamber.qa.page.WQPages.WQDMDashboardPage;
import com.totalamber.qa.page.WQPages.WQLoginPage;
import org.openqa.selenium.WebDriver;

/**
 * Created by e.koshila on 8/22/2017.
 */
public class WQDMDashboardDom {

    WQDMDashboardPage wqdmDashboardPage;

    public WQDMDashboardDom(WebDriver driver) {

        wqdmDashboardPage = new WQDMDashboardPage(driver);
    }

    public void navigateToSupportDashboardPage() {
        wqdmDashboardPage.navigateToSupportDashboardPage();
    }
}
