package com.totalamber.qa.objectproperty;

public interface ElementHolder {

	public final String ROBOFORM_FORM_TITLE_NAME = "01___title";
	public final String ROBOFORM_FORM_FNAME_NAME = "02frstname";
	public final String ROBOFORM_FORM_MNAME_NAME = "03middle_i";
	public final String ROBOFORM_FORM_LNAME_NAME = "04lastname";

	public final String ROBOFORM_FORM_CCTYPE_XPATH = "html/body/div[3]/div/div/div/form/table/tbody/tr/td[2]/table/tbody/tr[5]/td[2]/select";
	public final String ROBOFORM_FORM_CCTYPE_CSS = "";

	public final String ROBOFORM_LINK_TEXT_XPATH = "html/body/div[5]/div/div[2]/ul/li[2]/a";
	public final String ROBOFORM_LINK_TEXT_CSS = "";

	public final String ROBOFORM_RESET_BUTTON_XPATH = "html/body/div[3]/div/div/div/form/p/input";
	public final String ROBOFORM_RESET_BUTTON_CSS = "";

	public final String USER_SIGNUP_LINK_XPATH = "//*[@id='ctl00_ctl39_g_696a99a9_0eba_4240_a281_5607b14ccbe8_ctl00_ButtonSignUp']";
	public final String USER_SIGNUP_LINK_CSS = "";

	//----------------------Client----------------------------

	// Client Registration
	public final String CLIENT_RADIO_BUTTON_XPATH = ".//*[@id='ctl00_ctl39_g_20FD40B8_A9C7_4F4A_BE0C_9888B6CC76E5_ctl00_RadioButtonClient']";
	public final String CLIENT_SIGNUP_PAGE_NAVIGATE_BUTTON_XPATH = ".//*[@id='ctl00_ctl39_g_20FD40B8_A9C7_4F4A_BE0C_9888B6CC76E5_ctl00_ButtonGo']";
	public final String CLIENT_SIGNUP_PAGE_NAVIGATE_BUTTON_CSS = "";

	// Client Registration - Filling client registration form

	public final String ROBOFORM_FORM_CLIENT_COMPANY_NAME = "ctl00$ctl39$g_7B6AE4AA_1CED_4039_AB72_0DE8298BCFF3$ctl00$companyNameTextBox";
	public final String ROBOFORM_FORM_CLIENT_FNAME = "ctl00$ctl39$g_7B6AE4AA_1CED_4039_AB72_0DE8298BCFF3$ctl00$firstNameTextBox";
	public final String ROBOFORM_FORM_CLIENT_LNAME = "ctl00$ctl39$g_7B6AE4AA_1CED_4039_AB72_0DE8298BCFF3$ctl00$lastNameTextBox";
	public final String ROBOFORM_FORM_CLIENT_EMAIL = "ctl00$ctl39$g_7B6AE4AA_1CED_4039_AB72_0DE8298BCFF3$ctl00$emailTextBox";
	public final String ROBOFORM_FORM_CLIENT_JOB_TITLE = "ctl00$ctl39$g_7B6AE4AA_1CED_4039_AB72_0DE8298BCFF3$ctl00$designationTextBox";
	public final String ROBOFORM_FORM_CLIENT_ADDRESS = "ctl00$ctl39$g_7B6AE4AA_1CED_4039_AB72_0DE8298BCFF3$ctl00$addressTextBox";
	public final String ROBOFORM_FORM_CLIENT_TOWN = "ctl00$ctl39$g_7B6AE4AA_1CED_4039_AB72_0DE8298BCFF3$ctl00$cityTextBox";
	public final String ROBOFORM_FORM_CLIENT_CONTACT_NUMBER = "ctl00$ctl39$g_7B6AE4AA_1CED_4039_AB72_0DE8298BCFF3$ctl00$phoneTextBox";

	public final String CLIENT_COUNTRY_DROPDOWN_XPATH = ".//*[@id='ctl00_ctl39_g_7B6AE4AA_1CED_4039_AB72_0DE8298BCFF3_ctl00_countryDropDownList']";
	public final String CLIENT_COUNTRY_DROPDOWN_CSS = "";

	public final String CLIENT_COMPANY_SIZE_XPATH = ".//*[@id='ctl00_ctl39_g_7B6AE4AA_1CED_4039_AB72_0DE8298BCFF3_ctl00_organizationSizeDropDownList']";
	public final String CLIENT_COMPANY_SIZE_CSS = "";

	public final String CLIENT_SOFTWARE_APPLICATION_XPATH = ".//*[@id='ctl00_ctl39_g_7B6AE4AA_1CED_4039_AB72_0DE8298BCFF3_ctl00_ApplicationDetaisDataList_ctl01_ApplicationNameDropDownList']";
	public final String CLIENT_SOFTWARE_APPLICATION_CSS = "";

	public final String CLIENT_MODULE_XPATH = ".//*[@id='ctl00_ctl39_g_7B6AE4AA_1CED_4039_AB72_0DE8298BCFF3_ctl00_ApplicationDetaisDataList_ctl01_moduleNameDDCheckBox_1']";
	public final String CLIENT_MODULE_DIV = ".//*[@id='ctl00_ctl39_g_7B6AE4AA_1CED_4039_AB72_0DE8298BCFF3_ctl00_ApplicationDetaisDataList']/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/div/div";

	public final String CLIENT_VERSION_XPATH = ".//*[@id='ctl00_ctl39_g_7B6AE4AA_1CED_4039_AB72_0DE8298BCFF3_ctl00_ApplicationDetaisDataList_ctl01_versionNameDDCheckBox_1']";
	public final String CLIENT_VERSION_DIV = ".//*[@id='ctl00_ctl39_g_7B6AE4AA_1CED_4039_AB72_0DE8298BCFF3_ctl00_ApplicationDetaisDataList']/tbody/tr[4]/td/table/tbody/tr[2]/td[1]/div/div";

	public final String CLIENT_HEAR_ABOUT_US_XPATH = ".//*[@id='ctl00_ctl39_g_7B6AE4AA_1CED_4039_AB72_0DE8298BCFF3_ctl00_howToKnowDropDownList']";
	public final String CLIENT_HEAR_ABOUT_US_CSS = "";

	public final String CLIENT_FORM_ADD_BUTTON_XPATH = ".//*[@id='ctl00_ctl39_g_7B6AE4AA_1CED_4039_AB72_0DE8298BCFF3_ctl00_ApplicationDetaisDataList_ctl01_AddButton']";
	public final String CLIENT_FORM_ADD_BUTTON_CSS = "";

	public final String CLIENT_FORM_DELETE_BUTTON_XPATH = ".//*[@id='ctl00_ctl39_g_7B6AE4AA_1CED_4039_AB72_0DE8298BCFF3_ctl00_ApplicationDetaisDataList_ctl01_deleteButton']";
	public final String CLIENT_FORM_DELETE_BUTTON_CSS = "";

	public final String CLIENT_FORM_SIGNUP_BUTTON_XPATH = ".//*[@id='ctl00_ctl39_g_7B6AE4AA_1CED_4039_AB72_0DE8298BCFF3_ctl00_updateButton']";
	public final String CLIENT_FORM_SIGNUP_BUTTON_CSS = "";

	public final String TEMP_EMAIL_XPATH = ".//*[@id='mail']";
	public final String TEMP_EMAIL_CSS = "";

	public final String EMAIL_XPATH = ".//*[@id='mails']/tbody/tr/td[2]/a";
	public final String EMAIL_CSS = "";

	//--------------Verification

	public final String CLIENT_REGISTRATION_PAGE_TITLE_XPATH = "//*[@id='ctl00_ctl39_g_7B6AE4AA_1CED_4039_AB72_0DE8298BCFF3']/div/h1";
	public final String SIGN_UP_MESSAGE_XPATH = "//*[@id='ctl00_ctl39_g_59093D00_64D8_43D8_8267_1B80078EC44A_ctl00_Label1']";
	public final String	VERIFICATION_EMAIL_XPATH = "//*[@id='mailsList']/table/tbody/tr[2]";
	public final String	ERROR_MESSAGE_XPATH = ".//*[@id='ctl00_ctl39_g_7B6AE4AA_1CED_4039_AB72_0DE8298BCFF3_ctl00_ErrorPanel']/div";
	public final String ACTIVATE_EMAIL_XPATH = "//*[@id='mailsList']/table/tbody/tr[2]/td[2]";


	// Client - Login
	public final String CLIENT_LOGIN_BUTTON_XPATH = ".//*[@id='ctl00_ctl39_g_696a99a9_0eba_4240_a281_5607b14ccbe8_ctl00_ButtonLogin']";
	public final String CLIENT_LOGIN_BUTTON_CSS = "";

	public final String CLIENT_LOGIN_USERNAME_XPATH = ".//*[@id='ctl00_PlaceHolderMain_signInControl_UserName']";
	public final String CLIENT_LOGIN_USERNAME_CSS = "";

	public final String CLIENT_LOGIN_PASSWORD_XPATH = ".//*[@id='ctl00_PlaceHolderMain_signInControl_Password']";
	public final String CLIENT_LOGIN_PASSWORD_CSS = "";

	public final String CLIENT_LOGME_BUTTON_XPATH = ".//*[@id='ctl00_PlaceHolderMain_signInControl_LoginButton']";
	public final String CLIENT_LOGME_BUTTON_CSS = "";

	public final String CLIENT_NEW_PASSWORD_XPATH = ".//*[@id='ctl00_ctl39_g_034FB431_9C6B_4493_B428_B9F414106C84_TextBoxPassword']";
	public final String CLIENT_NEW_PASSWORD_CSS = "";

	public final String CLIENT_CONFIRM_PASSWORD_XPATH = ".//*[@id='ctl00_ctl39_g_034FB431_9C6B_4493_B428_B9F414106C84_TextBoxConfirmPassword']";
	public final String CLIENT_CONFIRM_PASSWORD_CSS = "";

	public final String CLIENT_CHANGE_PASSWORD_BUTTON_XPATH = ".//*[@id='ctl00_ctl39_g_034FB431_9C6B_4493_B428_B9F414106C84_ButtonChangePassword']";
	public final String CLIENT_CHANGE_PASSWORD_BUTTON_CSS = "";

	public final String CLIENT_CONFIRM_BUTTON_XPATH = ".//*[@id='ctl00_ctl39_g_D5854E90_EB25_4EB2_A397_6A579B5078D5_ctl00_buttonConfirm']";
	public final String CLIENT_CONFIRM_BUTTON_CSS = "";

	public final String CLIENT_PROCEED_BUTTON_XPATH = ".//*[@id='ctl00_ctl39_g_a1509910_fc7d_4950_a968_c4ff7ddc06d2_ctl00_ButtonProceed']";
	public final String CLIENT_PROCEED_BUTTON_CSS = "";

	public final String CLIENT_TEMP_PASSWORD_XPATH = "/html/body/table/tbody/tr[3]/td/div/div[2]";
	public final String CLIENT_TEMP_PASSWORD_CSS = "";

	public final String CLIENT_EMAIL_VERIFICATION_LINK_XPATH = "/html/body/table/tbody/tr[3]/td/div/p[3]/a";

	// Client Profile update

	public final String CLIENT_PROFILE_UPDATE_PAGE_TITLE_XPATH = "//*[@id='client-update']/h1";
	public final String CLIENT_PROFILE_UPDATE_PAGE_TITLE_CSS = "";

	public final String CLIENT_BILLING_DETAILS_XPATH = "//*[@id='client-update']/div[1]/h3[4]";
	public final String CLIENT_BILLING_DETAILS_CSS = "";

	public final String ROBOFORM_FORM_CLIENT_BILLING_NO_OF_SITES_XPATH = "ctl00$ctl39$g_08447400_28E0_47B3_9340_832FD5CB4F53$ctl00$numberOfSitesTextBox";

	public final String ROBOFORM_FORM_CLIENT_BILLING_ANNUAL_REVENUE_XPATH = "ctl00$ctl39$g_08447400_28E0_47B3_9340_832FD5CB4F53$ctl00$annualRevenueTextBox";

	public final String ROBOFORM_FORM_CLIENT_BILLING_ADDRESS_XPATH = "ctl00$ctl39$g_08447400_28E0_47B3_9340_832FD5CB4F53$ctl00$billingAddressTextBox";

	public final String ROBOFORM_FORM_CLIENT_BILLING_TOWN_XPATH = "ctl00$ctl39$g_08447400_28E0_47B3_9340_832FD5CB4F53$ctl00$billingCityTextBox";

	public final String CLIENT_CONFIRM_BILLING_DETAILS_XPATH = ".//*[@id='ctl00_ctl39_g_08447400_28E0_47B3_9340_832FD5CB4F53_ctl00_updateButton']";
	public final String CLIENT_CONFIRM_BILLING_DETAILS_CSS = "";


	//Client select license category
	public final String CLIENT_LICENSE_CATEGORY_DROPDOWN_XPATH = "//*[@id='ctl00_ctl39_g_8e2440e5_36ea_404e_8266_76a3499e9a14_ctl00_DropDownListLicenceCategory']";
	public final String CLIENT_LICENSE_CATEGORY_DROPDOWN_CSS = "";

	public final String CLIENT_LICENSE_CATEGORY_CONTINUE_BUTTON_XPATH = "//*[@id='ctl00_ctl39_g_8e2440e5_36ea_404e_8266_76a3499e9a14_ctl00_ButtonContinue']";
	public final String CLIENT_LICENSE_CATEGORY_CONTINUE_BUTTON_CSS = "";


	//Client package and additional license
	public final String CLIENT_ADD_PACKAGE_DROPDOWN_XPATH = "//*[@id='ctl00_ctl39_g_8f2d00e0_29f1_493c_baca_f0ae8db6f3e4_ctl00_DropDownListPackage']";
	public final String CLIENT_ADD_PACKAGE_DROPDOWN_CSS = "";

	public final String CLIENT_ADDITIONAL_USERS_SELECT_USER_TYPE_XPATH = "//*[@id='ctl00_ctl39_g_8f2d00e0_29f1_493c_baca_f0ae8db6f3e4_ctl00_DropdownListUserType']";
	public final String CLIENT_ADDITIONAL_USERS_SELECT_USER_TYPE_CSS = "";

	public final String CLIENT_ADDITIONAL_USERS_SELECT_USER_COUNT_XPATH = "//*[@id='ctl00_ctl39_g_8f2d00e0_29f1_493c_baca_f0ae8db6f3e4_ctl00_DropdownListusersCount']";
	public final String CLIENT_ADDITIONAL_USERS_SELECT_USER_COUNT_CSS = "";

	public final String CLIENT_ADDITIONAL_LICENSE_ADD_BUTTON_XPATH = "//*[@id='ctl00_ctl39_g_8f2d00e0_29f1_493c_baca_f0ae8db6f3e4_ctl00_ButtonAddEntry']";
	public final String CLIENT_ADDITIONAL_LICENSE_ADD_BUTTON_CSS = "";

	public final String CLIENT_ADDITIONAL_LICENSE_DELETE_BUTTON_XPATH = ".//*[@id='ctl00_ctl39_g_8f2d00e0_29f1_493c_baca_f0ae8db6f3e4_ctl00_ListViewAdditionalLicenseTable_ctrl0_ButtonDeleteUserEntry']";
	public final String CLIENT_ADDITIONAL_LICENSE_DELETE_BUTTON_CSS = "";


	//Client payment method
	public final String CLIENT_PAYMENT_METHOD_DROPDOWN_XPATH = "//*[@id='ctl00_ctl39_g_8f2d00e0_29f1_493c_baca_f0ae8db6f3e4_ctl00_DropdownListPaymentMethod']";
	public final String CLIENT_PAYMENT_METHOD_DROPDOWN_CSS = "";

	public final String CLIENT_PAYMENT_METHOD_CONTINUE_BUTTON_XPATH = "//*[@id='ctl00_ctl39_g_8f2d00e0_29f1_493c_baca_f0ae8db6f3e4_ctl00_ButtonContinue']";
	public final String CLIENT_PAYMENT_METHOD_CONTINUE_BUTTON_CSS = "";

	public final String CLIENT_HOME_PAGE_BUTTON_XPATH = "//*[@id='ctl00_ctl39_g_fa5de347_07d9_433c_82f3_38d6e081b74f_ctl00_DivInvoiceDetailsButton']/a";
	public final String CLIENT_HOME_PAGE_BUTTON_CSS = "";

	public final String PACKAGE_TOTAL_XPATH = "//*[@id='ctl00_ctl39_g_8f2d00e0_29f1_493c_baca_f0ae8db6f3e4_ctl00_LabelTotal']";
	public final String PACKAGE_TOTAL_CSS = "";

	public final String USER_TYPE_XPATH = "//*[@id='ctl00_ctl39_g_8f2d00e0_29f1_493c_baca_f0ae8db6f3e4_ctl00_ListViewAdditionalLicenseTable_ctrl0_LabelTableUserType']";
	public final String USER_TYPE_CSS = "";

	//----------Verification

	public final String LICENSE_PREFERENCES_PAGE_TITLE_XPATH = ".//*[@id='ctl00_ctl39_g_8e2440e5_36ea_404e_8266_76a3499e9a14']/h1";
	public final String ERROR_LICENSE_CATEGORY_XPATH = ".//*[@id='ctl00_ctl39_g_8e2440e5_36ea_404e_8266_76a3499e9a14_ctl00_LabelError']";
	public final String ERROR_MAIN_XPATH = ".//*[@id='ctl00_ctl39_g_8f2d00e0_29f1_493c_baca_f0ae8db6f3e4_ctl00_LabelErrorMain']";
	public final String NO_OF_SUPPORT_USERS_XPATH = ".//*[@id='ctl00_ctl39_g_8f2d00e0_29f1_493c_baca_f0ae8db6f3e4_ctl00_LabelLicenseUserDetails']/table/tbody/tr[3]/td[2]";
	public final String ERROR_ADDITIONAL_LICENSE_XPATH = ".//*[@id='ctl00_ctl39_g_8f2d00e0_29f1_493c_baca_f0ae8db6f3e4_ctl00_LabelErrorOnSectionTwo']";
	public final String USER_COUNT_1_XPATH = ".//*[@id='ctl00_ctl39_g_8f2d00e0_29f1_493c_baca_f0ae8db6f3e4_ctl00_ListViewAdditionalLicenseTable_ctrl0_LabelTableUserCount']";
	public final String USER_COUNT_2_XPATH = ".//*[@id='ctl00_ctl39_g_8f2d00e0_29f1_493c_baca_f0ae8db6f3e4_ctl00_ListViewAdditionalLicenseTable_ctrl1_LabelTableUserCount']";
	public final String USER_TYPE_1_XPATH = ".//*[@id='ctl00_ctl39_g_8f2d00e0_29f1_493c_baca_f0ae8db6f3e4_ctl00_ListViewAdditionalLicenseTable_ctrl0_LabelTableUserType']";
	public final String USER_TYPE_2_XPATH = ".//*[@id='ctl00_ctl39_g_8f2d00e0_29f1_493c_baca_f0ae8db6f3e4_ctl00_ListViewAdditionalLicenseTable_ctrl1_LabelTableUserType']";

	public final String WQ_BETA_PAGE_TITLE_XPATH = ".//*[@id='ctl00_ctl39_g_fa5de347_07d9_433c_82f3_38d6e081b74f']/h1";
	public final String WQ_BETA_PACKAGE_XPATH = ".//*[@id='ctl00_ctl39_g_fa5de347_07d9_433c_82f3_38d6e081b74f_ctl00_LabelLicenseName']";
	public final String WQ_USER_TYPE_XPATH = ".//*[@id='ctl00_ctl39_g_fa5de347_07d9_433c_82f3_38d6e081b74f_ctl00_LabelAdditionalLicenseTable']/table/tbody/tr[2]/td[1]";
	public final String WQ_BETA_USER_COUNT_XPATH = ".//*[@id='ctl00_ctl39_g_fa5de347_07d9_433c_82f3_38d6e081b74f_ctl00_LabelAdditionalLicenseTable']/table/tbody/tr[2]/td[2]";
	public final String WQ_BETA_PAYMENT_METHOD_XPATH = ".//*[@id='ctl00_ctl39_g_fa5de347_07d9_433c_82f3_38d6e081b74f_ctl00_DivInvoiceDetails']/p[1]";


	//Client assign users

	public final String HOME_TILE_XPATH = ".//*[@id='ctl00_MainTab11_ctl00_HyperLinkHome']";
	public final String HOME_TILE_CSS = "";

	public final String ASSSIGN_USER_TILE_XPATH = ".//*[@id='ctl00_ctl39_g_C95A5BB3_48BB_42AC_BDD4_33F39F4DECC3_ctl00_HyperlinkAssignUserTile']/div";
	public final String ASSSIGN_USER_TILE_CSS = "";

	public final String REQUEST_ASSIGN_BUTTON_1_XPATH = ".//*[@id='ctl00_ctl39_g_73870af9_6df0_4c68_b3b7_8e8a80b8d23d_ctl00_ListViewUserRequests_ctrl2_ButtonRequest']";
	public final String REQUEST_ASSIGN_BUTTON_1_CSS = "";

	public final String REQUEST_ASSIGN_BUTTON_2_XPATH = ".//*[@id='ctl00_ctl39_g_73870af9_6df0_4c68_b3b7_8e8a80b8d23d_ctl00_ListViewUserRequests_ctrl3_ButtonRequest']";
	public final String REQUEST_ASSIGN_BUTTON_2_CSS = "";

	public final String REQUEST_BUTTON_XPATH = ".//*[@id='ctl00_ctl39_g_025dfd0c_8532_4181_9c28_a1be265ba32a_ctl00_ButtonRequest']";
	public final String REQUEST_BUTTON_CSS = "";

	public final String REQUEST_CANCLE_BUTTON_XPATH = ".//*[@id='ctl00_ctl39_g_025dfd0c_8532_4181_9c28_a1be265ba32a_ctl00_ButtonCancel']";
	public final String REQUEST_CANCLE_BUTTON_CSS = "";

	public final String ROBOFORM_FORM_USER_INFO_EMAIL_NAME = "ctl00$ctl39$g_025dfd0c_8532_4181_9c28_a1be265ba32a$ctl00$TextBoxEMail";
	public final String ROBOFORM_FORM_USER_INFO_FNAME_NAME = "ctl00$ctl39$g_025dfd0c_8532_4181_9c28_a1be265ba32a$ctl00$TextBoxFirstName";
	public final String ROBOFORM_FORM_USER_INFO_LNAME_NAME = "ctl00$ctl39$g_025dfd0c_8532_4181_9c28_a1be265ba32a$ctl00$TextBoxLastName";
	public final String ROBOFORM_FORM_USER_INFO_DESIGNATION_NAME = "ctl00$ctl39$g_025dfd0c_8532_4181_9c28_a1be265ba32a$ctl00$TextBoxDesignation";


	//----------Verification

	public final String MANAGE_REQUEST_PAGE_TITLE = ".//*[@id='ctl00_ctl39_g_73870af9_6df0_4c68_b3b7_8e8a80b8d23d_ctl00_LabelLicenseCategoryHeading']";
	public final String REQUEST_SUCCESS_MESSAGE_XPATH = ".//*[@id='ctl00_ctl39_g_025dfd0c_8532_4181_9c28_a1be265ba32a_ctl00_LabelSuccessMessege']";
	public final String POPUP_TITLE_XPATH = "//*[@id='ctl00_ctl39_g_025dfd0c_8532_4181_9c28_a1be265ba32a']/div/div/h1";

	//Support user create cases

	public final String DASHBOARD_DM_XPATH = "//*[@id='ctl00_ctl39_g_74671772_2FB6_493E_8BA7_38664FE0D2EA_HyperLinkDMDashboard']";
	public final String DASHBOARD_DM_CSS = "";

	public final String DASHBOARD_SUPPORT_XPATH = "//*[@id='ctl00_ctl39_g_74671772_2FB6_493E_8BA7_38664FE0D2EA_HyperLinkSMDashboard']";
	public final String DASHBOARD_SUPPORT_CSS = "";

	public final String DASHBOARD_SUPPORT_SP_USER_XPATH = "//*[@id='ctl00_ctl39_g_63B856CA_50EC_4C61_8EF8_B60FDBD42925_HyperLinkSMDashboard']";
	public final String DASHBOARD_SUPPORT_SP_USER_CSS = "";

	public final String UP_XPATH ="//*[@id='ctl00_ctl39_g_63B856CA_50EC_4C61_8EF8_B60FDBD42925_HyperLinkUserProfile']";
	public final String UP_CSS ="";

	public final String SUPPORT_TILE_XPATH = ".//*[@id='ctl00_MainTab21_ctl00_HyperLinkCaseMatch']";
	public final String SUPPORT_TILE_CSS = "";

	public final String SUPPORT_PAGE_TITLE_XPATH  = ".//*[@id='ConnectionLobby']/h1";
	public final String SUPPORT_PAGE_TITLE_CSS = "";

	public final String CREATE_CASE_TITLE_XPATH = ".//*[@id='ctl00_ctl39_g_2484255E_6614_4C33_9820_135254E70AB7_ctl00_caseTitleTextBox']";
	public final String CREATE_CASE_TITLE_CSS = "";

	public final String CREATE_CASE_DESCRIPTION_XPATH = ".//*[@id='ctl00_ctl39_g_2484255E_6614_4C33_9820_135254E70AB7_ctl00_caseDescriptionTextBox']";
	public final String CREATE_CASE_DESCRIPTION_CSS = "";

	public final String CREATE_CASE_TYPE_DROPDOWN_XPATH = ".//*[@id='ctl00_ctl39_g_2484255E_6614_4C33_9820_135254E70AB7_ctl00_caseTypeDropDownList']";
	public final String CREATE_CASE_TYPE_DROPDOWN_CSS = "";

	public final String CREATE_CASE_URGENCY_DROPDOWN_XPATH = ".//*[@id='ctl00_ctl39_g_2484255E_6614_4C33_9820_135254E70AB7_ctl00_UrgencyDropDownList']";
	public final String CREATE_CASE_URGENCY_DROPDOWN_CSS = "";

	public final String CREATE_CASE_CONTRACT_DROPDOWN_XPATH = ".//*[@id='ctl00_ctl39_g_2484255E_6614_4C33_9820_135254E70AB7_ctl00_contactDropDownList']";
	public final String CREATE_CASE_CONTRACT_DROPDOWN_CSS = "";

	public final String CREATE_CASE_ADD_ATTACHMENT_BUTTON_XPATH = ".//*[@id='ctl00_ctl39_g_2484255E_6614_4C33_9820_135254E70AB7_ctl00_addAttachentButton']";
	public final String CREATE_CASE_ADD_ATTACHMENT_BUTTON_CSS = "";

	public final String CREATE_CASE_ADD_ATTACHMENT_ERROR_XPATH = ".//*[@id='ctl00_ctl39_g_2484255E_6614_4C33_9820_135254E70AB7_ctl00_attachmentErrorLabel']";
	public final String CREATE_CASE_ADD_ATTACHMENT_ERROR_CSS = "";

	public final String ADDED_ATTACHMENT_XPATH = "//*[@id='ctl00_ctl39_g_2484255E_6614_4C33_9820_135254E70AB7_ctl00_attachmentsListView_ctrl0_attachmentNameHyperLink']";
	public final String ADDED_ATTACHMENT_CSS = "";

	public final String CREATE_CASE_BUTTON_XPATH = ".//*[@id='ctl00_ctl39_g_2484255E_6614_4C33_9820_135254E70AB7_ctl00_createButton']";
	public final String CREATE_CASE_BUTTON_CSS = "";

	public final String CREATE_CASE_CLEAR_BUTTON_XPATH = ".//*[@id='ctl00_ctl39_g_2484255E_6614_4C33_9820_135254E70AB7_ctl00_clearButton']";
	public final String CREATE_CASE_CLEAR_BUTTON_CSS = "";

	public final String CREATE_CASE_DASHBOARD_BUTTON_XPATH = "//*[@id='ctl00_ctl39_g_2484255E_6614_4C33_9820_135254E70AB7_ctl00_cancelButton']";
	public final String CREATE_CASE_DASHBOARD_BUTTON_CSS = "";

	public final String CREATE_CASE_CHOOSE_FILE_BUTTON_XPATH = "//*[@id='ctl00_ctl39_g_2484255E_6614_4C33_9820_135254E70AB7_ctl00_attachemtuploadControl']";
	public final String CREATE_CASE_CHOOSE_FILE_BUTTON_CSS = "";

	public final String UPLOAD_ATTACHMENT_NAME ="ctl00$ctl39$g_2484255E_6614_4C33_9820_135254E70AB7$ctl00$attachemtuploadControl";

	public final String VIEW_SUPPORT_CASE_PAGE_TITLE_XPATH = "//*[@id='ctl00_ctl39_g_ED88AAC2_62E8_464A_B8C3_AAD662828462_ctl00_UpdatePanel9']/h1";
	public final String VIEW_SUPPORT_CASE_PAGE_TITLE_CSS = "";

	public final String ONGOING_CASE_PAGE_TITLE_XPATH = "//*[@id='title']";
	public final String ONGOING_CASE_PAGE_TITLE_CSS = "";

	public final String CLOSED_CASE_PAGE_TITLE_XPATH = "//*[@id='title']";
	public final String CLOSED_CASE_PAGE_TITLE_CSS = "";

	//view update support cases

	public final String VIEW_CASE_CASE_ID_XPATH = "//*[@id='ctl00_ctl39_g_ED88AAC2_62E8_464A_B8C3_AAD662828462_ctl00_issueIdLabel']";
	public final String VIEW_CASE_CASE_ID_CSS = "";

	public final String VIEW_CASE_CREATED_BY_XPATH = "//*[@id='ctl00_ctl39_g_ED88AAC2_62E8_464A_B8C3_AAD662828462_ctl00_createdByLabel']";

	public final String VIEW_CASE_EDIT_BUTTON_XPATH = "//*[@id='ctl00_ctl39_g_ED88AAC2_62E8_464A_B8C3_AAD662828462_ctl00_ButtonEditCase']";
	public final String VIEW_CASE_EDIT_BUTTON_CSS = "";

	public final String UPDATE_CASE_PAGE_TITLE_XPATH = "//*[@id='ctl00_ctl39_g_70AB85B8_D4C5_4214_9A09_4252100611D7_ctl00_UpdatePanel9']/h1";

	public final String BACK_TO_CASE_VIEW_LINK_XPATH = "//*[@id='ctl00_ctl39_g_70AB85B8_D4C5_4214_9A09_4252100611D7_ctl00_BackToCaseView']";
	public final String BACK_TO_CASE_VIEW_LINK_CSS = "";

	public final String ADD_NEW_LOG_XPATH ="//*[@id='ctl00_ctl39_g_70AB85B8_D4C5_4214_9A09_4252100611D7_ctl00_addNewLogTextBox']";
	public final String ADD_NEW_LOG_CSS = "";

	public final String NO_PENDING_CHANGES_MSG_XPATH = "//*[@id='ctl00_ctl39_g_70AB85B8_D4C5_4214_9A09_4252100611D7_ctl00_caseDetailsSaveErrorLabel']";

	public final String CHANGES_SUBMITTED_MSG_XPATH = ".//*[@id='ctl00_ctl39_g_70AB85B8_D4C5_4214_9A09_4252100611D7_ctl00_successfulMessage']";

	public final String UPDATE_CASE_SAVE_BUTTON_XPATH = "//*[@id='ctl00_ctl39_g_70AB85B8_D4C5_4214_9A09_4252100611D7_ctl00_saveCaseDataButton']";
	public final String UPDATE_CASE_SAVE_BUTTON_CSS = "";

	public final String UPDATE_CASE_CONTACT_DROPDOWN_XPATH = ".//*[@id='ctl00_ctl39_g_70AB85B8_D4C5_4214_9A09_4252100611D7_ctl00_contactDropDownList']";
	public final String UPDATE_CASE_CONTACT_DROPDOWN_CSS = "";

	public final String UPDATE_CASE_CANCEL_BUTTON_XPATH = "//*[@id='ctl00_ctl39_g_70AB85B8_D4C5_4214_9A09_4252100611D7_ctl00_cancelCaseDataButton']";
	public final String UPDATE_CASE_CANCEL_BUTTON_CSS = "";

	public final String LATEST_UPDATE_XPATH = "//*[@id='ctl00_ctl39_g_70AB85B8_D4C5_4214_9A09_4252100611D7_ctl00_latestLogListView_ctrl0_latestLogDiv']/ul/li/div/table/tbody/tr[2]/td/span";

	public final String VIEW_CASE_CANCEL_BUTTON_XPATH = ".//*[@id='ctl00_ctl39_g_ED88AAC2_62E8_464A_B8C3_AAD662828462_ctl00_cancelCaseDataButton']";
	public final String VIEW_CASE_CANCEL_BUTTON_CSS = "";

	//------ongoing cases---------

	public final String ONGOING_CASE_CASE_ID_BUTTON_XPATH = "//*[@id='case-id']";

	public final String ONGOING_CASE_CASE_STATUS_BUTTON_XPATH ="//*[@id='ctl00_ctl39_g_E135AF0A_2A92_4B1A_AFB8_6E16DC335CA3_ctl00_ListViewCaseFilterResult_ctrl0_LabelCaseStatus']";

	public final String ONGOING_CASE_VIEW_CASE_LINK_XPATH ="//*[@id='ctl00_ctl39_g_E135AF0A_2A92_4B1A_AFB8_6E16DC335CA3_ctl00_ListViewCaseFilterResult_ctrl0_HyperlinkViewCase']";
	public final String ONGOING_CASE_VIEW_CASE_LINK_CSS = "";

	//---------Activate new support user

	public final String NEW_SP_USER_EMAIL_VERIFICATION_LINK_XPATH = "/html/body/table/tbody/tr[3]/td/div/p[3]/a";

	public final String NEW_SP_USER_TEMP_PASSWORD_XPATH = "/html/body/table/tbody/tr[3]/td/div/p[5]";
	public final String NEW_SP_USER_TEMP_PASSWORD_CSS = "";

	public final String NEW_SP_USER_FNAME_XPATH = "//*[@id='ctl00_ctl39_g_F431FFFF_FCC5_4EDF_B089_82F961E81991_ctl00_firstNameTextBox']";
	public final String NEW_SP_USER_FNAME_CSS = "";

	public final String NEW_SP_USER_LNAME_XPATH = "//*[@id='ctl00_ctl39_g_F431FFFF_FCC5_4EDF_B089_82F961E81991_ctl00_lastNameTextBox']";
	public final String NEW_SP_USER_LNAME_CSS = "";

	public final String NEW_SP_USER_PROFILE_UPDATE_BUTTON_XPATH = "//*[@id='ctl00_ctl39_g_F431FFFF_FCC5_4EDF_B089_82F961E81991_ctl00_updateButton']";
	public final String NEW_SP_USER_PROFILE_UPDATE_BUTTON_CSS = "";

	public final String NEW_SP_USER_PROFILE_UPDATE_PAGE_TITLE_XPATH = "//*[@id='ctl00_ctl39_g_F431FFFF_FCC5_4EDF_B089_82F961E81991']/div/h1";


	//Client Form Fields validation  - shammi
	public final String TITLE_LABEL_CSS = "";
	public final String TITLE_LABEL_XPATH = "//*[@id='ctl00_ctl39_g_7B6AE4AA_1CED_4039_AB72_0DE8298BCFF3']/div/h1";

	public final String COMPANY_NAME_TEXTBOX_CSS = "";
	public final String COMPANY_NAME_TEXTBOX_XPATH = "//*[@id='ctl00_ctl39_g_7B6AE4AA_1CED_4039_AB72_0DE8298BCFF3_ctl00_companyNameTextBox']";

	public final String FIRST_NAME_TEXTBOX_CSS = "";
	public final String FIRST_NAME_TEXTBOX_XPATH = "//*[@id='ctl00_ctl39_g_7B6AE4AA_1CED_4039_AB72_0DE8298BCFF3_ctl00_firstNameTextBox']";

	public final String LAST_NAME_TEXTBOX_CSS = "";
	public final String LAST_NAME_TEXTBOX_XPATH = "//*[@id='ctl00_ctl39_g_7B6AE4AA_1CED_4039_AB72_0DE8298BCFF3_ctl00_lastNameTextBox']";

	public final String EMAIL_TEXTBOX_CSS = "";
	public final String EMAIL_TEXTBOX_XPATH = "//*[@id='ctl00_ctl39_g_7B6AE4AA_1CED_4039_AB72_0DE8298BCFF3_ctl00_emailTextBox']";

	public final String TITLE_TEXTBOX_CSS = "";
	public final String TITLE_TEXTBOX_XPATH = "//*[@id='ctl00_ctl39_g_7B6AE4AA_1CED_4039_AB72_0DE8298BCFF3_ctl00_designationTextBox']";

	public final String COMPANY_ADDRESS_CSS = "";
	public final String COMPANY_ADDRESS_XPATH = "//*[@id='ctl00_ctl39_g_7B6AE4AA_1CED_4039_AB72_0DE8298BCFF3_ctl00_addressTextBox']";

	public final String TOWN_CITY_CSS = "";
	public final String TOWN_CITY_XPATH = "//*[@id='ctl00_ctl39_g_7B6AE4AA_1CED_4039_AB72_0DE8298BCFF3_ctl00_cityTextBox']";

	public final String CONTACT_NUMBER_CSS = "";
	public final String CONTACT_NUMBER_XPATH = "//*[@id='ctl00_ctl39_g_7B6AE4AA_1CED_4039_AB72_0DE8298BCFF3_ctl00_phoneTextBox']";


	//----------------------------Mailcatch---------------------------------------

	public final String CLICK_ON_EMAIL_XPATH = ".//*[@id='mailboxform']/input[1]";
	public final String CLICK_ON_EMAIL_CSS = "";

	public final String EMAIL_GO_XPATH = ".//*[@id='mailboxform']/input[2]";
	public final String EMAIL_GO_CSS = "";

	//----------------------------Outlook-----------------------------------------
	public final String OUTLOOK_SIGN_IN_BUTTON_XPATH = "/html/body/section/div/div[2]/div[2]/div/div";
	public final String OUTLOOK_SIGN_IN_BUTTON_CSS = "";

	public final String OUTLOOK_EMAIL_FIELD_XPATH = "//*[@id='i0116']";
	public final String OUTLOOK_EMAIL_FIELD_CSS = "";

	public final String OUTLOOK_NEXT_BUTTON_XPATH = "//*[@id='idSIButton9']";
	public final String OUTLOOK_NEXT_BUTTON_CSS = "";

	public final String OUTLOOK_PASSWORD_FIELD_XPATH = "//*[@id='i0118']";
	public final String OUTLOOK_PASSWORD_FIELD_CSS = "";

	public final String OUTLOOK_SIGN_IN_CONFIRM_XPATH = "//*[@id='idSIButton9']";
	public final String OUTLOOK_SIGN_IN_CONFIRM_CSS = "";




	//----------------------------Account Manager---------------------------------

	// Account Manager Page - shammi

	public final String AM_COMPANY_NAME_XPATH = "//*[@id='ctl00_ctl39_g_C03DF5F5_1966_4775_B066_E7A784994E29_ctl00_TextBoxCompanyName']";
	public final String AM_COMPANY_NAME_CSS = "";

	public final String AM_GO_BUTTON_XPATH = "//*[@id='ctl00_ctl39_g_C03DF5F5_1966_4775_B066_E7A784994E29_ctl00_ButtonGo']";
	public final String AM_GO_BUTTON_CSS = "";

	public final String AM_COMPANY_VERIFICATION_MSG_XPATH = "//*[@id='ctl00_ctl39_g_C03DF5F5_1966_4775_B066_E7A784994E29_ctl00_companyPortalAMListView_ctrl0_HyperLinkCompanyLink']";
	public final String AM_COMPANY_VERIFICATION_MSG_CSS = "";

	public final String AM_INVALID_COMPANY_DATA_XPATH = "//*[@id='ctl00_ctl39_g_C03DF5F5_1966_4775_B066_E7A784994E29_ctl00_LabelError']";
	public final String AM_INVALID_COMPANY_DATA_CSS = "";

	public final String AM_CLICK_ON_VERIFY_BUTTON_XPATH = "//*[@id='ctl00_ctl39_g_2E672EEA_79B1_421C_9778_283A618EF560_ctl00_ButtonVerify']";
	public final String AM_CLICK_ON_VERIFY_BUTTON_CSS = "";

	public final String AM_CLICK_ON_REJECT_BUTTON_XPATH = "//*[@id='ctl00_ctl39_g_2E672EEA_79B1_421C_9778_283A618EF560_ctl00_ButtonReject']";
	public final String AM_CLICK_ON_REJECT_BUTTON_CSS = "";

	public final String AM_REJECT_COMMENT_CSS = "";
	public final String AM_REJECT_COMMENT_XPATH = "//*[@id='ctl00_ctl39_g_2f9b421d_8e40_492f_bc10_612166a1b9a1_ctl00_TextBoxDescription']";

	public final String AM_CLICK_REJECT_COMMENT_BUTTON_XPATH = "//*[@id='ctl00_ctl39_g_2f9b421d_8e40_492f_bc10_612166a1b9a1_ctl00_ButtonReject']";
	public final String AM_CLICK_REJECT_COMMENT_BUTTON_CSS = "";

	public final String AM_COMMENT_MANDOTORY_MSG_XPATH = "";
	public final String AM_COMMENT_MANDOTORY_MSG_CSS = "";


	//Get data from user assign request mail

	//---DM_SP
	public final String NEW_DM_SPUSER_ASSIGN_REQUEST_EMAIL_XPATH = "//*[@id='_ariaId_27']/div[2]/div[6]/div/span[1]";
	public final String NEW_DM_SPUSER_ASSIGN_REQUEST_EMAIL_CSS = "";

	public final String NEW_DM_SPUSER_ASSIGN_REQUEST_EMAIL_DATA_XPATH ="//*[@id='Item.MessageUniqueBody']/div/div/div/table/tbody/tr[3]/td/div/table/tbody/tr[3]/td/p[1]";
	public final String NEW_DM_SPUSER_ASSIGN_REQUEST_EMAIL_DATA_CSS ="";

	public final String NEW_DM_SPUSER_ASSIGN_REQUEST_ROLE_DATA_XPATH ="//*[@id='Item.MessageUniqueBody']/div/div/div/table/tbody/tr[3]/td/div/table/tbody/tr[3]/td/p[4]";
	public final String NEW_DM_SPUSER_ASSIGN_REQUEST_ROLE_DATA_CSS ="";

	//---SP
	public final String NEW_SPUSER_ASSIGN_REQUEST_EMAIL_XPATH = "//*[@id='_ariaId_25']/div[2]/div[6]/div/span[1]";
	public final String NEW_SPUSER_ASSIGN_REQUEST_EMAIL_CSS = "";

	public final String NEW_SPUSER_ASSIGN_REQUEST_EMAIL_DATA_XPATH = ".//*[@id='Item.MessageUniqueBody']/div/div/div/table/tbody/tr[3]/td/div/table/tbody/tr[3]/td/p[1]";
	public final String NEW_SPUSER_ASSIGN_REQUEST_EMAIL_DATA_CSS = "";

	public final String NEW_SPUSER_ASSIGN_REQUEST_ROLE_DATA_XPATH = ".//*[@id='Item.MessageUniqueBody']/div/div/div/table/tbody/tr[3]/td/div/table/tbody/tr[3]/td/p[4]";
	public final String NEW_SPUSER_ASSIGN_REQUEST_ROLE_DATA_CSS = "";

	public final String AM_EMAIL_INBOX_BUTTON_XPATH = "//*[@id='_ariaId_62']/div[1]/span/div";
	public final String AM_EMAIL_INBOX_BUTTON_CSS = "";


	//Add same user

	public final String AM_ADD_SAME_USER_ERROR_MSG_XPATH = ".//*[@id='ctl00_ctl39_g_f54a3f45_8f0d_4f51_adc3_9e39c4866d23_ctl00_errormessage']";


	//Deactivate users

	public final String AM_DEACTIVATE_BUTTON_XPATH = "//*[@id='ctl00_ctl39_g_f54a3f45_8f0d_4f51_adc3_9e39c4866d23_ctl00_supportUsersListView_ctrl1_buttonDeactivateSupportUser1']";
	public final String AM_DEACTIVATE_BUTTON_CSS = "";

	public final String AM_DEACTIVATE_MESSAGE_XPATH = ".//*[@id='ctl00_ctl39_g_f54a3f45_8f0d_4f51_adc3_9e39c4866d23_ctl00_successSu']";


	//Reassign users

	public final String AM_REASSIGN_EMAIL_BOX_XPATH = ".//*[@id='ctl00_ctl39_g_f54a3f45_8f0d_4f51_adc3_9e39c4866d23_ctl00_supportUsersListView_ctrl1_emailTextBoxSupportUser']";
	public final String AM_REASSIGN_EMAIL_BOX_CSS = "";

	public final String AM_REASSIGN_BUTTON_XPATH = ".//*[@id='ctl00_ctl39_g_f54a3f45_8f0d_4f51_adc3_9e39c4866d23_ctl00_supportUsersListView_ctrl1_buttonReAssignSupportUser1']";
	public final String AM_REASSIGN_BUTTON_CSS = "";

	public final String AM_REASSIGNED_MESSAGE_XPATH = ".//*[@id='ctl00_ctl39_g_f54a3f45_8f0d_4f51_adc3_9e39c4866d23_ctl00_successSu']";

	//Assign users

	public final String AM_ASSIGN_USERS_TILE_XPATH = "//*[@id='ctl00_ctl39_g_CAAA6074_B34E_4091_8261_D39B7455A63E']/div/ul/li[5]/a/div";
	public final String AM_ASSIGN_USERS_TILE_CSS = "";

	public final String AM_ASSIGN_USERS_TITLE_XPATH = ".//*[@id='assign-user-lists']/h1";

	public final String AM_SELECT_COMPANY_DROPDOWN_XPATH = "//*[@id='ctl00_ctl39_g_f54a3f45_8f0d_4f51_adc3_9e39c4866d23_ctl00_companiesDropDownList']";
	public final String AM_SELECT_COMPANY_DROPDOWN_CSS = "";

	public final String AM_ADD_USERS_TEXTBOX_XPATH = ".//*[@id='ctl00_ctl39_g_f54a3f45_8f0d_4f51_adc3_9e39c4866d23_ctl00_addUserTextBox']";
	public final String AM_ADD_USERS_TEXTBOX_CSS = "";

	public final String AM_USER_ROLE_DROPDOWN_XPATH = ".//*[@id='ctl00_ctl39_g_f54a3f45_8f0d_4f51_adc3_9e39c4866d23_ctl00_usersDropDownList']";
	public final String AM_USER_ROLE_DROPDOWN_CSS = "";

	public final String AM_USER_ROLE_ACTIVATE_BUTTON_XPATH = ".//*[@id='ctl00_ctl39_g_f54a3f45_8f0d_4f51_adc3_9e39c4866d23_ctl00_buttonActivateUser']";
	public final String AM_USER_ROLE_ACTIVATE_BUTTON_CSS = "";

	public final String AM_SUCCESS_ACTIVATE_MESSAGE_XPATH = "//*[@id='ctl00_ctl39_g_f54a3f45_8f0d_4f51_adc3_9e39c4866d23_ctl00_success']";
	public final String AM_SUCCESS_ACTIVATE_MESSAGE_CSS = "";

	//------------------------------Sales Manager---------------------------------

	// Sales Manager Page
	public final String BO_AUTHENTICATION_DROPDOWN_XPATH = ".//*[@id='ctl00_PlaceHolderMain_ClaimsLogonSelector']";
	public final String BO_AUTHENTICATION_DROPDOWN_CSS = "";

	public final String SM_PENDING_CLIENTS_XPATH = ".//*[@id='ctl00_ctl39_g_834D4F0E_02DA_41DA_B681_29F60DEA444A']/div[2]/table";
	public final String SM_PENDING_CLIENTS_CSS = "";

	public final String SM_ASSIGN_AM_DROPDOWN_XPATH = ".//*[@id='ctl00_ctl39_g_2E672EEA_79B1_421C_9778_283A618EF560_ctl00_DropDownListMembers']";
	public final String SM_ASSIGN_AM_DROPDOWN_CSS = "";

	public final String SM_ASSIGN_AM_BUTTON_XPATH = ".//*[@id='ctl00_ctl39_g_2E672EEA_79B1_421C_9778_283A618EF560_ctl00_ButtonAssign']";
	public final String SM_ASSIGN_AM_BUTTON_CSS = "";

	public final String SM_ASSIGN_AM_COMPANY_NAME_XPATH = ".//*[@id='ctl00_ctl39_g_2E672EEA_79B1_421C_9778_283A618EF560_ctl00_companyNameLabel']";
	public final String SM_ASSIGN_AM_COMPANY_NAME_CSS = "";




	//################################ SysAid ########################################

	public final String SYSAID_USERNAME_XPATH = ".//*[contains(@name,'userName')]";
	public final String SYSAID_USERNAME_CSS = "";
	public final String SYSAID_PASSWORD_XPATH = ".//*[contains(@name,'password')]";
	public final String SYSAID_PASSWORD_CSS = "";
	public final String SYSAID_LOGIN_XPATH = ".//*[contains(@class,'ButtonLabel')]";
	public final String SYSAID_LOGIN_CSS = "";

	public final String SYSAID_SEARCHCASEID_XPATH = ".//*[contains(@class,'sr-searchfield')]";
	public final String SYSAID_SEARCHCASEID_CSS = "";
	public final String SYSAID_CLICKSEARCHCASEID_XPATH = ".//*[contains(@class,'sr-submit')]";
	public final String SYSAID_CLICKSEARCHCASEID_CSS = "";


	//-------------------------- SysAid - Case View
	public final String SYSAID_SUBTYPE_INCIDENT_XPATH = "//div[contains(@id,'_sub_type')]/div/div[1]/span";
	public final String SYSAID_SUBTYPE_INCIDENT_CSS = "";

	public final String SYSAID_CATEGORY_PRODUCT_DIV_XPATH = ".//*[contains(@id,'_problem_type')]/div";
	public final String SYSAID_CATEGORY_PRODUCT_DIV_CSS = "";

	public final String SYSAID_CATEGORY_PRODUCT_XPATH = "//*[@id='addScroll_problem_type_CustomSelect']";
	public final String SYSAID_CATEGORY_PRODUCT_CSS = "";

	/*public final String SYSAID_CATEGORY_PRODUCT_SELECT_XPATH = "//*[@id='addScroll_problem_type_CustomSelect']/ul";
	public final String SYSAID_CATEGORY_PRODUCT_SELECT_CSS = "";*/

	public final String SYSAID_CATEGORY_SUPPORTLAYER_DIV_XPATH = "//*[@id='addScroll_subcategory_CustomSelect']";
	public final String SYSAID_CATEGORY_SUPPORTLAYER_DIV_CSS = "";

	public final String SYSAID_CATEGORY_SERVICE_XPATH = ".//div[contains(@id,'thirdLevelCategory')]/div/div[1]";
	public final String SYSAID_CATEGORY_SERVICE_CSS = "";


	public final String SYSAID_CASESTATUS_REQUEST_XPATH = ".//div[contains(@id,'_status')]/div/div[1]";
	public final String SYSAID_CASESTATUS_REQUEST_CSS = "";
	public final String SYSAID_PLANNEDDATE_XPATH = ".//div[contains(@class,'hasDatepicker')]/div/div[1]";
	public final String SYSAID_PLANNEDDATE_CSS = "";
	public final String SYSAID_URGENCY_XPATH = ".//div[contains(@id,'_selectUrgency')]/div/div[1]";
	public final String SYSAID_URGENCY_CSS = "";
	public final String SYSAID_PRIORITY_XPATH = ".//div[contains(@id,'_selectPriority')]/div/div[1]";
	public final String SYSAID_PRIORITY_CSS = "";

	public final String SYSAID_CASEOWNER_XPATH = "";
	public final String SYSAID_CASEOWNER_CSS = "";
	public final String SYSAID_ASSIGNEETEAM_XPATH = "";
	public final String SYSAID_ASSIGNEETEAM_CSS = "";
	public final String SYSAID_ASSIGNEDTO_XPATH = "";
	public final String SYSAID_ASSIGNEDTO_CSS = "";
	public final String SYSAID_ADD_ATTACHMENT_XPATH = "";
	public final String SYSAID_ADD_ATTACHMENT_CSS = "";


	//--------------Resolve Case - SysAid
	public final String SYSAID_CASESTATUS_ASSIGNED_XPATH = "//*[@id='32_status']";

	public final String SYSAID_ADD_ACTIVITY_ADD_START_TIME_XPATH = "//*[@name='sract_fromTime_time']";
	public final String SYSAID_ADD_ACTIVITY_ADD_START_TIME_CSS = "";

	public final String SYSAID_ADD_ACTIVITY_ADD_END_TIME_XPATH = "//*[@name='sract_toTime_time']";
	public final String SYSAID_ADD_ACTIVITY_ADD_END_TIME_CSS = "";

	public final String SYSAID_ADD_ACTIVITY_TYPE_XPATH = ".//*[@id='32_custList1']/div/div[1]";

	public final String SYSAID_ADD_ACTIVITY_DESCRIPTION_XPATH = ".//*[@id='sract_description']";
	public final String SYSAID_ADD_ACTIVITY_DESCRIPTION_CSS = "";

	public final String SYSAID_ADD_ACTIVITY_ADD_BUTTON_XPATH = ".//*[@id='sract_OKBtn']";
	public final String SYSAID_ADD_ACTIVITY_ADD_BUTTON_CSS = "";

	public final String SYSAID_ADD_ACTIVITY_TOTAL_RESOLVE_TIME_XPATH = ".//*[@id='tr_labelId_activities']/td/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[4]/td[2]/table/tbody/tr/td/input[1]";

	public final String SYSAID_ACTIVITY_ADDED_CHECKBOX_XPATH ="//*[@id='tr_labelId_CustomColumn79sr']/td[3]/label";
	public final String SYSAID_ACTIVITY_ADDED_CHECKBOX_CSS = "";

	public final String SYSAID_OK_BUTTON_XPATH = ".//*[@id='OKBtn']/tbody/tr/td[1]";
	public final String SYSAID_OK_BUTTON_CSS = "";

	public final String SYSAID_DESCRIPTION_IN_ACTIVITY_TABLE_XPATH = "//*[@id='t']/tbody/tr[2]/td[5]";

	public final String SYSAID_ACTIVITY_TYPE_IN_ACTIVITY_TABLE_XPATH = "//*[@id='t']/tbody/tr[2]/td[6]";

	public final String SYSAID_DELETE_BUTTON_IN_ACTIVITY_TABLE_XPATH ="//*[@id='t']/tbody/tr[2]/td[8]/table/tbody/tr/td[2]";
	public final String SYSAID_DELETE_BUTTON_IN_ACTIVITY_TABLE_CSS = "";

}
