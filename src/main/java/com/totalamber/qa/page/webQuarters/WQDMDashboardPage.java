package com.totalamber.qa.page.webQuarters;

import com.totalamber.qa.automation.SeleniumBase;
import com.totalamber.qa.automation.TestBase;
import com.totalamber.qa.data.UI.elements.webQuarters.wqDMDashboardPage;
import org.openqa.selenium.WebDriver;

/**
 * Created by t.piyananda on 15/09/2017.
 */
public class WQDMDashboardPage extends TestBase implements wqDMDashboardPage {

    SeleniumBase seleniumBase;
    public WQDMDashboardPage(WebDriver driver) {seleniumBase = new SeleniumBase(driver);}

    //Move to WQMainPage
    public void step_Click_Home_Button() {
        seleniumBase.click(HOME_TILE_XPATH,HOME_TILE_CSS);
    }

    //Move to WQDMDashboardPage
    public WQDMDashboardPage step_Click_Assign_Users_Tile() {
        seleniumBase.click(DM_DASHBOARD_ASSIGN_USERS_TILE_XPATH,DM_DASHBOARD_ASSIGN_USERS_TILE_CSS);
        return this;
    }

}
