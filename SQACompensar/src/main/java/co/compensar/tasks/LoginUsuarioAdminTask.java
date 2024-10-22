package co.compensar.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.compensar.userinterfaces.LoginUsuario.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class LoginUsuarioAdminTask implements Task {

    private final String tipoDocumento;
    private final String usuario;
    private final String clave;

    public LoginUsuarioAdminTask(String tipoDocumento, String usuario, String clave) {
        this.tipoDocumento = tipoDocumento;
        this.usuario = usuario;
        this.clave = clave;
    }

    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_INGRESAR_ADMIN, isClickable()).forNoMoreThan(10).seconds(),
                Click.on(BTN_INGRESAR_ADMIN),
                SelectFromOptions.byVisibleText(tipoDocumento).from(LST_SELECCIONAR),
                Enter.theValue(usuario).into(TXT_USUARIO),
                Enter.theValue(clave).into(TXT_CLAVE),
                Scroll.to(BTN_INGRESAR_CUENTA),
                Click.on(BTN_INGRESAR_CUENTA)
        );

        //JOptionPane.showMessageDialog(null, "Espera");

        actor.attemptsTo(
                Ensure.that(LBL_VALIDA_ADMIN_PLATAFORMA).isDisplayed()
        );

    }

    public static LoginUsuarioAdminTask conDatos(String tipoDocumento, String usuario, String clave) {
        return instrumented(LoginUsuarioAdminTask.class, tipoDocumento, usuario, clave);
    }
}
