package javaSelenium;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Dropdownlist {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","C:\\JavaSoftware\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		
	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//*** 1st Method DropDown****
		
		WebElement bm =driver.findElement(By.xpath("//select[@id='month']"));
		Select month= new Select(bm);//Select Class Constructor
	    month.selectByValue("9");
	   month.selectByVisibleText("Dec");
	   month.selectByIndex(9);
	   System.out.println(month.getFirstSelectedOption().getText());//Return latest selected value
	   
	   
		//***2nd Method DropDown**** Will store all value in a list
	   
	   List<WebElement> monthList = month.getOptions();
	   System.out.println("Total dropdown List:" +monthList.size());
	   for (int i=0; i<monthList.size(); i++)
	   {
		   if( monthList.get(i).getText().equalsIgnoreCase("Aug"))
		   {
			   monthList.get(i).click();
		   }
	   }
	  
	   //3rd
	   
	   WebElement cm =driver.findElement(By.xpath("//select[@id='month']"));
	   cm.sendKeys("Feb");
	   
	   
	 //  4th
	   
	   Thread.sleep(3000);
	   driver.findElement(By.xpath("//select[@id='month']")).sendKeys("Mar");
	   
	   // 5th
	   
	  // System.out.println();

		
//		
//		System.setProperty("webdriver.chrome.driver","C:\\Java Software\\chromedriver_win32\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//	driver.get("https://www.facebook.com/");
//	Thread.sleep(3000);
//	driver.findElement(By.xpath ("//a[@data-testid='open-registration-form-button']")).click();
//	//List<WebElement> dropDown =driver.findElements(By.xpath("//select[@id='month']"));
//	WebElement bm =driver.findElement(By.xpath("//select[@id='month']"));
//     Select month= new Select(bm);//Select Class Constructor
//	List<WebElement> dropDown =month.getOptions();
//	System.out.println("Total dropdownlist:" + dropDown.size());
//	String ExpResult="March";
//	for(int i=0; i<=dropDown.size(); i++)
//	{
//		if(dropDown.get(i).getText().equalsIgnoreCase(ExpResult))
//		{
//			dropDown.get(i).click();
//			System.out.println(ExpResult+ "Clicked");
//			break;
//		}
//	}
//		
		

	}

}
