package com.Pom_Concept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	public static WebDriver driver;

	@FindBy(xpath = "//input[@id='username']")
	private WebElement user;

	@FindBy(xpath = "//input[@id='password']")
	private WebElement password;

	@FindBy(xpath = "//input[@name='login']")
	private WebElement click;

	/*public Login_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}*/

   public Login_Page(WebDriver driver) {
	   this.driver = driver; 
	   PageFactory.initElements(driver, this);
	}

	public WebElement getUser() {
		return user;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getClick() {
		return click;
	}

}
