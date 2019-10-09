package net.devlance.java.cucumber.testrunners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
//This will link the feature files with the stepdefs
@CucumberOptions(
    features="src/test/java/net/devlance/java/cucumber/features",
    glue="net.devlance.java.cucumber.stepdefs",
    plugin="pretty"
)
public class MenuManagementTestRunner {

}
