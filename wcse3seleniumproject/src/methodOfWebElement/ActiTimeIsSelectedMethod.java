package methodOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeIsSelectedMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://desktop-6fji8kj/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement checkB = driver.findElement(By.name("remember"));
        boolean status1 = checkB.isSelected();
        System.out.println(status1);
        
        Thread.sleep(2000);
	    checkB.click();
	    boolean status2 = checkB.isSelected();
	   System.out.println(status2);
	}

}
