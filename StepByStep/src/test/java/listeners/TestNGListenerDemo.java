package listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
//How to use TestNG Listeners
//Step1: Create new package and new class
//Step2: Implement ItestListner interface, public class TestNGListener implements ITestListener
//Step3: Add unimplemented methods of ITestListener interface
//Step4: Create a Demo class and provide annotation,@Listeners(packageName.ClassName)

@Listeners(listeners.TestNGListeners.class)
public class TestNGListenerDemo {
	
	@Test
	public void test1() {
		System.out.println("I'm inside Test1");
	}
	
	@Test
	public void test2() {
		System.out.println("I'm inside Test2");
		//Assert.assertTrue(false);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("abc");
		driver.findElement(By.name("abc")).sendKeys("abc");
	}
	
	@Test
	public void test3() {
		System.out.println("I'm inside Test3");
		throw new SkipException("This test is skipped");
	}
}
