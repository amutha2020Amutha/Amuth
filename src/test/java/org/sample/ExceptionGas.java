package org.sample;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExceptionGas {
	
	public static void main(String[] args) throws InterruptedException {
		
		//Arithemetic Exception
		
		//System.out.println(0);
		//System.out.println(1);
		//System.out.println(2/0);
		//System.out.println(3);
		
		//Nullpointer Exception
		
		//String e=null;
		
		//char charAt = e.charAt(1);
		//System.out.println(charAt);
		
		
		//inputmismatch Exception
		
		//Scanner s=new Scanner(System.in);
		
		//System.out.println("Enter your idno");
		//int nextInt = s.nextInt();
		//System.out.println(nextInt);
		
		//ArrayIndexoutofBound Exception
		
		//int a[]=new int[3];
		//a[1]=50;
		//a[0]=20;
		//a[2]=10;
		
		//System.out.println(a[3]);
		
		//String IndexoutofBound Exception
		
		//String s="Amutha";
		//System.out.println(s.charAt(8));
		
		//IndexoutofBound Exception
		
//		List li=new ArrayList();
//		
//		li.add(20);
//		li.add(40);
//		li.add(10);
//		li.add(30);
//		
//		System.out.println(li.get(4));
		
//		NumberFormat Exception
//		
//		String s="12345";
//		
//		System.out.println(s+5);		
//				
//		int int1 = Integer.parseInt(s);
//		System.out.println(int1+5);
//		
//		String s1="anu1234";
//		
//		System.out.println(s1);
//		
//		int int2 = Integer.parseInt(s1);
//		System.out.println(int2+5);
//		

		
//		System.out.println(1);
//		Thread.sleep(2000);
//		System.out.println(2);
//		Thread.sleep(3000);
//		System.out.println(3);
//		
	
		System.out.println(1);
		
		System.out.println(2);
		
		try {
		
		System.out.println(3/0);
		}
		catch (Exception e) {
			
			System.out.println("Dont divided by Zero");
			
			e.printStackTrace();
			
		}
		finally {
			System.out.println("Done");
		}
		
		
		System.out.println(4);
		
		System.out.println(5);
		
			
		}
		
		
}
