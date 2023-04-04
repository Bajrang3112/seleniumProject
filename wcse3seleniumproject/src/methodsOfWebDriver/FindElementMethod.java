package methodsOfWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Expert/Desktop/HTML/CheckBox.html");
		
		WebElement automationChkBox = driver.findElement(By.id("i4"));
        System.out.println( automationChkBox);
        automationChkBox.click();
        
        Thread.sleep(2000);
        automationChkBox.click();
        
        driver.navigate().to("http://desktop-6fji8kj/login.do");
        driver.manage().window().maximize();
        WebElement usn = driver.findElement(By.name("username"));
        usn.sendKeys("admin");
        WebElement pwd = driver.findElement(By.name("pwd"));
        pwd.sendKeys("manager");
        
        driver.findElement(By.id("loginButton"));
	}

}
