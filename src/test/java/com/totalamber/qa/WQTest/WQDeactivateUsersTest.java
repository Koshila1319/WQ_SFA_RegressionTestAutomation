package com.totalamber.qa.WQTest;

import com.totalamber.qa.automation.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

import static com.totalamber.qa.data.UI.elements.webQuarters.wqAMAssignUsersPage.*;
import static com.totalamber.qa.data.UI.elements.webQuarters.wqCheckMailCatchEmailPage.*;
import static com.totalamber.qa.data.UI.elements.webQuarters.wqDMDashboardPage.SUPPORT_TILE_DESABLED_XPATH;

/**
 * Created by e.koshila on 10/09/2017.
 */
public class WQDeactivateUsersTest extends TestBase{

    @BeforeMethod
    public void NavigateToPage() throws InterruptedException, IOException {
        initDomainObjects(DRIVER);
    }
    @AfterMethod
    public void endTestMethod() throws Throwable{
      //  quitDriver();
    }

    @Test
    public void verify_AM_Navigate_To_Assign_Users_Page() throws Exception {
        String siteUrl = data.getValueByName("BackOfficeUrl");
        String AMUsername = data.getValueByName("AM_Username");
        String AMPassword = data.getValueByName("AM_Password");
        String WindowsAuthOption = data.getValueByName("SignInOption1");
        String assignUsersBrowserTitle = data.getValueByName("AM_assignUsersTilePage");

        setSiteURL(siteUrl);

        wqBackOfficeLoginPage.
                action_Login_as_BOUser(AMUsername,AMPassword);
        Thread.sleep(10000);
        wqBackOfficeLoginPage.
                action_selectAuthentication(WindowsAuthOption);
        Thread.sleep(10000);
        wqamDashboardPage.step_Click_Assign_Users_Tile();

        Assert.assertEquals(wqamDashboardPage.validate_user_goesTo_Page(),assignUsersBrowserTitle);
    }

    @Test
    public void verify_Selecting_Company() throws Exception {
        String siteUrl = data.getValueByName("BackOfficeUrl");
        String AMUsername = data.getValueByName("AM_Username");
        String AMPassword = data.getValueByName("AM_Password");
        String WindowsAuthOption = data.getValueByName("SignInOption1");

        setSiteURL(siteUrl);

        wqBackOfficeLoginPage.
                action_Login_as_BOUser(AMUsername,AMPassword);
        Thread.sleep(10000);
        wqBackOfficeLoginPage.
                action_selectAuthentication(WindowsAuthOption);
        Thread.sleep(10000);
        wqamDashboardPage.
                step_Click_Assign_Users_Tile();
        wqamAssignUsersPage.
                action_Select_Company(CompanySU);
        Thread.sleep(5000);

        Assert.assertEquals(wqamAssignUsersPage.verify_Data_Equals(WQ_AM_ASSIGN_USERS_SELECTED_COMPANY_XPATH),CompanySU);
    }

    //----------Deactivate SU

    // Deactivate SU by AM
    @Test
    public void verify_Successfully_Deactivate_SU() throws Exception {
        String siteUrl = data.getValueByName("BackOfficeUrl");
        String AMUsername = data.getValueByName("AM_Username");
        String AMPassword = data.getValueByName("AM_Password");
        String WindowsAuthOption = data.getValueByName("SignInOption1");

        setSiteURL(siteUrl);

        wqBackOfficeLoginPage.
                action_Login_as_BOUser(AMUsername,AMPassword);
        Thread.sleep(10000);
        wqBackOfficeLoginPage.
                action_selectAuthentication(WindowsAuthOption);
        Thread.sleep(10000);
        wqamDashboardPage.
                step_Click_Assign_Users_Tile();
        wqamAssignUsersPage.
                action_Select_Company(CompanySU);
        Thread.sleep(5000);

        deactivateSUEmail = wqamAssignUsersPage.step_Get_Deactivated_Email(WQ_AM_DEACTIVATE_SU_TEXTBOX_XPATH);

        //click deactivate button
        wqamAssignUsersPage.
                action_Click_Deactivate_Button(WQ_AM_DEACTIVATE_SU_BUTTON_XPATH);

        Assert.assertEquals(wqamAssignUsersPage.verify_Data_Equals(WQ_AM_DEACTIVATE_SUCCESS_XPATH),"User Deactivated");
    }

    //Deactivated SU email
    @Test
    public void  verify_Role_Ended_Email_In_Inbox_SU() throws InterruptedException {
        String mailcatchURL = data.getValueByName("mailcatchURL");
        String FromWQEmail = data.getValueByName("WQEmail");
        String emailSubjectInbox = data.getValueByName("SURoleEndedPage_EmailSubjectInbox");

        Thread.sleep(10000);
        wqCheckMailcatchEmailPage.
                check_Mailcatch_Email(mailcatchURL, deactivateSUEmail);

        Assert.assertEquals(wqCheckMailcatchEmailPage.verify_Element_Is_Available(WQ_CLIENT_INBOX_MAIL_SUBJECT_XPATH),true, "Email is available !");
        Assert.assertEquals(wqCheckMailcatchEmailPage.verify_Data_Equals(WQ_CLIENT_INBOX_MAIL_FROM_XPATH),FromWQEmail, "Inbox email from text verified !");
        Assert.assertEquals(wqCheckMailcatchEmailPage.verify_Data_Equals(WQ_CLIENT_INBOX_MAIL_SUBJECT_XPATH), emailSubjectInbox, "Inbox email subject verified !");
    }

    @Test
    public void  verify_Role_Ended_Email_Content_SU() throws InterruptedException {

        String mailcatchURL = data.getValueByName("mailcatchURL");
        String FromWQEmail = data.getValueByName("WQEmail");
        String emailSubject = data.getValueByName("SURoleEndedPage_EmailSubjectInbox");
        String emailContentText = data.getValueByName("SURoleEndedPage_EmailPageContentText");

        wqCheckMailcatchEmailPage.
                check_Mailcatch_Email(mailcatchURL, deactivateSUEmail).
                action_read_Latest_Received_Email_In_Mailcatch();
        Thread.sleep(10000);

        Assert.assertEquals(wqCheckMailcatchEmailPage.verify_Data_Equals(WQ_CLIENT_EMAIL_FROM_XPATH),FromWQEmail, "Email from text verified !");
        Assert.assertEquals(wqCheckMailcatchEmailPage.verify_Data_Equals(WQ_CLIENT_EMAIL_SUBJECT_XPATH),emailSubject, "Email subject verified !");

        wqCheckMailcatchEmailPage.
                step_switch_ToFrame();

        Assert.assertEquals(wqCheckMailcatchEmailPage.verify_Element_Is_Available(WQ_CLIENT_EMAIL_HEADER_IMAGE_XPATH),true, "Email header image is available !");
        Assert.assertEquals(wqCheckMailcatchEmailPage.verify_Data_Equals(WQ_CLIENT_EMAIL_HEADER_TITLE_XPATH),"Your role in WebQuarters has been ended", "Email heading text verified !");
        Assert.assertEquals(wqCheckMailcatchEmailPage.verify_Data_Equals(WQ_CLIENT_PREVIVOUS_USER_ROLE_ENDED_EMAIL_CONTENT_XPATH),emailContentText, "Verified Email content text !");
    }

    //Login to deactivated SU Account
    @Test
    public void  verify_Access_Denied_To_SU() throws Exception {
        String siteUrl = data.getValueByName("url");
        String passwordSU = data.getValueByName("SU_Password");
        setSiteURL(siteUrl);
        wqHomePage.
                action_Navigate_To_LoginPage();
        wqLoginPage.
                step_User_Enter_Given_Credentials(deactivateSUEmail,passwordSU);
        wqLoginPage.
                step_User_Click_Login_Button();

        Assert.assertEquals(wqLoginPage.check_Login_Page_Browser_Title(), "Access required");
    }


    //----------Deactivate DM/SU

    //Deactivate DM by AM
    @Test
    public void verify_Successfully_Deactivate_DM() throws Exception {
        String siteUrl = data.getValueByName("BackOfficeUrl");
        String AMUsername = data.getValueByName("AM_Username");
        String AMPassword = data.getValueByName("AM_Password");
        String WindowsAuthOption = data.getValueByName("SignInOption1");

        setSiteURL(siteUrl);

        wqBackOfficeLoginPage.
                action_Login_as_BOUser(AMUsername,AMPassword);
        Thread.sleep(10000);
        wqBackOfficeLoginPage.
                action_selectAuthentication(WindowsAuthOption);
        Thread.sleep(10000);
        wqamDashboardPage.
                step_Click_Assign_Users_Tile();
        wqamAssignUsersPage.
                action_Select_Company(CompanySU);
        Thread.sleep(5000);

        deactivateDMEmail = wqamAssignUsersPage.step_Get_Deactivated_Email(WQ_AM_DEACTIVATE_DM_SU_TEXTBOX_XPATH);

        //click deactivate button
        wqamAssignUsersPage.
                action_Click_Deactivate_Button(WQ_AM_DEACTIVATE_DM_SU_BUTTON_XPATH);

        Assert.assertEquals(wqamAssignUsersPage.verify_Data_Equals(WQ_AM_DEACTIVATE_SUCCESS_XPATH),"User Deactivated");
    }

    //Deactivated DM email
    @Test
    public void  verify_Role_Ended_Email_In_Inbox_DM() throws InterruptedException {
        String mailcatchURL = data.getValueByName("mailcatchURL");
        String FromWQEmail = data.getValueByName("WQEmail");
        String emailSubjectInbox = data.getValueByName("SURoleEndedPage_EmailSubjectInbox");

        Thread.sleep(15000);
        wqCheckMailcatchEmailPage.
                check_Mailcatch_Email(mailcatchURL, deactivateDMEmail);

        Assert.assertEquals(wqCheckMailcatchEmailPage.verify_Element_Is_Available(WQ_CLIENT_INBOX_MAIL_SUBJECT_XPATH),true, "Email is available !");
        Assert.assertEquals(wqCheckMailcatchEmailPage.verify_Data_Equals(WQ_CLIENT_INBOX_MAIL_FROM_XPATH),FromWQEmail, "Inbox email from text verified !");
        Assert.assertEquals(wqCheckMailcatchEmailPage.verify_Data_Equals(WQ_CLIENT_INBOX_MAIL_SUBJECT_XPATH), emailSubjectInbox, "Inbox email subject verified !");
    }

    @Test
    public void  verify_Role_Ended_Email_Content_DM() throws InterruptedException {

        String mailcatchURL = data.getValueByName("mailcatchURL");
        String FromWQEmail = data.getValueByName("WQEmail");
        String emailSubject = data.getValueByName("SURoleEndedPage_EmailSubjectInbox");
        String emailContentText = data.getValueByName("SURoleEndedPage_EmailPageContentText");

        wqCheckMailcatchEmailPage.
                check_Mailcatch_Email(mailcatchURL, deactivateDMEmail).
                action_read_Latest_Received_Email_In_Mailcatch();
        Thread.sleep(10000);


        Assert.assertEquals(wqCheckMailcatchEmailPage.verify_Data_Equals(WQ_CLIENT_EMAIL_FROM_XPATH),FromWQEmail, "Email from text verified !");
        Assert.assertEquals(wqCheckMailcatchEmailPage.verify_Data_Equals(WQ_CLIENT_EMAIL_SUBJECT_XPATH),emailSubject, "Email subject verified !");

        wqCheckMailcatchEmailPage.
                step_switch_ToFrame();

        Assert.assertEquals(wqCheckMailcatchEmailPage.verify_Element_Is_Available(WQ_CLIENT_EMAIL_HEADER_IMAGE_XPATH),true, "Email header image is available !");
        Assert.assertEquals(wqCheckMailcatchEmailPage.verify_Data_Equals(WQ_CLIENT_EMAIL_HEADER_TITLE_XPATH),"Your role in WebQuarters has been ended", "Email heading text verified !");
        Assert.assertEquals(wqCheckMailcatchEmailPage.verify_Data_Equals(WQ_CLIENT_PREVIVOUS_USER_ROLE_ENDED_EMAIL_CONTENT_XPATH),emailContentText, "Verified Email content text !");
    }

    //Login to deactivated DM Account
    @Test
    public void  verify_Support_Dashboard_Is_Disabled_To_DM() throws Exception {
        String siteUrl = data.getValueByName("url");
        String passwordSU = data.getValueByName("SU_Password");
        setSiteURL(siteUrl);
        wqHomePage.
                action_Navigate_To_LoginPage();
        wqLoginPage.
                step_User_Enter_Given_Credentials(deactivateDMEmail,passwordSU);
        wqLoginPage.
                step_User_Click_Login_Button();
        Thread.sleep(5000);

        Assert.assertEquals(wqdmDashboardPage.step_Get_Support_Dashboard_Status(SUPPORT_TILE_DESABLED_XPATH), "CaseMatch tab-disabled","Support Dashboard not enabled !");
    }
}
