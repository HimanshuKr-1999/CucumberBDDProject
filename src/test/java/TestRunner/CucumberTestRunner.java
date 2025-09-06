package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(tags="", features={"src\\test\\resources\\features\\login.feature"},
glue= {"StepDefinations"},
plugin= {"pretty","html:target/htmlreport3.html"})
public class CucumberTestRunner extends AbstractTestNGCucumberTests {
	
	
	

}
