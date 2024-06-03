package com.Pom_Concept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_Confirmation {

	public static WebDriver driver;
	@FindBy(xpath = "//input[@value='My Itinerary']")
	private WebElement Itinerary;

	public Booking_Confirmation(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getItinerary() {
		return Itinerary;
	}

}
