import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabilities1 {

	public static void main(String[] args) {
		
//		DesiredCapabilities caps = new DesiredCapabilities();
//		caps.setAcceptInsecureCerts(true); //Connection not secure/private for some of the applications, we manually select connect anyway but here we use SetAcceptInsecureCerts as true.
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
//		options.merge(caps); //to merge capabilities with options
		WebDriver driver = new ChromeDriver(options); //DesiredCapabilities is deprecated for Chrome browser,  instead we use ChromeOptions
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("ABCD");
		driver.findElement(By.name("btnK")).sendKeys(Keys.ENTER);
		
		driver.close();
	}

}
