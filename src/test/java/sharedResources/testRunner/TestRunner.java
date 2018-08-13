package sharedResources.testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.Scenario;
import cucumber.api.junit.Cucumber;

import java.util.Map;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = { "src/test/resources/featureFiles" },
		glue = {"sharedResources/webDriver", "stepDefinition", "sharedResources/testRunner"},
		tags = { "~@ignore"},
		monochrome = true,
		plugin = {"pretty", "html:target/cucumber",
				"json:target/cucumber.json"
				//"com.cucumber.listener.ExtentCucumberFormatter:target/report.html"
		})
public class TestRunner {
	
	public static Map<String, String> config;
	public static Scenario scenario;
}
