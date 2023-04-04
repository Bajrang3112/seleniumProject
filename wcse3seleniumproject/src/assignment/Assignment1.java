package assignment;

import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Thread.sleep(4000);
		
		Point targetPosition= new Point(370, 250);
		driver.manage().window().setPosition(targetPosition);
		//Thread.sleep(4000);
		
		Dimension targetSize = new Dimension(350, 275);
		driver.manage().window().setSize(targetSize);
		//Thread.sleep(4000);

	}

}
