package javaSeleniumPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookPage {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","C:\\JavaSoftware\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@data-testid=\"open-registration-form-button\"]")).click();
		Thread.sleep(3000);
		WebElement bm = driver.findElement(By.xpath("//select[@id='month']"));
		
		Select month =new Select(bm);
		month.selectByValue("10");
		month.selectByIndex(10);
		month.selectByVisibleText("Jan");
		System.out.println(month.getFirstSelectedOption().getText());
		
		List<WebElement> monthlist = month.getOptions();
		for(int i=0; i< monthlist.size();i++)
		{
			String expResult ="Feb";
			if(monthlist.get(i).getText().equalsIgnoreCase(expResult))  
			{
				monthlist.get(i).click();
				System.out.println(expResult+" " + "Clicked");
				break;
			}
		}
		
		
		
		
		

	}

}
