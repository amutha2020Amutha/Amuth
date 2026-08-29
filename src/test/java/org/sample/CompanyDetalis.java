package org.sample;

public class CompanyDetalis extends Company {
	

	public CompanyDetalis() {
	super(25);
	
	System.out.println("i am a child non constrcutor");
		
	}
	public CompanyDetalis(int idno) {
		this("chennai");
	
		System.out.println(idno);

	}

	public CompanyDetalis(String address) {
		System.out.println(address);

	}
	public static void main(String[] args) {
		 
	CompanyDetalis d=new CompanyDetalis();
	CompanyDetalis d1=new CompanyDetalis(62420103);
		
		
	}

}

