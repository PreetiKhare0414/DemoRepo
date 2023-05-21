package javaSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;



public class Alert {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","C:\\JavaSoftware\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(3000);
//		driver.findElement(By.id("confirmButton")).click();
//		
//		//Verify Alert Text
//		System.out.println(driver.switchTo().alert().getText());
//		String expResult ="Do you confirm action?";
//		Assert.assertEquals(driver.switchTo().alert().getText(),expResult);
//		System.out.println("Alert Text verified");
//		
//		//Accept
//		
//		driver.switchTo().alert().accept();
//		System.out.println("Alert Accepted");
//		
//		//dismiss
//		
//		driver.findElement(By.id("confirmButton")).click();
//		driver.switchTo().alert().dismiss();
//		System.out.println("Alert Dismissed");
//		driver.close();
		
		driver.findElement(By.id("confirmButton")).click();
		System.out.println("driver.switchTo().alert().getText()");
		String ExpResult = "Do you confirm action?";
		Assert.assertEquals(driver.switchTo().alert().getText(), ExpResult);
		System.out.println("Alert Text Verified");
		 driver.switchTo().alert().accept();
		 
		
		
		Thread.sleep(3000);
		
		
		
	}

}
		
		
