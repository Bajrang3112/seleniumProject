package testingExecution;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class TestCase2 extends BestTest {
	 @Test
	  public void Search1() throws InterruptedException {
		  driver.switchTo().activeElement().sendKeys("Mumbai Indians",Keys.ENTER);
		  Thread.sleep(2000);
	  }
}
