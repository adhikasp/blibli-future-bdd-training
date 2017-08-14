package com.blibli.future.pages;

import io.vavr.collection.List;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class BlibliCatalogPage extends PageObject {

    @FindBys(@FindBy(className="single-product"))
    private List<WebElementFacade> catalogItem;

    @FindBy(className = "gdn-add-to-cart-top")
    private WebElementFacade addToCartButton;

    public List<WebElementFacade> getCatalogItem() {
        return catalogItem;
    }

    public WebElementFacade getAddToCartButton() {
        return addToCartButton;
    }
}
