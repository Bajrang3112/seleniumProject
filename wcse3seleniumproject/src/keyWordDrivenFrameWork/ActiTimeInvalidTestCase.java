package keyWordDrivenFrameWork;

import java.io.IOException;

import org.openqa.selenium.By;

public class ActiTimeInvalidTestCase extends BestTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		BestTest bt = new BestTest();
		bt.setUp();
		
		Flib fis = new Flib();
		
		int rc = fis.rowCount(EXCEL_PATH,"invalidcreds");

		for(int i=1;i<=rc;i++)
		{

			String invalidUsn = fis.readExcelData(EXCEL_PATH,"invalidcreds", i, 0);
			String invalidPass = fis.readExcelData(EXCEL_PATH,"invalidcreds", i, 1);

			driver.findElement(By.name("username")).sendKeys(invalidUsn);
			driver.findElement(By.name("pwd")).sendKeys(invalidPass);
			driver.findElement(By.id("loginButton")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("username")).clear();
		}
	
         bt.tearDown();
	}

}
