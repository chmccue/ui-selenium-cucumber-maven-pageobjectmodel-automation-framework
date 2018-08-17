package sharedResources.testRunner;


import cucumber.api.CucumberOptions;
import cucumber.api.Scenario;
import cucumber.api.junit.Cucumber;

import com.vimalselvam.cucumber.listener.Reporter;

import java.io.File;
import java.util.Map;

import org.junit.AfterClass;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = { "src/test/resources/featureFiles" },
		glue = {"sharedResources/webDriver", "stepDefinition", "sharedResources/testRunner"},
		tags = { "~@ignore"},
		monochrome = true,
		plugin = {"pretty",
				"html:target/cucumber",
				"json:target/cucumber.json"
				,"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:target/extent/report.html"
		})
public class TestRunner {

	public static Map<String, String> config;
	public static Scenario scenario;

	@AfterClass
	public static void writeExtentReport() {
		System.out.println("-----------------EXTENT REPORT BEING GENERATED-----------------");
		Reporter.loadXMLConfig(new File("src/test/resources/extent-config.xml"));
		System.out.println("-----------------EXTENT REPORT GENERATED-----------------");

		//Reporter.setSystemInfo("user", System.getProperty("user.name"));
		//Reporter.setSystemInfo("os", "Windows 10");
		//Reporter.setTestRunnerOutput("Sample test runner output message");

	}



}
