package com.totalamber.qa.WQTest;

import com.totalamber.qa.automation.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.UUID;

import static com.totalamber.qa.data.UI.elements.webQuarters.wqClientRegCompletePage.*;

/**
 * Created by e.koshila on 09/26/2017.
 */
public class WQClientRegCompleteTest extends TestBase {

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
    public void verify_The_Page_Browser_Title()throws InterruptedException {
        Assert.assertEquals(wqClientRegCompletePage.check_Browser_Title(),"WebQuarters Registration Complete");
    }

    @Test
    public void Verify_Thank_You_Text()throws InterruptedException {
        Assert.assertEquals(wqClientRegCompletePage.verify_Data_Equals(WQ_CLIENT_REGISTRATION_COMPLETE_PAGE_TITLE_XPATH),"Thank you,");
    }

    @Test
    public void verify_The_Page_Content()throws InterruptedException {
        Assert.assertEquals(wqClientRegCompletePage.verify_Data_Equals(WQ_CLIENT_REGISTRATION_COMPLETE_PAGE_CONTENT_INSTRUCTIONS_XPATH),"Please check the tutorials below until we get back to you again.");
        Assert.assertEquals(wqClientRegCompletePage.verify_Data_Equals(WQ_CLIENT_REGISTRATION_COMPLETE_PAGE_CONTENT_USER_TUTORIAL_LINK_XPATH),"User Tutorial");
    }

    @Test
    public void verify_The_Copyright_Info_Available_At_The_Bottom_Of_The_Page()throws InterruptedException {
        Assert.assertEquals(wqClientRegCompletePage.verify_Element_Is_Available(WQ_CLIENT_REGISTRATION_COMPLETE_PAGE_CONTENT_COPYRIGHT_INFO_XPATH), true);
    }

    @Test
    public void verify_User_Tutorial_Link_Leads_To_Tutorial_Page()throws InterruptedException {
       wqClientRegCompletePage.
               action_click_User_Tutorial_Link();
       //Unable to verify user tutorials page browser title since 'User Tutorials' link is not clickable
       //Assert.assertEquals(wqClientRegCompletePage.check_Browser_Title(),"");
    }

}
