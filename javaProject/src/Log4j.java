import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log4j {

	public static void main(String[] args) {
		// We need to create logger instance So we need to pass class name for which we 
		//want to create log file
		
		Logger logger = Logger.getLogger("Log4j");
		
		//Configure log4j properties file
		PropertyConfigurator.configure("C:\\Users\\amits\\eclipse-workspace\\javaProject\\log4j.properties");
		
		//Open Chrome Browser
		System.setProperty("webdriver.chrome.driver","C:\\Java Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		logger.info("Chrome Browser instance opened");
		
		//Maximize window
		driver.manage().window ().maximize();
		logger.info("Window Maximized");
		
		//Set implicit Wait
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		logger.info("Implicit wait Given");
		
		//Open URL
		driver.get("https://www.facebook.com/");
		logger.info("Application Launched");
		
		

	}

}
