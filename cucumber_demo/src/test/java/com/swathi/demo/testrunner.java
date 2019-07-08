package com.swathi.demo;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="classpath:login\\Logintest.feature",glue="com.swathi.demo",plugin= {"html:target/test-report","junit:target/junit-xml-report.xml","json:target/json-report.json"})
public class testrunner {

}
