package com.jsp.BasicNumberPrograms;

public class PalindromeNumberInGivenRange {

	public static void main(String[] args) {

		int n=100;
		for(int i=1;i<=n;i++)
		{
			if(m1(i))
			{
				System.out.println(i);//this is for Normal Range
			}
		}
		System.out.println("***********************");
		boolean b=false;
		for(int i=1;i<=n;i++)
		{
			if(m1(i))
			{
				b=!b;
				if(b)
				{
					System.out.println(i);//this is for Alternate Number Printing
				}
			}
		}
	}

	public static boolean m1(int n)
	{
		int temp=n;
		int pnum=0;
		while(n>0)
		{
			int rem=n%10;
			pnum=(pnum*10)+rem;
			n/=10;
		}
		if(temp==pnum) return true;
		return false;
	}
}
