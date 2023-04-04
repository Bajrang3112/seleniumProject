package javaScriptExcutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDisableWebElemrnt {

	public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrmoe.driver", "./drivers/chromedriver.exe");
    WebDriver  driver=new ChromeDriver();
    driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	
	driver.get("file:///C:/Users/Expert/Desktop/seleniumData/WebElement/DisableWebElement.html");
	
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	Thread.sleep(2000);
	jse.executeScript("document.getElementById('i1').Text='SQL'");
    

	}

}
