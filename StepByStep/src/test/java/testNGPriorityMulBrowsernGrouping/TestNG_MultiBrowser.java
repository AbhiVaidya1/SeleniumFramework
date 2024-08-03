package testNGPriorityMulBrowsernGrouping;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG_MultiBrowser {
	WebDriver driver = null;

	@Parameters("browserName")
	@BeforeTest
	public void setup(String browserName) {
		System.out.println("Browser Name is: " + browserName);
		System.out.println("Thread id: "+Thread.currentThread().getId());

		if (browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		} else if (browserName.equalsIgnoreCase("firefox"))
			driver = new FirefoxDriver();
	}

	@Test
	public void test1() {
		driver.get("https://www.google.com");
	}

	@Test
	public void teardown() {
		driver.close();
		System.out.println("Test completed successfully");
	}
}
