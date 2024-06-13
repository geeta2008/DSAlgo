package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.IntroductionPage;
import pages.PageObjectManager;
import utils.TestSetup;

public class IntroductionStepDefinition {
	public static WebDriver driver;
	public IntroductionPage introductionPage;
	public HomePage homepage;
	TestSetup testsetup;
	public PageObjectManager pageObjectManager;

	public IntroductionStepDefinition(TestSetup testsetup) {
		this.testsetup = testsetup;
		this.introductionPage = testsetup.pageObjectManager.getIntroductionPage();
		this.homepage = testsetup.pageObjectManager.getHomePage();
	}

	@Given("User opens DS Algo portal link")
	public void User_opens_DS_Algo_portal_link() {

		System.out.println(introductionPage.navigateToDSURL());

	}

	@When("User clicks the Get Started button")
	public void User_clicks_the_Get_Started_button() throws Exception {
         Thread.sleep(500);
		introductionPage.clickOnGetStartedBtn();
		
		System.out.println("User click get started btn");
	}

	@Then("User should land on the homepage")
	public void User_should_land_on_the_homepage() {

		testsetup.pageObjectManager.getHomePage();
		System.out.println(homepage.getHomePageTitle());
		Assert.assertEquals(homepage.getHomePageTitle(), "Numpy Ninja");
		

	}

}
