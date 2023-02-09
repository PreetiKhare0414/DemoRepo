package javaSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript {

	public static void main(String[] args) throws Exception {
//		System.setProperty("webdriver.chrome.driver","C:\\Java Software\\chromedriver_win32\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();//Launching Browser Instance
//		
//		driver.manage().window().maximize();
//		
//		//implicit Wait
//		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//		driver.manage().deleteAllCookies();
//		driver.get("https://www.facebook.com/");
//		
//		
//		//Type casting of 2 interfaces
//		
//		JavascriptExecutor jse = (JavascriptExecutor)driver;
//		jse.executeScript("document.getElementById('email').value='abc@gmail.com'");
//		jse.executeScript("document.getElementById('pass').value='abc@gmail.com'");
//		
//		//Scrollup
//		
//		Thread.sleep(3000);
//		jse.executeScript("window.scrollBy(0,400)");
//		
//		//Scroll down;
//		
//		Thread.sleep(3000);
//		jse.executeScript("window.scrollBy(0,-400)");
//		
//	    ((WebDriver) jse).close();
		
		
		System.setProperty("webdriver.chrome.driver","C:\\JavaSoftware\\driver\\chromedriver_win32\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
         
         driver.get("https://www.facebook.com/");
         
         JavascriptExecutor jse=(JavascriptExecutor)driver;
         //jse.executeScript("document.getElementByid('email')value='abc@gmail.com'");
         
         //jse.executeScript("document.getElementByid('pass')value='123456'");
         Thread.sleep(3000);
         
         jse.executeScript("window.scrollBy(0,400)");
         Thread.sleep(3000);
         jse.executeScript("window.scrollTo(0,-100)");
         Thread.sleep(3000);
         
         ((WebDriver)jse).close();

	
	}

}