package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resource/Features", glue = {"StepDefinitions"},
monochrome=true, 

plugin = {"pretty","html:target/HtmlReports","pretty","json:target/JSONReports/report.json"})
public class TesRunner {

}
