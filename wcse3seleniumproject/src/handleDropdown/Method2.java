package handleDropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Method2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //driver.get("file:///C:/Users/Expert/Desktop/HTML/MultiSelectDropdown.html");
		driver.get("file:///C:/Users/Expert/Desktop/HTML/SingaleSelectDropdown.html");

		WebElement dropdown = driver.findElement(By.id("menu"));
		Select sel = new Select(dropdown);
       
		
		for(int i=0;i<9;i++) {
		sel.selectByIndex(i);
		Thread.sleep(2000);
		}
		
	

	}

}
