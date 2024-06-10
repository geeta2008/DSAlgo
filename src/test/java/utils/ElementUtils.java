package utils;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ElementUtils {
	
	WebDriver driver;
	
	public ElementUtils(WebDriver driver) {
		this.driver=driver;
	}
	
	public void clickOnElement(WebElement element, long durationInSeconds) {
	
		WebElement webElement=waitForElement(element,durationInSeconds);
		webElement.click();
	}
	
	public void typeTextIntoElement(WebElement element,String textToBeTyped,long durationInSeconds) {
		
		
		WebElement webElement=waitForElement(element,durationInSeconds);
		webElement.click();
		webElement.clear();
		webElement.sendKeys(textToBeTyped);
	}
	
	public WebElement waitForElement(WebElement element,long durationInSeconds) {
		
		WebElement webElement =null;
		try {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(durationInSeconds));
		webElement= wait.until(ExpectedConditions.elementToBeClickable(element));
		}
		catch (Throwable e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return webElement;
	}

}
