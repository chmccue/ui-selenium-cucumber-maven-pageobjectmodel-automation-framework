package sharedResources.webDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.support.ui.WebDriverWait;
import sharedResources.supportFactory.WebdriverFactory;
import sharedResources.testRunner.TestRunner;

public class Driver {

	public static int waitTime = 10;
	public static WebDriver webdriver;

	public synchronized static WebDriver getCurrentDriver() {
		
		if (webdriver == null) {
			webdriver = WebdriverFactory.createWebdriver();
			webdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			webdriver.manage().window().maximize();

			webdriver.get(TestRunner.config.get("baseUrl"));

		}
		return webdriver;
	}

	public static WebDriver driver = Driver.getCurrentDriver();
	public static WebDriverWait wait = new WebDriverWait(driver, waitTime);

	public static String takeScreenshot(String filename) throws IOException {
		
		try {
			File file = ((TakesScreenshot) getCurrentDriver()).getScreenshotAs(OutputType.FILE);
			String filePath = ("./screenshot/" + filename + ".jpg");
			FileUtils.copyFile(file, new File(filePath));
			return filePath;
		} catch (WebDriverException somePlatformsDontSupportScreenshots) {
			System.err.println(somePlatformsDontSupportScreenshots.getMessage());
			return null;
		}
	}

	public static void embedScreenshot() {
		try {
			byte[] screenshot = ((TakesScreenshot) getCurrentDriver()).getScreenshotAs(OutputType.BYTES);
			TestRunner.scenario.embed(screenshot, "image/png");
		} catch (WebDriverException somePlatformsDontSupportScreenshots) {
			System.err.println(somePlatformsDontSupportScreenshots.getMessage());
		}
	}

	public static void writeToReport(String string) {
		TestRunner.scenario.write(string);
	}
	
}
