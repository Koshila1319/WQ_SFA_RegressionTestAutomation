package com.totalamber.qa.WQTest;

import com.totalamber.qa.automation.TestBase;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;

import static com.totalamber.qa.data.UI.elements.webQuarters.wqCheckOutLookEmailPage.*;
import static com.totalamber.qa.data.UI.elements.webQuarters.wqDMDashboardPage.*;
import static com.totalamber.qa.data.UI.elements.webQuarters.wqManageUserRequestsPage.*;

/**
 * Created by e.koshila on 9/28/2017.
 */
public class WQReassignDMUserRequestTest extends TestBase {

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
        quitDriver();
    }

    //Request users (Change DM)
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
    public void verify_Clicking_Request_Change_Button_In_DM_Leads_To_User_Information_Popup() throws Exception {
        String requestUserPopupTitle = data.getValueByName("ManageUserRequestsPage_RequestUserPopupTile");

        NavigateToPage();
        wqdmDashboardPage.
                step_Click_Assign_Users_Tile();
        wqManageUserRequestsPage.
                action_Click_Request_Button(WQ_DM_REQUEST_CHANGE_BUTTON_XPATH);
        Thread.sleep(3000);
        Assert.assertEquals(wqManageUserRequestsPage.step_get_requests_user_popup_title(), requestUserPopupTitle);
    }

    @Test
    public void verify_User_Information_Popup_Element_Texts() throws Exception {
        NavigateToPage();
        wqdmDashboardPage.
                step_Click_Assign_Users_Tile();
        wqManageUserRequestsPage.
                action_Click_Request_Button(WQ_DM_REQUEST_CHANGE_BUTTON_XPATH);
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
                action_Click_Request_Button(WQ_DM_REQUEST_CHANGE_BUTTON_XPATH);
        Thread.sleep(5000);
        seleniumBase.swichToPopup(1);
        Assert.assertEquals(wqManageUserRequestsPage.verify_Element_Is_Enabled(WQ_CLIENT_CHANGE_POPUP_REQUEST_BUTTON_XPATH), true, "Request button Enabled !");
        Assert.assertEquals(wqManageUserRequestsPage.verify_Element_Is_Enabled(WQ_CLIENT_CHANGE_POPUP_CANCEL_BUTTON_XPATH), true, "Cancel button Enabled !");
    }

    @Test
    public void verify_Unable_To_Submit_Request_Without_Adding_Required_DM_Details() throws Exception {
        String emailRequiredMsg = data.getValueByName("ManageUserRequestsPage_RequestUserPopupError");
        Thread.sleep(5000);

        NavigateToPage();
        wqdmDashboardPage.
                step_Click_Assign_Users_Tile();
        wqManageUserRequestsPage.
                action_Click_Request_Button(WQ_DM_REQUEST_CHANGE_BUTTON_XPATH);
        Thread.sleep(5000);
        seleniumBase.swichToPopup(1);
        wqManageUserRequestsPage.
                action_Click_Request_Button_In_Popup();
        Thread.sleep(5000);

        Assert.assertEquals(wqManageUserRequestsPage.verify_Data_Equals(WQ_CLIENT_EMIL_REQUIRED_MSG_XPATH), emailRequiredMsg);
    }

    @Test
    public void verify_Able_To_Submit_Request_Successfully_By_Adding_DM_Details() throws Exception {
        String email = newDMEmail;
        String fname = data.getValueByName("NewDMFname");
        String lname = data.getValueByName("NewDMLname");
        String designation = data.getValueByName("NewDMDesignation");
        String emailSuccessMsg = data.getValueByName("ManageUserRequestsPage_RequestUserPopupSuccess");

        NavigateToPage();
        wqdmDashboardPage.
                step_Click_Assign_Users_Tile();
        wqManageUserRequestsPage.
                action_Click_Request_Button(WQ_DM_REQUEST_CHANGE_BUTTON_XPATH);
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
                action_Click_Request_Button(WQ_DM_REQUEST_CHANGE_BUTTON_XPATH);
        Thread.sleep(5000);
        seleniumBase.swichToPopup(1);
        wqManageUserRequestsPage.
                action_Click_Cancel_Button_In_Popup();
        Thread.sleep(2000);
       // Assert.assertEquals(wqManageUserRequestsPage.Is_Element_Not_Available(WQ_CLIENT_CHANGE_POPUP_TITLE_XPATH), true, "Popup closed !");
    }

    //Check Email
    @Test
    public void verify_AM_Loging_To_Email() throws InterruptedException, NoSuchElementException {
        String outlookURL = data.getValueByName("outlookURL");
        String BOUserEmail = data.getValueByName("AM_Email");
        String BOUserPassword = data.getValueByName("AM_Email_Password");

        wqCheckOutLookEmailPage.
                check_Outlook_Email(outlookURL, BOUserEmail, BOUserPassword);
    }

    @Test
    public void verify_User_Reassign_Request_Email_IsAvailable() throws InterruptedException {
       String outlookURL = data.getValueByName("outlookURL");
       String BOUserEmail = data.getValueByName("AM_Email");
       String BOUserPassword = data.getValueByName("AM_Email_Password");
       String userAssignRequestEmailInAM = data.getValueByName("CheckOutlookEmailPage_AMUserReassignRequestEmailSubjectInbox");

       wqCheckOutLookEmailPage.
                check_Outlook_Email(outlookURL, BOUserEmail, BOUserPassword);
       Thread.sleep(2000);
       Assert.assertEquals(wqCheckOutLookEmailPage.verify_Data_Equals(LATEST_RECEIVED_OUTLOOK_EMAIL_XPATH),userAssignRequestEmailInAM);
    }

    @Test
    public void verify_User_Reassign_Request_Email_Title() throws InterruptedException {
        String outlookURL = data.getValueByName("outlookURL");
        String BOUserEmail = data.getValueByName("AM_Email");
        String BOUserPassword = data.getValueByName("AM_Email_Password");
        String userAssignRequestEmailTitleInAM = data.getValueByName("CheckOutlookEmailPage_AMUserReassignRequestEmailTitle");

        wqCheckOutLookEmailPage.
                check_Outlook_Email(outlookURL, BOUserEmail, BOUserPassword);
        wqCheckOutLookEmailPage.
                action_read_Latest_Received_Email_In_OutLook();
        Thread.sleep(10000);
        Assert.assertEquals(wqCheckOutLookEmailPage.verify_Data_Equals(WQ_AM_REASSIGN_USER_REQUEST_EMAIL_TITLE_XPATH),userAssignRequestEmailTitleInAM);
    }

    @Test
    public void verify_User_Reassign_Request_Email_Current_User_Details() throws InterruptedException {
        String outlookURL = data.getValueByName("outlookURL");
        String BOUserEmail = data.getValueByName("AM_Email");
        String BOUserPassword = data.getValueByName("AM_Email_Password");
        String currentDmEmail = clientEmail;
        String currentDmFname = data.getValueByName("testFname");
        String currentDmLname = data.getValueByName("testLname");


        wqCheckOutLookEmailPage.
                check_Outlook_Email(outlookURL, BOUserEmail, BOUserPassword);
        wqCheckOutLookEmailPage.
                action_read_Latest_Received_Email_In_OutLook();
        Thread.sleep(10000);
        Assert.assertEquals(wqCheckOutLookEmailPage.verify_Data_Equals(WQ_AM_REASSIGN_USER_REQUEST_EMAIL_CURRENT_USER_EMAIL_XPATH),"Email : "+currentDmEmail, "Current user email verified !");
        Assert.assertEquals(wqCheckOutLookEmailPage.verify_Data_Equals(WQ_AM_REASSIGN_USER_REQUEST_EMAIL_CURRENT_USER_FNAME_XPATH),"First Name : "+currentDmFname, "Current user fname verified !");
        Assert.assertEquals(wqCheckOutLookEmailPage.verify_Data_Equals(WQ_AM_REASSIGN_USER_REQUEST_EMAIL_CURRENT_USER_LNAME_XPATH),"Last Name : "+currentDmLname, "Current user lnmae verified !");
    }

    @Test
    public void verify_User_Reassign_Request_Email_New_User_Details() throws InterruptedException {
        String outlookURL = data.getValueByName("outlookURL");
        String BOUserEmail = data.getValueByName("AM_Email");
        String BOUserPassword = data.getValueByName("AM_Email_Password");
        String newDmEmail = newDMEmail;
        String newDmFname = data.getValueByName("NewDMFname");
        String newDmLname = data.getValueByName("NewDMLname");
        String newDmDesignation = data.getValueByName("NewDMDesignation");

        wqCheckOutLookEmailPage.
                check_Outlook_Email(outlookURL, BOUserEmail, BOUserPassword);
        wqCheckOutLookEmailPage.
                action_read_Latest_Received_Email_In_OutLook();
        Thread.sleep(15000);

        newDmEmailByEmail = wqCheckOutLookEmailPage.step_Extract_User_Details(WQ_AM_REASSIGN_USER_REQUEST_EMAIL_NEW_USER_EMAIL_XPATH);

        Assert.assertEquals(newDmEmailByEmail, newDmEmail, "New user email verified !");
        Assert.assertEquals(wqCheckOutLookEmailPage.step_Extract_User_Details(WQ_AM_REASSIGN_USER_REQUEST_EMAIL_NEW_USER_FNAME_XPATH),newDmFname, "New user fname verified !");
        Assert.assertEquals(wqCheckOutLookEmailPage.step_Extract_User_Details(WQ_AM_REASSIGN_USER_REQUEST_EMAIL_NEW_USER_LNAME_XPATH),newDmLname, "New user lname verified !");
        Assert.assertEquals(wqCheckOutLookEmailPage.step_Extract_User_Details(WQ_AM_REASSIGN_USER_REQUEST_EMAIL_NEW_USER_DESIGNATION_XPATH),newDmDesignation, "New user designation verified !");
    }

    @Test
    public void verify_User_Reassign_Request_Email_Requested_Company() throws InterruptedException {
        String outlookURL = data.getValueByName("outlookURL");
        String BOUserEmail = data.getValueByName("AM_Email");
        String BOUserPassword = data.getValueByName("AM_Email_Password");
        String userRequestedCompany = data.getValueByName("Company_Name");

        wqCheckOutLookEmailPage.
                check_Outlook_Email(outlookURL, BOUserEmail, BOUserPassword);
        wqCheckOutLookEmailPage.
                action_read_Latest_Received_Email_In_OutLook();
        Thread.sleep(15000);
        Assert.assertEquals(wqCheckOutLookEmailPage.verify_Data_Equals(WQ_AM_REASSIGN_USER_REQUEST_EMAIL_REQUESTED_COMPAMY_XPATH), "DM from "+userRequestedCompany+" has requested to reassign the following user.", "User requested company verified !");
    }

    @Test
    public void verify_User_Reassign_Request_Email_Requested_User_Role() throws InterruptedException {
        String outlookURL = data.getValueByName("outlookURL");
        String BOUserEmail = data.getValueByName("AM_Email");
        String BOUserPassword = data.getValueByName("AM_Email_Password");

        wqCheckOutLookEmailPage.
                check_Outlook_Email(outlookURL, BOUserEmail, BOUserPassword);
        wqCheckOutLookEmailPage.
                action_read_Latest_Received_Email_In_OutLook();
        Thread.sleep(15000);
        Assert.assertEquals(wqCheckOutLookEmailPage.verify_Data_Equals(WQ_AM_REASSIGN_USER_REQUEST_EMAIL_REQUESTED_USER_ROLE_XPATH), "User Role: WQ Decision Maker", "Requested users role verified !");
    }


}