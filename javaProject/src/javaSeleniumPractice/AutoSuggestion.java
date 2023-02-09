package javaSeleniumPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\JavaSoftware\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("How Stuff Work");
		
		
		List<WebElement> autoSuggestion = driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
		for(int i=0; i<=autoSuggestion.size();i++)
		{
			String expResult = "how stuff works quiz";
					if(autoSuggestion.get(i).getText().equalsIgnoreCase(expResult))
					{
						autoSuggestion.get(i).click();
						System.out.println(expResult+" "+"clicked");
						break;
					}
		}

	}

}
