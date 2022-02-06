package com.date31Jan;

import java.util.Scanner;

public class ProductDecimalToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the number");
		int n1=sc.nextInt();
		double n2=sc.nextDouble();
		double n3=n1*n2;
		System.out.println(n3);

		sc.close();
	}

}
