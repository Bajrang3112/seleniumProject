package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorSnapChat {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/ChromeDriver.exe");
		//To Handel the illegal state exception
		WebDriver driver=new ChromeDriver();
		//Create the Object of ChromeBrowser
		driver.manage().window().maximize();
		//To Maximize the window
		driver.get("https://accounts.snapchat.com/accounts/login?client_id=ads-api&referrer=https%25253A%25252F%25252Fads.snapchat.com%25252Fsetup");
		//To launch The Web Application 
		Thread.sleep(2000);
		// To Delay the Execution
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("admin");
		//To locate the Username Text Field
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("admin1234");
		//To Locate the Password Text field
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[id='loginTrigger']")).click();
		//To Click the Login Button
		Thread.sleep(2000);
		driver.close();
        //To close the parent window
	}

}
