package asserationTesting;


import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert1 {
	@Test
	public void validLogin() {

		Reporter.log("launch the browser",true);
		Reporter.log("launch the wen application using url");

		SoftAssert sa = new SoftAssert();
		sa.assertEquals(false, true);
		Reporter.log("log in page will be display");
		Reporter.log("perform the login operation");
		Assert.assertEquals(true, false);
		Reporter.log("Home page will be display!!",true);
		Reporter.log("log out",true);

	}


}
