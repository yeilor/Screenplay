package co.compensar.runners;

import co.compensar.utils.BeforeSuite;
import co.compensar.utils.DataToFeature;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import java.io.IOException;

@CucumberOptions(features = "src/test/resources/features/compraPuntosMasOtro.feature",
        tags = "@CompraPuntosMasOtro",
        glue = "co.compensar.stepDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE)

@RunWith(RunnerPersonalizado.class)
public class CompraPuntosMasOtroRunner {
    @BeforeSuite
    public static void test() throws IOException, org.apache.poi.openxml4j.exceptions.InvalidFormatException {
        DataToFeature.overrideFeatureFiles("./src/test/resources/features/compraPuntosMasOtro.feature");
    }
}
