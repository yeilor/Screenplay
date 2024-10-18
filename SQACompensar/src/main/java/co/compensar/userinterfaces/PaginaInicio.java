package co.compensar.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class PaginaInicio {

    public static final Target BTN_INGRESAR = Target.the("Botón de Ingresar")
            .located(By.xpath("//button[@id='btn-login']"));

    public static final Target DDL_SELECCIONAR = Target.the("Dropdown de selección de documento")
            .located(By.xpath("//select[@id='tipodoc_p']"));

    public static final Target TXT_USUARIO = Target.the("Campo de texto para usuario")
            .located(By.xpath("//input[@id='docnum_p']"));

    public static final Target TXT_CONTRASENA = Target.the("Campo de texto para contraseña")
            .located(By.xpath("//input[@id='password_p']"));

    public static final Target BTN_INGRESAR_CUENTA = Target.the("Botón de Ingresar a la cuenta")
            .located(By.xpath("(//a[contains(text(),'Ingresar')])[1]"));

    public static final Target TXT_VALIDAR = Target.the("Texto de validación en la página")
            .located(By.xpath("//h1[contains(text(),'Encuentra las mejores experiencias para tu bienestar')]"));
}
