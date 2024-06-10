package factory;

import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import utils.ConfigReader;

public class DriverFactory {

	public static WebDriver driver;

	public static WebDriver initializeBrowser() {

		Properties prop = ConfigReader.intializeProperties();
		String url=prop.getProperty("url");
		String browserName_properties = prop.getProperty("browser");
		String browser_maven=prop.getProperty("browser");
		String browser=browser_maven!= null ? browser_maven:browserName_properties;
		if(driver==null) {

		if (browser.equalsIgnoreCase("chrome")) {

			driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("firefox")) {

			driver = new FirefoxDriver();

		} else if (browser.equalsIgnoreCase("edge")) {

			driver = new EdgeDriver();

		} else if (browser.equalsIgnoreCase("safari")) {

			driver = new SafariDriver();

		}
		}
		
		driver.get(prop.getProperty("url"));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		return driver;

	}

	public WebDriver getDriver() {
		initializeBrowser();
		return driver;

	}

}
