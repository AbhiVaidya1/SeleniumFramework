package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessChromeTest {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless"); //Initiates headless chrome browser
		options.addArguments("window-size=1280,800");//mentioning window size
		
		WebDriver driver = new ChromeDriver(options);
				
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		
		driver.findElement(By.name("q")).sendKeys("Automation");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		
		driver.close();
		System.out.println("Test Completed");
		
		
		
	}

}
