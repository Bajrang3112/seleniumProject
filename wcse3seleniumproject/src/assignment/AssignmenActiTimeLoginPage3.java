package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmenActiTimeLoginPage3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://desktop-6fji8kj/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("admin");
		//Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		//Thread.sleep(4000);
		driver.findElement(By.id("loginButton")).click();
	

	}

}
