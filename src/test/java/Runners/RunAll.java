package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/FeatureFiles"}, // path of feature files
        glue = {"StepDefinitions"}, // package where codes have been written
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"} // Pdf report
)



public class RunAll extends AbstractTestNGCucumberTests {

}
