package com.totalamber.qa.page.WQPages;

import com.totalamber.qa.automation.WebQuartersSeleniumBase;
import com.totalamber.qa.objectproperty.ElementHolder;
import org.openqa.selenium.WebDriver;

/**
 * Created by e.koshila on 8/22/2017.
 */
public class WQCaseViewPage implements ElementHolder {

    WebQuartersSeleniumBase seleniumBase;

    public WQCaseViewPage(WebDriver driver) {

        seleniumBase = new WebQuartersSeleniumBase(driver);
    }

    public String verifyDataEquals(String data) {
        return seleniumBase.verifyDataEquals(data);
    }

    public void navigateToHomePage() {
        seleniumBase.click(HOME_TILE_XPATH,HOME_TILE_CSS);
    }
}
