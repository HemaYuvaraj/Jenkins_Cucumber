package com.adactin.stepdef;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.Pom_Concept.Book_HotelPage;
import com.Pom_Concept.Booking_Confirmation;
import com.Pom_Concept.Login_Page;
import com.Pom_Concept.Logout;
import com.Pom_Concept.Search_HotelPage;
import com.Pom_Concept.Select_Hotel;
import com.Reusable_Methods.BaseClass;
import com.adactin.runner.Runner;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef extends BaseClass {
	public static WebDriver driver = Runner.driver;
	//public static WebDriver driver1 = browserLaunch();
	public static Login_Page lPage = new Login_Page(driver);
	public static Search_HotelPage sPage = new Search_HotelPage(driver);
	public static Select_Hotel sh = new Select_Hotel(driver);
	public static Book_HotelPage bh = new Book_HotelPage(driver);
	public static Booking_Confirmation bc=new Booking_Confirmation(driver);
	public static Logout lo = new Logout(driver);

	@Given("user Launch The Adactin Application")
	public void user_launch_the_adactin_application() {
		driver.get("https://adactinhotelapp.com/HotelAppBuild2/");
	}

	@When("user Enter The Username in the Username Field")
	public void user_enter_the_username_in_the_username_field() {
		toPassInputValues(lPage.getUser(), "HemaYuvaraj");
	}

	@When("user Enter The Password in the Password Field")
	public void user_enter_the_password_in_the_password_field() {
		toPassInputValues(lPage.getPassword(), "Lohitha@0223");

	}

	@Then("user Click The Login Button And It Navigates To Next Page")
	public void user_click_the_login_button_and_it_navigates_to_next_page() {
		toClickElement(lPage.getClick());
	}

	@When("user Selects The Hotel Location")
	public void user_selects_the_hotel_location() {
		todropDown(sPage.getLocation(), "value", "Sydney");
	}

	@And("user Selects The Hotel From List Of Hotels")
	public void user_selects_the_hotel_from_list_of_hotels() {
		todropDown(sPage.getHotel(), "value", "Hotel Sunshine");

	}

	@And("user Selects The Room Type In The Desired Field")
	public void user_selects_the_room_type_in_the_desired_field() {
		todropDown(sPage.getrType(), "value", "Double");
	}

	@And("user Select The Number Of Rooms In The  Desired Field")
	public void user_select_the_number_of_rooms_in_the_desired_field() {
		todropDown(sPage.getRnos(), "VisibleText", "3 - Three");

	}

	@And("user Selects The Number Of Adults In The Particular Field")
	public void user_selects_the_number_of_adults_in_the_particular_field() {
		todropDown(sPage.getAdults(), "value", "2");
	}

	@And("user Selects The Number Of Children In The Particular Field")
	public void user_selects_the_number_of_children_in_the_particular_field() {
		todropDown(sPage.getChildroom(), "VisibleText", "2 - Two");
	}

	@Then("user Click The Search Button And It Navigates To Check In Page")
	public void user_click_the_search_button_and_it_navigates_to_check_in_page() {
		toClickElement(sPage.getSButton());
	}

	@When("user Checks The Booking details And Click The Radio Button")
	public void user_checks_the_booking_details_and_click_the_radio_button() {
		toClickElement(sh.getRadioButton());
	}

	@Then("user Click Continue Button And It Navigates To Book Hotel Page")
	public void user_click_continue_button_and_it_navigates_to_book_hotel_page() {
		toClickElement(sh.getCButton());
	}

	@When("user Enters The First Name In The Required Field")
	public void user_enters_the_first_name_in_the_required_field() {
		toPassInputValues(bh.getFname(), "HEMA");

	}

	@When("user Enters The Last Name In The Required Field")
	public void user_enters_the_last_name_in_the_required_field() {
		toPassInputValues(bh.getLname(), "YUVARAJ");
	}

	@When("user Enters The Billing Address In The Required Field")
	public void user_enters_the_billing_address_in_the_required_field() {
		toPassInputValues(bh.getAddress(), "NO:2/67, 1 ST MAIN ROAD,RAJIV NAGAR, CHENNAI-600077");
	}

	@When("user Enters The Credit Card Number In The Desired Field")
	public void user_enters_the_credit_card_number_in_the_desired_field() {
		toPassInputValues(bh.getCnum(), "8888555566664444");
	}

	@When("user Selects The Credit Card Type From The Listed Options")
	public void user_selects_the_credit_card_type_from_the_listed_options() {
		todropDown(bh.getCtype(), "VisibleText", "VISA");
	}

	@When("user Selects The Expiry Month and Expiry Year In The Expiry Date Field")
	public void user_selects_the_expiry_month_and_expiry_year_in_the_expiry_date_field() {
		todropDown(bh.getExpMonth(), "Value", "8");
		todropDown(bh.getExpyear(), "VisibleText", "2028");
	}

	@When("user Enters The CVV Number In The Particular Field")
	public void user_enters_the_cvv_number_in_the_particular_field() {
		toPassInputValues(bh.getCvvnum(), "547");
	}

	@Then("user Clicks Book Now Button And It Navigates To Booking Confirmation Page")
	public void user_clicks_book_now_button_and_it_navigates_to_booking_confirmation_page() {
		toClickElement(bh.getBooknow());

	}

	@Then("user Clicks My Itenary Button And It Navigates To Booked Itenary Page")
	public void user_clicks_my_itenary_button_and_it_navigates_to_booked_itenary_page() {
		toClickElement(bc.getItinerary());
		
		
	}

	@Then("user Clicks The Logout Button And Logsout Successfully")
	public void user_clicks_the_logout_button_and_logsout_successfully() throws IOException  {
		//toGetScreenshots();
		toClickElement(lo.getLogout());
	}

}
