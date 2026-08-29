package org.sample;

import net.bytebuddy.asm.Advice.This;

public class AmuthaMavan {
	
	public AmuthaMavan() {
		this(24);
		System.out.println("i am a non para constructor");
	}
	public AmuthaMavan(int age) {
		this("amutha", "tcs", "54334");
		System.out.println(age);
	}
	public AmuthaMavan(String name,String company,String value) {
		this(432345.65f, 23);
		System.out.println(name+"\n"+company+"\n"+value);
	}
	public AmuthaMavan(float salay,int oldage) {
		this(434556.345);
		System.out.println(salay+"\n"+oldage);
	}
	public AmuthaMavan(double avgsalay) {
		this("amutha123@gmail.com", 213453);
		System.out.println(avgsalay);
	}
	public AmuthaMavan(String email,long idno) {
		this(7123456777l,'f');
		System.out.println(email+"\n"+idno);
	}
	public AmuthaMavan(long phoneno,char gender) {
		this("434555");
		System.out.println(phoneno+"\n"+gender);
	}
	public AmuthaMavan(String pincode) {
		System.out.println(pincode);
	}
	public static void main(String[] args) {
		
		AmuthaMavan m=new AmuthaMavan();
		
	}









}