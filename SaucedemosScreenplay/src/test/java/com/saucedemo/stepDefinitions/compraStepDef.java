package com.saucedemo.stepDefinitions;

import com.saucedemo.tasks.compraTask;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.actors.OnStage;

public class compraStepDef {

    @When("he adds three products to the cart")
    public void heAddsThreeProductsToTheCart() {
    }

    @And("removes one product")
    public void removesOneProduct() {
    }

    @And("completes the purchase {string} {string} {string}")
    public void completesThePurchase(String firstName, String lastName, String postalCode) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                compraTask.conDatos(firstName, lastName, postalCode)
        );
    }

    @Then("he sees the message Thank you for your order")
    public void heSeesTheMessageThankYouForYourOrder() {
    }
}
