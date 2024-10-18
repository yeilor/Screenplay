package co.compensar.stepDefinitions;

import co.compensar.tasks.LoginUsuarioAdminTask;
import io.cucumber.java.Before;
import io.cucumber.java.es.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class LoginAdminStepDefinitions {

    @Before
    public void setStage() {
        setTheStage(new OnlineCast());
    }

    @Dado("que el usuario se encuentra en la pagina web de Bienestar {string}")
    public void queElUsuarioSeEncuentraEnLaPaginaWebDeBienestar(String url) {
        WebDriverManager.chromedriver().setup();
        theActorCalled("Test").wasAbleTo(Open.url(url));
    }

    @Cuando("seleccione el tipo de documento ingresando el numero de documento con la clave {string} {string} {string}")
    public void seleccioneElTipoDeDocumentoIngresandoElNumeroDeDocumentoConLaClave(String usuario, String clave, String tipoDocumento) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                LoginUsuarioAdminTask.conDatos(tipoDocumento, usuario, clave)
        );
    }

    @Entonces("visualizara la ventana de Administrador de Plataforma")
    public void visualizaraLaVentanaDeAdministradorDePlataforma() {
    }
}
