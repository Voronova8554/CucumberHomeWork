package com.TryCloud.step_definitions;

import com.TryCloud.pages.BasePage;
import com.TryCloud.pages.TryCloudLoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class VerifyMainModules_StepDef {
    TryCloudLoginPage tryCloudLoginPage = new TryCloudLoginPage();
    BasePage basePage = new BasePage();

    @When("the users  log in with valid credentials")
    public void the_users_log_in_with_valid_credentials() {
     tryCloudLoginPage.inputUsername.sendKeys("user7");
     tryCloudLoginPage.inputPassword.sendKeys("Userpass123");
     tryCloudLoginPage.loginBtn.click();

    }
    @Then("Verify the user see the following modules:")
    public void verify_the_user_see_the_following_modules(List<String> expectedListOfModules) {

        List<String> actualListOfModules = new ArrayList<>();
        for (WebElement module : basePage.modules) {
            if(actualListOfModules.size() < expectedListOfModules.size()){
                actualListOfModules.add(module.getAttribute("aria-label"));
            }
        }
        Assert.assertEquals("modules Failed!",expectedListOfModules,actualListOfModules);
    }
}
