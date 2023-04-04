package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathNike {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nike.com/in/member/profile/login?continueUrl=https://www.nike.com/in/?cp=76060516106_aff_bB3P*8BMeuM&ranMID=41134&ranEAID=bB3P*8BMeuM&ranSiteID=bB3P.8BMeuM-Ikwr1CgggNaku692tlc7Gg");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Email address']")).sendKeys("rambhau@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("1245@bs");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='button']")).click();

	}

}
