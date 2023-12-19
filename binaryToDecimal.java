  package com.jsp.BasicNumberPrograms;

import java.util.Scanner;

public class binaryToDecimal 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the binary numbers");
		int num=scn.nextInt();
		int rem,i=1,bin=0;
		while(num>0)
		{
			rem=num%10;
			bin=(rem*i)+bin;
			num/=10;
			i*=2;
		}
		System.out.println(bin);
	}
}
