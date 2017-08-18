package com.totalamber.qa.page;

import com.totalamber.qa.automation.WebQuartersSeleniumBase;
import com.totalamber.qa.objectproperty.ElementHolder;
import org.openqa.selenium.WebDriver;

import static com.totalamber.qa.objectproperty.ElementHolder.*;

/**
 * Created by e.koshila on 8/16/2017.
 */
public class SysAidHomePage implements ElementHolder {

    WebQuartersSeleniumBase seleniumBase;


    public SysAidHomePage(WebDriver driver) {

        seleniumBase = new WebQuartersSeleniumBase(driver);
    }


    public void searchOpenCaseID(String openCaseid) {
        seleniumBase.type(SYSAID_SEARCHCASEID_CSS, SYSAID_SEARCHCASEID_XPATH, openCaseid);
        seleniumBase.click(SYSAID_CLICKSEARCHCASEID_XPATH, SYSAID_CLICKSEARCHCASEID_CSS);
    }



}
