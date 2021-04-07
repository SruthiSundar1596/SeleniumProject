package testRunner;

import org.testng.annotations.AfterClass;

import baseClass.LaunchBrowser;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = ".\\Feature Files", glue = { "stepDefinitions" }, plugin = { "pretty",
		"html:HTML-Reports" }, monochrome = true)
public class TestRunner extends AbstractTestNGCucumberTests {
	@AfterClass
	public void quitDriver() {
		LaunchBrowser.driver.quit();
	}
}