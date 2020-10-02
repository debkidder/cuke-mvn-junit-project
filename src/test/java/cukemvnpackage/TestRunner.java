package cukemvnpackage;


//import cucumber.api.junit.Cucumber; //deprecated
//import cucumber.api.junit.*;
//import cucumber.api.*;
//import io.cucumber.core.cli.Main;

//import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
   

@RunWith(io.cucumber.junit.Cucumber.class)
@CucumberOptions(features="classpath:login/LoginTest.feature", glue="cukemvnpackage")
public class TestRunner {

}
