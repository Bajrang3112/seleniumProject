package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentNetflixLoginPage5 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.netflix.com/in/Login");
		Thread.sleep(2000);
		driver.findElement(By.name("userLoginId")).sendKeys("7276821260");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("manager126");
		Thread.sleep(2000);
		driver.findElement(By.tagName("button")).click();
		


	}

}
