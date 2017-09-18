package com.totalamber.qa.page.webQuarters;

import com.totalamber.qa.automation.SeleniumBase;
import com.totalamber.qa.automation.TestBase;
import com.totalamber.qa.data.UI.elements.webQuarters.wqPanel;
import org.openqa.selenium.WebDriver;

/**
 * Created by t.piyananda on 18/09/2017.
 */
public class WQPanel extends TestBase implements wqPanel{
    SeleniumBase seleniumBase;
    public WQPanel(WebDriver driver) {seleniumBase = new SeleniumBase(driver);}

    public boolean validate_Homelink_is_highlighted() {
        return seleniumBase.checkIsElementEnabled(AM_DASHBOARD_HOMELINK_HIGHLIGHTED_XPATH);
    }

    public String validate_signIn_As() {
        String labelText = seleniumBase.getText(AM_DASHBOARD_SIGNEDINAS_CSS, AM_DASHBOARD_SIGNEDINAS_XPATH);
        return seleniumBase.splitTextGetNthWord(labelText,": ",2);
    }

    public boolean check_Signout_link_Is_Available() {
        return seleniumBase.verifyAvailableObject(AM_DASHBOARD_SIGNOUT_LINK_XPATH);
    }

    public String check_FooterArea_Text_Avaialble() {
        return seleniumBase.getText(AM_DASHBOARD_FOOTER_AREA_CSS,AM_DASHBOARD_FOOTER_AREA_XPATH);
    }

    public WQPanel check_User_goes_To_HomePage() {
        seleniumBase.click(AM_DASHBOARD_HOMELINK_XPATH,AM_DASHBOARD_HOMELINK_CSS);
        return this;
    }
}
