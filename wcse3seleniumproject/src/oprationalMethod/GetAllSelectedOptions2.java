package oprationalMethod;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedOptions2 {

	public static void main(String[] args) {
		System.setProperty("wbdriver.chrome.driver", "./drivers/chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		   
		   driver.get("file:///C:/Users/Expert/Desktop/HTML/SingaleSelectDropdown.html");
		   
		   WebElement dropdown = driver.findElement(By.id("menu"));
		    
		   Select sel = new Select(dropdown);
		   
		   for(int i=0;i<6;i++) {
			   sel.selectByIndex(i);
		   }
		   
		   List<WebElement> allops = sel.getAllSelectedOptions();
		   for(WebElement we:allops) {
			   String option = we.getText();
			   System.out.println(option);
		   }
			}


	}


