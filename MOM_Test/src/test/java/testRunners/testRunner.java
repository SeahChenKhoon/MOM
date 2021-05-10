package testRunners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features/MOM.feature",
		glue="StepDefinitions",
		monochrome=true,
		plugin= {"html:target\\HTMLReports",
				"rerun:target/cucumber/rerun.txt"
		},
		dryRun=false,
		strict=true
		)
public class testRunner {

}
