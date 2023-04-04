package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SamsungMobiles {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
        driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("samsungMobile");
        driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
        Thread.sleep(2000);
        
        List<WebElement> name = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
        List<WebElement> price = driver.findElements(By.xpath("//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']"));
        
        for(int i=0;i<name.size();i++)
        {
        	String mobile = name.get(i).getText();
        	
        
        	
        	for(int j=i;j<=i;j++) {
        		String opt = price.get(j).getText();
        		System.out.print(mobile+" "+opt);
        		Thread.sleep(1000);
        	}
        	System.out.println();
        }
        

	}

}
