package com.swathi.demo;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features="classpath:login\\Logintest.feature",glue="com.swathi.demo",plugin= {"html:target/test-report","junit:target/junit-xml-report.xml","json:target/json-report.json"})
public class testrunnerwithNG extends AbstractTestNGCucumberTests{
	
}


