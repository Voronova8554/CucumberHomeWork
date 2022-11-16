package com.TryCloud.step_definitions;

import com.TryCloud.pages.FilePage;
import com.TryCloud.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class US_08_StepDef {
    FilePage filePage = new FilePage();

    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
    String expected = "";
    @When("user choose the -Delete folder- option")
    public void user_choose_the_delete_folder_option() {
        expected = filePage.allRowOfTheTable.get(0).getAttribute("data-file");
        filePage.DeleteBtn.click();
    }
    @When("the user clicks the {string} sub-module on the left side")
    public void the_user_clicks_the_sub_module_on_the_left_side(String string) {

        filePage.DeleteLeftModule.click();
    }
    @Then("Verify the deleted file is displayed on the page.")
    public void verify_the_deleted_file_is_displayed_on_the_page() {

        String actual = "";
        for (WebElement each : filePage.allRowOfTheTable) {
            js.executeScript("window.scrollBy(0,750)","");
        }

        for (WebElement each : filePage.allRowOfTheTable) {
            if(each.getAttribute("data-file").equals(expected)){
            actual = each.getAttribute("data-file");
            }
         }
        System.out.println(expected + " " + actual);
        Assert.assertEquals("failed!!!!! ", expected, actual);
      //  Assert.assertTrue(actual.equals(expected));
    }
}
