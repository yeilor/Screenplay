package co.compensar.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class LoginUsuario {

    //Login para usuario Admin

    public static final Target BTN_INGRESAR_ADMIN = Target.the("Botón de ingresar como Admin")
            .located(By.id("btn-preLogin"));

    public static final Target LBL_VALIDA_ADMIN_PLATAFORMA = Target.the("Valida el título Administrador de Plataforma")
            .located(By.xpath("//span[contains(text(),'Administrador')]"));

    //Login para los demás usuarios

    public static final Target BTN_INGRESAR = Target.the("Botón de ingresar para los demás usuarios")
            .located(By.xpath("//button[@id='btn-login']"));

    public static final Target LST_SELECCIONAR = Target.the("Lista de selección de documento")
            .located(By.xpath("//select[@id='tipodoc_p']"));

    public static final Target TXT_USUARIO = Target.the("Ingresar número de documento de usuario")
            .located(By.xpath("//input[@id='docnum_p']"));

    public static final Target TXT_CLAVE = Target.the("Ingresar clave del usuario")
            .located(By.xpath("//input[@id='password_p']"));

    public static final Target BTN_INGRESAR_CUENTA = Target.the("Botón para ingresar a la cuenta")
            .located(By.xpath("(//a[contains(text(),'Ingresar')])[1]"));

    public static final Target TXT_VALIDAR = Target.the("Texto de validación en la página")
            .located(By.xpath("//h1[contains(text(),'Encuentra las mejores experiencias para tu bienestar')]"));

    public static final Target LBL_PUNTOS = Target.the("Muestra la cantidad de puntos que tiene el usuario")
            .located(By.className("NavHeaderPoints"));
}
