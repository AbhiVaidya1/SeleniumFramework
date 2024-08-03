package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportsWithTestNG {
	
	ExtentSparkReporter spark;
	ExtentReports extent; 
	WebDriver driver;
	
	@BeforeSuite
	public void setUp() {
		spark = new ExtentSparkReporter("extentReports2.html");
		// create ExtentReports and attach reporter(s)
        extent = new ExtentReports();
        extent.attachReporter(spark);
        driver = new ChromeDriver();
	}
	
	@Test
	public void test1() throws Exception {
		 ExtentTest test1 = extent.createTest("Google Search Test One", "This test to validate google search functionality");
		// log(Status, details)
	        test1.log(Status.INFO, "This step shows usage of log(status, details)");

	        // info(details)
	        test1.info("This step shows usage of info(details)");
	        
	        // log with snapshot
	        test1.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
	        
	        // test with snapshot
	        test1.addScreenCaptureFromPath("screenshot.png");
//	        WebDriver driver = new ChromeDriver();
//	        driver.get("https://www.google.com");
	}
	@Test
	public void test2() throws Exception {
		 ExtentTest test1 = extent.createTest("Google Search Test Two", "This test to validate google search functionality");
		 driver.get("https://www.google.com");
		 test1.pass("Navigated to google");
		 // log(Status, details)
	        test1.log(Status.INFO, "This step shows usage of log(status, details)");

	        // info(details)
	        test1.info("This step shows usage of info(details)");
	        
	        // log with snapshot
	        test1.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
	        
	        // test with snapshot
	        test1.addScreenCaptureFromPath("screenshot.png");
//	        WebDriver driver = new ChromeDriver();
//	        driver.get("https://www.google.com");
	}
	
	@AfterSuite
	public void tearDown() {
		extent.flush(); //DO NOT MISS to add
	}
}
