package com.totalamber.qa.page.webQuarters;

import com.totalamber.qa.automation.SeleniumBase;
import com.totalamber.qa.data.UI.elements.webQuarters.wqClientProfileUpdatePage;
import org.openqa.selenium.WebDriver;

/**
 * Created by t.piyananda on 27/09/2017.
 */
public class WQClientProfileUpdatePage implements wqClientProfileUpdatePage{
    SeleniumBase seleniumBase;

    public WQClientProfileUpdatePage (WebDriver driver){seleniumBase = new SeleniumBase(driver);}

    public String validate_PageTitle() {
        return seleniumBase.getText(PROFILEUPDATE_PAGE_PAGETITLE_CSS, PROFILEUPDATE_PAGE_PAGETITLE_XPATH);
    }
}
