package co.compensar.tasks;

import co.compensar.userinterfaces.CompraPuntosMasPSEUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.checkerframework.checker.units.qual.C;

import static co.compensar.userinterfaces.PaginaDeExperiencia.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class CompraConPuntosMasOtroTask implements Task {

    private String Puntos;
    private String Banco;
    private String TipoPersona;
    private String Nombre;
    private String Celular;
    private String Direccion;
    private String TipoIdentificacion;
    private String NoDocumento;
    private String Correo;

    public CompraConPuntosMasOtroTask(String Puntos, String Banco, String TipoPersona, String Nombre, String Celular, String Direccion, String TipoIdentificacion, String NoDocumento, String Correo) {
        this.Puntos = Puntos;
        this.Banco = Banco;
        this.TipoPersona = TipoPersona;
        this.Nombre = Nombre;
        this.Celular = Celular;
        this.Direccion = Direccion;
        this.TipoIdentificacion = TipoIdentificacion;
        this.NoDocumento = NoDocumento;
        this.Correo = Correo;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                WaitUntil.the(CompraPuntosMasPSEUI.TXT_PUNTOS, isVisible()).forNoMoreThan(30).seconds(),
                Clear.field(CompraPuntosMasPSEUI.TXT_PUNTOS),
                Enter.theValue(Puntos).into(CompraPuntosMasPSEUI.TXT_PUNTOS),
                WaitUntil.the(CompraPuntosMasPSEUI.CHK_PSE, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(CompraPuntosMasPSEUI.CHK_PSE),
                WaitUntil.the(BTN_IR_PAGAR, isVisible()).forNoMoreThan(30).seconds(),
                Click.on(BTN_IR_PAGAR),
                WaitUntil.the(BTN_CONTINUAR_PAGO, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(BTN_CONTINUAR_PAGO),
                WaitUntil.the(BTN_COMPRAR, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(BTN_COMPRAR)

                //Pasarela de pago PSE

        );

    }

    public static CompraConPuntosMasOtroTask conDatos(String Puntos, String Banco, String TipoPersona, String Nombre, String Celular, String Direccion, String TipoIdentificacion, String NoDocumento, String Correo) {
        return new CompraConPuntosMasOtroTask(Puntos, Banco, TipoPersona, Nombre, Celular, Direccion, TipoIdentificacion, NoDocumento, Correo);
    }
}
