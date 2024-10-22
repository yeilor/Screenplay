package co.compensar.tasks;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.compensar.userinterfaces.PaginaDeExperiencia.*;
import static co.compensar.userinterfaces.LoginUsuario.LBL_PUNTOS;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class FacturacionPuntosTask implements Task {

    private final String nombreExperiencia;
    private final String cantidad;

    public FacturacionPuntosTask(String nombreExperiencia, String cantidad) {
        this.nombreExperiencia = nombreExperiencia;
        this.cantidad = cantidad;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Check.whether(
                                BTN_CERRAR_NOTIFICACIONES.resolveFor(actor).isVisible())
                        .andIfSo(
                                Click.on(BTN_CERRAR_NOTIFICACIONES)
                        ),

                Click.on(TXT_BUSQUEDA),
                WaitUntil.the(TXT_BUSQUEDA, isVisible()).forNoMoreThan(30).seconds(),
                Enter.theValue(nombreExperiencia).into(TXT_BUSQUEDA),
                Click.on(BTN_BUSCAR),
                WaitUntil.the(IMG_EXPERIENCIA, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(IMG_EXPERIENCIA),
                WaitUntil.the(TXT_VALIDAR_EXPERIENCIA, isVisible()).forNoMoreThan(30).seconds(),
                Ensure.that(TXT_VALIDAR_EXPERIENCIA).isDisplayed(),
                Clear.field(BTN_INGRESA_CANT),
                Enter.theValue(cantidad).into(BTN_INGRESA_CANT),
                Click.on(BTN_AGREGAR_CARRITO),
                WaitUntil.the(BTN_IR_CARRITO, isVisible()).forNoMoreThan(30).seconds(),
                Click.on(BTN_IR_CARRITO),

                //Facturación con puntos
                Scroll.to(BTN_IR_PAGAR),
                Click.on(BTN_IR_PAGAR),
                WaitUntil.the(BTN_CONTINUAR_PAGO, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(BTN_CONTINUAR_PAGO),
                WaitUntil.the(BTN_COMPRAR, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(BTN_COMPRAR),
                WaitUntil.the(TXT_VALIDAR_TITULO_MENSAJE, isVisible()).forNoMoreThan(20).seconds(),
                Ensure.that(TXT_VALIDAR_TITULO_MENSAJE).isDisplayed(),
                Ensure.that(TXT_VALIDAR_CONTENIDO_MENSAJE).isDisplayed(),
                Click.on(BTN_ENTENDIDO),
                Ensure.that(LBL_BONOS).isDisplayed()
        );

        Serenity.getDriver().navigate().refresh();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        actor.attemptsTo(
                Check.whether(
                                BTN_CERRAR_NOTIFICACIONES.resolveFor(actor).isVisible())
                        .andIfSo(
                                Click.on(BTN_CERRAR_NOTIFICACIONES)
                        )
        );

        String cantidadPuntos = actor.asksFor(Text.of(LBL_PUNTOS)).toString();
        System.out.println("La cantidad final de puntos es: " + cantidadPuntos);

        actor.attemptsTo(
                Click.on(IMG_PERFIL),
                Click.on(BTN_CERRAR_SESION)
        );


    }

    public static FacturacionPuntosTask conDatos(String nombreExperiencia, String cantidad) {
        return instrumented(FacturacionPuntosTask.class, nombreExperiencia, cantidad);
    }
}