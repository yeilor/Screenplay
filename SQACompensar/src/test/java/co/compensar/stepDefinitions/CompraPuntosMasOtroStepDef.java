package co.compensar.stepDefinitions;

import co.compensar.tasks.CompraConPuntosMasOtroTask;
import io.cucumber.java.es.*;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CompraPuntosMasOtroStepDef {

    @Y("selecciona un medio de pago realizando el proceso completo de la compra {string} {string} {string} {string} {string} {string} {string} {string} {string}")
    public void seleccionaUnMedioDePagoRealizandoElProcesoCompletoDeLaCompra(String Puntos, String Banco, String TipoPersona, String Nombre, String Celular, String Direccion, String TipoIdentificacion, String NoDocumento, String Correo) {
        theActorInTheSpotlight().attemptsTo(
                CompraConPuntosMasOtroTask.conDatos(Puntos, Banco, TipoPersona, Nombre, Celular, Direccion, TipoIdentificacion, NoDocumento, Correo)
        );
    }

    @Entonces("el usuario visualizara un mensaje de felicitaciones por la compra realizada")
    public void elUsuarioVisualizaraUnMensajeDeFelicitacionesPorLaCompraRealizada() {
    }
}
