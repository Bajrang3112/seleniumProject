package methodOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRectMethod {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		    WebDriver driver=new ChromeDriver();
		    driver.manage().window().maximize();
		    
		    driver.get("https://www.selenium.dev/downloads/");
		    WebElement downloads = driver.findElement(By.xpath("//h1[.='Downloads']"));
		   
		     Rectangle rect = downloads.getRect();
		     int x = rect.getX();
		     int y = rect.getY();
		     System.out.println(x+" "+y);
		     
		     int h = rect.getHeight();
		     int w = rect.getWidth();
		    System.out.println(h+" "+w);
		    
		    System.out.println(downloads.getTagName());
		     
		     

	}

}
