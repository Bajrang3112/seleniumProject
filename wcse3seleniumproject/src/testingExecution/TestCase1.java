package testingExecution;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class TestCase1 extends BestTest{
	 @Test
	  public void Search() throws InterruptedException {
		  driver.switchTo().activeElement().sendKeys("Csk",Keys.ENTER);
		  Thread.sleep(2000);
	  }
}
