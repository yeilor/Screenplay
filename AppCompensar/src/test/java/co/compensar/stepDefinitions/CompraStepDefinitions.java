package co.compensar.stepDefinitions;

import co.compensar.driver.AppiumAndroidDriver;
import co.compensar.task.HomeTask;
import co.compensar.task.LogOutTask;
import co.compensar.task.LoginTask;

import cucumber.api.java.Before;
import cucumber.api.java.es.*;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.io.IOException;

public class CompraStepDefinitions {

    @Before
    public void before() throws IOException {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que el usuario se encuentre en la app de Bienestar$")
    public void queElUsuarioSeEncuentreEnLaAppDeBienestar() {
        OnStage.theActorCalled("").can(BrowseTheWeb.with(AppiumAndroidDriver.suNavegador().onDriver()));
    }


    @Cuando("^ingresa con sus credenciales$")
    public void ingresaConSusCredenciales() {
        OnStage.theActorInTheSpotlight().attemptsTo(LoginTask.go());
    }

    @Y("^realiza una compra de experiencia$")
    public void realizaUnaCompraDeExperiencia() {
        OnStage.theActorInTheSpotlight().attemptsTo(HomeTask.go());
    }

    @Entonces("visualizara mensaje de Felicitaciones$")
    public void visualizaraMensajeDeFelicitaciones() {
    }

    @Y("^hara Logout$")
    public void haraLogout() {
        OnStage.theActorInTheSpotlight().attemptsTo(LogOutTask.go());
    }

}
