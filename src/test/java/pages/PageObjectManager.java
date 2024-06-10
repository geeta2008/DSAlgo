package pages;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {

	public IntroductionPage introductionPage;
	public HomePage homePage;
	public WebDriver driver;

	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}

	public IntroductionPage getIntroductionPage() {

		introductionPage = new IntroductionPage(driver);
		return introductionPage;
	}

	public HomePage getHomePage() {

		homePage = new HomePage(driver);
		return homePage;
	}

}
