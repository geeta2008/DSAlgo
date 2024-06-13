package stepdefinitions;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.ConfigReader;
import utils.TestSetup;

public class Hooks {

	TestSetup testSetup;

	WebDriver driver;

	public Hooks(TestSetup testSetup) {
		this.testSetup = testSetup;
		
	}

	@After
	public void AfterScenario(Scenario scenario) throws IOException {

		WebDriver driver = testSetup.driverFactory.getDriver();

		if (scenario.isFailed()) {
			File sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			byte[] fileContent = FileUtils.readFileToByteArray(sourcePath);
			scenario.attach(fileContent, "image/png", "image");
		}
		
		driver.quit();

	}
}
