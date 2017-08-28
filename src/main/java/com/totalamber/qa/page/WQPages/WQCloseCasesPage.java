package com.totalamber.qa.page.WQPages;

import com.totalamber.qa.automation.WebQuartersSeleniumBase;
import com.totalamber.qa.objectproperty.ElementHolder;
import org.openqa.selenium.WebDriver;

/**
 * Created by s.wathsala on 8/25/2017.
 */
public class WQCloseCasesPage implements ElementHolder {

    WebQuartersSeleniumBase seleniumBase;

    public WQCloseCasesPage(WebDriver driver) {

        seleniumBase = new WebQuartersSeleniumBase(driver);
    }
}
