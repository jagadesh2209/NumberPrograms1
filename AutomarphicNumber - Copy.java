package com.jsp.BasicNumberPrograms;

import java.util.Scanner;

public class AutomarphicNumber {
	public static int power(int base,int exp)
	{
		int res=1;
		for(int i=1;i<=exp;i++ )
		{
			res*=base;
		}
		return res;
	}
	
	public static int lenth(int num)
	{
		int count=0;
		while(num>0)
		{
			count++;
			num/=10;
		}
		return count;
	}
	public static void main(String[] args) 
	{
		Scanner scn =new Scanner(System.in);
		System.out.println("enter the number");
		int num=scn.nextInt();
		int temp=num;
		if(num<0)
		{
			System.out.println("no negatives");
		}
		else {
			int squr=power(num, 2);//we have to squr the number and that ans of last two num == given number.thats automarphic 
			int len=lenth(num);
			int result=squr%(int) Math.pow(10, len);
			if(temp==result)
			{
				System.out.println(num+" it is automarphic");
			}
			else {
				System.out.println( num+" its not automarphic");
			}
		}
	}
}
