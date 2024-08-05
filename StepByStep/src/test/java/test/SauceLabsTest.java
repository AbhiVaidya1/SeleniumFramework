package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Example of running a TestNG test without using Sauce Bindings.
 */
public class SauceLabsTest {
    protected RemoteWebDriver driver;

    @BeforeMethod
    public void setup(Method method) throws MalformedURLException {
        MutableCapabilities sauceOptions = new MutableCapabilities();
        sauceOptions.setCapability("username", System.getenv("oauth-vaidyaabhi20-81ae1"));
        sauceOptions.setCapability("access_key", System.getenv("51b1c73d-1f5d-4c27-aca6-c49d9a6cd5a8"));
        sauceOptions.setCapability("name", method.getName());
        sauceOptions.setCapability("browserVersion", "latest");

        ChromeOptions options = new ChromeOptions();
        options.setCapability("sauce:options", sauceOptions);
        @SuppressWarnings("deprecation")
		URL url = new URL("https://ondemand.us-west-1.saucelabs.com/wd/hub");

        driver = new RemoteWebDriver(url, options);
        //driver = new ChromeDriver();
    }

    @Test
    public void correctTitle() {
    	driver.navigate().to("https://www.google.com");
    	System.out.println(driver.getTitle());
    	driver.findElement(By.name("btnK")).sendKeys("Automation Test");
    	driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
    	driver.navigate().to("https://www.saucedemo.com");
        Assert.assertEquals("Swag Labs", driver.getTitle());
    }

    @AfterMethod
    public void teardown(ITestResult result) {
        String status = result.isSuccess() ? "passed" : "failed";
        driver.executeScript("sauce:job-result=" + status);
        System.out.println("Test Completed");
    }
}