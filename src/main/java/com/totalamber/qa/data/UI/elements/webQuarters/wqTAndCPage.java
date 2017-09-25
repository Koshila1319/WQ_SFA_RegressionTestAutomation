package com.totalamber.qa.data.UI.elements.webQuarters;

/**
 * Created by t.piyananda on 25/09/2017.
 */
public interface wqTAndCPage {

    public final String TANDCPAGE_TITLE_XPATH = "//div[contains(@class,'mAuto')]/h1";
    public final String TANDCPAGE_TITLE_CSS = "";

    public final String TANDCPAGE_IAGREE_RADIO_XPATH = "//input[contains(@id,'_radioButtonTCAccepted_0')]";
    public final String TANDCPAGE_IAGREE_RADIO_CSS = "";

    public final String TANDCPAGE_IDISAGREE_RADIO_XPATH = "//input[contains(@id,'_radioButtonTCAccepted_1')]";
    public final String TANDCPAGE_IDISAGREE_RADIO_CSS = "";

    public final String TANDCPAGE_IAGREE_CONTENT_XPATH = "//label[contains(@for,'_radioButtonTCAccepted_0')]";
    public final String TANDCPAGE_IAGREE_CONTENT_CSS = "";

    public final String TANDCPAGE_IDISAGREE_CONTENT_XPATH = "//label[contains(@for,'_radioButtonTCAccepted_1')]";
    public final String TANDCPAGE_IDISAGREE_CONTENT_CSS = "";

    public final String TANDCPAGE_IDISAGREE_REASON_XPATH = "//textarea[contains(@id,'_textBoxRejectionReason')]";
    public final String TANDCPAGE_IDISAGREE_REASON_CSS = "";

    public final String TANDCPAGE_CONFIRM_BUTTON_XPATH = "//input[contains(@name,'buttonConfirm')]";
    public final String TANDCPAGE_CONFIRM_BUTTON_CSS = "";

}
