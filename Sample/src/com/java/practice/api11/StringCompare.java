package com.java.practice.api11;

import java.util.Scanner;

public class StringCompare {

	public static void main(String[] args) {
		String s2 ="Hello";
		String s1 ="World";
		String s3 =new String("Hello");
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.compareTo(s2));
		
		System.out.println(s2.equals(s3));
		
		if (s2==s3) {
			System.out.println("s2 equal to s3");
		}else {
			System.out.println("s2 not equal to s3");
		}
			
		if (s2.equals(s3)) {
			System.out.println("s2 equal to s3");
		}else {
			System.out.println("s2 not equal to s3");
		}
		
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter("\\,");
		System.out.println("Please enter some words with comma between each word");
		
		while(sc.hasNext()) {
			System.out.println(sc.next());
		}
		
		sc.close();

	}

}
