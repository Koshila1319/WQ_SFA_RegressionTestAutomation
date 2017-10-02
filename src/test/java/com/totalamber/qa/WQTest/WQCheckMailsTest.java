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
import static com.totalamber.qa.data.UI.elements.webQuarters.wqCheckMailCatchEmailPage.*;

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

 /*   //Mailcatch
    //-------check email
    @Test
    public void verify_Check_Mailcatch_Email() throws InterruptedException {

        String clientEmail = UUID.randomUUID().toString() + "@mailcatch.com";
        String mailcatchURL = data.getValueByName("mailcatchURL");

        System.out.println(mailcatchURL + clientEmail);
        Thread.sleep(4000);

        wqCheckMailcatchEmailPage.check_Mailcatch_Email(mailcatchURL, "6d43be67-514b-491d-9f4b-06b6a740af5e@mailcatch.com");
    }

    //read mails
    @Test
    public void verify_Read_Latest_Received_Email_In_Mailcatch() throws InterruptedException {

        verify_Check_Mailcatch_Email();
        wqCheckMailcatchEmailPage.action_read_Latest_Received_Email_In_Mailcatch();
    }


    //Mailcatch
    //-------check email
    @Test
    public void verify_Check_Outlook_Email() throws InterruptedException {

        String outlookURL = data.getValueByName("outlookURL");
        String BOUserEmail = data.getValueByName("AM_Email");
        String BOUserPassword = data.getValueByName("AM_Email_Password");

        wqCheckOutLookEmailPage.checkOutlookEmail(outlookURL, BOUserEmail, BOUserPassword);
    }

    //read mails
    @Test
    public void verify_Read_Latest_Received_Email_In_OutLook() throws InterruptedException {

        verify_Check_Outlook_Email();
        wqCheckOutLookEmailPage.readLatestReceivedEmailInOutLook();
    }*/


// Signup Email Confirmation


    /*@Test
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
    }*/


    //Client Activation

    @Test
    public void verify_Check_Mailcatch_Email() throws InterruptedException {
        String mailcatchURL = data.getValueByName("mailcatchURL");
        wqCheckMailcatchEmailPage.
                check_Mailcatch_Email(mailcatchURL, clientEmail);
    }

    @Test
    public void  verify_Mail_Is_Available_In_Inbox() throws InterruptedException {
        Assert.assertEquals(wqCheckMailcatchEmailPage.verify_Element_Is_Available(WQ_CLIENT_INBOX_MAIL_SUBJECT_XPATH),true, "Email is available !");
    }


    @Test
    public void verify_Mail_From_Content_Is_FromWebQuarters() throws InterruptedException {
        String FromWQEmail = data.getValueByName("WQEmail");
        Assert.assertEquals(wqCheckMailcatchEmailPage.verify_Data_Equals(WQ_CLIENT_INBOX_MAIL_FROM_XPATH),FromWQEmail, "Inbox email from text verified !");
    }

    @Test
    public void verify_Mail_Subject_Is_FromWebquarters() throws InterruptedException {
        String emailSubjectInbox = data.getValueByName("ClientActivateEmailInbox_EmailSubject");
        Assert.assertEquals(wqCheckMailcatchEmailPage.verify_Data_Equals(WQ_CLIENT_INBOX_MAIL_SUBJECT_XPATH), emailSubjectInbox, "Inbox email subject verified !");
    }

    @Test
    public void verify_Clicking_the_Mail_In_Inbox() throws InterruptedException {
        wqCheckMailcatchEmailPage.action_read_Latest_Received_Email_In_Mailcatch();
    }

    @Test
    public void verify_SubjectText_In_Account_Activated_Email() throws InterruptedException {
        String emailSubject = data.getValueByName("ClientActivateEmailPage_EmailSubject");
        Assert.assertEquals(wqCheckMailcatchEmailPage.verify_Data_Equals(WQ_CLIENT_EMAIL_SUBJECT_XPATH),emailSubject, "Email subject verified !");
    }

    @Test
    public void verify_FromText_In_Account_Activated_Email()throws InterruptedException {
        String FromWQEmail = data.getValueByName("WQEmail");
        Assert.assertEquals(wqCheckMailcatchEmailPage.verify_Data_Equals(WQ_CLIENT_EMAIL_FROM_XPATH),FromWQEmail, "Email from text verified !");
    }

    @Test
    public void verify_Greet_With_FirstName_In_Email() throws InterruptedException {
        String clientFirstName= data.getValueByName("First_Name");
        Assert.assertEquals(wqCheckMailcatchEmailPage.step_get_First_Name_Of_The_Client(),clientFirstName, "Client first name verified !");
    }

    @Test
    public void verify_Content_Of_The_Email() throws InterruptedException {
        String clientFirstName= data.getValueByName("First_Name");
        Assert.assertEquals(wqCheckMailcatchEmailPage.verify_Data_Equals(WQ_CLIENT_EMAIL_FNAME_XPATH),"Hi "+clientFirstName+",", "Greet text verified !");
        Assert.assertEquals(wqCheckMailcatchEmailPage.verify_Data_Equals(WQ_CLIENT_ACTIVATE_EMAIL_USER_NAME_XPATH),"Username: "+clientEmail, "User name available !");
        Assert.assertEquals(wqCheckMailcatchEmailPage.step_get_Temp_Pw_Text(),"Temporary Password", "Password available !");
    }

    @Test
    public void verify_The_Email_Header_Image_Is_Available() throws InterruptedException {
        //Verify WQ logo and TA logo
        Thread.sleep(10000);
        Assert.assertEquals(wqCheckMailcatchEmailPage.verify_Element_Is_Available(WQ_CLIENT_EMAIL_HEADER_IMAGE_XPATH),true, "Email header image is available !");
    }

    @Test
    public void verify_The_Heading_Title_Text() throws InterruptedException {
        Assert.assertEquals(wqCheckMailcatchEmailPage.verify_Data_Equals(WQ_CLIENT_EMAIL_HEADER_TITLE_XPATH),"Your Account is Activated", "Header title available !");
    }

    @Test
    public void verify_LinkText_In_Email_Content()throws InterruptedException {
        String activtionLinkText= data.getValueByName("ClientActivateEmailPage_LinkText");
        Assert.assertEquals(wqCheckMailcatchEmailPage.verify_Data_Equals(WQ_CLIENT_EMAIL_CONTENT_LINK_XPATH),activtionLinkText, "Verification link available !");
    }

    @Test
    public void verify_UserName_Alongwith_UserName_Label_In_Email_Content()throws InterruptedException {
        Assert.assertNotNull(wqCheckMailcatchEmailPage.step_Get_Activated_User_Details(WQ_CLIENT_ACTIVATE_EMAIL_USER_NAME_XPATH),"User name verified !");
    }

    @Test
    public void verify_Temporary_Password_Alongwith_Temporary_Password_Label_In_Email_Content()throws InterruptedException {
        Assert.assertNotNull(wqCheckMailcatchEmailPage.step_Get_Activated_User_Details(WQ_CLIENT_ACTIVATE_EMAIL_TEMP_PASSWORD_XPATH), "Password verified !");
    }

    @Test
    public void verify_Extracting_UserName_From_Email_Content()throws InterruptedException {
       String userName = wqCheckMailcatchEmailPage.step_Get_Activated_User_Details(WQ_CLIENT_ACTIVATE_EMAIL_USER_NAME_XPATH);
       System.out.println("User name = "+userName);
       Assert.assertEquals(userName, clientEmail, "User name extracted !");
    }

    @Test
    public void verify_Extracting_Password_From_Email_Content()throws InterruptedException {
        String tempPw = wqCheckMailcatchEmailPage.step_Get_Activated_User_Details(WQ_CLIENT_ACTIVATE_EMAIL_TEMP_PASSWORD_XPATH);
        System.out.println("Temp password  = "+tempPw);
        Assert.assertNotNull(tempPw, "Temp password extracted !");
    }

    @Test
    public void verify_the_Link_in_Email_Content()throws InterruptedException {
        Assert.assertEquals(wqCheckMailcatchEmailPage.verify_Element_Is_Enabled(WQ_CLIENT_EMAIL_CONTENT_LINK_XPATH),true, "Verification link available !");
    }

    @Test
    public void verify_Click_Login_Link_Goes_To_LoginPage()throws InterruptedException {
        wqCheckMailcatchEmailPage.action_Click_On_Link();
        Assert.assertEquals(wqCheckMailcatchEmailPage.check_Browser_Title(),"Sign In","Activation Link verified !");
    }

}
