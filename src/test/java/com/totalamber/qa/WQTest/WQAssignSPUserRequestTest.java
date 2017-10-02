package com.totalamber.qa.WQTest;

import com.totalamber.qa.automation.TestBase;
import com.totalamber.qa.data.UI.elements.webQuarters.wqAMAssignUsersPage;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.totalamber.qa.data.UI.elements.webQuarters.wqAMAssignUsersPage.*;
import static com.totalamber.qa.data.UI.elements.webQuarters.wqCheckOutLookEmailPage.*;
import static com.totalamber.qa.data.UI.elements.webQuarters.wqDMDashboardPage.DM_DASHBOARD_ASSIGN_USERS_TILE_XPATH;
import static com.totalamber.qa.data.UI.elements.webQuarters.wqManageUserRequestsPage.*;

/**
 * Created by e.koshila on 10/2/2017.
 */
public class WQAssignSPUserRequestTest extends TestBase {

    @BeforeClass
    public void NavigateToPage() throws Exception {
        initDomainObjects(DRIVER);
        String siteUrl = data.getValueByName("url");
        setSiteURL(siteUrl);
        wqHomePage.action_Navigate_To_LoginPage();
        wqLoginPage.step_User_Enter_Given_Credentials(clientEmail,"asdf1234%");
        wqLoginPage.step_User_Click_Login_Button();
        wqdmDashboardPage.step_Click_Home_Button();
      }

    @AfterMethod
    public void endTestMethod() throws Throwable{
       // quitDriver();
    }

    //Request users (Add New SU)
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
                action_Click_Request_Button(WQ_DM_REQUEST_ASSIGN_BUTTON_1_XPATH);
        Thread.sleep(3000);
        Assert.assertEquals(wqManageUserRequestsPage.step_get_requests_user_popup_title(), requestUserPopupTitle);
    }

    @Test
    public void verify_User_Information_Popup_Element_Texts() throws Exception {
        NavigateToPage();
        wqdmDashboardPage.
                step_Click_Assign_Users_Tile();
        wqManageUserRequestsPage.
                action_Click_Request_Button(WQ_DM_REQUEST_ASSIGN_BUTTON_1_XPATH);
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
                action_Click_Request_Button(WQ_DM_REQUEST_ASSIGN_BUTTON_1_XPATH);
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
                action_Click_Request_Button(WQ_DM_REQUEST_ASSIGN_BUTTON_1_XPATH);
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
        String fname = data.getValueByName("SUFname");
        String lname = data.getValueByName("SULname");
        String designation = data.getValueByName("SUDesignation");
        String emailSuccessMsg = data.getValueByName("ManageUserRequestsPage_RequestUserPopupSuccess");

        NavigateToPage();
        wqdmDashboardPage.
                step_Click_Assign_Users_Tile();
        wqManageUserRequestsPage.
                action_Click_Request_Button(WQ_DM_REQUEST_ASSIGN_BUTTON_1_XPATH);
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
                action_Click_Request_Button(WQ_DM_REQUEST_ASSIGN_BUTTON_1_XPATH);
        Thread.sleep(5000);
        seleniumBase.swichToPopup(1);
        wqManageUserRequestsPage.
                action_Click_Cancel_Button_In_Popup();
        Thread.sleep(2000);
       // Assert.assertEquals(wqManageUserRequestsPage.Is_Element_Not_Available(WQ_CLIENT_CHANGE_POPUP_TITLE_XPATH), true, "Popup closed !");
    }

    //Check Email AM
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
    public void verify_User_Assign_Request_Email_New_User_Details() throws InterruptedException {
        String outlookURL = data.getValueByName("outlookURL");
        String BOUserEmail = data.getValueByName("AM_Email");
        String BOUserPassword = data.getValueByName("AM_Email_Password");
        String newSUEmail = SUEmail;
        String newSUFname = data.getValueByName("SUFname");
        String newSULname = data.getValueByName("SULname");
        String newSUDesignation = data.getValueByName("SUDesignation");

        wqCheckOutLookEmailPage.
                check_Outlook_Email(outlookURL, BOUserEmail, BOUserPassword);
        Thread.sleep(2000);
        wqCheckOutLookEmailPage.
                action_read_Latest_Received_Email_In_OutLook();
        Thread.sleep(15000);

        newSUEmailByEmail = wqCheckOutLookEmailPage.step_Extract_User_Details(WQ_AM_ASSIGN_USER_REQUEST_EMAIL_NEW_USER_EMAIL_XPATH);

        Assert.assertEquals(newSUEmailByEmail, newSUEmail, "New user email verified !");
        Assert.assertEquals(wqCheckOutLookEmailPage.step_Extract_User_Details(WQ_AM_ASSIGN_USER_REQUEST_EMAIL_NEW_USER_FNAME_XPATH),newSUFname, "New user fname verified !");
        Assert.assertEquals(wqCheckOutLookEmailPage.step_Extract_User_Details(WQ_AM_ASSIGN_USER_REQUEST_EMAIL_NEW_USER_LNAME_XPATH),newSULname, "New user lname verified !");
        Assert.assertEquals(wqCheckOutLookEmailPage.step_Extract_User_Details(WQ_AM_ASSIGN_USER_REQUEST_EMAIL_NEW_USER_DESIGNATION_XPATH),newSUDesignation, "New user designation verified !");
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

        newSURoleByEmail = wqCheckOutLookEmailPage.step_Extract_User_Details(WQ_AM_ASSIGN_USER_REQUEST_EMAIL_NEW_USER_ROLE_XPATH);

        Assert.assertEquals(wqCheckOutLookEmailPage.verify_Data_Equals(WQ_AM_ASSIGN_USER_REQUEST_EMAIL_NEW_USER_ROLE_XPATH), "User Role : Support User", "Requested users role verified !");
    }

    //Assign SU by AM

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
    public void verify_Able_To_Assign_SU_Successfully()throws InterruptedException {
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
                action_Add_New_SP_User(newSUEmailByEmail,newSURoleByEmail).
                action_Click_Activate_Button();

        Assert.assertEquals(wqamAssignUsersPage.verify_Data_Equals(WQ_AM_ASSIGN_USERS_SUCCESS_ACTIVATE_MESSAGE_XPATH), assignUsersSuccessMsg + " " + newSUEmailByEmail);
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
                action_Add_New_SP_User("asdf1234",newSURoleByEmail).
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
                action_Add_New_SP_User(newSUEmailByEmail,newSURoleByEmail).
                action_Click_Activate_Button();

        Assert.assertEquals(wqamAssignUsersPage.verify_Data_Equals(WQ_AM_ASSIGN_USERS_EMAIL_USER_IN_SAME_GROUP_XPATH), userInSameGroupErrorMsg);
    }
}