package com.inetBanking.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	@FindBy(id = "email")
	WebElement emaill;

	@FindBy(xpath = "//input[@id='pass']")
	WebElement password;

	@FindBy(how = How.XPATH, using = "//button[@name='login']")
	WebElement Login;

	// Type 1:-
	/*
	 * By email = By.id("email"); By password = By.id("pass"); By Login =
	 * By.name("login");
	 */
	public void enterEmail(String value) {

		emaill.sendKeys(value);

//Type 1:-		// Constants.driver.findElement(email).sendKeys(value);
	}

	public void enterPass(String passwd) {

		password.sendKeys(passwd);
// Type 1:-    // Constants.driver.findElement(password).sendKeys(passwd);

	}

	public void clickOnLogin() {

		Login.click();
//Type 1:-		// Constants.driver.findElement(Login).click();

	}

}
