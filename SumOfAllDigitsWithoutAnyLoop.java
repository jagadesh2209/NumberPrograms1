package com.jsp.BasicNumberPrograms;

public class SumOfAllDigitsWithoutAnyLoop {

	public static void main(String[] args) {
		int n=17;
		System.out.println(m1(n));
	}
	
	public static int m1(int n)
	{
		int t=0;
		if(n==0)
		{
			return 0;
		}
		return t=n%10+m1(n/10);
	}

}
