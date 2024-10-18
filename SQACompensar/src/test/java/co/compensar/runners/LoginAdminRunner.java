package co.compensar.runners;

import co.compensar.utils.BeforeSuite;
import co.compensar.utils.DataToFeature;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import java.io.IOException;

import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@CucumberOptions(features = "src/test/resources/features/loginAdmin.feature",
        tags = "@LoginAdmin",
        glue = "co.compensar.stepDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE)

@RunWith(RunnerPersonalizado.class)
public class LoginAdminRunner {

    @BeforeSuite
    public static void test() throws InvalidFormatException, IOException {
        DataToFeature.overrideFeatureFiles("./src/test/resources/features/loginAdmin.feature");
    }
}
