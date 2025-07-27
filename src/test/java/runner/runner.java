package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.*;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/java/login.feature"},glue ={"stepdefinitionslogin", "hooks"},tags = " @LoginPositive or @Logout",
plugin = {
        "pretty",
        "html:target/cucumber-html-report.html",
        "json:target/cucumber.json",
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" 
    },
    monochrome = true
)
public class runner {
}