package com.saucedemo.stepDefinitions;

import com.saucedemo.tasks.loginTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class loginStepDef {

    @Before
    public void setStage() {
        setTheStage(new OnlineCast());
    }

    @Given("the user is on the Swags Labs page {string}")
    public void theUserIsOnTheSwagsLabsPage(String url) {
        WebDriverManager.chromedriver().setup();
        theActorCalled("Test").wasAbleTo(Open.url(url));
    }

    @When("he enters his credentials correctly {string} {string}")
    public void heEntersHisCredentialsCorrectly(String userName, String pass) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                loginTask.conDatos(userName, pass)
        );
    }

    @Then("he sees the products of the cart")
    public void heSeesTheProductsOfTheCart() {
    }
}
