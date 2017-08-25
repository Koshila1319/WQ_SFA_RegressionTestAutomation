package com.totalamber.qa.SysAidTest;

import java.io.IOException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.totalamber.qa.automation.WebQuartersTestBase;

public class SysAidLoginTest extends WebQuartersTestBase {

    @BeforeMethod
    public void NavigateToPage() throws InterruptedException, IOException {
        initDomainObjects(DRIVER);
        Thread.sleep(3000);
    }
    @AfterMethod
    public void endTestMethod() throws Throwable{
        //quitDriver();
    }

    @Test
    public void loginSysAid() throws InterruptedException{
        String siteUrl = data.getValueByName("sysAidurl");
        setSiteURL(siteUrl);
        String sysAidUName = data.getValueByName("sysAidUsername");
        String sysAidPW = data.getValueByName("sysAidPW");
        sysAidLoginDom.login(sysAidUName,sysAidPW);
        Thread.sleep(5000);

        System.out.print("SysAidTest page Email= "+  SupportUserEmail);

        System.out.print("SysAidTest page caseID = "+  CaseID);

    }


}
