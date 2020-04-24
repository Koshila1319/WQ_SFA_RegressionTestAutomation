package com.webQuarters.qa.test.webQuarters.page;


import com.webQuarters.qa.automation.SeleniumBase;
import com.webQuarters.qa.data.UI.elements.webQuarters.elements.sfaHomePage;
import com.webQuarters.qa.data.UI.elements.webQuarters.elements.sfaLoginPage;
import org.openqa.selenium.WebDriver;

/**
 * Created by e.koshila on 3/19/2020.
 */

public class SFAHomePage implements sfaLoginPage,sfaHomePage {

    SeleniumBase seleniumBase;

    public SFAHomePage(WebDriver driver) {
         seleniumBase = new SeleniumBase(driver);
    }

    public void action_Logout_From_The_System() {
        seleniumBase.click(HOME_PAGE_LOGOUT_DROPDOWN_XPATH, HOME_PAGE_LOGOUT_DROPDOWN_CSS);
        seleniumBase.click(HOME_PAGE_LOGOUT_BUTTON_XPATH, HOME_PAGE_LOGOUT_BUTTON_CSS);
    }

    //Check UI view of the page

    public void check_WQ_Logo_Is_Available() {
         seleniumBase.checkIsElementEnabled(HOME_PAGE_COMPANY_LOGO_XPATH);
    }

    public String check_Company_Name_Details() {
        seleniumBase.checkIsElementEnabled(HOME_PAGE_COMPANY_NAME_XPATH);
        return seleniumBase.getText(HOME_PAGE_COMPANY_NAME_CSS, HOME_PAGE_COMPANY_NAME_XPATH);
    }

    public String check_Home_Page_Browser_Title() {
        return seleniumBase.getTitle();
    }

    public void check_Profile_Image_Is_Available() {
        seleniumBase.checkIsElementEnabled(HOME_PAGE_PROFILE_IMAGE_XPATH);
    }

    public void check_Profile_Name_Is_Available() {
        seleniumBase.checkIsElementEnabled(HOME_PAGE_PROFILE_NAME_XPATH);
    }

    public void check_Profile_Email_Is_Available() {
        seleniumBase.checkIsElementEnabled(HOME_PAGE_PROFILE_EMAIL_XPATH);
    }

    public String check_And_Validate_Logged_In_User_Details() throws Exception {
        Thread.sleep(3000);
        return seleniumBase.getText(HOME_PAGE_PROFILE_EMAIL_CSS,HOME_PAGE_PROFILE_EMAIL_XPATH);
    }

    //Administration

    public String check_Administration_Section_Text() {
        seleniumBase.checkIsElementEnabled(HOME_PAGE_ADMINISTRATION_TEXT_XPATH);
        return seleniumBase.getText(HOME_PAGE_ADMINISTRATION_TEXT_CSS,HOME_PAGE_ADMINISTRATION_TEXT_XPATH);
    }

    public String check_Account_Master_Menu_Title() {
        seleniumBase.checkIsElementEnabled(HOME_PAGE_ACCOUNT_MASTER_MENU_TITLE_XPATH);
        return seleniumBase.getText(HOME_PAGE_ACCOUNT_MASTER_MENU_TITLE_CSS,HOME_PAGE_ACCOUNT_MASTER_MENU_TITLE_XPATH);
    }

    public String check_Account_Link() {
        seleniumBase.checkIsElementEnabled(HOME_PAGE_ACCOUNT_MENU_ITEM_XPATH);
        return seleniumBase.getText(HOME_PAGE_ACCOUNT_MENU_ITEM_CSS,HOME_PAGE_ACCOUNT_MENU_ITEM_XPATH);
    }

    public String check_Account_Branch_Link() {
        seleniumBase.checkIsElementEnabled(HOME_PAGE_ACCOUNT_BRANCH_MENU_ITEM_XPATH);
        return seleniumBase.getText(HOME_PAGE_ACCOUNT_BRANCH_MENU_ITEM_CSS,HOME_PAGE_ACCOUNT_BRANCH_MENU_ITEM_XPATH);
    }

    public String check_Department_Link() {
        seleniumBase.checkIsElementEnabled(HOME_PAGE_DEPARTMENT_MENU_ITEM_XPATH);
        return seleniumBase.getText(HOME_PAGE_DEPARTMENT_MENU_ITEM_CSS,HOME_PAGE_DEPARTMENT_MENU_ITEM_XPATH);
    }

    public String check_Designation_Link() {
        seleniumBase.checkIsElementEnabled(HOME_PAGE_DESIGNATION_MENU_ITEM_XPATH);
        return seleniumBase.getText(HOME_PAGE_DESIGNATION_MENU_ITEM_CSS,HOME_PAGE_DESIGNATION_MENU_ITEM_XPATH);
    }

    public String check_Employee_Link() {
        seleniumBase.checkIsElementEnabled(HOME_PAGE_EMPLOYEE_MENU_ITEM_XPATH);
        return seleniumBase.getText(HOME_PAGE_EMPLOYEE_MENU_ITEM_CSS,HOME_PAGE_EMPLOYEE_MENU_ITEM_XPATH);
    }

    public String check_Employee_Role_Mapping_Link() {
        seleniumBase.checkIsElementEnabled(HOME_PAGE_EMPLOYEE_ROLE_MAPPING_MENU_ITEM_XPATH);
        return seleniumBase.getText(HOME_PAGE_EMPLOYEE_ROLE_MAPPING_MENU_ITEM_CSS,HOME_PAGE_EMPLOYEE_ROLE_MAPPING_MENU_ITEM_XPATH);
    }

    public String check_Supervisor_Employee_Mapping_Link() {
        seleniumBase.checkIsElementEnabled(HOME_PAGE_SUPERVISOR_EMPLOYEE_MAPPING_MENU_ITEM_XPATH);
        return seleniumBase.getText(HOME_PAGE_SUPERVISOR_EMPLOYEE_MAPPING_MENU_ITEM_CSS,HOME_PAGE_SUPERVISOR_EMPLOYEE_MAPPING_MENU_ITEM_XPATH);
    }

    //Security

    public String check_Security_Section_Text() {
        seleniumBase.checkIsElementEnabled(HOME_PAGE_SECURITY_TEXT_XPATH);
        return seleniumBase.getText(HOME_PAGE_SECURITY_TEXT_CSS,HOME_PAGE_SECURITY_TEXT_XPATH);
    }

    public String check_Security_Master_Menu_Title() {
        seleniumBase.checkIsElementEnabled(HOME_PAGE_SECURITY_MASTER_MENU_TITLE_XPATH);
        return seleniumBase.getText(HOME_PAGE_SECURITY_MASTER_MENU_TITLE_CSS,HOME_PAGE_SECURITY_MASTER_MENU_TITLE_XPATH);
    }

    public String check_System_User_Link() {
        seleniumBase.checkIsElementEnabled(HOME_PAGE_SYSTEM_USER_MENU_ITEM_XPATH);
        return seleniumBase.getText(HOME_PAGE_SYSTEM_USER_MENU_ITEM_CSS,HOME_PAGE_SYSTEM_USER_MENU_ITEM_XPATH);
    }

    public String check_User_Groups_Link() {
        seleniumBase.checkIsElementEnabled(HOME_PAGE_USER_GROUPS_MENU_ITEM_XPATH);
        return seleniumBase.getText(HOME_PAGE_USER_GROUPS_MENU_ITEM_CSS,HOME_PAGE_USER_GROUPS_MENU_ITEM_XPATH);
    }

    public String check_Access_Control_Master_Menu_Title() {
        seleniumBase.checkIsElementEnabled(HOME_PAGE_ACCESS_CONTROL_MENU_TITLE_XPATH);
        return seleniumBase.getText(HOME_PAGE_ACCESS_CONTROL_MENU_TITLE_CSS,HOME_PAGE_ACCESS_CONTROL_MENU_TITLE_XPATH);
    }

    public String check_Group_Users_Link() {
        seleniumBase.checkIsElementEnabled(HOME_PAGE_GROUP_USERS_MENU_ITEM_XPATH);
        return seleniumBase.getText(HOME_PAGE_GROUP_USERS_MENU_ITEM_CSS,HOME_PAGE_GROUP_USERS_MENU_ITEM_XPATH);
    }

    public String check_Group_Access_Link() {
        seleniumBase.checkIsElementEnabled(HOME_PAGE_GROUP_ACCESS_MENU_ITEM_XPATH);
        return seleniumBase.getText(HOME_PAGE_GROUP_ACCESS_MENU_ITEM_CSS,HOME_PAGE_GROUP_ACCESS_MENU_ITEM_XPATH);
    }

    public String check_User_Branch_Access_Link() {
        seleniumBase.checkIsElementEnabled(HOME_PAGE_USER_BRANCH_ACCESS_ITEM_XPATH);
        return seleniumBase.getText(HOME_PAGE_USER_BRANCH_ACCESS_ITEM_CSS,HOME_PAGE_USER_BRANCH_ACCESS_ITEM_XPATH);
    }

    public String check_Access_Delegation_Link() {
        seleniumBase.checkIsElementEnabled(HOME_PAGE_ACCESS_DELEGATION_MENU_ITEM_XPATH);
        return seleniumBase.getText(HOME_PAGE_ACCESS_DELEGATION_MENU_ITEM_CSS,HOME_PAGE_ACCESS_DELEGATION_MENU_ITEM_XPATH);
    }

    public String check_Mobile_Access_Link() {
        seleniumBase.checkIsElementEnabled(HOME_PAGE_MOBILE_ACCESS_MENU_ITEM_XPATH);
        return seleniumBase.getText(HOME_PAGE_MOBILE_ACCESS_MENU_ITEM_CSS,HOME_PAGE_MOBILE_ACCESS_MENU_ITEM_XPATH);
    }

    //Product Master

    public String check_Product_Master_Section_Text() {
        seleniumBase.checkIsElementEnabled(HOME_PAGE_PRODUCT_MASTER_TEXT_XPATH);
        return seleniumBase.getText(HOME_PAGE_PRODUCT_MASTER_TEXT_CSS,HOME_PAGE_PRODUCT_MASTER_TEXT_XPATH);
    }

    public String check_Product_Menu_Title() {
        seleniumBase.checkIsElementEnabled(HOME_PAGE_PRODUCT_MENU_TITLE_XPATH);
        return seleniumBase.getText(HOME_PAGE_PRODUCT_MENU_TITLE_CSS,HOME_PAGE_PRODUCT_MENU_TITLE_XPATH);
    }

    public String check_UOM_Link() {
        seleniumBase.checkIsElementEnabled(HOME_PAGE_UOM_MENU_ITEM_XPATH);
        return seleniumBase.getText(HOME_PAGE_UOM_MENU_ITEM_CSS,HOME_PAGE_UOM_MENU_ITEM_XPATH);
    }

    public String check_Item_Category_Link() {
        seleniumBase.checkIsElementEnabled(HOME_PAGE_ITEM_CATEGORY_MENU_ITEM_XPATH);
        return seleniumBase.getText(HOME_PAGE_ITEM_CATEGORY_MENU_ITEM_CSS,HOME_PAGE_ITEM_CATEGORY_MENU_ITEM_XPATH);
    }

    public String check_Item_Link() {
        seleniumBase.checkIsElementEnabled(HOME_PAGE_ITEM_MENU_ITEM_XPATH);
        return seleniumBase.getText(HOME_PAGE_ITEM_MENU_ITEM_CSS,HOME_PAGE_ITEM_MENU_ITEM_XPATH);
    }

    //Transaction

    public String check_Transaction_Section_Text() {
        seleniumBase.checkIsElementEnabled(HOME_PAGE_TRANSACTION_TEXT_XPATH);
        return seleniumBase.getText(HOME_PAGE_TRANSACTION_TEXT_CSS,HOME_PAGE_TRANSACTION_TEXT_XPATH);
    }

    public String check_Sales_Menu_Title() {
        seleniumBase.checkIsElementEnabled(HOME_PAGE_SALES_MENU_TITLE_XPATH);
        return seleniumBase.getText(HOME_PAGE_SALES_MENU_TITLE_CSS,HOME_PAGE_SALES_MENU_TITLE_XPATH);
    }

    public String check_Sales_Area_Link() {
        seleniumBase.checkIsElementEnabled(HOME_PAGE_SALES_AREA_MENU_ITEM_XPATH);
        return seleniumBase.getText(HOME_PAGE_SALES_AREA_MENU_ITEM_CSS,HOME_PAGE_SALES_AREA_MENU_ITEM_XPATH);
    }

    public String check_Sales_Route_Link() {
        seleniumBase.checkIsElementEnabled(HOME_PAGE_SALES_ROUTE_MENU_ITEM_XPATH);
        return seleniumBase.getText(HOME_PAGE_SALES_ROUTE_MENU_ITEM_CSS,HOME_PAGE_SALES_ROUTE_MENU_ITEM_XPATH);
    }

    public String check_Employee_Sales_Route_Link() {
        seleniumBase.checkIsElementEnabled(HOME_PAGE_EMPLOYEE_SALES_ROUTE_MENU_ITEM_XPATH);
        return seleniumBase.getText(HOME_PAGE_EMPLOYEE_SALES_ROUTE_MENU_ITEM_CSS,HOME_PAGE_EMPLOYEE_SALES_ROUTE_MENU_ITEM_XPATH);
    }

    public String check_Sales_Visit_Plan_Link() {
        seleniumBase.checkIsElementEnabled(HOME_PAGE_SALES_VISIT_PLAN_MENU_ITEM_XPATH);
        return seleniumBase.getText(HOME_PAGE_SALES_VISIT_PLAN_MENU_ITEM_CSS,HOME_PAGE_SALES_VISIT_PLAN_MENU_ITEM_XPATH);
    }

    public String check_Vehicle_Link() {
        seleniumBase.checkIsElementEnabled(HOME_PAGE_VEHICLE_MENU_ITEM_XPATH);
        return seleniumBase.getText(HOME_PAGE_VEHICLE_MENU_ITEM_CSS,HOME_PAGE_VEHICLE_MENU_ITEM_XPATH);
    }

    public String check_Sales_Order_Link() {
        seleniumBase.checkIsElementEnabled(HOME_PAGE_SALES_ORDER_MENU_ITEM_XPATH);
        return seleniumBase.getText(HOME_PAGE_SALES_ORDER_MENU_ITEM_CSS,HOME_PAGE_SALES_ORDER_MENU_ITEM_XPATH);
    }

    public String check_Sales_Tax_Link() {
        seleniumBase.checkIsElementEnabled(HOME_PAGE_SALES_TAX_MENU_ITEM_XPATH);
        return seleniumBase.getText(HOME_PAGE_SALES_TAX_MENU_ITEM_CSS,HOME_PAGE_SALES_TAX_MENU_ITEM_XPATH);
    }

    public String check_Sales_Tax_Class_Link() {
        seleniumBase.checkIsElementEnabled(HOME_PAGE_SALES_TAX_CLASS_MENU_ITEM_XPATH);
        return seleniumBase.getText(HOME_PAGE_SALES_TAX_CLASS_MENU_ITEM_CSS,HOME_PAGE_SALES_TAX_CLASS_MENU_ITEM_XPATH);
    }

    public String check_Sales_Tax_Class_Mapping_Link() {
        seleniumBase.checkIsElementEnabled(HOME_PAGE_SALES_TAX_CLASS_MAPPING_MENU_ITEM_XPATH);
        return seleniumBase.getText(HOME_PAGE_SALES_TAX_CLASS_MAPPING_MENU_ITEM_CSS,HOME_PAGE_SALES_TAX_CLASS_MAPPING_MENU_ITEM_XPATH);
    }

    public String check_Invoice_Link() {
        seleniumBase.checkIsElementEnabled(HOME_PAGE_INVOICE_MENU_ITEM_XPATH);
        return seleniumBase.getText(HOME_PAGE_INVOICE_MENU_ITEM_CSS,HOME_PAGE_INVOICE_MENU_ITEM_XPATH);
    }

    public String check_Vehicle_Load_Request_Link() {
        seleniumBase.checkIsElementEnabled(HOME_PAGE_VEHICLE_LOAD_REQUEST_MENU_ITEM_XPATH);
        return seleniumBase.getText(HOME_PAGE_VEHICLE_LOAD_REQUEST_MENU_ITEM_CSS,HOME_PAGE_VEHICLE_LOAD_REQUEST_MENU_ITEM_XPATH);
    }

    public String check_Dispatch_Note_Link() {
        seleniumBase.checkIsElementEnabled(HOME_PAGE_DISPATCH_NOTE_MENU_ITEM_XPATH);
        return seleniumBase.getText(HOME_PAGE_DISPATCH_NOTE_MENU_ITEM_CSS,HOME_PAGE_DISPATCH_NOTE_MENU_ITEM_XPATH);
    }

    public String check_Supervisor_Sales_Area_Link() {
        seleniumBase.checkIsElementEnabled(HOME_PAGE_SUPERVISOR_SALES_AREA_MENU_ITEM_XPATH);
        return seleniumBase.getText(HOME_PAGE_SUPERVISOR_SALES_AREA_MENU_ITEM_CSS,HOME_PAGE_SUPERVISOR_SALES_AREA_MENU_ITEM_XPATH);
    }

    //Page Navigation

    //Administration
    public String verify_Navigate_To_Account_Page() {
        seleniumBase.click(HOME_PAGE_ACCOUNT_MENU_ITEM_XPATH,HOME_PAGE_ACCOUNT_MENU_ITEM_CSS);
        return seleniumBase.getTitle();
    }

    public String verify_Navigate_To_Account_Branch_Page() {
        seleniumBase.click(HOME_PAGE_ACCOUNT_BRANCH_MENU_ITEM_XPATH,HOME_PAGE_ACCOUNT_BRANCH_MENU_ITEM_CSS);
        return seleniumBase.getTitle();
    }

    public String verify_Navigate_To_Department_Page() {
        seleniumBase.click(HOME_PAGE_DEPARTMENT_MENU_ITEM_XPATH,HOME_PAGE_DEPARTMENT_MENU_ITEM_CSS);
        return seleniumBase.getTitle();
    }

    public String verify_Navigate_To_Designation_Page() {
        seleniumBase.click(HOME_PAGE_DESIGNATION_MENU_ITEM_XPATH,HOME_PAGE_DESIGNATION_MENU_ITEM_CSS);
        return seleniumBase.getTitle();
    }

    public String verify_Navigate_To_Employee_Page() {
        seleniumBase.click(HOME_PAGE_EMPLOYEE_MENU_ITEM_XPATH,HOME_PAGE_EMPLOYEE_MENU_ITEM_CSS);
        return seleniumBase.getTitle();
    }

    public String verify_Navigate_To_Employee_Role_Mapping_Page() {
        seleniumBase.click(HOME_PAGE_EMPLOYEE_ROLE_MAPPING_MENU_ITEM_XPATH,HOME_PAGE_EMPLOYEE_ROLE_MAPPING_MENU_ITEM_CSS);
        return seleniumBase.getTitle();
    }

    public String verify_Navigate_To_Supervisor_Employee_Mapping_Page() {
        seleniumBase.click(HOME_PAGE_SUPERVISOR_EMPLOYEE_MAPPING_MENU_ITEM_XPATH, HOME_PAGE_SUPERVISOR_EMPLOYEE_MAPPING_MENU_ITEM_CSS);
        return seleniumBase.getTitle();
    }

    //Security
    public String verify_Navigate_To_System_User_Page() {
        seleniumBase.click(HOME_PAGE_SYSTEM_USER_MENU_ITEM_XPATH,HOME_PAGE_SYSTEM_USER_MENU_ITEM_CSS);
        return seleniumBase.getTitle();
    }

    public String verify_Navigate_To_User_Groups_Page() {
        seleniumBase.click(HOME_PAGE_USER_GROUPS_MENU_ITEM_XPATH,HOME_PAGE_USER_GROUPS_MENU_ITEM_CSS);
        return seleniumBase.getTitle();
    }

     public String verify_Navigate_To_Group_Users_Page() {
        seleniumBase.click(HOME_PAGE_GROUP_USERS_MENU_ITEM_XPATH,HOME_PAGE_GROUP_USERS_MENU_ITEM_CSS);
         return seleniumBase.getTitle();
    }

    public String verify_Navigate_To_Group_Access_Page() {
        seleniumBase.click(HOME_PAGE_GROUP_ACCESS_MENU_ITEM_XPATH,HOME_PAGE_GROUP_ACCESS_MENU_ITEM_CSS);
        return seleniumBase.getTitle();
    }

    public String verify_Navigate_To_User_Branch_Access_Page() {
        seleniumBase.click(HOME_PAGE_USER_BRANCH_ACCESS_ITEM_XPATH,HOME_PAGE_USER_BRANCH_ACCESS_ITEM_CSS);
        return seleniumBase.getTitle();
    }

    public String verify_Navigate_To_Access_Delegation_Page() {
        seleniumBase.click(HOME_PAGE_ACCESS_DELEGATION_MENU_ITEM_XPATH,HOME_PAGE_ACCESS_DELEGATION_MENU_ITEM_CSS);
        return seleniumBase.getTitle();
    }

    public String verify_Navigate_To_Mobile_Access_Page() {
        seleniumBase.click(HOME_PAGE_MOBILE_ACCESS_MENU_ITEM_XPATH,HOME_PAGE_MOBILE_ACCESS_MENU_ITEM_CSS);
        return seleniumBase.getTitle();
    }

    //Product  Master

    public String verify_Navigate_To_UOM_Page() {
        seleniumBase.click(HOME_PAGE_UOM_MENU_ITEM_XPATH, HOME_PAGE_UOM_MENU_ITEM_CSS);
        return seleniumBase.getTitle();
    }

    public String verify_Navigate_To_Item_Category_Page() {
        seleniumBase.click(HOME_PAGE_ITEM_CATEGORY_MENU_ITEM_XPATH,HOME_PAGE_ITEM_CATEGORY_MENU_ITEM_CSS);
        return seleniumBase.getTitle();
    }

    public String verify_Navigate_To_Item_Page() {
        seleniumBase.click(HOME_PAGE_ITEM_MENU_ITEM_XPATH,HOME_PAGE_ITEM_MENU_ITEM_CSS);
        return seleniumBase.getTitle();
    }

    //Transactions

    public String verify_Navigate_To_Sales_Area_Page() {
        seleniumBase.click(HOME_PAGE_SALES_AREA_MENU_ITEM_XPATH,HOME_PAGE_SALES_AREA_MENU_ITEM_CSS);
        return seleniumBase.getTitle();
    }

    public String verify_Navigate_To_Sales_Route_Page() {
        seleniumBase.click(HOME_PAGE_SALES_ROUTE_MENU_ITEM_XPATH,HOME_PAGE_SALES_ROUTE_MENU_ITEM_CSS);
        return seleniumBase.getTitle();
    }

    public String verify_Navigate_To_Employee_Sales_Route_Page() {
        seleniumBase.click(HOME_PAGE_EMPLOYEE_SALES_ROUTE_MENU_ITEM_XPATH,HOME_PAGE_EMPLOYEE_SALES_ROUTE_MENU_ITEM_CSS);
        return seleniumBase.getTitle();
    }

    public String verify_Navigate_To_Sales_Visit_Plan_Page() {
        seleniumBase.click(HOME_PAGE_SALES_VISIT_PLAN_MENU_ITEM_XPATH,HOME_PAGE_SALES_VISIT_PLAN_MENU_ITEM_CSS);
        return seleniumBase.getTitle();
    }

    public String verify_Navigate_To_Vehicle_Page() {
        seleniumBase.click(HOME_PAGE_VEHICLE_MENU_ITEM_XPATH,HOME_PAGE_VEHICLE_MENU_ITEM_CSS);
        return seleniumBase.getTitle();
    }
    public String verify_Navigate_To_Sales_Order_Page() {
        seleniumBase.click(HOME_PAGE_SALES_ORDER_MENU_ITEM_XPATH,HOME_PAGE_SALES_ORDER_MENU_ITEM_CSS);
        return seleniumBase.getTitle();
    }

    public String verify_Navigate_To_Sales_Tax_Page() {
        seleniumBase.click(HOME_PAGE_SALES_TAX_MENU_ITEM_XPATH,HOME_PAGE_SALES_TAX_MENU_ITEM_CSS);
        return seleniumBase.getTitle();
    }

    public String verify_Navigate_To_Sales_Tax_Class_Page() {
        seleniumBase.click(HOME_PAGE_SALES_TAX_CLASS_MENU_ITEM_XPATH,HOME_PAGE_SALES_TAX_CLASS_MENU_ITEM_CSS);
        return seleniumBase.getTitle();
    }

    public String verify_Navigate_To_Sales_Tax_Class_Mapping_Page() {
        seleniumBase.click(HOME_PAGE_SALES_TAX_CLASS_MAPPING_MENU_ITEM_XPATH,HOME_PAGE_SALES_TAX_CLASS_MAPPING_MENU_ITEM_CSS);
        return seleniumBase.getTitle();
    }

    public String verify_Navigate_To_Invoice_Page() {
        seleniumBase.click(HOME_PAGE_INVOICE_MENU_ITEM_XPATH,HOME_PAGE_INVOICE_MENU_ITEM_CSS);
        return seleniumBase.getTitle();
    }

    public String verify_Navigate_To_Vehicle_Load_Request_Page() {
        seleniumBase.click(HOME_PAGE_VEHICLE_LOAD_REQUEST_MENU_ITEM_XPATH,HOME_PAGE_VEHICLE_LOAD_REQUEST_MENU_ITEM_CSS);
        return seleniumBase.getTitle();
    }

    public String verify_Navigate_To_Dispatch_Note_Page() {
        seleniumBase.click(HOME_PAGE_DISPATCH_NOTE_MENU_ITEM_XPATH,HOME_PAGE_DISPATCH_NOTE_MENU_ITEM_CSS);
        return seleniumBase.getTitle();
    }

    public String verify_Navigate_To_Supervisor_Sales_Area_Page() {
        seleniumBase.click(HOME_PAGE_SUPERVISOR_SALES_AREA_MENU_ITEM_XPATH,HOME_PAGE_SUPERVISOR_SALES_AREA_MENU_ITEM_CSS);
        return seleniumBase.getTitle();
    }

}



