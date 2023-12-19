package com.jsp.BasicNumberPrograms;

public class Prime {
	public static void main(String[] args) {
		
		int n=3;
		if(m1(n))
		{
			System.out.println("its prime");
		}
		else {
			System.out.println("not prime");
		}
		
	}
	public static boolean m1(int n)
	{
		int temp=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				temp++;
			}
		}
		if(temp!=2)
		{
			return false;
		}
		return true;
	}

}
