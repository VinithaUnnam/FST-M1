package testRunner;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.SelectClasspathResource;

import io.cucumber.junit.platform.engine.Constants;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("Features") // Path to your feature file(s)
@ConfigurationParameter(
    key = Constants.GLUE_PROPERTY_NAME, value = "stepDefinitions" // Path to your step definitions
)
@ConfigurationParameter(
    key = Constants.FILTER_TAGS_PROPERTY_NAME, value = "@activity6" // Tag to run this scenario
)
public class TestRunner {}
