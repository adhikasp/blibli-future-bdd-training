package com.blibli.future.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://blibli.com")
public class BlibliHomePage extends PageObject {

    @FindBy(id = "gdn-login-registrasi")
    private WebElementFacade showLoginButton;

    @FindBy(id = "gdn-login-modal-body")
    private WebElementFacade loginModalBody;

    @FindBy(id = "loginEmail")
    private WebElementFacade loginEmailField;

    @FindBy(id = "loginPassword")
    private WebElementFacade loginPasswordField;

    @FindBy(id = "gdn-submit-login")
    private WebElementFacade loginButton;

    @FindBy(id = "gdn-already-login-label")
    private WebElementFacade usernameLabel;

    @FindBy(name = "s")
    private WebElementFacade searchField;

    @FindBy(id = "gdn-search-button")
    private WebElementFacade searchButton;


    public WebElementFacade getShowLoginButton() {
        return showLoginButton;
    }

    public WebElementFacade getLoginModalBody() {
        return loginModalBody;
    }

    public WebElementFacade getLoginEmailField() {
        return loginEmailField;
    }

    public WebElementFacade getLoginPasswordField() {
        return loginPasswordField;
    }

    public WebElementFacade getLoginButton() {
        return loginButton;
    }

    public WebElementFacade getUsernameLabel() {
        return usernameLabel;
    }

    public WebElementFacade getSearchField() {
        return searchField;
    }

    public WebElementFacade getSearchButton() {
        return searchButton;
    }
}
