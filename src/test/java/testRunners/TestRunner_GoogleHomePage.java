package testRunners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="resources/CucumberDemo.feature", 
		glue="StepDefinition"
				)

public class TestRunner_GoogleHomePage {

}
