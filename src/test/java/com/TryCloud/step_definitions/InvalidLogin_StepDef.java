package com.TryCloud.step_definitions;

import com.TryCloud.pages.TryCloudLoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class InvalidLogin_StepDef {


    TryCloudLoginPage tryCloudLoginPage = new TryCloudLoginPage();
    @When("user enter invalid {string} and {string}")
    public void user_enter_invalid_and(String InvalidUsername, String InvalidPassword) {

       tryCloudLoginPage.inputUsername.sendKeys(InvalidUsername);
       tryCloudLoginPage.inputPassword.sendKeys(InvalidPassword);
    }
    @Then("verify {string} message should be displayed")
    public void verify_message_should_be_displayed(String expectedMassage) {

        String actualMassage =tryCloudLoginPage.message.getText();
        Assert.assertEquals("Failed to check 'wrog passsword or username'",expectedMassage,actualMassage);
    }

}
