package com.totalamber.qa.WQTest;

import com.totalamber.qa.automation.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.totalamber.qa.data.UI.elements.webQuarters.wqCheckMailCatchEmailPage.*;
import java.io.IOException;
import java.util.UUID;

/**
 * Created by e.koshila on 09/25/2017.
 */
public class WQSignupEmailConfirmationTest extends TestBase {

    @BeforeClass
    public void NavigateToPage() throws InterruptedException, IOException {
        initDomainObjects(DRIVER);
        Thread.sleep(3000);
    }

    @AfterClass
    public void endTestMethod() throws Throwable {
        // quitDriver();
    }

    @Test
    public void verify_Check_Mailcatch_Email() throws InterruptedException {
        String mailcatchURL = data.getValueByName("mailcatchURL");
        wqCheckMailcatchEmailPage.
                check_Mailcatch_Email(mailcatchURL, clientEmail).
                action_read_Latest_Received_Email_In_Mailcatch();

    }

    @Test
    public void verify_Email_Is_From_WebQuarters() throws InterruptedException {
        String FromWQEmail = data.getValueByName("WQEmail");
        Assert.assertEquals(wqCheckMailcatchEmailPage.verify_Data_Equals(WQ_CLIENT_EMAIL_FROM_XPATH),FromWQEmail);
    }

    @Test
    public void verify_Email_Is_To_Client() throws InterruptedException {
        // need to implement using another email client
    }

    @Test
    public void verify_Email_Subject_Feild() throws InterruptedException {
        String FromWQEmail = data.getValueByName("SignupEmailConfirmationPage_EmailSubject");
        Assert.assertEquals(wqCheckMailcatchEmailPage.verify_Data_Equals(WQ_CLIENT_EMAIL_SUBJECT_XPATH),FromWQEmail, "Email subject verified !");
    }

    @Test
    public void verify_Email_Contain_User_First_Name() throws InterruptedException {
        String clientFirstName= data.getValueByName("First_Name");
        Assert.assertEquals(wqCheckMailcatchEmailPage.step_get_First_Name_Of_The_Client(),clientFirstName, "Client first name verified !");
    }

    @Test
    public void verify_The_Email_Header_Image_Is_Available() throws InterruptedException {
        //Verify WQ logo and TA logo
       Assert.assertEquals(wqCheckMailcatchEmailPage.verify_Element_Is_Available(WQ_CLIENT_EMAIL_HEADER_IMAGE_XPATH),true, "Email header image is available !");
    }

    @Test
    public void verify_The_Heading_Title_Text() throws InterruptedException {
        Assert.assertEquals(wqCheckMailcatchEmailPage.verify_Data_Equals(WQ_CLIENT_EMAIL_HEADER_TITLE_XPATH),"Verify your email address…", "Header title available !");
    }

    @Test
    public void verify_Verification_Link_Available_In_The_Email_Content() throws InterruptedException {
        Assert.assertEquals(wqCheckMailcatchEmailPage.verify_Element_Is_Available(WQ_CLIENT_EMAIL_CONTENT_LINK_XPATH),true, "Verification link available !");
    }

    @Test
    public void verify_Verification_Link_Leads_To_Thank_You_Page()throws InterruptedException {
        wqCheckMailcatchEmailPage.
                action_Click_On_Link();
        Assert.assertEquals(wqCheckMailcatchEmailPage.check_Browser_Title(),"WebQuarters Registration Complete","Verification Link verified !");
    }



}