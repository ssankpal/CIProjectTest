package WebPageTestCases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ExcelTest {
	
	
	
	public XSSFCell ReadExcel(String Filename, int rowvalue, int cellvalue)
		{
		
		File f1 = new File(System.getProperty("user.dir")+"\\InputData\\"+Filename);
		//File f1 = new File("F:\\D-Drive\\InputData");
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(f1);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		XSSFWorkbook wb = null;
		try {
			wb = new XSSFWorkbook(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		XSSFSheet sheet = wb.getSheetAt(0);
		XSSFCell uname = sheet.getRow(rowvalue).getCell(cellvalue);
		return uname;
		}
		//System.out.println(Name);
		
		
		
		
	public static void main(String[] args)
	{
		ExcelTest ET= new ExcelTest();
		ET.ReadExcel("TestData.xlsx", 1, 1);
				}
	}
	

