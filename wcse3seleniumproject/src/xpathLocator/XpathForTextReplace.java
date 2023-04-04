package xpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathForTextReplace {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.nike.com/in/member/profile/login?continueUrl=https://www.nike.com/in/?cp=76060516106_aff_bB3P*8BMeuM&ranMID=41134&ranEAID=bB3P*8BMeuM&ranSiteID=bB3P.8BMeuM-Ikwr1CgggNaku692tlc7Gg");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Forgotten your password?']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("admin@1234");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='RESET']")).click();
	}

}
