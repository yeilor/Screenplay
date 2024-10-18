package co.compensar.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaDeExperiencia {

    public static final Target BTN_CERRAR_NOTIFICACIONES = Target.the("Botón para cerrar notificaciones")
            .located(By.xpath("//button[@class='button primary']"));

    public static final Target TXT_BUSQUEDA = Target.the("Campo de texto para búsqueda")
            .located(By.xpath("//input[@class='ant-input search-bar-header']"));

    public static final Target BTN_BUSCAR = Target.the("Botón para realizar la búsqueda")
            .located(By.xpath("//span[@class='anticon anticon-search icon-search-bar-header']"));

    public static final Target IMB_EXPERIENCIA = Target.the("Imagen de la experiencia")
            .located(By.className("cardExperienceImg"));

    public static final Target TXT_VALIDAR_EXPERIENCIA = Target.the("Texto de validación de la experiencia")
            .located(By.className("singleExperienceNameAndLogo"));

    public static final Target BTN_INCREMENTAR_CANTIDAD = Target.the("Botón para incrementar la cantidad")
            .located(By.xpath("//button[@class='btn-plus']"));

    public static final Target BTN_AGREGAR_CARRITO = Target.the("Botón para agregar al carrito")
            .located(By.xpath("//button[@id='btn-add-to-cart']"));

    public static final Target BTN_IR_CARRITO = Target.the("Botón para ir al carrito")
            .located(By.xpath("//button[contains(text(),'Ir al carrito')]"));

    public static final Target BTN_IR_PAGAR = Target.the("Botón para ir a pagar")
            .located(By.xpath("//button[contains(text(),'Ir a pagar')]"));

    public static final Target BTN_CONTINUAR_PAGO = Target.the("Botón para continuar con el pago")
            .located(By.xpath("//button[contains(text(),'Continuar Pago')]"));

    public static final Target BTN_COMPRAR = Target.the("Botón para comprar")
            .located(By.xpath("//button[contains(text(),'Comprar')]"));

    public static final Target TXT_VALIDAR_TITULO_MENSAJE = Target.the("Texto de validación del título del mensaje")
            .located(By.xpath("//p[contains(text(),'¡Felicitaciones!')]"));

    public static final Target TXT_VALIDAR_CONTENIDO_MENSAJE = Target.the("Texto de validación del contenido del mensaje")
            .located(By.xpath("//p/span[contains(text(),'')]"));
}
