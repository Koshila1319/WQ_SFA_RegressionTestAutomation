package com.webQuarters.qa.test;

import com.webQuarters.qa.automation.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by e.koshila on 3/19/2020.
 */
public class SFAHomeTest extends TestBase {

    @BeforeMethod
    public void NavigateToLoginPage() throws Exception {
        initDomainObjects(DRIVER);
        String siteUrl = data.getValueByName("SFAUrl");
        setSiteURL(siteUrl);

        String Uname = data.getValueByName("VALIDUNAME");
        String Password = data.getValueByName("VALIDPASSWORD");

        Thread.sleep(5000);
        sfaLoginPage.
                step_User_Enter_Given_Credentials(Uname,Password).
                step_User_Click_Login_Button();
    }

    @AfterMethod
    public void endTestMethod() throws Throwable{
        Thread.sleep(3000);
        quitDriver();
    }


    //-----------UI Testing-------------

    //WQ logo
    @Test
    public void verify_The_WQ_Logo_Is_Available() {
        sfaHomePage.check_WQ_Logo_Is_Available();
    }

    //Home page browser title
    @Test
    public void verify_The_Home_Page_Browser_Title() {
        String title=data.getValueByName("HomePageBrowserTitle");
        Assert.assertEquals(sfaHomePage.check_Home_Page_Browser_Title(), title);
    }

    //TesCase -3892
    //Validate Profile details
    @Test
    public void verify_The_Home_Page_Profile_Details() {
        sfaHomePage.check_Profile_Image_Is_Available();
        sfaHomePage.check_Profile_Name_Is_Available();
        sfaHomePage.check_Profile_Email_Is_Available();
    }

    //TestCase - 3880
    //Validate Company Name
    @Test
    public void verify_Company_Name_Details() {
        sfaHomePage.check_Company_Name_Details();
        String CompanyName = data.getValueByName("CompanyNameDetails");
        Assert.assertEquals(sfaHomePage.check_Company_Name_Details(), CompanyName);
    }

    //TestCase - 3881
    //Validate Navigation links - Administration Section
    @Test
    public void check_Administration_Section_Text() {
        sfaHomePage.check_Administration_Section_Text();
        String AdministrationSectionText = data.getValueByName("AdministrationSectionText");
        Assert.assertEquals(sfaHomePage.check_Administration_Section_Text(), AdministrationSectionText);
    }

    @Test
    public void check_Account_Master_Menu_Title() {
        String AccountMenuTitleText = data.getValueByName("AccountMasterMenuTitleText");
        Assert.assertEquals(sfaHomePage.check_Account_Master_Menu_Title(), AccountMenuTitleText);
    }

    @Test
    public void check_Account_Link() {
        String AccountLinkText = data.getValueByName("AccountLinkText");
        Assert.assertEquals(sfaHomePage.check_Account_Link(), AccountLinkText);
    }

    @Test
    public void check_Account_Branch_Link() {
        String AccountBranchtLinkText = data.getValueByName("AccountBranchLinkText");
        Assert.assertEquals(sfaHomePage.check_Account_Branch_Link(), AccountBranchtLinkText);
    }

    @Test
    public void check_Department_Link() {
        String DepartmentLinkText = data.getValueByName("DepartmentLinkText");
        Assert.assertEquals(sfaHomePage.check_Department_Link(), DepartmentLinkText);
    }

    @Test
    public void check_Designation_Link() {
        String DesignationLinkText = data.getValueByName("DesignationLinkText");
        Assert.assertEquals(sfaHomePage.check_Designation_Link(), DesignationLinkText);
    }

    @Test
    public void check_Employee_Link() {
        String EmployeeLinkText = data.getValueByName("EmployeeLinkText");
        Assert.assertEquals(sfaHomePage.check_Employee_Link(), EmployeeLinkText);
    }

    @Test
    public void check_Employee_Role_Mapping_Link() {
        String EmployeeRoleMapLinkText = data.getValueByName("EmployeeRoleMappingLinkText");
        Assert.assertEquals(sfaHomePage.check_Employee_Role_Mapping_Link(), EmployeeRoleMapLinkText);
    }

    @Test
    public void check_Supervisor_Employee_Mapping_Link() {
        String SupervisorEmpMapLinkText = data.getValueByName("SupervisorEmployeeMappingLinkText");
        Assert.assertEquals(sfaHomePage.check_Supervisor_Employee_Mapping_Link(), SupervisorEmpMapLinkText);
    }

    //Validate Navigation links - Security Section

    @Test
    public void check_Security_Section_Text() {
        String SecuritySectionText = data.getValueByName("SecuritySectionText");
        Assert.assertEquals(sfaHomePage.check_Security_Section_Text(), SecuritySectionText);
    }

    @Test
    public void check_Security_Master_Menu_Title() {
        String SecurityMenuTitleText = data.getValueByName("SecurityMasterMenuTitleText");
        Assert.assertEquals(sfaHomePage.check_Security_Master_Menu_Title(), SecurityMenuTitleText);
    }

    @Test
    public void check_System_User_Link() {
        String SystemUserLinkText = data.getValueByName("SystemUserLinkText");
        Assert.assertEquals(sfaHomePage.check_System_User_Link(), SystemUserLinkText);
    }

    @Test
    public void check_User_Groups_Link() {
        String UserGroupsLinkText = data.getValueByName("UserGroupsLinkText");
        Assert.assertEquals(sfaHomePage.check_User_Groups_Link(), UserGroupsLinkText);
    }

    @Test
    public void check_Access_Control_Menu_Title() {
        String AccessControlMenuTitleText = data.getValueByName("AccessControlMenuTitleText");
        Assert.assertEquals(sfaHomePage.check_Access_Control_Master_Menu_Title(), AccessControlMenuTitleText);
    }

    @Test
    public void check_Group_Users_Link() {
        String GroupUsersLinkText = data.getValueByName("GroupUsersLinkText");
        Assert.assertEquals(sfaHomePage.check_Group_Users_Link(), GroupUsersLinkText);
    }

    @Test
    public void check_Group_Access_Link() {
        String GroupAccessLinkText = data.getValueByName("GroupAccessLinkText");
        Assert.assertEquals(sfaHomePage.check_Group_Access_Link(), GroupAccessLinkText);
    }

    @Test
    public void check_User_Branch_Access_Link() {
        String UserBranchAccessLinkText = data.getValueByName("UserBranchAccessLinkText");
        Assert.assertEquals(sfaHomePage.check_User_Branch_Access_Link(), UserBranchAccessLinkText);
    }

    @Test
    public void check_Access_Delegation_Link() {
        String AccessDelegationLinkText = data.getValueByName("AccessDelegationLinkText");
        Assert.assertEquals(sfaHomePage.check_Access_Delegation_Link(), AccessDelegationLinkText);
    }

    @Test
    public void check_Mobile_Access_Link() {
        String MobileAccessLinkText = data.getValueByName("MobileAccessLinkText");
        Assert.assertEquals(sfaHomePage.check_Mobile_Access_Link(), MobileAccessLinkText);
    }

    //Validate Navigation links - Product Master Section

    @Test
    public void check_Product_Master_Section_Text() {
        String ProductMasterSectionText = data.getValueByName("ProductMasterSectionText");
        Assert.assertEquals(sfaHomePage.check_Product_Master_Section_Text(), ProductMasterSectionText);
    }

    @Test
    public void check_Product_Menu_Title() {
        String ProductMenuTitleText = data.getValueByName("ProductMenuTitleText");
        Assert.assertEquals(sfaHomePage.check_Product_Menu_Title(), ProductMenuTitleText);
    }

    @Test
    public void check_UOM_Link() {
        String UOMLinkText = data.getValueByName("UOMLinkText");
        Assert.assertEquals(sfaHomePage.check_UOM_Link(), UOMLinkText);
    }

    @Test
    public void check_Item_Category_Link() {
        String ItemCategoryLinkText = data.getValueByName("ItemCategoryLinkText");
        Assert.assertEquals(sfaHomePage.check_Item_Category_Link(), ItemCategoryLinkText);
    }

    @Test
    public void check_Item_Link() {
        String ItemLinkText = data.getValueByName("ItemLinkText");
        Assert.assertEquals(sfaHomePage.check_Item_Link(), ItemLinkText);
    }

    //Validate Navigation links - Transaction Section

    @Test
    public void check_Transaction_Section_Text() {
        String TransactionSectionText = data.getValueByName("TransactionSectionText");
        Assert.assertEquals(sfaHomePage.check_Transaction_Section_Text(), TransactionSectionText);
    }

    @Test
    public void check_Sales_Menu_Title() {
        String SalesMenuTitleText = data.getValueByName("SalesMenuTitleText");
        Assert.assertEquals(sfaHomePage.check_Sales_Menu_Title(), SalesMenuTitleText);
    }

    @Test
    public void check_Sales_Area_Link() {
        String SalesAreaLinkText = data.getValueByName("SalesAreaLinkText");
        Assert.assertEquals(sfaHomePage.check_Sales_Area_Link(), SalesAreaLinkText);
    }

    @Test
    public void check_Sales_Route_Link() {
        String SalesRouteLinkText = data.getValueByName("SalesRouteLinkText");
        Assert.assertEquals(sfaHomePage.check_Sales_Route_Link(), SalesRouteLinkText);
    }

    @Test
    public void check_Employee_Sales_Route_Link() {
        String EmployeeSaleRouteLinkText = data.getValueByName("EmployeeSaleRouteLinkText");
        Assert.assertEquals(sfaHomePage.check_Employee_Sales_Route_Link(), EmployeeSaleRouteLinkText);
    }

    @Test
    public void check_Sales_Visit_Plan_Link() {
        String SalesVisitPlanLinkText = data.getValueByName("SalesVisitPlanLinkText");
        Assert.assertEquals(sfaHomePage.check_Sales_Visit_Plan_Link(), SalesVisitPlanLinkText);
    }

    @Test
    public void check_Vehicle_Link() {
        String VehicleLinkText = data.getValueByName("VehicleLinkText");
        Assert.assertEquals(sfaHomePage.check_Vehicle_Link(), VehicleLinkText);
    }

    @Test
    public void check_Sales_Order_Link() {
        String SalesOrderLinkText = data.getValueByName("SalesOrderLinkText");
        Assert.assertEquals(sfaHomePage.check_Sales_Order_Link(), SalesOrderLinkText);
    }

    @Test
    public void check_Sales_Tax_Link() {
        String SalesTaxLinkText = data.getValueByName("SalesTaxLinkText");
        Assert.assertEquals(sfaHomePage.check_Sales_Tax_Link(), SalesTaxLinkText);
    }

    @Test
    public void check_Sales_Tax_Class_Link() {
        String SalesTaxClassLinkText = data.getValueByName("SalesTaxClassLinkText");
        Assert.assertEquals(sfaHomePage.check_Sales_Tax_Class_Link(), SalesTaxClassLinkText);
    }

    @Test
    public void check_Sales_Tax_Class_Mapping_Link() {
        String SalesTaxClassMappingLinkText = data.getValueByName("SalesTaxClassMappingLinkText");
        Assert.assertEquals(sfaHomePage.check_Sales_Tax_Class_Mapping_Link(), SalesTaxClassMappingLinkText);
    }

    @Test
    public void check_Invoice_Link() {
        String InvoiceLinkText = data.getValueByName("InvoiceLinkText");
        Assert.assertEquals(sfaHomePage.check_Invoice_Link(), InvoiceLinkText);
    }

    @Test
    public void check_Vehicle_Load_Request_Link() {
        String VehicleLoadRequestLinkText = data.getValueByName("VehicleLoadRequestLinkText");
        Assert.assertEquals(sfaHomePage.check_Vehicle_Load_Request_Link(), VehicleLoadRequestLinkText);
    }

    @Test
    public void check_Dispatch_Note_Link() {
        String DispatchNoteLinkText = data.getValueByName("DispatchNoteLinkText");
        Assert.assertEquals(sfaHomePage.check_Dispatch_Note_Link(), DispatchNoteLinkText);
    }

    @Test
    public void check_Supervisor_Sales_Area_Link() {
        String SupervisorSalesAreaLinkText = data.getValueByName("SupervisorSalesAreaLinkText");
        Assert.assertEquals(sfaHomePage.check_Supervisor_Sales_Area_Link(), SupervisorSalesAreaLinkText);
    }

    //----------Functional Testing---------------

    //TestCase - 3882
    //Validate the Page Navigation from the left Navigation Panel links - Administration

    @Test
    public void validate_Navigation_To_Account_Page() {
        String AccountPageBrowserTitle = data.getValueByName("AccountPageBrowserTitle");
        Assert.assertEquals(sfaHomePage.verify_Navigate_To_Account_Page(), AccountPageBrowserTitle);
    }

    @Test
    public void validate_Navigation_To_Account_Branch_Page() {
        String AccountBranchPageBrowserTitle = data.getValueByName("AccountBranchPageBrowserTitle");
        Assert.assertEquals(sfaHomePage.verify_Navigate_To_Account_Branch_Page(), AccountBranchPageBrowserTitle);
    }

    @Test
    public void validate_Navigation_To_Department_Page() {
        String DepartmentPageBrowserTitle = data.getValueByName("DepartmentPageBrowserTitle");
        Assert.assertEquals(sfaHomePage.verify_Navigate_To_Department_Page(), DepartmentPageBrowserTitle);
    }

    @Test
    public void validate_Navigation_To_Designation_Page() {
        String DesignationPageBrowserTitle = data.getValueByName("DesignationPageBrowserTitle");
        Assert.assertEquals(sfaHomePage.verify_Navigate_To_Designation_Page(), DesignationPageBrowserTitle);
    }

    @Test
    public void validate_Navigation_To_Employee_Page() {
        String EmployeePageBrowserTitle = data.getValueByName("EmployeePageBrowserTitle");
        Assert.assertEquals(sfaHomePage.verify_Navigate_To_Employee_Page(), EmployeePageBrowserTitle);
    }

    @Test
    public void validate_Navigation_To_Employee_Role_Mapping_Page() {
        String EmployeeRoleMapPageBrowserTitle = data.getValueByName("EmployeeRoleMappingPageBrowserTitle");
        Assert.assertEquals(sfaHomePage.verify_Navigate_To_Employee_Role_Mapping_Page(), EmployeeRoleMapPageBrowserTitle);
    }

    @Test
    public void validate_Navigation_To_Supervisor_Employee_Mapping_Page() {
        String SupervisorEmpMapPageBrowserTitle = data.getValueByName("SupervisorEmployeeMappingPageBrowserTitle");
        Assert.assertEquals(sfaHomePage.verify_Navigate_To_Supervisor_Employee_Mapping_Page(), SupervisorEmpMapPageBrowserTitle);
    }

    //Validate the Page Navigation from the left Navigation Panel links - Security

    @Test
    public void validate_Navigation_To_System_User_Page() {
        String SystemUserPageBrowserTitle = data.getValueByName("SystemUserPageBrowserTitle");
        Assert.assertEquals(sfaHomePage.verify_Navigate_To_System_User_Page(), SystemUserPageBrowserTitle);
    }

    @Test
    public void validate_Navigation_To_User_Groups_Page() {
        String UserGroupsPageBrowserTitle = data.getValueByName("UserGroupsPageBrowserTitle");
        Assert.assertEquals(sfaHomePage.verify_Navigate_To_User_Groups_Page(), UserGroupsPageBrowserTitle);
    }

    @Test
    public void validate_Navigation_To_Group_Users_Page() {
        String GroupUsersPageBrowserTitle = data.getValueByName("GroupUsersPageBrowserTitle");
        Assert.assertEquals(sfaHomePage.verify_Navigate_To_Group_Users_Page(), GroupUsersPageBrowserTitle);
    }

    @Test
    public void validate_Navigation_To_Group_Access_Page() {
        String GroupAccessPageBrowserTitle = data.getValueByName("GroupAccessPageBrowserTitle");
        Assert.assertEquals(sfaHomePage.verify_Navigate_To_Group_Access_Page(), GroupAccessPageBrowserTitle);
    }

    @Test
    public void validate_Navigation_To_User_Branch_Access_Page() {
        String UserBranchAccessPageBrowserTitle = data.getValueByName("UserBranchAccessPageBrowserTitle");
        Assert.assertEquals(sfaHomePage.verify_Navigate_To_User_Branch_Access_Page(), UserBranchAccessPageBrowserTitle);
    }

    @Test
    public void validate_Navigation_To_Access_Delegation_Page() {
        String AccessDelegationPageBrowserTitle = data.getValueByName("AccessDelegationPageBrowserTitle");
        Assert.assertEquals(sfaHomePage.verify_Navigate_To_Access_Delegation_Page(), AccessDelegationPageBrowserTitle);
    }

    @Test
    public void validate_Navigation_To_Mobile_Access_Page() {
        String MobileAccessPageBrowserTitle = data.getValueByName("MobileAccessPageBrowserTitle");
        Assert.assertEquals(sfaHomePage.verify_Navigate_To_Mobile_Access_Page(), MobileAccessPageBrowserTitle);
    }

    //Validate the Page Navigation from the left Navigation Panel links - Product Master
    @Test
    public void validate_Navigation_To_UOM_Page() {
        String UOMPageBrowserTitle = data.getValueByName("UOMPageBrowserTitle");
        Assert.assertEquals(sfaHomePage.verify_Navigate_To_UOM_Page(), UOMPageBrowserTitle);
    }

    @Test
    public void validate_Navigation_To_Item_Category_Page() {
        String ItemCategoryPageBrowserTitle = data.getValueByName("ItemCategoryPageBrowserTile");
        Assert.assertEquals(sfaHomePage.verify_Navigate_To_Item_Category_Page(), ItemCategoryPageBrowserTitle);
    }

    @Test
    public void validate_Navigation_To_Item_Page() {
        String ItemPageBrowserTitle = data.getValueByName("ItemPageBrowserTitle");
        Assert.assertEquals(sfaHomePage.verify_Navigate_To_Item_Page(), ItemPageBrowserTitle);
    }

    //Validate the Page Navigation from the left Navigation Panel links - Transactions

    @Test
    public void validate_Navigation_To_Sales_Area_Page() {
        String SalesAreaBrowserTitle = data.getValueByName("SalesAreaBrowserTitle");
        Assert.assertEquals(sfaHomePage.verify_Navigate_To_Sales_Area_Page(), SalesAreaBrowserTitle);
    }

    @Test
    public void validate_Navigation_To_Sales_Route_Page() {
        String SalesRouteBrowserTitle = data.getValueByName("SalesRouteBrowserTitle");
        Assert.assertEquals(sfaHomePage.verify_Navigate_To_Sales_Route_Page(), SalesRouteBrowserTitle);
    }

    @Test
    public void validate_Navigation_To_Employee_Sales_Route_Page() {
        String EmployeeSaleRouteBrowserTitle = data.getValueByName("EmployeeSaleRouteBrowserTitle");
        Assert.assertEquals(sfaHomePage.verify_Navigate_To_Employee_Sales_Route_Page(), EmployeeSaleRouteBrowserTitle);
    }

    @Test
    public void validate_Navigation_To_Sales_Visit_Plan_Page() {
        String SalesVisitPlanBrowserTitle = data.getValueByName("SalesVisitPlanBrowserTitle");
        Assert.assertEquals(sfaHomePage.verify_Navigate_To_Sales_Visit_Plan_Page(), SalesVisitPlanBrowserTitle);
    }

    @Test
    public void validate_Navigation_To_Vehicle_Page() {
        String VehicleBrowserTitle = data.getValueByName("VehicleBrowserTitle");
        Assert.assertEquals(sfaHomePage.verify_Navigate_To_Vehicle_Page(), VehicleBrowserTitle);
    }

    @Test
    public void validate_Navigation_To_Sales_Order_Page() {
        String SalesOrderBrowserTitle = data.getValueByName("SalesOrderBrowserTitle");
        Assert.assertEquals(sfaHomePage.verify_Navigate_To_Sales_Order_Page(), SalesOrderBrowserTitle);
    }

    @Test
    public void validate_Navigation_To_Sales_Tax_Page() {
        String SalesTaxBrowserTitle = data.getValueByName("SalesTaxBrowserTitle");
        Assert.assertEquals(sfaHomePage.verify_Navigate_To_Sales_Tax_Page(), SalesTaxBrowserTitle);
    }

    @Test
    public void validate_Navigation_To_Sales_Tax_Class_Page() {
        String SalesTaxClassBrowserTitle = data.getValueByName("SalesTaxClassBrowserTitle");
        Assert.assertEquals(sfaHomePage.verify_Navigate_To_Sales_Tax_Class_Page(), SalesTaxClassBrowserTitle);
    }

    @Test
    public void validate_Navigation_To_Sales_Tax_Class_Mapping_Page() {
        String SalesTaxClassMappingBrowserTitle = data.getValueByName("SalesTaxClassMappingBrowserTitle");
        Assert.assertEquals(sfaHomePage.verify_Navigate_To_Sales_Tax_Class_Mapping_Page(), SalesTaxClassMappingBrowserTitle);
    }

    @Test
    public void validate_Navigation_To_Invoice_Page() {
        String InvoiceBrowserTitle = data.getValueByName("InvoiceBrowserTitle");
        Assert.assertEquals(sfaHomePage.verify_Navigate_To_Invoice_Page(), InvoiceBrowserTitle);
    }

    @Test
    public void validate_Navigation_To_Vehicle_Load_Request_Page() {
        String VehicleLoadRequestBrowserTitle = data.getValueByName("VehicleLoadRequestBrowserTitle");
        Assert.assertEquals(sfaHomePage.verify_Navigate_To_Vehicle_Load_Request_Page(), VehicleLoadRequestBrowserTitle);
    }

    @Test
    public void validate_Navigation_To_Dispatch_Note_Page() {
        String DispatchNoteBrowserTitle = data.getValueByName("DispatchNoteBrowserTitle");
        Assert.assertEquals(sfaHomePage.verify_Navigate_To_Dispatch_Note_Page(), DispatchNoteBrowserTitle);
    }

    @Test
    public void validate_Navigation_To_Supervisor_Sales_Area_Page() {
        String SupervisorSalesAreaBrowserTitle = data.getValueByName("SupervisorSalesAreaBrowserTitle");
        Assert.assertEquals(sfaHomePage.verify_Navigate_To_Supervisor_Sales_Area_Page(), SupervisorSalesAreaBrowserTitle);
    }



    //TestCase - 3877
    //Logout from the system
    @Test
    public void verify_User_Able_To_Logout_From_he_System() {
        String title=data.getValueByName("LoginPageBrowserTitle");

        sfaHomePage.action_Logout_From_The_System();
        Assert.assertEquals(sfaLoginPage.check_Login_Page_Browser_Title(), title);
    }



}
