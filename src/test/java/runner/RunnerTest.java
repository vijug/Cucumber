package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features="Feature",
		glue={"com.BDD.cucumber"},
		tags ={},
		plugin={}
		)
public class RunnerTest extends AbstractTestNGCucumberTests{

}
