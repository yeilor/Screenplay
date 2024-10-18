package co.compensar.stepDefinitions;

import co.compensar.tasks.FacturacionPuntosTask;
import io.cucumber.java.es.*;
import net.serenitybdd.screenplay.actors.OnStage;

public class CompraConPuntosStepDefinition {


    @Cuando("el usuario selecciona una experiencia para comprar {string} {string}")
    public void elUsuarioSeleccionaUnaExperienciaParaComprar(String nombreExperiencia, String cantidad) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                FacturacionPuntosTask.conDatos(nombreExperiencia, cantidad)
        );
    }

    @Y("realiza el proceso completo de la compra")
    public void realizaElProcesoCompletoDeLaCompra() {
        OnStage.theActorInTheSpotlight().attemptsTo(
        );
    }

    @Entonces("el usuario visualizara un mensaje de felicitaciones por la compra")
    public void elUsuarioVisualizaraUnMensajeDeFelicitacionesPorLaCompra() {
    }
}
