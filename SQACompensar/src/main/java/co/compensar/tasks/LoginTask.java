package co.compensar.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.ensure.Ensure;

import static co.compensar.userinterfaces.PaginaInicio.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LoginTask implements Task {

    private final String tipoDocumento;
    private final String usuario;
    private final String clave;

    public LoginTask(String tipoDocumento, String usuario, String clave) {
        this.tipoDocumento = tipoDocumento;
        this.usuario = usuario;
        this.clave = clave;
    }

    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_INGRESAR),
                SelectFromOptions.byVisibleText(tipoDocumento).from(DDL_SELECCIONAR),
                Enter.theValue(usuario).into(TXT_USUARIO),
                Enter.theValue(clave).into(TXT_CONTRASENA),
                Click.on(BTN_INGRESAR_CUENTA)

        );
    }

    public static LoginTask conDatos(String tipoDocumento, String usuario, String clave) {
        return instrumented(LoginTask.class, tipoDocumento, usuario, clave);
    }
}
