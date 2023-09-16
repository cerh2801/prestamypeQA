package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        // tener en cuenta que debe cambiar el path del feature
        features = {"/src/TestPage/resources/features/login"},
        glue = {"StepDefinition"},
        tags = "@102"
)

public class runner_registrado {





}
