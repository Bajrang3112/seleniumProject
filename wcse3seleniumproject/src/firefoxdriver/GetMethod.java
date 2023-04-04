package firefoxdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetMethod {
	
	public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", "./drivers/gekodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.instagram.com/");

	}

}
