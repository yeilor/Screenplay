package co.compensar.interactions;

import io.appium.java_client.MobileBy;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import org.openqa.selenium.InvalidSelectorException;

import static co.compensar.driver.AppiumAndroidDriver.driver;

public class SearchScroll implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            driver.findElement(MobileBy.AndroidUIAutomator(
                    "new UiScrollable(new UiSelector().scrollable(true))" +
                            ".scrollIntoView(new UiSelector().textContains(\"CONTINUAR\"))"));
        } catch (InvalidSelectorException e) {

        }
    }

    public static Performable on() {
        return Instrumented.instanceOf(SearchScroll.class).withProperties();
    }
}