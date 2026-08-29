package org.Junit;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.base.BaseClass;
import org.data.ToRead;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ToWrite {

	@Test

	public void Sheet() throws IOException {

		File f = new File("C:\\Users\\user\\eclipse-workspace\\AmuthaMaven\\src\\test\\java\\org\\data\\facebook.xlsx");

		Workbook book = new XSSFWorkbook();

		Sheet sh = book.createSheet("new");

		Row r = sh.createRow(1);

		Cell c = r.createCell(3);

		c.setCellValue("amutha");

		FileOutputStream fout = new FileOutputStream(f);
		book.write(fout);
		System.out.println("done");

	}

}
