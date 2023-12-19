package com.jsp.BasicNumberPrograms;
 
import java.util.Scanner;

public class decimalTobinary 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the decimal number");
		int num=scn.nextInt();
		int rem,i=1,bin=0;
		while(num>0)
		{
			rem=num%2;
			bin=(rem*i)+bin;
			num/=2;
			i*=10;
		}
		System.out.println(bin);
	}
}
