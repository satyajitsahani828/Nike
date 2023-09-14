package listenerutility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import testbase.WebTestBase;

public class ListenersUtility extends WebTestBase implements IRetryAnalyzer {

    public int retryCount = 0;
    public int maxCount = 2;

    @Override
    public boolean retry(ITestResult iTestResult) {
        if (retryCount < maxCount){
            retryCount++;
            return true;
        }
        return false;
    }
}
