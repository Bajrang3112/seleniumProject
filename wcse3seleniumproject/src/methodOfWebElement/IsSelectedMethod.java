package methodOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("file:///C:/Users/Expert/Desktop/HTML/CheckBox.html");
		WebElement status2 = driver.findElement(By.name("n4"));
		status2.click();
		boolean check2 = status2.isSelected();
	    System.out.println(check2);
	
        Thread.sleep(2000);
        WebElement status1 = driver.findElement(By.name("n4"));
		status1.click();
        boolean check = status1.isSelected();
		System.out.println(check);
	}

}
