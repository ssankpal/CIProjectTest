package WebPageTestCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import WebPageObjects.LoginPage;


public class LoginCheck {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://demosite.center/wordpress/wp-login.php?");
		
		LoginPage Login =new LoginPage(driver);
		
		Login.TryLogin();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS );
//		driver.quit();
	}

}
