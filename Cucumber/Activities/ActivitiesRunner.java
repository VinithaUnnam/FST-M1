package testRunner;

import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.SelectClasspathResource;

import io.cucumber.junit.platform.engine.Constants;

@Suite
@IncludeEngines("cucumber") // This will include the Cucumber engine to run tests
@SelectClasspathResource("Features") // Points to the directory where the feature files are located
@ConfigurationParameter(
  key = Constants.GLUE_PROPERTY_NAME, // Glue code (step definitions) package
  value = "stepDefinitions") // Ensure that your step definitions are in this package
@ConfigurationParameter(
  key = Constants.FILTER_TAGS_PROPERTY_NAME, // Tag filtering (to run specific scenarios)
  value = "@activity1") // Only scenarios with the tag @activity1 will run
public class ActivitiesRunner {
    // No additional code needed
}
