package com.totalamber.qa.data.UI.elements.webQuarters;

/**
 * Created by e.koshila on 9/22/2017.
 */
public interface wqCheckMailCatchEmailPage {

    //Loging to email
    public final String CLICK_ON_EMAIL_XPATH = ".//*[@id='mailboxform']/input[1]";
    public final String CLICK_ON_EMAIL_CSS = "";

    public final String EMAIL_GO_XPATH = ".//*[@id='mailboxform']/input[2]";
    public final String EMAIL_GO_CSS = "";

    //Read mails
    public final String	LATEST_RECEIVED_MAILCATCH_EMAIL_XPATH = "//*[@id='mailsList']/table/tbody/tr[2]";
    public final String	LATEST_RECEIVED_MAILCATCH_EMAIL_CSS = "";

    //Common
    public final String	WQ_CLIENT_EMAIL_FROM_XPATH = ".//table[contains(@class,'displaymail')]//tr[2]/td[contains(@class,'value')]";
    public final String	WQ_CLIENT_EMAIL_FROM_CSS = "";

    public final String	WQ_CLIENT_SIGNUP_CONFIRMATION_EMAIL_TO_XPATH = ".//table[contains(@class,'displaymail')]//tr[2]/td[contains(@class,'value')]";
    public final String	WQ_CLIENT_SIGNUP_CONFIRMATION_EMAIL_TO_CSS = "";

    public final String	WQ_CLIENT_EMAIL_SUBJECT_XPATH = ".//table[contains(@class,'displaymail')]//tr[1]/td[contains(@class,'value')]";
    public final String	WQ_CLIENT_EMAIL_SUBJECT_CSS = "";

    public final String	WQ_CLIENT_EMAIL_FNAME_XPATH = ".//table//tr[2]/td/div";
    public final String	WQ_CLIENT_EMAIL_FNAME_CSS = "";

    public final String	WQ_CLIENT_EMAIL_HEADER_IMAGE_XPATH = "//tr[1]/td/div";
    public final String	WQ_CLIENT_HEADER_IMAGE_CSS = "";

    public final String	WQ_CLIENT_EMAIL_HEADER_TITLE_XPATH = "//tr[1]/td/div/h1";
    public final String	WQ_CLIENT_EMAIL_HEADER_TITLE_CSS = "";

    public final String	WQ_CLIENT_EMAIL_CONTENT_LINK_XPATH = "//tr[3]/td/div/p[3]/a";
    public final String	WQ_CLIENT_EMAIL_CONTENT_LINK_CSS = "";

    public final String	WQ_CLIENT_INBOX_MAIL_FROM_XPATH = "//*[@id='mailsList']/table/tbody/tr[2]/td[1]";
    public final String	WQ_CLIENT_INBOX_MAIL_FROM_CSS = "";

    public final String	WQ_CLIENT_INBOX_MAIL_SUBJECT_XPATH = "//*[@id='mailsList']/table/tbody/tr[2]/td[2]";
    public final String	WQ_CLIENT_INBOX_MAIL_SUBJECT_CSS = "";

    //Activate Email
    public final String WQ_CLIENT_ACTIVATE_EMAIL_USER_NAME_XPATH = "/html/body/table/tbody/tr[3]/td/div/div[1]";
    public final String WQ_CLIENT_ACTIVATE_EMAIL_USER_NAME_CSS = "";

    public final String WQ_CLIENT_ACTIVATE_EMAIL_TEMP_PASSWORD_XPATH = "/html/body/table/tbody/tr[3]/td/div/div[2]";
    public final String WQ_CLIENT_ACTIVATE_EMAIL_TEMP_PASSWORD_CSS = "";

    //New user Assigned Email
    public final String WQ_CLIENT_NEW_USER_ASSIGNED_EMAIL_USER_NAME_XPATH = "html/body/table/tbody/tr[3]/td/div/p[4]";
    public final String WQ_CLIENT_NEW_USER_ASSIGNED_EMAIL_USER_NAME_CSS = "";

    public final String WQ_CLIENT_NEW_USER_ASSIGNED_EMAIL_TEMP_PASSWORD_XPATH = "html/body/table/tbody/tr[3]/td/div/p[5]";
    public final String WQ_CLIENT_NEW_USER_ASSIGNED_EMAIL_TEMP_PASSWORD_CSS = "";

    //Reassign Email Prevoius DM

    public final String WQ_CLIENT_PREVIVOUS_USER_ROLE_ENDED_EMAIL_CONTENT_XPATH = "/html/body/table/tbody/tr[3]/td/div/p";
    public final String WQ_CLIENT_PREVIVOUS_USER_ROLE_ENDED_EMAIL_CONTENT_CSS = "";

}
