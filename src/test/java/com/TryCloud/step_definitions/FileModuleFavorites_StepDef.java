package com.TryCloud.step_definitions;

import com.TryCloud.pages.FilePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FileModuleFavorites_StepDef {
FilePage filePage = new FilePage();
    @When("the user clicks action-icon  from any file on the page")
    public void the_user_clicks_action_icon_from_any_file_on_the_page() throws InterruptedException {
       filePage.threeDot.click();
        Thread.sleep(5000);
    }
    @When("user choose the {string} option")
    public void user_choose_the_option(String string) {

    }
    @When("user click the {string} sub-module on the left side")
    public void user_click_the_sub_module_on_the_left_side(String string) {

    }
    @Then("Verify the chosen file is listed on the table")
    public void verify_the_chosen_file_is_listed_on_the_table() {

    }
}
