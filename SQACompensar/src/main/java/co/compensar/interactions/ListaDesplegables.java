package co.compensar.interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ListaDesplegables {

    public void seleccionarTextoVisible(By elemento, String texto, WebDriver driver){
        if (texto == null || texto.isEmpty()) {
            throw new IllegalArgumentException("The text to be selected cannot be null or empty");
        }

        Select seleccionar = new Select(driver.findElement(elemento));
        seleccionar.selectByVisibleText(texto);
    }
}
