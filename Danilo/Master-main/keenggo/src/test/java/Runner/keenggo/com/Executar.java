package Runner.keenggo.com;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(

		
		// Executar por TAGS
		features = "src/test/resources/Feature/", glue = "Steps", tags = "@keenggo",
		plugin = { "pretty","html:target/report.html" }, monochrome = true,
		snippets = SnippetType.CAMELCASE, dryRun = false)

public class Executar {

}
