package com.totalamber.qa.domain.WQDom;

import com.totalamber.qa.domain.SupportLoginDom;
import com.totalamber.qa.page.WQPages.WQCaseViewPage;
import org.openqa.selenium.WebDriver;

/**
 * Created by e.koshila on 8/22/2017.
 */
public class WQCaseViewDom {

    WQCaseViewPage wqCaseViewPage;

    public WQCaseViewDom(WebDriver driver) {

        wqCaseViewPage = new WQCaseViewPage(driver);
    }

    public String verifyDataEquals(String data) {

        return wqCaseViewPage.verifyDataEquals(data);
    }

    public void navigateToHomePage() {

        wqCaseViewPage.navigateToHomePage();
    }

    public void navigateBackToResolveCasePage() {

        wqCaseViewPage.navigateBackToResolveCasePage();
    }

}
