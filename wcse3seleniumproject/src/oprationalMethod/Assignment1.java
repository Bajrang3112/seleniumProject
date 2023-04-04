package oprationalMethod;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///C:/Users/Expert/Desktop/HTML/SingaleSelectDropdown.html");


		WebElement dropdown1 = driver.findElement(By.xpath("//select[@name='menu']"));
		Select sel = new Select(dropdown1);

		List<WebElement> allops = sel.getOptions();
		for(WebElement option:allops) {
			if(option.getText().equals("vadapav")) {
				option.click();
			}

		}

	}

}
