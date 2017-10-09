package com.totalamber.qa.data.UI.elements.webQuarters;

/**
 * Created by e.koshila on 9/22/2017.
 */
public interface wqCheckOutLookEmailPage {

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

    //Read mails

    public final String LATEST_RECEIVED_OUTLOOK_EMAIL_XPATH = "//*[@id='_ariaId_25']/div[2]/div[6]/div/span[1]";
    public final String LATEST_RECEIVED_OUTLOOK_EMAIL_CSS = "";

    //ManageUserRequest - User Re assign request (Change DM)

    public final String WQ_AM_REASSIGN_USER_REQUEST_EMAIL_TITLE_XPATH = "//*[@id='primaryContainer']//div[3]/div[2]/div[2]/div[1]/div[1]/span";
    public final String WQ_AM_REASSIGN_USER_REQUEST_EMAIL_TITLE_CSS = "";

    public final String WQ_AM_REASSIGN_USER_REQUEST_EMAIL_CURRENT_USER_EMAIL_XPATH = "//*[@id='Item.MessageUniqueBody']//tr[4]/td/p[1]";
    public final String WQ_AM_REASSIGN_USER_REQUEST_EMAIL_CURRENT_USER_EMAIL_CSS = "";

    public final String WQ_AM_REASSIGN_USER_REQUEST_EMAIL_CURRENT_USER_FNAME_XPATH = "//*[@id='Item.MessageUniqueBody']//tr[4]/td/p[2]";
    public final String WQ_AM_REASSIGN_USER_REQUEST_EMAIL_CURRENT_USER_FNAME_CSS = "";

    public final String WQ_AM_REASSIGN_USER_REQUEST_EMAIL_CURRENT_USER_LNAME_XPATH = "//*[@id='Item.MessageUniqueBody']//tr[4]/td/p[3]";
    public final String WQ_AM_REASSIGN_USER_REQUEST_EMAIL_CURRENT_USER_LNAME_CSS = "";

    public final String WQ_AM_REASSIGN_USER_REQUEST_EMAIL_NEW_USER_EMAIL_XPATH = "//*[@id='Item.MessageUniqueBody']//tr[6]/td/p[1]";
    public final String WQ_AM_REASSIGN_USER_REQUEST_EMAIL_NEW_USER_EMAIL_CSS = "";

    public final String WQ_AM_REASSIGN_USER_REQUEST_EMAIL_NEW_USER_FNAME_XPATH = "//*[@id='Item.MessageUniqueBody']//tr[6]/td/p[2]";
    public final String WQ_AM_REASSIGN_USER_REQUEST_EMAIL_NEW_USER_FNAME_CSS = "";

    public final String WQ_AM_REASSIGN_USER_REQUEST_EMAIL_NEW_USER_LNAME_XPATH = "//*[@id='Item.MessageUniqueBody']//tr[6]/td/p[3]";
    public final String WQ_AM_REASSIGN_USER_REQUEST_EMAIL_NEW_USER_LNAME_CSS = "";

    public final String WQ_AM_REASSIGN_USER_REQUEST_EMAIL_NEW_USER_DESIGNATION_XPATH = "//*[@id='Item.MessageUniqueBody']//tr[6]/td/p[4]";
    public final String WQ_AM_REASSIGN_USER_REQUEST_EMAIL_NEW_USER_DESIGNATION_CSS = "";

    public final String WQ_AM_REASSIGN_USER_REQUEST_EMAIL_REQUESTED_COMPAMY_XPATH = "//*[@id='Item.MessageUniqueBody']//tr[2]/td/p[1]";
    public final String WQ_AM_REASSIGN_USER_REQUEST_EMAIL_REQUESTED_COMPAMY_CSS = "";

    public final String WQ_AM_REASSIGN_USER_REQUEST_EMAIL_REQUESTED_USER_ROLE_XPATH = "//*[@id='Item.MessageUniqueBody']//tr[2]/td/p[3]";
    public final String WQ_AM_REASSIGN_USER_REQUEST_EMAIL_REQUESTED_USER_ROLE_CSS = "";


    //
    public final String WQ_AM_ASSIGN_USER_REQUEST_EMAIL_NEW_USER_EMAIL_XPATH = "//*[@id='Item.MessageUniqueBody']//tr[3]/td/p[1]";
    public final String WQ_AM_ASSIGN_USER_REQUEST_EMAIL_NEW_USER_EMAIL_CSS = "";

    public final String WQ_AM_ASSIGN_USER_REQUEST_EMAIL_NEW_USER_FNAME_XPATH = "//*[@id='Item.MessageUniqueBody']//tr[3]/td/p[2]";
    public final String WQ_AM_ASSIGN_USER_REQUEST_EMAIL_NEW_USER_FNAME_CSS = "";

    public final String WQ_AM_ASSIGN_USER_REQUEST_EMAIL_NEW_USER_LNAME_XPATH = "//*[@id='Item.MessageUniqueBody']//tr[3]/td/p[3]";
    public final String WQ_AM_ASSIGN_USER_REQUEST_EMAIL_NEW_USER_LNAME_CSS = "";

    public final String WQ_AM_ASSIGN_USER_REQUEST_EMAIL_NEW_USER_ROLE_XPATH = "//*[@id='Item.MessageUniqueBody']//tr[3]/td/p[4]";
    public final String WQ_AM_ASSIGN_USER_REQUEST_EMAIL_NEW_USER_ROLE_CSS = "";

    public final String WQ_AM_ASSIGN_USER_REQUEST_EMAIL_NEW_USER_DESIGNATION_XPATH = "//*[@id='Item.MessageUniqueBody']//tr[3]/td/p[5]";
    public final String WQ_AM_ASSIGN_USER_REQUEST_EMAIL_NEW_USER_DESIGNATION_CSS = "";


}