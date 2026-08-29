package org.data;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data {

	public static void main(String[] args) throws IOException {
		
		File f=new File("C:\\Users\\user\\eclipse-workspace\\AmuthaMaven\\src\\test\\java\\amutha.xlsx");
	
		FileInputStream fin=new FileInputStream(f);
		
		Workbook book=new XSSFWorkbook(fin);
		
		Sheet sh = book.getSheet("Sheet1");
		
//		Row r=sh.getRow(3);
//		
//		Cell ce= r.getCell(3);
//		
//		System.out.println(ce);
//		
//	}
//}
		
		for (int i = 0; i < sh.getPhysicalNumberOfRows(); i++) {
			
			Row r = sh.getRow(i);
			
			for (int j = 0; j <r.getPhysicalNumberOfCells(); j++) {
				
				Cell c= r.getCell(j);
			//	System.out.println(ce);
				
			int cellType = c.getCellType();
			
			String value=" ";
			if(cellType==1) {
				
				 value = c.getStringCellValue();
			}
			else if (DateUtil.isCellDateFormatted(c)) {
				
				Date d=c.getDateCellValue();
				
				SimpleDateFormat si=new SimpleDateFormat("dd/MM/yyyy");
				 value = si.format(d);
				
			}
			
			else {
				double dd = c.getNumericCellValue();
				long l=(long)dd;
				System.out.println(l);
				 value= String.valueOf(l);
			}
				
				System.out.println(value);		
				
			}
			}
			
			
	}
}