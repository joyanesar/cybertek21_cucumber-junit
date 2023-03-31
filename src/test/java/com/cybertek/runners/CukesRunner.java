package com.cybertek.runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/cucumber-report.html", //
                "rerun:target/rerun.txt", // store failed scenario names into rerun .txt file
                "json:target/cucumber.json"//generate jason execution report to be used for html report
        },
        features ="src/test/resources/features",  //To point to the file address for features
        glue = "com/cybertek/step_definitions", // its path to step definition
        dryRun =false, // it generate the step_definition
         //tags =""  , //tags is another cucumber option, it allows us to run certain scenario(s)
        tags = "@smoke or @etsy" //when there are multiple
)
public class CukesRunner {


}
