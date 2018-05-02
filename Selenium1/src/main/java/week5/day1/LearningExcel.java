package week5.day1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LearningExcel {

	public Object[][] learningExcel() throws IOException {
		
		//Identify the path and get in to the excel
		
		XSSFWorkbook wBook = new XSSFWorkbook("./data/TC001.xlsx");
		
		//get in to the sheet 
		
		XSSFSheet sheet = wBook.getSheetAt(0);
		
		//get the row count
		
		int rowNum = sheet.getLastRowNum();
		
		//print  the row count
		
		System.out.println(rowNum);
		
		//get in to the header row
		
		XSSFRow hrow = sheet.getRow(0);
		
		//get the column count
		
		short columnNum = hrow.getLastCellNum();
		
		//Create object and make it as array
		
		Object[][] data= new Object[rowNum][columnNum];
		
		//print the column count
		
		System.out.println(columnNum);
		
				
		for (int i = 1; i <= rowNum; i++) {
			
			//get the row value
			
			XSSFRow row = sheet.getRow(i);
			
			for (int j = 0; j < columnNum; j++) {
				
				//get the column value
				
				XSSFCell cell = row.getCell(j);
				
				String stringCellValue = cell.getStringCellValue();
				
				//c
				
				data[i-1][j] = stringCellValue;
				
				System.out.println(stringCellValue);
			}
		}
		return data;
		
		
		
		
		

		
		
		
		

	}

}
