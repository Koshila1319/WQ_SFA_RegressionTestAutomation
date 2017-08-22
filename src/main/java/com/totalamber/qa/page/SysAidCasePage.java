package com.totalamber.qa.page;

import com.totalamber.qa.automation.WebQuartersSeleniumBase;
import com.totalamber.qa.objectproperty.ElementHolder;
import org.openqa.selenium.WebDriver;

import static com.totalamber.qa.objectproperty.ElementHolder.*;

/**
 * Created by e.koshila on 8/16/2017.
 */
public class SysAidCasePage implements ElementHolder {

    WebQuartersSeleniumBase seleniumBase;

    public SysAidCasePage(WebDriver driver) {
        seleniumBase = new WebQuartersSeleniumBase(driver);
    }

    public void changeToAssigned(String statusAssigned) {

        seleniumBase.selectByVisibleText(SYSAID_CASESTATUS_REQUEST_CSS, SYSAID_CASESTATUS_REQUEST_XPATH, statusAssigned);
    }

    public Object currentProductDropdownExist() {

        return seleniumBase.getElement(SYSAID_CATEGORY_PRODUCT_CSS, SYSAID_CATEGORY_PRODUCT_XPATH);
    }

    public void updateProdcut(String product) throws InterruptedException {

        seleniumBase.switchedToiFrame("contentFrame");
        seleniumBase.switchToDropDown(SYSAID_CATEGORY_PRODUCT_DIV_XPATH);
        Thread.sleep(5000);
        seleniumBase.selectSysAidDropDown(product);


		/*seleniumBase.click(SYSAID_CATEGORY_PRODUCT_XPATH, SYSAID_CATEGORY_PRODUCT_CSS);
		System.out.println("Clicking");
		seleniumBase.type(SYSAID_CATEGORY_PRODUCT_CSS, SYSAID_CATEGORY_PRODUCT_XPATH, product);
		System.out.println("type");seleniumBase.switchToDropDown(SYSAID_CATEGORY_PRODUCT_SELECT_XPATH);
		seleniumBase.switchToDropDown(SYSAID_CATEGORY_PRODUCT_DIV_XPATH);
		Thread.sleep(5000);
		seleniumBase.selectADropdownValue(product, SYSAID_CATEGORY_PRODUCT_SELECT_CSS);
		seleniumBase.selectByVisibleText(SYSAID_CATEGORY_PRODUCT_SELECT_CSS, SYSAID_CATEGORY_PRODUCT_SELECT_XPATH, product);
		seleniumBase.getSelectList(SYSAID_CATEGORY_PRODUCT_SELECT_CSS, SYSAID_CATEGORY_PRODUCT_SELECT_XPATH);
		seleniumBase.selectADropdownValue(product, SYSAID_CATEGORY_PRODUCT_CLASS);
		seleniumBase.selectByVisibleText(SYSAID_CATEGORY_PRODUCT_CSS, SYSAID_CATEGORY_PRODUCT_XPATH, product);
		seleniumBase.getElement(SYSAID_CATEGORY_PRODUCT_CSS, SYSAID_CATEGORY_PRODUCT_XPATH);
		seleniumBase.getElement(SYSAID_CATEGORY_PRODUCT_CSS, product,SYSAID_CATEGORY_PRODUCT_XPATH);*/
    }



    public void updateSupLayer(String supLayer) throws InterruptedException {

        seleniumBase.switchedToiFrame("contentFrame");
        seleniumBase.switchToDropDown(SYSAID_CATEGORY_SUPPORTLAYER_DIV_XPATH);
        Thread.sleep(5000);
        seleniumBase.selectSysAidDropDown(supLayer);
        //seleniumBase.selectByVisibleText(SYSAID_CATEGORY_SUPPORTLAYER_CSS, SYSAID_CATEGORY_SUPPORTLAYER_XPATH, supLayer);
    }

    public void updateService(String service) throws InterruptedException {


        //seleniumBase.selectByVisibleText(SYSAID_CATEGORY_SERVICE_CSS, SYSAID_CATEGORY_SERVICE_XPATH, service);
    }

    public void updatePlannedDate(String plannedDate) {

        seleniumBase.type(SYSAID_PLANNEDDATE_CSS, SYSAID_PLANNEDDATE_XPATH, plannedDate);

    }

    public void changePriority(String priority) {

        seleniumBase.selectByVisibleText(SYSAID_PRIORITY_CSS, SYSAID_PRIORITY_XPATH, priority);
    }

    public void changeCaseOwner(String caseOwner) {

        seleniumBase.selectByVisibleText(SYSAID_CASEOWNER_CSS, SYSAID_CASEOWNER_XPATH, caseOwner);
    }

    public void changeToResolved(String status, String option) throws InterruptedException {

        seleniumBase.switchedToiFrame("contentFrame");
        seleniumBase.switchToDropDown(SYSAID_CASESTATUS_ASSIGNED_XPATH);
        Thread.sleep(5000);
        seleniumBase.selectSysAidDropDownTextAndOption(status,option);

    }

    //Add Activity
    public void addStartTime(String startTime) {

        seleniumBase.selectByVisibleText(SYSAID_ADD_ACTIVITY_ADD_START_TIME_CSS, SYSAID_ADD_ACTIVITY_ADD_START_TIME_XPATH,
                startTime);
    }

    public void addEndTime(String endTime) {

        seleniumBase.selectByVisibleText(SYSAID_ADD_ACTIVITY_ADD_END_TIME_CSS, SYSAID_ADD_ACTIVITY_ADD_END_TIME_XPATH,
                endTime);
    }

    public void addActivityType(String addType, String addTypeOptionValue) throws InterruptedException {

        seleniumBase.switchToDropDown(SYSAID_ADD_ACTIVITY_TYPE_XPATH);
        Thread.sleep(5000);
        seleniumBase.selectSysAidDropDownTextAndOption(addType,addTypeOptionValue);

    }

    public void addDescription(String description) throws InterruptedException {

        seleniumBase.type(SYSAID_ADD_ACTIVITY_DESCRIPTION_CSS, SYSAID_ADD_ACTIVITY_DESCRIPTION_XPATH, description);
    }

    public void addActivityButton() {
        seleniumBase.click(SYSAID_ADD_ACTIVITY_ADD_BUTTON_XPATH, SYSAID_ADD_ACTIVITY_ADD_BUTTON_CSS);
    }

    public Integer calculateTotalTime(int startTime, int endTime) {
        return seleniumBase.calculateTotalTime(startTime, endTime);
    }

    public void selectActivityAddedCheckBox() throws InterruptedException  {
        seleniumBase.selectCheckBox(SYSAID_ACTIVITY_ADDED_CHECKBOX_XPATH);
    }

    public void clickOkButton() {
        seleniumBase.click(SYSAID_OK_BUTTON_XPATH, SYSAID_OK_BUTTON_CSS);
    }

    public String getPopupMsg() {

        return seleniumBase.getAlertText();
    }

    public void acceptAlert() {
        seleniumBase.acceptAlert();
    }

    public void deleteActivity() {
        seleniumBase.click(SYSAID_DELETE_BUTTON_IN_ACTIVITY_TABLE_XPATH, SYSAID_DELETE_BUTTON_IN_ACTIVITY_TABLE_CSS);
    }
}
