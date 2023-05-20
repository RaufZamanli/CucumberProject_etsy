package StepDefinitions;

import Pages.POM;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class ProductSearchSteps{

    POM pm=new POM();

    @Given("Enter a specific keyword or product name in the search bar")
    public void enterASpecificKeywordOrProductNameInTheSearchBar() {
        pm.sendKeysFunction(pm.searchBox, "necklace");
    }

    @And("Click on the search button")
    public void clickOnTheButton() {
        pm.clickFunction(pm.searchButton);
    }

    @Then("Verify that the search results page displays relevant products matching the search criteria {string}")
    public void verifyThatTheSearchResultsPageDisplaysRelevantProductsMatchingTheSearchCriteria(String product) {

        pm.verifiedContainsTextFunction(pm.necklace, product);

    }
}
