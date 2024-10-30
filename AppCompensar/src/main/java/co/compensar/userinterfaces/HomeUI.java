package co.compensar.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class HomeUI {

    public static final Target LBL_VALIDA_MIS_RECOMENDADOS = Target.the("validación de titulo Mis Recomendaciones")
            .locatedBy("//android.view.View[@content-desc='Mis recomendados']");

    public static final Target BTN_BUSCAR = Target.the("clic en la lupa para buscar")
            .locatedBy("(//*[@class='android.view.View' and @index='1'])[1]");

    public static final Target TXT_EXPERIENCIA = Target.the("ingresar nombre de la experiencia")
            .locatedBy("//android.widget.EditText");

    public static final Target IMG_VALIDA_IMAGEN = Target.the("validación de imagen de la experiencia")
            .locatedBy("(//android.widget.FrameLayout[@resource-id='android:id/content']//android.view.View)[13]");

    public static final Target TXT_CANTIDAD = Target.the("ingresar cantidad")
            .locatedBy("//android.widget.EditText[@index='3']");

    public static final Target BTN_AGREGAR_CARRITO = Target.the("clic en botón Agregar al Carrito")
            .locatedBy("(//*[@class='android.widget.Button'])[5]");

    public static final Target BTN_IR_AL_CARRITO = Target.the("clic en botón Ir al Carrito")
            .locatedBy("//*[@content-desc='IR AL CARRITO']");

    public static final Target BTN_COMPRAR = Target.the("clic en botón comprar")
            .locatedBy("//*[@content-desc='COMPRAR']");

    public static final Target BTN_COMPRA_CARRITO = Target.the("clic en botón comprar dentro del carrito")
            .locatedBy("//*[@content-desc='COMPRAR']");

    public static final Target BTN_CONTINUAR_COMPRA = Target.the("clic para continuar la compra")
            .locatedBy("//*[@content-desc='COMPRAR']");

    public static final Target BTN_CONTINUAR_PAGO = Target.the("clic para continuar con el pago")
            .locatedBy("//*[@content-desc='CONTINUAR PAGO']");

    public static final Target LBL_VALIDA_TEXTO_FELICITACIONES = Target.the("validación de titulo FELICITACIONES")
            .locatedBy("//*[@content-desc='¡Felicitaciones!']");

    public static final Target BTN_ENTENDIDO = Target.the("clic en botón Entendido")
            .locatedBy("//*[@content-desc='ENTENDIDO']");
}
