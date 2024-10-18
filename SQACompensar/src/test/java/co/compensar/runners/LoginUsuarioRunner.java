package co.compensar.runners;

import co.compensar.utils.BeforeSuite;
import co.compensar.utils.DataToFeature;
import io.cucumber.junit.CucumberOptions;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.runner.RunWith;

import java.io.IOException;


@CucumberOptions(features = "src/test/resources/features/loginUsuario.feature",
        tags = "@LoginUsuario",
        glue = "co.compensar.stepDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE)

@RunWith(RunnerPersonalizado.class)
public class LoginUsuarioRunner {
    @BeforeSuite
    public static void test() throws InvalidFormatException, IOException {
        DataToFeature.overrideFeatureFiles("./src/test/resources/features/loginUsuario.feature");
    }

}
