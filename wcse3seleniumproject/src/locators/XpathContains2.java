package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathContains2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.shine.com/registration/");
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[contains(@id,'id_name')]")).sendKeys("admin");
	    driver.findElement(By.id("id_email")).sendKeys("admin123@gmail.com");
	    driver.findElement(By.xpath("//input[contains(@id,'id_cell_phone')]")).sendKeys("9865321478");
	    driver.findElement(By.xpath("//input[contains(@id,'id_password')]")).sendKeys("Asdfghjklz12@cvbn");
	    driver.findElement(By.id("registerButton")).click();
	}



}
