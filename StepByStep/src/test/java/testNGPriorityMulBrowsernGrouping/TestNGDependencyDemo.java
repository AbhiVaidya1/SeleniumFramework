package testNGPriorityMulBrowsernGrouping;

import org.testng.annotations.Test;

public class TestNGDependencyDemo {

	@Test(dependsOnMethods = {"test2"}, priority=1)
	public void test1() {
System.out.println("I m inside Test 1");
	}

	@Test(priority=2)//****IMPORTANT, Even though priority for test1 is 1, since it depends on test2, test2 will run first*****!
	public void test2() {
System.out.println("I m inside Test 2");
	}
	
	@Test(dependsOnMethods = {"test1","test2"}, priority=0)//multiple tests also can be provided for dependency
	public void test3() {
		System.out.println("I m inside Test 3");
			}

	@Test(groups= {"sanity1"})
	public void test4() {
		System.out.println("I m inside Test 4");
			}
	@Test(groups= {"regression1"})
	public void test5() {
		System.out.println("I m inside Test 5");
			}
	
	@Test(dependsOnGroups = {"sanity"}) //Dependency can also be set on groups
	public void test6(){
		System.out.println("I m inside Test 6");
	}



}
