package org.Junit;

import org.junit.Ignore;
import org.junit.Test;

public class Sample1 {
	@Test
	public void saving()
	{
		System.out.println("saving 10%");
	}
	@Test
	public void fixed()
	{
		System.out.println("fixted 20");
		
	}
	@Ignore
	@Test
	public void deposit()
	{
		System.out.println("deposit5%");
	}
	
	
	
	
	
	
	
	
	
	

}
