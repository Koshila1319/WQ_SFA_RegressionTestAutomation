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

    public WQClientRegPage(WebDriver driver) {

        seleniumBase = new SeleniumBase(driver);
    }

    public void verify_Company_Name_Text_Feild_Single_Line_Of_Text_Feild() {
        if (seleniumBase.type(WQCLIENT_REG_PAGE_COMPANY_NAME_CSS, WQCLIENT_REG_PAGE_COMPANY_NAME_XPATH, "This is a line text one.\n This is a line text two.\n This i s a line text three")) {
            System.out.print("Multiple Line of text");
        } else {
            System.out.print("Single Line of text");
        }
    }

    public String check_Company_Name_Feild_Text() {
        return seleniumBase.getTextByAttribute(WQCLIENT_REG_PAGE_COMPANY_NAME_CSS, WQCLIENT_REG_PAGE_COMPANY_NAME_XPATH, "placeholder");
    }

    public void check_text_feild_data_type(String name) {
        seleniumBase.type(WQCLIENT_REG_PAGE_COMPANY_NAME_CSS, WQCLIENT_REG_PAGE_COMPANY_NAME_XPATH, name);
        seleniumBase.alphanumeric(name);
    }

    public void verify_Business_Reg_No_Text_Feild_Single_Line_Of_Text_Feild() {
        if (seleniumBase.type(WQCLIENT_REG_PAGE_BUSINESS_REG_NO_CSS, WQCLIENT_REG_PAGE_BUSINESS_REG_NO_XPATH, "This is a line text one.\n This is a line text two.\n This i s a line text three")) {
            System.out.print("Multiple Line of text");
        } else {
            System.out.print("Single Line of text");
        }
    }

    public String check_Business_Reg_No_Feild_Text() {
        return seleniumBase.getTextByAttribute(WQCLIENT_REG_PAGE_BUSINESS_REG_NO_CSS, WQCLIENT_REG_PAGE_BUSINESS_REG_NO_XPATH, "placeholder");
    }

    public void verify_First_Name_Text_Feild_Single_Line_Of_Text_Feild() {

        if (seleniumBase.type(WQCLIENT_REG_PAGE_FIRST_NAME_CSS, WQCLIENT_REG_PAGE_FIRST_NAME_XPATH, "This is a line text one.\n This is a line text two.\n This i s a line text three")) {
            System.out.print("Multiple Line of text");
        } else {
            System.out.print("Single Line of text");
        }
    }

    public String check_First_Name_Feild_Text() {
        return seleniumBase.getTextByAttribute(WQCLIENT_REG_PAGE_FIRST_NAME_CSS, WQCLIENT_REG_PAGE_FIRST_NAME_XPATH, "placeholder");
    }

    public void verify_Last_Name_Text_Feild_Single_Line_Of_Text_Feild() {
        if (seleniumBase.type(WQCLIENT_REG_PAGE_LAST_NAME_CSS, WQCLIENT_REG_PAGE_LAST_NAME_XPATH, "This is a line text one.\n This is a line text two.\n This i s a line text three")) {
            System.out.print("Multiple Line of text");
        } else {
            System.out.print("Single Line of text");
        }
    }

    public String check_Last_Name_Feild_Text() {
        return seleniumBase.getTextByAttribute(WQCLIENT_REG_PAGE_LAST_NAME_CSS, WQCLIENT_REG_PAGE_LAST_NAME_XPATH, "placeholder");
    }

    public void verify_Your_Email_Text_Feild_Single_Line_Of_Text_Feild() {
        if (seleniumBase.type(WQCLIENT_REG_PAGE_EMAIL_ADDRESS_CSS, WQCLIENT_REG_PAGE_EMAIL_ADDRESS_XPATH, "This is a line text one.\n This is a line text two.\n This i s a line text three")) {
            System.out.print("Multiple Line of text");
        } else {
            System.out.print("Single Line of text");
        }
    }

    public String check_Your_Email_Text_Feild() {
        return seleniumBase.getTextByAttribute(WQCLIENT_REG_PAGE_EMAIL_ADDRESS_CSS, WQCLIENT_REG_PAGE_EMAIL_ADDRESS_XPATH, "placeholder");
    }

    public void check_Email_Feild_Text_Types(String email) {
        seleniumBase.type(WQCLIENT_REG_PAGE_EMAIL_ADDRESS_CSS, WQCLIENT_REG_PAGE_EMAIL_ADDRESS_XPATH, email);
        seleniumBase.validate_Email_Address(email);
    }

    public void verify_Your_Title_Designation_Feild_Single_Line_Of_Text_Feild() {
        if (seleniumBase.type(WQCLIENT_REG_PAGE_TITLE_DESIGNATION_CSS, WQCLIENT_REG_PAGE_TITLE_DESIGNATION_XPATH, "This is a line text one.\n This is a line text two.\n This i s a line text three")) {
            System.out.print("Multiple Line of text");
        } else {
            System.out.print("Single Line of text");
        }
    }

    public String check_Your_Title_Designation_Text_Feild() {
        return seleniumBase.getTextByAttribute(WQCLIENT_REG_PAGE_TITLE_DESIGNATION_CSS, WQCLIENT_REG_PAGE_TITLE_DESIGNATION_XPATH, "placeholder");
    }

    public void verify_Company_Address_Feild_Single_Line_Of_Text_Feild() {
        if (seleniumBase.type(WQCLIENT_REG_PAGE_COMPANY_ADDRESS_CSS, WQCLIENT_REG_PAGE_COMPANY_ADDRESS_XPATH, "This is a line text one.\n This is a line text two.\n This i s a line text three")) {
            System.out.print("Multiple Line of text");
        } else {
            System.out.print("Single Line of text");
        }
    }

    public String check_Company_Address_Text_Feild() {
        return seleniumBase.getTextByAttribute(WQCLIENT_REG_PAGE_COMPANY_ADDRESS_CSS, WQCLIENT_REG_PAGE_COMPANY_ADDRESS_XPATH, "placeholder");
    }

    public void verify_Town_City_Feild_Single_Line_Of_Text_Feild() {
        if (seleniumBase.type(WQCLIENT_REG_PAGE_TOWN_CITY_CSS, WQCLIENT_REG_PAGE_TOWN_CITY_XPATH, "This is a line text one.\n This is a line text two.\n This i s a line text three")) {
            System.out.print("Multiple Line of text");
        } else {
            System.out.print("Single Line of text");
        }
    }

    public String check_Town_City_Text_Feild() {
        return seleniumBase.getTextByAttribute(WQCLIENT_REG_PAGE_TOWN_CITY_CSS, WQCLIENT_REG_PAGE_TOWN_CITY_XPATH, "placeholder");
    }

    public void verify_Country_State_Feild_Single_Line_Of_Text_Feild() {
        if (seleniumBase.type(WQCLIENT_REG_PAGE_COUNTRY_CSS, WQCLIENT_REG_PAGE_COUNTRY_XPATH, "This is a line text one.\n This is a line text two.\n This i s a line text three")) {
            System.out.print("Multiple Line of text");
        } else {
            System.out.print("Single Line of text");
        }
    }

    public String check_Country_State_Text_Feild() {
        return seleniumBase.getTextByAttribute(WQCLIENT_REG_PAGE_COUNTRY_CSS, WQCLIENT_REG_PAGE_COUNTRY_XPATH, "placeholder");
    }

    public void verify_Postal_Zip_Code_Feild_Single_Line_Of_Text_Feild() {
        if (seleniumBase.type(WQCLIENT_REG_PAGE_POSTAL_ZIP_CODE_CSS, WQCLIENT_REG_PAGE_POSTAL_ZIP_CODE_XPATH, "This is a line text one.\n This is a line text two.\n This i s a line text three")) {
            System.out.print("Multiple Line of text");
        } else {
            System.out.print("Single Line of text");
        }
    }

    public String check_Postal_Zip_Code_Text_Feild() {
        return seleniumBase.getTextByAttribute(WQCLIENT_REG_PAGE_POSTAL_ZIP_CODE_CSS, WQCLIENT_REG_PAGE_POSTAL_ZIP_CODE_XPATH, "placeholder");
    }

   /* public void check_Country_Text_Feild() {
        seleniumBase.selectByVisibleText(WQCLIENT_REG_PAGE_POSTAL_ZIP_CODE_CSS,WQCLIENT_REG_PAGE_POSTAL_ZIP_CODE_XPATH,"Country (please select)");

    }*/

    public String check_Country_Text_Feild() {
        return seleniumBase.getTextByAttribute(WQCLIENT_REG_PAGE_COUNTRY_DROPDOWN_CSS, WQCLIENT_REG_PAGE_COUNTRY_DROPDOWN_XPATH, "value");

    }

    public void verify_Contact_Number_Feild_Single_Line_Of_Text_Feild() {
        if (seleniumBase.type(WQCLIENT_REG_PAGE_CONTACT_NO_CSS, WQCLIENT_REG_PAGE_CONTACT_NO_XPATH, "This is a line text one.\n This is a line text two.\n This i s a line text three")) {
            System.out.print("Multiple Line of text");
        } else {
            System.out.print("Single Line of text");
        }
    }

    public String check_Contact_Number_Text_Feild() {
        return seleniumBase.getTextByAttribute(WQCLIENT_REG_PAGE_CONTACT_NO_CSS, WQCLIENT_REG_PAGE_CONTACT_NO_XPATH, "placeholder");
    }

    public void verify_Dialing_Code_Feild_Single_Line_Of_Text_Feild() {

        if (seleniumBase.type(WQCLIENT_REG_PAGE_DIALING_CODE_CSS, WQCLIENT_REG_PAGE_DIALING_CODE_XPATH, "This is a line text one.\n This is a line text two.\n This i s a line text three")) {
            System.out.print("Multiple Line of text");
        } else {
            System.out.print("Single Line of text");
        }
    }

    public String check_Dialing_Code_Text_Feild() {
        return seleniumBase.getTextByAttribute(WQCLIENT_REG_PAGE_DIALING_CODE_CSS, WQCLIENT_REG_PAGE_DIALING_CODE_XPATH, "placeholder");
    }

    public void verify_Fax_Feild_Single_Line_Of_Text_Feild() {
        if (seleniumBase.type(WQCLIENT_REG_PAGE_FAX_CSS, WQCLIENT_REG_PAGE_FAX_XPATH, "This is a line text one.\n This is a line text two.\n This i s a line text three")) {
            System.out.print("Multiple Line of text");
        } else {
            System.out.print("Single Line of text");
        }
    }

    public String check_Fax_Text_Feild() {
        return seleniumBase.getTextByAttribute(WQCLIENT_REG_PAGE_FAX_CSS, WQCLIENT_REG_PAGE_FAX_XPATH, "placeholder");
    }

    public WQClientRegPage select_Organization_Size() {

        seleniumBase.selectByVisibleText(WQCLIENT_REG_PAGE_ORG_SIZE_CSS, WQCLIENT_REG_PAGE_ORG_SIZE_XPATH, "Between 50 to 150");
        return this;
    }

    public String Organization_Size_Text_Feild() {
        return seleniumBase.getTextByAttribute(WQCLIENT_REG_PAGE_ORG_SIZE_CSS, WQCLIENT_REG_PAGE_ORG_SIZE_XPATH, "value");
    }

    public void verify_Company_Web_Address_Feild_Single_Line_Of_Text_Feild() {
        if (seleniumBase.type(WQCLIENT_REG_PAGE_WEB_ADDRESS_CSS, WQCLIENT_REG_PAGE_WEB_ADDRESS_XPATH, "This is a line text one.\n This is a line text two.\n This i s a line text three")) {
            System.out.print("Multiple Line of text");
        } else {
            System.out.print("Single Line of text");
        }
    }

    public String check_Company_Web_Address_Text_Feild() {
        return seleniumBase.getTextByAttribute(WQCLIENT_REG_PAGE_WEB_ADDRESS_CSS, WQCLIENT_REG_PAGE_WEB_ADDRESS_XPATH, "placeholder");
    }

    public String software_Application_Text_Feild() {
        return seleniumBase.getTextByAttribute(WQCLIENT_REG_PAGE_SOFTWARE_APPLICATION_CSS, WQCLIENT_REG_PAGE_SOFTWARE_APPLICATION_XPATH, "value");
    }

    public void select_SW_Application() {
        seleniumBase.selectByVisibleText(WQCLIENT_REG_PAGE_SOFTWARE_APPLICATION_CSS, WQCLIENT_REG_PAGE_SOFTWARE_APPLICATION_XPATH, "IFS");

    }

    public String check_Modules_Text_Feild() {
        return seleniumBase.getText(WQCLIENT_REG_PAGE_MODULES_CSS, WQCLIENT_REG_PAGE_MODULES_XPATH);
    }

    public void select_Modules() {
        seleniumBase.setdropdownElements(WQCLIENT_REG_PAGE_MODULE_DIV, WQCLIENT_REG_PAGE_MODULES_XPATH);

    }

    public boolean select_Modules_Without_The_SW() throws InterruptedException {
        return seleniumBase.check_Text_Feild_Data_Equal(WQCLIENT_REG_PAGE_MODULES_CSS,WQCLIENT_REG_PAGE_MODULES_XPATH,"Modules");
    }

    public String check_Versions_Text_Feild() {
        return seleniumBase.getText(WQCLIENT_REG_PAGE_VERSIONS_CSS,WQCLIENT_REG_PAGE_VERSIONS_XPATH);
    }

    public void select_Versions() {
        seleniumBase.setdropdownElements(WQCLIENT_REG_PAGE_VERSIONS_DIV,WQCLIENT_REG_PAGE_VERSIONS_XPATH);
    }

    public void select_CheckBox_In_Modules() {
        seleniumBase.setdropdownElements(WQCLIENT_REG_PAGE_MODULE_DIV,WQCLIENT_REG_PAGE_MODULES_CHECKBOX_XPATH);
    }

    public void select_CheckBox_In_Versions() {
        seleniumBase.setdropdownElements(WQCLIENT_REG_PAGE_VERSIONS_DIV,WQCLIENT_REG_PAGE_VERSIONS_CHECKBOX_XPATH);
    }

    public boolean select_Versions_Without_The_SW() throws InterruptedException {
        return seleniumBase.check_Text_Feild_Data_Equal(WQCLIENT_REG_PAGE_VERSIONS_CSS,WQCLIENT_REG_PAGE_VERSIONS_XPATH,"Versions");
    }

    public String check_Add_Button_Text_Feild() {
        return  seleniumBase.getTextByAttribute(WQCLIENT_REG_PAGE_ADD_BUTTON_CSS,WQCLIENT_REG_PAGE_ADD_BUTTON_XPATH,"value");
    }

    public void click_Add_Button() {
        seleniumBase.click(WQCLIENT_REG_PAGE_ADD_BUTTON_XPATH,WQCLIENT_REG_PAGE_ADD_BUTTON_CSS);
    }

    public String check_App_Name_Error_Msg() {
        return seleniumBase.getText(WQCLIENT_REG_PAGE_ADD_BUTTON_SW_APP_ERROR_MSG_CSS,WQCLIENT_REG_PAGE_ADD_BUTTON_SW_APP_ERROR_MSG_XPATH);
    }

    public String check_Module_Error_Msg() {
        return seleniumBase.getText(WQCLIENT_REG_PAGE_ADD_BUTTON_MODULE_ERROR_MSG_CSS,WQCLIENT_REG_PAGE_ADD_BUTTON_MODULE_ERROR_MSG_XPATH);
    }

    public String check_Delete_Button_Text_Feild() {
        return seleniumBase.getTextByAttribute(WQCLIENT_REG_PAGE_DELETE_BUTTON_CSS,WQCLIENT_REG_PAGE_DELETE_BUTTON_XPATH,"value");
    }

    public void check_User_Can_Delete_App_Info() {
        seleniumBase.click(WQCLIENT_REG_PAGE_DELETE_BUTTON_XPATH,WQCLIENT_REG_PAGE_DELETE_BUTTON_CSS);
    }

    public String check_How_Did_You_Hear_About_Us_Title() {
        return seleniumBase.getText(WQCLIENT_REG_PAGE_HOW_DID_YOU_HEAR_CSS,WQCLIENT_REG_PAGE_HOW_DID_YOU_HEAR_XPATH);
    }

    public String check_Selection_DropDown_Text() {
        return seleniumBase.getTextByAttribute(WQCLIENT_REG_PAGE_SELECT_DROPDOWN_CSS,WQCLIENT_REG_PAGE_SELECT_DROPDOWN_XPATH,"value");
    }

    public WQClientRegPage select_An_Email_Marketing() {
        seleniumBase.selectByVisibleText(WQCLIENT_REG_PAGE_SELECT_DROPDOWN_CSS,WQCLIENT_REG_PAGE_SELECT_DROPDOWN_XPATH, "Email marketing");
        return this;
    }

    public String check_Sign_Me_Up_Button_Text() {
        return seleniumBase.getTextByAttribute(WQCLIENT_REG_PAGE_SIGN_ME_UP_BUTTON_CSS,WQCLIENT_REG_PAGE_SIGN_ME_UP_BUTTON_XPATH,"value");
    }

    public WQClientRegPage click_Sign_Me_Up_Button() {
        seleniumBase.click(WQCLIENT_REG_PAGE_SIGN_ME_UP_BUTTON_XPATH,WQCLIENT_REG_PAGE_SIGN_ME_UP_BUTTON_CSS);
        return this;
    }

    public String check_Company_Name_Feild_Is_Mandatory() {
         return seleniumBase.check_CSS_Value(WQCLIENT_REG_PAGE_COMPANY_NAME_XPATH);
    }

    public String check_First_Name_Feild_Is_Mandatory() {
        return seleniumBase.check_CSS_Value(WQCLIENT_REG_PAGE_FIRST_NAME_XPATH);
    }

    public String check_Last_Name_Feild_Is_Mandatory() {
        return seleniumBase.check_CSS_Value(WQCLIENT_REG_PAGE_LAST_NAME_XPATH);
    }

    public String check_Email_Feild_Is_Mandatory() {
        return seleniumBase.check_CSS_Value(WQCLIENT_REG_PAGE_EMAIL_ADDRESS_XPATH);
    }

    public String check_Title_Feild_Is_Mandatory() {
        return seleniumBase.check_CSS_Value(WQCLIENT_REG_PAGE_TITLE_DESIGNATION_XPATH);
    }

    public String check_Company_Address_Feild_Is_Mandatory() {
        return seleniumBase.check_CSS_Value(WQCLIENT_REG_PAGE_COMPANY_ADDRESS_XPATH);
    }

    public String check_Town_City_Feild_Is_Mandatory() {
        return seleniumBase.check_CSS_Value(WQCLIENT_REG_PAGE_TOWN_CITY_XPATH);
    }

    public String check_Contact_Number_Feild_Is_Mandatory() {
        return seleniumBase.check_CSS_Value(WQCLIENT_REG_PAGE_CONTACT_NO_XPATH);
    }

    public WQClientRegPage fill_Client_Registration_Info(String companyName,String fName, String lName, String email, String jobTitle, String address, String town, String contactNo) {
        seleniumBase.type(WQCLIENT_REG_PAGE_COMPANY_NAME_CSS,WQCLIENT_REG_PAGE_COMPANY_NAME_XPATH,companyName);
        seleniumBase.type(WQCLIENT_REG_PAGE_COMPANY_NAME_CSS,WQCLIENT_REG_PAGE_FIRST_NAME_XPATH,fName);
        seleniumBase.type(WQCLIENT_REG_PAGE_COMPANY_NAME_CSS,WQCLIENT_REG_PAGE_LAST_NAME_XPATH,lName);
        seleniumBase.type(WQCLIENT_REG_PAGE_COMPANY_NAME_CSS,WQCLIENT_REG_PAGE_EMAIL_ADDRESS_XPATH,email);
        seleniumBase.type(WQCLIENT_REG_PAGE_COMPANY_NAME_CSS,WQCLIENT_REG_PAGE_TITLE_DESIGNATION_XPATH,jobTitle);
        seleniumBase.type(WQCLIENT_REG_PAGE_COMPANY_NAME_CSS,WQCLIENT_REG_PAGE_COMPANY_ADDRESS_XPATH,address);
        seleniumBase.type(WQCLIENT_REG_PAGE_COMPANY_NAME_CSS,WQCLIENT_REG_PAGE_TOWN_CITY_XPATH,town);
        seleniumBase.type(WQCLIENT_REG_PAGE_COMPANY_NAME_CSS,WQCLIENT_REG_PAGE_CONTACT_NO_XPATH,contactNo);
        return this;



    }

    public String check_Organization_Size_Error_Msg() {
        return seleniumBase.getText(WQCLIENT_REG_PAGE_ORGANIZATION_SIZE_ERROR_MSG_CSS,WQCLIENT_REG_PAGE_ORGANIZATION_SIZE_ERROR_MSG_XPATH);
    }

    public String check_How_Did_You_Hear_About_Us_Error_Msg() {
        return seleniumBase.getText(WQCLIENT_REG_PAGE_HOW_DID_YOU_HEAR_ERROR_MSG_CSS,WQCLIENT_REG_PAGE_HOW_DID_YOU_HEAR_ERROR_MSG_XPATH);
    }

    public String check_Country_Error_Msg() {
        return seleniumBase.getText(WQCLIENT_REG_PAGE_COUNTRY_ERROR_MSG_CSS,WQCLIENT_REG_PAGE_COUNTRY_ERROR_MSG_XPATH);
    }

    public WQClientRegPage select_Country() {
        seleniumBase.selectByVisibleText(WQCLIENT_REG_PAGE_COUNTRY_DROPDOWN_CSS, WQCLIENT_REG_PAGE_COUNTRY_DROPDOWN_XPATH, "Algeria");
        return this;
    }

    public String check_Email_Error_Msg() {
        return seleniumBase.getText(WQCLIENT_REG_PAGE_EMAIL_ERROR_MSG_CSS,WQCLIENT_REG_PAGE_EMAIL_ERROR_MSG_XPATH);
    }

    public String check_Thank_You_Page() {
        return seleniumBase.getText(WQCLIENT_THANK_YOU_PAGE_CSS,WQCLIENT_THANK_YOU_PAGE_XPATH);
    }

    public String check_Thank_You_Page_Title() {
        return seleniumBase.getTitle();
    }

    public String check_First_Name_Available() {
        return seleniumBase.getText(WQCLIENT_THANK_YOU_PAGE_FIRST_NAME_CSS,WQCLIENT_THANK_YOU_PAGE_FIRST_NAME_XPATH);
    }

    public String check_Copyright_Info() {
        return seleniumBase.getText(WQCLIENT_THANK_YOU_PAGE_COPYRIGHT_INFO_CSS,WQCLIENT_THANK_YOU_PAGE_COPYRIGHT_INFO_XPATH);

    }

    public String check_Thank_You_Page_Msg_Content1() {
        return seleniumBase.getText(WQCLIENT_THANK_YOU_PAGE_MSG_CONTENT_1_CSS,WQCLIENT_THANK_YOU_PAGE_MSG_CONTENT_1_XPATH);
    }

    public String check_Thank_You_Page_Msg_Content2() {
        return seleniumBase.getText(WQCLIENT_THANK_YOU_PAGE_MSG_CONTENT_2_CSS,WQCLIENT_THANK_YOU_PAGE_MSG_CONTENT_2_XPATH);
    }

    public String check_Thank_You_Page_Msg_Content3() {
        return seleniumBase.getText(WQCLIENT_THANK_YOU_PAGE_MSG_CONTENT_3_CSS,WQCLIENT_THANK_YOU_PAGE_MSG_CONTENT_3_XPATH);
    }

    public WQClientRegPage click_Resend_Email() {
        seleniumBase.click(WQCLIENT_THANK_YOU_PAGE_EMAIL_SEND_XPATH,WQCLIENT_THANK_YOU_PAGE_EMAIL_SEND_CSS);
        return this;
    }

    public void user_Login_To_Account(String email) {
        seleniumBase.openTab("mailcatchURL");
        seleniumBase.type(MAILCATCH_EMAIL_XPATH,MAILICATCH_EMAIL_CSS,email);
        seleniumBase.click(MAILCATCH_GO_BUTTON_XPATH,MAILCATCH_GO_BUTTON_CSS);
        seleniumBase.click(MAILCATCH_REFRESH_BUTTON_XPATH,MAILCATCH_REFRESH_BUTTON_CSS);

    }


}
