package com.date31Jan;

import java.util.Scanner;

public class Add3InAsciiValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the any character");

		char ascii=sc.next().charAt(0);
		int asciiValue=ascii;
		System.out.println(asciiValue+3);
		sc.close();
	}

}
