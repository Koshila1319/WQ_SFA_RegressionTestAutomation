package com.totalamber.qa;

import com.totalamber.qa.automation.WebQuartersTestBase;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class SysAidResolveTest extends WebQuartersTestBase {

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
    public void verifyUserUnableToAddActivityWithoutRequiredData() throws InterruptedException{

        String status = data.getValueByName("StatusResolved");
        String option = data.getValueByName("ResolvedOption");
        String startTime = data.getValueByName("startTime");
        String endTime = data.getValueByName("endTime");
        String activityType1 = data.getValueByName("activityType1");
        String activityTypeOptionValue1 = data.getValueByName("activityTypeOptionValue1");
        String activityTypePopupMsg = data.getValueByName("activityTypePopupMsg");
        String activityDescriptionPopupMsg = data.getValueByName("activityDescriptionPopupMsg");

        sysAidCaseDom.changeStatusResolved(status,option);

        //Submit without selecting Activity Type
        sysAidCasePage.addStartTime(startTime);
        sysAidCasePage.addEndTime(endTime);
        sysAidCasePage.addActivityButton();

        System.out.print("AlertMsg = " + sysAidCaseDom.getPopupMsg() );
        Assert.assertEquals(sysAidCaseDom.getPopupMsg(), activityTypePopupMsg);

        sysAidCaseDom.acceptAlert();

        //Submit without adding Description
        sysAidCasePage.addActivityType(activityType1, activityTypeOptionValue1);
        sysAidCasePage.addActivityButton();

        System.out.println("AlertMsg = " + sysAidCaseDom.getPopupMsg() );
        Assert.assertEquals(sysAidCaseDom.getPopupMsg(), activityDescriptionPopupMsg);

        sysAidCaseDom.acceptAlert();

    }

    @Test
    public void verifyAbleToAddActivitySuccessfully() throws InterruptedException {

        String startTime = data.getValueByName("startTime");
        String endTime = data.getValueByName("endTime");
        String activityType2 = data.getValueByName("activityType2");
        String activityTypeOptionValue2 = data.getValueByName("activityTypeOptionValue2");
        String description = data.getValueByName("description");
        String start = "", end = "";

        verifyUserUnableToAddActivityWithoutRequiredData();

        sysAidCaseDom.addActivityDetails(startTime, endTime, activityType2, activityTypeOptionValue2, description);
        Thread.sleep(3000);

        System.out.println("AT = " + supportLoginDom.verifyDataEquals( SYSAID_DESCRIPTION_IN_ACTIVITY_TABLE_XPATH));
        System.out.println("des = " + supportLoginDom.verifyDataEquals(SYSAID_ACTIVITY_TYPE_IN_ACTIVITY_TABLE_XPATH));

        Assert.assertEquals(supportLoginDom.verifyDataEquals(SYSAID_DESCRIPTION_IN_ACTIVITY_TABLE_XPATH), description);
        Assert.assertEquals(supportLoginDom.verifyDataEquals(SYSAID_ACTIVITY_TYPE_IN_ACTIVITY_TABLE_XPATH), activityType2);

        //Verify Total Time---------------
        //calculate total time and verify
       /* start = seleniumBase.splitReplaceConcatText(startTime,":", ".");
        end = seleniumBase.splitReplaceConcatText(endTime,":", ".");

        System.out.print("total time = "+start);
        System.out.print("total time string = "+end);

        int startTimeInt = Integer.parseInt(start);
        int endTimeInt = Integer.parseInt(end);
        int total = sysAidCaseDom.calculateTotalTime(startTimeInt,endTimeInt);

        String timeTot = Integer.toString(total);

        String totalResolvedTime = seleniumBase.splitReplaceConcatText(timeTot,".",":");


        System.out.print("total time = "+total);
        System.out.print("total time string = "+timeTot);
        System.out.print("total resolved time string = "+totalResolvedTime);


        Assert.assertEquals(supportLoginDom.verifyDataEquals(SYSAID_ADD_ACTIVITY_TOTAL_RESOLVE_TIME_XPATH), totalResolvedTime); // verify user is in the view case page
        Thread.sleep(4000);*/

    }
    @Test
    public void verifyUserAbleToDeleteAddedActivities() throws InterruptedException{

        String activityType2 = data.getValueByName("activityType2");
        String description = data.getValueByName("description");

        verifyAbleToAddActivitySuccessfully();

        sysAidCaseDom.deleteActivity();
        //check total decreases
        Thread.sleep(2000);

        sysAidCasePage.addActivityButton();
        Thread.sleep(2000);

        Assert.assertEquals(supportLoginDom.verifyDataEquals(SYSAID_DESCRIPTION_IN_ACTIVITY_TABLE_XPATH), description);
        Assert.assertEquals(supportLoginDom.verifyDataEquals(SYSAID_ACTIVITY_TYPE_IN_ACTIVITY_TABLE_XPATH), activityType2);

    }



    @Test
    public void verifyUserUnableToSubmitWithoutCheckActivityAdded() throws InterruptedException{

        String activityAddedPopupMsg = data.getValueByName("activityAddedPopupMsg");

        verifyUserAbleToDeleteAddedActivities();

        sysAidCaseDom.clickOkButton();
        Thread.sleep(3000);

        System.out.print("AlertMsg = " + sysAidCaseDom.getPopupMsg() );
        Assert.assertEquals(sysAidCaseDom.getPopupMsg(), activityAddedPopupMsg);

        sysAidCaseDom.acceptAlert();

    }

    @Test
    public void verifySysAidUserAbleToResolveCase() throws InterruptedException{

        String homeUrl = "https://testservicedesk.totalamber.com/Home.jsp?historyPage=Y";

        verifyUserUnableToSubmitWithoutCheckActivityAdded();

        sysAidCaseDom.selectActivityAddedCheckBox();
        sysAidCaseDom.clickOkButton();

       // System.out.println("current url =  " + seleniumBase.getCurrentUrl());
      //  Assert.assertEquals(seleniumBase.getCurrentUrl(), homeUrl);


    }

}
