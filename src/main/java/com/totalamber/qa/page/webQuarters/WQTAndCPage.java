package com.totalamber.qa.page.webQuarters;
import com.totalamber.qa.automation.SeleniumBase;
import com.totalamber.qa.data.UI.elements.webQuarters.wqTAndCPage;
import org.openqa.selenium.WebDriver;

/**
 * Created by t.piyananda on 25/09/2017.
 */
public class WQTAndCPage implements wqTAndCPage {

    SeleniumBase seleniumBase;
    public WQTAndCPage(WebDriver driver) { seleniumBase = new SeleniumBase(driver); }


    public String check_PageTitle_Of_TAndCPage() {
        return seleniumBase.getText(TANDCPAGE_TITLE_CSS,TANDCPAGE_TITLE_XPATH);
    }

    public String validate_BrowserTitle() {
        return seleniumBase.getTitle();
    }

    public WQTAndCPage validate_IAgree_RadioButton_Availability() {
        seleniumBase.verifyAvailableObject(TANDCPAGE_IAGREE_RADIO_XPATH);
        return this;
    }

    public WQTAndCPage validate_IDisagree_RadioButton_Availability() {
        seleniumBase.verifyAvailableObject(TANDCPAGE_IDISAGREE_RADIO_XPATH);
        return this;
    }

    public String check_IAgree_Button_Text() {
        return seleniumBase.getText(TANDCPAGE_IAGREE_CONTENT_CSS, TANDCPAGE_IAGREE_CONTENT_XPATH);
    }

    public String check_IDisagree_Button_Text() {
        return seleniumBase.getText(TANDCPAGE_IDISAGREE_CONTENT_CSS, TANDCPAGE_IDISAGREE_CONTENT_XPATH);
    }

    public boolean validate_IAgree_Button_Default_Selected() {
        return seleniumBase.verifyAvailableObject(TANDCPAGE_IAGREE_RADIO_XPATH);
    }

    public boolean validate_IDisgree_Button_Default_deSelected() {
        return seleniumBase.deselectedRadioButton(TANDCPAGE_IDISAGREE_RADIO_XPATH);
    }

    public WQTAndCPage step_selectDisagreeButton() {
        seleniumBase.selectRadioButton(TANDCPAGE_IDISAGREE_RADIO_XPATH);
        return this;
    }


    public String validate_RejectReason_TextArea_IsDisplaying() {
        return seleniumBase.getTextByAttribute(TANDCPAGE_IDISAGREE_REASON_CSS,TANDCPAGE_IDISAGREE_REASON_XPATH,"style");
    }

    public String validate_IAgree_Button_Default_DeSelected() {
        return seleniumBase.getTextByAttribute(TANDCPAGE_IAGREE_RADIO_CSS,TANDCPAGE_IAGREE_RADIO_XPATH, "value");
    }

    public WQTAndCPage step_refresh_ThePage() {
        seleniumBase.hardReaload();
        return this;
    }


    public String validate_IAgree_Button_DeSelected() {
        return seleniumBase.getTextByAttribute(TANDCPAGE_IAGREE_RADIO_CSS,TANDCPAGE_IAGREE_RADIO_XPATH, "value");
    }
}
