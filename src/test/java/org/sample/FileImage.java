package org.sample;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

import org.apache.commons.io.FileUtils;

public class FileImage {
	
	public static void main(String[] args) throws IOException {
//		
//		File f=new File("C:\\Amutha\\java//fb.txt");
//	    boolean mkdirs = f.mkdirs();
//	    System.out.println(mkdirs);
//
//		
		//File f=new File("C:\\Amutha\\java\\fb.txt");
		//boolean mkdirs = f.mkdirs();
		//System.out.println(mkdirs);
		
//		boolean newFile = f.createNewFile();
//		System.out.println(newFile);
//		
//		boolean canRead = f.canRead();
//        System.out.println(canRead);
//        
//        boolean canWrite = f.canWrite();
//        System.out.println(canWrite);
//        
//        boolean canExecute = f.canExecute();
//        System.out.println(canExecute);
//
		//FileUtils.write(f, "My name is Amutha", true);
		//FileUtils.write(f, "My name is anu", false);
	
		File f=new File("C:\\");
		String[] list = f.list();
		for (String s : list) {
			System.out.println(s);
			
		}
		
		File[] listFiles = f.listFiles();
		for (File d : listFiles) {
			System.out.println(d);
		}
		}
		
			
		}
		
		
	