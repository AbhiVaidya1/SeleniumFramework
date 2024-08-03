package test;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleSearchPage;

public class GoogleSearchTest {
	
	static WebDriver driver = null;

	public static void main(String[] args) {
		
		googleSearch();
	}
	
	public static void googleSearch()
	{
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		//driver.findElement(By.name("q")).sendKeys("Hello World");
		
		GoogleSearchPage.textbox_search(driver).sendKeys("Hello World"); //getting elements from GoogleSearchPage class
		
		//driver.findElement(By.name("btnK")).click(); //instead of using click button on google search, after entering, hit Enter button
		//driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		
		GoogleSearchPage.button_Search(driver).sendKeys(Keys.RETURN);
		
		System.out.println("Test completed successfully");
	}

}
