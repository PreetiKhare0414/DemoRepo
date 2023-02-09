package javaSelenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\JavaSoftware\\driver\\chromedriver_win32\\chromedriver.exe");
     // System.setProperty("webdriver,driver", "C:\\Java Software\\driver\\chromedriver_win32\\chromedriver.exe");
      WebDriver driver=new ChromeDriver();
      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
      driver.manage().window().maximize();
      driver.get("https://paytm.com/");
      driver.findElement(By.xpath("//*[text()='Sign In']")).click();
      Thread.sleep(3000);
      
      List<WebElement> allFrames = driver.findElements(By.tagName("iFrame"));
      for(int i=0; i<allFrames.size();i++)
      {
    	driver.switchTo().frame(0);
    	
    	driver.findElement(By.xpath("//*[contains(text(),'Watch Video')]")).click();
    	driver.findElement(By.xpath("//*[text()='close']")).click();
    	
      }
      
	}

}
