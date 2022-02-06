package com.date2and3Feb;

import java.util.Scanner;

public class PrintMounth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the number 1 to 12");
		int month=sc.nextInt();
		switch(month) {
		case 1:
			System.out.println("This is : January");
			break;
		case 2:
			System.out.println("This is : February");
			break;
		case 3:
			System.out.println("This is : March");
			break;
		case 4:
			System.out.println("This is : April");
			break;
		case 5:
			System.out.println("This is : May");
			break;
		case 6:
			System.out.println("This is : June");
			break;
		case 7:
			System.out.println("This is : July");
			break;
		case 8:
			System.out.println("This is : August");
			break;
		case 9:
			System.out.println("This is : Setember");
			break;
		case 10:
			System.out.println("This is : Octuber");
			break;
		case 11:
			System.out.println("This is : Nvember");
			break;
		case 12:
			System.out.println("This is : December");
			break;
		default :
			System.out.println("Invalid Number");
            break;
		}

	}

}
