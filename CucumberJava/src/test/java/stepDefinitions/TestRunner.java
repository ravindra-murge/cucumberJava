package stepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
//import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/features/login.feature",
		glue= {"stepDefinitions"},
		monochrome = true,
		plugin = {"pretty","html:target/HtmlReports.html",
				"json:target/report.json",
				"junit:target/XmlReport.xml"},
		tags = "@smoketest"
		)
public class TestRunner {

}
