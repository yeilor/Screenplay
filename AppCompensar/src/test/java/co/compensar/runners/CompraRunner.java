package co.compensar.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/login.feature",
        glue = "co.compensar.stepDefinitions",
        snippets = SnippetType.CAMELCASE,
        tags = "@Login"
)
public class CompraRunner {
}
