package WebPageTestCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Listener.ExtentReportBase;
import WebPageObjects.LoginPage;


public class LoginTest extends ExtentReportBase {

	//WebDriver driver;
	//ExtentReport ER = new ExtentReport(this.getClass().getSimpleName());
	
	/*@BeforeMethod
	public void bsetup()
	{
		test = extent.createTest(this.getClass().getSimpleName());
	}*/
	
	@Test
	
	public void Logintest() throws IOException
	{
		
	//	driver = new FirefoxDriver();
	//	driver.manage().window().maximize();
		driver.get("http://demosite.center/wordpress/wp-login.php?");
	//	ER.loggerex.log(LogStatus.INFO, "Login will start now");
		LoginPage Login =new LoginPage(driver);
		Login.TryLogin();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS );
	//	ER.loggerex.log(LogStatus.PASS, "Success");
	}
	
	/*@AfterMethod
	public void teardown()
	{
		ER.reportex.endTest(ER.loggerex);
		ER.reportex.flush();
	}*/
}
