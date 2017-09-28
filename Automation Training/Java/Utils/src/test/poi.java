package test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class poi {

	public static void main(String[] args) throws FileNotFoundException {
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet0 =workbook.createSheet("firstSheet");
		XSSFRow row0 = sheet0.createRow(0);
		
		
		XSSFCell cellA=row0.createCell(0);
		XSSFCell cellB=row0.createCell(1);
		
		cellA.setCellValue("first cell");
		cellB.setCellValue("second cell");
		
		//connecting streams
		File f = new File("C:\\write\\xcel.xlsx");
		FileOutputStream fo = new FileOutputStream(f);
	
		
	}

}
