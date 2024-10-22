package co.compensar.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.Text;

import static co.compensar.userinterfaces.LoginUsuario.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LoginUsuarioTask implements Task {

    private final String tipoDocumento;
    private final String usuario;
    private final String clave;

    public LoginUsuarioTask(String tipoDocumento, String usuario, String clave) {
        this.tipoDocumento = tipoDocumento;
        this.usuario = usuario;
        this.clave = clave;
    }

    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                JavaScriptClick.on(BTN_INGRESAR),
                SelectFromOptions.byVisibleText(tipoDocumento).from(LST_SELECCIONAR),
                Enter.theValue(usuario).into(TXT_USUARIO),
                Enter.theValue(clave).into(TXT_CLAVE),
                Scroll.to(BTN_INGRESAR_CUENTA),
                Click.on(BTN_INGRESAR_CUENTA)

        );
        //JOptionPane.showMessageDialog(null, "Espera");

        actor.attemptsTo(
                Ensure.that(TXT_VALIDAR).isDisplayed()
        );

        String cantidadPuntos = actor.asksFor(Text.of(LBL_PUNTOS)).toString();
        System.out.println("La cantidad inicial de puntos es: " + cantidadPuntos);
    }

    public static LoginUsuarioTask conDatos(String tipoDocumento, String usuario, String clave) {
        return instrumented(LoginUsuarioTask.class, tipoDocumento, usuario, clave);
    }
}
