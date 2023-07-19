package testngPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import helper.BaseClass;

public class ReadingDataFromExcelFile 
{
	//@Test
	public void readDataExcel() throws IOException 
	{
		String location = "C:\\Users\\Selenuium\\userdata.xlsx";
		File file = new File(location);
		FileInputStream fis = new FileInputStream(file);
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("sheet1");
		
		int rowCount = sheet.getPhysicalNumberOfRows();
		int colCount = sheet.getRow(0).getLastCellNum();
		
		for(int i=0;i<rowCount;i++) 
		{
			XSSFRow row=sheet.getRow(i);
			for(int j=0;j<colCount;j++) 
			{
				XSSFCell cell=row.getCell(j);
				
				CellType celltype=cell.getCellType();
				switch(celltype) 
				{
				case STRING:
					System.out.print(cell.getStringCellValue());
					break;
					
				case NUMERIC:
					System.out.print(cell.getNumericCellValue());
					break;
					
				case BOOLEAN:
					System.out.print(cell.getBooleanCellValue());
					break;
				}
				System.out.print("  | ");
			}
			System.out.println();
		}
	}
	
	@Test(dataProvider="data")
	public void userInformation(double id,String uname,String fname,String lname,String email,String password,double phone) 
	{
		System.out.println(id+" | "+uname+" | "+fname+" | "+lname+" | "+email+" | "+password+" | "+phone);
	}
	
	
	@DataProvider(name="data",parallel=true)
	public Object[][] datagivenMethod() throws IOException 
	{
		String location = "C:\\Users\\Selenuium\\userdata.xlsx";
		File file = new File(location);
		FileInputStream fis = new FileInputStream(file);
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("sheet1");
		
		int rowCount = sheet.getPhysicalNumberOfRows();
		int colCount = sheet.getRow(0).getLastCellNum();
		
		Object[][] data = new Object[rowCount-1][colCount];
		
		for(int i=0;i<rowCount-1;i++) 
		{
			XSSFRow row = sheet.getRow(i+1);
			for(int j=0;j<colCount;j++) 
			{
				XSSFCell cell = row.getCell(j);
				CellType cellType=cell.getCellType();
				switch(cellType) 
				{
				case STRING:
					data[i][j]=cell.getStringCellValue();
					break;
				case NUMERIC:
					data[i][j]=cell.getNumericCellValue();
					break;
				case BOOLEAN:
					data[i][j]=cell.getBooleanCellValue();
					break;
				}
			}
		}
		return data;
	}
}
