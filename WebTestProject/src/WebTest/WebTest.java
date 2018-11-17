package WebTest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;



public class WebTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
			// TODO Auto-generated method stub
				WebDriver driver = new FirefoxDriver();
				
				driver.manage().window().maximize();
				driver.get("https://www.autopartswarehouse.com/");
				Thread.sleep(20000);
	//			ArrayList<WebElement> arr = new ArrayList<WebElement>();
				
				WebElement L11 = driver.findElement(By.xpath("/html/body/div[3]/div[1]/header/div[2]/nav/ul/li[1]/a"));
				
			//	WebElement L11 = driver.findElement(By.linkText("Auto Body Parts & Mirrors"));
				Actions actions = new Actions(driver);
				actions.moveToElement(L11).perform();
				Thread.sleep(5000);
				WebElement L12 = driver.findElement(By.xpath("/html/body/div[3]/div[1]/header/div[2]/nav/ul/li[1]/div/div/div[1]/ul[1]/li[1]/a"));
				//WebElement L12 = driver.findElement(By.name("popular_subcategory_link_1"));
				actions.moveToElement(L12).click().perform();
				List<WebElement> Mlist = new ArrayList<WebElement>(Arrays.asList(L11, L12));
								
				//Mlist.addAll(Mlist);
				int I = Mlist.size();
				System.out.println(I);
				
								
			}

		

		
	}

