package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src\\test\\resources\\features\\regression\\ValidateRegistration.feature",
		glue="steps",
		dryRun=false,
		tags="@wip0811"
		)

public class RegRunner {

}
