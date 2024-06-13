package runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = "src/test/java/features", 
                 glue = {"stepdefinitions"},
                 monochrome=true,
                // dryRun=true,
                // tags="@homePage",
                 publish=true,
                 plugin={"pretty",
                		 "html:target/CucumberReports/CucumberReport.html",
                		 "json:target/CucumberReports/Cucumber.json",
                		 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                		 "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
                		 "rerun:target/failed_scenarios.txt"})
public class TestRunner extends AbstractTestNGCucumberTests{
	
	@Override
	@DataProvider(parallel=true)
	public Object[][]scenarios()
	{
		return super.scenarios();
	}

}
