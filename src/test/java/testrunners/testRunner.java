package testrunners;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
	
//import io.cucumber.junit.CucumberOptions;
//import io.cucumber.junit.Cucumber;

//@RunWith(Cucumber.class)
@CucumberOptions(
		         features={"src/test/resources/AppFeatures"},
		         glue= {"stepDefinitions","AppHooks"},
		         monochrome = false,
		 		 tags = ""
		         )

public class testRunner extends AbstractTestNGCucumberTests
 {
	@BeforeClass
	public static void beforeClass()
		{
		}
	@AfterClass
	public static void afterClass()
		{
		}
}
