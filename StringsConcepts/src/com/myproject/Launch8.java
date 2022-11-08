package com.myproject;

public class Launch8 {

	public static void main(String[] args) {
		
		String s1 = "sachin";
		String s2 = new String("sachin");
		String s3 = new String("sachin");
		String s4 = "sachin";
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1 == s2); //false
		System.out.println(s1.equals(s2));//true
//		System.out.println(s2 == s3); //false
		
		System.out.println(s1 == s4); // true
		
		

	}

}
