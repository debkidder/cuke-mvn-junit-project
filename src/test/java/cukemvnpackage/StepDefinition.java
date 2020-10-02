package cukemvnpackage;

import cucumber.api.PendingException;
//import cucumber.api.java.en.*;

//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class StepDefinition {

//@Given("^I am on login page$")
//public void i_am_on_login_page() throws Throwable {
//	// write code for concrete actions
//	throw new PendingException();

	@Given("^I am on login page$")
	public void i_am_on_login_page() throws Throwable {
		System.out.println("Opening Login page url");
	}

	@When("^I enter username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
	public void i_enter_username_as_and_password_as(String arg1, String arg2) throws Throwable {
		System.out.println("Entering username and password");
	}

	@And("^I submit login button$")
	public void i_submit_login_button() throws Throwable {
		System.out.println("Submitting login button");
	}

	@Then("^I am logged in$")
	public void i_am_logged_in() throws Throwable {
		System.out.println("Verifying that logged in");
	}

	@And("^I am redirected to user home page$")
	public void i_am_redirected_to_user_home_page() throws Throwable {
		System.out.println("Verifying that redirected to user home page");
	}
	
	
//Negative Steps

	@When("^I enter username as \"([^\"]*)\" and invalid password as 'invalid'")
	public void i_enter_username_as_and_invalid_password_as(String arg1, String arg2) throws Throwable {
		System.out.println("Entering username and invalid password");
	}

	@Then("^I am correctly not logged in$")
	public void i_am_not_logged_in() throws Throwable {
		System.out.println("Verifying that not logged in");
	}

	@And("^I am correctly not redirected to user home page$")
	public void i_am_not_redirected_to_user_home_page() throws Throwable {
		System.out.println("Verifying that not redirected to user home page");
	}
	
	
	


}


// write code for concrete actions
// throw new PendingException();
