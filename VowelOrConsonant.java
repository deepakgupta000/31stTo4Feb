package com.date2and3Feb;

import java.util.Scanner;

public class VowelOrConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the character");
		char input=sc.next().charAt(0);
		String cha="";
		
		
		 cha=(input=='a'||input=='A'||input=='e'||input=='E'||input=='i'||input=='I'||input=='o'||input=='O'||input=='u'||input=='U')?"Vowel":"Consonant";

			System.out.println(cha);

	}

}
