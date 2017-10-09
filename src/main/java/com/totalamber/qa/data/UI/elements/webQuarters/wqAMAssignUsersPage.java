package com.totalamber.qa.data.UI.elements.webQuarters;

/**
 * Created by e.koshila on 10/2/2017.
 */
public interface wqAMAssignUsersPage {

    public final String WQ_AM_ASSIGN_USERS_SELECT_COMPANY_DROPDOWN_XPATH = "//*[contains(@id,'_companiesDropDownList')]";
    public final String WQ_AM_ASSIGN_USERS_SELECT_COMPANY_DROPDOWN_CSS = "";

    public final String WQ_AM_ASSIGN_USERS_SELECTED_COMPANY_XPATH = "//select[@name='ctl00$ctl39$g_f54a3f45_8f0d_4f51_adc3_9e39c4866d23$ctl00$companiesDropDownList']/option[@selected]";
    public final String WQ_AM_ASSIGN_USERS_SELECTED_COMPANY_CSS = "";

    public final String WQ_AM_ASSIGN_USERS_ADD_USERS_TEXTBOX_XPATH = ".//*[@id='ctl00_ctl39_g_f54a3f45_8f0d_4f51_adc3_9e39c4866d23_ctl00_addUserTextBox']";
    public final String WQ_AM_ASSIGN_USERS_ADD_USERS_TEXTBOX_CSS = "";

    public final String WQ_AM_ASSIGN_USERS_USER_ROLE_DROPDOWN_XPATH = ".//*[@id='ctl00_ctl39_g_f54a3f45_8f0d_4f51_adc3_9e39c4866d23_ctl00_usersDropDownList']";
    public final String WQ_AM_ASSIGN_USERS_USER_ROLE_DROPDOWN_CSS = "";

    public final String WQ_AM_ASSIGN_USERS_USER_ROLE_ACTIVATE_BUTTON_XPATH = ".//*[@id='ctl00_ctl39_g_f54a3f45_8f0d_4f51_adc3_9e39c4866d23_ctl00_buttonActivateUser']";
    public final String WQ_AM_ASSIGN_USERS_USER_ROLE_ACTIVATE_BUTTON_CSS = "";

    public final String WQ_AM_ASSIGN_USERS_SUCCESS_ACTIVATE_MESSAGE_XPATH = "//*[@id='ctl00_ctl39_g_f54a3f45_8f0d_4f51_adc3_9e39c4866d23_ctl00_success']";
    public final String WQ_AM_ASSIGN_USERS_SUCCESS_ACTIVATE_MESSAGE_CSS = "";

    public final String WQ_AM_ASSIGN_USERS_INVALID_EMAIL_MESSAGE_XPATH = "//*[@id='ctl00_ctl39_g_f54a3f45_8f0d_4f51_adc3_9e39c4866d23_ctl00_addUserRegularExpressionValidator']";
    public final String WQ_AM_ASSIGN_USERS_INVALID_EMAIL_MESSAGE_CSS = "";

    public final String WQ_AM_ASSIGN_USERS_EMAIL_REQUIRED_TEXT_XPATH = "//*[@id='ctl00_ctl39_g_f54a3f45_8f0d_4f51_adc3_9e39c4866d23_ctl00_addUserRequiredFieldValidator']";
    public final String WQ_AM_ASSIGN_USERS_EMAIL_REQUIRED_TEXT_CSS = "";

    public final String WQ_AM_ASSIGN_USERS_EMAIL_USER_IN_SAME_GROUP_XPATH = "//*[@id='ctl00_ctl39_g_f54a3f45_8f0d_4f51_adc3_9e39c4866d23_ctl00_errormessage']";
    public final String WQ_AM_ASSIGN_USERS_EMAIL_USER_IN_SAME_GROUP_CSS = "";


    public final String WQ_AM_DEACTIVATE_SU_BUTTON_XPATH = ".//*[@id='ctl00_ctl39_g_f54a3f45_8f0d_4f51_adc3_9e39c4866d23_ctl00_buttonActivateUser']";
    public final String WQ_AM_DEACTIVATE_SU_BUTTON_CSS = "";


    //Reassign DM
    public final String WQ_AM_REASSIGN_DM_EMAIL_TEXTBOX_XPATH = "//*[@id='ctl00_ctl39_g_f54a3f45_8f0d_4f51_adc3_9e39c4866d23_ctl00_decisionMakerListView_ctrl0_emailTextBoxDecisionMaker']";
    public final String WQ_AM_REASSIGN_DM_EMAIL_TEXTBOX_CSS = "";

    public final String WQ_AM_REASSIGN_DM_BUTTON_XPATH = "//*[@id='ctl00_ctl39_g_f54a3f45_8f0d_4f51_adc3_9e39c4866d23_ctl00_decisionMakerListView_ctrl0_buttonReAssignDecisionMaker']";
    public final String WQ_AM_REASSIGN_DM_BUTTON_CSS = "";

    public final String WQ_AM_REASSIGN_DM_ERROR_MESSAGE_XPATH = "//*[@id='ctl00_ctl39_g_f54a3f45_8f0d_4f51_adc3_9e39c4866d23_ctl00_errormessageDm']";
    public final String WQ_AM_REASSIGN_DM_ERROR_MESSAGE_CSS = "";

    public final String WQ_AM_REASSIGN_DM_SUCCESS_MESSAGE_XPATH = "//*[@id='ctl00_ctl39_g_f54a3f45_8f0d_4f51_adc3_9e39c4866d23_ctl00_successDm']";
    public final String WQ_AM_REASSIGN_DM_SUCCESS_MESSAGE_CSS = "";



}
