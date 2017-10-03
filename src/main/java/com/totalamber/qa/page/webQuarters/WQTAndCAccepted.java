package com.totalamber.qa.page.webQuarters;
import com.totalamber.qa.automation.SeleniumBase;
import com.totalamber.qa.data.UI.elements.webQuarters.wqTAndCAccepted;
import org.openqa.selenium.WebDriver;

/**
 * Created by t.piyananda on 27/09/2017.
 */
public class WQTAndCAccepted implements wqTAndCAccepted{
    SeleniumBase seleniumBase;

    public WQTAndCAccepted (WebDriver driver){seleniumBase = new SeleniumBase(driver);}

    public String validate_BrowserTitle() {
        return seleniumBase.getTitle();
    }

    public String validate_PageTitle() {
        return seleniumBase.getText(WQTANCACCEPTED_PAGE_TITLE_CSS, WQTANCACCEPTED_PAGE_TITLE_XPATH);
    }

    public boolean validate_ProceedButton_IsAvailable() {
        return seleniumBase.verifyAvailableObject(WQTANCACCEPTED_PAGE_PROCEEDBUTTON_XPATH);
    }

    public String validate_The_ProceedButton_Text() {
        return seleniumBase.getTextByAttribute(WQTANCACCEPTED_PAGE_PROCEEDBUTTON_CSS,WQTANCACCEPTED_PAGE_PROCEEDBUTTON_XPATH,"value");
    }

    public WQTAndCAccepted step_Clcking_ProceedButton() {
        seleniumBase.click(WQTANCACCEPTED_PAGE_PROCEEDBUTTON_XPATH, WQTANCACCEPTED_PAGE_PROCEEDBUTTON_CSS);
        return this;
    }
}
