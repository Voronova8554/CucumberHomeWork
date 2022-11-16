package com.TryCloud.step_definitions;

import com.TryCloud.pages.BasePage;
import io.cucumber.java.en.When;

public class US_12_StepDef {

    BasePage basePage = new BasePage();
    @When("the user clicks the -Contacts- module")
    public void the_user_clicks_the_contacts_module() {
       basePage.contacts.click();
    }

}
