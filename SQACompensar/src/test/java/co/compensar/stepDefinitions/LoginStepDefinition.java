package co.compensar.stepDefinitions;


import co.compensar.tasks.LoginTask;
import io.cucumber.java.Before;
import io.cucumber.java.es.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;

import java.io.IOException;

import static co.compensar.userinterfaces.PaginaInicio.TXT_VALIDAR;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;


public class LoginStepDefinition {


    @Before
    public void setStage() {
        setTheStage(new OnlineCast());
    }

    @Dado("que el usuario se encuentre en pagina web de Bienestar {string}")
    public void queElUsuarioSeEncuentreEnPaginaWebDeBienestar(String url) throws IOException {
        WebDriverManager.chromedriver().setup();
        theActorCalled("Test").wasAbleTo(Open.url(url));
    }

    @Cuando("seleccione el tipo de documento e ingrese el numero de documento con la clave {string} {string} {string}")
    public void seleccioneElTipoDeDocumentoEIngreseElNumeroDeDocumentoConLaClave(String usuario, String clave, String tipoDocumento) throws IOException {
        OnStage.theActorInTheSpotlight().attemptsTo(
                LoginTask.conDatos(tipoDocumento, usuario, clave)
        );


    }

    @Entonces("visualizara la ventana de experiencias")
    public void visualizaraLaVentanaDeExperiencias() {
        Ensure.that(TXT_VALIDAR).isDisplayed();
    }

}
