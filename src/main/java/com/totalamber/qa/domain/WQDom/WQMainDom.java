package com.totalamber.qa.domain.WQDom;



import com.totalamber.qa.page.WQPages.WQMainPage;
import org.openqa.selenium.WebDriver;



public class WQMainDom {

    WQMainPage wqMainPage;

    public WQMainDom(WebDriver driver) {

        wqMainPage = new WQMainPage(driver);
    }


    public void navigateToDMDashboardPage() {

        wqMainPage.navigateToDMDashboardPage();
    }

}
