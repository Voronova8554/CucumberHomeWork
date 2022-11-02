package com.TryCloud.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-report.html",
        "me.jvt.cucumber.report.PrettyReports:target/cucumber",
                "rerun:target/rerun.txt"},
        features = "src/test/resources/features2",
        glue = "com/TryCloud/step_definitions", // package
        dryRun = false,
        tags = "@wip"

)
public class CucumberRunner {

}
