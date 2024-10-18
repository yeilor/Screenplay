package co.compensar.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import java.nio.file.Paths;

import static co.compensar.userinterfaces.CargarInventario.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class CargarinventarioTask implements Task {

    private final String buscar;

    public CargarinventarioTask(String buscar) {
        this.buscar = buscar;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(LST_INVENTARIOS),
                Click.on(LST_INVENTARIOS),
                Click.on(BTN_INVENTARIO),
                Enter.theValue(buscar).into(TXT_BUSCAR),
                WaitUntil.the(CHK_SELECCIONA_NOMBRE, isVisible()).forNoMoreThan(10).seconds(),
                WaitUntil.the(CHK_SELECCIONA_NOMBRE, isClickable()).forNoMoreThan(10).seconds(),
                JavaScriptClick.on(CHK_SELECCIONA_NOMBRE)
        );

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        String cantidadInventario = actor.asksFor(Text.of(TXT_CANT)).toString();
        System.out.println("La cantidad inicial en el inventario es: " + cantidadInventario);

        actor.attemptsTo(
                Scroll.to(BTN_SUBIR_ARCHIVO),
                Upload.theFile(Paths.get("plantilla_cargue_bonos.csv")).to(INP_SUBIR_ARCHIVO)
        );


        actor.attemptsTo(
                WaitUntil.the(LBL_VALIDA_CARGA, isVisible()).forNoMoreThan(250).seconds(),
                Ensure.that(LBL_VALIDA_CARGA).isDisplayed(),
                Click.on(BTN_TERMINAR)
        );


        actor.attemptsTo(
                SendKeys.of(Keys.CONTROL + "a").into(TXT_BUSCAR),  // Selecciona todo
                SendKeys.of(Keys.DELETE).into(TXT_BUSCAR),         // Elimina el contenido
                Enter.theValue(buscar).into(TXT_BUSCAR)
        );

        String cantidadInv = actor.asksFor(Text.of(TXT_CANT)).toString();
        System.out.println("La cantidad nueva en el inventario es: " + cantidadInv);

        actor.attemptsTo(
                WaitUntil.the(IMG_AVATAR, isVisible()).forNoMoreThan(15).seconds(),
                JavaScriptClick.on(IMG_AVATAR),
                Click.on(BTN_CERRAR_SESION)
        );
    }

    public static CargarinventarioTask conDatos(String buscar) {
        return instrumented(CargarinventarioTask.class, buscar);
    }
}




