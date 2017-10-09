package com.totalamber.qa.WQTest;

import com.totalamber.qa.automation.TestBase;
import com.totalamber.qa.data.UI.elements.webQuarters.wqAMAssignUsersPage;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.totalamber.qa.data.UI.elements.webQuarters.wqAMAssignUsersPage.*;
import static com.totalamber.qa.data.UI.elements.webQuarters.wqCheckMailCatchEmailPage.*;
import static com.totalamber.qa.data.UI.elements.webQuarters.wqCheckOutLookEmailPage.*;
import static com.totalamber.qa.data.UI.elements.webQuarters.wqDMDashboardPage.DM_DASHBOARD_ASSIGN_USERS_TILE_XPATH;
import static com.totalamber.qa.data.UI.elements.webQuarters.wqManageUserRequestsPage.*;
import static com.totalamber.qa.data.UI.elements.webQuarters.wqUserProfileUpdatePage.WQ_DM_DASHBOARD_TILE_XPATH;
import static com.totalamber.qa.data.UI.elements.webQuarters.wqUserProfileUpdatePage.WQ_SUPPORT_DASHBOARD_LINK_XPATH;
import static com.totalamber.qa.data.UI.elements.webQuarters.wqUserProfileUpdatePage.WQ_SUPPORT_TILE_XPATH;

/**
 * Created by e.koshila on 10/4/2017.
 */
public class WQAssignDMAsSPUserRequestTest extends TestBase {

    @BeforeClass
    public void NavigateToPage() throws Exception {
        initDomainObjects(DRIVER);
        String siteUrl = data.getValueByName("url");
        String clientPw = data.getValueByName("VALIDPASSWORD");
        setSiteURL(siteUrl);
        wqHomePage.action_Navigate_To_LoginPage();
        wqLoginPage.step_User_Enter_Given_Credentials(clientEmail,clientPw);
        wqLoginPage.step_User_Click_Login_Button();
        wqdmDashboardPage.step_Click_Home_Button();

        DMEmailByEmail = clientEmail;
        DMRoleByEmail = "Support User";
        userAssignRequestedCompany = "39_TAQA";
      }

    @AfterMethod
    public void endTestMethod() throws Throwable{
       // quitDriver();
    }

    //----------Request users (DM as SU)
    @Test
    public void verify_Assign_Users_Tile_Is_Available() throws Exception {
        NavigateToPage();
        Assert.assertEquals(wqdmDashboardPage.verify_Element_Is_Available(DM_DASHBOARD_ASSIGN_USERS_TILE_XPATH),true, "Asign Users tile is available !");
    }

    @Test
    public void verify_Clicking_Assign_Users_Tile_Leads_To_Manage_User_Requests_Page() throws Exception {
       NavigateToPage();
       wqdmDashboardPage.
               step_Click_Assign_Users_Tile();
       Assert.assertEquals(wqdmDashboardPage.check_Browser_Title(),"WebQuarters LicensePreferancesManageUserRequests","Browser title verified !");
    }

    @Test
    public void verify_DM_Details_In_User_Request_Table() throws Exception {
      String clientFname = data.getValueByName("testFname");
      String clientLname = data.getValueByName("testLname");

      NavigateToPage();
      wqdmDashboardPage.
                step_Click_Assign_Users_Tile();
      Assert.assertEquals(wqManageUserRequestsPage.verify_Data_Equals(WQ_CLIENT_MANAGE_USER_REQUESTS_XPATH),clientFname+" "+clientLname,"DM fname and lname available !");
    }

    @Test
    public void verify_Clicking_Request_Assign_Button_In_SU_Leads_To_User_Information_Popup() throws Exception {
        String requestUserPopupTitle = data.getValueByName("ManageUserRequestsPage_RequestUserPopupTile");

        NavigateToPage();
        wqdmDashboardPage.
                step_Click_Assign_Users_Tile();
        wqManageUserRequestsPage.
                action_Click_Request_Button(WQ_DM_REQUEST_ASSIGN_BUTTON_2_XPATH);
        Thread.sleep(3000);
        Assert.assertEquals(wqManageUserRequestsPage.step_get_requests_user_popup_title(), requestUserPopupTitle);
    }

    @Test
    public void verify_User_Information_Popup_Element_Texts() throws Exception {
        NavigateToPage();
        wqdmDashboardPage.
                step_Click_Assign_Users_Tile();
        wqManageUserRequestsPage.
                action_Click_Request_Button(WQ_DM_REQUEST_ASSIGN_BUTTON_2_XPATH);
        Thread.sleep(5000);
        seleniumBase.swichToPopup(1);
        Assert.assertEquals(wqManageUserRequestsPage.verify_Data_Equals(WQ_CLIENT_POPUP_EMAIL_TEXT_XPATH), "E-Mail");
        Assert.assertEquals(wqManageUserRequestsPage.verify_Data_Equals(WQ_CLIENT_POPUP_FNAME_TEXT_XPATH), "First Name");
        Assert.assertEquals(wqManageUserRequestsPage.verify_Data_Equals(WQ_CLIENT_POPUP_LNAME_TEXT_XPATH), "Last Name");
        Assert.assertEquals(wqManageUserRequestsPage.verify_Data_Equals(WQ_CLIENT_POPUP_DESIGNATION_TEXT_XPATH), "Designation");
    }

    @Test
    public void verify_User_Information_Popup_Buttons_Enabled() throws Exception {
        NavigateToPage();
        wqdmDashboardPage.
                step_Click_Assign_Users_Tile();
        wqManageUserRequestsPage.
                action_Click_Request_Button(WQ_DM_REQUEST_ASSIGN_BUTTON_2_XPATH);
        Thread.sleep(5000);
        seleniumBase.swichToPopup(1);
        Assert.assertEquals(wqManageUserRequestsPage.verify_Element_Is_Enabled(WQ_CLIENT_CHANGE_POPUP_REQUEST_BUTTON_XPATH), true, "Request button Enabled !");
        Assert.assertEquals(wqManageUserRequestsPage.verify_Element_Is_Enabled(WQ_CLIENT_CHANGE_POPUP_CANCEL_BUTTON_XPATH), true, "Cancel button Enabled !");
    }

    @Test
    public void verify_Unable_To_Submit_Request_Without_Adding_Required_SU_Details() throws Exception {
        String emailRequiredMsg = data.getValueByName("ManageUserRequestsPage_RequestUserPopupError");
        Thread.sleep(5000);

        NavigateToPage();
        wqdmDashboardPage.
                step_Click_Assign_Users_Tile();
        wqManageUserRequestsPage.
                action_Click_Request_Button(WQ_DM_REQUEST_ASSIGN_BUTTON_2_XPATH);
        Thread.sleep(5000);
        seleniumBase.swichToPopup(1);

        wqManageUserRequestsPage.
                action_Click_Request_Button_In_Popup();
        Thread.sleep(5000);

        Assert.assertEquals(wqManageUserRequestsPage.verify_Data_Equals(WQ_CLIENT_EMIL_REQUIRED_MSG_XPATH), emailRequiredMsg);
    }

    @Test
    public void verify_Able_To_Submit_Request_Successfully_By_Adding_SU_Details() throws Exception {
        String email = SUEmail;
        String fname = data.getValueByName("testFname");
        String lname = data.getValueByName("testLname");
        String designation = data.getValueByName("SUDesignation");
        String emailSuccessMsg = data.getValueByName("ManageUserRequestsPage_RequestUserPopupSuccess");

        NavigateToPage();
        wqdmDashboardPage.
                step_Click_Assign_Users_Tile();
        wqManageUserRequestsPage.
                action_Click_Request_Button(WQ_DM_REQUEST_ASSIGN_BUTTON_2_XPATH);
        Thread.sleep(5000);
        seleniumBase.swichToPopup(1);
        wqManageUserRequestsPage.
                step_Add_Data_To_User_Request_Popup(email, fname,lname,designation).
                action_Click_Request_Button_In_Popup();
        Thread.sleep(10000);

        Assert.assertEquals(wqManageUserRequestsPage.verify_Data_Equals(WQ_CLIENT_REQUEST_SUCCESS_MESSAGE_XPATH), emailSuccessMsg,"DM Successfully requested !");
    }

    @Test
    public void verify_Close_The_User_Information_Popup_By_Clicking_Cancel_Button() throws Exception {

        NavigateToPage();
        wqdmDashboardPage.
                step_Click_Assign_Users_Tile();
        wqManageUserRequestsPage.
                action_Click_Request_Button(WQ_DM_REQUEST_ASSIGN_BUTTON_2_XPATH);
        Thread.sleep(5000);
        seleniumBase.swichToPopup(1);
        wqManageUserRequestsPage.
                action_Click_Cancel_Button_In_Popup();
        Thread.sleep(2000);
       // Assert.assertEquals(wqManageUserRequestsPage.Is_Element_Not_Available(WQ_CLIENT_CHANGE_POPUP_TITLE_XPATH), true, "Popup closed !");
    }

    //----------Check Email AM
    @Test
    public void verify_AM_Loging_To_Email() throws InterruptedException, NoSuchElementException {
        String outlookURL = data.getValueByName("outlookURL");
        String BOUserEmail = data.getValueByName("AM_Email");
        String BOUserPassword = data.getValueByName("AM_Email_Password");

        wqCheckOutLookEmailPage.
                check_Outlook_Email(outlookURL, BOUserEmail, BOUserPassword);
    }

    @Test
    public void verify_User_Assign_Request_Email_IsAvailable() throws InterruptedException {
       String outlookURL = data.getValueByName("outlookURL");
       String BOUserEmail = data.getValueByName("AM_Email");
       String BOUserPassword = data.getValueByName("AM_Email_Password");
       String userAssignRequestEmailInAM = data.getValueByName("CheckOutlookEmailPage_AMUserAssignRequestEmailSubjectInbox");

       wqCheckOutLookEmailPage.
                check_Outlook_Email(outlookURL, BOUserEmail, BOUserPassword);
       Thread.sleep(2000);
       Assert.assertEquals(wqCheckOutLookEmailPage.verify_Data_Equals(LATEST_RECEIVED_OUTLOOK_EMAIL_XPATH),userAssignRequestEmailInAM);
    }

    @Test
    public void verify_User_Assign_Request_Email_Title() throws InterruptedException {
        String outlookURL = data.getValueByName("outlookURL");
        String BOUserEmail = data.getValueByName("AM_Email");
        String BOUserPassword = data.getValueByName("AM_Email_Password");
        String userAssignRequestEmailTitleInAM = data.getValueByName("CheckOutlookEmailPage_AMUserAssignRequestEmailTitle");

        wqCheckOutLookEmailPage.
                check_Outlook_Email(outlookURL, BOUserEmail, BOUserPassword);
        Thread.sleep(2000);
        wqCheckOutLookEmailPage.
                action_read_Latest_Received_Email_In_OutLook();
        Thread.sleep(15000);
        Assert.assertEquals(wqCheckOutLookEmailPage.verify_Data_Equals(WQ_AM_REASSIGN_USER_REQUEST_EMAIL_TITLE_XPATH),userAssignRequestEmailTitleInAM);
    }

    @Test
    public void verify_User_Assign_Request_Email_Requested_Company() throws InterruptedException {
        String outlookURL = data.getValueByName("outlookURL");
        String BOUserEmail = data.getValueByName("AM_Email");
        String BOUserPassword = data.getValueByName("AM_Email_Password");
        String userRequestedCompany = data.getValueByName("Company_Name");

        wqCheckOutLookEmailPage.
                check_Outlook_Email(outlookURL, BOUserEmail, BOUserPassword);
        Thread.sleep(2000);
        wqCheckOutLookEmailPage.
                action_read_Latest_Received_Email_In_OutLook();
        Thread.sleep(20000);

        userAssignRequestedCompany = wqCheckOutLookEmailPage.step_Extract_Company_Details(WQ_AM_REASSIGN_USER_REQUEST_EMAIL_REQUESTED_COMPAMY_XPATH);
        System.out.println(userAssignRequestedCompany);
        Assert.assertEquals(userAssignRequestedCompany, userRequestedCompany, "User requested company verified !");
    }


    @Test
    public void verify_User_Assign_Request_Email_DM_Details() throws InterruptedException {
        String outlookURL = data.getValueByName("outlookURL");
        String BOUserEmail = data.getValueByName("AM_Email");
        String BOUserPassword = data.getValueByName("AM_Email_Password");
        String DMEmail = clientEmail;
        String DMFname = data.getValueByName("testFname");
        String DMLname = data.getValueByName("testLname");
        String DMDesignation = data.getValueByName("SUDesignation");

        wqCheckOutLookEmailPage.
                check_Outlook_Email(outlookURL, BOUserEmail, BOUserPassword);
        Thread.sleep(2000);
        wqCheckOutLookEmailPage.
                action_read_Latest_Received_Email_In_OutLook();
        Thread.sleep(15000);

        DMEmailByEmail = wqCheckOutLookEmailPage.step_Extract_User_Details(WQ_AM_ASSIGN_USER_REQUEST_EMAIL_NEW_USER_EMAIL_XPATH);

        Assert.assertEquals(DMEmailByEmail, DMEmail, "New user email verified !");
        Assert.assertEquals(wqCheckOutLookEmailPage.step_Extract_User_Details(WQ_AM_ASSIGN_USER_REQUEST_EMAIL_NEW_USER_FNAME_XPATH),DMFname, "New user fname verified !");
        Assert.assertEquals(wqCheckOutLookEmailPage.step_Extract_User_Details(WQ_AM_ASSIGN_USER_REQUEST_EMAIL_NEW_USER_LNAME_XPATH),DMLname, "New user lname verified !");
        Assert.assertEquals(wqCheckOutLookEmailPage.step_Extract_User_Details(WQ_AM_ASSIGN_USER_REQUEST_EMAIL_NEW_USER_DESIGNATION_XPATH),DMDesignation, "New user designation verified !");
    }

    @Test
    public void verify_User_Assign_Request_Email_Requested_User_Role() throws InterruptedException {
        String outlookURL = data.getValueByName("outlookURL");
        String BOUserEmail = data.getValueByName("AM_Email");
        String BOUserPassword = data.getValueByName("AM_Email_Password");

        wqCheckOutLookEmailPage.
                check_Outlook_Email(outlookURL, BOUserEmail, BOUserPassword);
        Thread.sleep(2000);
        wqCheckOutLookEmailPage.
                action_read_Latest_Received_Email_In_OutLook();
        Thread.sleep(20000);

        DMRoleByEmail = wqCheckOutLookEmailPage.step_Extract_User_Details(WQ_AM_ASSIGN_USER_REQUEST_EMAIL_NEW_USER_ROLE_XPATH);

        Assert.assertEquals(wqCheckOutLookEmailPage.verify_Data_Equals(WQ_AM_ASSIGN_USER_REQUEST_EMAIL_NEW_USER_ROLE_XPATH), "User Role : Support User", "Requested users role verified !");
    }

    //----------Assign SU by AM

    @Test
    public void verify_Login_To_AM_Account() throws InterruptedException {
        String siteUrl = data.getValueByName("BackOfficeUrl");
        String AMUsername = data.getValueByName("AM_Username");
        String AMPassword = data.getValueByName("AM_Password");
        String WindowsAuthOption = data.getValueByName("SignInOption1");
        String expectedTitle = data.getValueByName("AM_HomePage");

        setSiteURL(siteUrl);

        wqBackOfficeLoginPage.
                action_Login_as_BOUser(AMUsername,AMPassword);
        Thread.sleep(10000);
        wqBackOfficeLoginPage.
                action_selectAuthentication(WindowsAuthOption);
        Thread.sleep(10000);

        Assert.assertEquals(wqBackOfficeLoginPage.validate_BrowserTitle(), expectedTitle);
    }

    @Test
    public void verify_Assign_Users_Tile_IsAvailable() throws InterruptedException {
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

        Assert.assertEquals(wqamDashboardPage.check_Assign_Users_Tile_Is_Available(), true);
    }

    @Test
    public void verify_Clicking_Assign_Users_Tile_Leads_To_Assign_Users_Page()throws InterruptedException {
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
    public void verify_Company_DropDown_IsAvailable()throws InterruptedException {
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
        Thread.sleep(5000);
        Assert.assertEquals(wqamAssignUsersPage.verify_Element_Is_Available(wqAMAssignUsersPage.WQ_AM_ASSIGN_USERS_SELECT_COMPANY_DROPDOWN_XPATH), true, "Select Company dropdown is available !");
    }

    @Test
    public void verify_Select_Company_From_The_DropDown()throws InterruptedException {
        String siteUrl = data.getValueByName("BackOfficeUrl");
        String AMUsername = data.getValueByName("AM_Username");
        String AMPassword = data.getValueByName("AM_Password");
        String WindowsAuthOption = data.getValueByName("SignInOption1");

        setSiteURL(siteUrl);

        wqBackOfficeLoginPage.
                action_Login_as_BOUser(AMUsername, AMPassword);
        Thread.sleep(10000);
        wqBackOfficeLoginPage.
                action_selectAuthentication(WindowsAuthOption);
        Thread.sleep(10000);
        wqamDashboardPage.
                step_Click_Assign_Users_Tile();
        wqamAssignUsersPage.
                action_Select_Company(userAssignRequestedCompany);
        Thread.sleep(5000);

        Assert.assertEquals(wqamAssignUsersPage.verify_Data_Equals(WQ_AM_ASSIGN_USERS_SELECTED_COMPANY_XPATH),userAssignRequestedCompany);
     }
    @Test
    public void verify_Able_To_Assign_DM_As_SU_Successfully()throws InterruptedException {
        String siteUrl = data.getValueByName("BackOfficeUrl");
        String AMUsername = data.getValueByName("AM_Username");
        String AMPassword = data.getValueByName("AM_Password");
        String WindowsAuthOption = data.getValueByName("SignInOption1");
        String assignUsersSuccessMsg = data.getValueByName("AMAssignUsersPage_UserAddedSuccessMsg");

        setSiteURL(siteUrl);

        wqBackOfficeLoginPage.
                action_Login_as_BOUser(AMUsername, AMPassword);
        Thread.sleep(10000);
        wqBackOfficeLoginPage.
                action_selectAuthentication(WindowsAuthOption);
        Thread.sleep(10000);
        wqamDashboardPage.
                step_Click_Assign_Users_Tile();
        wqamAssignUsersPage.
                action_Select_Company(userAssignRequestedCompany);
        Thread.sleep(5000);
        wqamAssignUsersPage.
                action_Add_New_SP_User(DMEmailByEmail,DMRoleByEmail).
                action_Click_Activate_Button();

        Assert.assertEquals(wqamAssignUsersPage.verify_Data_Equals(WQ_AM_ASSIGN_USERS_SUCCESS_ACTIVATE_MESSAGE_XPATH), assignUsersSuccessMsg + " " + DMEmailByEmail);
    }

    @Test
    public void verify_Unable_To_Activate_Users_By_Adding_Invalid_Email()throws InterruptedException {
        String siteUrl = data.getValueByName("BackOfficeUrl");
        String AMUsername = data.getValueByName("AM_Username");
        String AMPassword = data.getValueByName("AM_Password");
        String WindowsAuthOption = data.getValueByName("SignInOption1");
        String invalidEmailMsg = data.getValueByName("AMAssignUsersPage_InvalidEmailMsg");

        setSiteURL(siteUrl);

        wqBackOfficeLoginPage.
                action_Login_as_BOUser(AMUsername, AMPassword);
        Thread.sleep(10000);
        wqBackOfficeLoginPage.
                action_selectAuthentication(WindowsAuthOption);
        Thread.sleep(10000);
        wqamDashboardPage.
                step_Click_Assign_Users_Tile();
        wqamAssignUsersPage.
                action_Select_Company(userAssignRequestedCompany);
        Thread.sleep(5000);
        wqamAssignUsersPage.
                action_Add_New_SP_User("asdf1234",DMRoleByEmail).
                action_Click_Activate_Button();

       Assert.assertEquals(wqamAssignUsersPage.verify_Data_Equals(WQ_AM_ASSIGN_USERS_INVALID_EMAIL_MESSAGE_XPATH),invalidEmailMsg);
    }

    @Test
    public void verify_Unable_To_Activate_Users_Without_Adding_User_Details()throws InterruptedException {

        String siteUrl = data.getValueByName("BackOfficeUrl");
        String AMUsername = data.getValueByName("AM_Username");
        String AMPassword = data.getValueByName("AM_Password");
        String WindowsAuthOption = data.getValueByName("SignInOption1");

        setSiteURL(siteUrl);

        wqBackOfficeLoginPage.
                action_Login_as_BOUser(AMUsername, AMPassword);
        Thread.sleep(10000);
        wqBackOfficeLoginPage.
                action_selectAuthentication(WindowsAuthOption);
        Thread.sleep(10000);
        wqamDashboardPage.
                step_Click_Assign_Users_Tile();
        wqamAssignUsersPage.
                action_Select_Company(userAssignRequestedCompany);
        Thread.sleep(5000);
        wqamAssignUsersPage.
                action_Click_Activate_Button();

        Assert.assertEquals(wqamAssignUsersPage.verify_Data_Equals(WQ_AM_ASSIGN_USERS_EMAIL_REQUIRED_TEXT_XPATH), "*");
    }

    @Test
    public void verify_Unable_To_Add_Same_User_To_The_Same_Role()throws InterruptedException {

        String siteUrl = data.getValueByName("BackOfficeUrl");
        String AMUsername = data.getValueByName("AM_Username");
        String AMPassword = data.getValueByName("AM_Password");
        String WindowsAuthOption = data.getValueByName("SignInOption1");
        String userInSameGroupErrorMsg = data.getValueByName("AMAssignUsersPage_UserInSameGroupErrorMsg");

        setSiteURL(siteUrl);

        wqBackOfficeLoginPage.
                action_Login_as_BOUser(AMUsername, AMPassword);
        Thread.sleep(10000);
        wqBackOfficeLoginPage.
                action_selectAuthentication(WindowsAuthOption);
        Thread.sleep(10000);
        wqamDashboardPage.
                step_Click_Assign_Users_Tile();
        wqamAssignUsersPage.
                action_Select_Company(userAssignRequestedCompany);
        Thread.sleep(5000);
        wqamAssignUsersPage.
                action_Add_New_SP_User(DMEmailByEmail,DMRoleByEmail).
                action_Click_Activate_Button();

        Assert.assertEquals(wqamAssignUsersPage.verify_Data_Equals(WQ_AM_ASSIGN_USERS_EMAIL_USER_IN_SAME_GROUP_XPATH), userInSameGroupErrorMsg);
    }


    //Login to New Support User Email

    @Test
    public void  verify_User_Assigned_Email_In_Inbox() throws InterruptedException {
        String mailcatchURL = data.getValueByName("mailcatchURL");
        String FromWQEmail = data.getValueByName("WQEmail");
        String emailSubjectInbox = data.getValueByName("NewUserAssignedEmail_EmailSubjectInbox");

        wqCheckMailcatchEmailPage.
                check_Mailcatch_Email(mailcatchURL, DMEmailByEmail);

        Assert.assertEquals(wqCheckMailcatchEmailPage.verify_Element_Is_Available(WQ_CLIENT_INBOX_MAIL_SUBJECT_XPATH),true, "Email is available !");
        Assert.assertEquals(wqCheckMailcatchEmailPage.verify_Data_Equals(WQ_CLIENT_INBOX_MAIL_FROM_XPATH),FromWQEmail, "Inbox email from text verified !");
        Assert.assertEquals(wqCheckMailcatchEmailPage.verify_Data_Equals(WQ_CLIENT_INBOX_MAIL_SUBJECT_XPATH), emailSubjectInbox, "Inbox email subject verified !");
    }

    @Test
    public void verify_User_Assigned_Email_Content() throws InterruptedException {
        String mailcatchURL = data.getValueByName("mailcatchURL");
        String FromWQEmail = data.getValueByName("WQEmail");
        String emailSubject = data.getValueByName("NewUserAssignedEmail_EmailPageSubject");

        wqCheckMailcatchEmailPage.
                check_Mailcatch_Email(mailcatchURL, DMEmailByEmail).
                action_read_Latest_Received_Email_In_Mailcatch();
        Thread.sleep(10000);


        Assert.assertEquals(wqCheckMailcatchEmailPage.verify_Data_Equals(WQ_CLIENT_EMAIL_FROM_XPATH),FromWQEmail, "Email from text verified !");
        Assert.assertEquals(wqCheckMailcatchEmailPage.verify_Data_Equals(WQ_CLIENT_EMAIL_SUBJECT_XPATH),emailSubject, "Email subject verified !");

        wqCheckMailcatchEmailPage.
                step_switch_ToFrame();

        Assert.assertEquals(wqCheckMailcatchEmailPage.verify_Element_Is_Available(WQ_CLIENT_EMAIL_HEADER_IMAGE_XPATH),true, "Email header image is available !");
        Assert.assertEquals(wqCheckMailcatchEmailPage.verify_Data_Equals(WQ_CLIENT_EMAIL_HEADER_TITLE_XPATH),"You are now assigned as Support User in WebQuarters…", "Email heading text verified !");
        Assert.assertEquals(wqCheckMailcatchEmailPage.verify_Element_Is_Available(WQ_CLIENT_EMAIL_CONTENT_LINK_XPATH),true, "Verification link available !");
        Assert.assertEquals(wqCheckMailcatchEmailPage.verify_Data_Equals(WQ_CLIENT_EMAIL_CONTENT_LINK_XPATH),"link to log in", "Verified link text !");
    }

    // Dashboard
    @Test
    public void verify_DM_Assigned_As_A_SU_By_Clicking_Login_Link() throws Exception {
        String mailcatchURL = data.getValueByName("mailcatchURL");
        String signInPageBrowserTitle = data.getValueByName("SUSignInPage_BrowserTitle");
        String passwordSU = data.getValueByName("SU_Password");

        wqCheckMailcatchEmailPage.
                check_Mailcatch_Email(mailcatchURL, DMEmailByEmail).
                action_read_Latest_Received_Email_In_Mailcatch();
        Thread.sleep(10000);
        wqCheckMailcatchEmailPage.
                step_switch_ToFrame().
                action_Click_On_Link();

        Assert.assertEquals(wqLoginPage.check_Browser_Title_Of_The_Newly_Opend_Tab(),signInPageBrowserTitle);

        wqLoginPage.
                step_User_Enter_Given_Credentials(DMEmailByEmail,passwordSU).
                step_User_Click_Login_Button();
        wqdmDashboardPage.step_Click_Home_Button();
        Thread.sleep(5000);

        Assert.assertEquals(wqUserProfileUpdatePage.verify_Element_Is_Available(WQ_SUPPORT_DASHBOARD_LINK_XPATH),true, "Support Dashboard available !");
        Assert.assertEquals(wqUserProfileUpdatePage.verify_Element_Is_Enabled(WQ_SUPPORT_TILE_XPATH),true, "24x7 Support tile is enabled !");
        Assert.assertEquals(wqUserProfileUpdatePage.verify_Element_Is_Enabled(WQ_DM_DASHBOARD_TILE_XPATH),true, "DM dashboard tile is enabled !");

    }
}