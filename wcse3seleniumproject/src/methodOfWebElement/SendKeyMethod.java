package methodOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeyMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	    WebDriver  driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	    
	    driver.get("http://desktop-6fji8kj/login.do");
	    WebElement usernameTB = driver.findElement(By.name("username"));
	    usernameTB.sendKeys("admin");
	    
	    WebElement passwordTB = driver.findElement(By.name("pwd"));
	    passwordTB.sendKeys("manager");
	    
	   driver.findElement(By.xpath("//a[.='Login']")).click();
       
	}

}
