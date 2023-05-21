package javaSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame1 {

	public static void main(String[] args) throws Exception {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\amits\\Downloads\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver","C:\\JavaSoftware\\driver\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://paytm.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()='Sign In']")).click();
		Thread.sleep(3000);
		
		//Total no of frames in webpage
		int allFrames =driver.findElements(By.tagName("iframe")).size();
		System.out.println(allFrames);
		Thread.sleep(3000);
		
		//Go inside each frame and check web element is present or not
		
		for(int i=0; i<allFrames;i++)
		{
			driver.switchTo().frame(i);
			Thread.sleep(3000);
			driver.findElement(By.xpath(" //*[contains(text(),'Watch Video')] ")).click();
		}
		
		
	

	}

}
