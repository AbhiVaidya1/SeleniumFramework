package testNGPriorityMulBrowsernGrouping;

import org.testng.annotations.Test;

public class TestNGPriorityDemo {

	@Test
	public void one() {
		System.out.println("I'm inside Test 1");

	}

	@Test (priority = 1) //When methods have same priority, then test runs in alphabetical order
	public void two() {
		System.out.println("I'm inside Test 2");
	}

	@Test(priority = 2) //Based on the priority, the lower priority test runs like -1,0,1,2....
	public void three() {
		System.out.println("I'm inside Test 3");
	}	
	//If priority is not given for any of the methods, it runs in alphabetical order
    //If class has both prioritized and non-prioritized methods, then it 1st runs non-prioritized methods and then prioritized ones
}
