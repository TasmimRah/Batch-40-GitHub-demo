package com.StepDef;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.generic.DriverManager;
import com.pagefactory.MasterPageFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
	WebDriver driver;
	DriverManager dm;
	MasterPageFactory mpf;
	@Given("open the browser")
	public void open_the_browser() {
		DriverManager dm = new DriverManager();
	    driver = dm.getChromeDriver();
	
	}

	@Given("pass the URL")
	public void pass_the_url(String URL) {
	    driver.navigate().to(URL);
	   
	
	}
	@When("Click on sign in button in homepage")
	public void click_on_sign_in_button_in_homepage() {
		mpf = new MasterPageFactory(driver);
		mpf.getSignin_homepage().click();
	}

	@When("enter the email in the email field")
	public void enter_the_email_in_the_email_field(String email) {
	
	mpf.getEmail().sendKeys(email);

	
	}

	@When("enter the password in the password field")
	public void enter_the_password_in_the_password_field( String password ) {
	    mpf.getPassword().sendKeys(password);
	
	}

	@When("click on the login button")
	public void click_on_the_login_button() {
	    
mpf.getLogin().click();
	}

	@Then("validate that login is successful")
	public void validate_that_login_is_successful() {
	    Assert.assertTrue(mpf.getLogout().isDisplayed(), "login successful");
	
	}
	@Given("pass the URL {string}")
	public void pass_url(String URL) {
		driver.navigate().to(URL);
	   
	   
	}

	@When("click on sign in button in home page")
	public void click_on_sign_in_button_in_home_page() {
		mpf = new MasterPageFactory(driver);
	   mpf.getSignin_homepage().click();
	}

	@When("pass the email on email field {string}")
	public void pass_the_email_on_email_field(String email) {
	   
	   mpf.getEmail().sendKeys(email);
	}

	@When("pass the password in the password field {string}")
	public void pass_the_password_in_the_password_field(String password) {
	   
	mpf.getPassword().sendKeys(password);
	}

	@When("click on login button")
	public void click_on_login_button() {
	   mpf.getLogin().click();
	   
	}
	@When("click on log out button")
	public void click_on_log_out_button() { 
		mpf.getLogout().click();
	    
	 
	}

	@Then("validate log out is successful")
	public void validate_log_out_is_successful() {
	    Assert.assertTrue(mpf.getSignin_homepage().isDisplayed(), "logout successful!");
	 
	}


}
