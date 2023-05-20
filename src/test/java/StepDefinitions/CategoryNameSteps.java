package StepDefinitions;

import Pages.POM;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class CategoryNameSteps {

    POM pm = new POM();

    @Given("Navigate to Clothing & Shoes section")
    public void navigateToClothingShoesSection() {

        Actions actions = new Actions(GWD.getDriver());

        pm.waitUntilClickable(pm.clthAndShoes);
        Action action = actions.moveToElement(pm.clthAndShoes).build();
        action.perform();



    }

    @And("Navigate to Men's shirts sections")
    public void navigateToMenSShirtsSections() {

        Actions actions = new Actions(GWD.getDriver());

        pm.waitUntilClickable(pm.mensSection);
        Action action = actions.moveToElement(pm.mensSection).build();
        action.perform();

        pm.waitUntilClickable(pm.shirtsSection);
        Action actions2 = actions.moveToElement(pm.shirtsSection).click().build();
        actions2.perform();
    }


    @Then("verify that at least twenty of displayed items description contains the word {string}")
    public void verifyThatAtLeastTwentyOfDisplayedItemsDescriptionContainsTheWord(String category) {

        int count=1;

        while (count<=20){

            if (pm.displayedItems.get(count).getText().toLowerCase().contains(category))
                count++;
        }

        Assert.assertTrue(count>=20);
    }
}
