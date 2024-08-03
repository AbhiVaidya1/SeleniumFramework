package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import test.TestNG_DemoforPropertiesFile;

/*For getting a value from the properties file*/
//Step1: Create Object of class Properties class, Properties prop = new Properties();
//Step2: Create Object of class InputStream, InputStream input = new FileInputStream("location of properties file");
//Step3: Load Properties file, prop.load(input)

public class PropertiesFileDemo {

	public static void main(String[] args) {
		getProperties();//gets the value from properties file as "edge"
		setProperties();//sets the value to properties file as "chrome"
		getProperties();//gets the updated value i.e., "chrome" 
	}
	
	public static void getProperties() { //gets the properties from Proerties file (ex: config.properties)
	
		try {
			Properties prop = new Properties();
			//String projectPath=System.getProperty("user.dir");
			InputStream input = new FileInputStream("E:\\Study\\WorkSpace_Eclipse\\StepByStep\\src\\test\\java\\config\\config.properties");
			prop.load(input);
			String browser = prop.getProperty("browser");
			System.out.println(browser);
			TestNG_DemoforPropertiesFile.browserName=browser; //whatever is stored in the browser value, will be used in TestNGDemoforProperties class, based on that, the corresponding browser will open
		}
		catch(Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		
	}
	
	/*For setting a value into the properties file*/
	//Step1: Create Object of class Properties class, Properties prop = new Properties();
	//Step2: Create Object of class OutputStream, OutputStream input = new FileOutputStream("location of properties file");
	//Step3: Set values, prop.setProperty("result", "pass")	
	//Step4: Store values in property file
	
	public static void setProperties() { //sets the value
		
		try {
			Properties prop = new Properties(); //this can also be initialized globally as its being used in above method also.
			OutputStream output = new FileOutputStream("E:\\Study\\WorkSpace_Eclipse\\StepByStep\\src\\test\\java\\config\\config.properties");
			prop.setProperty("browser", "chrome");
			prop.store(output, null);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		
		
	}

}
