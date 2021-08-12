package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions( 	features ="C:\\Users\\User\\Desktop\\eclipse\\CucumberOctBatch\\src\\main\\java\\features",
					glue = "step_definition",
					plugin = {"pretty", "html:target/HTML/reportHtml.html", "json:target/JSON/reportJson"},
					monochrome = true,
					tags = "@Regression"
		)
public class Runner {
}
//	tags = "@Regression