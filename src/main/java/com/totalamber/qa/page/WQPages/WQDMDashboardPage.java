package com.totalamber.qa.page.WQPages;

import com.totalamber.qa.automation.WebQuartersSeleniumBase;
import com.totalamber.qa.objectproperty.ElementHolder;
import org.openqa.selenium.WebDriver;

/**
 * Created by e.koshila on 8/22/2017.
 */
public class WQDMDashboardPage implements ElementHolder {

    WebQuartersSeleniumBase seleniumBase;

    public WQDMDashboardPage(WebDriver driver) {

        seleniumBase = new WebQuartersSeleniumBase(driver);
    }

    public void navigateToSupportDashboardPage() {

        seleniumBase.click(DASHBOARD_SUPPORT_XPATH, DASHBOARD_SUPPORT_CSS);
    }


}
