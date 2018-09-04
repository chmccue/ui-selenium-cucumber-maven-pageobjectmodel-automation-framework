package stepDefinition;

import java.io.FileNotFoundException;
import java.io.IOException;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import sharedResources.supportMethods.CustomHelperMethods;
import sharedResources.supportMethods.FileRead;
import sharedResources.testRunner.TestRunner;
import sharedResources.webDriver.Driver;

import static sharedResources.supportMethods.CustomHelperMethods.updateStoredUrl;


public class Hooks {
	private static Boolean runOnce = false;

	@Before
	public void beforeAll() throws FileNotFoundException, IOException, InterruptedException {
		if (!runOnce) {
			TestRunner.config = FileRead.readProperties();
		}
	}
	
	@Before
	public void before(Scenario scenario) {
		TestRunner.scenario = scenario; }

	@After
	public void after(Scenario scenario) {
		/* Method below resets storedUrl at end of test case, so the next test case will
		   log Url without interference from previous test case. */
		CustomHelperMethods.storedUrl = updateStoredUrl("");

		if (scenario.isFailed()) {
			Driver.embedScreenshot();
		}
	}

}
