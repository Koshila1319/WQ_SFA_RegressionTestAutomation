package com.totalamber.qa.page.webQuarters;

import com.totalamber.qa.automation.SeleniumBase;
import com.totalamber.qa.automation.TestBase;
import com.totalamber.qa.data.UI.elements.webQuarters.wqAMAssignUsersPage;
import org.openqa.selenium.WebDriver;

/**
 * Created by e.koshila on 10/2/2017.
 */
public class WQAMAssignUsersPage extends TestBase implements wqAMAssignUsersPage {

    SeleniumBase seleniumBase;
    public WQAMAssignUsersPage(WebDriver driver) {seleniumBase = new SeleniumBase(driver);}

    //Check element is available
    public boolean verify_Element_Is_Available(String elementXpath) {
        return seleniumBase.checkElementIsDisplayed(elementXpath);
    }

    //Check data equals
    public String verify_Data_Equals(String data) {
        return seleniumBase.verifyDataEquals(data);
    }

    //Get browser title
    public String check_Browser_Title() {
        return seleniumBase.getTitle();
    }


    public boolean verify_Element_Is_Enabled(String elementXpath) {
        return seleniumBase.checkIsElementEnabled(elementXpath);
    }

    public void action_Select_Company(String company) {
        seleniumBase.selectByVisibleText(WQ_AM_ASSIGN_USERS_SELECT_COMPANY_DROPDOWN_CSS, WQ_AM_ASSIGN_USERS_SELECT_COMPANY_DROPDOWN_XPATH, company);
    }

    public WQAMAssignUsersPage action_Add_New_SP_User(String userEmail, String userRole) throws InterruptedException {
        seleniumBase.replaceText(WQ_AM_ASSIGN_USERS_ADD_USERS_TEXTBOX_CSS, WQ_AM_ASSIGN_USERS_ADD_USERS_TEXTBOX_XPATH, userEmail);
        Thread.sleep(3000);
        seleniumBase.selectByVisibleText(WQ_AM_ASSIGN_USERS_USER_ROLE_DROPDOWN_CSS, WQ_AM_ASSIGN_USERS_USER_ROLE_DROPDOWN_XPATH, userRole);
        Thread.sleep(3000);
        return this;
    }

    public WQAMAssignUsersPage action_Click_Activate_Button() throws InterruptedException {
        seleniumBase.click(WQ_AM_ASSIGN_USERS_USER_ROLE_ACTIVATE_BUTTON_XPATH, WQ_AM_ASSIGN_USERS_USER_ROLE_ACTIVATE_BUTTON_CSS);
        Thread.sleep(3000);
        return this;
    }

    //Reassign DM
    public WQAMAssignUsersPage action_Reassign_New_DM(String email) {
        seleniumBase.replaceText(WQ_AM_REASSIGN_DM_EMAIL_TEXTBOX_CSS, WQ_AM_REASSIGN_DM_EMAIL_TEXTBOX_XPATH, email);
        return this;
    }

    public void action_Click_Reassign_Button() {
        seleniumBase.click(WQ_AM_REASSIGN_DM_BUTTON_XPATH, WQ_AM_REASSIGN_DM_BUTTON_CSS);
    }

    public WQAMAssignUsersPage action_Reassign_Same_DM(String email) {
        seleniumBase.replaceText(WQ_AM_REASSIGN_DM_EMAIL_TEXTBOX_CSS, WQ_AM_REASSIGN_DM_EMAIL_TEXTBOX_XPATH, email);
        return this;
    }

    public void action_Click_Deactivate_Button(String xpath) {
        seleniumBase.click(xpath, "");
    }

    public String step_Get_Deactivated_Email(String xpath) {
    //   return seleniumBase.getText("",xpath);
        return seleniumBase.readValueFromTextBox(xpath);
    }
}
