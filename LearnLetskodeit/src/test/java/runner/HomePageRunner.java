package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/feature"},
        glue = {"stepdefination"},
        strict = true,
        tags = {},
        plugin = {"pretty", "json:target/cucumber-reports/cucumber.json", "html:target/cucumber-reports"}
)

public class HomePageRunner extends AbstractTestNGCucumberTests {
}
