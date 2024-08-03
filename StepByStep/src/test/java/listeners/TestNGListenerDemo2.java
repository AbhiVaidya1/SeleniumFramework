package listeners;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
//How to use at Suite Level (multiple classes)
//Step1: Create testng.xml file by converting the respective class to TestNG from rightclick options on class
//Step2: Define Listeners in testng.xml file, <listeners><listener class-name="packageName.className"/></listeners>


@Listeners(listeners.TestNGListeners.class)
public class TestNGListenerDemo2 {
	
	@Test
	public void test4() {
		System.out.println("I'm inside Test4");
	}
	
	@Test
	public void test5() {
		System.out.println("I'm inside Test5");
		
	}
	
	@Test
	public void test6() {
		System.out.println("I'm inside Test6");
		throw new SkipException("This test is skipped");
	}
}
