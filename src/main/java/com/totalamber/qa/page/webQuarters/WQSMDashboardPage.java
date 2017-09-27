package com.totalamber.qa.page.webQuarters;

import com.totalamber.qa.automation.SeleniumBase;
import com.totalamber.qa.automation.TestBase;
import com.totalamber.qa.data.UI.elements.webQuarters.wqClientRegCompletePage;
import org.openqa.selenium.WebDriver;


/**
 * Created by e.koshila on 09/26/2017.
 */
public class WQSMDashboardPage extends TestBase implements wqClientRegCompletePage {

    SeleniumBase seleniumBase;

    public WQSMDashboardPage(WebDriver driver) {
        seleniumBase = new SeleniumBase(driver);
    }

    //Check data equals
    public String verify_Data_Equals(String data) {
        return seleniumBase.verifyDataEquals(data);
    }

    //Check element is available
    public boolean verify_Element_Is_Available(String elementXpath) {
        return seleniumBase.checkElementIsDisplayed(elementXpath);
    }

    public String check_Browser_Title() {
        return seleniumBase.getTitle();
    }

    public boolean check_Company_Is_Available(String companyName) {
       return seleniumBase.checkIsElementDisplayedByText(companyName);
    }
}
