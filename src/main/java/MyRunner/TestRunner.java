package MyRunner;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber; // enter this import statement manually
import cucumber.api.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Selenium_Workspace\\FreeCrmBDDFramework\\src\\main\\java\\Features\\login.feature", // the path of feature file
		glue= {"stepDefinitions"}, //the path of the step definition files
		plugin= {"pretty","html:test-output", "json:json_output/cucumber.json", "junit:junit-xml/cucumber.xml"}, //to generate different types of reporting --[ here, check the folder test-output for report --> index.html]
		monochrome=true,  // display the console output in a proper readable format
		strict=true, // it will check any step is not defined inside in step definition file
		dryRun=false // to check the mapping is proper between failure file and step definition  file
		)

public class TestRunner {

}
