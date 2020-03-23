package com.cts.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@CucumberOptions(features = { "src/main/resources/feature/" },
glue = {"com/cts/stepdefinitions" },
monochrome = true, plugin = { "html:reports" })

@RunWith(Cucumber.class)
public class RunnerTest {

}