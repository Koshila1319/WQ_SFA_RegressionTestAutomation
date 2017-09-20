package com.totalamber.qa.page.webQuarters;

import com.totalamber.qa.automation.SeleniumBase;
import com.totalamber.qa.data.UI.elements.webQuarters.wqClientRegPage;
import org.openqa.selenium.WebDriver;

/**
 * Created by s.wathsala on 9/19/2017.
 */
public class WQClientRegPage implements wqClientRegPage {
    SeleniumBase seleniumBase;

    public WQClientRegPage (WebDriver driver) {

        seleniumBase = new SeleniumBase(driver);
    }

    public void verify_Company_Name_Text_Feild_Single_Line_Of_Text_Feild() {
        if(seleniumBase.type(WQCLIENT_REG_PAGE_COMPANY_NAME_CSS,WQCLIENT_REG_PAGE_COMPANY_NAME_XPATH,"This is a line text one.\n This is a line text two.\n This i s a line text three"))
        {
            System.out.print("Multiple Line of text");
        }

        else{
            System.out.print("Single Line of text");
        }
    }

    public String check_Company_Name_Feild_Text() {
        return seleniumBase.getTextByAttribute(WQCLIENT_REG_PAGE_COMPANY_NAME_CSS,WQCLIENT_REG_PAGE_COMPANY_NAME_XPATH,"placeholder");
    }

    public void check_text_feild_data_type(String name) {
        seleniumBase.type(WQCLIENT_REG_PAGE_COMPANY_NAME_CSS,WQCLIENT_REG_PAGE_COMPANY_NAME_XPATH,name);
        seleniumBase.alphanumeric(name);
    }

    public void verify_Business_Reg_No_Text_Feild_Single_Line_Of_Text_Feild() {
        if(seleniumBase.type(WQCLIENT_REG_PAGE_BUSINESS_REG_NO_CSS,WQCLIENT_REG_PAGE_BUSINESS_REG_NO_XPATH,"This is a line text one.\n This is a line text two.\n This i s a line text three"))
        {
            System.out.print("Multiple Line of text");
        }

        else{
            System.out.print("Single Line of text");
        }
    }

    public String check_Business_Reg_No_Feild_Text() {
        return seleniumBase.getTextByAttribute(WQCLIENT_REG_PAGE_BUSINESS_REG_NO_CSS,WQCLIENT_REG_PAGE_BUSINESS_REG_NO_XPATH,"placeholder");
    }

    public void verify_First_Name_Text_Feild_Single_Line_Of_Text_Feild() {

        if(seleniumBase.type(WQCLIENT_REG_PAGE_FIRST_NAME_CSS,WQCLIENT_REG_PAGE_FIRST_NAME_XPATH,"This is a line text one.\n This is a line text two.\n This i s a line text three"))
        {
            System.out.print("Multiple Line of text");
        }

        else{
            System.out.print("Single Line of text");
        }
    }

    public String check_First_Name_Feild_Text() {
        return seleniumBase.getTextByAttribute(WQCLIENT_REG_PAGE_FIRST_NAME_CSS,WQCLIENT_REG_PAGE_FIRST_NAME_XPATH,"placeholder");
    }

    public void verify_Last_Name_Text_Feild_Single_Line_Of_Text_Feild() {
        if(seleniumBase.type(WQCLIENT_REG_PAGE_LAST_NAME_CSS,WQCLIENT_REG_PAGE_LAST_NAME_XPATH,"This is a line text one.\n This is a line text two.\n This i s a line text three"))
        {
            System.out.print("Multiple Line of text");
        }

        else{
            System.out.print("Single Line of text");
        }
    }

    public String check_Last_Name_Feild_Text() {
        return seleniumBase.getTextByAttribute(WQCLIENT_REG_PAGE_LAST_NAME_CSS,WQCLIENT_REG_PAGE_LAST_NAME_XPATH,"placeholder");
    }
}
