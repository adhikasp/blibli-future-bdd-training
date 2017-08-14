package com.blibli.future.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class BlibliPaymentPage extends PageObject {

    @FindBy(id = "gdn-next-step")
    private WebElementFacade toPaymentMethodButton;

    @FindBy(id = "gdn-payment-category-InternetBanking")
    private WebElementFacade internetBankingInputRadio;

    @FindBy(id = "payment_userid")
    private WebElementFacade usernameInput;

    @FindBy(id = "gdn-submit-checkout")
    private WebElementFacade finishPaymentPage;

    @FindBy(xpath = "//*[@id=\"blibli-main-ctrl\"]/section/div/section/div/div/div[1]/div[1]/h1")
    private WebElementFacade thankYouText;

    public WebElementFacade getToPaymentMethodButton() {
        return toPaymentMethodButton;
    }

    public WebElementFacade getInternetBankingInputRadio() {
        return internetBankingInputRadio;
    }

    public WebElementFacade getUsernameInput() {
        return usernameInput;
    }

    public WebElementFacade getFinishPaymentPage() {
        return finishPaymentPage;
    }

    public WebElementFacade getThankYouText() {
        return thankYouText;
    }
}
