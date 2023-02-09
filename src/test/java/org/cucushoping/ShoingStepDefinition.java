package org.cucushoping;

import org.baseclass.Demo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ShoingStepDefinition extends Demo {
	@Given("To launch chrome browser and go to amazon website")
	public void toLaunchChromeBrowserAndGoToAmazonWebsite() {
openchrome();
urllaunch("");
	}

	@Then("search shabed shampoo product")
	public void searchShabedShampooProduct() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("add to cart for buying")
	public void addToCartForBuying() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("take Screenshot")
	public void takeScreenshot() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}



}
