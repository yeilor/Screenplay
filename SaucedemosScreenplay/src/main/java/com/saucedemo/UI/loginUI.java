package com.saucedemo.UI;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.findby.By;

public class loginUI {

    public static final Target TXT_USERNAME = Target.the("Campo para ingresar el usuario")
            .located(By.id("user-name"));

    public static final Target TXT_PASS = Target.the("Campo para ingresar la clave")
            .located(By.id("password"));

    public static final Target BTN_LOGIN = Target.the("Botón login")
            .located(By.id("login-button"));

    public static final Target LBL_VALIDATE_PRODUCTS = Target.the("validación de texto: 'Products'")
            .located(By.xpath("//span[contains(text(),'Products')]"));

}
