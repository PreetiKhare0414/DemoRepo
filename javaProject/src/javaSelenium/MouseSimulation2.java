package javaSelenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSimulation2 {

	public static void main(String[] args)throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\JavaSoftware\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
		driver.get("https://jqueryui.com/droppable/");
		
		
		List<WebElement> allFrames = driver.findElements(By.tagName("iframe"));
		System.out.println("Total Frame: "+ allFrames.size());
		driver.switchTo().frame(0);
		
		WebElement source = driver.findElement(By.id("draggable"));
		
		WebElement target = driver.findElement(By.id("droppable"));
		
		Actions act = new Actions(driver);
		
		Thread.sleep(3000);
		//act.dragAndDrop(source, target).build().perform();
		//Thread.sleep(3000);
		act.dragAndDropBy(source, 30, 50).build().perform();
		Thread.sleep(3000);
		act.clickAndHold(source).dragAndDrop(source, target);
		
		

	}

}
