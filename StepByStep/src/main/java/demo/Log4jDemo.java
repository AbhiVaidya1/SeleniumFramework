package demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//log4j can be used either by creating xml file or .properties file or JSON or YAML

//Step1: Add Log4j libraries to the project or add maven dependencies
//Step2: Create a reference for Logger in the class i.e, class where you want to add log statements
//Step3: Create log4j.xml or log4j.properties file, log4j2.properties file should be created in resources
//Step4: Run the test, Logs folder will be created in the project with propertieslogs.log file

public class Log4jDemo {
	
	private static Logger logger = LogManager.getLogger(Log4jDemo.class);

	public static void main(String[] args) {
		
		System.out.println("\n  Hello World... \n");
		logger.trace("This is trace message"); // To get the Trace message, we should replace level value from 'debug' to 'trace'
		logger.info("This is information message");
		logger.error("This is an error message");
		logger.warn("This is warning message");
		logger.fatal("This is a fatal message");
		
		System.out.println("\n Completed");
		
		//above output gives only 2 logs (i.e., ERROR and FATAL), info and warn are not displayed, log4j2.properties file should be created in resources package
		//everytime we run the test, new logs will be displayed, add a line in log4j2 file "appender.file.append=true" appended inthe properties file
		//We can also make logs off by replacing level value debug/trace value with 'off'
	}

}
