package org.Junit;

import java.util.Date;

import org.San.Flipkart;
import org.base.BaseClass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.pojo.LoginPojo;
import org.sample.Sample;

public class Amazon extends BaseClass {
	
	@Test

	public void teseCase() throws InterruptedException {

		webpage();
		tourl("https://www.instagram.com/accounts/login/");
		maximize();
		Instagram i = new Instagram();
		fill(i.getClickEmail(), "java123@gmail.com");
		String value = togetAttribute(i.getClickEmail());

		// Assert assertrue
		Assert.assertTrue("To validate username field", value.equals("java123@gamail.com"));
		
	

		fill(i.getClickPass(), "anu123");
		
		String value1 = togetAttribute(i.getClickPass());
		Assert.assertEquals("To validate passwordfield", value1, "java123");
		
		toClick(i.getClickLogin());
		toQuit();
	}

	@Ignore
	@Test

	public void teseCase1() {

		webpage();
		tourl("https://www.instagram.com/accounts/login/");
		maximize();
		Instagram i = new Instagram();
		fill(i.getClickEmail(), "muthuce123@gmail.com");
		fill(i.getClickPass(), "muthu123");
		toClick(i.getClickLogin());
		toQuit();
	}
	@Ignore

	@Test

	public void teseCase2() {
		webpage();
		tourl("https://www.instagram.com/accounts/login/");
		maximize();
		Instagram i = new Instagram();
		fill(i.getClickEmail(), "selvamce123@gmail.com");
		fill(i.getClickPass(), "selvam123");
		toClick(i.getClickLogin());
		toQuit();
	}

}
//
//	@BeforeClass
//
//	public static void befClass() {
//
//		Date d = new Date();
//		System.out.println(d);
//
//	}
//
//	@AfterClass
//
//	public static void aftClass() {
//
//		Date d = new Date();
//		System.out.println(d);
//
//	}
//
//	@Before
//
//	public void bef() {
//		webpage();
//		tourl("https://www.instagram.com/accounts/login/");
//		maximize();
//
//	}
//
//	@After
//
//	public void aft() {
//
//		toQuit();
//	}
//
//}
