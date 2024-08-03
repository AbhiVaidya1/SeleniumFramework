import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTest {

	public static void main(String[] args) {
		//WebDriverManager.chromedriver().driverVersion("2.36").setup(); //to open in specific driver version	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Hello World");
		List<WebElement> listOfInputs=driver.findElements(By.xpath("//input"));
		int count = listOfInputs.size();
		System.out.println("count of Input Elements: "+count);
		
//		driver.close();
//		driver.quit();
		
	}

}
