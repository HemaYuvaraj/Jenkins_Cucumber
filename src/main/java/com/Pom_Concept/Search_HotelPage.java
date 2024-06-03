package com.Pom_Concept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_HotelPage {
	public static WebDriver driver;
	
	
	
	@FindBy(xpath = "//select[@name='location']")
	private WebElement location;
	
	@FindBy(xpath = "//select[@name='hotels']")
	private WebElement hotel;
	
	@FindBy(xpath = "//select[@name='room_type']")
	private WebElement rType;
	
	@FindBy(xpath = "//select[@id='room_nos']")
	private WebElement Rnos;
	
	@FindBy(xpath="(//select[@class='search_combobox'])[5]")
	private WebElement Adults;
	
	@FindBy(xpath = "//select[@name='child_room']")
	private WebElement Childroom;
	
	@FindBy(xpath = "//input[@value='Search']")
	private WebElement SButton;
	
	public Search_HotelPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getrType() {
		return rType;
	}

	public WebElement getRnos() {
		return Rnos;
	}

	public WebElement getAdults() {
		return Adults;
	}

	public WebElement getChildroom() {
		return Childroom;
	}

	public WebElement getSButton() {
		return SButton;
	}

	

}
