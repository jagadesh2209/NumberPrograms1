package com.jsp.BasicNumberPrograms;

import java.util.Scanner;

public class DuckNumber {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the DuckNumber");
		int n=sc.nextInt();
		
//		if(duck(n))
//		{
//			System.out.println("this is duck no.");
//		}
//		else {
//			System.out.println("this is not duckno.");
//		}
		for(int i=1;i<=n;i++)
		{
			if(duck(i))
			{
				System.out.println(i);//this for range program
			}
		}
	}
public static boolean duck(int n){	
	
	int count =0;
	
	while(n>0)
	{
		int rem=n%10;
		if(rem==0)
		{
			count++;
		}
		n/=10;
	}
	if(count>0)
	{
		return true;
	}
	else {
		return false;
	   }
	}
}
