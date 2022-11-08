package com.myproject;

public class Launch9_StringClassConstructor {

	public static void main(String[] args) {
		
		String s = new String(); // creates an empty string object
		String string = new String("sachin" ); // Creates an Object with String literals on Heap
		System.out.println(s); // created an empty string object
		System.out.println(string); // creates string literal on Heap
		
		System.out.println();
		
		StringBuffer sb = new StringBuffer("tendulkar");
		String s1 = new String (sb);// Creates equivalent string object for stringbuffer 
		System.out.println(s1);
		System.out.println(sb);
		
		System.out.println();
		
		char[] ch = {'j','a','v','a'};
		String s2 = new String(ch); // Creates equivalent string object for charecter array 
		System.out.println(s2);
		
		System.out.println();
		
		byte[] b = {65,66,67,68,69,70};
		String s3 = new String(b);// Creates equivalent string object for array
		System.out.println(s3);

		System.out.println();
		
		StringBuffer sb1 = new StringBuffer("ramana");
		System.out.println("StringBuffer data is :: "+ sb1);
		
		String s4 = new String(sb1);
		System.out.println("String data is :: "+ s4);

	}

}
