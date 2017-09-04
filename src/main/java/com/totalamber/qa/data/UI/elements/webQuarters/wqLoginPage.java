package com.totalamber.qa.data.UI.elements.webQuarters;

/**
 * Created by s.rodrigo on 9/1/2017.
 */
public interface wqLoginPage {
    public final String LOGIN_USER_NAME_XPATH = ".//*[contains(@id,'_UserName')]";
    public final String LOGIN_USER_NAME_CSS = "";

    public final String LOGIN_PASSWORD_XPATH = ".//*[contains(@id,'_Password')]";
    public final String LOGIN_PASSWORD_CSS = "";

    public final String LOGIN_BTN_XPATH = ".//*[contains(@id,'_LoginButton')]";
    public final String LOGIN_BTN_CSS = "";

    public final String LOGIN_ERROR_MSG_XPATH = ".//*[@id='ctl00_PlaceHolderMain_signInControl']/tbody/tr/td/div/div/div[2]";
    public final String LOGIN_ERROR_MSG_CSS = "div.error-msg";

}
