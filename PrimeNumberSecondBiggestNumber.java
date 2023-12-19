package com.jsp.BasicNumberPrograms;

import java.util.Scanner;

public class PrimeNumberSecondBiggestNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		int b1=0;
		int b2=0;
		for(int i=1;i<=num;i++)
		{
			if(prime(i))
			{
				if(b1==i) continue;
				else if(b1<i)
				{
					b2=b1;
					b1=i;
				}
				else if(b2<i||b2==b1) {
					b2=i;
				}
			}
		}
		System.out.println("first biggest prime number = "+b1);
		System.out.println("second biggest prime number = "+b2);
	}
	public static boolean prime(int n)
	{
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count!=2) return false;
		return true;
	}
}
