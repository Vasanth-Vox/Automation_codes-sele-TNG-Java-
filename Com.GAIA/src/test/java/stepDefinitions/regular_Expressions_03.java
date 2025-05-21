package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class regular_Expressions_03 {
	
	@Given("I am {int} years old")
	public void i_am_years_old(Integer int1) {
		System.out.println("Age is " + int1);
	    
	}

	@When("I was at the age, my height is {double}")
	public void i_was_at_the_age_my_height_is(Double double1) {
		System.out.println("height is " + double1);
	    
	}

	@Then("I am from {string} and native {string} vilege of {string}")
	public void i_am_from_and_native_vilege_of(String stringg, String string2, String string3) {
		System.out.println("native is" + stringg + string2 + string3);
	}

	

}
