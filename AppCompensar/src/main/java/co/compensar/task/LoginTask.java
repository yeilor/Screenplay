package co.compensar.task;

import co.compensar.utils.DataExcel;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import static co.compensar.userinterfaces.LoginUI.*;

public class LoginTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        ArrayList<Map<String, String>> dataExcel;

        try {
            dataExcel = DataExcel.leerDatosDeHojaDeExcel("Data/DatosCompensar.xlsx", "Login");


            actor.attemptsTo(
                    WaitUntil.the(BTN_INGRESAR, WebElementStateMatchers.isVisible()).forNoMoreThan(15).seconds(),
                    Click.on(BTN_INGRESAR)
                    /*WaitUntil.the(LST_TIPO_DOC, WebElementStateMatchers.isVisible()).forNoMoreThan(15).seconds(),
                    Click.on(LST_TIPO_DOC),
                    Click.on(CHK_TIPO_DOC),
                    Enter.keyValues(dataExcel.get(0).get("Usuario")).into(TXT_NUM_DOC),
                    Enter.keyValues(dataExcel.get(0).get("Clave")).into(TXT_CLAVE),
                    Click.on(BTN_INGRESAR_LOGIN) */
            );


        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static Performable go() {
        return Instrumented.instanceOf(LoginTask.class).withProperties();
    }

}

