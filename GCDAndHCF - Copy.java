package com.jsp.BasicNumberPrograms;

import java.util.Scanner;

public class GCDAndHCF //Highest common factor or Greatest common division 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number ");
		int a=sc.nextInt();
		System.out.println("enter the second number ");
		int b=sc.nextInt();
		System.out.println("enter the third number ");
		int c=sc.nextInt();
		int gcd=0;
		for(int i=1;i<=c;i++)
		{
			if(a%i==0&&b%i==0&&c%i==0)
			{
				gcd=i;
			}
		}
		System.out.println("the greatest common division number="+ gcd);
	}
}
