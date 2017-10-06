package com.totalamber.qa.page.webQuarters;

import com.totalamber.qa.automation.SeleniumBase;
import com.totalamber.qa.data.UI.elements.webQuarters.wqUserProfilePage;
import org.openqa.selenium.WebDriver;

/**
 * Created by s.wathsala on 10/6/2017.
 */
public class WQUserProfilePage implements wqUserProfilePage {
    SeleniumBase seleniumBase;

    public WQUserProfilePage(WebDriver driver)

    {
        seleniumBase = new SeleniumBase(driver);
    }
}
