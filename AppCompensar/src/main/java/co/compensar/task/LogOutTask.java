package co.compensar.task;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.compensar.userinterfaces.LogOutUI.*;

public class LogOutTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(IMG_PERFIL),
                Click.on(IMG_ENGRANAJE),
                Click.on(BTN_CERRAR_SESION),
                WaitUntil.the(IMG_VALIDA_LOGO, WebElementStateMatchers.isVisible()).forNoMoreThan(15).seconds(),
                Ensure.that(IMG_VALIDA_LOGO).isEnabled()
        );
    }

    public static Performable go() {
        return Instrumented.instanceOf(LogOutTask.class).withProperties();
    }
}
