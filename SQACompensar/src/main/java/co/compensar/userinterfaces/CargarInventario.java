package co.compensar.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class CargarInventario {

    public static final Target LST_INVENTARIOS = Target.the("Despliega el listado del menú Inventarios")
            .located(By.xpath("//span[@class='anticon anticon-inbox']"));

    public static final Target BTN_INVENTARIO = Target.the("Da clic en la opción Inventario para realizar un cargue")
            .located(By.xpath("//a[contains(text(),'Inventario')]"));

    public static final Target TXT_BUSCAR = Target.the("Permite ingresar texto para realizar búsqueda")
            .located(By.className("ant-input"));

    public static final Target CHK_SELECCIONA_NOMBRE = Target.the("Clic para seleccionar el nombre donde se cargará el inventario")
            .located(By.xpath("(//input[@class='ant-radio-input'])[1]"));

    public static final Target BTN_SUBIR_ARCHIVO = Target.the("Botón para cargar el archivo con el inventario nuevo")
            .located(By.xpath("//button[@data-testid='fileInput']"));

    public static final Target INP_SUBIR_ARCHIVO = Target.the("Botón para cargar el archivo con el inventario nuevo")
            .located(By.xpath("//input[@type='file']"));

    public static final Target LBL_VALIDA_CARGA = Target.the("Valida texto: Carga exitosa")
            .located(By.xpath("//p[contains(text(),'Carga exitosa')]"));

    public static final Target BTN_TERMINAR = Target.the("Clic en botón Terminar")
            .located(By.xpath("//span[contains(text(),'Terminar')]"));

    public static final Target TXT_CANT = Target.the("Muestra la nueva cantidad en el inventario")
            .located(By.xpath("//input[@type='radio' and @checked]/ancestor::tr//span[contains(@class,'cellEdit')]"));

    public static final Target IMG_AVATAR = Target.the("Clic en la imagen de perfil")
            .located(By.xpath("//div[@class='user-avatar']"));

    public static final Target BTN_CERRAR_SESION = Target.the("Botón para cerrar sesión")
            .located(By.xpath("//span[contains(text(),'Cerrar sesión')]"));
}
