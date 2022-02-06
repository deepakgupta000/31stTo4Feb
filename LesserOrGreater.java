package com.date2and3Feb;

import java.util.Scanner;

public class LesserOrGreater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the number");
		int num=sc.nextInt();
		String str="";
		str=(num>10&&num>5)?"The number is greater then 10 \n The number is greater then 5":(num<10&&num<5)?"The number is lesser then 10 \n The number is greater then 10":"The number is lesser then 10 \n The number is greater then 5";

		System.out.println(str);
	}

}
