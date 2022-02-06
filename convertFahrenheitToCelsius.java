package com.date31Jan;

import java.util.Scanner;

public class convertFahrenheitToCelsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the fahrenheit");

		float fah=sc.nextInt();
		float  cel=((fah-32)*5)/9;
		System.out.println(cel);
	}

}
