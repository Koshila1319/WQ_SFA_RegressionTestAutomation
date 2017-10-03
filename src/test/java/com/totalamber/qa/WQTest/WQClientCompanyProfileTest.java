package com.totalamber.qa.WQTest;

import com.totalamber.qa.automation.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by s.wathsala on 10/3/2017.
 */
public class WQClientCompanyProfileTest extends TestBase {

    @BeforeMethod
    public void NavigateToPage() throws InterruptedException, IOException {
        initDomainObjects(DRIVER);
        String siteUrl = data.getValueByName("url");
        setSiteURL(siteUrl);

    }

    @AfterMethod
    public void endTestMethod() throws Throwable{
        //quitDriver();
    }

    @Test
    public void verify_The_Compnay_Profile_Link_Leads_To_Company_Profile_Page()    throws Exception {
        String Uname = data.getValueByName("VALIDUNAME");
        String Password = data.getValueByName("VALIDPASSWORD");
        wqHomePage.
                action_Navigate_To_LoginPage();
        wqLoginPage.
                step_User_Enter_Given_Credentials(Uname,Password).
                step_User_Click_Login_Button();
        wqClientCompanyProfilePage.
                action_Navigate_To_HomePage().
                action_Navigate_To_Company_Profile_Page();
    }

    @Test
    public void verify_The_Page_Mandatory_Information() throws Exception {
        String Uname = data.getValueByName("VALIDUNAME");
        String Password = data.getValueByName("VALIDPASSWORD");
        String Company_Name=data.getValueByName("CompanyDetails_CompanyName");
        String Company_Address=data.getValueByName("CompanyDetails_Address");
        String City=data.getValueByName("CompanyDetails_City");
        String Country= String.valueOf(wqClientRegPage.select_Country());
        String PhoneNo=data.getValueByName("ClientDetails_Dial");
        String Billing_Name=data.getValueByName("CompanyDetails_CompanyName");
        String Phone_Number=data.getValueByName("ClientDetails_Dial");
        String Organization_Size= String.valueOf(wqClientRegPage.select_Organization_Size());
        String SW_App= String.valueOf(wqClientRegPage.select_SW_Application());
        String Module= String.valueOf(wqClientRegPage.select_CheckBox_In_Modules());
        String Version=String.valueOf(wqClientRegPage.select_CheckBox_In_Versions());


        wqHomePage.
                action_Navigate_To_LoginPage();
        wqLoginPage.
                step_User_Enter_Given_Credentials(Uname,Password).
                step_User_Click_Login_Button();
        wqClientCompanyProfilePage.
                action_Navigate_To_HomePage().
                action_Navigate_To_Company_Profile_Page();
        Assert.assertEquals(wqClientCompanyProfilePage.check_Company_Name(),Company_Name);
        Assert.assertEquals(wqClientCompanyProfilePage.check_Company_Address(),Company_Address);
        Assert.assertEquals(wqClientCompanyProfilePage.check_City(),City);
        Assert.assertEquals(wqClientCompanyProfilePage.check_Country(),Country);
        Assert.assertEquals(wqClientCompanyProfilePage.check_PhoneNo(),PhoneNo);
        Assert.assertEquals(wqClientCompanyProfilePage.check_Billing_Name(),Billing_Name);
        Assert.assertEquals(wqClientCompanyProfilePage.check_Phone_Number(),Phone_Number);
        Assert.assertEquals(wqClientCompanyProfilePage.check_Organization_Size(),Organization_Size);
        Assert.assertEquals(wqClientCompanyProfilePage.check_SW_App(),SW_App);
        Assert.assertEquals(wqClientCompanyProfilePage.check_Module(),Module);
        Assert.assertEquals(wqClientCompanyProfilePage.check_Version(),Version);


    }


}
