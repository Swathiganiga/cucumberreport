package com.swathi.demo;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	@Given("^I open login page$")
	public void i_open_login_page() throws Throwable {
		System.out.println("open login page url");
		
	}

	@When("^I enter username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
	public void i_enter_username_as_and_password_as(String username, String password) throws Throwable {
		System.out.println("type user name and password");
	}
     @When("^I submit login page$")
public void i_submit_login_page() throws Throwable{
	System.out.println("submit to login page");
}
     @Then("^I redirect to user home page$")
     public void i_redirect_to_user_home() throws Throwable{
     	System.out.println("verify current page is home page");
     }
     @Given("^I am on login page$")
     public void i_am_on_login_page() throws Throwable {
         // Write code here that turns the phrase above into concrete actions
    	 System.out.println("im on login page url");
     }

     @Then("^I am login page$")
     public void i_am_login_page() throws Throwable {
         // Write code here that turns the phrase above into concrete actions
    	 System.out.println("im login page url");
     }
}
