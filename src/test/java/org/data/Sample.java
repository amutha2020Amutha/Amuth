package org.data;

import org.Junit.Instagram;
import org.San.Flipkart;
import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pojo.ByesAll;
import org.pojo.LoginPojo;

public class Sample extends BaseClass{
	
	
	public static void main(String[] args) throws InterruptedException {
		
		webpage();
	
		tourl("https://www.instagram.com/accounts/login/");
		
		maximize();
		
		currentUrl();
		
//		LoginPojo l=new LoginPojo();
//		
//	//	Flipkart k=new Flipkart();
//		
//		ByesAll b=new ByesAll();
//		
//		fill(b.getTxtemail(),"amutha@123gmail.com");
//	
//		fill(b.getTxtPass(),"amutha123");
//	
//		toClick(b.getBtnlogin());
//		
		//toQuit();
	
//		WebElement email = l.getTxtEmail();
//		fill(email,"amutha123@gmail.comm");
//		
//		WebElement pass = l.getTxtpass();
//		fill(pass,"amutha123");
//		
//		WebElement login = l.getBtnlogin();
//		toClick(login);	
		
//		toClick(l.getForget());
//		Thread.sleep(3000);
//		fill(l.getForgetemail(),"Anu@123gmail.com");
//		toClick(l.getSubmit());
//			
//		
		
//		toClick(k.getClicklogin());
//		
//		toClick(k.getAccoundlogin());
//		
//		Thread.sleep(4000);
//		
//		fill(k.getTxtemail(),"amuthaece20@.com");
//		
//		toClick(k.getTxtotp());
		
		
		
		Instagram i=new Instagram();
	    fill(i.getClickEmail(), "amuthaece123@gmail.com");
	    fill(i.getClickPass(), "amutha123");
	    toClick(i.getClickLogin());	
	}

}