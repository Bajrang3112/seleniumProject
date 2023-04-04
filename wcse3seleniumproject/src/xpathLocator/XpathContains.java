package xpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathContains {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://www.instagram.com/");
     Thread.sleep(2000);
     driver.findElement(By.xpath("//input[contains(@name,'us')]")).sendKeys("admin");
     Thread.sleep(2000);
     driver.findElement(By.xpath("//input[contains(@name,'pa')]")).sendKeys("admin@123");
     Thread.sleep(2000);
     driver.findElement(By.xpath("//button[contains(@type,'submit')]")).click();
     }

}
