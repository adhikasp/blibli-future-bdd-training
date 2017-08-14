package com.blibli.future.steps;

import com.blibli.future.behaviour.BlibliUserSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class DefinitionSteps {
    @Steps
    BlibliUserSteps blibliUser;

    @Given("Blibli home page")
    public void givenTheUserIsOnTheHomePage() {
        blibliUser.in_the_home_page();
    }

    @Given("Blibli cart page")
    public void givenUserIsOnTheCarPage() {
        blibliUser.inTheCartPage();
    }

    @When("I login with '$email' as email and '$password' as password")
    public void whenTheUserEnterWithCredential(String email, String password)
    {
        blibliUser.login(email, password);
    }

    @Then("I can see my name 'Adhika Setya' in the site")
    public void thenTheyCanSeeTheirName(String name) {
        blibliUser.isLoggedIn();
    }

    @When("I search for '$productName'")
    public void whenUserSearchProduct(String $productName) {
        blibliUser.searchProduct($productName);
    }

    @When("choose item no '$position' in catalog list")
    public void whenUserClickFirstItemOnCatalog(int position) {
        blibliUser.clickItemInCatalog(position);
    }

    @When("add item to my cart")
    public void whenUserAddItemToTheirCart() {
        blibliUser.addItemToCart();
    }

    @Then("I can see the product '$productName' in my cart")
    public void thenUserCanSeeProductInCart(String productName) {
        blibliUser.isProductInCart(productName);
    }

    @When("I checkout and choose default address")
    public void whenUserCheckoutAndChooseDefaultAddress() {
        blibliUser.checkoutWithDefaultAddress();
    }

    @When("choose KlikBCA as payment method with '$username' as user ID")
    public void whenUserChooseKlikBcaAsPaymentMethod(String username) {
        blibliUser.chooseKlikBcaPaymentMethod(username);
    }

    @When("finish payment process")
    public void whenUserFinishPaymentProcess() {
        blibliUser.finishPayment();
    }

    @Then("I can see thank you page")
    public void thenUserCanSeeThankYouPage() {
        blibliUser.seePaymentPage();
    }
}
