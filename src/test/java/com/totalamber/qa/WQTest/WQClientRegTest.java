package com.totalamber.qa.WQTest;

import com.totalamber.qa.automation.TestBase;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by s.wathsala on 9/19/2017.
 */
public class WQClientRegTest extends TestBase {

    @BeforeMethod
    public void NavigateToPage() throws InterruptedException, IOException {
        initDomainObjects(DRIVER);
        String siteUrl = data.getValueByName("url");
        setSiteURL(siteUrl);

    }

    @AfterMethod
    public void endTestMethod() throws Throwable{
        quitDriver();
    }

    @Test
    public void verify_Company_Name_Text_Feild_Is_Single_Line_Of_Text()
    {
        
    }
}
