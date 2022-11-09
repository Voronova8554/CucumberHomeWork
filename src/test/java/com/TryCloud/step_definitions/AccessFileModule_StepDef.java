package com.TryCloud.step_definitions;

import com.TryCloud.pages.BasePage;
import com.TryCloud.pages.FilePage;
import com.TryCloud.pages.TryCloudLoginPage;
import com.TryCloud.utilities.ConfigurationReader;
import com.TryCloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class AccessFileModule_StepDef {

    TryCloudLoginPage tryCloudLoginPage = new TryCloudLoginPage();
    BasePage basePage = new BasePage();
    FilePage filePage = new FilePage();

    @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() {
        tryCloudLoginPage.setUpURL();
        tryCloudLoginPage.login(ConfigurationReader.getProperty("username2"), ConfigurationReader.getProperty("password2"));
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Dashboard";
        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }

    @When("the user clicks the {string} module")
    public void the_user_clicks_the_module(String string) {
        basePage.file.click();
    }

    @Then("verify the page title is {string}")
    public void verify_the_page_title_is(String expectedTitle) {
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals("Failed Title", expectedTitle,actualTitle);
    }


    @When("user click the top-left checkbox of the table")
    public void user_click_the_top_left_checkbox_of_the_table() {

        filePage.leftTopCheckBox.click();
      //  Thread.sleep(3000);
    }
    @Then("verify all the files are selected")
    public void verify_all_the_files_are_selected() {


        for (WebElement allCheckBox : filePage.allCheckBox) {
          Assert.assertTrue("Not all of them is selected!",allCheckBox.isSelected());

            }
        }
    }

