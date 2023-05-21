package javaSelenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\JavaSoftware\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/browser-windows");
		Thread.sleep(3000);
		driver.findElement(By.id("windowButton")).click();
		Thread.sleep(3000);
		
		//Print how many window
		
		Set<String> WindowsID = driver.getWindowHandles();
		System.out.println(WindowsID);
		System.out.println(WindowsID.size());
		
	//	Iterator<String> abc = WindowsID.iterator();
		//String Window1 = abc.next();
	//	String Window2 = abc.next();
		
	//	driver.switchTo().window(Window2);
		//System.out.println(Window2);
	//	System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.close();
		
		
		
		
				
			
			
			
		}
		
		
	}

}
