package com.simplilearn.HennaSolutions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class client {
	
	@Given("the user is on the client creation page")
	public void the_user_is_on_the_client_creation_page() {
		System.out.println("STEP1: Given");
	}

	@When("the user enter name, address, email and password in the form")
	public void the_user_enter_name_address_email_and_password_in_the_form() {
		System.out.println("STEP2: When");
	}

	@And("the user clicks on the Register button")
	public void the_user_clicks_on_the_register_button() {
		System.out.println("STEP2: And");
	}

	@Then("the user will nevigate to the home page")
	public void the_user_will_nevigate_to_the_home_page() {
		System.out.println("STEP3: Then");
	}



	
	
}
