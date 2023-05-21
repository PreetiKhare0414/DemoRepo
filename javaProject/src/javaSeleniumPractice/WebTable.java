package javaSeleniumPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\JavaSoftware\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://money.rediff.com/gainers");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		List<WebElement> allCompanies = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]"));
		System.out.println(allCompanies.size());
		
		List<WebElement> allPrice = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
		System.out.println(allPrice.size());
		
		String expResult= "Ganga Pharmaceutical";
		
		for(int i=0; i <allCompanies.size();i++)
		{
			if(allCompanies.get(i).getText().equalsIgnoreCase(expResult)) {
				allCompanies.get(i).click();
				System.out.println(allCompanies.get(i).getText()+"== "+ allPrice.get(i).getText());
				break;
			}
		}
	}

}
