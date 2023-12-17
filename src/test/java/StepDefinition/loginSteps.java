package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class loginSteps {

	@Given("user on login page")
	public void user_on_login_page() {

		System.out.println("user on login page");
	}

	@And("user enters name1 and pass1")
	public void user_enters_name1_and_pass1() {

		System.out.println("user enters name1 and pass1");
	}

	@When("click  on login button")
	public void click_on_login_button() {
		System.out.println("click  on login button");
	}

	@And("user nevigate to home page")
	public void user_nevigate_to_home_page() {
		System.out.println("user nevigate to home page");
	}



}
