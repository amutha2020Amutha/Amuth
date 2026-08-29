package org.data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ToRead {
	
	public static void main(String[] args) throws IOException {
		
		File f=new File("C:\\Users\\user\\eclipse-workspace\\AmuthaMaven\\src\\test\\java\\org\\data\\facebook.xlsx");
		
//		Workbook book=new XSSFWorkbook();
//		
//		Sheet sh = book.createSheet("new");
//		
//		Row r = sh.createRow(1);
//		
//		Cell c = r.createCell(3);
//		
//		c.setCellValue("amutha");
//		
//		FileOutputStream fout=new FileOutputStream(f);
//		book.write(fout);
//		System.out.println("done");
//		
//		
//		
//	}

		
		FileInputStream fin=new FileInputStream(f);
		
		Workbook book=new XSSFWorkbook(fin);
		
		Sheet sh= book.getSheet("new");
		
		Row r = sh.getRow(1);
		
		Cell c= r.getCell(3);
		
		String Value = c.getStringCellValue();
		
		if (Value.equals("java")) {
			
			c.setCellValue("Action");
			
		}
		else {
			c.setCellValue("Robot");
		}
		FileOutputStream fout=new FileOutputStream(f);
		
		book.write(fout);
		System.out.println("done");
		
		
			
		}
}
