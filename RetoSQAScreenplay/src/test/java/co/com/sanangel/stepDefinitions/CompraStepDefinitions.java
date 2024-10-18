package co.com.sanangel.stepDefinitions;

import co.com.sanangel.compras.tasks.CompraTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.sanangel.compras.UI.ComprasUI.LBL_NUMORDEN;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static org.assertj.core.api.Assertions.assertThat;

public class CompraStepDefinitions {

    @Before
    public void setStage() {
        setTheStage(new OnlineCast());
    }

    @Given("Que me encuentro en la pagina de compras de san Angel {string}")
    public void queMeEncuentroEnLaPaginaDeComprasDeSanAngel(String url) {
        WebDriverManager.chromedriver().setup();
        theActorCalled("Robot").wasAbleTo(Open.url(url));

    }

    @When("agrego dos productos al carrito con diferentes cantidades {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string}")
    public void agregoDosProductosAlCarritoConDiferentesCantidadesCantidadProductoNombreClienteApellidoClienteDocumentoTelefonoClienteCorreoClienteNombreDestinatarioMunicipioDireccionInfoAdicionalTelefonoDestinatarioMensajeFirmaHorarioObservaciones(String CantidadProducto, String NombreCliente, String ApellidoCliente, String Documento, String TelefonoCliente, String CorreoCliente, String NombreDestinatario, String Municipio, String Direccion, String InfoAdicional, String TelefonoDestinatario, String Mensaje, String Firma, String Horario, String Observaciones, String fecha, String CeluPago) {

        theActorInTheSpotlight().attemptsTo(
                CompraTask.conDatos(CantidadProducto, NombreCliente, ApellidoCliente, Documento,
                        TelefonoCliente, CorreoCliente, NombreDestinatario, Municipio,
                        Direccion, InfoAdicional, TelefonoDestinatario, Mensaje,
                        Firma, Horario, Observaciones, fecha, CeluPago)
        );

    }

    @Then("Se visualiza el resumen de la compra")
    public void seVisualizaElResumenDeLaCompra() {
        String resumenCompraActual = OnStage.theActorInTheSpotlight().asksFor(Text.of(LBL_NUMORDEN));
        String resumenCompraEsperado = "Resumen de la compra";
        assertThat(resumenCompraActual).isEqualTo(resumenCompraEsperado);
    }
}
