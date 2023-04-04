package synchronaization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Flipkart {
	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://www.flipkart.com/");
        
        
        driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
        driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("Laptop");
        driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
        
        
        driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[.='Core i5']")).click();
        
       WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
       WebElement brand = driver.findElement(By.xpath("//div[.='Brand' and(@class='_2gmUFU _3V8rao')]"));
        wait.until(ExpectedConditions.elementToBeClickable(brand)).click();
        driver.findElement(By.xpath("//div[.='HP']/preceding-sibling::div[@class='_24_Dny']")).click();
        
        
         WebElement operatingsystem = driver.findElement(By.xpath("//div[.='Operating System' and(@class='_2gmUFU _3V8rao')]"));
         wait.until(ExpectedConditions.elementToBeClickable(operatingsystem)).click();
          driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[.='Windows 11']")).click();
       
        
       
        driver.findElement(By.xpath("//div[.='4★ & above']/preceding-sibling::div[@class='_24_Dny']")).click();
       
        
        String priceoflaptop = driver.findElement(By.xpath("(//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1'])[1]")).getText();
        System.out.println( priceoflaptop );
       
        
	}

}



