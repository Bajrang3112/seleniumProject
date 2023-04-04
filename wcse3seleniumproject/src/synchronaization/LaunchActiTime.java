package synchronaization;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LaunchActiTime {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://desktop-6fji8kj/login.do");
		
		// explicitly Wait
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.titleContains("actiTIME - Login"));
		 
		System.out.println("Login page title is verified");
		driver.findElement(By.name("username")).sendKeys("admin");
	       driver.findElement(By.name("pwd")).sendKeys("manager");
	       driver.findElement(By.id("loginButton")).click();
	       
	       wait.until(ExpectedConditions.titleContains("actiTIME - Enter Time-Track"));
	       System.out.println(" Home Page should be verified");

	}

}
