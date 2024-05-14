package runner;

import cucumber.api.CucumberOptions;

@CucumberOptions(format = { "pretty", "html:/home/ninad/eclipse-workspace/Reports/html/",
		"json:/home/ninad/eclipse-workspace/Reports/cucumber-report.json" }, features = {
				"src/test/resource" }, glue = "stepDefinitions", tags = { "@runfile" })

public class Runner {

}
