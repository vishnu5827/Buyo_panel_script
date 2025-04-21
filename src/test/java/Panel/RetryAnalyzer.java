package Panel;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {
	
	int failed=0;
	int limit=2;
	public boolean retry(ITestResult result) {
		
		if (failed<limit) {
			limit++;
			return true;
		}
		return false;
	}

}
