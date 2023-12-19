package com.jsp.BasicNumberPrograms;

public class PalindromeNumberBiggestPrimeNumberInRange {

	public static void main(String[] args) {

		int n=121
				;
		int high=0;
		int secondBiggest=0;
		for(int i=0;i<=n;i++)
		{
			if(m1(i)&&high<i)
			{
				secondBiggest=high;
				high=i;
			}
		}
		System.out.println(secondBiggest+" second bigest palindrome number");
		System.out.println(high+" biggest palindrome number ");
	}
	
	public static boolean m1(int n)
	{
		int t=n;
		int sum=0;
		while(n>0)
		{
			int rem=n%10;
			sum=(sum*10)+rem;
			n/=10;
		}
		if(t!=sum) return false;
		return true;
	}
}
