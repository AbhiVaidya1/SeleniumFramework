package testNGPriorityMulBrowsernGrouping;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParametersDemo {

	@Test
	@Parameters({"MyName"})
	public void test(String name)
	{
		System.out.println("Name is: "+name);
	}
////	@Parameters annotation can be placed on any method that already has following annotations
//	@Test
//	@Before/After
//	@Factory
}
