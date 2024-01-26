package testrunners;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import com.qa.util.ConfigReader;
	
//import io.cucumber.junit.CucumberOptions;
//import io.cucumber.junit.Cucumber;

//@RunWith(Cucumber.class)
@CucumberOptions(
		         features={"src/test/resources/AppFeatures"},
		         glue= {"stepDefinitions","AppHooks", "rerun:target/rerun.txt"},
		         monochrome = false,
		 		 tags = ""
		         )

public class testRunner extends AbstractTestNGCucumberTests
 {
	@Override
	@DataProvider(parallel = false)
	public Object[][] scenarios() {

		return super.scenarios();
	}
	@BeforeTest
    @Parameters({"browser"})
    public void defineBrowser(String browser) throws Throwable {
		ConfigReader.loadConfig();
		ConfigReader.setBrowserType(browser);
		System.out.println(" in runner " + browser);

}
	/*@BeforeClass
	public static void beforeClass()
		{
		}
	@AfterClass
	public static void afterClass()
		{
		}*/
}
