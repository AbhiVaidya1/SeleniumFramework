package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1_GoogleSearch {

	public static void main(String[] args) {
		
		googleSearch();
	}
	
	public static void googleSearch()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Hello Google");
		//driver.findElement(By.name("btnK")).click(); //instead of using click button on google search, after entering, hit Enter button
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		
		System.out.println("Test completed successfully");
	}

}
