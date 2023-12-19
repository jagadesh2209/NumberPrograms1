package com.jsp.BasicNumberPrograms;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) 
	{
		
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the number");
		int n=scn.nextInt();
		
		System.out.println(sum1(n));
	}
	public static int sum1(int num)
	{
		int sum=0;
		while(num>0)
		{
			int rem=num%10;
			sum+=rem;
			num/=10;
		}
		int temp= sum;
		if(temp>9)
		{
			sum=sum1(temp);
		}
		return sum;
	}

}
