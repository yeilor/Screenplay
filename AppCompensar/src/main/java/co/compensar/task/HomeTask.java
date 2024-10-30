package co.compensar.task;

import co.compensar.utils.DataExcel;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Keys;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import static co.compensar.userinterfaces.HomeUI.*;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;


public class HomeTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        ArrayList<Map<String, String>> dataExcel;

        try {
            dataExcel = DataExcel.leerDatosDeHojaDeExcel("Data/DatosCompensar.xlsx", "Home");

            actor.attemptsTo(
                    WaitUntil.the(LBL_VALIDA_MIS_RECOMENDADOS, WebElementStateMatchers.isVisible()).forNoMoreThan(40).seconds(),
                    Ensure.that(LBL_VALIDA_MIS_RECOMENDADOS).isEnabled(),
                    WaitUntil.the(BTN_BUSCAR, WebElementStateMatchers.isClickable()).forNoMoreThan(30).seconds(),
                    Click.on(BTN_BUSCAR),
                    Enter.theValue(dataExcel.get(0).get("NombreExperiencia")).into(TXT_EXPERIENCIA)
            );

            new Actions(getDriver()).sendKeys(Keys.ENTER).perform();

            actor.attemptsTo(
                    WaitUntil.the(IMG_VALIDA_IMAGEN, WebElementStateMatchers.isVisible()).forNoMoreThan(50).seconds(),
                    Ensure.that(IMG_VALIDA_IMAGEN).isEnabled(),
                    Click.on(IMG_VALIDA_IMAGEN),
                    Click.on(TXT_CANTIDAD),
                    Clear.field(TXT_CANTIDAD),
                    Enter.keyValues(dataExcel.get(0).get("Cantidad")).into(TXT_CANTIDAD),
                    Click.on(BTN_AGREGAR_CARRITO),
                    Click.on(BTN_IR_AL_CARRITO),
                    Click.on(BTN_COMPRAR),
                    Click.on(BTN_COMPRA_CARRITO),
                    Click.on(BTN_CONTINUAR_COMPRA),
                    Click.on(BTN_CONTINUAR_PAGO),
                    WaitUntil.the(LBL_VALIDA_TEXTO_FELICITACIONES, WebElementStateMatchers.isVisible()).forNoMoreThan(15).seconds(),
                    Ensure.that(LBL_VALIDA_TEXTO_FELICITACIONES).isDisplayed(),
                    Click.on(BTN_ENTENDIDO)
            );

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static Performable go() {
        return Instrumented.instanceOf(HomeTask.class).withProperties();
    }
}
