package com.TryCloud.step_definitions;

import com.TryCloud.pages.FilePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CommentToFileFolder_StepDef {
    FilePage filePage = new FilePage();

    @And("the user choose the {string} option")
    public void theUserChooseTheOption(String string) {
        filePage.detailsBtn.click();
    }
    @When("user write a comment {string} inside the input box")
    public void user_write_a_comment_inside_the_input_box(String message) {

        filePage.commentsBtn.click();
        filePage.inputCommentBox.sendKeys(message);

    }
    @When("user click the submit button to post it")
    public void user_click_the_submit_button_to_post_it() {

        filePage.submitBtn.click();
    }
    @Then("Verify the comment is displayed in the comment section.")
    public void verify_the_comment_is_displayed_in_the_comment_section() {
       String expectedPostText = "message";
        String actualPostText = filePage.postMessageText.getText();

        Assert.assertTrue(actualPostText.contains(expectedPostText));
    }
}
