package com.totalamber.qa.page.webQuarters;

import com.totalamber.qa.automation.SeleniumBase;
import com.totalamber.qa.data.UI.elements.webQuarters.wqClientRegPage;
import org.openqa.selenium.WebDriver;

/**
 * Created by s.wathsala on 9/19/2017.
 */
public class WQClientRegPage implements wqClientRegPage {
    SeleniumBase seleniumBase;

    public WQClientRegPage (WebDriver driver) {

        seleniumBase = new SeleniumBase(driver);
    }
}
