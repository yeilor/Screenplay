package com.saucedemo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ensure.Ensure;

import static com.saucedemo.UI.loginUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class loginTask implements Task {

    private final String userName;
    private final String pass;

    public loginTask(String userName, String pass) {
        this.userName = userName;
        this.pass = pass;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(userName).into(TXT_USERNAME),
                Enter.theValue(pass).into(TXT_PASS),
                Click.on(BTN_LOGIN),
                Ensure.that(LBL_VALIDATE_PRODUCTS).isDisplayed()
        );

    }

    public static loginTask conDatos(String userName, String pass) {
        return instrumented(loginTask.class, userName, pass);
    }
}
