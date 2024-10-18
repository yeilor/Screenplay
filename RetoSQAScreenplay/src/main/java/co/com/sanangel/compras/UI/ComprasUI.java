package co.com.sanangel.compras.UI;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ComprasUI {

    public static final Target BTN_CAJAS = Target.the("boton para seleccionar producto1")
            .locatedBy("(//img[contains(@class, 'vc_single')])[2]");

    public static final Target BTN_PROD1 = Target.the("boton para seleccionar el primero producto")
            .locatedBy("(//h2[@class='woocommerce-loop-product__title'])[2]");

    public static final Target TXT_CANT = Target.the("ingresar la cantidad del producto")
            .located(By.xpath("//input[@class='input-text qty text']"));

    public static final Target BTN_CARRITO = Target.the("boton para agregar producto al carrito")
            .locatedBy("//button[contains(text(),'carrito')]");

    public static final Target TXT_NOMBRE = Target.the("caja de texto para ingresar nombre del cliente")
            .located(By.id("billing_first_name"));

    public static final Target TXT_APELLIDO = Target.the("caja de texto para ingresar apellido del cliente")
            .located(By.id("billing_last_name"));

    public static final Target TXT_DOC = Target.the("caja de texto para ingresar documento del cliente")
            .located(By.id("billing_document_id"));

    public static final Target TXT_TEL = Target.the("caja de texto para ingresar telefono del cliente")
            .located(By.id("billing_phone"));

    public static final Target TXT_CORREO = Target.the("caja de texto para ingresar correo del cliente")
            .located(By.id("billing_email"));

    public static final Target TXT_NOMBREDEST = Target.the("caja de texto para ingresar nombre del destinatario")
            .located(By.id("order_nombre_completo"));

    public static final Target LST_MUNICIPIO = Target.the("desplegar lista municipios")
            .located(By.id("order_ciudad"));

    public static final Target TXT_DIRECCION = Target.the("caja de texto para ingresar dirección de destinatario")
            .located(By.id("order_additional_address"));

    public static final Target TXT_INFOADICIONAL = Target.the("caja de texto para ingresar informacion adicional")
            .located(By.id("order_additional_address_2"));

    public static final Target TXT_TELDESTINATARIO = Target.the("caja de texto para ingresar telefono destinatario")
            .located(By.id("order_additional_phone"));

    public static final Target TXT_MENSAJE = Target.the("caja de texto para ingresar mensaje a la tarjeta")
            .located(By.id("order_comments"));

    public static final Target TXT_FIRMA = Target.the("ingresar firma")
            .located(By.id("order_additional_card_signature"));

    public static final Target BTN_MES = Target.the("cambiar mes en el calendario")
            .located(By.xpath("//th[@class='next']"));

    public static final Target DTP_FECHA = Target.the("abrir calendario")
            .located(By.id("order_additional_date"));

    public static final Target DTP_SELECFECHA = Target.the("seleccionar fecha")
            .locatedBy("//td[contains(text(),'{0}')]");

    public static final Target LST_HORA = Target.the("ver lista de horarios")
            .located(By.id("order_additional_time"));

    public static final Target TXT_OBSERVACIONES = Target.the("caja de texto para observaciones especiales")
            .located(By.id("order_additional_card_message"));

    public static final Target BTN_PEDIDO = Target.the("boton para realizar pedido")
            .located(By.id("place_order"));

    public static final Target BTN_NEQUI = Target.the("boton de pago Nequi")
            .located(By.id("pm-NEQUI-logo"));

    public static final Target TXT_CEL = Target.the("ingresar celular para el pago")
            .located(By.id("contactPhone"));

    public static final Target CHK_TERMINOS = Target.the("aceptar terminos y condiciones")
            .located(By.id("tandc"));

    public static final Target BTN_PAGAR = Target.the("boton para pagar")
            .located(By.className("ng-scope"));

    public static final Target LBL_NUMORDEN = Target.the("validación de texto: Numero de orden")
            .locatedBy("//h2[contains(text(),'Resumen')]");

    private ComprasUI() {
        throw new UnsupportedOperationException("Utility class");
    }

}
