package org.Junit;

import java.util.Date;

import org.base.BaseClass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.pojo.LoginPojo;

import junit.framework.TestCase;

public class Aftermodul extends BaseClass {

	@BeforeClass

	public static void befClass() {

		Date d = new Date();
		System.out.println(d);

	}

	@AfterClass

	public static void aftClass() {

		Date d = new Date();
		System.out.println(d);

	}

	@Before

	public void bef() {
		webpage();
		tourl("https://www.omrbranch.com/");
		maximize();

	}

	@After

	public void aft() {

		toQuit();
	}

	@Test

	public void testCase() {

		LoginPojo l = new LoginPojo();
		fill(l.getTxtEmail(), "amutha123@gmail.com");
		fill(l.getTxtpass(), "amutha123");
		toClick(l.getBtnlogin());
	}

	@Test

	public void testCase1() {

		LoginPojo l = new LoginPojo();
		fill(l.getTxtEmail(), "muthu123@gmail.com");
		fill(l.getTxtpass(), "muthu123");
		toClick(l.getBtnlogin());

	}

	@Test

	public void testCase2() {

		LoginPojo l = new LoginPojo();
		fill(l.getTxtEmail(), "ammu123@gmail.com");
		fill(l.getTxtpass(), "ammu123");
		toClick(l.getBtnlogin());

	}

}
