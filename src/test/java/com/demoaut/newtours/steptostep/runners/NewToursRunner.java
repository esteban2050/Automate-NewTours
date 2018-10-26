package com.demoaut.newtours.steptostep.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
features = "src/test/resources/features/",
//RegisterNewTours.feature
glue = "com.demoaut.newtours.steptostep.stepDefinitions",
snippets = SnippetType.CAMELCASE)


public class NewToursRunner {

}
