package com.blibli.future.behaviour;

import com.blibli.future.pages.BlibliCartPage;
import com.blibli.future.pages.BlibliCatalogPage;
import com.blibli.future.pages.BlibliHomePage;
import com.blibli.future.pages.BlibliPaymentPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class BlibliUserSteps extends ScenarioSteps {

    BlibliHomePage blibliHomePage;
    BlibliCatalogPage blibliCatalogPage;
    BlibliCartPage blibliCartPage;
    BlibliPaymentPage blibliPaymentPage;

    @Step
    public void in_the_home_page() {
        blibliHomePage.open();
    }

    @Step
    public void inTheCartPage() {
        blibliCartPage.open();
    }

    @Step
    public void login(String email, String password) {
        blibliHomePage.getShowLoginButton().click();
        blibliHomePage.getLoginEmailField().type(email);
        blibliHomePage.getLoginPasswordField().type(password);
        blibliHomePage.getLoginButton().click();
    }

    @Step
    public void isLoggedIn() {
        assert blibliHomePage.getUsernameLabel() != null;
    }

    @Step
    public void searchProduct(String name) {
        blibliHomePage.getSearchField().type(name);
        blibliHomePage.getSearchButton().click();
    }

    @Step
    public void clickItemInCatalog(int position) {
        blibliCatalogPage.getCatalogItem().get(position).click();
    }

    @Step
    public void addItemToCart() {
        blibliCatalogPage.getAddToCartButton().click();
    }

    @Step
    public void isProductInCart(String productName) {
        blibliCartPage.getProductList().shouldContainText(productName);
    }

    @Step
    public void checkoutWithDefaultAddress() {
        blibliCartPage.getCheckoutButton().click();
        blibliPaymentPage.getToPaymentMethodButton().click();
    }

    @Step
    public void chooseKlikBcaPaymentMethod(String username) {
        blibliPaymentPage.getInternetBankingInputRadio().click();
        blibliPaymentPage.getUsernameInput().type(username);
    }

    @Step
    public void finishPayment() {
        blibliPaymentPage.getFinishPaymentPage().click();
    }

    @Step
    public void seePaymentPage() {
        blibliPaymentPage.getThankYouText().shouldContainText("Terima Kasih");
    }
}
