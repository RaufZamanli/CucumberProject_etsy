package StepDefinitions;

import Pages.POM;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import java.util.List;


public class AddToCartSteps {
    POM pm = new POM();

    @And("User sends value in the main page")
    public void userSendsValueInTheMainPage(DataTable dt) {

        List<List<String>>items = dt.asLists(String.class);

        for (int i = 0; i < items.size(); i++) {
            WebElement element = pm.getWebElement(items.get(i).get(0));
            pm.sendKeysFunction(element,items.get(i).get(1));
        }

        pm.clickFunction(pm.searchBtn);
    }

    @And("User select first of the displayed items")
    public void UserSelectFirstOfTheDisplayedItems() {

        String currentWindowHandle = GWD.getDriver().getWindowHandle();

        pm.clickFunction(pm.displayedItems.get((int)(Math.random()*25)));

        for (String windowHandle:GWD.getDriver().getWindowHandles()) {

            if (!windowHandle.equals(currentWindowHandle))
                GWD.getDriver().switchTo().window(windowHandle);
        }
    }

    @And("Click on element on main Page")
    public void clickOnElementOnMainPage(DataTable dt) {


        List<String> buttons = dt.asList(String.class);

        for (String button: buttons) {
            WebElement element = pm.getWebElement(button);
            pm.clickFunction(element);
        }

        pm.clickFunction(pm.viewCart);

    }

    @Then("verify that item has been added to the cart successfully")
    public void verifyThatItemHasBeenAddedToTheCartSuccessfully() {

        pm.verifiedContainsTextFunction(pm.itemNumber,"item");

    }



}
