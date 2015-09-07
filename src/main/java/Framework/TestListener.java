package Framework;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

/**
 * 
 * @author Franklin Plaza
 *
 */
public class TestListener  {
	/*
	private WebDriver driver;
	private String filePath =  "build\\reports\\tests\\html\\screenshots";
	
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("On Execution Start");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("On Test Success");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("***** Error " + result.getName() + " test has failed *****");
        String methodName = result.getName().toString().trim();
        takeScreenShot(methodName);
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
	}
	
	public int getId(ITestResult result) {
        int id = result.getTestClass().getName().hashCode();
        id = 31 * id + result.getMethod().getMethodName().hashCode();
        id = 31 * id + (result.getParameters() != null ? Arrays.hashCode(result.getParameters()) : 0);
        return id;
    }
	
	public void takeScreenShot(String methodName) {
        driver = BrowserManager.getInstance().getDriver();
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            File myFile = new File(filePath + "\\" + methodName + ".png");
            FileUtils.copyFile(scrFile, myFile);
            System.out.println("***Placed screen shot in "+filePath+" ***");
            reportLogScreenshot(myFile);
        } catch (IOException e) {
            System.out.println("___ catch exception");
            e.printStackTrace();
        }
     }
	
	 public void reportLogScreenshot(File file) {
	        System.setProperty("org.uncommons.reportng.escape-output", "false");

	        Reporter.log("<p align=\"left\">Error screenshot at " + new Date()+ "</p>");
	        Reporter.log("<p>&nbsp;</p>");
	        Reporter.log("<a href='logs/log4j-application.log'>Open Logs</a>");
	        Reporter.log("<p>&nbsp;</p>");
	        Reporter.log("<p><img width=\"1024\" src=\"" + file.getAbsoluteFile()  + "\" alt=\"screenshot at " + new Date()+ "\"/></p><br />");
	    }*/

}
