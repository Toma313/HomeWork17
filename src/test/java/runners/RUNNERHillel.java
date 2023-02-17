package runners;

import config.BaseClass;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
    @RunWith(Cucumber.class)
    @CucumberOptions(

            features = "src/test/java/Features",//path to feature files
            glue = "steps",//package path
            tags = "@ALL",//list feature files for run
            publish = true,
            monochrome = true
    )
    public class RUNNERHillel  extends BaseClass {
    }
