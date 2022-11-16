package com.TryCloud.step_definitions;

import com.TryCloud.pages.FilePage;
import com.TryCloud.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.internal.runners.statements.Fail;
import org.openqa.selenium.WebElement;

public class UserS_7_StepDef {


    FilePage filePage = new FilePage();
    String inputFolderName = "Hello11";
    @When("And user click ”new folder”")
    public void and_user_click_new_folder() {

        filePage.NewFolderBtn.click();
    }
    @When("user write a folder name")
    public void user_write_a_folder_name() {

        filePage.NewFolderInputBox.clear();
        filePage.NewFolderInputBox.sendKeys(inputFolderName);
    }
    @When("the user click submit icon")
    public void the_user_click_submit_icon() {
        BrowserUtils.sleep(2);
        filePage.SubmitBtn.click();
      BrowserUtils.sleep(2);
    }
    @Then("Verify the folder is displayed on the page")
    public void verify_the_folder_is_displayed_on_the_page() {
/*
        String expected = inputFolderName;
        String actual = "";
        for (WebElement each : filePage.allRowOfTheTable) {
            if(each.getAttribute("data-file").equals(expected)){
                actual= each.getAttribute("data-file");
            }
 }
        Assert.assertEquals("failed",expected,actual);

 */
        String actual = "";
        Boolean checkFile = false;
        for (WebElement webElement : filePage.allRowOfTheTable) {
            actual= webElement.getAttribute("data-file");

            if(inputFolderName.contains(actual)){
                checkFile = true;
                break;
            }
  }
        BrowserUtils.sleep(2);

        System.out.println(actual + " " + inputFolderName);
        Assert.assertTrue("uploaded file does not appear in the file website",checkFile);

    }
    @When("user choose a folder from the page")
    public void user_choose_a_folder_from_the_page() {

        for (WebElement each : filePage.allRowOfTheTable) {
            if(each.getAttribute("data-type").equals("dir")){
                each.click();
                break;
            }
          }

    }
}
