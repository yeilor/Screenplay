package co.compensar.stepDefinitions;

import co.compensar.tasks.CargarinventarioTask;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

public class CargarInventarioStepDefinitions {

    @Cuando("realiza un cargue de inventario {string}")
    public void realizaUnCargueDeInventario(String buscar) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                CargarinventarioTask.conDatos(buscar)
        );
    }


    @Entonces("visualizara un mensaje de Carga Exitosa")
    public void visualizaraUnMensajeDeCargaExitosa() {
    }
}