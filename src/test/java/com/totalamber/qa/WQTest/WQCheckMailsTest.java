package com.totalamber.qa.WQTest;

import com.totalamber.qa.automation.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.UUID;

import static com.totalamber.qa.data.UI.elements.webQuarters.ElementHolder.*;
import static com.totalamber.qa.data.UI.elements.webQuarters.ElementHolder.EMAIL_GO_CSS;

/**
 * Created by e.koshila on 09/22/2017.
 */
public class WQCheckMailsTest extends TestBase{

    @BeforeClass
    public void NavigateToPage() throws InterruptedException, IOException {
        initDomainObjects(DRIVER);
        Thread.sleep(3000);
    }

    @AfterClass
    public void endTestMethod() throws Throwable{
       // quitDriver();
    }

    @Test
    public void verify_Check_Mailcatch_Email() throws InterruptedException {

        String clientEmail = UUID.randomUUID().toString() + "@mailcatch.com";
        String mailcatchURL = data.getValueByName("mailcatchURL");

        System.out.println(mailcatchURL + clientEmail);
        Thread.sleep(4000);

        wqCheckMailcatchEmailPage.check_Mailcatch_Email(mailcatchURL, "6d43be67-514b-491d-9f4b-06b6a740af5e@mailcatch.com");
    }



    @Test
    public void verify_Check_Outlook_Email() throws InterruptedException {

        String outlookURL = data.getValueByName("outlookURL");
        String BOUserEmail = data.getValueByName("emailAM");
        String BOUserPassword = data.getValueByName("emailPasswordAM");

        wqCheckOutLookEmailPage.checkOutlookEmail(outlookURL, BOUserEmail, BOUserPassword);
    }


    //read mails


    @Test
    public void verify_Read_Latest_Received_Email_In_Mailcatch() throws InterruptedException {

        verify_Check_Mailcatch_Email();
        wqCheckMailcatchEmailPage.action_read_Latest_Received_Email_In_Mailcatch();
    }


    @Test
    public void verify_Read_Latest_Received_Email_In_OutLook() throws InterruptedException {

        verify_Check_Outlook_Email();
        wqCheckOutLookEmailPage.readLatestReceivedEmailInOutLook();
    }




}
