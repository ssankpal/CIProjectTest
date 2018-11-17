package WebTest;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class TestLogger {

	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger logger = Logger.getLogger(TestLogger.class);
		PropertyConfigurator.configure("log4j.properties");
		logger.info("Test execution is started");
		logger.debug("this is debuger");	
		
		
		
	}

}