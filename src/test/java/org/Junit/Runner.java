package org.Junit;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

//@RunWith(Suite.class)
//@SuiteClasses({Sample1.class,Sample2.class,Sample3.class})

public class Runner {
	
	@Test
	public void tc() {
		
		Result rs = JUnitCore.runClasses(Sample1.class,Sample2.class,Sample3.class);
		  
		System.out.println("Run count is"+rs.getRunCount());
		System.out.println("Failure count is"+rs.getFailureCount());
		System.out.println("Ignore count is"+rs.getIgnoreCount());
		

	}
	
	
	

}
