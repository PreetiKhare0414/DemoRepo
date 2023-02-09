package javaTestNG;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

public class TestNG2 {
	
	WebDriver driver;
	
	public void captureScreenShot(ITestResult result) {
		
		if(ITestResult.FAILURE==result.getStatus()) {
			
			//Create ref of TakeScreenshot Interface and type casting
			TakesScreenshot ts =(TakesScreenshot)driver; //TypeCasting of 2c interfaces
			
			//Use getScreenshotAs() method to capture screenshot in File format
			//getScreenshotAs() method return type -File
			
			File source =ts.getScreenshotAs(OutputType.FILE);
			
			//Copy File to specific Location
			
			FileUtils.copyFile(source,new File)
			
			
		}
		
	}

}
