package com.totalamber.qa.domain.WQDom;

import com.totalamber.qa.page.WQPages.WQCaseViewPage;
import com.totalamber.qa.page.WQPages.WQResolveCasesPage;
import org.openqa.selenium.WebDriver;

/**
 * Created by e.koshila on 8/22/2017.
 */
public class WQResolveCasesDom {

    WQResolveCasesPage wqResolveCasesPage;

    public WQResolveCasesDom(WebDriver driver) {

        wqResolveCasesPage = new WQResolveCasesPage(driver);
    }

    public String verifyDataEquals(String data) {

        return wqResolveCasesPage.verifyDataEquals(data);
    }

    public void checkCaseInResolveCasePage(String caseID) {

        wqResolveCasesPage.checkCaseInResolveCasePage(caseID);
    }

    public void clickResolveCaseViewButton(String caseID) {

        wqResolveCasesPage.clickResolveCaseViewButton(caseID);
    }

    public void clickResolveCaseAcceptButton(String caseID) {

        wqResolveCasesPage.clickResolveCaseAcceptButton(caseID);
    }
}
