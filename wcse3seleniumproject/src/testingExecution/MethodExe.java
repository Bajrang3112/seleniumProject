package testingExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MethodExe {
  @Test
  public void method1() {
	  
	  long threadid = Thread.currentThread().getId();
	  Reporter.log(threadid+"is the threadid",true);
	  Reporter.log("Method1",true);
  }
  
  @Test
  public void method2() {
	  
	  long threadid = Thread.currentThread().getId();
	  Reporter.log(threadid+"is the threadid",true);
	  Reporter.log("Method2",true);
  }
}
