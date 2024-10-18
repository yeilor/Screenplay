package co.compensar.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CompraPuntosMasPSEUI {

    public static final Target TXT_PUNTOS = Target.the("ingresa la cantidad de puntos")
            .located(By.xpath("//label[@class='material-input']"));

    public static final Target CHK_PSE = Target.the("ingresa la cantidad de puntos")
            .located(By.xpath("//div[@class='method' and .//span[contains(text(), 'Debito Bancario PSE')]]//label[@class='container-checkbox']"));
}
