package com.totalamber.qa.data.UI.elements.webQuarters;

/**
 * Created by t.piyananda on 09/10/2017.
 */
public interface wqLicenseCategoryPage {

    public final String LICENSEPREF_PAGE_TITLE_XPATH = "//div[contains(@id,'_76a3499e9a14')]/h1";
    public final String LICENSEPREF_PAGE_TITLE_CSS = "";

    public final String LICENSEPREF_PAGE_LICENSECAT_LABEL_XPATH = "//div[contains(@class,'mr15')]/h4/span";
    public final String LICENSEPREF_PAGE_LICENSECAT_LABEL_CSS = "";

    public final String LICENSEPREF_PAGE_LICENSECAT_DROPDOWN_XPATH = "//select[contains(@name,'DropDownListLicenceCategory')]";
    public final String LICENSEPREF_PAGE_LICENSECAT_DROPDOWN_CSS = "";

    public final String LICENSEPREF_PAGE_LICENSECAT_DROPDOWN_SELECTED_XPATH = "//select[contains(@name,'DropDownListLicenceCategory')]/option[(@selected='selected')]";
    public final String LICENSEPREF_PAGE_LICENSECAT_DROPDOWN_SELECTED_CSS = "";

    public final String LICENSEPREF_PAGE_LICENSECAT_CONT_BTN_XPATH = "//input[contains(@name,'ButtonContinue')]";
    public final String LICENSEPREF_PAGE_LICENSECAT_CONT_BTN_CSS = "";

    public final String LICENSEPREF_PAGE_LICENSECAT_ERROR_XPATH = "//span[contains(@id,'LabelError')]";
    public final String LICENSEPREF_PAGE_LICENSECAT_ERROR_CSS = "";
}
