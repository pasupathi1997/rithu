package org.stepdefinitionexample;

import java.util.List;
import java.util.Map;

import org.baseclass.Demo;
import org.openqa.selenium.WebElement;
import org.pojo.Automate;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionExample extends Demo {
	//without header
	
	
	/*@Given("Launch google Chrome browser")
	public void launch_google_Chrome_browser() {
		openchrome();
		urllaunch("https://demoqa.com/automation-practice-form");
		stay(10);
		Automate a = new Automate();
		WebElement button = a.getButton();
		click(button);
		WebElement proceed = a.getProceed();
		click(proceed);

	}
	@When("Give accurates information in form")
	public void give_accurates_information_in_form(io.cucumber.datatable.DataTable d) {
		List<String> asList = d.asList();
		String name = asList.get(0);
		String lastname = asList.get(1);
		String email1 = asList.get(2);
		String phone = asList.get(3);
		Automate a = new Automate();
		WebElement fname = a.getFname();
		sendKeys(fname, name);
		WebElement lname = a.getLname();
		sendKeys(lname, lastname);
		WebElement email = a.getEmail();
		sendKeys(email, email1);
		WebElement phonenumber = a.getPhonenumber();
		sendKeys(phonenumber, phone);

	}

	

	@Then("Pending other Feild")
	public void pending_other_Feild() {
		System.out.println("its not a ending just beginning");
	}

	@Given("Launch google Chrome browsers")
	public void launch_google_Chrome_browsers() {
		openchrome();
		urllaunch("https://demoqa.com/automation-practice-form");
		stay(10);
		Automate a = new Automate();
		WebElement button = a.getButton();
		click(button);
		WebElement proceed = a.getProceed();
		click(proceed);
	}

	@When("Give accurates information in form fill down")
	public void give_accurates_information_in_form_fill_down(io.cucumber.datatable.DataTable d) {
		List<List<String>> asLists = d.asLists();
		String name = asLists.get(0).get(0);
		String lastname = asLists.get(0).get(1);
		String email1 = asLists.get(1).get(0);
		String phone = asLists.get(1).get(1);
		Automate a = new Automate();
		WebElement fname = a.getFname();
		sendKeys(fname, name);
		WebElement lname = a.getLname();
		sendKeys(lname, lastname);
		WebElement email = a.getEmail();
		sendKeys(email, email1);
		WebElement phonenumber = a.getPhonenumber();
		sendKeys(phonenumber, phone);

	}
*/
	
	//withheader
	
	@Given("Launch google Chrome browser")
	public void launch_google_Chrome_browser() {
		openchrome();
		urllaunch("https://demoqa.com/automation-practice-form");
		stay(10);
		Automate a = new Automate();
		WebElement button = a.getButton();
		click(button);
		WebElement proceed = a.getProceed();
		click(proceed);

	}
	@When("Give accurates information in form")
	public void give_accurates_information_in_form(io.cucumber.datatable.DataTable d) {
		List<String> asList = d.asList();
		String name = asList.get(0);
		String lastname = asList.get(1);
		String email1 = asList.get(2);
		String phone = asList.get(3);
		Automate a = new Automate();
		WebElement fname = a.getFname();
		sendKeys(fname, name);
		WebElement lname = a.getLname();
		sendKeys(lname, lastname);
		WebElement email = a.getEmail();
		sendKeys(email, email1);
		WebElement phonenumber = a.getPhonenumber();
		sendKeys(phonenumber, phone);

	}

	

	@Then("Pending other Feild")
	public void pending_other_Feild() {
		System.out.println("its not a ending just beginning");
	}

	@Given("Launch google Chrome browsers")
	public void launch_google_Chrome_browsers() {
		openchrome();
		urllaunch("https://demoqa.com/automation-practice-form");
		stay(10);
		Automate a = new Automate();
		WebElement button = a.getButton();
		click(button);
		WebElement proceed = a.getProceed();
		click(proceed);
	}

	@When("Give accurates information in form fill down")
	public void give_accurates_information_in_form_fill_down(io.cucumber.datatable.DataTable d) {
Map<String, String> asmap = d.asMap(String.class, String.class);
		String name1 = asmap.get("Achnor name");
		Automate a = new Automate();
		WebElement fname = a.getFname();
		sendKeys(fname, name);
		WebElement lname = a.getLname();
		sendKeys(lname, lastname);
		WebElement email = a.getEmail();
		sendKeys(email, email1);
		WebElement phonenumber = a.getPhonenumber();
		sendKeys(phonenumber, phone);

	}

	

}
