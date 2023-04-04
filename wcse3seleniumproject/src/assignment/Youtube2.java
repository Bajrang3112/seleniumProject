package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.youtube.com/");
	    Thread.sleep(2000);
	 
	    
	    List<WebElement> name = driver.findElements(By.xpath("//span[@class='style-scope ytd-rich-grid-slim-media']"));
	     List<WebElement> viwes = driver.findElements(By.xpath("//span[@class='style-scope ytd-rich-grid-slim-media']/ancestor::a[@class='yt-simple-endpoint focus-on-expand style-scope ytd-rich-grid-slim-media']"));
	    
	    for (int  i=0;i<name.size();i++)
	    {
		String opt = name.get(i).getText();
		
		for(int j=i;j<=i;j++) {
			String shorts = viwes.get(j).getText();
			System.out.print(opt+" "+shorts);
			Thread.sleep(1000);
		}
		System.out.println();

	}
	}
}


