package com.totalamber.qa.page.webQuarters;

import com.totalamber.qa.automation.SeleniumBase;
import com.totalamber.qa.data.UI.elements.webQuarters.wqClientRegPage;
import org.openqa.selenium.By;
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

    public void verify_Your_Email_Text_Feild_Single_Line_Of_Text_Feild() {
        if(seleniumBase.type(WQCLIENT_REG_PAGE_EMAIL_ADDRESS_CSS,WQCLIENT_REG_PAGE_EMAIL_ADDRESS_XPATH,"This is a line text one.\n This is a line text two.\n This i s a line text three"))
        {
            System.out.print("Multiple Line of text");
        }

        else{
            System.out.print("Single Line of text");
        }
    }

    public String check_Your_Email_Text_Feild() {
        return seleniumBase.getTextByAttribute(WQCLIENT_REG_PAGE_EMAIL_ADDRESS_CSS,WQCLIENT_REG_PAGE_EMAIL_ADDRESS_XPATH,"placeholder");
    }

    public void check_Email_Feild_Text_Types(String email) {
        seleniumBase.type(WQCLIENT_REG_PAGE_EMAIL_ADDRESS_CSS,WQCLIENT_REG_PAGE_EMAIL_ADDRESS_XPATH,email);
        seleniumBase.validate_Email_Address(email);
    }

    public void verify_Your_Title_Designation_Feild_Single_Line_Of_Text_Feild() {
        if(seleniumBase.type(WQCLIENT_REG_PAGE_TITLE_DESIGNATION_CSS,WQCLIENT_REG_PAGE_TITLE_DESIGNATION_XPATH,"This is a line text one.\n This is a line text two.\n This i s a line text three"))
        {
            System.out.print("Multiple Line of text");
        }

        else{
            System.out.print("Single Line of text");
        }
    }

    public String check_Your_Title_Designation_Text_Feild() {
        return seleniumBase.getTextByAttribute(WQCLIENT_REG_PAGE_TITLE_DESIGNATION_CSS,WQCLIENT_REG_PAGE_TITLE_DESIGNATION_XPATH,"placeholder");
    }

    public void verify_Company_Address_Feild_Single_Line_Of_Text_Feild() {
        if(seleniumBase.type(WQCLIENT_REG_PAGE_COMPANY_ADDRESS_CSS,WQCLIENT_REG_PAGE_COMPANY_ADDRESS_XPATH,"This is a line text one.\n This is a line text two.\n This i s a line text three"))
        {
            System.out.print("Multiple Line of text");
        }

        else{
            System.out.print("Single Line of text");
        }
    }

    public String check_Company_Address_Text_Feild() {
        return seleniumBase.getTextByAttribute(WQCLIENT_REG_PAGE_COMPANY_ADDRESS_CSS,WQCLIENT_REG_PAGE_COMPANY_ADDRESS_XPATH,"placeholder");
    }

    public void verify_Town_City_Feild_Single_Line_Of_Text_Feild() {
        if(seleniumBase.type(WQCLIENT_REG_PAGE_TOWN_CITY_CSS,WQCLIENT_REG_PAGE_TOWN_CITY_XPATH,"This is a line text one.\n This is a line text two.\n This i s a line text three"))
        {
            System.out.print("Multiple Line of text");
        }

        else{
            System.out.print("Single Line of text");
        }
    }

    public String check_Town_City_Text_Feild() {
        return seleniumBase.getTextByAttribute(WQCLIENT_REG_PAGE_TOWN_CITY_CSS,WQCLIENT_REG_PAGE_TOWN_CITY_XPATH,"placeholder");
    }

    public void verify_Country_State_Feild_Single_Line_Of_Text_Feild() {
        if(seleniumBase.type(WQCLIENT_REG_PAGE_COUNTRY_CSS,WQCLIENT_REG_PAGE_COUNTRY_XPATH,"This is a line text one.\n This is a line text two.\n This i s a line text three"))
        {
            System.out.print("Multiple Line of text");
        }

        else{
            System.out.print("Single Line of text");
        }
    }

    public String check_Country_State_Text_Feild() {
        return seleniumBase.getTextByAttribute(WQCLIENT_REG_PAGE_COUNTRY_CSS,WQCLIENT_REG_PAGE_COUNTRY_XPATH,"placeholder");
    }

    public void verify_Postal_Zip_Code_Feild_Single_Line_Of_Text_Feild() {
        if(seleniumBase.type(WQCLIENT_REG_PAGE_POSTAL_ZIP_CODE_CSS,WQCLIENT_REG_PAGE_POSTAL_ZIP_CODE_XPATH,"This is a line text one.\n This is a line text two.\n This i s a line text three"))
        {
            System.out.print("Multiple Line of text");
        }

        else{
            System.out.print("Single Line of text");
        }
    }

    public String check_Postal_Zip_Code_Text_Feild() {
        return seleniumBase.getTextByAttribute(WQCLIENT_REG_PAGE_POSTAL_ZIP_CODE_CSS,WQCLIENT_REG_PAGE_POSTAL_ZIP_CODE_XPATH,"placeholder");
    }

   /* public void check_Country_Text_Feild() {
        seleniumBase.selectByVisibleText(WQCLIENT_REG_PAGE_POSTAL_ZIP_CODE_CSS,WQCLIENT_REG_PAGE_POSTAL_ZIP_CODE_XPATH,"Country (please select)");

    }*/

    public String check_Country_Text_Feild() {
       return seleniumBase.getTextByAttribute(WQCLIENT_REG_PAGE_COUNTRY_DROPDOWN_CSS,WQCLIENT_REG_PAGE_COUNTRY_DROPDOWN_XPATH,"value");

    }

    public void verify_Contact_Number_Feild_Single_Line_Of_Text_Feild() {
        if(seleniumBase.type(WQCLIENT_REG_PAGE_CONTACT_NO_CSS,WQCLIENT_REG_PAGE_CONTACT_NO_XPATH,"This is a line text one.\n This is a line text two.\n This i s a line text three"))
        {
            System.out.print("Multiple Line of text");
        }

        else{
            System.out.print("Single Line of text");
        }
    }

    public String check_Contact_Number_Text_Feild() {
        return seleniumBase.getTextByAttribute(WQCLIENT_REG_PAGE_CONTACT_NO_CSS,WQCLIENT_REG_PAGE_CONTACT_NO_XPATH,"placeholder");
    }

    public void verify_Dialing_Code_Feild_Single_Line_Of_Text_Feild() {

        if(seleniumBase.type(WQCLIENT_REG_PAGE_DIALING_CODE_CSS,WQCLIENT_REG_PAGE_DIALING_CODE_XPATH,"This is a line text one.\n This is a line text two.\n This i s a line text three"))
        {
            System.out.print("Multiple Line of text");
        }

        else{
            System.out.print("Single Line of text");
        }
    }

    public String check_Dialing_Code_Text_Feild() {
        return seleniumBase.getTextByAttribute(WQCLIENT_REG_PAGE_DIALING_CODE_CSS,WQCLIENT_REG_PAGE_DIALING_CODE_XPATH,"placeholder");
    }

    public void verify_Fax_Feild_Single_Line_Of_Text_Feild() {
        if(seleniumBase.type(WQCLIENT_REG_PAGE_FAX_CSS,WQCLIENT_REG_PAGE_FAX_XPATH,"This is a line text one.\n This is a line text two.\n This i s a line text three"))
        {
            System.out.print("Multiple Line of text");
        }

        else{
            System.out.print("Single Line of text");
        }
    }

    public String check_Fax_Text_Feild() {
        return seleniumBase.getTextByAttribute(WQCLIENT_REG_PAGE_FAX_CSS,WQCLIENT_REG_PAGE_FAX_XPATH,"placeholder");
    }

    public void select_Organization_Size() {
        seleniumBase.selectByVisibleText(WQCLIENT_REG_PAGE_ORG_SIZE_CSS,WQCLIENT_REG_PAGE_ORG_SIZE_XPATH,"Between 50 to 150");
    }

    public String Organization_Size_Text_Feild() {
        return seleniumBase.getTextByAttribute(WQCLIENT_REG_PAGE_ORG_SIZE_CSS,WQCLIENT_REG_PAGE_ORG_SIZE_XPATH,"value");
    }

    public void verify_Company_Web_Address_Feild_Single_Line_Of_Text_Feild() {
        if(seleniumBase.type(WQCLIENT_REG_PAGE_WEB_ADDRESS_CSS,WQCLIENT_REG_PAGE_WEB_ADDRESS_XPATH,"This is a line text one.\n This is a line text two.\n This i s a line text three"))
        {
            System.out.print("Multiple Line of text");
        }

        else{
            System.out.print("Single Line of text");
        }
    }

    public String check_Company_Web_Address_Text_Feild() {
        return seleniumBase.getTextByAttribute(WQCLIENT_REG_PAGE_WEB_ADDRESS_CSS,WQCLIENT_REG_PAGE_WEB_ADDRESS_XPATH,"placeholder");
    }

    public String software_Application_Text_Feild() {
        return seleniumBase.getTextByAttribute(WQCLIENT_REG_PAGE_SOFTWARE_APPLICATION_CSS,WQCLIENT_REG_PAGE_SOFTWARE_APPLICATION_XPATH,"value");
    }

    public void select_SW_Application() {
       seleniumBase.selectByVisibleText(WQCLIENT_REG_PAGE_SOFTWARE_APPLICATION_CSS,WQCLIENT_REG_PAGE_SOFTWARE_APPLICATION_XPATH,"IFS");
       //seleniumBase.selectSoftware();
       // seleniumBase.checkDropdownTextValue(WQCLIENT_REG_PAGE_SOFTWARE_APPLICATION_XPATH,"M3");
    }

    public String check_Modules_Text_Feild() {
        return seleniumBase.getText(WQCLIENT_REG_PAGE_MODULES_CSS,WQCLIENT_REG_PAGE_MODULES_XPATH);
    }

    public void select_Modules() {
        //seleniumBase.setdropdownElements(WQCLIENT_REG_PAGE_MODULE_DIV,WQCLIENT_REG_PAGE_SOFTWARE_APPLICATION_XPATH);
        seleniumBase.checkDropdownTextValue(WQCLIENT_REG_PAGE_SOFTWARE_APPLICATION_XPATH,"IFS Financials");
    }
}
