package com.cucumber.mavenCucumberProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {

	WebDriver driver;

	@Given("^I am on the zoo site$")
	public void I_am_on_the_zoo_site() throws Throwable {
		driver = new FirefoxDriver();
		driver.navigate().to("http://www.thetestroom.com/webapp/");
	}

	@When("^i click on \"([^\"]*)\"$")
	public void i_click_on(String link) throws Throwable {
		driver.findElement(By.id(link.toLowerCase() + "_link")).click();
	}

	@Then("^I set the dropdown to \"([^\"]*)\"$")
	public void I_set_the_dropdown_to(String dropdown) throws Throwable {
		Select dropDown = new Select(driver.findElement(By.id("start_select")));
		dropDown.selectByVisibleText(dropdown);
	}

	@Then("^I close browser$")
	public void I_close_browser() throws Throwable {
		driver.quit();
	}

	@Then("^I set the radio to \"([^\"]*)\"$")
	public void I_set_the_radio_to(String radio) throws Throwable {
		driver.findElement(By.name("name_field")).sendKeys("Sanket Paropate");
		driver.findElement(By.id("rdona")).click();
		driver.findElement(By.id("cadop")).click();
		// driver.findElement(By.name("address_field")).sendKeys("19 Streetman Cir");
		// driver.findElement(By.name("postcode_field")).sendKeys("75253");
		// driver.findElement(By.name("email_field")).sendKeys("sanket.paropate@gmail.com");
		// driver.findElement(By.id("submit_message")).click();
	}
}