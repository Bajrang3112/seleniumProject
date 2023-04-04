package testNGAnnotation;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class GoogleTest extends BestTest {
  @Test
  public void Search() throws InterruptedException {
	  driver.switchTo().activeElement().sendKeys("Csk",Keys.ENTER);
	  Thread.sleep(2000);
  }
  @Test
  public void Search1() throws InterruptedException {
	  driver.switchTo().activeElement().sendKeys("Mumbai Indians",Keys.ENTER);
	  Thread.sleep(2000);
  }
  @Test
  public void Search3() throws InterruptedException {
	  driver.switchTo().activeElement().sendKeys("GT",Keys.ENTER);
	  Thread.sleep(2000);
  }
  
}
