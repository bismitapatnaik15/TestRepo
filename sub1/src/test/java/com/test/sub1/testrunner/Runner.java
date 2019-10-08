package com.test.sub1.testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources", glue = "com.test.sub1.stepDefs")

public class Runner {
    //Error:java: javacTask: source release 8 requires target release 1.8
}
