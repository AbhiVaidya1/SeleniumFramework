package testNGPriorityMulBrowsernGrouping;

import org.testng.Assert;
import org.testng.annotations.Test;

//If Test kept for run fails due to any issues like server down, application down
//File will be generated in test-output folder with the name testng-failed.xml
//Run that testng xml file, we can run only failed tests
public class TestNGRetryFailedDemo {

	@Test
	public void test1() {
		System.out.println("I am inside Test 1");
	}

	@Test
	public void test2() {
		System.out.println("I am inside Test 2");
		//int i = 1/0;
	}

	@Test(retryAnalyzer = testNGPriorityMulBrowsernGrouping.RetryAnalyzer.class) //Create class RetryAnalyzer with code copied from TestNG website for IRetryAnalyzer 
	//provide that class in the above Test Annotation like packageName.className.class
	public void test3() {
		System.out.println("I am inside Test 3");
		Assert.assertTrue(0>1);
	}
	
	
}
