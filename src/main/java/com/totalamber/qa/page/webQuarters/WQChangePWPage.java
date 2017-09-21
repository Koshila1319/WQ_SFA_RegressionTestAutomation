package com.totalamber.qa.page.webQuarters;

import com.totalamber.qa.automation.SeleniumBase;
import com.totalamber.qa.data.UI.elements.webQuarters.wqChangePWPage;
import org.openqa.selenium.WebDriver;

/**
 * Created by t.piyananda on 21/09/2017.
 */
public class WQChangePWPage implements wqChangePWPage {

    SeleniumBase seleniumBase;
    public WQChangePWPage(WebDriver driver) {
        seleniumBase = new SeleniumBase(driver);
    }


    public String validate_the_PageTitle() {
        return seleniumBase.verifyDataEquals(CHANGEPWPAGE_TITLE_XPATH);
    }

    public String validate_PageContent1() {
        return seleniumBase.verifyDataEquals(CHANGEPWPAGE_CONTENT1_XPATH);
    }

    public String validate_PageContent2() {
        return seleniumBase.verifyDataEquals(CHANGEPWPAGE_CONTENT2_XPATH);
    }

    public boolean validate_FieldWrapper_Is_Available() {
        return seleniumBase.verifyAvailableObject(CHANGEPWPAGE_FIELDWRAPPER_XPATH);
    }

    public WQChangePWPage step_User_MoouseHover_the_FieldWrapper() {
        seleniumBase.mouseHoverAnElement(CHANGEPWPAGE_FIELDWRAPPER_XPATH);
        return this;
    }

    public String validate_FieldWrapper_LabelContent() {
        return seleniumBase.getTextByAttribute(CHANGEPWPAGE_FIELDWRAPPER_CSS,CHANGEPWPAGE_FIELDWRAPPER_XPATH,"title");
    }
}