package com.date1Feb;

import java.util.Scanner;

public class DoWhleFactoral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int fact=1;
		int m;
		do {
			System.out.println("Enter a Number :");
			int n=sc.nextInt();

			for(int i=1;i<=n;i++) {

				fact=fact*i;
			}

			System.out.println("The factorial is "+fact);

		System.out.println("If you want run again press 1 otherwise 0");
			m=sc.nextInt();
		}while(m==1); 


	}

}
