package com.TryCloud.step_definitions;

import com.TryCloud.pages.BasePage;
import com.TryCloud.pages.TalkPage;
import com.TryCloud.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class US_11_StepDef {

    BasePage basePage = new BasePage();
    TalkPage talkPage = new TalkPage();
    String expected = "";
    String expectedMessage = "";

    @When("the user clicks the -Talk- module")
    public void the_user_clicks_the_talk_module() {

        basePage.talk.click();
    }
    @When("user search user from the search box")
    public void user_search_user_from_the_search_box() {

        expected = "User11";
        talkPage.inputTalkSearchBox.sendKeys(expected);

    }
    @When("user write a message")
    public void user_write_a_message() {

        for (WebElement each : talkPage.namesOfContact) {
            if(each.getText().equals(expected)){
                each.click();
                break;
            }
        }

        expectedMessage = "Hello,Hello!";
        talkPage.writeMessageBox.sendKeys("Hello,Hello!");

        BrowserUtils.sleep(2);
    }
    @When("user clicks to submit button")
    public void user_clicks_to_submit_button() {

        talkPage.talkSubmitMesBtn.click();

    }
    @Then("the user should be able to see the message is displayed on the conversation log")
    public void the_user_should_be_able_to_see_the_message_is_displayed_on_the_conversation_log() {
        String actualMessage = "";
        for (WebElement each : talkPage.messageList) {
            if(each.getText().equals(expectedMessage)){
                actualMessage= each.getText();
                break;
            }
        }
        Assert.assertEquals(expectedMessage,actualMessage);
        System.out.println(actualMessage);
    }
}
