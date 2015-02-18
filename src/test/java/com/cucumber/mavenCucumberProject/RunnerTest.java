package com.cucumber.mavenCucumberProject;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(
		 format = {"pretty", "json:target/cucumber.json"},
		features= "src/test/resource")
public class RunnerTest {

}
