package com.totalamber.qa.domain.WQDom;

import com.totalamber.qa.page.WQPages.WQCloseCasesPage;
import org.openqa.selenium.WebDriver;

/**
 * Created by s.wathsala on 8/25/2017.
 */
public class WQCloseCasesDom {

    WQCloseCasesPage wqCloseCasesPage;

    public WQCloseCasesDom(WebDriver driver) {

        wqCloseCasesPage = new WQCloseCasesPage(driver);
    }
}
