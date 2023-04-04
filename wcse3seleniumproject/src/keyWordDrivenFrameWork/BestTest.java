package keyWordDrivenFrameWork;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BestTest implements IAutoConstant {
	static WebDriver driver;
	

		public void setUp() throws IOException
		{

			Flib flib = new Flib();
			String browserValue = flib.readPropertyData(PROP_PATH,"Browser");
			String url = flib.readPropertyData(PROP_PATH,"Url");
			if(browserValue.equalsIgnoreCase("chrome"))
			{
				System.setProperty(CHROME_KYE,CHROME_PATH);

				ChromeOptions co = new ChromeOptions();
				co.addArguments("--remote-allow-origins=*");
				driver=new ChromeDriver(co);
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				driver.get(url);
			}
			else if(browserValue.equals("Firefox"))
			{
				System.setProperty(GECKO_KYE,GECKO_PATH);
				driver=new FirefoxDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				driver.get(url);
			}
			else
			{
				System.out.println("invalid browserValue!!");
			}
		}
			public void tearDown()
			{
				driver.quit();
			}


		
		
	}


