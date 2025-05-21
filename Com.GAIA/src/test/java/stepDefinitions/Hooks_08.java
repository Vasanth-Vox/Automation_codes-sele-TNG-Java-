package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Hooks_08 {
	@Given("Vasanth has cmpleted tenth")
	public void vasanth_has_cmpleted_tenth() {
	    System.out.println("Vasanth has cmpleted tenth");
	}

	@When("he as 20th done a graduation")
	public void he_as_20th_done_a_graduation() {
	    System.out.println("He as 20th done a graduation");
	}

	@When("He pursued MCA")
	public void he_pursued_mca() {
		System.out.println("He pursued MCA");
	   
	}

	@Then("He went for job at CTS")
	public void he_went_for_job_at_cts() {
	    System.out.println("He went for job at CTS");
	}


}
