package javaSelenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;


public class OpenBrowser {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","C:\\JavaSoftware\\driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		/*driver.navigate().to("https://www.google.com/");
		
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		
		Thread.sleep(3000);
		
		driver.navigate().back();
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		
		System.out.println(driver.getTitle());*/
		
        Thread.sleep(3000);
      
        //String a = "window.open(https://www.edureka.co/community/14143/how-open-link-new-tab-chrome-browser-using-selenium-webdriver,'_blank');";  // replace link with your desired link
        //((JavascriptExecutor)driver).executeScript(a);
        Thread.sleep(3000);
        
        //String txt= driver.findElement(By.xpath("//h2[@class='_8eso']")).getText();
        //System.out.println(txt);
        
        driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//form[@id='reg']"));
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@name='sex' and @value ='1']")).click();
        Thread.sleep(3000);
        
        
        
        
        
		
		//driver.close();
		//driver.quit();
        

	}

}
