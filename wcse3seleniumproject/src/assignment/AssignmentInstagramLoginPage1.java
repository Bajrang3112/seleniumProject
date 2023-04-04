package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentInstagramLoginPage1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	//	Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("admin");
	//	Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("admin1234");
	//	Thread.sleep(4000);
		driver.findElement(By.cssSelector("div[class$='_ab8w  _ab94 _ab99 _ab9f _ab9m _ab9p  _abak _abb8 _abbq _abb- _abcm']")).click();
		//Thread.sleep(2000);
		driver.close();


	}

}
