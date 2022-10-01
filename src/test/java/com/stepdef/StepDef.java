package com.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Runnerclass.Runner_Class;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef {
	public static WebDriver driver = Runner_Class.driver;

	@Given("^user launches the application$")
	public void user_launches_the_application() throws Throwable {

		driver.get("https://www.facebook.com/");

	}

	@When("^user enter the username in the username field$")
	public void user_enter_the_username_in_the_username_field() throws Throwable {

		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("nithya@gmail.com");

	}

	@When("^user enter the password in the password field$")
	public void user_enter_the_password_in_the_password_field() throws Throwable {
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("neethukutty123");
	}

	@Then("^user clicks on the login button and it navigates to the homepage$")
	public void user_clicks_on_the_login_button_and_it_navigates_to_the_homepage() throws Throwable {
		
		Thread.sleep(4000);
		WebElement Login = driver.findElement(By.name("login"));
		Login.click();

	}

}
