package com.blibli.future.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://www.blibli.com/cart")
public class BlibliCartPage extends PageObject {

    @FindBy(id = "cart-product-block")
    private WebElementFacade productList;

    @FindBy(id = "gdn-sb-page-continue-checkout")
    private WebElementFacade checkoutButton;

    public WebElementFacade getProductList() {
        return productList;
    }

    public WebElementFacade getCheckoutButton() {
        return checkoutButton;
    }
}
