package com.Reusable_Methods;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;

	public static WebDriver browserLaunch() {
		WebDriverManager.chromedriver().setup();
		return driver = new ChromeDriver();

	}

	public static void browserClose() {
		driver.close();

	}

	public static void browserWait() {
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);

	}

	public static void toMaximize() {
		driver.manage().window().maximize();

	}

	public static void toPassInputValues(WebElement element, String Input) {
		element.sendKeys(Input);
	}

	public static void toGetScreenshots() throws IOException {
		TakesScreenshot tshot = (TakesScreenshot)driver;
		File src = tshot.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\KISHORE\\OneDrive\\Desktop\\HEMA\\Cucumber_Project\\ScreenShots\\Name.png");
		FileUtils.copyFile(src, dest);

	}

	public static void toClickElement(WebElement element) {
		element.click();

	}

	public static void toNavigateUrl(String url) {
		driver.get(url);
	}

	public static void toGetTitle(String title) {
		driver.getTitle();

	}

	public static void toNavigateBack() {
		driver.navigate().back();
	}

	public static void toRefresh() {
		driver.navigate().refresh();
	}

	public static void todropDown(WebElement element, String options, String value) {
		try {

			Select sc = new Select(element);
			if (options.equalsIgnoreCase("value")) {
				sc.selectByValue(value);
			} else if (options.equalsIgnoreCase("visibletext")) {
				sc.selectByVisibleText(value);
			} else if (options.equalsIgnoreCase("index")) {
				sc.selectByIndex(Integer.parseInt(value));
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();

		}
	}

}
