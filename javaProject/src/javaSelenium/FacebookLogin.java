package javaSelenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookLogin {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\JavaSoftware\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");//select[@id='day']
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Preeti");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Khare");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("abc@gmail.com");  
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("abc@gmail.com");  
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Test@1234");
		Thread.sleep(3000);
		//WebElement bd= 
		driver.findElement(By.xpath("//select[@id='day']")).sendKeys("24");
//		Select date =new Select(bd);
//		List<WebElement> dateList =date.getOptions();
//		for(int i=0;i<=dateList.size();i++)
//		{
//			String ExpectedResult= "24";
//			if(dateList.get(i).getText().equalsIgnoreCase(ExpectedResult))
//				dateList.get(i).click();
//				System.out.println(ExpectedResult);
//				break;
//		}
//		
		
		driver.findElement(By.xpath("//select[@id='month']")).sendKeys("DEC");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//select[@id='year']")).sendKeys("1988");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='1']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='u_3_s_Eu']")).click();
		
		
		
		
	}

}
