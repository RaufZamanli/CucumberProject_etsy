package StepDefinitions;

import Pages.POM;
import Utilities.GWD;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

public class LoginSteps {

    POM pm = new POM();
    @Given("Navigate to web site")
    public void navigateToWebSite() {

        GWD.getDriver().get("https://www.etsy.com/");

    }


    @When("Click on sign in button")
    public void clickOnSignInButton() {

        pm.clickFunction(pm.signInBtn);

    }

    @And("User enters valid credentials to username and password")
    public void userEntersValidCredentialsToUsernameAndPassword() {

        pm.sendKeysFunction(pm.emailBox,"kuralalparslan@gmail.com");
        pm.sendKeysFunction(pm.passwordBox,"testing12345");
    }

    @And("User clicks on sign in button")
    public void userClicksOnSignInButton() {
        pm.clickFunction(pm.signInBtn2);
    }

    @Then("Verify that user should logged in successfully")
    public void verifyThatUserShouldLoggedInSuccessfully() {

        pm.verifiedContainsTextFunction(pm.nameText,"Alparslan");

    }
}
