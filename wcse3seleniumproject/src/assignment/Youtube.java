package assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.youtube.com/");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    driver.findElement(By.id("contents")).click();
    
    List<WebElement> options = driver.findElements(By.xpath("//span[@class='style-scope ytd-rich-grid-slim-media']/ancestor::a[@class='yt-simple-endpoint focus-on-expand style-scope ytd-rich-grid-slim-media']"));
    
    for (int  i=0;i<options.size();i++)
    {
	WebElement opt = options.get(i);
	String contents = opt.getText();
	System.out.println(contents);
	}
	    }

}
