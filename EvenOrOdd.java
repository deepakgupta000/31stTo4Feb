package com.date1Feb;

import java.util.Scanner;

public class EvenOrOdd {
	public static void evenOdd(int n)
	{
		if(n%2==0)
			System.out.println("Number is even");
		else
			System.out.println("Number is odd");
	}
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		evenOdd(n);
		
	}

}
