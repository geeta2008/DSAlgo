package stepdefinitions;

import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.HomePage;
import pages.IntroductionPage;
import utils.TestSetup;

public class HomePageStepDefinition {


	public IntroductionPage introductionPage;
	public HomePage homepage;
	TestSetup testsetup;

	public HomePageStepDefinition(TestSetup testsetup) {
		this.testsetup = testsetup;
		this.introductionPage = testsetup.pageObjectManager.getIntroductionPage();
		this.homepage = testsetup.pageObjectManager.getHomePage();
	}

	@And("User clicks the Data Structures dropdown")
	public void user_clicks_the_data_structures_dropdown() {
		homepage.dropdownhomePage();
		homepage.dropdownhomePageText();
		System.out.println(homepage.dropdownhomePageText());
	}

	@Then("User should able to see all the seven options in dropdown menu")
	public void user_should_able_to_see_all_the_options_in_dropdown_menu() {
		homepage.countdropdownitems();
        Assert.assertEquals((int) homepage.countdropdownitems(), 6);
	}

}
