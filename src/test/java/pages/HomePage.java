package pages;

import org.openqa.selenium.Dimension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import factory.DriverFactory;
import utils.ElementUtils;

public class HomePage  {
	WebDriver driver;

	@FindBy(linkText = "NumpyNinja")
	WebElement getTile;
	
	@FindBy(linkText = "Data Structures")
	WebElement dropdown;
	
	@FindBy(xpath ="//div[@class='dropdown-menu show']")
	WebElement dropdownsize;
	

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public String getHomePageTitle() {
		return driver.getTitle();
	}
	
	public String getHomePageUrl() {
		return driver.getCurrentUrl();
	}
	
	public void dropdownhomePage() {
		dropdown.click();
	}
	
	public String dropdownhomePageText() {
		return dropdown.getText();
	}
	
	public Dimension countdropdownitems() {
		return dropdownsize.getSize();
	}
	
	

}
