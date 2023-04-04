package methodOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocationMethod {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		    WebDriver driver=new ChromeDriver();
		    driver.manage().window().maximize();
		    
		    driver.get("https://www.selenium.dev/downloads/");
		    WebElement downloads = driver.findElement(By.xpath("//h1[.='Downloads']"));
		   
		   Point loc = downloads.getLocation();
		   int x = loc.getX();
		   int y = loc.getY();
		   System.out.println(x+" "+y);
		    

	}

}
