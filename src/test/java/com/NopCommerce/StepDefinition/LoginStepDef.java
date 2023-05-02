package com.NopCommerce.StepDefinition;

import org.openqa.selenium.chrome.ChromeDriver;

import com.NopCommerce.PageObject.LoginPage;

import io.cucumber.java.en.*;

public class LoginStepDef extends BaseClass{

	@Given("user launch the chrome browser")
	public void user_launch_the_chrome_browser() {
	    System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		driver = new ChromeDriver();
		lp = new LoginPage(driver);
	}

	@When("User opens URL {string}")
	public void user_opens_url(String string) {
	    driver.get(string);
	}

	@And("User enters email as {string} and password as {string}")
	public void user_enters_email_as_and_password_as(String string, String string2) {
	    lp.email(string);
	    lp.password(string2);
	}

	@Then("Click on the login button")
	public void click_on_the_login_button() {
	    lp.loginbtn();
	}

	
}
