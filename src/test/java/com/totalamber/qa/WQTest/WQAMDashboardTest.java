package com.totalamber.qa.WQTest;

import com.totalamber.qa.automation.SeleniumBase;
import com.totalamber.qa.automation.TestBase;
import com.totalamber.qa.page.webQuarters.WQAMDashboardPage;
import com.totalamber.qa.page.webQuarters.WQBackOfficeLoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by t.piyananda on 15/09/2017.
 */
public class WQAMDashboardTest extends TestBase {

    @BeforeClass
    public void NavigateToPage() throws InterruptedException, IOException {
        initDomainObjects(DRIVER);
        String siteUrl = data.getValueByName("backOfficeUrl");
        setSiteURL(siteUrl);
    }

    @AfterClass
    public void endTestMethod() throws Throwable{
        //quitDriver();
    }

    @Test
    public void verify_PendingClientsTable_Available() throws InterruptedException {
        String AMUsername = data.getValueByName("AM_Username");
        String AMPassword = data.getValueByName("AM_Password");
        String WindowsAuthOption = data.getValueByName("SignInOption1");
        wqBackOfficeLoginPage.action_Login_as_BOUser(AMUsername, AMPassword);
        Thread.sleep(10000);
        wqBackOfficeLoginPage.action_selectAuthentication(WindowsAuthOption);
        Thread.sleep(10000);
        Assert.assertNotNull(wqamDashboardPage.check_Pending_Client_Table_Available());
    }

    @Test
    public void verify_The_Home_Page_Browser_Title(){
        String aMDashboardBrowserTitle = data.getValueByName("AM_HomePage");
        Assert.assertEquals(wqamDashboardPage.validate_user_goesTo_Page(),aMDashboardBrowserTitle);
    }

    @Test
    public void verify_HomeLink_IsHighlighted(){
        Assert.assertNotNull(wqPanel.validate_Homelink_is_highlighted());
    }

    @Test
    public void verify_SignedInAs_Name_Available(){
        String signedInAs = data.getValueByName("AM_signedInAs");
        Assert.assertEquals(wqPanel.validate_signIn_As(),signedInAs);
    }

    @Test
    public void verify_SignOut_Link_Available(){
        Assert.assertNotNull(wqPanel.check_Signout_link_Is_Available());
    }

    @Test
    public void verify_FooterArea_Text_Available(){
        String footerText = data.getValueByName("FooterAreaText");
        Assert.assertEquals(wqPanel.check_FooterArea_Text_Avaialble(),footerText);
    }

    //Tile Area --Start--//

    @Test
    public void verify_ClientsTile_Available(){
        Assert.assertNotNull(wqamDashboardPage.check_ClientsTile_Is_Available());
    }

    @Test
    public void verify_ClientsTile_TileText_Available(){
        String clientTile = data.getValueByName("clientsTileText");
        Assert.assertEquals(wqamDashboardPage.validate_Clients_Tile_Text(),clientTile);
    }

    @Test
    public void verify_ClientsTile_Click_GoesTo_AssignedClientsPage(){
        wqamDashboardPage.step_Click_Client_Tile();
        String clientTilePage = data.getValueByName("clientTilePage");
        Assert.assertEquals(wqamDashboardPage.validate_user_goesTo_Page(),clientTilePage);
        wqPanel.check_User_goes_To_HomePage();
        verify_The_Home_Page_Browser_Title();
    }

    @Test
    public void verify_SuspiciousConnections_Tile_Available(){
        Assert.assertNotNull(wqamDashboardPage.check_SuspiciousConnections_Tile_Is_Available());
    }

    @Test
    public void verify_SuspiciousConnections_Tile_TileText_Available(){
        String SuspiciousConnectionsTile = data.getValueByName("suspiciousTileText");
        Assert.assertEquals(wqamDashboardPage.validate_SuspiciousConnections_Tile_Text(),SuspiciousConnectionsTile);
    }

    @Test
    public void verify_SuspiciousConnections_Tile_Click_GoesTo_ConnectionSuspicious_Page(){
        wqamDashboardPage.step_Click_SuspiciousConnections_Tile();
        String suspiciousTilePage = data.getValueByName("suspiciousTilePage");
        Assert.assertEquals(wqamDashboardPage.validate_user_goesTo_Page(),suspiciousTilePage);
        wqPanel.check_User_goes_To_HomePage();
        verify_The_Home_Page_Browser_Title();
    }

    @Test
    public void verify_Contractor_Matching_Tile_Available(){
        Assert.assertNotNull(wqamDashboardPage.check_Contractor_Matching_Tile_Is_Available());
    }

    @Test
    public void verify_Contractor_Matching_Tile_TileText_Available(){
        String contractor_MatchingTile = data.getValueByName("contractorMatchTileText");
        Assert.assertEquals(wqamDashboardPage.validate_Contractor_Matching_Tile_Text(),contractor_MatchingTile);
    }

    @Test
    public void verify_Contractor_Matching_Tile_Click_GoesTo_ConsultantSearch_Page(){
        wqamDashboardPage.step_Click_Contractor_Matching_Tile();
        String contractorMatchTilePage = data.getValueByName("contractorMatchTilePage");
        Assert.assertEquals(wqamDashboardPage.validate_user_goesTo_Page(),contractorMatchTilePage);
        wqPanel.check_User_goes_To_HomePage();
        verify_The_Home_Page_Browser_Title();
    }

    @Test
    public void verify_Reports_Tile_Available(){
        Assert.assertNotNull(wqamDashboardPage.check_Reports_Tile_Is_Available());
    }

    @Test
    public void verify_Reports_Tile_TileText_Available(){
        String reportsTileText = data.getValueByName("reportsTileText");
        Assert.assertEquals(wqamDashboardPage.validate_Reports_Tile_Text(),reportsTileText);
    }

    @Test
    public void verify_Reports_Tile_Click_GoesTo_ViewReports_Page(){
        wqamDashboardPage.step_Click_Reports_Tile();
        String reportsTilePage = data.getValueByName("reportsTilePage");
        Assert.assertEquals(wqamDashboardPage.validate_user_goesTo_Page(),reportsTilePage);
        wqPanel.check_User_goes_To_HomePage();
        verify_The_Home_Page_Browser_Title();
    }

    @Test
    public void verify_Assign_Users_Tile_Available(){
        Assert.assertNotNull(wqamDashboardPage.check_Assign_Users_Tile_Is_Available());
    }

    @Test
    public void verify_Assign_Users_Tile_TileText_Available(){
        String assignUsersTileText = data.getValueByName("assignUsersTileText");
        Assert.assertEquals(wqamDashboardPage.validate_Assign_Users_Tile_Text(),assignUsersTileText);
    }

    @Test
    public void verify_Assign_Users_Tile_Click_GoesTo_Assign_Users_Page(){
        wqamDashboardPage.step_Click_Assign_Users_Tile();
        String assignUsersTilePage = data.getValueByName("assignUsersTilePage");
        Assert.assertEquals(wqamDashboardPage.validate_user_goesTo_Page(),assignUsersTilePage);
        wqPanel.check_User_goes_To_HomePage();
        verify_The_Home_Page_Browser_Title();
    }

    @Test
    public void verify_Partners_Tile_Available(){
        Assert.assertNotNull(wqamDashboardPage.check_Partners_Tile_Is_Available());
    }

    @Test
    public void verify_Partners_Tile_TileText_Available(){
        String partnersTileText = data.getValueByName("partnersTileText");
        Assert.assertEquals(wqamDashboardPage.validate_Partners_Tile_Text(),partnersTileText);
    }

    @Test
    public void verify_Partners_Tile_Click_GoesTo_Partners_Page(){
        wqamDashboardPage.step_Click_Partners_Tile();
        String partnersTilePage = data.getValueByName("partnersTilePage");
        Assert.assertEquals(wqamDashboardPage.validate_user_goesTo_Page(),partnersTilePage);
        wqPanel.check_User_goes_To_HomePage();
        verify_The_Home_Page_Browser_Title();
    }

    @Test
    public void verify_Contact_Client_Tile_Available(){
        Assert.assertNotNull(wqamDashboardPage.check_Contact_Client_Tile_Is_Available());
    }

    @Test
    public void verify_Contact_Client_Tile_TileText_Available(){
        String contactClientTileText = data.getValueByName("contactClientTileText");
        Assert.assertEquals(wqamDashboardPage.validate_Contact_Client_Tile_Text(),contactClientTileText);
    }

    @Test
    public void verify_Contact_Client_Tile_Click_GoesTo_Contact_Client_Page(){
        wqamDashboardPage.step_Click_Contact_Client_Tile();
        String contactClientTilePage = data.getValueByName("contactClientTilePage");
        Assert.assertEquals(wqamDashboardPage.validate_user_goesTo_Page(),contactClientTilePage);
        wqPanel.check_User_goes_To_HomePage();
        verify_The_Home_Page_Browser_Title();
    }
    //Tile Area finished

    @Test
    public void verify_EnterCompanyName_Label_Available(){
        Assert.assertNotNull(wqamDashboardPage.check_EnterCompanyName_Label_Is_Available());
    }

    @Test
    public void verify_EnterCompanyName_Label_Text_Available(){
        String enterCompanyName = data.getValueByName("EnterCompanyNameLabel");
        Assert.assertEquals(wqamDashboardPage.check_EnterCompanyName_Label_Text(),enterCompanyName);
    }

    @Test
    public void verify_EnterCompanyName_TextBox_Available(){
        Assert.assertNotNull(wqamDashboardPage.check_EnterCompanyName_TextBox_Available());
    }

    @Test
    public void verify_EnteringCharacters_To_EnterCompanyName_TextBox(){
        String textToEnter = data.getValueByName("textToEnter");
        wqamDashboardPage.validate_Characters_Can_Enter(textToEnter);
    }

    @Test
    public void verify_Go_Button_Available(){
        Assert.assertNotNull(wqamDashboardPage.check_Go_Button_Is_Available());
    }

    @Test
    public void verify_Go_Button_Text_Available(){
        String goButtonText = data.getValueByName("goButton");
        Assert.assertEquals(wqamDashboardPage.check_GoButton_Text(), goButtonText);
    }

    @Test
    public void verify_Go_ButtonClick_WithoutAny_CompanyName_gives_ErrorMessage(){
        wqamDashboardPage.check_EnterCompanyName_TextBox_isEmpty();
        String errorMessage_WO_AnyValue = data.getValueByName("errorMessage_WO_AnyValue");
        wqamDashboardPage.step_click_Go_Button();
        Assert.assertEquals(wqamDashboardPage.check_Error_Message(), errorMessage_WO_AnyValue);
    }

    @Test
    public void verify_Go_ButtonClick_With_Invalid_CompanyName_gives_ErrorMessage(){
        wqamDashboardPage.check_EnterCompanyName_TextBox_isEmpty();
        String errorMessage_InvalidCompanyName = data.getValueByName("errorMessage_InvalidCompanyName");
        String textToEnter = data.getValueByName("textToEnter");
        wqamDashboardPage.validate_Characters_Can_Enter(textToEnter);
        wqamDashboardPage.step_click_Go_Button();
        Assert.assertEquals(wqamDashboardPage.check_Error_Message(), errorMessage_InvalidCompanyName);
    }

    @Test
    public void verify_Go_ButtonClick_With_Valid_CompanyName_gives_ListOf_Companies(){
        wqamDashboardPage.check_EnterCompanyName_TextBox_isEmpty();
        String ClientName = data.getValueByName("ClientName");
        wqamDashboardPage.validate_Characters_Can_Enter(ClientName);
        wqamDashboardPage.step_click_Go_Button();
        Assert.assertNotNull(wqamDashboardPage.validate_Client_List_IsAvailable());
    }



    @Test
    public void verify_Client_Available_to_Click_and_Navigate(){
        String clientName = data.getValueByName("CompanyDetails_CompanyName");
        wqamDashboardPage.step_user_clicks_Client(clientName);
        String expectedTitle = data.getValueByName("BOVerifyPage");
        Assert.assertEquals(wqamDashboardPage.validate_user_goesTo_Page(), expectedTitle);
    }

    @Test
    public void verify_CompanyDetails_In_VerifyPage(){
        String companyName = data.getValueByName("CompanyDetails_CompanyName");
        String busRegNumber = data.getValueByName("CompanyDetails_BusRegNumber");
        String address = data.getValueByName("CompanyDetails_Address");
        String city = data.getValueByName("CompanyDetails_City");
        String state = data.getValueByName("CompanyDetails_State");
        String postalCode = data.getValueByName("CompanyDetails_PostalCode");
        String country = data.getValueByName("CompanyDetails_Country");
        String phone = data.getValueByName("CompanyDetails_Phone");
        String fax = data.getValueByName("CompanyDetails_Fax");

        Assert.assertEquals(wqamVerifyClientPage.check_CompanyDetails_CompanyName_Data(),companyName);
        Assert.assertEquals(wqamVerifyClientPage.check_BusRegNo_Company_Data(),busRegNumber);
        Assert.assertEquals(wqamVerifyClientPage.check_Address_Company_Data(),address);
        Assert.assertEquals(wqamVerifyClientPage.check_City_Company_Data(),city);
        Assert.assertEquals(wqamVerifyClientPage.check_State_Company_Data(),state);
        Assert.assertEquals(wqamVerifyClientPage.check_PostalCode_Company_Data(),postalCode);
        Assert.assertEquals(wqamVerifyClientPage.check_Country_Company_Data(),country);
        Assert.assertEquals(wqamVerifyClientPage.check_Phone_Company_Data(),phone);
        Assert.assertEquals(wqamVerifyClientPage.check_Fax_Company_Data(),fax);

    }

    @Test
    public void verify_ClientDetails_In_VerifyPage(){
        String clientName = data.getValueByName("ClientDetails_ClientName");
        String dirDial = data.getValueByName("ClientDetails_Dial");
        String eMail = data.getValueByName("ClientDetails_Email");
        String designation = data.getValueByName("ClientDetails_Designation");

        Assert.assertEquals(wqamVerifyClientPage.check_ClientName_Client_Data(),clientName);
        Assert.assertEquals(wqamVerifyClientPage.check_DirectDial_Client_Data(),dirDial);
        Assert.assertEquals(wqamVerifyClientPage.check_Email_Client_Data(),eMail);
        Assert.assertEquals(wqamVerifyClientPage.check_Designation_Client_Data(),designation);

    }

    @Test
    public void verify_SoftwareExperience_In_VerifyPage(){
        String applicationName = data.getValueByName("Software_Application");
        String versionName = data.getValueByName("Software_Version");
        String moduleName = data.getValueByName("Software_Module");

        Assert.assertEquals(wqamVerifyClientPage.check_ApplicationName_Client_Data(),applicationName);
        Assert.assertEquals(wqamVerifyClientPage.check_VersionName_Client_Data(),versionName);
        Assert.assertEquals(wqamVerifyClientPage.check_ModuleName_Client_Data(),moduleName);

    }

    @Test
    public void verify_VerifyButton_Available_In_VerifyPage(){
        Assert.assertNotNull(wqamVerifyClientPage.check_VerifyButton_Available());

    }

    @Test
    public void verify_VerifyButton_Text_Available_In_VerifyButton_In_VerifyPage(){
        String verifyButtonText = data.getValueByName("verifyPage_verifyButton");
        Assert.assertEquals(wqamVerifyClientPage.check_VerifyButton_Text(), verifyButtonText);

    }

    @Test
    public void verify_RejectButton_Available_InVerifyPage(){
        Assert.assertNotNull(wqamVerifyClientPage.check_RejectButton_Available());

    }

    @Test
    public void verify_RejectButton_Text_Available_In_RejectButton_In_VerifyPage(){
        String rejectButtonText = data.getValueByName("verifyPage_rejectButton");
        Assert.assertEquals(wqamVerifyClientPage.check_RejectButton_Text(), rejectButtonText);

    }



    @Test
    public void verify_Click_RejectButton_InVerifyPage_gives_Popup() throws InterruptedException {
        wqPanel.check_User_goes_To_HomePage();
        verify_The_Home_Page_Browser_Title();
        String clientName = data.getValueByName("CompanyDetails_CompanyName");
        wqamDashboardPage.step_user_clicks_Client(clientName);
        wqamVerifyClientPage.step_click_RejectButton();
        Thread.sleep(10000);
        Assert.assertNotNull(wqamVerifyClientPage.validate_user_gets_aPopup());
    }

    @Test
    public void verify_Title_Available_In_RejectPopUp() throws InterruptedException {
        String rejectPopupTitle = data.getValueByName("rejectPopup_Title");
        Assert.assertEquals(wqamVerifyClientPage.validate_RejectPopup_Title(),rejectPopupTitle);
    }

    @Test
    public void verify_CommentBox_Available_InRejectPopUp() throws InterruptedException {
        Assert.assertNotNull(wqamVerifyClientPage.check_RejectPopup_CommentBox());
    }

    @Test
    public void verify_CommentBox_PlaceHolder_Available_InRejectPopUp() throws InterruptedException {
        String rejectPlaceHolderTextArea = data.getValueByName("rejectPopup_rejectTextArea_Placeholder");
        Assert.assertEquals(wqamVerifyClientPage.check_RejectPopup_CommentBox_Placeholder(),rejectPlaceHolderTextArea);
    }

    @Test
    public void verify_Entering_Text_To_CommentBox_InRejectPopUp(){
        String textToEnter = data.getValueByName("textToEnter");
        wqamVerifyClientPage.validate_Characters_Can_Enter(textToEnter);
    }

    @Test
    public void verify_RejectButton_Available_InRejectPopUp(){
        Assert.assertNotNull(wqamVerifyClientPage.check_Rejectbutton_Available_inRejectPopup());
    }

    @Test
    public void verify_CancelButton_Available_InRejectPopUp(){
        Assert.assertNotNull(wqamVerifyClientPage.check_Cancelbutton_Available_inRejectPopup());
    }

    @Test
    public void verify_CloseCross_Available_InRejectPopUp(){
        Assert.assertNotNull(wqamVerifyClientPage.check_closeCross_Available_inRejectPopup());
    }

    @Test
    public void verify_ClickReject_Button_Without_Reason_InRejectPopup_Gives_Error_Message(){
        wqamVerifyClientPage.clear_Rejectreason_TextArea();
        String rejectPopup_NullValue_ErrorMessage = data.getValueByName("rejectPopup_NullValue_ErrorMessage");
        wqamVerifyClientPage.step_click_Reject_Button();
        Assert.assertEquals(wqamVerifyClientPage.check_Error_Message(), rejectPopup_NullValue_ErrorMessage);
        wqamVerifyClientPage.step_click_Cancel_Button();

    }



    @Test
    public void verify_ClickCancel_Button_InRejectPopup_withText_Goes_To_VerifyPage() throws InterruptedException {

        wqPanel.check_User_goes_To_HomePage();
        verify_The_Home_Page_Browser_Title();
        String clientName = data.getValueByName("CompanyDetails_CompanyName");
        wqamDashboardPage.step_user_clicks_Client(clientName);
        wqamVerifyClientPage.step_click_RejectButton();
        Thread.sleep(10000);
        wqamVerifyClientPage.validate_user_gets_aPopup();
        String textToEnter = data.getValueByName("textToEnter");
        Thread.sleep(10000);
        wqamVerifyClientPage.validate_Characters_Can_Enter(textToEnter);
        wqamVerifyClientPage.step_click_Cancel_Button();
        String aMVerifyPageBrowserTitle = data.getValueByName("BOVerifyPage");
        Assert.assertEquals(wqamDashboardPage.validate_user_goesTo_Page(),aMVerifyPageBrowserTitle);

    }

    @Test
    public void verify_ClickCancel_Button_InRejectPopup_withoutText_Goes_To_VerifyPage() throws InterruptedException {
        wqPanel.check_User_goes_To_HomePage();
        verify_The_Home_Page_Browser_Title();
        String clientName = data.getValueByName("CompanyDetails_CompanyName");
        wqamDashboardPage.step_user_clicks_Client(clientName);
        wqamVerifyClientPage.step_click_RejectButton();
        Thread.sleep(10000);
        wqamVerifyClientPage.validate_user_gets_aPopup();
        Thread.sleep(10000);
        wqamVerifyClientPage.clear_Rejectreason_TextArea();
        wqamVerifyClientPage.step_click_Cancel_Button();
        Thread.sleep(10000);
        String aMVerifyPageBrowserTitle = data.getValueByName("BOVerifyPage");
        Assert.assertEquals(wqamDashboardPage.validate_user_goesTo_Page(),aMVerifyPageBrowserTitle);

    }

    @Test
    public void verify_SearchValidCompany_ClickCompany_FromList_goesTo_ClientProfilePage(){

    }

    @Test
    public void verify_Click_Close_Button_InRejectPopup_Goes_To_VerifyPage(){

    }

    @Test
    public void Verify_ClickReject_Button_With_Reason_InRejectPopup_GoesTo_AMDashboard(){

    }

    @Test
    public void verify_Click_VerifyButton_InVerifyPage_goesTo_AMDashboard() throws InterruptedException {
        /*wqPanel.check_User_goes_To_HomePage();
        verify_The_Home_Page_Browser_Title();
        String clientName = data.getValueByName("CompanyDetails_CompanyName");
        wqamDashboardPage.step_user_clicks_Client(clientName);
        wqamVerifyClientPage.step_click_VerifyButton();
        String expectedTitle = data.getValueByName("AM_HomePage");
        Thread.sleep(20000);
        Assert.assertEquals(wqamDashboardPage.validate_user_goesTo_Page(),expectedTitle);*/
    }

    @Test
    public void verify_Client_In_PendingClients_List_IsAvailable(){
       /* String clientName = data.getValueByName("CompanyDetails_CompanyName");
        Assert.assertNotNull(wqamDashboardPage.check_Client_In_Table_Available(clientName));*/
    }
}