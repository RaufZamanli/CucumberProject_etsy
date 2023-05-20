package StepDefinitions;

import Pages.POM;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class LoginSteps {

    POM pm = new POM();
    @Given("Navigate to etsy")
    public void navigateToWebSite() {

        GWD.getDriver().get("https://www.etsy.com/");

    }


    @Then("verify that main page has successfully been opened")
    public void verifyThatMainPageHasSuccessfullyBeenOpened() {

        pm.verifiedContainsTextFunction(pm.displayedMssg,"Etsy");
    }
}
