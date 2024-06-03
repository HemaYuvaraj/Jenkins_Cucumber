package com.Pom_Concept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel {
	public static WebDriver driver;

	@FindBy(xpath = "//input[@type='radio']")
	private WebElement radioButton;

	@FindBy(xpath = "//input[@name='continue']")
	private WebElement CButton;

	public Select_Hotel(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getRadioButton() {
		return radioButton;
	}

	public WebElement getCButton() {
		return CButton;
	}

}
