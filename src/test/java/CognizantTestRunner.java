

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/java/features/CognizantTestCode.feature"
		,glue={"steps"}
		)

public class CognizantTestRunner {

}