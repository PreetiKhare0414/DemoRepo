package javaSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class MouseSimulation1 {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","C:\\JavaSoftware\\driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();//Launching Browser Instance
		
		driver.manage().window().maximize();
		
		//implicit Wait
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
				
		WebElement Electronics = driver.findElement(By.xpath("//*[text()='Electronics']"));
		
		
		Actions act = new Actions(driver);
		
		Thread.sleep(3000);
		act.moveToElement(Electronics).build().perform();
		
		
		//Release control from Web Element
		Thread.sleep(3000);
		act.release(Electronics).build().perform();
		
		//Perform key Event
		Thread.sleep(3000);
		act.sendKeys(Keys.ENTER).build().perform();
		
		//Press Enter key to HomeWeb Element
		Thread.sleep(3000);
		driver.navigate().refresh();
		WebElement Home = driver.findElement(By.xpath("//*[text()='Home']"));
		act.sendKeys(Home,Keys.ENTER).build().perform();
		System.out.println("Home Menu Clicked");
		
		
		
		
		
		
		
	}

}