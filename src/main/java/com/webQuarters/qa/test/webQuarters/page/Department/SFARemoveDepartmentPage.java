package com.webQuarters.qa.test.webQuarters.page.Department;


import com.webQuarters.qa.automation.SeleniumBase;
import com.webQuarters.qa.data.UI.elements.webQuarters.elements.Department.sfaRemoveDepartmentPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by e.koshila on 4/6/2020.
 */

public class SFARemoveDepartmentPage implements sfaRemoveDepartmentPage {

    SeleniumBase seleniumBase;

    public SFARemoveDepartmentPage(WebDriver driver) {
        seleniumBase = new SeleniumBase(driver);
    }

    public String check_And_Validate_Remove_Department_Alert() throws InterruptedException {
        Thread.sleep(1500);
        String MsgTitle = seleniumBase.getText(By.xpath(REMOVE_DEPARTMENT_ALERT_MSG_TITLE_XPATH));
        String Msg = seleniumBase.getText(By.xpath(REMOVE_DEPARTMENT_ALERT_MSG_XPATH));

        String Message = MsgTitle + " " + Msg;

        System.out.println("Title ="+ MsgTitle);
        System.out.println("Msg ="+ Msg);

        return Message;
    }

    public String check_And_Validate_Remove_Department_Success_Message() throws InterruptedException {
        //Thread.sleep(1500);
        Thread.sleep(1000);
        String MsgTitle = seleniumBase.getText(By.xpath(REMOVE_DEPARTMENT_SUCCESS_MSG_TITLE_XPATH));
        String Msg = seleniumBase.getText(By.xpath(REMOVE_DEPARTMENT_SUCCESS_MSG_XPATH));

        String Message = MsgTitle + " " + Msg;

        System.out.println("Title ="+ MsgTitle);
        System.out.println("Msg ="+ Msg);

        return Message;
    }

    public String check_And_Validate_Cancel_Remove_Department_Message() throws InterruptedException {
        Thread.sleep(1500);
        String MsgTitle = seleniumBase.getText(By.xpath(REMOVE_DEPARTMENT_CANCEL_MSG_TITLE_XPATH));
        String Msg = seleniumBase.getText(By.xpath(REMOVE_DEPARTMENT_CANCEL_MSG_XPATH));

        String Message = MsgTitle + " " + Msg;

        System.out.println("Title ="+ MsgTitle);
        System.out.println("Msg ="+ Msg);

        return Message;
    }

    public void action_Click_On_Yes_Button_Of_Remove_Department_Alert() throws InterruptedException {
        Thread.sleep(2000);
        seleniumBase.click(REMOVE_DEPARTMENT_ALERT_YES_BUTTON_XPATH,REMOVE_DEPARTMENT_ALERT_YES_BUTTON_CSS);
    }

    public void action_Click_On_Cancel_Button_Of_Remove_Department_Alert() throws InterruptedException {
        Thread.sleep(2000);
        seleniumBase.click(REMOVE_DEPARTMENT_ALERT_CANCEL_BUTTON_XPATH,REMOVE_DEPARTMENT_ALERT_CANCEL_BUTTON_CSS);
    }

    public void action_Click_On_Ok_Button_Of_Cancel_Remove_Department_Alert() throws InterruptedException {
        Thread.sleep(2000);
        seleniumBase.click(REMOVE_DEPARTMENT_CANCEL_ALERT_OK_BUTTON_XPATH,REMOVE_DEPARTMENT_CANCEL_ALERT_OK_BUTTON_CSS);
    }

}



