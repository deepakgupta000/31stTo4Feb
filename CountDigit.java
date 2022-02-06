package com.date1Feb;

import java.util.Scanner;

public class CountDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the number");
		int n=sc.nextInt();
		int count=0;
		while(n>0)
		{
			n=n/10;
			count++;
		}
		System.out.println(count);
		sc.close();

	}

}
