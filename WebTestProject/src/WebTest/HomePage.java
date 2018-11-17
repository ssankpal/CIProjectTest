package WebTest;


import java.util.Properties;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
public class HomePage {
	
	public Properties PR;
	public File F1;

	
	
	public void loadPropertiesfile() throws IOException
	{
		 PR = new Properties();
		 F1 = new File(System.getProperty("user.dir")+"\\src\\WebPageConfig\\config.properties");
		 FileInputStream file = new FileInputStream(F1);
		 PR.load(file);
				}
	
	
	public void getConfigdata()
	{
		
	}
	
public static void main(String[] args) throws IOException {
		
		
		// TODO Auto-generated method stub
/*		System.setProperty("webdriver.gecko.driver","F:/geckodriver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
		String baseurl="http://www.google.com";
		driver.get(baseurl);*/
		
		HomePage Test = new HomePage();
		System.out.println(System.getProperty("user.dir")+"\\src\\WebPageConfig\\config.properties");
		Test.loadPropertiesfile();
		System.out.println(Test.PR.getProperty("password"));
		
		
		
		
	}

}
