package com.webQuarters.qa.data.UI.elements.webQuarters.elements;

/**
 * Created by e.koshila on 3/25/2020.
 */

public interface mailinatorEmailPage {

    public final String CLICK_ON_EMAIL_FIELD_XPATH = "//*[@id=\"addOverlay\"]";
    public final String CLICK_ON_EMAIL_FIELD_CSS = "";

    public final String EMAIL_GO_XPATH = "//*[@id=\"go-to-public\"]";
    public final String EMAIL_GO_CSS = "";

    public final String LATEST_RECEIVED_PASSWORD_RECOVERY_MAILINATOR_EMAIL_XPATH = "//*/td[4]/a[contains(text(),'SFA - Password Recovery')]";
    public final String LATEST_RECEIVED_PASSWORD_RECOVERY_MAILINATOR_EMAIL_CSS = "";

    public final String MAILINATOR_PASSWORD_RECOVERY_EMAIL_USER_NAME_XPATH = "//td[2]/table//tr[1]/td[2]";
    public final String MAILINATOR_PASSWORD_RECOVERY_EMAIL_USER_NAME_CSS = "";

    public final String MAILINATOR_PASSWORD_RECOVERY_EMAIL_ACTIVATION_CODE_NAME_XPATH = "//td[2]/table//tr[2]/td[2]";
    public final String MAILINATOR_PASSWORD_RECOVERY_EMAIL_ACTIVATION_CODE_NAME_CSS = "";

    public final String MAILINATOR_PASSWORD_RECOVERY_EMAIL_RECOVER_BUTTON_XPATH = "//table[2]//a";
    public final String MAILINATOR_PASSWORD_RECOVERY_EMAIL_RECOVER_BUTTON_CSS = "";

    public final String LATEST_RECEIVED_ACCOUNT_ACTIVATION_SUCCESS_EMAIL_MAILINATOR_EMAIL_XPATH = "//*/td[4]/a[contains(text(),'SFA - Account Activated Successfully')]";
    public final String LATEST_RECEIVED_ACCOUNT_ACTIVATION_SUCCESS_EMAIL_MAILINATOR_EMAIL_CSS = "";

    public final String MAILINATOR_ACCOUNT_ACTIVATION_SUCCESS_EMAIL_USER_NAME_XPATH = "//td[2]/table//td[2]";
    public final String MAILINATOR_ACCOUNT_ACTIVATION_SUCCESS_EMAIL_USER_NAME_CSS = "";

    public final String MAILINATOR_ACCOUNT_ACTIVATION_SUCCESS_EMAIL_SIGNIN_BUTTON_XPATH = "//table[2]//a";
    public final String MAILINATOR_ACCOUNT_ACTIVATION_SUCCESS_EMAIL_SIGNIN_BUTTON_CSS = "";





}
