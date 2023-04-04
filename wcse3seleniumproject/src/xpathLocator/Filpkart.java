package xpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Filpkart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
        driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("Laptop");
        driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[.='Core i5']")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//div[.='Brand' and(@class='_2gmUFU _3V8rao')]")).click();
        driver.findElement(By.xpath("//div[.='HP']/preceding-sibling::div[@class='_24_Dny']")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//div[.='Operating System' and(@class='_2gmUFU _3V8rao')]")).click();
        driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[.='Windows 11']")).click();
        Thread.sleep(2000);
       
        driver.findElement(By.xpath("//div[.='4★ & above']/preceding-sibling::div[@class='_24_Dny']")).click();
        Thread.sleep(2000);
        
        String priceoflaptop = driver.findElement(By.xpath("(//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1'])[1]")).getText();
        System.out.println( priceoflaptop );
       
        
	}

}
