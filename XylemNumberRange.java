package com.jsp.BasicNumberPrograms;

import java.util.Scanner;

public class XylemNumberRange {

	public static void main(String[] args) {

		Scanner sc=new Scanner( System.in);
		System.out.println("enter the Range Number of Xymle");
		int range=sc.nextInt();
		for(int i=1;i<=range;i++)
		{
			if(m1(i))
			{
				System.out.println(i);//this is for print the all the numbers in this range which are Xylem numbers
			}
		}
		System.out.println("************************");
		
		boolean b=false;
		for(int i=1;i<=range;i++)
		{
			if(m1(i))
			{
				b=!b;
				if(b)
				{
					System.out.println(i);//this is for print the alternate number
				}
			}
		}
	}
	
	public static boolean m1(int n)
	{
		int a=0;
		int b=0;
		a+=n%10;
		n/=10;
		while(n>9)
		{
			b+=n%10;
			n/=10;
		}
		a+=n;
		if(a==b)
		{
			return true;
		}
		return false;
	}

	
}
