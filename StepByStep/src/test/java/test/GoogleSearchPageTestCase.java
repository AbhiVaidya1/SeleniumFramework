package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleSearchPageObjects;

public class GoogleSearchPageTestCase {

	private static WebDriver driver = null;

	public static void main(String[] args) {
		googleSearchTest();
		
	}

	public static void googleSearchTest()
	{
		driver = new ChromeDriver();
		GoogleSearchPageObjects searchPageObj = new GoogleSearchPageObjects(driver);
		driver.get("https://google.com");
		
		searchPageObj.setTextInSearchBox("A B C D");
		
		searchPageObj.clickSearchButton();
		
		driver.close();
	}
}
