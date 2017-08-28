package com.totalamber.qa.page.WQPages;

import com.totalamber.qa.automation.WebQuartersSeleniumBase;
import com.totalamber.qa.objectproperty.ElementHolder;
import org.openqa.selenium.WebDriver;

/**
 * Created by e.koshila on 8/22/2017.
 */
public class WQMainPage implements ElementHolder {

    WebQuartersSeleniumBase seleniumBase;

    public WQMainPage(WebDriver driver) {

        seleniumBase = new WebQuartersSeleniumBase(driver);
    }

    public void navigateToDMDashboardPage() {

        seleniumBase.click(HOME_TILE_XPATH,HOME_TILE_CSS);
    }


}
