package WebPageTestCases;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;

import org.junit.Assert;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GoogleTest{
	
	@Test
	public void readTextFile() throws IOException {
	BufferedReader buf = new BufferedReader(new FileReader("F:\\JAVA\\TestFile.txt"));
    ArrayList<String> words = new ArrayList<>();
    String lineJustFetched = null;
    String[] wordsArray;
    LineNumberReader lnr = new LineNumberReader(buf);

    while((lineJustFetched = lnr.readLine()) != null ){
     //   lineJustFetched = buf.readLine();
              
        if(lnr.getLineNumber() > 4 && lnr.getLineNumber() <= 5 )
        {
    	//System.out.println(lnr.getLineNumber());
        	
        //    System.out.println(lineJustFetched);
        		wordsArray = lineJustFetched.split("\t");
            for(String each : wordsArray){
                if(!"".equals(each)){
                    words.add(each);
                }
            }
            
         }
      }
    buf.close();
    System.out.println(words);
    String output = words.toString().replaceAll("\"","" );
    System.out.println(output);

	}
}



