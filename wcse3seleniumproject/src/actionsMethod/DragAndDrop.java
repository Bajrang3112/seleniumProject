package actionsMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
        driver.get("https://demo.guru99.com/test/drag_drop.html");
        
        WebElement source = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
        WebElement target = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		  
        Actions act = new Actions(driver);
        // to perform drag & drop
        act.dragAndDrop(source, target).perform();
        
        
	}

}


