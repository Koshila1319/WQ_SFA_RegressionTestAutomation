package com.totalamber.qa.WQTest;

import com.totalamber.qa.automation.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;

import static com.totalamber.qa.data.UI.elements.webQuarters.wqClientRegCompletePage.*;

/**
 * Created by e.koshila on 09/26/2017.
 */
public class WQSMDashboardTest extends TestBase {

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
    public void verify_The_Page_Browser_Title(){
        String homePageBrowserTitle = data.getValueByName("SM_HomePage");
        Assert.assertEquals(wqSMDashboardPage.check_Browser_Title(), homePageBrowserTitle);
    }

    @Test
    public void verify_Created_Company_Name_Available_In_The_Pending_Clients_Section(){
        String companyName = data.getValueByName("Company_Name");
        Assert.assertEquals(wqSMDashboardPage.check_Company_Is_Available(companyName), true);
    }

    @Test
    public void verify_Clients_Tile_Text(){
        String companyName = data.getValueByName("Company_Name");
        Assert.assertEquals(wqSMDashboardPage.verify_Data_Equals(companyName), true);
    }

    @Test
    public void verify_Clients_Title_Leads_To_WebQuarters_Clients_List_Page(){
        String companyName = data.getValueByName("Company_Name");
        Assert.assertEquals(wqSMDashboardPage.verify_Data_Equals(companyName), true);
    }

}
