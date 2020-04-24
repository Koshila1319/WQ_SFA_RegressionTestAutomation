package com.webQuarters.qa.data.UI.elements.webQuarters.elements;

/**
 * Created by e.koshila on 3/17/2020.
 */

public interface sfaLoginPage {

    public final String LOGIN_PAGE_COMPANY_LOGO_XPATH = ".//*[@id=\"container\"]/div/div/div[1]/div[1]/div/img";
    public final String LOGIN_PAGE_COMPANY_LOGO_CSS = "";

    public final String LOGIN_PAGE_TITLE_XPATH = ".//*[@id=\"container\"]/div/div/div[1]/div[2]/h1";
    public final String LOGIN_PAGE_TITLE_CSS = "";

    public final String LOGIN_PAGE_TEXT_XPATH = ".//*[@id=\"container\"]/div/div/div[1]/div[2]/p";
    public final String LOGIN_PAGE_TEXT_CSS = "";

    public final String LOGIN_USER_NAME_ICON_XPATH = ".//*[@id=\"container\"]/div/div/div[1]/form/div[1]/span/i";
    public final String LOGIN_USER_NAME_ICON_CSS = "";

    public final String LOGIN_PASSWORD_ICON_XPATH = ".//*[@id=\"container\"]/div/div/div[1]/form/div[3]/span/i";
    public final String LOGIN_PASSWORD_ICON_CSS = "";

    public final String LOGIN_USER_NAME_XPATH = ".//*[@id=\"UserName\"]";
    public final String LOGIN_USER_NAME_CSS = "";

    public final String LOGIN_PASSWORD_XPATH = ".//*[@id=\"Password\"]";
    public final String LOGIN_PASSWORD_CSS = "";

    public final String LOGIN_BTN_XPATH = ".//*[@type=\"submit\"][contains(text(),\"Sign In\")]";
    public final String LOGIN_BTN_CSS = "";

    public final String LOGIN_FORGOT_PASSWORD_XPATH = "//*[@id=\"container\"]/div/div/div[2]/a";
    public final String LOGIN_FORGOT_PASSWORD_CSS = "";

    public final String INVALID_EMAIL_ERROR_MSG_XPATH = "//*[@id=\"container\"]/div/div/div[1]/form/div[2]/span/span";
    public final String INVALID_EMAIL_ERROR_MSG_CSS= "";

    public final String INVALID_PASSWORD_ERROR_MSG_XPATH = "//*[@id=\"container\"]/div/div/div[1]/form/div[4]/span/span";
    public final String INVALID_PASSWORD_ERROR_MSG_CSS= "";

    public final String LOGIN_PAGE_TOAST_MSG_TITLE_XPATH = "//*[@class=\"toast-title\"]";
    public final String LOGIN_PAGE_TOAST_MSG_TITLE_CSS= "";

    public final String LOGIN_PAGE_TOAST_MSG_XPATH = "//*[@class=\"toast-message\"]";
    public final String LOGIN_PAGE_TOAST_MSG_CSS= "";

    public final String REQUIRED_EMAIL_ERROR_MSG_XPATH = "//*[@id=\"container\"]/div/div/div[1]/form/div[2]/span/span";
    public final String REQUIRED_EMAIL_ERROR_MSG_CSS= "";

    public final String REQUIRED_PASSWORD_ERROR_MSG_XPATH = "//*[@id=\"container\"]/div/div/div[1]/form/div[4]/span/span";
    public final String REQUIRED_PASSWORD_ERROR_MSG_CSS= "";


}
