package testNGPriorityMulBrowsernGrouping;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

//@Ignore //At class level also we can ignore test run
public class TestNGIgnoreDemo {

	@Test
	@Ignore // this test method will be ignored
	public void test1() {
		System.out.println("I am inside Test 1");
	}
	
	@Test
	public void test2() {
		System.out.println("I am inside Test2");
	//Whole package also can be ignored
		//Step1: Right-click on test/java package, create a same package from which the tests should be ignored
		//Step2: For Ex: testNGPrio.... while creating the package check the checkbox Create package-info.java
		//Step3:open the package-info.java, add 1st line as @Ignore and import the package
		//Step4: Now, try to run any of the class under package testNGPrio...
		//Step5: All the tests are ignored
	}
}
