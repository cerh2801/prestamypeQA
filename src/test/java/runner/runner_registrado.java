package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        // tener en cuenta que debe cambiar el path del feature
        features = {"C:\\Users\\cerh2\\IdeaProjects\\prestamype\\src\\resources\\feature\\Prestamype\\Broker.feature"},
        glue = {"StepDefinition\\BrokerStep"},
        tags = "@broker"
)

public class runner_registrado {





}
