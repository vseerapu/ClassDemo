package com.myproject;

public class Launch2 {

	public static void main(String[] args) {
		
		//case-1
		
		String firstNameString = "Ramana";
		System.out.println(firstNameString); //Ramana
		
		String secondNamString = new String("Seerapu");
		System.out.println(secondNamString);//Ramana
		
		//case-2 immutable example
		
		String s1 = "Ramana";
		s1.concat("Seerapu");
		System.out.println(s1); //Ramana
		
		//case-3 mutable example
		
		StringBuilder s2 = new StringBuilder("Ramana");
		s2.append("Seerapu");
		System.out.println(s2); // RamanaSeerapu
		
		
		//Case-4
		
		String s3 = "sachin";
		String s4 = new String("sachin");
		System.out.println( s3 == s4); // == compares the references to different objects
				
		System.out.println(s3.equals(s4)); // equals() method compares the content
				
		//case - 5
		
		StringBuilder s5 = new StringBuilder("sachin");
		StringBuilder s6 = new StringBuilder("sachin");
		
		System.out.println( s5 == s6); // compares the references to different objects
		System.out.println(s5.equals(s6)); // equals() compares the reference

	    

	}

}
