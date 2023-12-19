 package com.jsp.BasicNumberPrograms;

import java.util.Scanner;

public class NextPalindromeNumber {
	
	public static int isPalindrome(int num)
	{
		int n,rem,rev=0;
		n=num;
		while(num!=0)
		{
			rem=num%10;
			rev=(rev*10)+rem;
			num/=10;
		}
		if(n==rev)
		{
			return 1;
		}else {
			return 0;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		while(isPalindrome(num)==0) 
		{
			num=num+1;
		}
		System.out.println("Next Palindrome Number" +num);
	}
}
