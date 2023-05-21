package javaSelenium;

import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Facebookpageaut {
  
	WebDriver  driver;
	  
     @BeforeClass
     public void setup()
     {
    	 System.setProperty("webdriver.chrome.driver","C:\\JavaSoftware\\driver\\chromedriver_win32\\chromedriver.exe");
    	 WebDriver  driver;
			driver = new ChromeDriver();
			/* driver = new EdgeDriver();*/
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
			driver.get("https://www.facebook.com/");
			
			driver.manage().window().maximize();
     }
		/*@Test (priority=1)
		 * 
		public void facebook()
		{
			String fb_title = driver.getTitle();
			Assert.assertEquals(fb_title="facebook","Title is not matching");
			System.out.println("facebook");
			
		}*/
		
		@Test (priority=1)
		public void text()
		{			
			 WebElement text = driver.findElement(By.xpath("//h2[@class='_8eso']"));
			Assert.assertTrue(text.isDisplayed(),"Text is Displayed");
		}
		
		/*@Test(dataProvider="dp",dataProviderClass=DataProvider.class,priority=3)
		 
		public void DataMatrix(String email, String password)
		{
		driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']")).sendkeys();
		driver.findElement(By.xpath("//input[@id='pass']")).sendkeys();
		
			System.out.println(email+"  " +password);
		}
		
		
		@Test(priority=4)
		
		public void forgot()
		{
			driver.findElement(By.xpath("//div[@class='_6ltj']]")).click();
			driver.navigate().back();
		}
		
		
		
		@Test(priority=5)
		
		public void newaccount()
		
		{
			driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
			driver.navigate().back();
		}
		
		
		
		@AfterClass
		public void exit()
		{
			driver.quit();
		}*/
		
		
		

		

	

  }

