package com.totalamber.qa.page.webQuarters;

import com.totalamber.qa.automation.SeleniumBase;
import com.totalamber.qa.automation.TestBase;
import com.totalamber.qa.data.UI.elements.webQuarters.wqDMDashboardPage;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static com.totalamber.qa.data.UI.elements.webQuarters.wqSUDashboardPage.*;

/**
 * Created by e.koshila on 10/10/2017.
 */
public class WQSUDashboardPage extends TestBase implements wqDMDashboardPage {

    SeleniumBase seleniumBase;
    public WQSUDashboardPage(WebDriver driver) {
        seleniumBase = new SeleniumBase(driver);
    }

    public void step_Click_Home_Button() {
        seleniumBase.click(HOME_TILE_XPATH,HOME_TILE_CSS);
    }

    public boolean verify_Element_Is_Available(String elementXpath) {
        return seleniumBase.checkElementIsDisplayed(elementXpath);
    }

    public boolean verify_Element_Is_Enabled(String elementXpath) {
        return seleniumBase.checkIsElementEnabled(elementXpath);
    }

    public String verify_Data_Equals(String data) {
        return seleniumBase.verifyDataEquals(data);
    }

    public String check_Browser_Title() {
        return seleniumBase.getTitle();
    }

    public String step_Get_Support_Dashboard_Status(String xpath) {
        return seleniumBase.getClassValue(xpath);
    }

    public void action_Click_Create_Case_Button() {
        seleniumBase.click(WQ_SU_CREATE_NEW_CASE_BUTTON_XPATH, WQ_SU_CREATE_NEW_CASE_BUTTON_CSS);
    }

    public void action_Click_24x7Support_Tab() {
        seleniumBase.click(WQ_SUPPORT_TILE_XPATH,WQ_SUPPORT_TILE_CSS);
    }

    public WQSUDashboardPage action_Click_Approve_Billable_Hours_Tile() {
        seleniumBase.click(WQ_SU_APPROVE_BILLABLE_HOURS_TILE_XPATH,WQ_SU_APPROVE_BILLABLE_HOURS_TILE_CSS);
        return this;
    }

    public WQSUDashboardPage action_Click_Open_Cases_Tile() {
        seleniumBase.click(WQ_SU_OPEN_CASES_TILE_XPATH,WQ_SU_OPEN_CASES_TILE_CSS);
        return this;
    }

    public WQSUDashboardPage action_Click_Response_Required_Tile() {
        seleniumBase.click(WQ_SU_RESPONSE_REQUIRED_TILE_XPATH, WQ_SU_RESPONSE_REQUIRED_TILE_CSS);
        return this;
    }

    public WQSUDashboardPage action_Click_Closed_Cases_Tile() {
        seleniumBase.click(WQ_SU_CLOSED_CASES_TILE_XPATH,WQ_SU_CLOSED_CASES_TILE_CSS);
        return this;
    }

    public WQSUDashboardPage action_Click_All_Cases_Tile() {
        seleniumBase.click(WQ_SU_ALL_CASES_TILE_XPATH,WQ_SU_ALL_CASES_TILE_CSS);
        return this;
    }

    public void action_Click_Contact_WQ_Support_Consultant_Button() {
        seleniumBase.click(WQ_SU_CONTACT_WQ_SUPPORT_CONSULTANT_XPATH, WQ_SU_CONTACT_WQ_SUPPORT_CONSULTANT_CSS);
    }

    public WQSUDashboardPage step_Enter_Case_Id(String caseId) {
        seleniumBase.type(WQ_SU_CASE_SEARCH_BOX_CSS,WQ_SU_CASE_SEARCH_BOX_XPATH, caseId);
        return this;
    }

    public void action_Click_search_Button() {
        seleniumBase.click(WQ_SU_CASE_SEARCH_BUTTON_XPATH, WQ_SU_CASE_SEARCH_BUTTON_CSS);
    }

    public List<String> step_Get_Filter_DropDown_Text(String xpath) {
       return seleniumBase.listDropdownOptions(xpath);
    }

    public List<String> check_Search_Case_Id (String xpath, String data) {
      return seleniumBase.matchWithRowValue(xpath, data);
    }

    public List<String> check_Case_Table_Column_Headers (String xpath) {
      return seleniumBase.matchWithTableHeaderValue(xpath);
    }
}
