package testNGFlage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flage4 {
	 @Test(invocationCount = 1000)
	  public void ft() {
		  
		  Reporter.log("FTC is executing!!!",true);
	  }
}
