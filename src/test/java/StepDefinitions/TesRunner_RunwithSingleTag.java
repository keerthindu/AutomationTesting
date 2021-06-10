package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(features="/src/test/resource/featureWithTags", 
glue = {"StepDefinitions"}
//tags= {"@smoke"}
)

public class TesRunner_RunwithSingleTag {

}
