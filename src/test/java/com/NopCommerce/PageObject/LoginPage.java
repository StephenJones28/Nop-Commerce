package com.NopCommerce.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver) {
	 this.ldriver = rdriver;
	 PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(id="Email")
	WebElement emaillook;
	
	@FindBy(id="Password")
	WebElement passwordlook;
	
	@FindBy(id="RememberMe")
	WebElement remelook;
	
	@FindBy(xpath = "/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button")
	WebElement loginbtnlook;
	
	public void email(String mail) {
		emaillook.clear();
		emaillook.sendKeys(mail);
	}
	
	public void password(String psw) {
		passwordlook.clear();
		passwordlook.sendKeys(psw);
	}
	
	public void reme() {
		remelook.click();
	}
	
	public void loginbtn() {
		loginbtnlook.click();
	}
	
}
