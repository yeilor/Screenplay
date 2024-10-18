package co.com.sanangel.compras.tasks;

import co.com.sanangel.compras.UI.ComprasUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.sanangel.compras.UI.ComprasUI.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class CompraTask implements Task {

    private String CantidadProducto;
    private String NombreCliente;
    private String ApellidoCliente;
    private String Documento;
    private String TelefonoCliente;
    private String CorreoCliente;
    private String NombreDestinatario;
    private String Municipio;
    private String Direccion;
    private String InfoAdicional;
    private String TelefonoDestinatario;
    private String Mensaje;
    private String Firma;
    private String Horario;
    private String Observaciones;
    private String Fecha;

    private String CeluPago;

    public CompraTask(String CantidadProducto, String NombreCliente, String ApellidoCliente, String Documento,
                      String TelefonoCliente, String CorreoCliente, String NombreDestinatario, String Municipio,
                      String Direccion, String InfoAdicional, String TelefonoDestinatario, String Mensaje,
                      String Firma, String Horario, String Observaciones, String Fecha, String CeluPago) {
        this.CantidadProducto = CantidadProducto;
        this.NombreCliente = NombreCliente;
        this.ApellidoCliente = ApellidoCliente;
        this.Documento = Documento;
        this.TelefonoCliente = TelefonoCliente;
        this.CorreoCliente = CorreoCliente;
        this.NombreDestinatario = NombreDestinatario;
        this.Municipio = Municipio;
        this.Direccion = Direccion;
        this.InfoAdicional = InfoAdicional;
        this.TelefonoDestinatario = TelefonoDestinatario;
        this.Mensaje = Mensaje;
        this.Firma = Firma;
        this.Horario = Horario;
        this.Observaciones = Observaciones;
        this.Fecha = Fecha;
        this.CeluPago = CeluPago;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(
                // Seleccionar producto
                WaitUntil.the(ComprasUI.BTN_CAJAS, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(ComprasUI.BTN_CAJAS),
                Click.on(ComprasUI.BTN_PROD1),
                Scroll.to(TXT_CANT),
                Clear.field(TXT_CANT),
                Enter.theValue(String.valueOf(CantidadProducto)).into(TXT_CANT),
                Click.on(ComprasUI.BTN_CARRITO),

                // Completar información del cliente
                Enter.theValue(NombreCliente).into(ComprasUI.TXT_NOMBRE),
                Enter.theValue(ApellidoCliente).into(ComprasUI.TXT_APELLIDO),
                Enter.theValue(Documento).into(ComprasUI.TXT_DOC),
                Enter.theValue(TelefonoCliente).into(ComprasUI.TXT_TEL),
                Enter.theValue(CorreoCliente).into(ComprasUI.TXT_CORREO),

                // Información del destinatario
                Enter.theValue(NombreDestinatario).into(ComprasUI.TXT_NOMBREDEST),
                SelectFromOptions.byVisibleText(Municipio).from(ComprasUI.LST_MUNICIPIO),
                Enter.theValue(Direccion).into(ComprasUI.TXT_DIRECCION),
                Enter.theValue(InfoAdicional).into(ComprasUI.TXT_INFOADICIONAL),
                Enter.theValue(TelefonoDestinatario).into(ComprasUI.TXT_TELDESTINATARIO),
                Enter.theValue(Mensaje).into(ComprasUI.TXT_MENSAJE),
                Enter.theValue(Firma).into(ComprasUI.TXT_FIRMA),

                // Selección de fecha y hora
                Click.on(ComprasUI.DTP_FECHA),
                Click.on(ComprasUI.BTN_MES),
                JavaScriptClick.on(DTP_SELECFECHA.of(Fecha)),
                JavaScriptClick.on(LST_HORA),
                SelectFromOptions.byVisibleText(Horario).from(ComprasUI.LST_HORA),
                Enter.theValue(Observaciones).into(ComprasUI.TXT_OBSERVACIONES),
                JavaScriptClick.on(BTN_PEDIDO),

                //Finalizar compra
                Click.on(ComprasUI.BTN_NEQUI),
                Enter.theValue(CeluPago).into(ComprasUI.TXT_CEL),
                Click.on(ComprasUI.CHK_TERMINOS),
                Click.on(ComprasUI.BTN_PAGAR)
        );
    }

    public static CompraTask conDatos(String CantidadProducto, String NombreCliente, String ApellidoCliente, String Documento,
                                      String TelefonoCliente, String CorreoCliente, String NombreDestinatario, String Municipio,
                                      String Direccion, String InfoAdicional, String TelefonoDestinatario, String Mensaje,
                                      String Firma, String Horario, String Observaciones, String Fecha, String CeluPago) {
        return new CompraTask(CantidadProducto, NombreCliente, ApellidoCliente, Documento, TelefonoCliente, CorreoCliente,
                NombreDestinatario, Municipio, Direccion, InfoAdicional, TelefonoDestinatario, Mensaje,
                Firma, Horario, Observaciones, Fecha, CeluPago);
    }
}


