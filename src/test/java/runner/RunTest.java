package runner;

import cucumber.api.CucumberOptions;

import cucumber.api.testng.AbstractTestNGCucumberTests;

import org.testng.annotations.Test;

// Uncomment @RunWith if you are using Junit to run Test 
//@RunWith(Cucumber.class)

@CucumberOptions(features={"src//test//java//features"}
					,glue={"stepdefinations","utility"}
					,plugin = {"pretty"}
					, tags ={"@appium"}
					,format = {"json:target/json-report/dw.json",
                               "html:target/cucumber-reports/cucumber-pretty",
                               "rerun:target/cucumber-reports/rerun.txt"
                })

@Test
public class RunTest extends AbstractTestNGCucumberTests{

}
