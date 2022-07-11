package StepDefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",glue={"StepDefinition"},
monochrome=true,
//plugin={"pretty","html:target/HtmlReports"},
plugin={"pretty","json:target/reports/cucumber.json"}

)

public class TestRunner {

}
