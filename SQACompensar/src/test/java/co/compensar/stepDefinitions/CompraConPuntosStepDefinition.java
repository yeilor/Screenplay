package co.compensar.stepDefinitions;

import co.compensar.tasks.ComprarConPuntosExperiencia;
import io.cucumber.java.es.*;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;

import java.io.IOException;

import static co.compensar.userinterfaces.PaginaDeExperiencia.TXT_VALIDAR_CONTENIDO_MENSAJE;
import static co.compensar.userinterfaces.PaginaDeExperiencia.TXT_VALIDAR_TITULO_MENSAJE;

public class CompraConPuntosStepDefinition {


    @Cuando("el usuario selecciona una experiencia para comprar {string} {string}")
    public void elUsuarioSeleccionaUnaExperienciaParaComprar(String nombreExperiencia, String cantidad) throws IOException {
        OnStage.theActorInTheSpotlight().attemptsTo(
                ComprarConPuntosExperiencia.conDatos(nombreExperiencia, cantidad)
        );

    }

    @Y("realiza el proceso completo de la compra")
    public void realizaElProcesoCompletoDeLaCompra() {
    }

    @Entonces("el usuario visualizara un mensaje de felicitaciones por la compra")
    public void elUsuarioVisualizaraUnMensajeDeFelicitacionesPorLaCompra() {
        Ensure.that(TXT_VALIDAR_TITULO_MENSAJE).isDisplayed();
        Ensure.that(TXT_VALIDAR_CONTENIDO_MENSAJE).isDisplayed();
    }

}
