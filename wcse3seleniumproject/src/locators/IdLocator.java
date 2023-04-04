package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Expert/Desktop/HTML/TextBox.html");
		Thread.sleep(2000);
		driver.findElement(By.id("it")).sendKeys("admin");
		Thread.sleep(2000);
		driver.close();

	}

}
