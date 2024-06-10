package runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class FailedTestRerun {


@CucumberOptions(features = "@target/failed_scenarios.txt", 
                 glue = {"stepdefinitions"},
                 monochrome=true,
                 publish=true,
                 plugin={"pretty",
                		 "html:target/CucumberReports/CucumberReport.html",
                		 "json:target/CucumberReports/Cucumber.json",
                		 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                		 "rerun:target/failed_scenarios.txt"})
public class TestRunner extends AbstractTestNGCucumberTests{
	
	@Override
	@DataProvider(parallel=true)
	public Object[][]scenarios()
	{
		return super.scenarios();
	}
}


}
