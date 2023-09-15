package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features  = "src/test/java/features/",
        glue = {"test"},
        tags = "@Login"
//        plugin = {"pretty", "html:target/cucumber-html-report","json:target/cucumber.json"}
        //format = {"json:target/cucumber.json", "html:target/site/cucumber-pretty", "pretty"}
)

public class TestRunner {


}



