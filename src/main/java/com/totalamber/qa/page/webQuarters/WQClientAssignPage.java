package com.totalamber.qa.page.webQuarters;

import com.totalamber.qa.automation.SeleniumBase;
import com.totalamber.qa.data.UI.elements.webQuarters.wqClientAssignPage;
import org.openqa.selenium.WebDriver;

/**
 * Created by s.wathsala on 9/29/2017.
 */
public class WQClientAssignPage implements wqClientAssignPage {
    SeleniumBase seleniumBase;

    public WQClientAssignPage(WebDriver driver) {

        seleniumBase = new SeleniumBase(driver);
    }
}
