package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "featureFile",
glue={"stepDefinitions","Hooks"},
monochrome=true,
tags= "@Opengoogle",
plugin = {"pretty","html:report/webreport","json:report/jsonreport.json"})
public class runnerClass {
}

//features = it helps to store the featurefile.
//glue = it helps to store the package step definitions.
//dryrun = true - its helps to verify all methods are implemented in step definition as per feature file.
//it will show unimplemented method before anyrun 
//dryrun = false - simply run all implemented methods - ignore unimp methods.
//Strict = true - it shows unimplemented method atlast and run other methods - Opp to line 14
//Strict = false - it dont show unimp methods, simply run only implemented methods.
//Monochrome = true - its helps to view the console as human readable.
//Monochrome = false - its shows like junk text in console.
//tags - helps to run as separate features/scenarios/lines
