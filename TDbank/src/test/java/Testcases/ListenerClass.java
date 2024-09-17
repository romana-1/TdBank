package Testcases;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerClass implements ITestListener{

	@Override
	public void onTestFailure(ITestResult result) {
		
	System.out.println("catch the error");	
	}

}
