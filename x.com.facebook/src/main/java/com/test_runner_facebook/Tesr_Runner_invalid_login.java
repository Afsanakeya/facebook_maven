package com.test_runner_facebook;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

public class Tesr_Runner_invalid_login {
	@CucumberOptions(
			plugin= {"pretty","html:target","com.cucumber.listener.ExtentCucumberFormatter:target/Cucumber_Extents_report.html"},
			features="src/test/resources/Features/Fcebook_invalid_login.feature",
			glue="com.step_def_facebook"
			
			
			)

	public class Test_Runner_Local extends AbstractTestNGCucumberTests {
		

	}

}

