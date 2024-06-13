package utils;

import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import pages.HomePage;
import pages.IntroductionPage;
import pages.PageObjectManager;

public class TestSetup extends DriverFactory {
	
	public static WebDriver driver;
	public IntroductionPage introductionPage;
	public HomePage homepage;
	public PageObjectManager pageObjectManager;
	public DriverFactory driverFactory;
	
  public TestSetup()
	{
		driverFactory= new DriverFactory();
		pageObjectManager=new PageObjectManager(driverFactory.getDriver());
	}
}
