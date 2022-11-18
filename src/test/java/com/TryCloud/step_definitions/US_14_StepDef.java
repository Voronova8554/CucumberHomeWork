package com.TryCloud.step_definitions;

import com.TryCloud.pages.MagnifierIconPage;
import com.TryCloud.utilities.BrowserUtils;
import com.TryCloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class US_14_StepDef {

    MagnifierIconPage magnifierIconPage = new MagnifierIconPage();
    String expected = "";
    @When("the user clicks the magnifier icon on the right top")
    public void the_user_clicks_the_magnifier_icon_on_the_right_top() {
        magnifierIconPage.magnifierIconBtn.click();
    }
    @And("users search any existing file-folder-user name")
    public void usersSearchAnyExistingFileFolderUserName() {
        expected = "User11";
        magnifierIconPage.inputSearchMagnifierBox.sendKeys(expected);
        BrowserUtils.sleep(1);
    }
    @Then("verify the app displays the expected result option")
    public void verify_the_app_displays_the_expected_result_option() {

        String actual = "";
        List<WebElement> names = Driver.getDriver().findElements(By.xpath("//span[@class='unified-search__result-content']/h3"));

        BrowserUtils.sleep(2);

        for (WebElement name : names) {

         if(name.getText().equals(expected)){

             actual=name.getText();
         }
        }
        Assert.assertEquals(expected,actual);
        System.out.println(actual + " " + expected);
    }




}
