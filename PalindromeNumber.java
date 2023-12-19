package com.jsp.BasicNumberPrograms;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Palindrome number");
		int num=sc.nextInt();
		int rev=0;
		int temp=num;
		while(num>0)
		{
			int rem=num%10;
			rev=rem+(rev*10);
			num/=10;
		}
		if(temp==rev)
		{
			System.out.println("its palindrome number" );
		}
		else {
			System.out.println("its Not palindrome number" );
		}
	}
}


