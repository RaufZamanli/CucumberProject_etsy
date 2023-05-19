package StepDefinitions;

import Utilities.GWD;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hook {

    @After  // run after every scenario

    public void after(Scenario scenario){
        System.out.println("End of Scenario");



        if (scenario.isFailed()){
            // extend report
            TakesScreenshot ts=(TakesScreenshot) GWD.getDriver();
            final byte[] hafizadakiHali=ts.getScreenshotAs(OutputType.BYTES);
            scenario.attach(hafizadakiHali, "image/png","screenshot name");
        }

        GWD.quitDriver();
    }
}
