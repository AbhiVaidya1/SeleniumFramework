package demo;

public class ExceptionHandlingDemo {

	public static void main(String[] args) throws Exception {
		
	demo();	
	demo2();
		
	}

	public static void demo() {
		try {
			System.out.println("Hello World");
			int i=1/0;		//Since not a valid statement, its handled by the exception, later lines are not executed	
			System.out.println("Completed");
		}
		catch(Exception exp)
		{
			System.out.println("Iam inside Catch block");
			System.out.println("Message is: "+exp.getMessage());
			System.out.println("Cause is: "+exp.getCause());
		}
		finally {
			System.out.println("I am inside finally block");
		}
		//There should not be any line between try and catch/finally block
		//Also, instead of using try and catch, "throws Exception" can be entered beside demo method
		
	}
	public static void demo2() throws Exception{
		System.out.println("Hello World 2");
		throw new ArithmeticException("NOT A valid operation");
		
		//try catch blocks can be used in selenium project in all the test functions/methods
		//for ex: if any element is not found we can use try catch blocks
		
	}
}
