package com.jsp.BasicNumberPrograms;

import java.util.Scanner;

public class PerfectNumberRange {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
				
		for(int i=1;i<=n;i++)
		{
			if(m1(i))
			{
				System.out.println(i);//This is for range
			}
		}
//		System.out.println(1/1);
		System.out.println("********************************");
		boolean b=false;
		for(int i=1;i<=n;i++)
		{
			if(m1(i))
			{
				b=!b;
				if(b)
				{
					System.out.println(i);//this is for Alternate Number Printing
				}
			}
		}
	}
	public static boolean m1(int n)
	{
		int s=n;
		int t=0;
		for(int i=1;i<n;i++)
		{
			if (n%i==0)
			{
				t+=i;
			}
		}
		if(t!=s) return false;
		return true;
		
	}

}
