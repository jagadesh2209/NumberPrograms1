package com.jsp.BasicNumberPrograms;

public class SumOfStringWithCheckThatArmStrong {

	public static void main(String[] args) {
		String s = "1";
		int n = Integer.parseInt(s);
		int p = n;
		int sum = 0;
		while (n > 0) {
			int rem = n % 10;
			sum += rem;
			n /= 10;
		}
		if (p == isArmStrang(sum)) {
			System.out.println("its arm strong");
		} else {
			System.out.println("its not arm strong");
		}

	}

	public static int isArmStrang(int n) {
		int temp = 0;
		while (n > 0) {
			int rem = n % 10;
			int len = m1(n);
			temp += powMethod(rem, len);
			n /= 10;
		}
		return temp;
	}

	public static int powMethod(int n, int pow) {
		int p = 1;
		for (int i = 1; i <= pow; i++) {
			p *= n;
		}
		return p;

	}

	public static int m1(int n) {
		int temp = 0;
		while (n > 0) {
			temp++;
			n /= 10;
		}
		return temp;
	}

}
