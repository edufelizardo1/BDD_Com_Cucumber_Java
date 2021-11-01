package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
/**
 * @author edufelizardo1@gmail.com
 * @version 1.0.0
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features/prazo.feature"},
        glue = {"steps"},
        plugin = "pretty"
        )
public class PrazoRunner {
}
