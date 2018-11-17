/**
 * 
 */
package WebPageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import WebTest.HomePage;

/**
 * @author Sachin
 *
 */
public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
		
 public void TryLogin() throws IOException
 {
	 WebElement username = driver.findElement(By.id("user_login"));
	WebElement password = driver.findElement(By.name("pwd"));
	WebElement btnclick = driver.findElement(By.name("wp-submit"));
		
	 HomePage HP = new HomePage();
	 HP.loadPropertiesfile();
	 
//	 driver.findElement(username).sendKeys("admin");
	 driver.findElement(By.id("user_login")).sendKeys(HP.PR.getProperty("username"));
	 driver.findElement(By.name("pwd")).sendKeys(HP.PR.getProperty("pwd"));
	 driver.findElement(By.name("wp-submit")).click();;
 }
}
