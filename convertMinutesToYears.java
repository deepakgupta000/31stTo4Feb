package com.date31Jan;

import java.util.Scanner;

public class convertMinutesToYears {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the mintues number");
		double year=60*24*365;
		double min=sc.nextDouble();
		long years =(long)(min/year);
		int day=(int)(min/60/24)%365;
		System.out.println((int)min+ "minutes is approximetely" +years + "years and "+ day +"days");

	}

}
