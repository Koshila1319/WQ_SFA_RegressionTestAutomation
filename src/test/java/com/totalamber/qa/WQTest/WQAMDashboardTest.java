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
        wqBackOfficeLoginPage.
                action_Login_as_BOUser(AMUsername, AMPassword);
        Thread.sleep(10000);
        wqBackOfficeLoginPage.
                action_selectAuthentication(WindowsAuthOption);
        Thread.sleep(10000);
        Assert.assertNotNull(wqamDashboardPage.check_Pending_Client_Table_Available());
    }

    @Test
    public void verify_Client_In_PendingClients_List_IsAvailable(){
        String clientName = data.getValueByName("CompanyDetails_CompanyName");
        Assert.assertEquals(wqamDashboardPage.check_Client_In_Table_Available(clientName),clientName);
    }

    @Test
    public void verify_ClickAClient_NavigateTo_VerifyPage() throws InterruptedException {
        String clientName = data.getValueByName("CompanyDetails_CompanyName");
        wqamDashboardPage.step_user_clicks_Client(clientName);
        String expectedTitle = data.getValueByName("BOVerifyPage");
        Thread.sleep(5000);
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

        Assert.assertEquals(wqamDashboardPage.check_CompanyDetails_CompanyName_Data(),companyName);
        Assert.assertEquals(wqamDashboardPage.check_BusRegNo_Company_Data(),busRegNumber);
        Assert.assertEquals(wqamDashboardPage.check_Address_Company_Data(),address);
        Assert.assertEquals(wqamDashboardPage.check_City_Company_Data(),city);
        Assert.assertEquals(wqamDashboardPage.check_State_Company_Data(),state);
        Assert.assertEquals(wqamDashboardPage.check_PostalCode_Company_Data(),postalCode);
        Assert.assertEquals(wqamDashboardPage.check_Country_Company_Data(),country);
        Assert.assertEquals(wqamDashboardPage.check_Phone_Company_Data(),phone);
        Assert.assertEquals(wqamDashboardPage.check_Fax_Company_Data(),fax);

    }

    @Test
    public void verify_ClientDetails_In_VerifyPage(){
        String clientName = data.getValueByName("ClientDetails_ClientName");
        String dirDial = data.getValueByName("ClientDetails_Dial");
        String eMail = data.getValueByName("ClientDetails_Email");
        String designation = data.getValueByName("ClientDetails_Designation");

        Assert.assertEquals(wqamDashboardPage.check_ClientName_Client_Data(),clientName);
        Assert.assertEquals(wqamDashboardPage.check_DirectDial_Client_Data(),dirDial);
        Assert.assertEquals(wqamDashboardPage.check_Email_Client_Data(),eMail);
        Assert.assertEquals(wqamDashboardPage.check_Designation_Client_Data(),designation);

    }

    @Test
    public void verify_SoftwareExperience_In_VerifyPage(){
        String applicationName = data.getValueByName("Software_Application");
        String versionName = data.getValueByName("Software_Version");
        String moduleName = data.getValueByName("Software_Module");

        Assert.assertEquals(wqamDashboardPage.check_ApplicationName_Client_Data(),applicationName);
        Assert.assertEquals(wqamDashboardPage.check_VersionName_Client_Data(),versionName);
        Assert.assertEquals(wqamDashboardPage.check_ModuleName_Client_Data(),moduleName);

    }

    @Test
    public void verify_VerifyButton_Available_In_VerifyPage(){
        Assert.assertNotNull(wqamDashboardPage.check_VerifyButton_Available());

    }

    @Test
    public void verify_VerifyButton_Text_Available_In_VerifyButton_In_VerifyPage(){
        String verifyButtonText = data.getValueByName("verifyButton");
        Assert.assertEquals(wqamDashboardPage.check_VerifyButton_Text(), verifyButtonText);

    }

    @Test
    public void verify_RejectButton_Available_InVerifyPage(){
        Assert.assertNotNull(wqamDashboardPage.check_RejectButton_Available());

    }

    @Test
    public void verify_RejectButton_Text_Available_In_RejectButton_In_VerifyPage(){
        String rejectButtonText = data.getValueByName("rejectButton");
        Assert.assertEquals(wqamDashboardPage.check_RejectButton_Text(), rejectButtonText);

    }

    @Test
    public void verify_Click_VerifyButton_InVerifyPage_goesTo_AMDashboard() throws InterruptedException {
        String expectedTitle = data.getValueByName("AM_HomePage");
        wqamDashboardPage.step_Click_VerifyButton();
        Thread.sleep(10000);
         Assert.assertEquals(wqamDashboardPage.validate_user_goesTo_Page(),expectedTitle);
    }

}
