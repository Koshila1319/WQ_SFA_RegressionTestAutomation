package com.totalamber.qa.domain.SysAidDom;

import com.totalamber.qa.page.SysAidPages.SysAidHomePage;
import org.openqa.selenium.WebDriver;

/**
 * Created by e.koshila on 8/16/2017.
 */
public class SysAidHomeDom {

    SysAidHomePage sysAidHomePage;

    public SysAidHomeDom(WebDriver driver) {

        sysAidHomePage = new SysAidHomePage(driver);
    }

    public void searchOpenCase(String openCaseid) {

        sysAidHomePage.searchOpenCaseID(openCaseid);
    }

}
