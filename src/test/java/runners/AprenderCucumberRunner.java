package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features/aprender_cucumber.feature"},
        glue = {"steps"},
        plugin = "pretty"
        )
public class AprenderCucumberRunner {
}
