package com.jsp.BasicNumberPrograms;

public class PerfectNumberPrinetHighNumInTheGivenRange {

	public static void main(String[] args) {

		int n=400;
		int high=0;
		int secondHigh=0;
		for(int i=0;i<=n;i++)
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
		System.out.println(high+" Highest number");
		System.out.println(secondHigh+" second Highest Number");
	}

	public static boolean m1(int n)
	{
		int t=n;
		int sum=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum+=i;
			}
		}
		if(sum==t) return true;
		return false;
	}
}
