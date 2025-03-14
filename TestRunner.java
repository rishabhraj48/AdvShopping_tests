package StepDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/Features/Reg.feature",  
        glue = {"StepDefinitions"},
        monochrome = true,
        plugin = {
                "pretty",
                "html:target/HtmlReports",
                "junit:target/JSONReports/jsonfile.xml",
                "json:target/JSONReport/jsonfile.json"
        }
)
public class TestRunner {
}
