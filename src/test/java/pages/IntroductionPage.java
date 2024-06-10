package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class IntroductionPage {
	WebDriver driver;
	
	@FindBy(xpath = "//button[contains(text(),'Get Started')]")
	WebElement getStartBtn;

	@FindBy(xpath = "//div[@class='content-area']//p")
	WebElement getTextGetStarted;

	public IntroductionPage(WebDriver driver) {
	   this.driver = driver;
		PageFactory.initElements(driver,this);
		

	}

	public void clickOnGetStartedBtn() {
		getStartBtn.click();
	}

	public String getTextIntroductionPage() {
		return getTextGetStarted.getText();
	}

	public String navigateToDSURL() {
		return driver.getCurrentUrl();
	}
}
