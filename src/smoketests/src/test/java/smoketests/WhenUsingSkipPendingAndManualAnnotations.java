package smoketests;

import cucumber.api.CucumberOptions;
import io.cucumber.junit.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/skipped_pending_and_manual_scenarios")
public class WhenUsingSkipPendingAndManualAnnotations {}
