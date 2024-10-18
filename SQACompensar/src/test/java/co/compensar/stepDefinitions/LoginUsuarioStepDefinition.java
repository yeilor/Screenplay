package co.compensar.stepDefinitions;

import co.compensar.tasks.LoginUsuarioTask;
import io.cucumber.java.Before;
import io.cucumber.java.es.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class LoginUsuarioStepDefinition {

    @Before
    public void setStage() {
        setTheStage(new OnlineCast());
    }

    @Dado("que el usuario se encuentra en pagina web de Bienestar {string}")
    public void queElUsuarioSeEncuentraEnPaginaWebDeBienestar(String url) {
        WebDriverManager.chromedriver().setup();
        theActorCalled("Test").wasAbleTo(Open.url(url));
    }

    @Cuando("seleccione el tipo de documento e ingrese el numero de documento con la clave {string} {string} {string}")
    public void seleccioneElTipoDeDocumentoEIngreseElNumeroDeDocumentoConLaClave(String usuario, String clave, String tipoDocumento) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                LoginUsuarioTask.conDatos(tipoDocumento, usuario, clave)
        );
    }

    @Entonces("visualizara la ventana de experiencias")
    public void visualizaraLaVentanaDeExperiencias() {
    }

}
