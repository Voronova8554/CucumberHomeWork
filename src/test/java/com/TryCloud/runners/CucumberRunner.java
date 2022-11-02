package com.TryCloud.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features2",
        glue = "com/TryCloud/step_definitions",
        dryRun = false,
        tags = "@wip"

)
public class CucumberRunner {

}
