package testNGPriorityMulBrowsernGrouping;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {

	  private int retryCount = 0;
	  private static final int maxRetryCount = 3; // it runs the failed test 3 times

	  @Override
	  public boolean retry(ITestResult result) {
	    if (retryCount < maxRetryCount) {
	      retryCount++;
	      return true;
	    }
	    return false;
	  }
	}