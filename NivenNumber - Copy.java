package com.jsp.BasicNumberPrograms;

import java.util.Scanner;

public class NivenNumber {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Number");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			if(m1(i))
			{
				System.out.println(i);
			}
		}
	}
	public static boolean m1(int num)
	{
		int temp=num;
		int sum=0;
		if(num<0)
		{
			System.out.println("no negatives");
		}
		else  
		{
			while(num>0) 
			{
				int rem=num%10;
				sum+=rem;
				num/=10;
			}
		}
		if (temp%sum==0) return true;
		return false;
	}
}
