package javaSelenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\JavaSoftware\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();//Launching Browser Instance
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//implicit Wait
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@title=\'Search\']")).sendKeys("How Stuff Works");
		
		//Handling Auto Suggestion
		
		List<WebElement> AllSuggestions =driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		System.out.println("Total Auto Suggestion List:-"+ AllSuggestions.size());
		 
		for(int i=0; i< AllSuggestions.size();i++ )
		{
			String ExpectedResult="how stuff work quiz";
			
			if(AllSuggestions.get(i).getText().equalsIgnoreCase(ExpectedResult)) {
				AllSuggestions.get(i).click();
				System.out.println(ExpectedResult+ "Clicked");
				break;
			}
		}
		
		
	}

}
