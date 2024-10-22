package com.saucedemo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ensure.Ensure;

import static com.saucedemo.UI.compraUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class compraTask implements Task {

    private final String firstName;
    private final String lastName;
    private final String postalCode;

    public compraTask(String firstName, String lastName, String postalCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.postalCode = postalCode;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_ADD_TO_CAR1),
                Click.on(BTN_ADD_TO_CAR2),
                Click.on(BTN_ADD_TO_CAR3),
                Ensure.that(TXT_VALIDA_CANT).isDisplayed(),
                Click.on(IMG_CAR),
                Click.on(BTN_REMOVE),
                Click.on(BTN_CHECKOUT),
                Ensure.that(TXT_VALIDATE_NEW_CANT).isDisplayed(),
                Ensure.that(LBL_CHECKOUT).isDisplayed(),
                Enter.theValue(firstName).into(TXT_FIRTS_NAME),
                Enter.theValue(lastName).into(TXT_LAST_NAME),
                Enter.theValue(postalCode).into(TXT_POSTAL_CODE),
                Click.on(BTN_CONTINUE),
                Ensure.that(LBL_CHECK_OUT).isDisplayed(),
                Click.on(BTN_FINISH),
                Ensure.that(LBL_VALIDATE_ORDER).isDisplayed(),
                Click.on(BTN_BACK_HOME),
                Ensure.that(LBL_VALIDATE_HOME).isDisplayed(),
                Click.on(BTN_MENU),
                Click.on(BTN_LOGOUT)
        );
    }

    public static compraTask conDatos(String firstName, String lastName, String postalCode) {
        return instrumented(compraTask.class, firstName, lastName, postalCode);
    }
}
