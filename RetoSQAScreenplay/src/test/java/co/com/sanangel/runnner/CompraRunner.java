package co.com.sanangel.runnner;

import co.com.sanangel.compras.utils.BeforeSuite;

import co.com.sanangel.compras.utils.DataToFeature;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import java.io.IOException;

@CucumberOptions(features = "src/test/resources/features/compra.feature",
        tags = "@compra",
        glue = "co.com.sanangel.stepDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE)

@RunWith(RunnerPersonalizado.class)
public class CompraRunner {
    @BeforeSuite
    public static void test() throws IOException, org.apache.poi.openxml4j.exceptions.InvalidFormatException {
        DataToFeature.overrideFeatureFiles("./src/test/resources/features/compra.feature");
    }
}
