package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions( features={".\\Features\\Customer.feature",".\\Features\\LoginFeature.feature"},
glue= {"StepDefination"}, dryRun=false,tags="@Sanity and @Regression",
// @Sanity // @Regression // @Sanity or @Regression 
plugin= {"pretty","html:target/htmlreport1.html" , "pretty","json:target/JSONreport1.json"})




//@RunWith(Cucumber.class)
//@CucumberOptions(
//		features= {".//Features/LoginFeature.feature"},
//		glue= {"StepDefination"},
//		dryRun=true,
//		monochrome=true,
//		plugin= {"pretty"}
//)
public class Run extends AbstractTestNGCucumberTests {

}
