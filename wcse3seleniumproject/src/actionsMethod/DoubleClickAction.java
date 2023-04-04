package actionsMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickAction {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://desktop-6fji8kj/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
		driver.findElement(By.name("username")).sendKeys("admin");
	
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		driver.findElement(By.id("loginButton")).click();
		
		driver.findElement(By.xpath("//div[.='Settings']/following-sibling::img")).click();
		
		WebElement target = driver.findElement(By.partialLinkText("Logo & Color Scheme"));
		
		Actions act = new Actions(driver);
		//
		act.moveToElement(target).perform();
		target.click();
		Thread.sleep(2000);
		
         driver.findElement(By.xpath("//label[@for='uploadNewLogoOption']")).click();
		 
		 WebElement target2 = driver.findElement(By.name("formCustomInterfaceLogo.logo"));
		 act.doubleClick(target2).perform();
		 
	


	}

}
