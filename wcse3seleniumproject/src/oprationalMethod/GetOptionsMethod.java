package oprationalMethod;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptionsMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///C:/Users/Expert/Desktop/HTML/SingaleSelectDropdown.html");
		
		
		WebElement dropdown1 = driver.findElement(By.xpath("//select[@name='menu']"));
		Select sel = new Select(dropdown1);
		System.out.println(sel.isMultiple());
		List<WebElement> allops = sel.getOptions();
	
	   for(int i=0;i<allops.size();i++) {
		String options = allops.get(i).getText();
		System.out.println(options);}
	   
	   Thread.sleep(2000);
	   
	   driver.navigate().to("file:///C:/Users/Expert/Desktop/HTML/MultiSelectDropdown.html");
	   WebElement dropdown2 = driver.findElement(By.xpath("//select[@name='menu']"));
		Select sel1 = new Select(dropdown2);
		System.out.println(sel1.isMultiple());
		List<WebElement> allops1 = sel1.getOptions();
		 for(int i=0;i<allops.size();i++) {
				String options = allops1.get(i).getText();   
				System.out.println(options);}
	
	   

	}

}
