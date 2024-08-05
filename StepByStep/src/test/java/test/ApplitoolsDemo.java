package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.applitools.eyes.EyesException;
import com.applitools.eyes.RectangleSize;
import com.applitools.eyes.selenium.Eyes;

public class ApplitoolsDemo {

	public static void main(String[] args) throws EyesException,Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		// Initialize the eyes SDK and set private key
		Eyes eyes = new Eyes();
		eyes.setApiKey("rxhb1cC2le6BamIhrGA1013YKhyZIoOzPoO0fcya105T4sI110");
		try {
			//start the test and set the browser viewport to 800*600//not allowing now
			eyes.open(driver,"GoogleApp","First Test",
					new RectangleSize(800,600));
			//in the above line GoogleApp is the appname to be tested, test name and window size
			driver.get("https://www.google.com");
			
			// Visual Checkpoint #1, check1 is just the name given to the checkpoint
			eyes.checkWindow("check1");
			//driver.findElement(By.id("hplogo")).click();
			driver.findElement(By.linkText("Store")).click();
			
			Thread.sleep(5000);
			// Visual Checkpoint #2 Google is just the name given to the checkpoint
			eyes.checkWindow("Google");
			driver.navigate().back();
			//driver.findElement(By.id("hplogo")).click();
			//driver.findElement(By.name("q")).sendKeys("Applitools");
			
			
			// ends the test
			eyes.close();
		} finally {
			driver.quit();
			//If the test is aborted before eyes.closed was called, ends the test as aborted
			eyes.abortIfNotClosed();
		}

	}
	//In the existing codetest we can use applitools by just initializing the SDK

}
