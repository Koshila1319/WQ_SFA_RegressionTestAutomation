package com.totalamber.qa.WQTest;

import com.totalamber.qa.automation.TestBase;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;

/**
 * Created by s.wathsala on 9/29/2017.
 */
public class WQClientAssignTest extends TestBase{

    @BeforeMethod
    public void NavigateToPage() throws InterruptedException, IOException {
        initDomainObjects(DRIVER);
        String siteUrl = data.getValueByName("BackOfficeUrl");
        setSiteURL(siteUrl);

    }

    @AfterMethod
    public void endTestMethod() throws Throwable{
        quitDriver();
    }
}
