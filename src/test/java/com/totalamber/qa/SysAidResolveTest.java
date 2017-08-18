package com.totalamber.qa;

import com.totalamber.qa.automation.WebQuartersTestBase;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class SysAidResolveTest extends WebQuartersTestBase {

    WebQuartersTestBase aa = new WebQuartersTestBase();

    @BeforeMethod
    public void NavigateToPage() throws InterruptedException, IOException {
        initDomainObjects(DRIVER);
        Thread.sleep(3000);
    }
    @AfterMethod
    public void endTestMethod() throws Throwable{
        //quitDriver();
    }

    @Test
    public void verifySysAidUserAbleToResolveCase() throws InterruptedException{

        String status = data.getValueByName("StatusResolved");
        String option = data.getValueByName("ResolvedOption");
        String startTime = data.getValueByName("startTime");
        String endTime = data.getValueByName("endTime");
        String activityType = data.getValueByName("activityType");
        String activityTypeOptionValue = data.getValueByName("activityTypeOptionValue");
        String description = data.getValueByName("description");

        sysAidCaseDom.changeStatusResolved(status,option);

        sysAidCaseDom.addActivityStartAndEndTime(startTime, endTime, activityType, activityTypeOptionValue, description);


    }


}
