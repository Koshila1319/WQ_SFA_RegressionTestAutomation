package com.totalamber.qa;

import com.totalamber.qa.automation.WebQuartersTestBase;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class SysAidHomeTest extends WebQuartersTestBase {

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
    public void caseSearch() throws InterruptedException{

        CaseID = "49006";

        sysAidHomeDom.searchOpenCase(CaseID);
        Thread.sleep(10000);

        System.out.print("SysAid page Email= "+  SupportUserEmail);

        System.out.print("SysAid page caseID = "+  CaseID);

    }


}
