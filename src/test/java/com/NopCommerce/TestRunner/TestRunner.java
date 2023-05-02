package com.NopCommerce.TestRunner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		     features = ".//Features/Login.feature" ,
		     glue = "com.NopCommerce.TestRunner",
		     monochrome = true,
		     dryRun = false,
		     plugin = {"pretty", "html:test-output"},
		     tags = "@smoke"
	)
public class TestRunner extends AbstractTestNGCucumberTests{

}
