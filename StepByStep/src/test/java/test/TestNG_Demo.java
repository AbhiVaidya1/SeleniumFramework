package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//Step1: Add TestNG plugin in Eclipse
//Step2: Add TestNG libraries
//Step3: Validate

public class TestNG_Demo {

 //	public static void main(String[] args) { //MAIN METHOD NOT REQUIRED IN TESTNG
//		
//		googleSearch();
//	}
	 WebDriver driver = null;
	@BeforeTest
	public void setUpTest() {
		driver = new ChromeDriver();
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
		driver.quit();
		System.out.println("Test completed successfully");
	}

}
