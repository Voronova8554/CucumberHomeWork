package com.cydeo.step_definition;

import com.cydeo.pages.EtsySearchPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.AfterClass;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class EtsyStep_SearchDefinition {

        EtsySearchPage etsySearchPage = new EtsySearchPage();
    @Given("user on etsy home page")
    public void user_on_etsy_home_page() {

        Driver.getDriver().get("https://www.etsy.com");
    }
    @Then("user sees title is as expected")
    public void user_sees_title_is_as_expected() {

        String expectedTitle = "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals("Title failed!",expectedTitle,actualTitle);
    }

    @When("user types Wooden Spoon in the search box")
    public void user_types_wooden_spoon_in_the_search_box() {

        etsySearchPage.searchBox.sendKeys("Wooden Spoon");
    }
    @When("user clicks search button")
    public void user_clicks_search_button() {

        etsySearchPage.searchBoxBtn.click();
    }
    @Then("user sees Wooden Spoon is in the title")
    public void user_sees_wooden_spoon_is_in_the_title() {
        String expectedTitle = "Wooden spoon";
        String actualeTitle = Driver.getDriver().getTitle();
        Assert.assertTrue( "Title failed WD!",actualeTitle.contains(expectedTitle));

    }

}
