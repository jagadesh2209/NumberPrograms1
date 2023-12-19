package com.jsp.BasicNumberPrograms;

public class Factorial1 {
	public static void main(String[] args) {
		
		int n=6;
		System.out.println(m1(n));
	}
	public static int m1(int n)
	{
		int temp=1;
		for(int i=1;i<=n;i++)
		{
			temp*=i;
		}
		return temp;
	}

}
