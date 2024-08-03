package test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//************* Need to check AGAIN, Unable to execute
public class AutoITDemo {

	public static void main(String[] args) throws Exception, InterruptedException { 
		test();
	}
	
	public static void test() throws IOException, InterruptedException {
		 ChromeOptions options = new ChromeOptions();
	        options.addArguments("user-data-dir=E:\\Study\\Udemy\\From AutomationStepbyStep-Raghav\\AutoIT\\FileforAUTOIT.jpg");
		WebDriver driver = new ChromeDriver(options);
		Thread.sleep(2000);
		driver.get("https://www.sendspace.com/");
		
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//input[@id='upload_file']")).click();
		//Runtime.getRuntime().exec("E:/Study/Udemy/From AutomationStepbyStep-Raghav/AutoIT/FileUploadScriptAutoIT.exe"); 
		/*
		 * ProcessBuilder processBuilder = new
		 * ProcessBuilder("E:/Study/Udemy/From AutomationStepbyStep-Raghav/AutoIT/FileUploadScriptAutoIT.exe"
		 * ); processBuilder.start(); Thread.sleep(4000);
		 */
		//driver.close();
		
		
	}
}
