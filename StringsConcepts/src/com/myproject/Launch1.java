package com.myproject;

public class Launch1 {

	public static void main(String[] args) {
		
		String s1 = "Sachin";
		s1.concat("Tendulkar");
		System.out.println(s1); // Sachin
		
		StringBuilder s2 = new StringBuilder("Ramana");
		s2.append("Seerapu");
		System.out.println(s2);// RamanaSeerapu
		
		System.out.println("1----------------------------");
		//Case2 
		
		String s3 = "sachin";
		String s4 = new String("sachin");
		System.out.println( s3 == s4); // == compares the references to different objects
		System.out.println(s3.equals(s4)); // equals() method compares the content
		
		System.out.println("2----------------------------");
		//case3
		
		StringBuilder s5 = new StringBuilder("sachin");
		StringBuilder s6 = new StringBuilder("sachin");
		System.out.println( s5 == s6); // compares the references to different objects
		System.out.println(s5.equals(s6)); // equals() compares the reference
		
		System.out.println("3----------------------------");
		
		//case4 StringBuffer follows StringBuilder
		StringBuffer s7 = new StringBuffer("sachin");
		StringBuffer s8 = new StringBuffer("sachin");
		System.out.println(s7 == s8);
		System.out.println(s7.equals(s8));
		

		

	}

}
