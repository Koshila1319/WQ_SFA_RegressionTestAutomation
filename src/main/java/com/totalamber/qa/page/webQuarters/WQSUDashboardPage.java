package com.totalamber.qa.page.webQuarters;

import com.totalamber.qa.automation.SeleniumBase;
import com.totalamber.qa.automation.TestBase;
import com.totalamber.qa.data.UI.elements.webQuarters.wqDMDashboardPage;
import org.openqa.selenium.WebDriver;

/**
 * Created by e.koshila on 9/18/2017.
 */
public class WQSUDashboardPage extends TestBase implements wqDMDashboardPage {

    SeleniumBase seleniumBase;
    public WQSUDashboardPage(WebDriver driver) {seleniumBase = new SeleniumBase(driver);}

    //Move to WQMainPage
    public void step_Click_Home_Button() {
        seleniumBase.click(HOME_TILE_XPATH,HOME_TILE_CSS);
    }

    public boolean verify_Element_Is_Available(String elementXpath) {
        return seleniumBase.checkElementIsDisplayed(elementXpath);
    }

    public boolean verify_Element_Is_Enabled(String elementXpath) {
        return seleniumBase.checkIsElementEnabled(elementXpath);
    }

    public String check_Browser_Title() {
        return seleniumBase.getTitle();
    }

    public WQSUDashboardPage step_Click_Assign_Users_Tile() {
        seleniumBase.click(DM_DASHBOARD_ASSIGN_USERS_TILE_XPATH,DM_DASHBOARD_ASSIGN_USERS_TILE_CSS);
        return this;
    }

}
