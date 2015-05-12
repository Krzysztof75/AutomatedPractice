package Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
	
	private static XSSFWorkbook workbook;
	private static XSSFSheet worksheet;
	private static XSSFCell cell;
	private static XSSFRow row;
	private static FileInputStream fis;
	
	
	// Access the required data in Excel
	public static void setExcellFile(String path, String worksheetName ){
		
		try {
			fis = new FileInputStream(path);
			workbook = new XSSFWorkbook(fis);
			worksheet = workbook.getSheet(worksheetName);
		} catch (IOException e) {
		    System.out.println("There is a problem opening Excel file");
			e.printStackTrace();
		} 
			
	}
	
	public static String getCellValue(int rownum, int colnum){
		
		try {
		cell = worksheet.getRow(rownum).getCell(colnum);
		String value = cell.getStringCellValue();
		return value;
		}catch(Exception e){
			System.out.println("exception thrown in getCellValue method");
			return "";
		}
	}
	
	public static void setCellValue(String result, int rownum, int colnum){
		
		try{
		row = worksheet.getRow(rownum);
	    cell = row.getCell(colnum, Row.RETURN_BLANK_AS_NULL);
		
		if (cell == null) {
			 
			cell = row.createCell(colnum);

			cell.setCellValue(result);

			} else {

				cell.setCellValue(result);

			}

// Constant variables Test Data path and Test Data file name

				FileOutputStream fileOut = new FileOutputStream(Constants.RegDataPath);

				workbook.write(fileOut);

				fileOut.flush();

				fileOut.close();

			}catch(Exception e){
				e.printStackTrace();

		}
	}
	
	public static int getNumberOfRows(){
		return worksheet.getPhysicalNumberOfRows();
	}
	
	public static int getNumberOfCellsInTheRow(int rowNum){
		return worksheet.getRow(rowNum).getPhysicalNumberOfCells();
	}
	
	public static Row getHeaderRow(){
		return row = worksheet.getRow(0);
		
	}
	
	public static void close(){
		
		try {
			fis.close();
		} catch (IOException e) {
			System.out.println("Problem closing file");
			e.printStackTrace();
		}
	
	}
}


		
		
	
