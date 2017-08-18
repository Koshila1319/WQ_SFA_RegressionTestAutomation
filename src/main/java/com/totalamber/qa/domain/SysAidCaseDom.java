package com.totalamber.qa.domain;

import com.totalamber.qa.page.SysAidCasePage;
import org.openqa.selenium.WebDriver;

/**
 * Created by e.koshila on 8/16/2017.
 */
public class SysAidCaseDom {

    SysAidCasePage sysAidCasePage;

    public SysAidCaseDom(WebDriver driver) {

        sysAidCasePage = new SysAidCasePage(driver);
    }


    public void updateCategory(String product, String service, String supLayer) throws InterruptedException {

        sysAidCasePage.updateProdcut(product);
        Thread.sleep(5000);
        sysAidCasePage.updateService(service);
        Thread.sleep(5000);
		/*sysAidLoginPage.updateSupLayer(supLayer);
		Thread.sleep(5000);*/
    }

    public void changeStatusAssigned(String statusAssigned) {

        sysAidCasePage.changeToAssigned(statusAssigned);
    }

    public void updatePlannedDate(String plannedDate) {

        sysAidCasePage.updatePlannedDate(plannedDate);

    }

    public void changePriority(String priority) {

        sysAidCasePage.changePriority(priority);
    }

    public Object productDropdownExist() {

        return sysAidCasePage.currentProductDropdownExist();
    }

    public void changeCaseOwner(String caseOwner) {

        sysAidCasePage.changeCaseOwner(caseOwner);
    }

    //----------Resolve Case----------------

    public void changeStatusResolved(String status, String option) throws InterruptedException {

        sysAidCasePage.changeToResolved(status, option);
    }


    public void addActivityStartAndEndTime(String startTime, String endTime, String activityType, String activityTypeOptionValue, String description) throws InterruptedException {

        sysAidCasePage.addStartTime(startTime);
        sysAidCasePage.addEndTime(endTime);
        sysAidCasePage.addActivityType(activityType, activityTypeOptionValue);
        Thread.sleep(3000);
        sysAidCasePage.addDescription(description);
        sysAidCasePage.addActivityButton();
    }
}
