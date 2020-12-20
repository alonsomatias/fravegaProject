package com.fravega.testng;

import org.testng.annotations.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchTest {

	WebDriver driver;
	
	private String urlHome = "http://www.fravega.com";
	private String searchBoxXpath = "//input[contains(@class,'SearchInput')]";
	
	private By searchBoxLocator = By.xpath(searchBoxXpath);
	
	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(urlHome);
	}
	
	@Test
	public void seartchRefrigerator() {
		String searchItem = "Heladera";
		WebElement searchBoxElement = driver.findElement(searchBoxLocator);
		searchBoxElement.clear();
		searchBoxElement.sendKeys(searchItem);
		searchBoxElement.submit();
	}

}
