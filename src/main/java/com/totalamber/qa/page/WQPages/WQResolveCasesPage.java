package com.totalamber.qa.page.WQPages;

import com.totalamber.qa.automation.WebQuartersSeleniumBase;
import com.totalamber.qa.objectproperty.ElementHolder;
import org.openqa.selenium.WebDriver;

/**
 * Created by e.koshila on 8/22/2017.
 */
public class WQResolveCasesPage implements ElementHolder {

    WebQuartersSeleniumBase seleniumBase;

    public WQResolveCasesPage(WebDriver driver) {

        seleniumBase = new WebQuartersSeleniumBase(driver);
    }

    public String verifyDataEquals(String data) {
        return seleniumBase.verifyDataEquals(data);
    }

    public String checkCaseInResolveCasePage(String caseID) {
       return seleniumBase.checkIsValueExist(SYSAID_RESOLVE_CASE_PAGE_TABLE_XPATH,caseID);
    }

    public void clickResolveCaseViewButton(String caseID) {

        seleniumBase.clickResolveCaseViewButton(caseID);
    }

    public void clickResolveCaseAcceptButton(String caseID) {

        seleniumBase.clickResolveCaseAcceptButton(caseID);
    }
}
