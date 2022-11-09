package com.TryCloud.step_definitions;

import com.TryCloud.pages.FilePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class RemoveFileFromFavoriteAndUpload_StefDef {
    FilePage filePage = new FilePage();
    String expectedAnFavorite = "";
    int numOfRow = 0;
    @When("the users click action-icon from any file on the page to remove")
    public void the_users_click_action_icon_from_any_file_on_the_page_to_remove() {

        filePage.threeDot.get(numOfRow).click(); // List starts from 0


    }
    @And("user choose the -Remove from favorites- option")
    public void userChooseTheRemoveFromFavoritesOption() {

        expectedAnFavorite = filePage.allRowOfTheTable.get(numOfRow).getAttribute("data-file");
        filePage.removeFromFavorite.click();
    }

    @Then("Verify that the file is removed from the Favorites sub-module’s table")
    public void verify_that_the_file_is_removed_from_the_favorites_sub_module_s_table() {

        boolean check = true;
        for (WebElement webElement : filePage.allRowAfterInFavorite) {
            if(webElement.getAttribute("data-file").equals(expectedAnFavorite)){
                check = false;
                break;
            }
        }
        Assert.assertTrue(check);
    }

    @When("the user clicks the add icon on the top")
    public void the_user_clicks_the_add_icon_on_the_top() {

        filePage.addIcon.click();
    }
    @When("users uploads file with the “upload file” option")
    public void users_uploads_file_with_the_upload_file_option() throws InterruptedException {

        filePage.uploadFile.sendKeys("/Users/alenavoronova/Desktop/Hello.txt");
          Thread.sleep(3000);

    }
    @Then("verify the file is displayed on the page")
    public void verify_the_file_is_displayed_on_the_page() {

    }
/*
User story about uploading file step:
1-  you will click '+' sign
2- you will locate Upload file and you will use sendKeys method to send pathOfFile
3- you will use explicit wait until id="uploadprogressbar" is invisible.
 */


}
