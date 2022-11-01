package com.cydeo.step_definition;

import com.cydeo.utilities.Driver;
import io.cucumber.java.After;


public class Hooks {


  @After
    public void teardown() { //@After use io.cucumber
        // We will implement taking screenshot in this method
        System.out.println("It will be closing browser using cucumber @After each scenario");

        Driver.closeDriver();
    }
}