package com.saucedemo.UI;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.findby.By;

public class compraUI {

    public static final Target BTN_ADD_TO_CAR1 = Target.the("Agrega el primer producto al carrito de compras")
            .located(By.id("add-to-cart-sauce-labs-bolt-t-shirt"));

    public static final Target BTN_ADD_TO_CAR2 = Target.the("Agrega el segundo producto al carrito de compras")
            .located(By.id("add-to-cart-sauce-labs-onesie"));

    public static final Target BTN_ADD_TO_CAR3 = Target.the("Agrega el tercer producto al carrito de compras")
            .located(By.id("add-to-cart-test.allthethings()-t-shirt-(red)"));

    public static final Target TXT_VALIDA_CANT = Target.the("Valida la cantidad inicial en el carrito")
            .located(By.xpath("//span[contains(text(),'3')]"));

    public static final Target IMG_CAR = Target.the("Ingresar al carrito de compras")
            .located(By.className("shopping_cart_link"));

    public static final Target BTN_REMOVE = Target.the("Eliminar un producto del carrito")
            .located(By.id("remove-sauce-labs-onesie"));

    public static final Target BTN_CHECKOUT = Target.the("Botón para continuar con la compra")
            .located(By.id("checkout"));

    public static final Target TXT_VALIDATE_NEW_CANT = Target.the("Valida nuevamente la cantidad luego de haber quitado un producto")
            .located(By.xpath("//span[contains(text(),'2')]"));

    public static final Target LBL_CHECKOUT = Target.the("Valida página del formulario")
            .located(By.xpath("//span[contains(text(),'Your')]"));

    public static final Target TXT_FIRTS_NAME = Target.the("Ingresar el nombre en el formulario")
            .located(By.id("first-name"));

    public static final Target TXT_LAST_NAME = Target.the("Ingresar el apellido en el formulario")
            .located(By.id("last-name"));

    public static final Target TXT_POSTAL_CODE = Target.the("Ingresar el código postal en el formulario")
            .located(By.id("postal-code"));

    public static final Target BTN_CONTINUE = Target.the("Botón para continuar la compra")
            .located(By.id("continue"));

    public static final Target LBL_CHECK_OUT = Target.the("Validación de los datos de la compra")
            .located(By.xpath("//span[contains(text(),'Overview')]"));

    public static final Target BTN_FINISH = Target.the("Botón para finalizar la compra")
            .located(By.id("finish"));

    public static final Target LBL_VALIDATE_ORDER = Target.the("Validación final de compra exitosa")
            .located(By.xpath("//h2[contains(text(),'Thank you for your order!')]"));

    public static final Target BTN_BACK_HOME = Target.the("Volver a la página inicial")
            .located(By.id("back-to-products"));

    public static final Target LBL_VALIDATE_HOME = Target.the("Validación en página inicial")
            .located(By.className("app_logo"));

    public static final Target BTN_MENU = Target.the("Clic en botón menú")
            .located(By.id("react-burger-menu-btn"));

    public static final Target BTN_LOGOUT = Target.the("Realiza logout a la página")
            .located(By.id("logout_sidebar_link"));
}
