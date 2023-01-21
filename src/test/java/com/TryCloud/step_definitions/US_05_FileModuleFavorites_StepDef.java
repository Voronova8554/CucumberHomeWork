package com.TryCloud.step_definitions;

import com.TryCloud.pages.FilePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class US_05_FileModuleFavorites_StepDef {
    FilePage filePage = new FilePage();
    String expectedFavoriteThreeDat;

    @When("the user clicks action-icon  from any file on the page")
    public void the_user_clicks_action_icon_from_any_file_on_the_page() {
        int num = 4;// we pik num random
        filePage.threeDot.get(num - 1).click(); //index num -> List start from 0
        expectedFavoriteThreeDat = filePage.allRowOfTheTable.get(num - 1).getAttribute("data-file");

    }

    @When("user choose the {string} option")
    public void user_choose_the_option(String string) {

        filePage.AddToFavorite.click();

    }

    @When("user click the {string} sub-module on the left side")
    public void user_click_the_sub_module_on_the_left_side(String string) {

        filePage.favoritesBtn.click();
    }

    @Then("Verify the chosen file is listed on the table")
    public void verify_the_chosen_file_is_listed_on_the_table() {
        String actualFavorite = "";

        for (WebElement webElement : filePage.allRowAfterInFavorite) {

            actualFavorite = webElement.getAttribute("data-file");

            if (expectedFavoriteThreeDat.equals(actualFavorite)) {
                break;
            }
            //    System.out.println("actualFavorite = " + actualFavorite);
            //     System.out.println("expectedFavoriteThreeDat = " + expectedFavoriteThreeDat);
        }

        Assert.assertEquals(expectedFavoriteThreeDat,actualFavorite);

        // System.out.println("filePage.ExpectedFavorite.getText() = " + filePage.ExpectedFavorite.getAttribute("data-file"));
        // System.out.println("filePage.ExpectedFavorite.getText() = " + filePage.actualFavorite.getAttribute("data-file"));
    }
}
