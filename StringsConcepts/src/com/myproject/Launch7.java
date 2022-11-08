package com.myproject;

public class Launch7 {

	public static void main(String[] args) {
		
		String s1 = new String ("sachin");
		String s2 = s1.concat("tendulkar");
		
		String s3 = s2.intern();
		String s4 = "sachintendulkar";
		System.out.println(s3 == s4);
		
		System.out.println(s2 == s4);
	}
}
