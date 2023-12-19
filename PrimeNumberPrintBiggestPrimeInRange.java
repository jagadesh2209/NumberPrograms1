package com.jsp.BasicNumberPrograms;

public class PrimeNumberPrintBiggestPrimeInRange {

	public static void main(String[] args) {

		int n=400;
		int high=0;
		int secondHigh=0;
		for(int i=2;i<=n;i++)
		{
			if(m1(i))
			{
				if(i>high)
				{
					secondHigh=high;
					high=i;
				}
			}
		}
		System.out.println(secondHigh);
		System.out.println(high);
		
	}
	public static boolean m1(int n)
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
