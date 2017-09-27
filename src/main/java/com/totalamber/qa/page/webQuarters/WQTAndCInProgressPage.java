package com.totalamber.qa.page.webQuarters;

import com.totalamber.qa.automation.SeleniumBase;
import org.openqa.selenium.WebDriver;
import com.totalamber.qa.data.UI.elements.webQuarters.wqTAndCInProgressPage;

/**
 * Created by t.piyananda on 26/09/2017.
 */
public class WQTAndCInProgressPage implements wqTAndCInProgressPage{
    SeleniumBase seleniumBase;
    public WQTAndCInProgressPage(WebDriver driver) {seleniumBase= new SeleniumBase(driver);}


    public String validate_PageTitle() {
        return seleniumBase.getText(TANDCINPROGRESS_TITLE_CSS,TANDCINPROGRESS_TITLE_XPATH);
    }
}
