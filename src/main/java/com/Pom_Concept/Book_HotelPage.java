package com.Pom_Concept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_HotelPage {
	
	public static WebDriver driver;
	
	@FindBy(xpath = "//input[@name='first_name']")
	private WebElement Fname;
	
	@FindBy(xpath ="//input[@name='last_name']" )
	private WebElement Lname;
	
	@FindBy(xpath="//textarea[@name='address']")
	private WebElement Address;
	
	@FindBy(xpath="//input[@name='cc_num']")
	private WebElement Cnum;
	
	@FindBy(xpath = "//select[@name='cc_type']")
	private WebElement Ctype;
	
	@FindBy(xpath ="//select[@name='cc_exp_month']" )
	private WebElement ExpMonth;
	
	@FindBy(xpath = "//select[@name='cc_exp_year']")
	private WebElement Expyear;
	
	@FindBy(xpath = "//input[@name='cc_cvv']")
	private WebElement Cvvnum;
	
	@FindBy(xpath="//input[@name='book_now']")
	private WebElement booknow;
	
	public Book_HotelPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
	}

	public WebElement getFname() {
		return Fname;
	}

	public WebElement getLname() {
		return Lname;
	}

	public WebElement getAddress() {
		return Address;
	}

	public WebElement getCnum() {
		return Cnum;
	}

	public WebElement getCtype() {
		return Ctype;
	}

	public WebElement getExpMonth() {
		return ExpMonth;
	}

	public WebElement getExpyear() {
		return Expyear;
	}

	public WebElement getCvvnum() {
		return Cvvnum;
	}

	public WebElement getBooknow() {
		return booknow;
	}
	
	
	
		

}
