package co.compensar.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LogOutUI {

    public static final Target IMG_PERFIL = Target.the("clic en imagen: Perfil")
            .locatedBy("(//*[@class='android.view.View'])[12]");

    public static final Target IMG_ENGRANAJE = Target.the("clic en imagen: Engranaje")
            .locatedBy("(//*[@class='android.view.View'])[6]");

    public static final Target BTN_CERRAR_SESION = Target.the("clic en botón Cerrar Sesión")
            .locatedBy("//*[@content-desc='Cerrar sesión']");

    public static final Target IMG_VALIDA_LOGO = Target.the("Validación de Logo")
            .locatedBy("//*[@index='2' and @class='android.widget.ImageView']");

}
