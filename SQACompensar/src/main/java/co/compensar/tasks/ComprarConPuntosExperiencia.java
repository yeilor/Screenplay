package co.compensar.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.serenitybdd.screenplay.ensure.Ensure;

import static co.compensar.userinterfaces.PaginaDeExperiencia.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ComprarConPuntosExperiencia implements Task {

    private final String nombreExperiencia;
    private final String cantidad;

    public ComprarConPuntosExperiencia(String nombreExperiencia, String cantidad) {
        this.nombreExperiencia = nombreExperiencia;
        this.cantidad = cantidad;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                //WaitUntil.the(BTN_CERRAR_NOTIFICACIONES, isVisible()).forNoMoreThan(40).seconds(),
                //Click.on(BTN_CERRAR_NOTIFICACIONES),
                Click.on(TXT_BUSQUEDA),
                WaitUntil.the(TXT_BUSQUEDA, isVisible()).forNoMoreThan(30).seconds(),
                Enter.theValue(nombreExperiencia).into(TXT_BUSQUEDA),
                Click.on(BTN_BUSCAR),
                WaitUntil.the(IMB_EXPERIENCIA, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(IMB_EXPERIENCIA),
                WaitUntil.the(TXT_VALIDAR_EXPERIENCIA, isVisible()).forNoMoreThan(30).seconds(),
                Ensure.that(TXT_VALIDAR_EXPERIENCIA).isDisplayed(),
                WaitUntil.the(BTN_INCREMENTAR_CANTIDAD, isVisible()).forNoMoreThan(30).seconds()
        );

        int cantidadEntero = Integer.parseInt(cantidad) + 1;

        for (int i = 1; i < cantidadEntero; i++) {
            actor.attemptsTo(
                    Click.on(BTN_INCREMENTAR_CANTIDAD)
            );
        }


        actor.attemptsTo(
                Click.on(BTN_AGREGAR_CARRITO),
                WaitUntil.the(BTN_IR_CARRITO, isVisible()).forNoMoreThan(30).seconds(),
                Click.on(BTN_IR_CARRITO),
                WaitUntil.the(BTN_IR_PAGAR, isVisible()).forNoMoreThan(30).seconds(),
                Click.on(BTN_IR_PAGAR),
                WaitUntil.the(BTN_CONTINUAR_PAGO, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(BTN_CONTINUAR_PAGO),
                WaitUntil.the(BTN_COMPRAR, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(BTN_COMPRAR),
                WaitUntil.the(TXT_VALIDAR_TITULO_MENSAJE, isVisible()).forNoMoreThan(20).seconds()

        );
    }

    public static ComprarConPuntosExperiencia conDatos(String nombreExperiencia, String cantidad) {
        return instrumented(ComprarConPuntosExperiencia.class, nombreExperiencia, cantidad);
    }
}
