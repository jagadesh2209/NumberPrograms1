package com.jsp.BasicNumberPrograms;

import java.util.Scanner;

public class XymelProgramInThatPrintHighhestNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Range Number Of Xymel");
		int n=sc.nextInt();
		int high=0;
		int secondHighest=0;
		for(int i=1;i<=n;i++)
		{
			if(m1(i))
			{
				if(i>high)
				{
					secondHighest=high;
					high=i;
				}
			}
		}
		System.out.println(secondHighest);
		System.out.println(high);
		
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
		if(a!=b) return false;
		return true;
	}
}
