package com.date31Jan;

import java.util.Scanner;

public class convertIncheToMeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number in inche");

		int inche=sc.nextInt();
		double meter=inche*0.0254;
		System.out.println(meter);
		sc.close();

	}

}
