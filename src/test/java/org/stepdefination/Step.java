package org.stepdefination;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.baseclass.Demo;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.pojo.Cucumber1;
import org.pojo.Fb;
import org.pojo.Fb1;
import org.pojo.Google;

import bsh.classpath.BshClassPath.GeneratedClassSource;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Step extends Demo {
	WebDriver driver;
	
	@Given("user have to enter faceook login through chrome browser")
	public void user_have_to_enter_faceook_login_through_chrome_browser() {
		urllaunch("https://www.facebook.com/");
		 	   
	}
	@When("user have to enter valid email and invalid password")
	public void user_have_to_enter_valid_email_and_invalid_password() {
		Fb1 f= new Fb1();
		 WebElement email = f.getEmail();
		 	sendKeys(email, "pasupathi");
		WebElement pass = f.getPassword();
			sendKeys(pass, "123456789");
	}
	@When("click login button")
	public void click_login_button() {
		Fb1 f= new Fb1();
		WebElement login = f.getLogin();
			    click(login);
	}

	@Then("user have to reach invalid credentials page")
	public void user_have_to_reach_invalid_credentials_page() {
		System.out.println("end");
	}
	
	
	@When("user have to enter valid invalid email and invalid password")
	public void user_have_to_enter_valid_invalid_email_and_invalid_password() {
		Fb1 f= new Fb1();
		 WebElement email = f.getEmail();
		 	sendKeys(email, "rickj");
		WebElement pass = f.getPassword();
			sendKeys(pass, "!@$#^&$*$$");
	}
	@When("click login buttons")
	public void click_login_buttons() {
		Fb1 f= new Fb1();
		WebElement login = f.getLogin();
		click(login);
	}
	@Then("user have to reach invalid paswword credentials page")
	public void user_have_to_reach_invalid_paswword_credentials_page() {
	System.out.println("end");
	}

	
	//
	//
	
	@Given("user have to Enter Facebook login")
	public void user_have_to_Enter_Facebook_login() {
		
		urllaunch("https://www.facebook.com/");
		
	}

	@Given("user have to click forgotton button")
	public void user_have_to_click_forgotton_button() {
	   Fb f = new Fb();
	   WebElement forget = f.getForget();
	   click(forget);
	}

	@When("user have to enter email or phone number")
	public void user_have_to_enter_email_or_phone_number() {
		Fb f = new Fb();
		WebElement emailPass = f.getEmailPass();
		sendKeys(emailPass, "1234678");
		WebElement search = f.getSearch();
		click(search);
	}

	@Then("user ahve to click search button")
	public void user_ahve_to_click_search_button() {
	    System.out.println("Secaniro");
	}
//third scenario
	@Given("to open google.com in google chrome")
	public void to_open_google_com_in_google_chrome() {
urllaunch("https://www.google.co.in/");
	}

	@When("to open KGF movie gun")
	public void to_open_KGF_movie_gun() {
	   Google g = new Google();
	   WebElement searchbar = g.getSearchbar();
	   sendKeys(searchbar, "KGF MOVIE GUNS");
	   WebElement clickSearch = g.getClickSearch();
	   click(clickSearch);
	   
	}

	@Then("take screenshot")
	public void take_screenshot() {
	    System.out.println("take Screenshot");
	}

	




}
