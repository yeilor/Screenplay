package com.saucedemo.runners;


import com.saucedemo.utils.BeforeSuite;
import com.saucedemo.utils.DataToFeature;
import io.cucumber.junit.CucumberOptions;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.runner.RunWith;

import java.io.IOException;

@CucumberOptions(features = "src/test/resources/features/login.feature",
        tags = "@Login",
        glue = "com/saucedemo/stepDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE)

@RunWith(RunnerPersonalizado.class)
public class loginRunner {
    @BeforeSuite
    public static void test() throws InvalidFormatException, IOException {
        DataToFeature.overrideFeatureFiles("./src/test/resources/features/login.feature");
    }
}
