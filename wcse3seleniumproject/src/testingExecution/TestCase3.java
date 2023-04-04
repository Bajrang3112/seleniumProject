package testingExecution;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class TestCase3 extends BestTest {
	 @Test
	  public void Search3() throws InterruptedException {
		  driver.switchTo().activeElement().sendKeys("GT",Keys.ENTER);
		  Thread.sleep(2000);
	  }
}
