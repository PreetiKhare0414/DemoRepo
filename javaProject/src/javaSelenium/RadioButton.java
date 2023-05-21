package javaSelenium;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.beust.jcommander.internal.Lists;
public class RadioButton {

	public static void main(String[] args)throws Exception {
//		
//		System.setProperty("webdriver.chrome.driver","C:\\JavaSoftware\\chromedriver_win32\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.facebook.com/");
//		
//		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
//		Thread.sleep(3000);
//		
//		//1st way
//		
//		driver.findElement(By.xpath("//input[@value='1']")).click();
//		
//		//2ndway
//		
//		List<WebElement> radios = driver.findElements(By.xpath("//input[@type='radio']"));
//		System.out.println("Total radios button"+" " +radios.size());
//		System.out.println(radios.get(1).isEnabled());
//		System.out.println(radios.get(0).isSelected());
//		Thread.sleep(3000);
//		radios.get(1).click();
//		System.out.println(radios.get(0).isSelected());
//		
//		//3rd way
//		
//		List<WebElement> radios1 = driver.findElements(By.xpath("//label[contains(@class,'mt')]"));
//		String ExpResult ="Female";
//		for(int i=0; i<=radios1.size();i++) {
//			
//			if(radios1.get(i).getText().equalsIgnoreCase(ExpResult))
//			{
//				radios1.get(i).click();
//				System.out.println(ExpResult + " "+ "Clicked");
//				break;
//			}
//		}
		
		System.setProperty("webdriver.chrome.driver","C:\\JavaSoftware\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='1']")).click();
		List<WebElement> radios=driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println("Total radios button"+" "+radios.size());
		System.out.println(radios.get(0).isEnabled());
		System.out.println(radios.get(1).isSelected());
		Thread.sleep(3000);
		radios.get(0).click();
		System.out.println(radios.get(0).isSelected());
		
	List<WebElement> radios1 =driver.findElements(By.xpath("//label[@class='_58mt']"));
	String ExpResult = "Female";
	for(int i=0; i<=radios1.size();i++)
	{
		if(radios1.get(i).getText().equalsIgnoreCase(ExpResult))
		{
			radios1.get(i).click();
			System.out.println(ExpResult +" " +"Clicked");
			
		}
				
	}
		
		
		
		
		
		
		
		
	}

}
