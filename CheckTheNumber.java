package com.date2and3Feb;

import java.util.Scanner;

public class CheckTheNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no plz: ");
		int num = sc.nextInt();
		String str1 = "Yes";
		String str = "";
		str= (num==10||num==20||num==30||num==40||num==50)?"Yes":"No";
		if(str.equals(str1)) {
		 System.out.println(num + " is present");
		}
		else
		{
			 System.out.println(num+ "  is not present");
		}

	}

}
