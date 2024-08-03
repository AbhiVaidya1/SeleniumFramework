package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

//How to Implement POM in Selenium Java

//Step 1. Create a class for each Web page
//Step 2. Add Object locators
//Step 3. Add action methods
//Step 4. Create class for test case
//Step 5. Create Object for page class
//Step 6.Refer action methods

public class GoogleSearchPageObjects {
	
	WebDriver driver = null;
	
	By textbox_search = By.name("q");
	By button_search = By.name("btnK");
	
	public GoogleSearchPageObjects(WebDriver driver) {
		//^costructor created,TO make java understand, this driver is used in the test class
		this.driver = driver;
	}
	
	public void setTextInSearchBox(String text) {
		driver.findElement(textbox_search).sendKeys(text);
	}
	
	public void clickSearchButton() {
		driver.findElement(button_search).sendKeys(Keys.RETURN);
	}

}
