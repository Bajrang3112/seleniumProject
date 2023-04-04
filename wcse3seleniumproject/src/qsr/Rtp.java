package qsr;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Rtp {
	static WebDriver driver;
	@SuppressWarnings("resource")
	public static void main(String[] args) throws InterruptedException {
		Scanner sc= new Scanner(System.in);
		System.out.println("Which Browser You Want to Open!!!");
		String browserValue =sc.nextLine();
		if (browserValue.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.close();
		

		}
		else if(browserValue.equals("Edge"))
		{
			System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
			driver=new EdgeDriver();
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.close();

		}
		else {
			System.out.println("Enter Valid BrowserValue..");
		}

	}


}
