package javaSelenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\JavaSoftware\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();//Launching Browser Instance
		
		driver.manage().window().maximize();
		//implicit Wait
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("https://money.rediff.com/gainers");
		
		List <WebElement> AllCompanies = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]/a"));
		System.out.println("Total Companies: " + AllCompanies.size());
		
		List <WebElement> CurrentPrice = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
		System.out.println("Total CurrentPrice : " + CurrentPrice.size());
		
		//String expectedCompany=" MPDL";
		for(int i=1;i<=AllCompanies.size();i++)
		{
			if(AllCompanies.get(i).getText().equalsIgnoreCase("MPDL"))
			{
				System.out.println(AllCompanies.get(i).getText()+"====" +CurrentPrice.get(i).getText()); 
				break;
			}
		}
	}

}
