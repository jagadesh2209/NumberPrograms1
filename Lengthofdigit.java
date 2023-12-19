package com.jsp.BasicNumberPrograms;

import java.util.Scanner;

public class Lengthofdigit 
{
	public static void main(String[]args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the number");
		long num=scn.nextLong();
	
		long count=0;
		while(num>0)
		{
			count++;
			num/=10;
		}
		System.out.println("the lenght of the number " +count);
	}
}
