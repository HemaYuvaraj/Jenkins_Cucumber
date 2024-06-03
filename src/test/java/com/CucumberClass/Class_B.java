package com.CucumberClass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.Pom_Concept.Book_HotelPage;
import com.Pom_Concept.Booking_Confirmation;
import com.Pom_Concept.Login_Page;
import com.Pom_Concept.Logout;
import com.Pom_Concept.Search_HotelPage;
import com.Pom_Concept.Select_Hotel;
import com.Reusable_Methods.BaseClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Class_B extends BaseClass {

	public static WebDriver driver = browserLaunch();
	public static Login_Page lPage = new Login_Page(driver);
	public static Search_HotelPage sPage = new Search_HotelPage(driver);
	public static Select_Hotel sh = new Select_Hotel(driver);
	public static Book_HotelPage bh = new Book_HotelPage(driver);
	public static Booking_Confirmation bc = new Booking_Confirmation(driver);
	public static Logout lo = new Logout(driver);

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		driver.get("https://adactinhotelapp.com/");
		toPassInputValues(lPage.getUser(), "HemaYuvaraj");
		toPassInputValues(lPage.getPassword(), "Lohitha@0223");
		toClickElement(lPage.getClick());
		todropDown(sPage.getLocation(), "value", "Sydney");
		todropDown(sPage.getHotel(), "value", "Hotel Sunshine");
		todropDown(sPage.getrType(), "value", "Double");
		todropDown(sPage.getRnos(), "VisibleText", "3 - Three");
		todropDown(sPage.getAdults(), "value", "2");
		todropDown(sPage.getChildroom(), "VisibleText", "2 - Two");
		toClickElement(sPage.getSButton());
		toClickElement(sh.getRadioButton());
		toClickElement(sh.getCButton());
		toPassInputValues(bh.getFname(), "HEMA");
		toPassInputValues(bh.getLname(), "YUVARAJ");
		toPassInputValues(bh.getAddress(), "NO:2/67, 1 ST MAIN ROAD,RAJIV NAGAR, CHENNAI-600077");
		toPassInputValues(bh.getCnum(), "8888555566664444");
		todropDown(bh.getCtype(), "VisibleText", "VISA");
		todropDown(bh.getExpMonth(), "Value", "8");
		todropDown(bh.getExpyear(), "VisibleText", "2028");
		toPassInputValues(bh.getCvvnum(), "547");
		toClickElement(bh.getBooknow());
		browserWait();
		toClickElement(bc.getItinerary());
		toGetScreenshots();
		toClickElement(lo.getLogout());
	}
}
