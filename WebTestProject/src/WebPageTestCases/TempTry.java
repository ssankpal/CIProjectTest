package WebPageTestCases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TempTry {
	

public static void main(String[] args) throws IOException 
/*{
	// TODO Auto-generated method stub
	TempTry Et = new TempTry();
	Et.ExcelRead();
}*/

	//public void ExcelRead()
		{
		//File f1 = new File(System.getProperty("user.dir")+"\\InputData\\TestData.xlsx");
		File f1 = new File("F:\\JAVA\\WebTestProject\\InputData\\TestData.xlsx");
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(f1);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Failed");
		//	e.printStackTrace();
			
		}
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		/*try {
			wb = new XSSFWorkbook(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();*/
		
		
		XSSFSheet sheet1 = wb.getSheetAt(0);
		XSSFCell uname = sheet1.getRow(1).getCell(1);
		System.out.println(uname);
		//return uname;
		}
		
}


