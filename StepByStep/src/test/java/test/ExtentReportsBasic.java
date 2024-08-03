package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

//TestNG reports are not used in realTime as they are not analytical, extent reports are used as they are advanced

public class ExtentReportsBasic {
	
	private static WebDriver driver = null;

	public static void main(String[] args) {
		 // start reporters
		//ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentReports.xtml");
		//^The above code is deprecated from 3.0 , now using 5.12 , instead use below code
		ExtentSparkReporter spark = new ExtentSparkReporter("extentReports.html");
		
		// create ExtentReports and attach reporter(s)
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(spark);
        
        // creates a toggle for the given test, adds all log events under it    
        ExtentTest test1 = extent.createTest("Google Search Test One", "This test to validate google search functionality");
        
        driver = new ChromeDriver();
     // log(Status, details)
        test1.log(Status.INFO, "Starting the TestCase");
       
        driver.get("https://www.google.com");
        test1.pass("Navigating to google.com");
        driver.findElement(By.name("q")).sendKeys("Automation");
        test1.pass("Entered text in the search box");
        driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
        test1.pass("Pressed on Enter");
        driver.close();
        driver.quit();
        test1.pass("Closed the Browser");
        test1.info("Test Completed");
        
        extent.flush(); //DO NOT MISS to add
        
ExtentTest test2 = extent.createTest("Google Search Test Two", "This test to validate google search functionality");
        
        driver = new ChromeDriver();
     // log(Status, details)
        test2.log(Status.INFO, "Starting the TestCase");
       
        driver.get("https://www.google.com");
        test2.pass("Navigating to google.com");
        driver.findElement(By.name("q")).sendKeys("Automation");
        test2.pass("Entered text in the search box");
        driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
        test2.fail("Pressed on Enter");
        driver.close();
        driver.quit();
        test2.pass("Closed the Browser");
        test2.info("Test Completed");
        extent.flush(); //DO NOT MISS to add

	}

}
