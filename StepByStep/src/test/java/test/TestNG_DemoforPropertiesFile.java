package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import config.PropertiesFileDemo;

//Step1: Add TestNG plugin in Eclipse
//Step2: Add TestNG libraries
//Step3: Validate

public class TestNG_DemoforPropertiesFile {


	 WebDriver driver = null;
	 public static String browserName = null;
	 
	@BeforeTest
	public void setUpTest() {
		
		PropertiesFileDemo.getProperties();
		
		if(browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
	}
	
	@Test
	public void googleSearch()
	{
		
		driver.get("https://www.google.com");
		
		driver.findElement(By.name("q")).sendKeys("Hello Google");
		
		//driver.findElement(By.name("btnK")).click(); //instead of using click button on google search, after entering, hit Enter button
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		
		
	}
	
	@AfterTest
	public void tearDownTest() {
		//close browser
		driver.close();
		//driver.quit();
		System.out.println("Test completed successfully");
	}

}
