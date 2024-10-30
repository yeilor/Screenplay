package co.compensar.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.findby.By;

public class LoginUI {

    public static final Target BTN_INGRESAR = Target.the("click en botón Ingresar")
            .locatedBy("//android.widget.Button[contains(@content-desc, 'INGRESAR')]");

    public static final Target LST_TIPO_DOC = Target.the("desplegar lista de tipo de documento")
            .located(By.xpath("//android.view.View[@resource-id='tipodoc_p']"));

    public static final Target CHK_TIPO_DOC = Target.the("click para seleccionar el tipo de documento")
            .located(By.xpath("//android.widget.CheckedTextView[@resource-id='android:id/text1' and @text='Cédula de Ciudadanía']"));

    public static final Target TXT_NUM_DOC = Target.the("ingresar número de documento")
            .located(By.xpath("//android.widget.EditText[@resource-id='docnum_p']"));

    public static final Target TXT_CLAVE = Target.the("ingresar clave")
            .located(By.xpath("//android.widget.EditText[@resource-id='password_p']"));

    public static final Target BTN_INGRESAR_LOGIN = Target.the("click en botón ingresar")
            .located(By.xpath("//android.view.View[@content-desc='Ingresar']"));
}
