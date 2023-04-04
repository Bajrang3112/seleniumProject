package oprationalMethod;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFirstSelectedOption {

	public static void main(String[] args) {
		System.setProperty("wbdriver.chrome.driver", "./drivers/chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		   
		   driver.get("file:///C:/Users/Expert/Desktop/HTML/MultiSelectDropdown.html");
		   
		   WebElement dropdown = driver.findElement(By.id("menu"));
		    
		   Select sel = new Select(dropdown);
		   for(int i=3;i<6;i++) {
			   sel.selectByIndex(i);
		   }
		   
		   
		  WebElement first = sel.getFirstSelectedOption();
		  System.out.println(first.getText());
		 
		   }
			
}


	


