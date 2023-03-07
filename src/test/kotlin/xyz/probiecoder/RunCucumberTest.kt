package xyz.probiecoder

import io.cucumber.junit.Cucumber
import io.cucumber.junit.CucumberOptions
import org.junit.runner.RunWith

@RunWith(Cucumber::class)
@CucumberOptions(
    plugin = ["pretty", "summary", "html:target/cucumber.html"],
    tags = "@order"
)
class RunCucumberTest