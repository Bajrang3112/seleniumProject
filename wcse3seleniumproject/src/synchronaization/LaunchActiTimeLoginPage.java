package synchronaization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchActiTimeLoginPage {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://desktop-6fji8kj/login.do");
		String loginpage = driver.getTitle();
       if(loginpage.equals("actiTIME - Login")) {
			System.out.println("Test is Passed login page varified");

		}
		else  {
			System.out.println("Test is Failed login page not varified");
		}
       driver.findElement(By.name("username")).sendKeys("admin");
       driver.findElement(By.name("pwd")).sendKeys("manager");
       driver.findElement(By.id("loginButton")).click();
       Thread.sleep(2000);
      String homePage = driver.getTitle();
      if(homePage.equals("actiTIME - Enter Time-Track")) {
    	  System.out.println("Test is passed Home Page verified!");
      }
      else {
    	  System.out.println("Test is Failed Home page not varified");
      }



	}
}